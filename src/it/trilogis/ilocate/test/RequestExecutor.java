/**
 * 
 */
package it.trilogis.ilocate.test;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import eu.ilocate.gtmc.dto.GTMCResult;

/**
 * @author Nicola Dorigatti
 */
public class RequestExecutor {
    private static final MediaType MEDIA_TYPE_ZIP = MediaType.parse("application/zip");
    static OkHttpClient            client;

    /**
     * 
     */
    public RequestExecutor() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        client = new OkHttpClient();
        ObjectMapper mapper = new ObjectMapper();
        final ObjectReader r = mapper.reader(GTMCResult.class);

         //final String url = "http://5.249.143.175:8080/gtmctwo/validate";
        //final String url = "http://5.249.143.175:8080/gtmc/validate";
        final String url = "http://localhost:8080/gtmc/validate";
        String deadNodeFile = "C:\\Users\\nicola.dorigatti\\Desktop\\GTMC_TestFiles\\Alba First Floor Walls\\albainput_deadnode.zip";
        String randomGraphFile = "C:\\Users\\nicola.dorigatti\\Desktop\\GTMC_TestFiles\\Alba First Floor Walls\\albainput_randomgraph.zip";
        String finegraphFile = "C:\\Users\\nicola.dorigatti\\Desktop\\GTMC_TestFiles\\Alba First Floor Walls\\albainput_finegraph.zip";
        
        String newTestFile = System.getProperty("user.home")+"/Desktop/i-locate/testigml.zip";

        /*/System.out.println("------- DEAD NODE FILE -----");
        processEntry(r, url, deadNodeFile);
        System.out.println("----------------------------");

        System.out.println("------- RANDOM GRAPH FILE -----");
        processEntry(r, url, randomGraphFile);
        System.out.println("----------------------------");

        System.out.println("------- FINEGRAPH FILE -----");
        processEntry(r, url, finegraphFile);
        System.out.println("----------------------------");
        
**/
        System.out.println("------- Test FILE -----");
        processEntry(r, url, newTestFile);
        System.out.println("----------------------------");
    }

    public static void processEntry(ObjectReader r, String url, String filePath) {
        try {
            GTMCResult result1 = r.readValue(callGTMC(url, filePath));
            System.out.println(result1.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String callGTMC(String url, String filepath) {
        try {
            // ---
            File zipFile = new File(filepath);

            // Use the imgur image upload API as documented at https://api.imgur.com/endpoints/image
            RequestBody requestBody = new MultipartBuilder().type(MultipartBuilder.FORM).addFormDataPart("zipFile", zipFile.getName(), RequestBody.create(MEDIA_TYPE_ZIP, zipFile)).build();
            Request request = new Request.Builder().url(url).post(requestBody).build();
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful())
                throw new IOException("Unexpected code " + response);

            return response.body().string();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
}
