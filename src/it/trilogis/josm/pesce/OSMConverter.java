package it.trilogis.josm.pesce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import net.opengis.gml.v_3_2_1.*;
import net.opengis.indoorgml.v_1_0.core.*;

import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.RelationMember;
import org.openstreetmap.josm.data.osm.Way;

import static it.trilogis.josm.pesce.UtilsFromPython.*;

public class OSMConverter {
    
    //private static boolean debug = false; 
    private Collection<Node> nodes;
    private Collection<Way> ways;
    private Collection<Relation> relations;
   //private TransactionIds txIds;
    
    private IdsFactory idsFactory;
    final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory = new net.opengis.gml.v_3_2_1.ObjectFactory();
    
    private OSMConverter(DataSet data) {
        nodes = data.getNodes();
        ways = data.getWays();
        relations = data.getRelations();
        idsFactory = new IdsFactory();
        
        //txIds = TransactionIds.getInstance(data);
    }

    
    public static IndoorFeaturesType convertDebug(DataSet data) throws ConversionException {
        //debug = true;
        return convert(data);
    }
    
    public static IndoorFeaturesType convert(DataSet data) throws ConversionException {
        
        OSMConverter converter = new OSMConverter(data);
        

        IndoorFeaturesType root =  new IndoorFeaturesType();
        root.setId("IFS");
        
        
        root.setMultiLayeredGraph(converter.graph());
        
        return root;
    }
    
    private MultiLayeredGraphType graph() throws ConversionException {
        MultiLayeredGraphType graph = new MultiLayeredGraphType();
        graph.setId("MLG");
        SpaceLayersType layer = new SpaceLayersType();
        graph.getSpaceLayers().add(layer);
        
        layer.setId("SLs");
        
       
        
        print("Number of relations (spaceLayerType): "+String.valueOf(relations.size()));
        for(Relation relation : relations) {
            if(relation.hasKey("type") && relation.hasKey("name") && relation.get("type").equals(Constants.OSM_RELATION_TYPE_SPACELAYER)) {
                SpaceLayerMemberType member = new SpaceLayerMemberType();
                layer.getSpaceLayerMember().add(member);
                // This id has to come from the relation: should I put both nodes and edges into the relationship? Yes
                member.setSpaceLayer(spaceLayerTypeBuilder(relation.get("name"), nodes(relation), edges(relation)));   
                print(relation.get("name"));     
            } else {
                System.err.println("This relation "+relation.getName()+" is not a valid spaceLayerType");
            }
        }
        
        return graph;
    }
    
    /*
     * This is needed by edges in order to add references of edges into nodes
     */
    private Map<String,List<TransitionPropertyType>> stateTransitionsReferences;
    
    private NodesType nodes(Relation spaceLayerRelation) throws ConversionException {
        NodesType nodesType = new NodesType();
        stateTransitionsReferences = new HashMap<>();
        
        String graphName = spaceLayerRelation.getName();
        if(null == graphName) {
            graphName = idsFactory.newId("spaceLayer");
        }
        
        nodesType.setId(idsFactory.newId("Nodes"));
        
        for(RelationMember member : spaceLayerRelation.getMembers()) {
            if(member.getRole().equals(Constants.OSM_RELATION_ROLE_STATE)) {
                Node n = member.getNode();
                
                StateMemberType stateMemberType;
                String id;
                if(n.getKeys().containsKey("name")) {
                    id = n.get("name");
                } else {
                    id = idsFactory.newId("Sjosm");
                   //throw new ConversionException("State name not defined"); // I could invent unique names (using the osm primitive id. e.g. -43 -> Sm43josm)
                }
                if(null == n.get(Constants.OSM_KEY_LEVEL)){
                    throw new ConversionException("The state "+id+" does not have a level ("+Constants.OSM_KEY_LEVEL+")");
                }

                LatLon coor = n.getCoor();
                
                ////
//                List<String> S1Transitions = new ArrayList<String>();
//                S1Transitions.add(newTransitionTypeReferenceString("T010", "a"));
//                S1Transitions.add(newTransitionTypeReferenceString("T001", "a"));
//                tmpStatePosition = newPointProperty("P1", "a", "EPSG:4326", 23.556150930059, 46.071584048012, 0d);
//                tmpNode.getStateMember().add(newStateMember(stateStairwellID, "a", "Stairwell", tmpStatePosition, S1Transitions));
                ////
                
                PointPropertyType statePosition;
                
                statePosition = newPointProperty(idsFactory.newId("P"), Constants.SRID4326, coor.getX(), coor.getY(), Double.parseDouble(n.get(Constants.OSM_KEY_LEVEL)));
                stateMemberType = newStateMember(id, null, statePosition, false, false); // -2: isDoor, -1: isAnchor
                
                nodesType.getStateMember().add(stateMemberType);
                // TODO: get real description
                
                //state.setGeometry(pointPropertyTypeBuilder(new Double[]{coor.getX(), coor.getY()}));
                //states.add(stateMemberTypeBuilder(state));
            }
        }
        
        return nodesType;
    }
    
