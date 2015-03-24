package it.trilogis.josm.pesce;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.Way;

import net.opengis.gml.v_3_2_1.AbstractCurveType;
import net.opengis.gml.v_3_2_1.LineStringType;
import net.opengis.indoorgml.v_1_0.core.*;

public class IGMLConverter {
    
    public DataSet data;
    public HashMap<String,Node> nodes;
    static private boolean debug = false;
    
    public static DataSet convertDebug(IndoorFeaturesType root) {
        debug = true;
        return convert(root);
    }
    
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
    
    /**
     * Remove _.* from the node reference ids. Temporary
     * @param id
     * @return
     */
    private static String fixNodeId(String id) {
        return id.split("_")[0];
    }
    
    public void nodes(List<NodesType> nodesType) {
        nodes = new HashMap<>();
        
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
                if(debug) {
                    nodes.put(state.getId(), null);
                } else {
                    // Node type can be used only inside JOSM
                    Node josmNode = new Node(new LatLon(position.get(0), position.get(1)));
                    nodes.put(state.getId(), josmNode);
                    data.addPrimitive(josmNode);
                }
            }
        }
    }
    
    public void edges(List<EdgesType> edgesType) {
        nodes = new HashMap<>();
        
        data.beginUpdate();
        
        for(EdgesType type : edgesType) {
            System.out.println("NodesType id: "+type.getId());
            for(TransitionMemberType transitionMember : type.getTransitionMember()) {
                TransitionType transition = transitionMember.getTransition();
                System.out.println("Transition id: "+transition.getId()); // used into Edges to identify states
                String stateName = transition.getDescription().getTitle();
                System.out.println(stateName);
                // I'm assuming a lot of wrong things
                String txId = transition.getId();
                JAXBElement<? extends AbstractCurveType> curve = transition.getGeometry().getAbstractCurve();
                // Not used yet curves, I assume direc lines between States
                String nodeId1, nodeId2;
                nodeId1 = fixNodeId(transition.getConnects().get(0).getState().getId());
                nodeId2 = fixNodeId(transition.getConnects().get(1).getState().getId());
                
                Node node1 = nodes.get(nodeId1);
                Node node2 = nodes.get(nodeId2);
                
                if(debug) {
                    System.out.println(String.format(Locale.US, "%s: %s -> %s", txId, nodeId1, nodeId2));
                } else {

                    Way transactionWay = new Way();
                    Map<String, String> keys = new HashMap<>();
                    keys.put("indoor:highway","footway");
                    transactionWay.setKeys(keys);
                    transactionWay.addNode(node1);
                    transactionWay.addNode(node2);
                    //fishWay.addNode((Node)data.getPrimitiveById(1234,OsmPrimitiveType.NODE));
                    
                    data.addPrimitive(transactionWay);
                }
            }
        }

        data.endUpdate();
    }
}
