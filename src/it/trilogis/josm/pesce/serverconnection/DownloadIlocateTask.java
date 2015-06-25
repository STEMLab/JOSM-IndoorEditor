package it.trilogis.josm.pesce;

import static org.openstreetmap.josm.tools.I18n.tr;

import it.trilogis.josm.pesce.PescePlugin.UploadInfo;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.actions.downloadtasks.AbstractDownloadTask;
import org.openstreetmap.josm.actions.downloadtasks.DownloadOsmTask.AbstractInternalTask;
import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.DataSource;
import org.openstreetmap.josm.data.Bounds.ParseMethod;
import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.gpx.GpxData;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.gui.PleaseWaitRunnable;
import org.openstreetmap.josm.gui.layer.GpxLayer;
import org.openstreetmap.josm.gui.layer.Layer;
import org.openstreetmap.josm.gui.layer.markerlayer.MarkerLayer;
import org.openstreetmap.josm.gui.progress.ProgressMonitor;
import org.openstreetmap.josm.gui.progress.ProgressTaskId;
import org.openstreetmap.josm.gui.progress.ProgressTaskIds;
import org.openstreetmap.josm.io.BoundingBoxDownloader;
import org.openstreetmap.josm.io.GpxImporter;
import org.openstreetmap.josm.io.GpxImporter.GpxImporterData;
import org.openstreetmap.josm.io.OsmServerLocationReader;
import org.openstreetmap.josm.io.OsmServerReader;
import org.openstreetmap.josm.io.OsmTransferException;
import org.openstreetmap.josm.tools.CheckParameterUtil;
import org.xml.sax.SAXException;

/**
* Task allowing to download GPS data.
*/
public class DownloadIlocateTask extends AbstractDownloadTask {

 private DownloadTask downloadTask;

 private static final String PATTERN_ILOCATE_INDOORGML = "https?://.*/(.*\\.igml)";
 private static final String PATTERN_ILOCATE_GEOJSON = "https?://.*/(.*\\.geojson)";

 protected String newLayerName = null;
 protected DataSet downloadedData;
 
 private PesceImporter importer;

 public DownloadIlocateTask() {
     importer = new PesceImporter();
}
 
 @Override
 public String[] getPatterns() {
     return new String[] {PATTERN_ILOCATE_INDOORGML, PATTERN_ILOCATE_GEOJSON};
 }

 @Override
 public String getTitle() {
     return tr("Download IndoorGML");
 }

 @Override
 public Future<?> loadUrl(boolean newLayer, String url, ProgressMonitor progressMonitor) {
     CheckParameterUtil.ensureParameterNotNull(url, "url");
     if (url.matches(PATTERN_ILOCATE_INDOORGML)) {
         Main.debug("[DownloadIlocateTask.loadUrl] IndoorGML loading");
         downloadTask = new DownloadTask(newLayer,
                 url, progressMonitor);
         // Extract .gpx filename from URL to set the new layer name
         Matcher matcher = Pattern.compile(PATTERN_ILOCATE_INDOORGML).matcher(url);
         newLayerName = matcher.matches() ? matcher.group(1) : null;
         // We need submit instead of execute so we can wait for it to finish and get the error
         // message if necessary. If no one calls getErrorMessage() it just behaves like execute.
         return Main.worker.submit(downloadTask);

     } else if(url.matches(PATTERN_ILOCATE_GEOJSON)) {
         Main.debug("[DownloadIlocateTask.loadUrl] Geojson support not implemented yet!");
     }
     return null;
 }

 @Override
 public void cancel() {
     if (downloadTask != null) {
         downloadTask.cancel();
     }
 }

 class DownloadTask extends AbstractInternalTask {
     private String url;

     public DownloadTask(boolean newLayer, String url, ProgressMonitor progressMonitor) {
         super(newLayer, tr("Downloading IGML data"), progressMonitor, false);
         this.url = url;
     }

     @Override
     public void realRun() throws IOException, SAXException, OsmTransferException {
         try {
             if (isCanceled())
                 return;
             ProgressMonitor subMonitor = progressMonitor.createSubTaskMonitor(ProgressMonitor.ALL_TICKS, false);
             InputStream in = new URL(url).openStream();
             dataSet = importer.parseDataSet(in, subMonitor);
         } catch(Exception e) {
             if (isCanceled())
                 return;
             if (e instanceof OsmTransferException) {
                 rememberException(e);
             } else {
                 rememberException(new OsmTransferException(e));
             }
         }
     }

     @Override
     protected void finish() {
         if (isFailed() || isCanceled())
             return;
         if (dataSet == null)
             return; // user canceled download or error occurred
         if (dataSet.allPrimitives().isEmpty()) {
             rememberErrorMessage(tr("No data found in this area."));
             // need to synthesize a download bounds lest the visual indication of downloaded
             // area doesn't work
             dataSet.dataSources.add(new DataSource(new Bounds(new LatLon(0, 0)), "i-locate server"));
         }
         saveUploadInfo();
         downloadedData = dataSet;
         loadData(newLayerName, null);
     }
     
     private void saveUploadInfo() {
         UploadInfo info = new UploadInfo(newLayerName, dataSet);
         
         
         PescePlugin.getUploadInfo().add(info);
     }


     @Override protected void cancel() {
         setCanceled(true);
     }

     private ProgressTaskId downloadIgmlTaskId = null;
     @Override
     public ProgressTaskId canRunInBackground() {
         if(null == downloadIgmlTaskId) {
             downloadIgmlTaskId =  new ProgressTaskId("core", "downloadIGML");
         }
         return downloadIgmlTaskId;
     }
 }

 @Override
 public String getConfirmationMessage(URL url) {
     // TODO
     return null;
 }

 @Override
 public boolean isSafeForRemotecontrolRequests() {
     return true;
 }

 /**
  * Determines if the given URL denotes an OSM gpx-related API call.
  * @param url The url to check
  * @since 5745
  */
 public static final boolean isFromServer(String url) {
     return false;
 }

    public Future<?> downloadIndoorGML(boolean newLayer, String url, ProgressMonitor progressMonitor) {
        
        //importer
//        IndoorFeaturesType root;
//        try {
//            root = Marshalling.unmarshal(new URL(url).openStream());
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            return null;
//        }
//
//        downloadedData = IGMLConverter.convert(root);
        
        
        return Main.worker.submit(downloadTask);
        //return null;
    }

    @Override
    public Future<?> download(boolean newLayer, Bounds downloadArea, ProgressMonitor progressMonitor) {
        // TODO Not implemented yet
        return null;
    }
}
