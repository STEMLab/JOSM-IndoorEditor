package it.trilogis.josm.pesce;

import org.openstreetmap.josm.data.osm.DataSet;

import net.opengis.indoorgml.v_1_0.core.*;

public class IGMLConverter {
    
    public static DataSet convert(IndoorFeaturesType root) {
        DataSet data = new DataSet();
        
        PrimalSpaceFeaturesPropertyType primalSpace = root.getPrimalSpaceFeatures();
        
        MultiLayeredGraphType multiLayeredGraph = root.getMultiLayeredGraph();
        
        
        
        return data;
    }
}
