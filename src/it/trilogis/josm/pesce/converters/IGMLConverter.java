package it.trilogis.josm.pesce.converters;

import it.trilogis.josm.pesce.Constants;
import it.trilogis.josm.pesce.IdsFactory;
import it.trilogis.josm.pesce.UtilsFromPython;
import it.trilogis.josm.pesce.TransactionIds.Tx;

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
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.RelationMember;
import org.openstreetmap.josm.data.osm.Way;

import net.opengis.gml.v_3_2_1.AbstractCurveType;
import net.opengis.indoorgml.v_1_0.core.*;
import static it.trilogis.josm.pesce.UtilsFromPython.*;

public class IGMLConverter {
    
    public DataSet data;
    public HashMap<String,Node> nodes;
    //private TransactionIds txIds; //disable, not needed now
    static private boolean test = false;
    
    public static DataSet convertDebug(IndoorFeaturesType root) {
        test = true;
        return convert(root);
    }
    
    public static DataSet convert(IndoorFeaturesType root) {
        
        IGMLConverter converter = new IGMLConverter(new DataSet());
        
        //PrimalSpaceFeaturesPropertyType primalSpace = root.getPrimalSpaceFeatures();
        
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
        
        //Store here the transaction ids, JOSM will not see them
        //txIds = TransactionIds.getInstance(data);
    }
    
