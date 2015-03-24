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


    private static String EXT = "xml", EXT2 = "pesce";
    public final static ExtensionFileFilter INDOOR_FILE_FILTER = new ExtensionFileFilter(
            String.format("%s,%s.gz,%s.bz2,%s", EXT, EXT, EXT, EXT2),
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
            //@SuppressWarnings("unchecked")
            //JAXBElement<IndoorFeaturesType> jaxb = (JAXBElement<IndoorFeaturesType>) u.unmarshal(in);
            //IndoorFeaturesType root = (IndoorFeaturesType) jaxb.getValue(); 
            System.out.println("!");
            IndoorFeaturesType root = (IndoorFeaturesType) u.unmarshal(in); 
            
            return IGMLConverter.convert(root);
            
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    protected DataSet parsePesce(InputStream in, ProgressMonitor instance)
            throws IllegalDataException {
        final double[][][] delta = {{
            {1.6502499988746422e-06, -1.789952999864397e-05, 1.},
            {4.921200002172554e-06, -1.321032999967997e-05},
            {8.555550003563894e-06, -9.042129999414783e-06},
            {9.28245000153538e-06, -1.847300001855956e-07},
            {7.465250000393553e-06, 1.1277770001427712e-05},
            {4.557750003186811e-06, 1.4924920000325415e-05},
            {5.599000019174127e-07, 1.7530020000933177e-05},
            {5.648049999251725e-06, 2.378232000133096e-05, 2.},
            {-7.072300000743326e-06, 2.378232000133096e-05, 2.},
            {-3.074449999473927e-06, 1.8051070000524305e-05},
            {-8.16259999680824e-06, 1.336182000066799e-05},
            {-1.1070149994907297e-05, 5.02547000102993e-06},
            {-1.0706699995921554e-05, -2.2688299985418325e-06},
            {-7.799199998714812e-06, -9.56317999900591e-06},
            {-4.5282499954169e-06, -1.633647999987886e-05 }},
            {{3.7593500010757452e-06, -1.0486459999015096e-05},
            {4.1342100018937344e-06, -1.0352879998620779e-05},
            {4.452559998924244e-06, -1.0039259999317096e-05},
            {4.67393000036509e-06, -9.585469999962015e-06},
            {4.773050001460888e-06, -8.940499998999485e-06},
            {4.676290004113071e-06, -8.294799998864733e-06},
            {4.4011299991097985e-06, -7.765099999446079e-06},
            {3.997340002115379e-06, -7.447169998897607e-06},
            {3.5379100040699996e-06, -7.398490000198876e-06},
            {3.144490001716349e-06, -7.5940899986193244e-06},
            {2.8315900024722396e-06, -7.987969999234679e-06},
            {2.6454200039438547e-06, -8.521929999005806e-06},
            {2.61349000396649e-06, -9.11713000029124e-06},
            {2.740500001152668e-06, -9.685640000256512e-06},
            {3.007700001944613e-06, -1.0143479999058513e-05},
            {3.375620003964741e-06, -1.0423039999096773e-05}}};

        String[] s = convertStreamToString(in).split(",");
        double lat = Double.parseDouble(s[0]);
        double lon = Double.parseDouble(s[1]);
        double scale = s.length>2 ? Double.parseDouble(s[2]) : 5.;

        Map<String, String> keys;
        DataSet data = new DataSet();
        Relation polygon = new Relation();
        keys = new HashMap<>();
        keys.put("type", "multipolygon");
        polygon.setKeys(keys);
        data.beginUpdate();
        for(int j=0 ; j<2; j++){
            Node first = null;
            Way fishWay = new Way();
            for(int i=0 ; i<delta[j].length ; i++) {
                Node n = new Node(new LatLon(lat + scale * delta[j][i][0],lon + scale * delta[j][i][1]));
                keys = n.getKeys();
                if(null==keys){
                    keys = new HashMap<>();
                }
                if(delta[j][i].length > 2) {
                    if(delta[j][i][2] == 1.) {
                        keys.put("name", "testa");
                    } else if(delta[j][i][2] == 2.) {
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
        data.endUpdate();
        return data;
    }
    static String convertStreamToString(InputStream is) {
        @SuppressWarnings("resource")
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