    public String newTransitionTypeReferenceString(String transitionID) {
        return "#" + transitionID;
    }
    
   
    private TransitionType newTransitionTypeReference(String transitionID) {
        TransitionType tmpTrans = new TransitionType();
        tmpTrans.setId(transitionID + "_" + idsFactory.newIntId("TRANSITIONREFERENCEID"));
        tmpTrans.setHref("#" + transitionID);
        return tmpTrans;
    }
    
    private PointPropertyType newPointProperty(String pointID, String pointSrsName, double pointX, double pointY, double pointZ) {
        PointPropertyType tmpStatePosition = new PointPropertyType();
        PointType tmpPointType = new PointType();
        tmpPointType.setId(pointID);
        tmpPointType.setSrsName(pointSrsName);
        DirectPositionType tmpPos = new DirectPositionType();
        tmpPos.getValue().add(pointY);// lat
        tmpPos.getValue().add(pointX);// lon
        tmpPos.getValue().add(pointZ);// elev
        tmpPointType.setPos(tmpPos);
        tmpStatePosition.setPoint(tmpPointType);
        return tmpStatePosition;
    }
    
    public StateMemberType newStateMember(String stateId, String name, PointPropertyType position, boolean isDoor, boolean isAnchorNode) {
        StateMemberType stMemb = new StateMemberType();
        // -------STATE TYPE
        StateType tmpState = new StateType();
        stMemb.setState(tmpState);
        tmpState.setId(stateId);
        if(null != name) {
            StringOrRefType sort = new StringOrRefType();
            sort.setValue(name);
            tmpState.setDescription(sort);
        }
        CodeType roomNameCT = new CodeType();
        roomNameCT.setValue(name);
        tmpState.getName().add(roomNameCT);// TODO add the room name
        // XXX Added parameters that are not in the standard definition (1.0)
        tmpState.setIsAnchorNode(isAnchorNode);
        tmpState.setIsDoor(isDoor);
        // ------GEOMETRY
        tmpState.setGeometry(position);
        
        
        // ------CONNECTS
        // I'll save here the reference, the edge function will add references of transitions
        stateTransitionsReferences.put(stateId, tmpState.getConnects());
        
        return stMemb;
    }
   
    
    // Builders
    private static SpaceLayerType spaceLayerTypeBuilder(String id, NodesType nodesType, EdgesType edgesType) {
        SpaceLayerType spaceLayerType = new SpaceLayerType();
        spaceLayerType.setId(id);
        spaceLayerType.getNodes().add(nodesType);
        spaceLayerType.getEdges().add(edgesType);
        return spaceLayerType;
    }
    
    private static StateMemberType stateMemberTypeBuilder(StateType state) {
        StateMemberType memberType = new StateMemberType();
        memberType.setState(state);
        return memberType;
    }
    
    private static PointPropertyType pointPropertyTypeBuilder(Double[] position) {
        PointPropertyType pointPropertyType = new PointPropertyType();
        PointType pointType = new PointType();
        DirectPositionType directPositionType = new DirectPositionType();
        directPositionType.setValue(Arrays.asList(position));
        pointType.setPos(directPositionType);
        pointPropertyType.setPoint(pointType);
        return pointPropertyType;
    }
    // Builders
    
