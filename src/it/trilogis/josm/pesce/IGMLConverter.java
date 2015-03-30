package it.trilogis.josm.pesce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

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
    static private boolean test = false;
    
    public static DataSet convertDebug(IndoorFeaturesType root) {
        test = true;
        return convert(root);
    }
    
    public static DataSet convert(IndoorFeaturesType root) {
        
        IGMLConverter converter = new IGMLConverter(new DataSet());
        
        PrimalSpaceFeaturesPropertyType primalSpace = root.getPrimalSpaceFeatures();
        
        MultiLayeredGraphType multiLayeredGraph = root.getMultiLayeredGraph();
        
        converter.graph(multiLayeredGraph);
        
        return converter.data;
    }
    
    public static DataSet fakeConvert(IndoorFeaturesType root) {
        
        IGMLConverter converter = new IGMLConverter(new DataSet());
    
        Node josmNode = new Node(new LatLon(45.0, 11.0));
        converter.data.addPrimitive(josmNode);
        
        return converter.data;
    }
    
    private IGMLConverter(DataSet data) {
        this.data = data;
    }
    
    public void graph(MultiLayeredGraphType graph) {

        data.beginUpdate();
        for(SpaceLayersType layer : graph.getSpaceLayers()) {
            System.out.println("Layer id: "+ layer.getId());

            for(SpaceLayerMemberType member : layer.getSpaceLayerMember()) {
                System.out.println("Nodes -->");
                //nodes(new SpaceLayerType[]{member.getSpaceLayer().getNodes()[0]});
                nodes(member.getSpaceLayer().getNodes());
                System.out.println("Edges -->");
                edges(member.getSpaceLayer().getEdges());
                System.out.println("<--");
           }
        }
        data.endUpdate();
    }
    
    /**
     * Remove _.* from the node reference ids. Temporary
     * @param id
     * @return
     */
    @Deprecated
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
                if(test) {
                    nodes.put(state.getId(), null);
                } else {
                    // Node type can be used only inside JOSM
                    Node josmNode = new Node(new LatLon(position.get(0), position.get(1)));
                    josmNode.put("name", state.getId());
                    nodes.put(state.getId(), josmNode);
                    data.addPrimitive(josmNode);
                    
                }
            }
        }
        
        
    }
    
    private void printPaths(List<List<String>> paths) {
        int i = 0;
        for(List<String> path : paths) {
            printPath(path, ""+i++);
        }
    }
    private void printPath(List<String> path, String comment) {
        System.out.print(comment);
        for(String node : path) {
            System.out.print("  "+node);
        }
        System.out.println();
    }
    
    private List<List<String>> transitions2Paths(List<String[]> txs) {
        List<List<String>> paths = new ArrayList<>();
        Set<String> tips = new HashSet<>();
        for(String[] tx : txs) {
            if(tips.contains(tx[0]) || tips.contains(tx[1])) {
                // Add 0->1 or 1->0
                if(!tips.contains(tx[0])) {
                    String tmpString = tx[0];
                    tx[0] = tx[1];
                    tx[1] = tmpString;
                }
                short pathI = 0;
                for(List<String> path : paths) {
                    
                    printPath(path,pathI+"old:");
                    if(path.get(0).equals(tx[0])) {
                        path.add(0, tx[1]);
                    } else if(path.get(path.size()-1).equals(tx[0])) {
                        
                        path.add(tx[1]); // add the transition to the path
                    } else {
                        pathI++;
                        continue;
                    }
                    printPath(path,pathI+"new:");
                    

                    // update tips set
                    tips.remove(tx[0]);
                    tips.add(tx[1]);
                    pathI++;
                    break;
                }
            } else {
                List<String> newPath = new LinkedList<>();
                newPath.add(tx[0]);
                newPath.add(tx[1]);
                tips.add(tx[0]);
                tips.add(tx[1]);
                paths.add(newPath);
            }
        }
        
        printPaths(paths);
        joinPaths(paths, true);
        printPaths(paths);
        
        return paths;
    }
    
    private void joinPaths(List<List<String>> paths, boolean reverseAllowed) {
        
        Map<String,List<List<String>>> tips = new HashMap<>();
      
        for(List<String> path : paths) {
            String head = path.get(0), tail = path.get(path.size()-1);
            
            for(String tip : new String[]{head, tail}) {
                
                if(tips.containsKey(tip)) {
                    tips.get(tip).add(path);
                } else {
                    List<List<String>> l = new ArrayList<>();
                    l.add(path);
                    tips.put(tip, l);
                }    
            }
        }
        
        System.out.println("Tips table");
        for(String tip : tips.keySet()) {
            System.out.print(tip+" -> ");
            for(List<String> p : tips.get(tip)) {
                for(String s : p) {
                    System.out.print(s+" ");
                }
                System.out.print(", ");
            }
            System.out.println();
        }
        
        // join couples of paths
        for(String tip : tips.keySet()) {
            while(tips.get(tip).size()>1) {
                List<String> path1 = tips.get(tip).get(0);    
                List<String> path2 = tips.get(tip).get(1);
                
                tips.get(tip).remove(0);
                tips.get(tip).remove(0);
                
                String 
                    h1 = path1.get(0),
                    t1 = path1.get(path1.size()-1),
                    h2 = path2.get(0),
                    t2 = path2.get(path2.size()-1);
                
                int match = h1.equals(h2) ? 0 : h1.equals(t2) ? 1 : t1.equals(h2) ? 2 : t1.equals(t2) ? 3 : 4;
                assert match != 4;
                
                if(!reverseAllowed && (match == 0 || match == 3)) {
                    continue;
                }
                
                System.out.println(">>>> "+match);
                
                switch(match) {
                case 0: //hh
                    Collections.reverse(path1);
                    path1.addAll(path2);
                    paths.remove(path2);
                    break;
                case 1: //ht
                    path2.addAll(path1);
                    paths.remove(path1);
                    break;
                case 2: //th
                    path1.addAll(path2);
                    paths.remove(path2);
                case 3: //tt
                    Collections.reverse(path2);
                    path1.addAll(path2);
                    paths.remove(path2);
                }
            }
        }
        
    }
    
    private void addPath(List<String> path) {
        Way w = new Way();
        for(String id : path) {
            assert nodes.containsKey(id);
            w.addNode(nodes.get(id));
        }
        data.addPrimitive(w);
    }
    
    public void edges(List<EdgesType> edgesType) {
        
        List<String[]> txs = new LinkedList<>();
        
        for(EdgesType type : edgesType) {
            System.out.println("EdgesType id: "+type.getId());
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
                
                txs.add(new String[] {nodeId1, nodeId2});
                
                /*
                Node node1 = nodes.get(nodeId1);
                Node node2 = nodes.get(nodeId2);
                if(node1==null || node2==null) {
                    System.err.println("Erore");
                    System.exit(1);
                }
                System.out.println(String.format(Locale.US, "%s: %s (%s) -> %s (%s)", txId, nodeId1, node1!=null, nodeId2, node2!=null));
                
                if(test) {
                    
                } else {

                    Way transactionWay = new Way();
                    //Map<String, String> keys = new HashMap<>();
                    //keys.put("indoor:highway","footway");
                    //transactionWay.setKeys(keys);
                    transactionWay.addNode(node1);
                    transactionWay.addNode(node2);
                    //fishWay.addNode((Node)data.getPrimitiveById(1234,OsmPrimitiveType.NODE));
                    
                    data.addPrimitive(transactionWay);
                
               }
               */
            }
        }
        
        for(List<String> path : transitions2Paths(txs)) {
            addPath(path);
        }
    }
}
