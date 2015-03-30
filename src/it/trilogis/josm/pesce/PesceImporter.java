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


    private static String EXT = "igml", EXT2 = "pesce";
    public final static ExtensionFileFilter INDOOR_FILE_FILTER = new ExtensionFileFilter(
            String.format("%s,%s.gz,%s.bz2,%s", EXT, EXT, EXT, EXT2),
            EXT, tr("IndoorGML files") + " (*."+EXT+"[.gz|.bz2])");
    private boolean isFirstType = true;
    
    public PesceImporter() {
        super(INDOOR_FILE_FILTER);
    }
    
    @Override
    public boolean acceptFile(File pathname) {
        isFirstType = pathname.getName().endsWith(EXT);
        return super.acceptFile(pathname); // TODO: check!
    }
    
    /**
     * Imports Pesce data from file
     * @param file file to read data from
     * @param progressMonitor handler for progress monitoring and canceling
     * /
    @Override
    public void importData(File file, ProgressMonitor progressMonitor) throws IOException, IllegalDataException {
        try (InputStream in = Compression.getUncompressedFileInputStream(file)) {
            importData(in, file, progressMonitor);
        } catch (FileNotFoundException e) {
            Main.error(e);
            throw new IOException(tr("File ''{0}'' does not exist.", file.getName()), e);
        }
    }*/
    
    /*
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
    }*/
    

    @Override
    protected DataSet parseDataSet(InputStream in, ProgressMonitor monitor)
            throws IllegalDataException {

        if(isFirstType) {
            IndoorFeaturesType root = Marshalling.unmarshal(in);
            return IGMLConverter.convert(root);
        } else {
            return parsePesce(in, monitor);
        }
    }
    
    
    
    protected DataSet parsePesce(InputStream in, ProgressMonitor instance)
            throws IllegalDataException {
        DataSet data = new DataSet();
        
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
                for(int i=0 ; i<Constants.delta[j].length ; i++) {
                    Node n = new Node(new LatLon(lat + scale * Constants.delta[j][i][0],lon + scale * Constants.delta[j][i][1]));
                    keys = n.getKeys();
                    if(null==keys){
                        keys = new HashMap<>();
                    }
                    if(Constants.delta[j][i].length > 2) {
                        if(Constants.delta[j][i][2] == 1.) {
                            keys.put("name", "testa");
                        } else if(Constants.delta[j][i][2] == 2.) {
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
