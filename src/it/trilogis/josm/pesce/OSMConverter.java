package it.trilogis.josm.pesce;

import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;

import org.openstreetmap.josm.data.osm.DataSet;

public class OSMConverter {
    
    private static boolean debug = false; 
    
    public static DataSet convertDebug(IndoorFeaturesType document) {
        debug = true;
        return convert(document);
    }
    
    public static DataSet convert(IndoorFeaturesType document) {
        return null;
    }
}
