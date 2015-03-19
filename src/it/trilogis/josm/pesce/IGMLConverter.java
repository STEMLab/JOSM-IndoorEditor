package it.trilogis.josm.pesce;

import java.util.List;
import java.util.Locale;

import org.openstreetmap.josm.data.osm.DataSet;

import net.opengis.indoorgml.v_1_0.core.*;

public class IGMLConverter {
    
    public DataSet data;
    
    public static DataSet convert(IndoorFeaturesType root) {
        
        IGMLConverter converter = new IGMLConverter(new DataSet());
        
        PrimalSpaceFeaturesPropertyType primalSpace = root.getPrimalSpaceFeatures();
        
        MultiLayeredGraphType multiLayeredGraph = root.getMultiLayeredGraph();
        
        converter.graph(multiLayeredGraph);
        
        return converter.data;
    }
    
    private IGMLConverter(DataSet data) {
        this.data = data;
    }
    
    public void graph(MultiLayeredGraphType graph) {

        for(SpaceLayersType layer : graph.getSpaceLayers()) {
            System.out.println("Layer id: "+ layer.getId());

            for(SpaceLayerMemberType member : layer.getSpaceLayerMember()) {
                System.out.println("Nodes -->");
                nodes(member.getSpaceLayer().getNodes());
                System.out.println("Edges -->");
                edges(member.getSpaceLayer().getEdges());
           }
        }
    }
    
    public void nodes(List<NodesType> nodesType) {
        for(NodesType type : nodesType) {
            System.out.println("NodesType id: "+type.getId());
            for(StateMemberType node : type.getStateMember()) {
                StateType state = node.getState();
                System.out.println("State id: "+state.getId()); // used into Edges to identify states
                String stateName = state.getDescription().getTitle();
                System.out.println(stateName);
                // I'm assuming a lot of wrong things
                List<Double> position = state.getGeometry().getPoint().getPos().getValue();
                System.out.println(String.format(Locale.US, "%s %f %f", state.getId(), position.get(0), position.get(1)));
                
            }
        }
    }
    
    public void edges(List<EdgesType> edgesType) {
        
    }
}
