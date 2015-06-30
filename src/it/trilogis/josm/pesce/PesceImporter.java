package it.trilogis.josm.pesce;

import static org.openstreetmap.josm.tools.I18n.tr;
import it.trilogis.josm.pesce.SetContextHandler.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.actions.ExtensionFileFilter;
import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.RelationMember;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.visitor.BoundingXYVisitor;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.gui.progress.ProgressMonitor;
import org.openstreetmap.josm.io.Compression;
import org.openstreetmap.josm.io.IllegalDataException;
import org.openstreetmap.josm.io.OsmImporter;

public class PesceImporter extends OsmImporter {


    public static String EXT = "igml";
    private static String EXT2 = "pesce";
    public final static ExtensionFileFilter INDOOR_FILE_FILTER = new ExtensionFileFilter(
            String.format("%s,%s.gz,%s.bz2,%s", EXT, EXT, EXT, EXT2),
            EXT, tr("IndoorGML files") + " (*."+EXT+"[.gz|.bz2])");
    private boolean isFirstType = true;
    
    static IndoorFeaturesType tempRoot; 
    
    public PesceImporter() {
        super(INDOOR_FILE_FILTER);
    }
    
    @Override
    public boolean acceptFile(File pathname) {
        isFirstType = pathname.getName().endsWith(EXT);
        return super.acceptFile(pathname); // TODO: check!
    }

    @Override
    public DataSet parseDataSet(InputStream in, ProgressMonitor monitor)
            throws IllegalDataException {

        IndoorFeaturesType root;
        if(isFirstType) {
            root = Marshalling.unmarshal(in);
            tempRoot = root;

            // TEST
            /*try {
                Marshalling.marshal(root, new FileOutputStream(new File("outputdiprova.igml")));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }*/
            return IGMLConverter.convert(root);
        } else {
            return parsePesce(in, monitor);
        }
        
        
    }
    
    
    
    protected DataSet parsePesce(InputStream in, ProgressMonitor instance)
            throws IllegalDataException {
        
        // Test: print context
        Main.debug("i-locate upload context");
        Map<String,String> context = Context.getInstance().store; 
        for(String k : context.keySet()) {
            Main.debug(String.format("%s -> %s",k,context.get(k)));
        }
        
        DataSet data = new DataSet();
        
        data.setUploadDiscouraged(true);
        
        data.beginUpdate();
        for(String line : convertStreamToString(in).split("\n")) {
            String[] s = line.split(",");
            if(s.length<2) {
                continue;
            }
            double lat = Double.parseDouble(s[0]);
            double lon = Double.parseDouble(s[1]);
            double scale = s.length>2 ? Double.parseDouble(s[2]) : 5.;

            Map<String, String> keys;
            Relation polygon = new Relation();
            keys = new HashMap<>();
            keys.put("type", "multipolygon");
            polygon.setKeys(keys);
            for(int j=0 ; j<2; j++){
                Node first = null;
                Way fishWay = new Way();
                for(int i=0 ; i<Constants.DELTA[j].length ; i++) {
                    Node n = new Node(new LatLon(lat + scale * Constants.DELTA[j][i][0],lon + scale * Constants.DELTA[j][i][1]));
                    keys = n.getKeys();
                    if(null==keys){
                        keys = new HashMap<>();
                    }
                    if(Constants.DELTA[j][i].length > 2) {
                        if(Constants.DELTA[j][i][2] == 1.) {
                            keys.put("name", "testa");
                        } else if(Constants.DELTA[j][i][2] == 2.) {
                            keys.put("name", "coda");
                        }
                    }
                    if(null == first) {
                        first = n;
                    }
                    n.setKeys(keys);
        
                    data.addPrimitive(n);
                    fishWay.addNode(n);
                }
                fishWay.addNode(first);
                data.addPrimitive(fishWay);
                polygon.addMember(new RelationMember(j == 0 ? "outer" : "inner", fishWay));
            }
            data.addPrimitive(polygon);    
        }
        
        data.endUpdate();
        return data;
    }
    static String convertStreamToString(InputStream is) {
        @SuppressWarnings("resource")
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
