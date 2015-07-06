/**
 * 
 */
package it.trilogis.ilocate.test;

import it.trilogis.ingoorgml.utils.IndoorGMLNamespaceMapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import net.opengis.gml.v_3_2_1.CurvePropertyType;
import net.opengis.gml.v_3_2_1.DirectPositionType;
import net.opengis.gml.v_3_2_1.LineStringType;
import net.opengis.gml.v_3_2_1.PointPropertyType;
import net.opengis.gml.v_3_2_1.PointType;
import net.opengis.gml.v_3_2_1.StringOrRefType;
import net.opengis.indoorgml.v_1_0.core.EdgesType;
import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;
import net.opengis.indoorgml.v_1_0.core.MultiLayeredGraphType;
import net.opengis.indoorgml.v_1_0.core.NodesType;
import net.opengis.indoorgml.v_1_0.core.SpaceLayerMemberType;
import net.opengis.indoorgml.v_1_0.core.SpaceLayerType;
import net.opengis.indoorgml.v_1_0.core.SpaceLayersType;
import net.opengis.indoorgml.v_1_0.core.StateMemberType;
import net.opengis.indoorgml.v_1_0.core.StatePropertyType;
import net.opengis.indoorgml.v_1_0.core.StateType;
import net.opengis.indoorgml.v_1_0.core.TransitionMemberType;
import net.opengis.indoorgml.v_1_0.core.TransitionPropertyType;
import net.opengis.indoorgml.v_1_0.core.TransitionType;
import org.xml.sax.SAXException;

/**
 * @author Nicola Dorigatti
 */
public class IndoorGML_Test {

    public static int   TRANSITIONREFERENCEID_SEQUENCE = 0;
    public static int   STATEREFERENCEID_SEQUENCE      = 0;

    //
    final static String stateStairwellID               = "S1";

    public static void main(String[] args) {
        new IndoorGML_Test();
    }

