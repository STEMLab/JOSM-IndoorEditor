package it.trilogis.josm.pesce;

import static org.openstreetmap.josm.tools.I18n.tr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.actions.ExtensionFileFilter;
import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.visitor.BoundingXYVisitor;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.gui.progress.ProgressMonitor;
import org.openstreetmap.josm.io.Compression;
import org.openstreetmap.josm.io.IllegalDataException;
import org.openstreetmap.josm.io.OsmImporter;

public class PesceImporter extends OsmImporter {


    private static String EXT = "xml", EXT2 = "pesce";
    public final static ExtensionFileFilter INDOOR_FILE_FILTER = new ExtensionFileFilter(
            String.format("%s,%s.gz,%s.bz2,.pesce", EXT, EXT, EXT),
            EXT, tr("IndoorGML files") + " (*."+EXT+"[.gz|.bz2])");
    
    public PesceImporter() {
        super(INDOOR_FILE_FILTER);
    }
    
    /**
     * Imports Pesce data from file
     * @param file file to read data from
     * @param progressMonitor handler for progress monitoring and canceling
     */
    @Override
    public void importData(File file, ProgressMonitor progressMonitor) throws IOException, IllegalDataException {
        try (InputStream in = Compression.getUncompressedFileInputStream(file)) {
            importData(in, file, progressMonitor);
        } catch (FileNotFoundException e) {
            Main.error(e);
            throw new IOException(tr("File ''{0}'' does not exist.", file.getName()), e);
        }
    }
    
    public void importData(InputStream in, File file, ProgressMonitor progressMonitor) throws IllegalDataException {

        final DataSet dataSet;
        if(file.getName().endsWith(EXT2)) {
            dataSet = parsePesce(in, progressMonitor);
        } else {
            dataSet = parseDataSet(in, progressMonitor);
        }
        if (dataSet == null) {
            throw new IllegalDataException(tr("Invalid dataset"));
        }
        OsmDataLayer layer = createLayer(dataSet, file, file.getName());
        
        BoundingXYVisitor v = new BoundingXYVisitor();
        v.visit(layer.data.getDataSourceBoundingBox());
        if (!v.hasExtend()) {
            v.computeBoundingBox(layer.data.getNodes());
        }
        Main.main.addLayer(layer, v.getBounds());
        layer.onPostLoadFromFile();
    }
    

    @Override
    protected DataSet parseDataSet(InputStream in, ProgressMonitor monitor)
            throws IllegalDataException {
        try {
            JAXBContext jc = JAXBContext.newInstance("trilogis.net.opengis.gml.v_3_2_1:"
                    + "net.opengis.gml.v_3_2_1:"
                    + "net.opengis.indoorgml.v_1_0.core:"
                    + "net.opengis.indoorgml.v_1_0.navigation");
            
            Unmarshaller u = jc.createUnmarshaller();
            // System.out.println(doc.getDeclaredType());
            @SuppressWarnings("unchecked")
            JAXBElement<IndoorFeaturesType> jaxb = (JAXBElement<IndoorFeaturesType>) u.unmarshal(in);
            IndoorFeaturesType root = (IndoorFeaturesType) jaxb.getValue(); 
            System.out.println("!");
            
            return IGMLConverter.convert(root);
            
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    protected DataSet parsePesce(InputStream in, ProgressMonitor instance)
            throws IllegalDataException {
        final double scale = 5.;
        final double[][] delta = {
            {-1.0558700012097688e-06,   -3.1382299994220375e-06},
            {-1.7100599976060948e-06,   -1.7835700010238043e-06},
            {-2.2915600013106996e-06,   -3.2470000022044587e-07},
            {-2.3642500011078482e-06,   1.1341599996939067e-06},
            {-1.7827400000669513e-06,   2.80142999997679e-06},
            {-7.651100020211743e-07,    3.7392800003033244e-06},
            {-1.5646799980117976e-06,   4.885530000109384e-06, 2.},
            {9.793900019872126e-07,     4.885530000109384e-06, 2.},
            {-3.824000316399179e-08,    3.635069999674556e-06},
            {7.613299999320589e-07,     3.114049999197732e-06},
            {1.3428299965312362e-06,    2.3846200001287343e-06},
            {1.7062699981806873e-06,    9.212000051661562e-08},
            {1.56088999858639e-06,      -1.679360000395036e-06},
            {8.340199997292075e-07,     -2.513000000092802e-06},
            {1.798299962274541e-07,     -3.4508399995303307e-06, 1.}};
        
        
        String s = convertStreamToString(in);
        double lat = Double.parseDouble(s.substring(0, s.indexOf(",")));
        double lon = Double.parseDouble(s.substring(s.indexOf(",")+1));
        
        DataSet data = new DataSet();
        data.beginUpdate();
        Node first = null;
        Way fishWay = new Way();
        Map<String, String> keys;
        for(int i=0 ; i<delta.length ; i++) {
            Node n = new Node(new LatLon(lat + scale * delta[i][0],lon + scale * delta[i][1]));
            keys = n.getKeys();
            if(null==keys){
                keys = new HashMap<>();
            }
            if(delta[i].length > 2) {
                if(delta[i][2] == 1.) {
                    keys.put("name", "testa");
                } else if(delta[i][2] == 2.) {
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
        //fishWay.addNode((Node)data.getPrimitiveById(1234,OsmPrimitiveType.NODE));
        
        data.addPrimitive(fishWay);
        data.endUpdate();
        return data;
    }
    static String convertStreamToString(InputStream is) {
        @SuppressWarnings("resource")
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
