package it.trilogis.josm.pesce.serverconnection;

import static org.openstreetmap.josm.tools.I18n.tr;
import it.trilogis.josm.pesce.PesceExporter;
import it.trilogis.josm.pesce.PescePlugin;
import it.trilogis.josm.pesce.PescePlugin.UploadInfo;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.gui.PleaseWaitRunnable;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.gui.progress.NullProgressMonitor;
import org.openstreetmap.josm.gui.progress.ProgressMonitor;
import org.openstreetmap.josm.io.ChangesetClosedException;
import org.openstreetmap.josm.io.OsmApiException;
import org.openstreetmap.josm.io.OsmApiPrimitiveGoneException;
import org.openstreetmap.josm.io.OsmTransferCanceledException;
import org.openstreetmap.josm.io.OsmTransferException;
import org.openstreetmap.josm.tools.Utils;
import org.xml.sax.SAXException;


public class IlocateUploadTask extends PleaseWaitRunnable {

    private HttpURLConnection activeConnection;
    private boolean cancel = false;
    private String response;

    public IlocateUploadTask(String title, ProgressMonitor progressMonitor, boolean ignoreException) {
        super(title, progressMonitor, ignoreException);
        
        
    }
    
    @Override
    protected void cancel() {
        cancel = true;
    }

    @Override
    protected void realRun() throws SAXException, IOException, OsmTransferException {
        
        for(UploadInfo info : PescePlugin.getUploadInfo()) {
            if(cancel) return;
            progressMonitor.beginTask(tr("Converting {0} data...",info.layerName));
            
            StringWriter sw = new StringWriter();
            String contentType = null;
            
            switch(info.type) {
            case GEOJSON:
                Main.debug("[IlocateUploadTask.realRun] Geojson not implemented");
                contentType = "application/json";
                break;
            case IGML:
                Main.debug("[IlocateUploadTask.realRun] IGML");
                PesceExporter.doSave(sw, info.dataSet);
                // I need the OsmLayer of dataset here
                // layer.onPostUploadToServer();
                OsmDataLayer layer = PescePlugin.getLayer(info.dataSet);
                if(null != layer) {
                    layer.onPostUploadToServer();
                } else {
                    Main.error("[IlocateUploadTask.realRun] Layer not found");
                }
                
                contentType = "text/xml";
                break;
            }
            

            progressMonitor.beginTask(tr("Uploading {0} data...",info.layerName));
            
            // String diffUploadResponse = sendRequest("POST", "changeset/" + changeset.getId() + "/upload", diffUploadRequest,monitor);
            response = postRequest(new URL(info.url), sw.toString(), contentType, progressMonitor, false, true);
            Main.debug(response);
        }

        
    }

    @Override
    protected void finish() {
        if(cancel) return;
    }
    