    public void graph(MultiLayeredGraphType graph) {

        data.beginUpdate();
        for(SpaceLayersType layer : graph.getSpaceLayers()) {
            System.out.println("Layer id: "+ layer.getId());
            

            int i=0;
            for(SpaceLayerMemberType member : layer.getSpaceLayerMember()) {
                System.out.println("***"+i);
                i++;
                
                SpaceLayerType spaceLayerType = member.getSpaceLayer();
                
                // TODO: create a Relation with this name
                Relation spaceLayerRelation = new Relation();
                spaceLayerRelation.put(Constants.OSM_KEY_ID, spaceLayerType.getId());
                spaceLayerRelation.put("type", Constants.OSM_RELATION_TYPE_SPACELAYER); // FIXME
                
                System.out.println("Nodes of layer " + spaceLayerType.getId() + " -->");
                //nodes(new SpaceLayerType[]{member.getSpaceLayer().getNodes()[0]});
                nodes(spaceLayerType.getNodes(), spaceLayerRelation);
                System.out.println("Edges -->");
                edges(spaceLayerType.getEdges(), spaceLayerRelation);
                System.out.println("<--");
                
                data.addPrimitive(spaceLayerRelation);
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
    
    
    public void nodes(List<NodesType> nodesType, Relation spaceLayerRelation) {
        nodes = new HashMap<>();
        
        for(NodesType type : nodesType) {
            System.out.println("NodesType id: "+type.getId());
            
            for(StateMemberType node : type.getStateMember()) {
                StateType state = node.getState();
                System.out.println("State id: "+state.getId()); // used into Edges to identify states
                String stateName = state.getDescription().getTitle();
                if(null!=stateName) {
                    System.out.println("stateName: "+stateName);
                }
                // I'm assuming a lot of wrong things
                List<Double> position = state.getGeometry().getPoint().getPos().getValue();
                System.out.println(String.format(Locale.US, "%s %f %f", state.getId(), position.get(0), position.get(1)));
                if(test) {
                    nodes.put(state.getId(), null);
                } else {
                    // Node type can be used only inside JOSM
                    Node josmNode = new Node(new LatLon(position.get(0), position.get(1)));
                    josmNode.put(Constants.OSM_KEY_ID, state.getId());
                    josmNode.put(Constants.OSM_KEY_LEVEL, String.valueOf(position.get(2).intValue()));
                    nodes.put(state.getId(), josmNode);
                    data.addPrimitive(josmNode);
                    spaceLayerRelation.addMember(new RelationMember(Constants.OSM_RELATION_ROLE_STATE, josmNode));
                }
            }
        }
        
        
    }
    
    private void printPaths(List<List<String>> paths, String msg) {
        System.out.println(msg);
        int i = 0;
        for(List<String> path : paths) {
            printPath(path, String.valueOf(i++));
        }
    }
    private void printPath(List<String> path, String comment) {
        System.out.print(comment);
        for(String node : path) {
            System.out.print("  "+node);
        }
        System.out.println();
    }

    @Deprecated
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
                    
                    if(path.get(0).equals(tx[0])) {
                        printPath(path,pathI+"old:");
                        path.add(0, tx[1]);
                    } else if(path.get(path.size()-1).equals(tx[0])) {
                        printPath(path,pathI+"old:");
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
        
        printPaths(paths,"Not joined paths");
        joinPaths(paths, true);
        printPaths(paths,"Joined paths");
        
        return paths;
    }
    
    @Deprecated
    private void joinPaths(List<List<String>> paths, boolean reverseAllowed) {
      
        // test every couple of paths
        rewind: while(true) {
            System.out.println("Rewind");
            for(List<String> i : paths) {
                printPath(i,"i");
                for(List<String> j : paths) {
                    if(i==j) {
                        continue; // Force: i != j
                    }
                    printPath(j,"j");
                    String
                        h1 = i.get(0),
                        t1 = i.get(i.size()-1),
                        h2 = j.get(0),
                        t2 = j.get(j.size()-1);
                    
                    int match = h1.equals(h2) ? 0 : h1.equals(t2) ? 1 : t1.equals(h2) ? 2 : t1.equals(t2) ? 3 : 4;

                    System.out.println("Match: "+match);
                    if(!reverseAllowed && (match == 0 || match == 3) || match == 4) {
                        continue;
                    }
                    
                    switch(match) {
                    case 0: //hh                     x-----> x----->
                        i.remove(0);
                        Collections.reverse(i);
                        i.addAll(j);
                        paths.remove(j);
                        break;
                    case 1: //ht                     x-----> ----->x
                        i.remove(0);
                        j.addAll(i);
                        paths.remove(i);
                        break;
                    case 2: //th                     ----->x x----->
                        j.remove(0);
                        i.addAll(j);
                        paths.remove(j);
                        break;
                    case 3: //tt                     ----->x ----->x
                        Collections.reverse(j);
                        j.remove(0);
                        i.addAll(j);
                        paths.remove(j);
                    }
                    continue rewind; // because paths changes
                }
            }
            break; // If we are here all the paths were join
        }
        
    }
    
    private void addPath(List<String> path, String gmlId, Relation spaceLayerRelation) {
        Way w = new Way();
        for(String id : path) {
            assert nodes.containsKey(id);
            w.addNode(nodes.get(id));
        }
        if(null!=gmlId) {
            w.put(Constants.OSM_KEY_ID,gmlId);
        }
        data.addPrimitive(w);
        spaceLayerRelation.addMember(new RelationMember(Constants.OSM_RELATION_ROLE_TRANSITION, w));
    }
    
    public void edges(List<EdgesType> edgesType, Relation spaceLayerRelation) {
        
        boolean useSimpleTransactions = true;
        
        List<String[]> txs = new LinkedList<>();
        
        IdsFactory ids = new IdsFactory();
        
        for(EdgesType type : edgesType) {
            System.out.println("EdgesType id: "+type.getId());
            for(TransitionMemberType transitionMember : type.getTransitionMember()) {
                TransitionType transition = transitionMember.getTransition();
                //String stateName = transition.getDescription().getTitle();
                // I'm assuming a lot of wrong things
                JAXBElement<? extends AbstractCurveType> curve = transition.getGeometry().getAbstractCurve();
                // Not used yet curves, I assume direc lines between States
                String nodeId1, nodeId2;
                
//                
//                List<StatePropertyType> lspt = transition.getConnects();
//                if(null!=lspt && lspt.size()>=2) {
//                    System.out.println(":O "+lspt.size());
//                    
//                    
//                }
//                
//              nodeId1 = fixNodeId(transition.getConnects().get(0).getState().getId());
//              nodeId2 = fixNodeId(transition.getConnects().get(1).getState().getId());
//              
//              
//              txs.add(new String[] {nodeId1, nodeId2, transition.getId()});
//              
//              System.out.println(String.format("Transition %s: %s -> %s", transition.getId(), nodeId1, nodeId2));
              
                
                List<StatePropertyType> lspt = transition.getConnects();
                if(null!=lspt && lspt.size()>=2) {
                    
                    StatePropertyType
                        spt1 = lspt.get(0), 
                        spt2 = lspt.get(1);
                    if(spt1!=null && spt2!=null) {
                        StateType st = spt1.getState();
                        if(st!=null) {
                            nodeId1 = fixNodeId(st.getId());
                        } else {
                            nodeId1 = strip(spt1.getHref(),"#");
                            System.out.println("&3 "+nodeId1);
                        }
                        
                        st = spt2.getState();
                        if(st!=null) {
                            nodeId2 = fixNodeId(st.getId());
                        } else {
                            nodeId2 = UtilsFromPython.strip(spt2.getHref(),"#");
                            System.out.println("&4 "+nodeId2);
                        }

                        txs.add(new String[] {nodeId1, nodeId2, transition.getId()});
                        
                        // Save the Id
                        //txIds.put(new Tx(nodeId1,nodeId2),transition.getId());
                        
                        System.out.println(String.format("Transition %s: %s -> %s", transition.getId(), nodeId1, nodeId2));  
                            
                    } else {
                        System.err.println("&2");
                        // ERROR
                    }
                } else {
                    System.err.println("&1");
                    // ERROR TODO
                }
            }
        }
        
        if(useSimpleTransactions) {
            for(String[] tx : txs) {
                List<String> ltx = new ArrayList<>(); 
                ltx.add(tx[0]);
                ltx.add(tx[1]);
                
                addPath(ltx, tx[2], spaceLayerRelation);
            }
        } else {
            for(List<String> path : transitions2Paths(txs)) {
                addPath(path, null, spaceLayerRelation);
            }
        }
    }
}