    //private StateMemberType uno=null,due=null,tre=null;
    private EdgesType edges(Relation spaceLayerRelation)  {
        EdgesType edgesType = new EdgesType();
        LineStringType tmpTransitionLine;// PLACEHOLDER
        edgesType.setId(idsFactory.newId("Edges"));

        
        for(RelationMember member : spaceLayerRelation.getMembers()) {
            if(member.getRole().equals(Constants.OSM_RELATION_ROLE_TRANSITION)) {
                Way w = member.getWay();
                
                Node start = null;
                for(Node end : w.getNodes()) {
                    if(null==start) {
                        start = end;
                        continue;
                    }
                    
                    List<StateType> tStates = new ArrayList<>();
                    tStates.add(newStateTypeReference(start.get("name")));
                    tStates.add(newStateTypeReference(end.get("name")));
                    tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, idsFactory.newId("nLS"), Constants.SRID4326, 
                            new double[] { start.getCoor().getX(), end.getCoor().getX() }, 
                            new double[] { start.getCoor().getY(), end.getCoor().getY() },
                            new double[] { 
                        Double.parseDouble(start.get(Constants.OSM_KEY_LEVEL)),
                        Double.parseDouble(end.get(Constants.OSM_KEY_LEVEL)) });
                    String id = w.get("name")!=null ? w.get("name") : idsFactory.newId("nT");
                    // If 1 way is mapped to more transition I need mode ids from a name
                    if(w.get("name")!=null && w.getNodes().size() > 2) {
                        id = idsFactory.newId(id);
                    }
                    edgesType.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, 
                            id, 
                            1d, tmpTransitionLine, tStates));

                    // Add references of the transaction to the involved States
                    for(Node state : new Node[] {start, end}) {
                        
                        TransitionPropertyType transitionLink = new TransitionPropertyType();
                        transitionLink.setHref(newTransitionTypeReferenceString(id));
                        stateTransitionsReferences.get(state.get("name")).add(transitionLink);
                    }
                    
                    // add reference of the transition to start and end TODO
                    // start = end;
                    // (What I was saying here??)
                }
            }
        }
        
        return edgesType;
    }
    
    public StateType newStateTypeReference(String stateID) {
        StateType st = new StateType();
        st.setId(stateID + "_" + idsFactory.newIntId("STATEREFERENCEID_SEQUENCE"));
        st.setHref("#" + stateID);
        return st;
    }
    
    public LineStringType newLineStringProperty(net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory, String lineID, String lineSrsName, double[] pointsX, double[] pointsY, double[] pointsZ) {
        LineStringType lst = new LineStringType();
        lst.setId(lineID);
        lst.setSrsName(lineSrsName);
        List<JAXBElement<?>> posList = lst.getPosOrPointPropertyOrPointRep();
        DirectPositionType tmpPos;
        for (int i = 0; i < pointsX.length; i++) {
            tmpPos = new DirectPositionType();
            tmpPos.getValue().add(pointsY[i]);// lat
            tmpPos.getValue().add(pointsX[i]);// lon
            tmpPos.getValue().add(pointsZ[i]);// elev
            posList.add(_gmlObjectFactory.createPos(tmpPos));
        }
        return lst;
    }
    
    public TransitionMemberType newTransitionMember(net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory, String transitionId, double weight, LineStringType linestring,
            List<StateType> connectedStates) {
            TransitionMemberType trMemb = new TransitionMemberType();
            // -------TRANSITION TYPE
            TransitionType tmpTrans = new TransitionType();
            trMemb.setTransition(tmpTrans);
            tmpTrans.setId(transitionId);
            StringOrRefType sort = new StringOrRefType();
            sort.setValue(transitionId);
            tmpTrans.setDescription(sort);
            tmpTrans.setWeight(weight);
            // ------GEOMETRY
            CurvePropertyType tmpGeom = new CurvePropertyType();
            tmpGeom.setAbstractCurve(_gmlObjectFactory.createLineString(linestring));
            tmpTrans.setGeometry(tmpGeom);
            // ------CONNECTS
            StatePropertyType tmpStateProp;
            for (StateType tmpState : connectedStates) {
                if (null != tmpState) {
                    tmpStateProp = new StatePropertyType();
                    tmpStateProp.setState(tmpState);
                    tmpTrans.getConnects().add(tmpStateProp);
                }
            }

            return trMemb;
        }
    
    public class ConversionException extends Exception {
        public ConversionException() {
        }
        public ConversionException(String message) {
            super(message);
        }
    }
}