    private final String postRequest(URL url,String requestBody, String contentType, ProgressMonitor monitor,
            boolean doAuthenticate, boolean fastFail) throws OsmTransferException {
        return sendRequest("POST", url, requestBody, contentType, monitor,
                doAuthenticate, fastFail);
    }
    /**
     * Generic method for sending requests to the OSM API.
     *
     * This method will automatically re-try any requests that are answered with a 5xx
     * error code, or that resulted in a timeout exception from the TCP layer.
     *
     * @param requestMethod The http method used when talking with the server.
     * @param urlSuffix The suffix to add at the server url, not including the version number,
     *    but including any object ids (e.g. "/way/1234/history").
     * @param requestBody the body of the HTTP request, if any.
     * @param monitor the progress monitor
     * @param doAuthenticate  set to true, if the request sent to the server shall include authentication
     * credentials;
     * @param fastFail true to request a short timeout
     *
     * @return the body of the HTTP response, if and only if the response code was "200 OK".
     * @throws OsmTransferException if the HTTP return code was not 200 (and retries have
     *    been exhausted), or rewrapping a Java exception.
     */
    private final String sendRequest(String requestMethod, URL url, String requestBody, String contentType, ProgressMonitor monitor,
            boolean doAuthenticate, boolean fastFail) throws OsmTransferException {
        StringBuilder responseBody = new StringBuilder();
        int retries = fastFail ? 0 : getMaxRetries();

        while(true) { // the retry loop
            try {
                Main.info(requestMethod + " " + url + "... ");
                Main.debug(requestBody);
                // fix #5369, see http://www.tikalk.com/java/forums/httpurlconnection-disable-keep-alive
                activeConnection = Utils.openHttpConnection(url, false);
                activeConnection.setConnectTimeout(fastFail ? 1000 : Main.pref.getInteger("socket.timeout.connect",15)*1000);
                if (fastFail) {
                    activeConnection.setReadTimeout(1000);
                }
                activeConnection.setRequestMethod(requestMethod);
                if (doAuthenticate) {
                    //addAuth(activeConnection); // TODO Implement
                }

                if ("PUT".equals(requestMethod) || "POST".equals(requestMethod) || "DELETE".equals(requestMethod)) {
                    activeConnection.setDoOutput(true);
                    activeConnection.setRequestProperty("Content-type", null==contentType ? "text/txt" : contentType);
                    try (OutputStream out = activeConnection.getOutputStream()) {
                        // It seems that certain bits of the Ruby API are very unhappy upon
                        // receipt of a PUT/POST message without a Content-length header,
                        // even if the request has no payload.
                        // Since Java will not generate a Content-length header unless
                        // we use the output stream, we create an output stream for PUT/POST
                        // even if there is no payload.
                        if (requestBody != null) {
                            try (BufferedWriter bwr = new BufferedWriter(new OutputStreamWriter(out, StandardCharsets.UTF_8))) {
                                bwr.write(requestBody);
                                bwr.flush();
                            }
                        }
                    }
                }

                activeConnection.connect();
                Main.info(activeConnection.getResponseMessage());
                int retCode = activeConnection.getResponseCode();

                if (retCode >= 500) {
                    if (retries-- > 0) {
                        sleepAndListen(retries, monitor);
                        Main.info(tr("Starting retry {0} of {1}.", getMaxRetries() - retries,getMaxRetries()));
                        continue;
                    }
                }

                // populate return fields.
                responseBody.setLength(0);

                // If the API returned an error code like 403 forbidden, getInputStream
                // will fail with an IOException.
                InputStream i = getConnectionStream();
                if (i != null) {
                    // the input stream can be null if both the input and the error stream
                    // are null. Seems to be the case if the OSM server replies a 401
                    // Unauthorized, see #3887.
                    //
                    String s;
                    try (BufferedReader in = new BufferedReader(new InputStreamReader(i, StandardCharsets.UTF_8))) {
                        while((s = in.readLine()) != null) {
                            responseBody.append(s);
                            responseBody.append("\n");
                        }
                    }
                }
                String errorHeader = null;
                // Look for a detailed error message from the server
                if (activeConnection.getHeaderField("Error") != null) {
                    errorHeader = activeConnection.getHeaderField("Error");
                    Main.error("Error header: " + errorHeader);
                } else if (retCode != HttpURLConnection.HTTP_OK && responseBody.length()>0) {
                    Main.error("Error body: " + responseBody);
                }
                activeConnection.disconnect();

                if (Main.isDebugEnabled()) {
                    Main.debug("RESPONSE: "+ activeConnection.getHeaderFields());
                }

                errorHeader = errorHeader == null? null : errorHeader.trim();
                String errorBody = responseBody.length() == 0? null : responseBody.toString().trim();
                switch(retCode) {
                case HttpURLConnection.HTTP_OK:
                    return responseBody.toString();
                case HttpURLConnection.HTTP_GONE:
                    throw new OsmApiPrimitiveGoneException(errorHeader, errorBody);
                case HttpURLConnection.HTTP_CONFLICT:
                    if (ChangesetClosedException.errorHeaderMatchesPattern(errorHeader))
                        throw new ChangesetClosedException(errorBody, ChangesetClosedException.Source.UPLOAD_DATA);
                    else
                        throw new OsmApiException(retCode, errorHeader, errorBody);
                case HttpURLConnection.HTTP_FORBIDDEN:
                    OsmApiException e = new OsmApiException(retCode, errorHeader, errorBody);
                    e.setAccessedUrl(activeConnection.getURL().toString());
                    throw e;
                default:
                    throw new OsmApiException(retCode, errorHeader, errorBody);
                }
            } catch (SocketTimeoutException | ConnectException e) {
                if (retries-- > 0) {
                    continue;
                }
                throw new OsmTransferException(e);
            } catch(IOException e) {
                throw new OsmTransferException(e);
            } catch(OsmTransferException e) {
                throw e;
            }
        }
    }
    private int getMaxRetries() {
        return 5;
    }
    private InputStream getConnectionStream() {
        try {
            return activeConnection.getInputStream();
        } catch (IOException ioe) {
            Main.warn(ioe);
            return activeConnection.getErrorStream();
        }
    }
    private void sleepAndListen(int retry, ProgressMonitor monitor) throws OsmTransferCanceledException {
        Main.info(tr("Waiting 10 seconds ... "));
        for (int i=0; i < 10; i++) {
            if (monitor != null) {
                monitor.setCustomText(tr("Starting retry {0} of {1} in {2} seconds ...", getMaxRetries() - retry,getMaxRetries(), 10-i));
            }
            if (cancel)
                throw new OsmTransferCanceledException();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Main.warn("InterruptedException in "+getClass().getSimpleName()+" during sleep");
            }
        }
        Main.info(tr("OK - trying again."));
    }

}
