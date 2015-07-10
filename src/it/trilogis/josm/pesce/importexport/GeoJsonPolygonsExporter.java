package it.trilogis.josm.pesce.importexport;

import static org.openstreetmap.josm.tools.I18n.tr;
import it.trilogis.josm.pesce.Constants;
import it.trilogis.josm.pesce.IdsFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.List;

import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.actions.ExtensionFileFilter;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.gui.layer.Layer;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.io.FileExporter;
import org.openstreetmap.josm.tools.Utils;

public class GeoJsonPolygonsExporter extends FileExporter {

    private final static String EXT = "geojson";
    public final static ExtensionFileFilter GEOJSON_FILE_FILTER = new ExtensionFileFilter(
            EXT,
            EXT, tr("Geojson polygons file") + " (*."+EXT+")");
    
    public GeoJsonPolygonsExporter() {
        super(GEOJSON_FILE_FILTER);
    }

    @Override
    public boolean acceptFile(File pathname, Layer layer) {
        if (!(layer instanceof OsmDataLayer))
            return false;
        return super.acceptFile(pathname, layer);
    }

    @Override
    public void exportData(File file, Layer layer) throws IOException {
        
        checkOsmDataLayer(layer);

        save(file, (OsmDataLayer) layer, true);
    }
    
    protected static void checkOsmDataLayer(Layer layer) throws IllegalArgumentException {
        if (!(layer instanceof OsmDataLayer)) {
            throw new IllegalArgumentException(MessageFormat.format("Expected instance of OsmDataLayer. Got ''{0}''.", layer
                    .getClass().getName()));
        }
    }
    
    
    private void save(File file, OsmDataLayer layer, boolean noBackup) {
        File tmpFile = null;
        try {
            // use a tmp file because if something errors out in the
            // process of writing the file, we might just end up with
            // a truncated file.  That can destroy lots of work.
            if (file.exists()) {
                tmpFile = new File(file.getPath() + "~");
                Utils.copyFile(file, tmpFile);
            }

            doSave(file, layer.data);
            
            if (noBackup || !Main.pref.getBoolean("save.keepbackup", false)) {
                if (tmpFile != null) {
                    tmpFile.delete();
                }
            }
            layer.onPostSaveToFile();
        } catch (IOException e) {
            Main.error(e);
            JOptionPane.showMessageDialog(
                    Main.parent,
                    tr("<html>An error occurred while saving.<br>Error is:<br>{0}</html>", e.getMessage()),
                    tr("Error"),
                    JOptionPane.ERROR_MESSAGE
            );

            try {
                // if the file save failed, then the tempfile will not
                // be deleted.  So, restore the backup if we made one.
                if (tmpFile != null && tmpFile.exists()) {
                    Utils.copyFile(tmpFile, file);
                }
            } catch (IOException e2) {
                Main.error(e2);
                JOptionPane.showMessageDialog(
                        Main.parent,
                        tr("<html>An error occurred while restoring backup file.<br>Error is:<br>{0}</html>", e2.getMessage()),
                        tr("Error"),
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
    
    public static void doSave(File file, DataSet ds) throws IOException, FileNotFoundException  {
        
        String json = getPolygons(ds);
        Main.debug(json);
        toFile(file, json);
    }

    private static String getPolygons(DataSet ds) {
        // WARNING: this function flats all layers into one
        
        IdsFactory ids = new IdsFactory();
        
        JSONObject featureCollection = new JSONObject();
        try {
            featureCollection.put("type", "FeatureCollection");
            JSONArray featureList = new JSONArray();
            // iterate through your list
            Main.debug(">ways size> "+ds.getWays().size());
            for (Way way : ds.getWays()) {
                
                List<Node> nodes = way.getNodes();
                
                // A way is a polygon if the first node and the last are the same
                if(nodes.size()<3 || nodes.get(0) != nodes.get(nodes.size()-1)) {
                    Main.debug("[getPolygons] Skip way, this is not a polygon");
                    continue;
                }
                
                JSONObject georoom = new JSONObject();
                georoom.put("type", "Polygon");//fisso
                // construct a JSONArray from a string; can also use an array or list
                JSONArray coord = new JSONArray();
                JSONArray tmp, tmp2 = new JSONArray();
                
                Main.debug(">way's referrers> "+way.getNodesCount());
                
                for (Node n : nodes) {
                    Main.debug(">a node> ");
                    tmp = new JSONArray();
                    
                    tmp.put(n.getCoor().getX());
                    tmp.put(n.getCoor().getY());
                    tmp2.put(tmp);
                }
                coord.put(tmp2);

                georoom.put("coordinates", coord);
                JSONObject feature = new JSONObject();
                feature.put("geometry", georoom);
                JSONObject proroom = new JSONObject();
                proroom.put("name", way.getName());//facoltativo/
                proroom.put("id", way.getId()==0 ? -ids.newIntId("POLYGONID",1) : way.getId());//id room
                proroom.put("geomType", "room");//tipo fisso
                if(null != way.get(Constants.OSM_KEY_LEVEL)) {
                    proroom.put("level", way.get(Constants.OSM_KEY_LEVEL));//livello-piano    
                }
                
                feature.put("properties", proroom);
                feature.put("type", "Feature");

                featureList.put(feature);
                featureCollection.put("features", featureList);
            }
        } catch (JSONException e) {
            Main.debug("Export error");
        }
        
        
        return featureCollection.toString();
    }

    private static void toFile(File file, String josm) {

        if(null == josm) {
            Main.error("[toFile] The input string is null");
            return;
        }
        
        try {
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream out;
            file.createNewFile();

            // convert String into InputStream
            InputStream in = new ByteArrayInputStream(josm.getBytes("UTF-8"));
            out = new FileOutputStream(file);

            //write
            byte[] buffer = new byte[1024];
            int read;
            while ((read = in.read(buffer)) > 0) {
                out.write(buffer, 0, read);
            }
            in.close();
            in = null;

            // write the output file
            out.flush();
            out.close();
            out = null;

        } catch (Exception e) {
            Main.debug("Copy error");
        }
    }
    
}