    /**
     * 
     */
    public IndoorGML_Test() {
        // TODO Auto-generated constructor stub
        final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory = new net.opengis.gml.v_3_2_1.ObjectFactory();

        // INDOOR FEATURES
        IndoorFeaturesType root = new IndoorFeaturesType();
        root.setId("IFS");
        // -MULTILAYERED GRAPH
        MultiLayeredGraphType mlg = new MultiLayeredGraphType();
        mlg.setId("MLG");
        root.setMultiLayeredGraph(mlg);

        // --SPACE LAYERS
        SpaceLayersType slst = new SpaceLayersType();
        slst.setId("SLs");
        mlg.getSpaceLayers().add(slst);

        // ---SPACE LAYERS MEMBER
        SpaceLayerMemberType spaceLayerMember = new SpaceLayerMemberType();
        slst.getSpaceLayerMember().add(spaceLayerMember);

        // ----SPACE LAYER TYPE
        SpaceLayerType spaceLayerType = new SpaceLayerType();
        spaceLayerMember.setSpaceLayer(spaceLayerType);
        spaceLayerType.setId("walking");

        // ========================================== ADD NODES(STATES)!!!!
        // -----NODES
        List<NodesType> nodes = spaceLayerType.getNodes();
        NodesType tmpNode = new NodesType();
        tmpNode.setId("Nodes");
        nodes.add(tmpNode);
        // ------ STATES
        setGroundNodesList(tmpNode);// XXX GROUND FLOOR
        setFirstNodesList(tmpNode); // XXX FIRST FLOOR

        // ========================================== NOW ADD EDGES(TRANSITIONS)!!!!
        // -----EDGES
        List<EdgesType> edges = spaceLayerType.getEdges();
        EdgesType tmpEdge = new EdgesType();
        tmpEdge.setId("Edges");
        edges.add(tmpEdge);
        setGroundEdgesList(tmpEdge, _gmlObjectFactory);// XXX GROUND FLOOR
        setFirstEdgesList(tmpEdge, _gmlObjectFactory);// XXX FIRST FLOOR
        setInterFloorEdgesList(tmpEdge, _gmlObjectFactory);
        // -------------------------

        try {
            IndoorGML_Test.marshallData(root);

            // validate
            IndoorFeaturesType customer = IndoorGML_Test.unmarshall();
            System.out.println("TEST " + customer.getId());
        } catch (JAXBException | SAXException | FileNotFoundException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void setGroundNodesList(NodesType tmpNode) {
        PointPropertyType tmpStatePosition;// PLACEHOLDER
        // ----------------------- STATE 1
        List<TransitionType> S1Transitions = new ArrayList<TransitionType>();
        S1Transitions.add(newTransitionTypeReference("T010"));
        S1Transitions.add(newTransitionTypeReference("T001"));
        tmpStatePosition = newPointProperty("P1", "EPSG:4326", 23.556150930059, 46.071584048012, 0d);
        tmpNode.getStateMember().add(newStateMember(stateStairwellID, "Stairwell", tmpStatePosition, S1Transitions));
        // ----------------------- STATE 501
        List<TransitionType> S501Transitions = new ArrayList<TransitionType>();
        S501Transitions.add(newTransitionTypeReference("T010"));
        S501Transitions.add(newTransitionTypeReference("T014"));
        tmpStatePosition = newPointProperty("P501", "EPSG:4326", 23.556169705523, 46.071571978071, 0d);
        tmpNode.getStateMember().add(newStateMember("S501", "DoorStairwell", tmpStatePosition, S501Transitions));
        // ----------------------- STATE 502
        List<TransitionType> S502Transitions = new ArrayList<TransitionType>();
        S502Transitions.add(newTransitionTypeReference("T012"));
        S502Transitions.add(newTransitionTypeReference("T013"));
        tmpStatePosition = newPointProperty("P502", "EPSG:4326", 23.556196192337, 46.071601482371, 0d);
        tmpNode.getStateMember().add(newStateMember("S502", "DoorElevator", tmpStatePosition, S502Transitions));
        // ----------------------- STATE 2
        List<TransitionType> S2Transitions = new ArrayList<TransitionType>();
        S2Transitions.add(newTransitionTypeReference("T012"));
        S2Transitions.add(newTransitionTypeReference("T002"));
        tmpStatePosition = newPointProperty("P2", "EPSG:4326", 23.556200886202, 46.071611540654, 0d);
        tmpNode.getStateMember().add(newStateMember("S2", "Elevator", tmpStatePosition, S2Transitions));
        // ----------------------- STATE 510
        List<TransitionType> S510Transitions = new ArrayList<TransitionType>();
        S510Transitions.add(newTransitionTypeReference("T015"));
        S510Transitions.add(newTransitionTypeReference("T016"));
        tmpStatePosition = newPointProperty("P510", "EPSG:4326", 23.556215638352, 46.071569966415, 0d);
        tmpNode.getStateMember().add(newStateMember("S510", "HallwaySASDoor", tmpStatePosition, S510Transitions));
        // ----------------------- STATE 10
        List<TransitionType> S10Transitions = new ArrayList<TransitionType>();
        S10Transitions.add(newTransitionTypeReference("T016"));
        S10Transitions.add(newTransitionTypeReference("T017"));
        tmpStatePosition = newPointProperty("P10", "EPSG:4326", 23.556222343874, 46.071558567026, 0d);
        tmpNode.getStateMember().add(newStateMember("S10", "SAS", tmpStatePosition, S10Transitions));
        // ----------------------- STATE 509
        List<TransitionType> S509Transitions = new ArrayList<TransitionType>();
        S509Transitions.add(newTransitionTypeReference("T017"));
        S509Transitions.add(newTransitionTypeReference("T018"));
        tmpStatePosition = newPointProperty("P509", "EPSG:4326", 23.556235754920, 46.071566613653, 0d);
        tmpNode.getStateMember().add(newStateMember("S509", "SASDiningRoomDoor", tmpStatePosition, S509Transitions));
        // ----------------------- STATE 9
        List<TransitionType> S9Transitions = new ArrayList<TransitionType>();
        S9Transitions.add(newTransitionTypeReference("T018"));
        tmpStatePosition = newPointProperty("P9", "EPSG:4326", 23.556254530383, 46.071558902303, 0d);
        tmpNode.getStateMember().add(newStateMember("S9", "Dining Room", tmpStatePosition, S9Transitions));
        // ----------------------- STATE 7
        List<TransitionType> S7Transitions = new ArrayList<TransitionType>();
        S7Transitions.add(newTransitionTypeReference("T013"));
        S7Transitions.add(newTransitionTypeReference("T014"));
        S7Transitions.add(newTransitionTypeReference("T015"));
        S7Transitions.add(newTransitionTypeReference("T057"));
        S7Transitions.add(newTransitionTypeReference("T078"));
        S7Transitions.add(newTransitionTypeReference("T050"));
        tmpStatePosition = newPointProperty("P7", "EPSG:4326", 23.556193510128, 46.071570972243, 0d);
        tmpNode.getStateMember().add(newStateMember("S7", "Hallway", tmpStatePosition, S7Transitions));
        // ----------------------- STATE 5
        List<TransitionType> s5Transitions = new ArrayList<TransitionType>();
        s5Transitions.add(newTransitionTypeReference("T075"));
        s5Transitions.add(newTransitionTypeReference("T035"));
        s5Transitions.add(newTransitionTypeReference("T045"));
        s5Transitions.add(newTransitionTypeReference("T065"));
        tmpStatePosition = newPointProperty("P5", "EPSG:4326", 23.5562299912, 46.0716058242, 0d);
        tmpNode.getStateMember().add(newStateMember("S5", "SAS", tmpStatePosition, s5Transitions));
        // ----------------------- STATE 575
        List<TransitionType> S575Transitions = new ArrayList<TransitionType>();
        S575Transitions.add(newTransitionTypeReference("T075"));
        S575Transitions.add(newTransitionTypeReference("T057"));
        tmpStatePosition = newPointProperty("P575", "EPSG:4326", 23.5562170335, 46.0715943479, 0d);
        tmpNode.getStateMember().add(newStateMember("S575", "HallwaySASDoor", tmpStatePosition, S575Transitions));
        // ----------------------- STATE 535
        List<TransitionType> s535Transitions = new ArrayList<TransitionType>();
        s535Transitions.add(newTransitionTypeReference("T035"));
        s535Transitions.add(newTransitionTypeReference("T053"));
        tmpStatePosition = newPointProperty("P535", "EPSG:4326", 23.5562290224, 46.0716119262, 0d);
        tmpNode.getStateMember().add(newStateMember("S535", "SASCleaningDoor", tmpStatePosition, s535Transitions));
        // ----------------------- STATE 3
        List<TransitionType> s3Transitions = new ArrayList<TransitionType>();
        s3Transitions.add(newTransitionTypeReference("T053"));
        tmpStatePosition = newPointProperty("P3", "EPSG:4326", 23.5562314854, 46.0716178174, 0d);
        tmpNode.getStateMember().add(newStateMember("S3", "Cleaning", tmpStatePosition, s3Transitions));
        // ----------------------- STATE 554
        List<TransitionType> s554Transitions = new ArrayList<TransitionType>();
        s554Transitions.add(newTransitionTypeReference("T045"));
        s554Transitions.add(newTransitionTypeReference("T054"));
        tmpStatePosition = newPointProperty("P554", "EPSG:4326", 23.5562520828, 46.0716030093, 0d);
        tmpNode.getStateMember().add(newStateMember("S554", "SASWasteDoor", tmpStatePosition, s554Transitions));
        // ----------------------- STATE 4
        List<TransitionType> s4Transitions = new ArrayList<TransitionType>();
        s4Transitions.add(newTransitionTypeReference("T054"));
        tmpStatePosition = newPointProperty("P4", "EPSG:4326", 23.5562698070, 46.0716047232, 0d);
        tmpNode.getStateMember().add(newStateMember("S4", "Waste", tmpStatePosition, s4Transitions));
        // ----------------------- STATE 556
        List<TransitionType> s556Transitions = new ArrayList<TransitionType>();
        s556Transitions.add(newTransitionTypeReference("T065"));
        s556Transitions.add(newTransitionTypeReference("T056"));
        tmpStatePosition = newPointProperty("P556", "EPSG:4326", 23.5562491100, 46.0715959627, 0d);
        tmpNode.getStateMember().add(newStateMember("S556", "SASMedicalWasteDoor", tmpStatePosition, s556Transitions));
        // ----------------------- STATE 6
        List<TransitionType> s6Transitions = new ArrayList<TransitionType>();
        s6Transitions.add(newTransitionTypeReference("T056"));
        tmpStatePosition = newPointProperty("P6", "EPSG:4326", 23.5562679375, 46.0715907879, 0d);
        tmpNode.getStateMember().add(newStateMember("S6", "MedicalWaste", tmpStatePosition, s6Transitions));
        // ----------------------- STATE 578
        List<TransitionType> s578Transitions = new ArrayList<TransitionType>();
        s578Transitions.add(newTransitionTypeReference("T078"));
        s578Transitions.add(newTransitionTypeReference("T058"));
        tmpStatePosition = newPointProperty("P578", "EPSG:4326", 23.5562189419, 46.0715783463, 0d);
        tmpNode.getStateMember().add(newStateMember("S578", "HallwayRegistryDoor", tmpStatePosition, s578Transitions));
        // ----------------------- STATE 8
        List<TransitionType> s8Transitions = new ArrayList<TransitionType>();
        s8Transitions.add(newTransitionTypeReference("T058"));
        tmpStatePosition = newPointProperty("P8", "EPSG:4326", 23.5562319868, 46.0715779683, 0d);
        tmpNode.getStateMember().add(newStateMember("S8", "Registry", tmpStatePosition, s8Transitions));
        // ----------------------- STATE 1000
        List<TransitionType> s1000Transitions = new ArrayList<TransitionType>();
        s1000Transitions.add(newTransitionTypeReference("T050"));
        tmpStatePosition = newPointProperty("P1000", "EPSG:4326", 23.5561959707, 46.0715554691, 0d);
        tmpNode.getStateMember().add(newStateMember("S1000", "AnchorNode", tmpStatePosition, s1000Transitions));
    }

    public void setGroundEdgesList(EdgesType tmpEdge, final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory) {
        LineStringType tmpTransitionLine;// PLACEHOLDER
        // ----------------------- TRANSITION 010
        List<StateType> t510States = new ArrayList<StateType>();
        t510States.add(newStateTypeReference(stateStairwellID));
        t510States.add(newStateTypeReference("S501"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS010", "EPSG:4326", new double[] { 23.556150930059, 23.556169705523 }, new double[] { 46.071584048012, 46.071571978071 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T010", 1d, tmpTransitionLine, t510States));

        // ----------------------- TRANSITION 012
        List<StateType> t512States = new ArrayList<StateType>();
        t512States.add(newStateTypeReference("S2"));
        t512States.add(newStateTypeReference("S502"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS012", "EPSG:4326", new double[] { 23.556200886202, 23.556196192337 }, new double[] { 46.071611540654, 46.071601482371 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T012", 1d, tmpTransitionLine, t512States));

        // ----------------------- TRANSITION 013
        List<StateType> t513States = new ArrayList<StateType>();
        t513States.add(newStateTypeReference("S7"));
        t513States.add(newStateTypeReference("S502"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS013", "EPSG:4326", new double[] { 23.556193510128, 23.556196192337 }, new double[] { 46.071570972243, 46.071601482371 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T013", 1d, tmpTransitionLine, t513States));
        // ----------------------- TRANSITION 014
        List<StateType> t514States = new ArrayList<StateType>();
        t514States.add(newStateTypeReference("S501"));
        t514States.add(newStateTypeReference("S7"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS014", "EPSG:4326", new double[] { 23.556169705523, 23.556193510128 }, new double[] { 46.071571978071, 46.071570972243 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T014", 1d, tmpTransitionLine, t514States));
        // ----------------------- TRANSITION 015
        List<StateType> t515States = new ArrayList<StateType>();
        t515States.add(newStateTypeReference("S510"));
        t515States.add(newStateTypeReference("S7"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS015", "EPSG:4326", new double[] { 23.556215638352, 23.556193510128 }, new double[] { 46.071569966415, 46.071570972243 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T015", 1d, tmpTransitionLine, t515States));
        // ----------------------- TRANSITION 016
        List<StateType> t516States = new ArrayList<StateType>();
        t516States.add(newStateTypeReference("S10"));
        t516States.add(newStateTypeReference("S510"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS016", "EPSG:4326", new double[] { 23.556222343874, 23.556215638352 }, new double[] { 46.071558567026, 46.071569966415 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T016", 1d, tmpTransitionLine, t516States));
        // ----------------------- TRANSITION 017
        List<StateType> t517States = new ArrayList<StateType>();
        t517States.add(newStateTypeReference("S509"));
        t517States.add(newStateTypeReference("S10"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS017", "EPSG:4326", new double[] { 23.556235754920, 23.556222343874 }, new double[] { 46.071566613653, 46.071558567026 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T017", 1d, tmpTransitionLine, t517States));
        // ----------------------- TRANSITION 018
        List<StateType> t518States = new ArrayList<StateType>();
        t518States.add(newStateTypeReference("S9"));
        t518States.add(newStateTypeReference("S509"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS018", "EPSG:4326", new double[] { 23.556254530383, 23.556235754920 }, new double[] { 46.071558902303, 46.071566613653 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T018", 1d, tmpTransitionLine, t518States));
        // ----------------------- TRANSITION 075
        List<StateType> tT575States = new ArrayList<StateType>();
        tT575States.add(newStateTypeReference("S5"));
        tT575States.add(newStateTypeReference("S575"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS075", "EPSG:4326", new double[] { 23.5562299912, 23.5562170335 }, new double[] { 46.0716058242, 46.0715943479 }, new double[] {
                0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T075", 1d, tmpTransitionLine, tT575States));
        // ----------------------- TRANSITION 035
        List<StateType> t535States = new ArrayList<StateType>();
        t535States.add(newStateTypeReference("S5"));
        t535States.add(newStateTypeReference("S535"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS035", "EPSG:4326", new double[] { 23.5562299912, 23.5562290224 }, new double[] { 46.0716058242, 46.0716119262 }, new double[] {
                0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T035", 1d, tmpTransitionLine, t535States));
        // ----------------------- TRANSITION 053
        List<StateType> t553States = new ArrayList<StateType>();
        t553States.add(newStateTypeReference("S3"));
        t553States.add(newStateTypeReference("S535"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS053", "EPSG:4326", new double[] { 23.5562314854, 23.5562290224 }, new double[] { 46.0716178174, 46.0716119262 }, new double[] {
                0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T053", 1d, tmpTransitionLine, t553States));
        // ----------------------- TRANSITION 045
        List<StateType> t545States = new ArrayList<StateType>();
        t545States.add(newStateTypeReference("S5"));
        t545States.add(newStateTypeReference("S554"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS045", "EPSG:4326", new double[] { 23.5562299912, 23.5562520828 }, new double[] { 46.0716058242, 46.0716030093 }, new double[] {
                0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T045", 1d, tmpTransitionLine, t545States));
        // ----------------------- TRANSITION 054
        List<StateType> t554States = new ArrayList<StateType>();
        t554States.add(newStateTypeReference("S554"));
        t554States.add(newStateTypeReference("S4"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS054", "EPSG:4326", new double[] { 23.5562520828, 23.5562698070 }, new double[] { 46.0716030093, 46.0716047232 }, new double[] {
                0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T054", 1d, tmpTransitionLine, t554States));
        // ----------------------- TRANSITION 065
        List<StateType> t565States = new ArrayList<StateType>();
        t565States.add(newStateTypeReference("S5"));
        t565States.add(newStateTypeReference("S556"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS065", "EPSG:4326", new double[] { 23.5562299912, 23.5562491100 }, new double[] { 46.0716058242, 46.0715959627 }, new double[] {
                0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T065", 1d, tmpTransitionLine, t565States));
        // ----------------------- TRANSITION 056
        List<StateType> t556States = new ArrayList<StateType>();
        t556States.add(newStateTypeReference("S556"));
        t556States.add(newStateTypeReference("S6"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS056", "EPSG:4326", new double[] { 23.5562491100, 23.5562679375 }, new double[] { 46.0715959627, 46.0715907879 }, new double[] {
                0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T056", 1d, tmpTransitionLine, t556States));
        // ----------------------- TRANSITION 058
        List<StateType> t558States = new ArrayList<StateType>();
        t558States.add(newStateTypeReference("S578"));
        t558States.add(newStateTypeReference("S8"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS058", "EPSG:4326", new double[] { 23.5562189419, 23.5562319868 }, new double[] { 46.0715783463, 46.0715779683 }, new double[] {
                0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T058", 1d, tmpTransitionLine, t558States));
        // ----------------------- TRANSITION 057
        List<StateType> t557States = new ArrayList<StateType>();
        t557States.add(newStateTypeReference("S575"));
        t557States.add(newStateTypeReference("S7"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS057", "EPSG:4326", new double[] { 23.5562170335, 23.556193510128 }, new double[] { 46.0715943479, 46.071570972243 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T057", 1d, tmpTransitionLine, t557States));
        // ----------------------- TRANSITION 078
        List<StateType> t578States = new ArrayList<StateType>();
        t578States.add(newStateTypeReference("S7"));
        t578States.add(newStateTypeReference("S578"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS078", "EPSG:4326", new double[] { 23.556193510128, 23.5562189419 }, new double[] { 46.071570972243, 46.0715783463 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T078", 1d, tmpTransitionLine, t578States));
        // ----------------------- TRANSITION 050
        List<StateType> t550States = new ArrayList<StateType>();
        t550States.add(newStateTypeReference("S7"));
        t550States.add(newStateTypeReference("S1000"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS050", "EPSG:4326", new double[] { 23.556193510128, 23.5561959707 }, new double[] { 46.071570972243, 46.0715554691 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T050", 1d, tmpTransitionLine, t550States));
    }

    public void setFirstNodesList(NodesType tmpNode) {
        PointPropertyType tmpStatePosition;// PLACEHOLDER
        // ----------------------- STATE 11
        List<TransitionType> S11Transitions = new ArrayList<TransitionType>();
        S11Transitions.add(newTransitionTypeReference("T110"));
        S11Transitions.add(newTransitionTypeReference("T001"));
        tmpStatePosition = newPointProperty("P11", "EPSG:4326", 23.556150930059, 46.071584048012, 1d);
        tmpNode.getStateMember().add(newStateMember("S11", "Stairwell", tmpStatePosition, S11Transitions));
        // ----------------------- STATE 601
        List<TransitionType> S601Transitions = new ArrayList<TransitionType>();
        S601Transitions.add(newTransitionTypeReference("T110"));
        S601Transitions.add(newTransitionTypeReference("T114"));
        tmpStatePosition = newPointProperty("P601", "EPSG:4326", 23.556169705523, 46.071571978071, 1d);
        tmpNode.getStateMember().add(newStateMember("S601", "DoorStairwell", tmpStatePosition, S601Transitions));
        // ----------------------- STATE 602
        List<TransitionType> S602Transitions = new ArrayList<TransitionType>();
        S602Transitions.add(newTransitionTypeReference("T112"));
        S602Transitions.add(newTransitionTypeReference("T113"));
        tmpStatePosition = newPointProperty("P602", "EPSG:4326", 23.556196192337, 46.071601482371, 1d);
        tmpNode.getStateMember().add(newStateMember("S602", "DoorElevator", tmpStatePosition, S602Transitions));
        // ----------------------- STATE 12
        List<TransitionType> S12Transitions = new ArrayList<TransitionType>();
        S12Transitions.add(newTransitionTypeReference("T112"));
        S12Transitions.add(newTransitionTypeReference("T002"));
        tmpStatePosition = newPointProperty("P12", "EPSG:4326", 23.556200886202, 46.071611540654, 1d);
        tmpNode.getStateMember().add(newStateMember("S12", "Elevator", tmpStatePosition, S12Transitions));
        // ----------------------- STATE 610
        List<TransitionType> S610Transitions = new ArrayList<TransitionType>();
        S610Transitions.add(newTransitionTypeReference("T115"));
        S610Transitions.add(newTransitionTypeReference("T116"));
        tmpStatePosition = newPointProperty("P610", "EPSG:4326", 23.556215638352, 46.071569966415, 1d);
        tmpNode.getStateMember().add(newStateMember("S610", "HallwaySASDoor", tmpStatePosition, S610Transitions));
        // ----------------------- STATE 20
        List<TransitionType> S20Transitions = new ArrayList<TransitionType>();
        S20Transitions.add(newTransitionTypeReference("T116"));
        S20Transitions.add(newTransitionTypeReference("T117"));
        tmpStatePosition = newPointProperty("P20", "EPSG:4326", 23.556222343874, 46.071558567026, 1d);
        tmpNode.getStateMember().add(newStateMember("S20", "SAS", tmpStatePosition, S20Transitions));
        // ----------------------- STATE 609
        List<TransitionType> S609Transitions = new ArrayList<TransitionType>();
        S609Transitions.add(newTransitionTypeReference("T117"));
        S609Transitions.add(newTransitionTypeReference("T118"));
        tmpStatePosition = newPointProperty("P609", "EPSG:4326", 23.556235754920, 46.071566613653, 1d);
        tmpNode.getStateMember().add(newStateMember("S609", "SASDiningRoomDoor", tmpStatePosition, S609Transitions));
        // ----------------------- STATE 19
        List<TransitionType> S19Transitions = new ArrayList<TransitionType>();
        S19Transitions.add(newTransitionTypeReference("T118"));
        tmpStatePosition = newPointProperty("P19", "EPSG:4326", 23.556254530383, 46.071558902303, 1d);
        tmpNode.getStateMember().add(newStateMember("S19", "Dining Room", tmpStatePosition, S19Transitions));
        // ----------------------- STATE 17
        List<TransitionType> S17Transitions = new ArrayList<TransitionType>();
        S17Transitions.add(newTransitionTypeReference("T113"));
        S17Transitions.add(newTransitionTypeReference("T114"));
        S17Transitions.add(newTransitionTypeReference("T115"));
        S17Transitions.add(newTransitionTypeReference("T157"));
        S17Transitions.add(newTransitionTypeReference("T178"));
        tmpStatePosition = newPointProperty("P17", "EPSG:4326", 23.556193510128, 46.071570972243, 1d);
        tmpNode.getStateMember().add(newStateMember("S17", "Hallway", tmpStatePosition, S17Transitions));
        // ----------------------- STATE 15
        List<TransitionType> s15Transitions = new ArrayList<TransitionType>();
        s15Transitions.add(newTransitionTypeReference("T175"));
        s15Transitions.add(newTransitionTypeReference("T135"));
        s15Transitions.add(newTransitionTypeReference("T145"));
        s15Transitions.add(newTransitionTypeReference("T165"));
        tmpStatePosition = newPointProperty("P15", "EPSG:4326", 23.5562299912, 46.0716058242, 1d);
        tmpNode.getStateMember().add(newStateMember("S15", "SAS", tmpStatePosition, s15Transitions));
        // ----------------------- STATE 675
        List<TransitionType> S675Transitions = new ArrayList<TransitionType>();
        S675Transitions.add(newTransitionTypeReference("T175"));
        S675Transitions.add(newTransitionTypeReference("T157"));
        tmpStatePosition = newPointProperty("P675", "EPSG:4326", 23.5562170335, 46.0715943479, 1d);
        tmpNode.getStateMember().add(newStateMember("S675", "HallwaySASDoor", tmpStatePosition, S675Transitions));
        // ----------------------- STATE 635
        List<TransitionType> s635Transitions = new ArrayList<TransitionType>();
        s635Transitions.add(newTransitionTypeReference("T135"));
        s635Transitions.add(newTransitionTypeReference("T153"));
        tmpStatePosition = newPointProperty("P635", "EPSG:4326", 23.5562290224, 46.0716119262, 1d);
        tmpNode.getStateMember().add(newStateMember("S635", "SASCleaningDoor", tmpStatePosition, s635Transitions));
        // ----------------------- STATE 13
        List<TransitionType> s13Transitions = new ArrayList<TransitionType>();
        s13Transitions.add(newTransitionTypeReference("T153"));
        tmpStatePosition = newPointProperty("P13", "EPSG:4326", 23.5562314854, 46.0716178174, 1d);
        tmpNode.getStateMember().add(newStateMember("S13", "Cleaning", tmpStatePosition, s13Transitions));
        // ----------------------- STATE 654
        List<TransitionType> s654Transitions = new ArrayList<TransitionType>();
        s654Transitions.add(newTransitionTypeReference("T145"));
        s654Transitions.add(newTransitionTypeReference("T154"));
        tmpStatePosition = newPointProperty("P654", "EPSG:4326", 23.5562520828, 46.0716030093, 1d);
        tmpNode.getStateMember().add(newStateMember("S654", "SASWasteDoor", tmpStatePosition, s654Transitions));
        // ----------------------- STATE 14
        List<TransitionType> s14Transitions = new ArrayList<TransitionType>();
        s14Transitions.add(newTransitionTypeReference("T154"));
        tmpStatePosition = newPointProperty("P14", "EPSG:4326", 23.5562698070, 46.0716047232, 1d);
        tmpNode.getStateMember().add(newStateMember("S14", "Waste", tmpStatePosition, s14Transitions));
        // ----------------------- STATE 656
        List<TransitionType> s656Transitions = new ArrayList<TransitionType>();
        s656Transitions.add(newTransitionTypeReference("T165"));
        s656Transitions.add(newTransitionTypeReference("T156"));
        tmpStatePosition = newPointProperty("P656", "EPSG:4326", 23.5562491100, 46.0715959627, 1d);
        tmpNode.getStateMember().add(newStateMember("S656", "SASMedicalWasteDoor", tmpStatePosition, s656Transitions));
        // ----------------------- STATE 16
        List<TransitionType> s16Transitions = new ArrayList<TransitionType>();
        s16Transitions.add(newTransitionTypeReference("T156"));
        tmpStatePosition = newPointProperty("P16", "EPSG:4326", 23.5562679375, 46.0715907879, 1d);
        tmpNode.getStateMember().add(newStateMember("S16", "MedicalWaste", tmpStatePosition, s16Transitions));
        // ----------------------- STATE 678
        List<TransitionType> s678Transitions = new ArrayList<TransitionType>();
        s678Transitions.add(newTransitionTypeReference("T178"));
        s678Transitions.add(newTransitionTypeReference("T158"));
        tmpStatePosition = newPointProperty("P678", "EPSG:4326", 23.5562189419, 46.0715783463, 1d);
        tmpNode.getStateMember().add(newStateMember("S678", "HallwayRegistryDoor", tmpStatePosition, s678Transitions));
        // ----------------------- STATE 18
        List<TransitionType> s18Transitions = new ArrayList<TransitionType>();
        s18Transitions.add(newTransitionTypeReference("T158"));
        tmpStatePosition = newPointProperty("P18", "EPSG:4326", 23.5562319868, 46.0715779683, 1d);
        tmpNode.getStateMember().add(newStateMember("S18", "Registry", tmpStatePosition, s18Transitions));
    }

    public void setFirstEdgesList(EdgesType tmpEdge, final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory) {
        LineStringType tmpTransitionLine;// PLACEHOLDER
        // ----------------------- TRANSITION 110
        List<StateType> t510States = new ArrayList<StateType>();
        t510States.add(newStateTypeReference("S11"));
        t510States.add(newStateTypeReference("S601"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS110", "EPSG:4326", new double[] { 23.556150930059, 23.556169705523 }, new double[] { 46.071584048012, 46.071571978071 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T110", 1d, tmpTransitionLine, t510States));

        // ----------------------- TRANSITION 112
        List<StateType> t512States = new ArrayList<StateType>();
        t512States.add(newStateTypeReference("S12"));
        t512States.add(newStateTypeReference("S602"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS112", "EPSG:4326", new double[] { 23.556200886202, 23.556196192337 }, new double[] { 46.071611540654, 46.071601482371 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T112", 1d, tmpTransitionLine, t512States));

        // ----------------------- TRANSITION 113
        List<StateType> t513States = new ArrayList<StateType>();
        t513States.add(newStateTypeReference("S17"));
        t513States.add(newStateTypeReference("S602"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS113", "EPSG:4326", new double[] { 23.556193510128, 23.556196192337 }, new double[] { 46.071570972243, 46.071601482371 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T113", 1d, tmpTransitionLine, t513States));
        // ----------------------- TRANSITION 114
        List<StateType> t514States = new ArrayList<StateType>();
        t514States.add(newStateTypeReference("S601"));
        t514States.add(newStateTypeReference("S17"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS114", "EPSG:4326", new double[] { 23.556169705523, 23.556193510128 }, new double[] { 46.071571978071, 46.071570972243 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T114", 1d, tmpTransitionLine, t514States));
        // ----------------------- TRANSITION 115
        List<StateType> t515States = new ArrayList<StateType>();
        t515States.add(newStateTypeReference("S610"));
        t515States.add(newStateTypeReference("S17"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS115", "EPSG:4326", new double[] { 23.556215638352, 23.556193510128 }, new double[] { 46.071569966415, 46.071570972243 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T115", 1d, tmpTransitionLine, t515States));
        // ----------------------- TRANSITION 116
        List<StateType> t516States = new ArrayList<StateType>();
        t516States.add(newStateTypeReference("S20"));
        t516States.add(newStateTypeReference("S610"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS116", "EPSG:4326", new double[] { 23.556222343874, 23.556215638352 }, new double[] { 46.071558567026, 46.071569966415 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T116", 1d, tmpTransitionLine, t516States));
        // ----------------------- TRANSITION 117
        List<StateType> t517States = new ArrayList<StateType>();
        t517States.add(newStateTypeReference("S609"));
        t517States.add(newStateTypeReference("S20"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS117", "EPSG:4326", new double[] { 23.556235754920, 23.556222343874 }, new double[] { 46.071566613653, 46.071558567026 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T117", 1d, tmpTransitionLine, t517States));
        // ----------------------- TRANSITION 118
        List<StateType> t518States = new ArrayList<StateType>();
        t518States.add(newStateTypeReference("S19"));
        t518States.add(newStateTypeReference("S609"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS118", "EPSG:4326", new double[] { 23.556254530383, 23.556235754920 }, new double[] { 46.071558902303, 46.071566613653 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T118", 1d, tmpTransitionLine, t518States));
        // ----------------------- TRANSITION 175
        List<StateType> tT575States = new ArrayList<StateType>();
        tT575States.add(newStateTypeReference("S15"));
        tT575States.add(newStateTypeReference("S675"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS175", "EPSG:4326", new double[] { 23.5562299912, 23.5562170335 }, new double[] { 46.0716058242, 46.0715943479 }, new double[] {
                1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T175", 1d, tmpTransitionLine, tT575States));
        // ----------------------- TRANSITION 135
        List<StateType> t535States = new ArrayList<StateType>();
        t535States.add(newStateTypeReference("S15"));
        t535States.add(newStateTypeReference("S635"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS135", "EPSG:4326", new double[] { 23.5562299912, 23.5562290224 }, new double[] { 46.0716058242, 46.0716119262 }, new double[] {
                1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T135", 1d, tmpTransitionLine, t535States));
        // ----------------------- TRANSITION 153
        List<StateType> t553States = new ArrayList<StateType>();
        t553States.add(newStateTypeReference("S13"));
        t553States.add(newStateTypeReference("S635"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS153", "EPSG:4326", new double[] { 23.5562314854, 23.5562290224 }, new double[] { 46.0716178174, 46.0716119262 }, new double[] {
                1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T153", 1d, tmpTransitionLine, t553States));
        // ----------------------- TRANSITION 145
        List<StateType> t545States = new ArrayList<StateType>();
        t545States.add(newStateTypeReference("S15"));
        t545States.add(newStateTypeReference("S654"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS145", "EPSG:4326", new double[] { 23.5562299912, 23.5562520828 }, new double[] { 46.0716058242, 46.0716030093 }, new double[] {
                1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T145", 1d, tmpTransitionLine, t545States));
        // ----------------------- TRANSITION 154
        List<StateType> t554States = new ArrayList<StateType>();
        t554States.add(newStateTypeReference("S654"));
        t554States.add(newStateTypeReference("S14"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS154", "EPSG:4326", new double[] { 23.5562520828, 23.5562698070 }, new double[] { 46.0716030093, 46.0716047232 }, new double[] {
                1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T154", 1d, tmpTransitionLine, t554States));
        // ----------------------- TRANSITION 165
        List<StateType> t565States = new ArrayList<StateType>();
        t565States.add(newStateTypeReference("S15"));
        t565States.add(newStateTypeReference("S656"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS165", "EPSG:4326", new double[] { 23.5562299912, 23.5562491100 }, new double[] { 46.0716058242, 46.0715959627 }, new double[] {
                1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T165", 1d, tmpTransitionLine, t565States));
        // ----------------------- TRANSITION 156
        List<StateType> t556States = new ArrayList<StateType>();
        t556States.add(newStateTypeReference("S656"));
        t556States.add(newStateTypeReference("S16"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS156", "EPSG:4326", new double[] { 23.5562491100, 23.5562679375 }, new double[] { 46.0715959627, 46.0715907879 }, new double[] {
                1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T156", 1d, tmpTransitionLine, t556States));
        // ----------------------- TRANSITION 158
        List<StateType> t558States = new ArrayList<StateType>();
        t558States.add(newStateTypeReference("S678"));
        t558States.add(newStateTypeReference("S18"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS158", "EPSG:4326", new double[] { 23.5562189419, 23.5562319868 }, new double[] { 46.0715783463, 46.0715779683 }, new double[] {
                1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T158", 1d, tmpTransitionLine, t558States));
        // ----------------------- TRANSITION 157
        List<StateType> t557States = new ArrayList<StateType>();
        t557States.add(newStateTypeReference("S675"));
        t557States.add(newStateTypeReference("S17"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS157", "EPSG:4326", new double[] { 23.5562170335, 23.556193510128 }, new double[] { 46.0715943479, 46.071570972243 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T157", 1d, tmpTransitionLine, t557States));
        // ----------------------- TRANSITION 178
        List<StateType> t578States = new ArrayList<StateType>();
        t578States.add(newStateTypeReference("S17"));
        t578States.add(newStateTypeReference("S678"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS178", "EPSG:4326", new double[] { 23.556193510128, 23.5562189419 }, new double[] { 46.071570972243, 46.0715783463 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T178", 1d, tmpTransitionLine, t578States));
    }

    public void setInterFloorEdgesList(EdgesType tmpEdge, final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory) {
        LineStringType tmpTransitionLine;// PLACEHOLDER
        // ----------------------- TRANSITION 001
        List<StateType> stairwellLinkStates = new ArrayList<StateType>();
        stairwellLinkStates.add(newStateTypeReference("S1"));
        stairwellLinkStates.add(newStateTypeReference("S11"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS001", "EPSG:4326", new double[] { 23.556150930059, 23.556150930059 }, new double[] { 46.071584048012, 46.071584048012 },
            new double[] { 0d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T001", 2d, tmpTransitionLine, stairwellLinkStates));
        // ----------------------- TRANSITION 002
        List<StateType> elevatorLinkStates = new ArrayList<StateType>();
        elevatorLinkStates.add(newStateTypeReference("S2"));
        elevatorLinkStates.add(newStateTypeReference("S12"));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS002", "EPSG:4326", new double[] { 23.556200886202, 23.556200886202 }, new double[] { 46.071611540654, 46.071611540654 },
            new double[] { 0d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T002", 2d, tmpTransitionLine, elevatorLinkStates));
    }

    public TransitionType newTransitionTypeReference(String transitionID) {
        TransitionType tmpTrans = new TransitionType();
        tmpTrans.setId(transitionID + "_" + TRANSITIONREFERENCEID_SEQUENCE++);
        tmpTrans.setHref("#" + transitionID);
        return tmpTrans;
    }

    public StateMemberType newStateMember(String stateId, String roomName, PointPropertyType statePosition, List<TransitionType> connectedTransitions) {
        StateMemberType stMemb = new StateMemberType();
        // -------STATE TYPE
        StateType tmpState = new StateType();
        stMemb.setState(tmpState);
        tmpState.setId(stateId);
        StringOrRefType sort = new StringOrRefType();
        sort.setValue(roomName);
        tmpState.setDescription(sort);
        // ------GEOMETRY
        tmpState.setGeometry(statePosition);
        // ------CONNECTS
        TransitionPropertyType tmpTransProp;
        for (TransitionType tmpTransition : connectedTransitions) {
            if (null != tmpTransition) {
                tmpTransProp = new TransitionPropertyType();
                tmpTransProp.setTransition(tmpTransition);
                // IT IS POSSIBLE TO ADD AS A REFERENCE THE ID OF THE TRANSITION BUT IT WILL BE PUT INSIDE THE TRANSITION ITSELF AND NOT AS ATTRIBUTE!
                // PriorityLocationPropertyType loc = new PriorityLocationPropertyType();
                // loc.setHref("#T510");
                // tmpTrans.setLocation(_gmlObjectFactory.createPriorityLocation(loc));
                tmpState.getConnects().add(tmpTransProp);
            }
        }
        return stMemb;
    }

    public PointPropertyType newPointProperty(String pointID, String pointSrsName, double pointX, double pointY, double pointZ) {
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

    public StateType newStateTypeReference(String stateID) {
        StateType st = new StateType();
        st.setId(stateID + "_" + STATEREFERENCEID_SEQUENCE++);
        st.setHref("#" + stateID);
        return st;
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

    public static void marshallData(IndoorFeaturesType ifs) throws JAXBException {
        File file = new File("indoorExample.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(IndoorFeaturesType.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        try {
            jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new IndoorGMLNamespaceMapper());
        } catch (PropertyException e) {
            // In case another JAXB implementation is used
            e.printStackTrace();
        }
        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(ifs, file);
        jaxbMarshaller.marshal(ifs, System.out);
    }

    public static IndoorFeaturesType unmarshall() throws JAXBException, SAXException, FileNotFoundException {

        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File("indoorgmlcore.xsd"));

        JAXBContext jc = JAXBContext.newInstance(IndoorFeaturesType.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        unmarshaller.setSchema(schema);
     // create new source
        FileInputStream fis = new FileInputStream("indoorExample.xml");
        StreamSource src = new StreamSource();
        src.setInputStream(fis);
        IndoorFeaturesType customer = unmarshaller.unmarshal(src,IndoorFeaturesType.class).getValue();
        return customer;
    }

    public static <T extends Object> T unmarshal(String xmlDefinition, Schema schema, Class<T> type) {
        // check input
        if (null == xmlDefinition || xmlDefinition.trim().isEmpty() || null == type) {
            return null;
        }
        try {
            // configure JAXB context
            JAXBContext context = JAXBContext.newInstance(type.getPackage().getName());

            // instance unmarshaller
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // sets schema if provide
            if (null != schema) {
                unmarshaller.setSchema(schema);
            }

            // wrap input on reader
            StringReader reader = new StringReader(xmlDefinition);

            // build jaxb element
            JAXBElement<T> jaxbElement = (JAXBElement<T>) unmarshaller.unmarshal(new StreamSource(reader), type);

            // get content
            return jaxbElement.getValue();
        } catch (Exception e) {
            System.err.println("XMLPersistenceUtils.unmarshal: Unable to unmarshal provide definition '" + xmlDefinition + "'.");
        }
        // default error
        return null;
    }

}
