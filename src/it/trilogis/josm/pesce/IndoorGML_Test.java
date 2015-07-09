/**
 * 
 */
package it.trilogis.josm.pesce;

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
import net.opengis.gml.v_3_2_1.CodeType;
import net.opengis.gml.v_3_2_1.CurvePropertyType;
import net.opengis.gml.v_3_2_1.DirectPositionType;
import net.opengis.gml.v_3_2_1.FeaturePropertyType;
import net.opengis.gml.v_3_2_1.LineStringType;
import net.opengis.gml.v_3_2_1.PointPropertyType;
import net.opengis.gml.v_3_2_1.PointType;
import net.opengis.gml.v_3_2_1.StringOrRefType;
import net.opengis.indoorgml.v_1_0.core.CellSpaceMemberType;
import net.opengis.indoorgml.v_1_0.core.CellSpacePropertyType;
import net.opengis.indoorgml.v_1_0.core.CellSpaceType;
import net.opengis.indoorgml.v_1_0.core.EdgesType;
import net.opengis.indoorgml.v_1_0.core.ExternalObjectReferenceType;
import net.opengis.indoorgml.v_1_0.core.ExternalReferenceType;
import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;
import net.opengis.indoorgml.v_1_0.core.MultiLayeredGraphType;
import net.opengis.indoorgml.v_1_0.core.NodesType;
import net.opengis.indoorgml.v_1_0.core.PrimalSpaceFeaturesPropertyType;
import net.opengis.indoorgml.v_1_0.core.PrimalSpaceFeaturesType;
import net.opengis.indoorgml.v_1_0.core.SpaceLayerClassType;
import net.opengis.indoorgml.v_1_0.core.SpaceLayerMemberType;
import net.opengis.indoorgml.v_1_0.core.SpaceLayerType;
import net.opengis.indoorgml.v_1_0.core.SpaceLayersType;
import net.opengis.indoorgml.v_1_0.core.StateMemberType;
import net.opengis.indoorgml.v_1_0.core.StatePropertyType;
import net.opengis.indoorgml.v_1_0.core.StateType;
import net.opengis.indoorgml.v_1_0.core.TransitionMemberType;
import net.opengis.indoorgml.v_1_0.core.TransitionPropertyType;
import net.opengis.indoorgml.v_1_0.core.TransitionType;
import net.opengis.indoorgml.v_1_0.core.TypeOfNavigationGraphEnumerationType;
import net.opengis.indoorgml.v_1_0.core.TypeOfTransitionEnumerationType;
import org.xml.sax.SAXException;

/**
 * @author Nicola Dorigatti
 */
public class IndoorGML_Test {

    public static int           TRANSITIONREFERENCEID_SEQUENCE = 0;
    public static int           STATEREFERENCEID_SEQUENCE      = 0;

    // Prefixes
    private static final String WHEELCHAIR_PREFIX              = "WH";
    private static final String WALKING_PREFIX                 = "WA";

    //
    final static String         stateStairwellID               = "S1";

    public static void main(String[] args) {
        new IndoorGML_Test();
    }

    /**
     * 
     */
    public IndoorGML_Test() {
        // TODO Auto-generated constructor stub
        final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory = new net.opengis.gml.v_3_2_1.ObjectFactory();
        final net.opengis.indoorgml.v_1_0.core.ObjectFactory _igmlObjectFactory = new net.opengis.indoorgml.v_1_0.core.ObjectFactory();

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
        slst.getSpaceLayerMember().add(getWalkingGraph(_gmlObjectFactory, WALKING_PREFIX));

        slst.getSpaceLayerMember().add(getWheelchairGraph(_gmlObjectFactory, WHEELCHAIR_PREFIX));

        // =========================== PRIMAL SPACE MAPPINGS
        PrimalSpaceFeaturesPropertyType pSpaceFeatures = new PrimalSpaceFeaturesPropertyType();
        root.setPrimalSpaceFeatures(pSpaceFeatures);
        PrimalSpaceFeaturesType primSpaceFeaturesType = new PrimalSpaceFeaturesType();
        primSpaceFeaturesType.setId("PS1");
        pSpaceFeatures.setPrimalSpaceFeatures(primSpaceFeaturesType);
        CellSpaceMemberType cellSpMembType = new CellSpaceMemberType();
        CellSpaceType anchorCellSpace = new CellSpaceType();
        anchorCellSpace.setId("AS1");
        CodeType anchorCellName = new CodeType();
        anchorCellName.setValue("Entrance Door");
        anchorCellSpace.getName().add(anchorCellName);
        StatePropertyType statePropType = new StatePropertyType();
        statePropType.setHref(newStateTypeReferenceString("S1000", ""));// TODO!!
        anchorCellSpace.setDuality(statePropType);
        ExternalReferenceType externalReference = new ExternalReferenceType();
        externalReference.setInformationSystem("test");// TODO
        ExternalObjectReferenceType extObjreftype = new ExternalObjectReferenceType();
        extObjreftype.setName("t2");
        externalReference.setExternalObject(extObjreftype);
        anchorCellSpace.getExternalReference().add(externalReference);
        cellSpMembType.setCellSpace(_igmlObjectFactory.createCellSpace(anchorCellSpace));
        FeaturePropertyType cellFeatureProperty = new FeaturePropertyType();
        cellFeatureProperty.setAbstractFeature(_gmlObjectFactory.createAbstractFeature(anchorCellSpace));

        // primSpaceFeaturesType.getCellSpaceMember().add(cellFeatureProperty);
        primSpaceFeaturesType.getCellSpaceMember().add(cellSpMembType);

        try {
            IndoorGML_Test.marshallData(root);

            // validate
            IndoorFeaturesType customer = IndoorGML_Test.unmarshall();
            System.out.println("TEST " + customer.getId());
        } catch (JAXBException | SAXException | FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // ======================== THESE BOOTS ARE MADE FOR WALKING ==================

    public SpaceLayerMemberType getWalkingGraph(net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory, String idPrefix) {
        // ----SPACE LAYER TYPE WALKING
        SpaceLayerMemberType spaceLayerMember = new SpaceLayerMemberType();

        SpaceLayerType spaceLayerType = new SpaceLayerType();
        spaceLayerType.setClazz(SpaceLayerClassType.LOGICAL);
        spaceLayerType.setNavigationType(TypeOfNavigationGraphEnumerationType.WALK);
        spaceLayerMember.setSpaceLayer(spaceLayerType);
        spaceLayerType.setId("walking");

        // ========================================== ADD NODES(STATES)!!!!
        // -----NODES
        List<NodesType> nodes = spaceLayerType.getNodes();
        NodesType tmpNode = new NodesType();
        tmpNode.setId("Nodes" + idPrefix);
        nodes.add(tmpNode);
        // ------ STATES
        setWalkGroundNodesList(tmpNode, idPrefix);// XXX GROUND FLOOR
        setWalkFirstNodesList(tmpNode, idPrefix); // XXX FIRST FLOOR

        // ========================================== NOW ADD EDGES(TRANSITIONS)!!!!
        // -----EDGES
        List<EdgesType> edges = spaceLayerType.getEdges();
        EdgesType tmpEdge = new EdgesType();
        tmpEdge.setId("Edges" + idPrefix);
        edges.add(tmpEdge);
        setWalkGroundEdgesList(tmpEdge, idPrefix, _gmlObjectFactory);// XXX GROUND FLOOR
        setWalkFirstEdgesList(tmpEdge, idPrefix, _gmlObjectFactory);// XXX FIRST FLOOR
        setWalkInterFloorEdgesList(tmpEdge, idPrefix, _gmlObjectFactory);
        // -------------------------
        return spaceLayerMember;
    }

    public void setWalkGroundNodesList(NodesType tmpNode, String idPrefix) {
        PointPropertyType tmpStatePosition;// PLACEHOLDER
        // ----------------------- STATE 1
        List<String> S1Transitions = new ArrayList<String>();
        S1Transitions.add(newTransitionTypeReferenceString("T010", idPrefix));
        S1Transitions.add(newTransitionTypeReferenceString("T001", idPrefix));
        tmpStatePosition = newPointProperty("P1", idPrefix, "EPSG:4326", 23.556150930059, 46.071584048012, 0d);
        tmpNode.getStateMember().add(newStateMember(stateStairwellID, idPrefix, "Stairwell", tmpStatePosition, S1Transitions));
        // ----------------------- STATE 501
        List<String> S501Transitions = new ArrayList<String>();
        S501Transitions.add(newTransitionTypeReferenceString("T010", idPrefix));
        S501Transitions.add(newTransitionTypeReferenceString("T014", idPrefix));
        tmpStatePosition = newPointProperty("P501", idPrefix, "EPSG:4326", 23.556169705523, 46.071571978071, 0d);
        tmpNode.getStateMember().add(newStateMember("S501", idPrefix, "DoorStairwell", tmpStatePosition, S501Transitions, true));
        // ----------------------- STATE 502
        List<String> S502Transitions = new ArrayList<String>();
        S502Transitions.add(newTransitionTypeReferenceString("T012", idPrefix));
        S502Transitions.add(newTransitionTypeReferenceString("T013", idPrefix));
        tmpStatePosition = newPointProperty("P502", idPrefix, "EPSG:4326", 23.556196192337, 46.071601482371, 0d);
        tmpNode.getStateMember().add(newStateMember("S502", idPrefix, "DoorElevator", tmpStatePosition, S502Transitions, true));
        // ----------------------- STATE 2
        List<String> S2Transitions = new ArrayList<String>();
        S2Transitions.add(newTransitionTypeReferenceString("T012", idPrefix));
        S2Transitions.add(newTransitionTypeReferenceString("T002", idPrefix));
        tmpStatePosition = newPointProperty("P2", idPrefix, "EPSG:4326", 23.556200886202, 46.071611540654, 0d);
        tmpNode.getStateMember().add(newStateMember("S2", idPrefix, "Elevator", tmpStatePosition, S2Transitions));
        // ----------------------- STATE 510
        List<String> S510Transitions = new ArrayList<String>();
        S510Transitions.add(newTransitionTypeReferenceString("T015", idPrefix));
        S510Transitions.add(newTransitionTypeReferenceString("T016", idPrefix));
        tmpStatePosition = newPointProperty("P510", idPrefix, "EPSG:4326", 23.556215638352, 46.071569966415, 0d);
        tmpNode.getStateMember().add(newStateMember("S510", idPrefix, "HallwaySASDoor", tmpStatePosition, S510Transitions, true));
        // ----------------------- STATE 10
        List<String> S10Transitions = new ArrayList<String>();
        S10Transitions.add(newTransitionTypeReferenceString("T016", idPrefix));
        S10Transitions.add(newTransitionTypeReferenceString("T017", idPrefix));
        tmpStatePosition = newPointProperty("P10", idPrefix, "EPSG:4326", 23.556222343874, 46.071558567026, 0d);
        tmpNode.getStateMember().add(newStateMember("S10", idPrefix, "SAS", tmpStatePosition, S10Transitions));
        // ----------------------- STATE 509
        List<String> S509Transitions = new ArrayList<String>();
        S509Transitions.add(newTransitionTypeReferenceString("T017", idPrefix));
        S509Transitions.add(newTransitionTypeReferenceString("T018", idPrefix));
        tmpStatePosition = newPointProperty("P509", idPrefix, "EPSG:4326", 23.556235754920, 46.071566613653, 0d);
        tmpNode.getStateMember().add(newStateMember("S509", idPrefix, "SASDiningRoomDoor", tmpStatePosition, S509Transitions, true));
        // ----------------------- STATE 9
        List<String> S9Transitions = new ArrayList<String>();
        S9Transitions.add(newTransitionTypeReferenceString("T018", idPrefix));
        tmpStatePosition = newPointProperty("P9", idPrefix, "EPSG:4326", 23.556254530383, 46.071558902303, 0d);
        tmpNode.getStateMember().add(newStateMember("S9", idPrefix, "Dining Room", tmpStatePosition, S9Transitions));
        // ----------------------- STATE 7
        List<String> S7Transitions = new ArrayList<String>();
        S7Transitions.add(newTransitionTypeReferenceString("T013", idPrefix));
        S7Transitions.add(newTransitionTypeReferenceString("T014", idPrefix));
        S7Transitions.add(newTransitionTypeReferenceString("T015", idPrefix));
        S7Transitions.add(newTransitionTypeReferenceString("T057", idPrefix));
        S7Transitions.add(newTransitionTypeReferenceString("T078", idPrefix));
        S7Transitions.add(newTransitionTypeReferenceString("T050", idPrefix));
        tmpStatePosition = newPointProperty("P7", idPrefix, "EPSG:4326", 23.556193510128, 46.071570972243, 0d);
        tmpNode.getStateMember().add(newStateMember("S7", idPrefix, "Hallway", tmpStatePosition, S7Transitions));
        // ----------------------- STATE 5
        List<String> s5Transitions = new ArrayList<String>();
        s5Transitions.add(newTransitionTypeReferenceString("T075", idPrefix));
        s5Transitions.add(newTransitionTypeReferenceString("T035", idPrefix));
        s5Transitions.add(newTransitionTypeReferenceString("T045", idPrefix));
        s5Transitions.add(newTransitionTypeReferenceString("T065", idPrefix));
        tmpStatePosition = newPointProperty("P5", idPrefix, "EPSG:4326", 23.5562299912, 46.0716058242, 0d);
        tmpNode.getStateMember().add(newStateMember("S5", idPrefix, "SAS", tmpStatePosition, s5Transitions));
        // ----------------------- STATE 575
        List<String> S575Transitions = new ArrayList<String>();
        S575Transitions.add(newTransitionTypeReferenceString("T075", idPrefix));
        S575Transitions.add(newTransitionTypeReferenceString("T057", idPrefix));
        tmpStatePosition = newPointProperty("P575", idPrefix, "EPSG:4326", 23.5562170335, 46.0715943479, 0d);
        tmpNode.getStateMember().add(newStateMember("S575", idPrefix, "HallwaySASDoor", tmpStatePosition, S575Transitions, true));
        // ----------------------- STATE 535
        List<String> s535Transitions = new ArrayList<String>();
        s535Transitions.add(newTransitionTypeReferenceString("T035", idPrefix));
        s535Transitions.add(newTransitionTypeReferenceString("T053", idPrefix));
        tmpStatePosition = newPointProperty("P535", idPrefix, "EPSG:4326", 23.5562290224, 46.0716119262, 0d);
        tmpNode.getStateMember().add(newStateMember("S535", idPrefix, "SASCleaningDoor", tmpStatePosition, s535Transitions, true));
        // ----------------------- STATE 3
        List<String> s3Transitions = new ArrayList<String>();
        s3Transitions.add(newTransitionTypeReferenceString("T053", idPrefix));
        tmpStatePosition = newPointProperty("P3", idPrefix, "EPSG:4326", 23.5562314854, 46.0716178174, 0d);
        tmpNode.getStateMember().add(newStateMember("S3", idPrefix, "Cleaning", tmpStatePosition, s3Transitions));
        // ----------------------- STATE 554
        List<String> s554Transitions = new ArrayList<String>();
        s554Transitions.add(newTransitionTypeReferenceString("T045", idPrefix));
        s554Transitions.add(newTransitionTypeReferenceString("T054", idPrefix));
        tmpStatePosition = newPointProperty("P554", idPrefix, "EPSG:4326", 23.5562520828, 46.0716030093, 0d);
        tmpNode.getStateMember().add(newStateMember("S554", idPrefix, "SASWasteDoor", tmpStatePosition, s554Transitions, true));
        // ----------------------- STATE 4
        List<String> s4Transitions = new ArrayList<String>();
        s4Transitions.add(newTransitionTypeReferenceString("T054", idPrefix));
        tmpStatePosition = newPointProperty("P4", idPrefix, "EPSG:4326", 23.5562698070, 46.0716047232, 0d);
        tmpNode.getStateMember().add(newStateMember("S4", idPrefix, "Waste", tmpStatePosition, s4Transitions));
        // ----------------------- STATE 556
        List<String> s556Transitions = new ArrayList<String>();
        s556Transitions.add(newTransitionTypeReferenceString("T065", idPrefix));
        s556Transitions.add(newTransitionTypeReferenceString("T056", idPrefix));
        tmpStatePosition = newPointProperty("P556", idPrefix, "EPSG:4326", 23.5562491100, 46.0715959627, 0d);
        tmpNode.getStateMember().add(newStateMember("S556", idPrefix, "SASMedicalWasteDoor", tmpStatePosition, s556Transitions, true));
        // ----------------------- STATE 6
        List<String> s6Transitions = new ArrayList<String>();
        s6Transitions.add(newTransitionTypeReferenceString("T056", idPrefix));
        tmpStatePosition = newPointProperty("P6", idPrefix, "EPSG:4326", 23.5562679375, 46.0715907879, 0d);
        tmpNode.getStateMember().add(newStateMember("S6", idPrefix, "MedicalWaste", tmpStatePosition, s6Transitions));
        // ----------------------- STATE 578
        List<String> s578Transitions = new ArrayList<String>();
        s578Transitions.add(newTransitionTypeReferenceString("T078", idPrefix));
        s578Transitions.add(newTransitionTypeReferenceString("T058", idPrefix));
        tmpStatePosition = newPointProperty("P578", idPrefix, "EPSG:4326", 23.5562189419, 46.0715783463, 0d);
        tmpNode.getStateMember().add(newStateMember("S578", idPrefix, "HallwayRegistryDoor", tmpStatePosition, s578Transitions, true));
        // ----------------------- STATE 8
        List<String> s8Transitions = new ArrayList<String>();
        s8Transitions.add(newTransitionTypeReferenceString("T058", idPrefix));
        tmpStatePosition = newPointProperty("P8", idPrefix, "EPSG:4326", 23.5562319868, 46.0715779683, 0d);
        tmpNode.getStateMember().add(newStateMember("S8", idPrefix, "Registry", tmpStatePosition, s8Transitions));
        // ----------------------- STATE 1000
        List<String> s1000Transitions = new ArrayList<String>();
        s1000Transitions.add(newTransitionTypeReferenceString("T050", idPrefix));
        tmpStatePosition = newPointProperty("P1000", idPrefix, "EPSG:4326", 23.5561959707, 46.0715554691, 0d);
        StateMemberType anchorNodeSM = newStateMember("S1000", idPrefix, "AnchorNode", tmpStatePosition, s1000Transitions, true, true);
        CellSpacePropertyType cspt = new CellSpacePropertyType();
        cspt.setHref("#AS1");
        anchorNodeSM.getState().setDuality(cspt);
        tmpNode.getStateMember().add(anchorNodeSM);
    }

    public void setWalkGroundEdgesList(EdgesType tmpEdge, String idPrefix, final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory) {
        LineStringType tmpTransitionLine;// PLACEHOLDER
        // ----------------------- TRANSITION 010
        List<String> t510States = new ArrayList<String>();
        t510States.add(newStateTypeReferenceString(stateStairwellID, idPrefix));
        t510States.add(newStateTypeReferenceString("S501", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS010", idPrefix, "EPSG:4326", new double[] { 23.556150930059, 23.556169705523 },
            new double[] { 46.071584048012, 46.071571978071 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T010", idPrefix, 1d, tmpTransitionLine, t510States));

        // ----------------------- TRANSITION 012
        List<String> t512States = new ArrayList<String>();
        t512States.add(newStateTypeReferenceString("S2", idPrefix));
        t512States.add(newStateTypeReferenceString("S502", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS012", idPrefix, "EPSG:4326", new double[] { 23.556200886202, 23.556196192337 },
            new double[] { 46.071611540654, 46.071601482371 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T012", idPrefix, 1d, tmpTransitionLine, t512States));

        // ----------------------- TRANSITION 013
        List<String> t513States = new ArrayList<String>();
        t513States.add(newStateTypeReferenceString("S7", idPrefix));
        t513States.add(newStateTypeReferenceString("S502", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS013", idPrefix, "EPSG:4326", new double[] { 23.556193510128, 23.556196192337 },
            new double[] { 46.071570972243, 46.071601482371 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T013", idPrefix, 1d, tmpTransitionLine, t513States));
        // ----------------------- TRANSITION 014
        List<String> t514States = new ArrayList<String>();
        t514States.add(newStateTypeReferenceString("S501", idPrefix));
        t514States.add(newStateTypeReferenceString("S7", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS014", idPrefix, "EPSG:4326", new double[] { 23.556169705523, 23.556193510128 },
            new double[] { 46.071571978071, 46.071570972243 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T014", idPrefix, 1d, tmpTransitionLine, t514States));
        // ----------------------- TRANSITION 015
        List<String> t515States = new ArrayList<String>();
        t515States.add(newStateTypeReferenceString("S510", idPrefix));
        t515States.add(newStateTypeReferenceString("S7", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS015", idPrefix, "EPSG:4326", new double[] { 23.556215638352, 23.556193510128 },
            new double[] { 46.071569966415, 46.071570972243 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T015", idPrefix, 1d, tmpTransitionLine, t515States));
        // ----------------------- TRANSITION 016
        List<String> t516States = new ArrayList<String>();
        t516States.add(newStateTypeReferenceString("S10", idPrefix));
        t516States.add(newStateTypeReferenceString("S510", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS016", idPrefix, "EPSG:4326", new double[] { 23.556222343874, 23.556215638352 },
            new double[] { 46.071558567026, 46.071569966415 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T016", idPrefix, 1d, tmpTransitionLine, t516States));
        // ----------------------- TRANSITION 017
        List<String> t517States = new ArrayList<String>();
        t517States.add(newStateTypeReferenceString("S509", idPrefix));
        t517States.add(newStateTypeReferenceString("S10", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS017", idPrefix, "EPSG:4326", new double[] { 23.556235754920, 23.556222343874 },
            new double[] { 46.071566613653, 46.071558567026 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T017", idPrefix, 1d, tmpTransitionLine, t517States));
        // ----------------------- TRANSITION 018
        List<String> t518States = new ArrayList<String>();
        t518States.add(newStateTypeReferenceString("S9", idPrefix));
        t518States.add(newStateTypeReferenceString("S509", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS018", idPrefix, "EPSG:4326", new double[] { 23.556254530383, 23.556235754920 },
            new double[] { 46.071558902303, 46.071566613653 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T018", idPrefix, 1d, tmpTransitionLine, t518States));
        // ----------------------- TRANSITION 075
        List<String> tT575States = new ArrayList<String>();
        tT575States.add(newStateTypeReferenceString("S5", idPrefix));
        tT575States.add(newStateTypeReferenceString("S575", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS075", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562170335 }, new double[] { 46.0716058242, 46.0715943479 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T075", idPrefix, 1d, tmpTransitionLine, tT575States));
        // ----------------------- TRANSITION 035
        List<String> t535States = new ArrayList<String>();
        t535States.add(newStateTypeReferenceString("S5", idPrefix));
        t535States.add(newStateTypeReferenceString("S535", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS035", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562290224 }, new double[] { 46.0716058242, 46.0716119262 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T035", idPrefix, 1d, tmpTransitionLine, t535States));
        // ----------------------- TRANSITION 053
        List<String> t553States = new ArrayList<String>();
        t553States.add(newStateTypeReferenceString("S3", idPrefix));
        t553States.add(newStateTypeReferenceString("S535", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS053", idPrefix, "EPSG:4326", new double[] { 23.5562314854, 23.5562290224 }, new double[] { 46.0716178174, 46.0716119262 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T053", idPrefix, 1d, tmpTransitionLine, t553States));
        // ----------------------- TRANSITION 045
        List<String> t545States = new ArrayList<String>();
        t545States.add(newStateTypeReferenceString("S5", idPrefix));
        t545States.add(newStateTypeReferenceString("S554", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS045", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562520828 }, new double[] { 46.0716058242, 46.0716030093 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T045", idPrefix, 1d, tmpTransitionLine, t545States));
        // ----------------------- TRANSITION 054
        List<String> t554States = new ArrayList<String>();
        t554States.add(newStateTypeReferenceString("S554", idPrefix));
        t554States.add(newStateTypeReferenceString("S4", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS054", idPrefix, "EPSG:4326", new double[] { 23.5562520828, 23.5562698070 }, new double[] { 46.0716030093, 46.0716047232 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T054", idPrefix, 1d, tmpTransitionLine, t554States));
        // ----------------------- TRANSITION 065
        List<String> t565States = new ArrayList<String>();
        t565States.add(newStateTypeReferenceString("S5", idPrefix));
        t565States.add(newStateTypeReferenceString("S556", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS065", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562491100 }, new double[] { 46.0716058242, 46.0715959627 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T065", idPrefix, 1d, tmpTransitionLine, t565States));
        // ----------------------- TRANSITION 056
        List<String> t556States = new ArrayList<String>();
        t556States.add(newStateTypeReferenceString("S556", idPrefix));
        t556States.add(newStateTypeReferenceString("S6", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS056", idPrefix, "EPSG:4326", new double[] { 23.5562491100, 23.5562679375 }, new double[] { 46.0715959627, 46.0715907879 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T056", idPrefix, 1d, tmpTransitionLine, t556States));
        // ----------------------- TRANSITION 058
        List<String> t558States = new ArrayList<String>();
        t558States.add(newStateTypeReferenceString("S578", idPrefix));
        t558States.add(newStateTypeReferenceString("S8", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS058", idPrefix, "EPSG:4326", new double[] { 23.5562189419, 23.5562319868 }, new double[] { 46.0715783463, 46.0715779683 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T058", idPrefix, 1d, tmpTransitionLine, t558States));
        // ----------------------- TRANSITION 057
        List<String> t557States = new ArrayList<String>();
        t557States.add(newStateTypeReferenceString("S575", idPrefix));
        t557States.add(newStateTypeReferenceString("S7", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS057", idPrefix, "EPSG:4326", new double[] { 23.5562170335, 23.556193510128 }, new double[] { 46.0715943479, 46.071570972243 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T057", idPrefix, 1d, tmpTransitionLine, t557States));
        // ----------------------- TRANSITION 078
        List<String> t578States = new ArrayList<String>();
        t578States.add(newStateTypeReferenceString("S7", idPrefix));
        t578States.add(newStateTypeReferenceString("S578", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS078", idPrefix, "EPSG:4326", new double[] { 23.556193510128, 23.5562189419 }, new double[] { 46.071570972243, 46.0715783463 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T078", idPrefix, 1d, tmpTransitionLine, t578States));
        // ----------------------- TRANSITION 050
        List<String> t550States = new ArrayList<String>();
        t550States.add(newStateTypeReferenceString("S7", idPrefix));
        t550States.add(newStateTypeReferenceString("S1000", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS050", idPrefix, "EPSG:4326", new double[] { 23.556193510128, 23.5561959707 }, new double[] { 46.071570972243, 46.0715554691 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T050", idPrefix, 1d, tmpTransitionLine, t550States));
    }

    public void setWalkFirstNodesList(NodesType tmpNode, String idPrefix) {
        PointPropertyType tmpStatePosition;// PLACEHOLDER
        // ----------------------- STATE 11
        List<String> S11Transitions = new ArrayList<String>();
        S11Transitions.add(newTransitionTypeReferenceString("T110", idPrefix));
        S11Transitions.add(newTransitionTypeReferenceString("T001", idPrefix));
        tmpStatePosition = newPointProperty("P11", idPrefix, "EPSG:4326", 23.556150930059, 46.071584048012, 1d);
        tmpNode.getStateMember().add(newStateMember("S11", idPrefix, "Stairwell", tmpStatePosition, S11Transitions));
        // ----------------------- STATE 601
        List<String> S601Transitions = new ArrayList<String>();
        S601Transitions.add(newTransitionTypeReferenceString("T110", idPrefix));
        S601Transitions.add(newTransitionTypeReferenceString("T114", idPrefix));
        tmpStatePosition = newPointProperty("P601", idPrefix, "EPSG:4326", 23.556169705523, 46.071571978071, 1d);
        tmpNode.getStateMember().add(newStateMember("S601", idPrefix, "DoorStairwell", tmpStatePosition, S601Transitions, true));
        // ----------------------- STATE 602
        List<String> S602Transitions = new ArrayList<String>();
        S602Transitions.add(newTransitionTypeReferenceString("T112", idPrefix));
        S602Transitions.add(newTransitionTypeReferenceString("T113", idPrefix));
        tmpStatePosition = newPointProperty("P602", idPrefix, "EPSG:4326", 23.556196192337, 46.071601482371, 1d);
        tmpNode.getStateMember().add(newStateMember("S602", idPrefix, "DoorElevator", tmpStatePosition, S602Transitions, true));
        // ----------------------- STATE 12
        List<String> S12Transitions = new ArrayList<String>();
        S12Transitions.add(newTransitionTypeReferenceString("T112", idPrefix));
        S12Transitions.add(newTransitionTypeReferenceString("T002", idPrefix));
        tmpStatePosition = newPointProperty("P12", idPrefix, "EPSG:4326", 23.556200886202, 46.071611540654, 1d);
        tmpNode.getStateMember().add(newStateMember("S12", idPrefix, "Elevator", tmpStatePosition, S12Transitions));
        // ----------------------- STATE 610
        List<String> S610Transitions = new ArrayList<String>();
        S610Transitions.add(newTransitionTypeReferenceString("T115", idPrefix));
        S610Transitions.add(newTransitionTypeReferenceString("T116", idPrefix));
        tmpStatePosition = newPointProperty("P610", idPrefix, "EPSG:4326", 23.556215638352, 46.071569966415, 1d);
        tmpNode.getStateMember().add(newStateMember("S610", idPrefix, "HallwaySASDoor", tmpStatePosition, S610Transitions, true));
        // ----------------------- STATE 20
        List<String> S20Transitions = new ArrayList<String>();
        S20Transitions.add(newTransitionTypeReferenceString("T116", idPrefix));
        S20Transitions.add(newTransitionTypeReferenceString("T117", idPrefix));
        tmpStatePosition = newPointProperty("P20", idPrefix, "EPSG:4326", 23.556222343874, 46.071558567026, 1d);
        tmpNode.getStateMember().add(newStateMember("S20", idPrefix, "SAS", tmpStatePosition, S20Transitions));
        // ----------------------- STATE 609
        List<String> S609Transitions = new ArrayList<String>();
        S609Transitions.add(newTransitionTypeReferenceString("T117", idPrefix));
        S609Transitions.add(newTransitionTypeReferenceString("T118", idPrefix));
        tmpStatePosition = newPointProperty("P609", idPrefix, "EPSG:4326", 23.556235754920, 46.071566613653, 1d);
        tmpNode.getStateMember().add(newStateMember("S609", idPrefix, "SASDiningRoomDoor", tmpStatePosition, S609Transitions, true));
        // ----------------------- STATE 19
        List<String> S19Transitions = new ArrayList<String>();
        S19Transitions.add(newTransitionTypeReferenceString("T118", idPrefix));
        tmpStatePosition = newPointProperty("P19", idPrefix, "EPSG:4326", 23.556254530383, 46.071558902303, 1d);
        tmpNode.getStateMember().add(newStateMember("S19", idPrefix, "Dining Room", tmpStatePosition, S19Transitions));
        // ----------------------- STATE 17
        List<String> S17Transitions = new ArrayList<String>();
        S17Transitions.add(newTransitionTypeReferenceString("T113", idPrefix));
        S17Transitions.add(newTransitionTypeReferenceString("T114", idPrefix));
        S17Transitions.add(newTransitionTypeReferenceString("T115", idPrefix));
        S17Transitions.add(newTransitionTypeReferenceString("T157", idPrefix));
        S17Transitions.add(newTransitionTypeReferenceString("T178", idPrefix));
        tmpStatePosition = newPointProperty("P17", idPrefix, "EPSG:4326", 23.556193510128, 46.071570972243, 1d);
        tmpNode.getStateMember().add(newStateMember("S17", idPrefix, "Hallway", tmpStatePosition, S17Transitions));
        // ----------------------- STATE 15
        List<String> s15Transitions = new ArrayList<String>();
        s15Transitions.add(newTransitionTypeReferenceString("T175", idPrefix));
        s15Transitions.add(newTransitionTypeReferenceString("T135", idPrefix));
        s15Transitions.add(newTransitionTypeReferenceString("T145", idPrefix));
        s15Transitions.add(newTransitionTypeReferenceString("T165", idPrefix));
        tmpStatePosition = newPointProperty("P15", idPrefix, "EPSG:4326", 23.5562299912, 46.0716058242, 1d);
        tmpNode.getStateMember().add(newStateMember("S15", idPrefix, "SAS", tmpStatePosition, s15Transitions));
        // ----------------------- STATE 675
        List<String> S675Transitions = new ArrayList<String>();
        S675Transitions.add(newTransitionTypeReferenceString("T175", idPrefix));
        S675Transitions.add(newTransitionTypeReferenceString("T157", idPrefix));
        tmpStatePosition = newPointProperty("P675", idPrefix, "EPSG:4326", 23.5562170335, 46.0715943479, 1d);
        tmpNode.getStateMember().add(newStateMember("S675", idPrefix, "HallwaySASDoor", tmpStatePosition, S675Transitions, true));
        // ----------------------- STATE 635
        List<String> s635Transitions = new ArrayList<String>();
        s635Transitions.add(newTransitionTypeReferenceString("T135", idPrefix));
        s635Transitions.add(newTransitionTypeReferenceString("T153", idPrefix));
        tmpStatePosition = newPointProperty("P635", idPrefix, "EPSG:4326", 23.5562290224, 46.0716119262, 1d);
        tmpNode.getStateMember().add(newStateMember("S635", idPrefix, "SASCleaningDoor", tmpStatePosition, s635Transitions, true));
        // ----------------------- STATE 13
        List<String> s13Transitions = new ArrayList<String>();
        s13Transitions.add(newTransitionTypeReferenceString("T153", idPrefix));
        tmpStatePosition = newPointProperty("P13", idPrefix, "EPSG:4326", 23.5562314854, 46.0716178174, 1d);
        tmpNode.getStateMember().add(newStateMember("S13", idPrefix, "Cleaning", tmpStatePosition, s13Transitions));
        // ----------------------- STATE 654
        List<String> s654Transitions = new ArrayList<String>();
        s654Transitions.add(newTransitionTypeReferenceString("T145", idPrefix));
        s654Transitions.add(newTransitionTypeReferenceString("T154", idPrefix));
        tmpStatePosition = newPointProperty("P654", idPrefix, "EPSG:4326", 23.5562520828, 46.0716030093, 1d);
        tmpNode.getStateMember().add(newStateMember("S654", idPrefix, "SASWasteDoor", tmpStatePosition, s654Transitions, true));
        // ----------------------- STATE 14
        List<String> s14Transitions = new ArrayList<String>();
        s14Transitions.add(newTransitionTypeReferenceString("T154", idPrefix));
        tmpStatePosition = newPointProperty("P14", idPrefix, "EPSG:4326", 23.5562698070, 46.0716047232, 1d);
        tmpNode.getStateMember().add(newStateMember("S14", idPrefix, "Waste", tmpStatePosition, s14Transitions));
        // ----------------------- STATE 656
        List<String> s656Transitions = new ArrayList<String>();
        s656Transitions.add(newTransitionTypeReferenceString("T165", idPrefix));
        s656Transitions.add(newTransitionTypeReferenceString("T156", idPrefix));
        tmpStatePosition = newPointProperty("P656", idPrefix, "EPSG:4326", 23.5562491100, 46.0715959627, 1d);
        tmpNode.getStateMember().add(newStateMember("S656", idPrefix, "SASMedicalWasteDoor", tmpStatePosition, s656Transitions, true));
        // ----------------------- STATE 16
        List<String> s16Transitions = new ArrayList<String>();
        s16Transitions.add(newTransitionTypeReferenceString("T156", idPrefix));
        tmpStatePosition = newPointProperty("P16", idPrefix, "EPSG:4326", 23.5562679375, 46.0715907879, 1d);
        tmpNode.getStateMember().add(newStateMember("S16", idPrefix, "MedicalWaste", tmpStatePosition, s16Transitions));
        // ----------------------- STATE 678
        List<String> s678Transitions = new ArrayList<String>();
        s678Transitions.add(newTransitionTypeReferenceString("T178", idPrefix));
        s678Transitions.add(newTransitionTypeReferenceString("T158", idPrefix));
        tmpStatePosition = newPointProperty("P678", idPrefix, "EPSG:4326", 23.5562189419, 46.0715783463, 1d);
        tmpNode.getStateMember().add(newStateMember("S678", idPrefix, "HallwayRegistryDoor", tmpStatePosition, s678Transitions, true));
        // ----------------------- STATE 18
        List<String> s18Transitions = new ArrayList<String>();
        s18Transitions.add(newTransitionTypeReferenceString("T158", idPrefix));
        tmpStatePosition = newPointProperty("P18", idPrefix, "EPSG:4326", 23.5562319868, 46.0715779683, 1d);
        tmpNode.getStateMember().add(newStateMember("S18", idPrefix, "Registry", tmpStatePosition, s18Transitions));
    }

    public void setWalkFirstEdgesList(EdgesType tmpEdge, String idPrefix, final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory) {
        LineStringType tmpTransitionLine;// PLACEHOLDER
        // ----------------------- TRANSITION 110
        List<String> t510States = new ArrayList<String>();
        t510States.add(newStateTypeReferenceString("S11", idPrefix));
        t510States.add(newStateTypeReferenceString("S601", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS110", idPrefix, "EPSG:4326", new double[] { 23.556150930059, 23.556169705523 },
            new double[] { 46.071584048012, 46.071571978071 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T110", idPrefix, 1d, tmpTransitionLine, t510States));

        // ----------------------- TRANSITION 112
        List<String> t512States = new ArrayList<String>();
        t512States.add(newStateTypeReferenceString("S12", idPrefix));
        t512States.add(newStateTypeReferenceString("S602", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS112", idPrefix, "EPSG:4326", new double[] { 23.556200886202, 23.556196192337 },
            new double[] { 46.071611540654, 46.071601482371 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T112", idPrefix, 1d, tmpTransitionLine, t512States));

        // ----------------------- TRANSITION 113
        List<String> t513States = new ArrayList<String>();
        t513States.add(newStateTypeReferenceString("S17", idPrefix));
        t513States.add(newStateTypeReferenceString("S602", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS113", idPrefix, "EPSG:4326", new double[] { 23.556193510128, 23.556196192337 },
            new double[] { 46.071570972243, 46.071601482371 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T113", idPrefix, 1d, tmpTransitionLine, t513States));
        // ----------------------- TRANSITION 114
        List<String> t514States = new ArrayList<String>();
        t514States.add(newStateTypeReferenceString("S601", idPrefix));
        t514States.add(newStateTypeReferenceString("S17", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS114", idPrefix, "EPSG:4326", new double[] { 23.556169705523, 23.556193510128 },
            new double[] { 46.071571978071, 46.071570972243 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T114", idPrefix, 1d, tmpTransitionLine, t514States));
        // ----------------------- TRANSITION 115
        List<String> t515States = new ArrayList<String>();
        t515States.add(newStateTypeReferenceString("S610", idPrefix));
        t515States.add(newStateTypeReferenceString("S17", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS115", idPrefix, "EPSG:4326", new double[] { 23.556215638352, 23.556193510128 },
            new double[] { 46.071569966415, 46.071570972243 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T115", idPrefix, 1d, tmpTransitionLine, t515States));
        // ----------------------- TRANSITION 116
        List<String> t516States = new ArrayList<String>();
        t516States.add(newStateTypeReferenceString("S20", idPrefix));
        t516States.add(newStateTypeReferenceString("S610", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS116", idPrefix, "EPSG:4326", new double[] { 23.556222343874, 23.556215638352 },
            new double[] { 46.071558567026, 46.071569966415 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T116", idPrefix, 1d, tmpTransitionLine, t516States));
        // ----------------------- TRANSITION 117
        List<String> t517States = new ArrayList<String>();
        t517States.add(newStateTypeReferenceString("S609", idPrefix));
        t517States.add(newStateTypeReferenceString("S20", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS117", idPrefix, "EPSG:4326", new double[] { 23.556235754920, 23.556222343874 },
            new double[] { 46.071566613653, 46.071558567026 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T117", idPrefix, 1d, tmpTransitionLine, t517States));
        // ----------------------- TRANSITION 118
        List<String> t518States = new ArrayList<String>();
        t518States.add(newStateTypeReferenceString("S19", idPrefix));
        t518States.add(newStateTypeReferenceString("S609", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS118", idPrefix, "EPSG:4326", new double[] { 23.556254530383, 23.556235754920 },
            new double[] { 46.071558902303, 46.071566613653 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T118", idPrefix, 1d, tmpTransitionLine, t518States));
        // ----------------------- TRANSITION 175
        List<String> tT575States = new ArrayList<String>();
        tT575States.add(newStateTypeReferenceString("S15", idPrefix));
        tT575States.add(newStateTypeReferenceString("S675", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS175", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562170335 }, new double[] { 46.0716058242, 46.0715943479 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T175", idPrefix, 1d, tmpTransitionLine, tT575States));
        // ----------------------- TRANSITION 135
        List<String> t535States = new ArrayList<String>();
        t535States.add(newStateTypeReferenceString("S15", idPrefix));
        t535States.add(newStateTypeReferenceString("S635", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS135", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562290224 }, new double[] { 46.0716058242, 46.0716119262 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T135", idPrefix, 1d, tmpTransitionLine, t535States));
        // ----------------------- TRANSITION 153
        List<String> t553States = new ArrayList<String>();
        t553States.add(newStateTypeReferenceString("S13", idPrefix));
        t553States.add(newStateTypeReferenceString("S635", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS153", idPrefix, "EPSG:4326", new double[] { 23.5562314854, 23.5562290224 }, new double[] { 46.0716178174, 46.0716119262 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T153", idPrefix, 1d, tmpTransitionLine, t553States));
        // ----------------------- TRANSITION 145
        List<String> t545States = new ArrayList<String>();
        t545States.add(newStateTypeReferenceString("S15", idPrefix));
        t545States.add(newStateTypeReferenceString("S654", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS145", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562520828 }, new double[] { 46.0716058242, 46.0716030093 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T145", idPrefix, 1d, tmpTransitionLine, t545States));
        // ----------------------- TRANSITION 154
        List<String> t554States = new ArrayList<String>();
        t554States.add(newStateTypeReferenceString("S654", idPrefix));
        t554States.add(newStateTypeReferenceString("S14", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS154", idPrefix, "EPSG:4326", new double[] { 23.5562520828, 23.5562698070 }, new double[] { 46.0716030093, 46.0716047232 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T154", idPrefix, 1d, tmpTransitionLine, t554States));
        // ----------------------- TRANSITION 165
        List<String> t565States = new ArrayList<String>();
        t565States.add(newStateTypeReferenceString("S15", idPrefix));
        t565States.add(newStateTypeReferenceString("S656", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS165", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562491100 }, new double[] { 46.0716058242, 46.0715959627 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T165", idPrefix, 1d, tmpTransitionLine, t565States));
        // ----------------------- TRANSITION 156
        List<String> t556States = new ArrayList<String>();
        t556States.add(newStateTypeReferenceString("S656", idPrefix));
        t556States.add(newStateTypeReferenceString("S16", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS156", idPrefix, "EPSG:4326", new double[] { 23.5562491100, 23.5562679375 }, new double[] { 46.0715959627, 46.0715907879 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T156", idPrefix, 1d, tmpTransitionLine, t556States));
        // ----------------------- TRANSITION 158
        List<String> t558States = new ArrayList<String>();
        t558States.add(newStateTypeReferenceString("S678", idPrefix));
        t558States.add(newStateTypeReferenceString("S18", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS158", idPrefix, "EPSG:4326", new double[] { 23.5562189419, 23.5562319868 }, new double[] { 46.0715783463, 46.0715779683 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T158", idPrefix, 1d, tmpTransitionLine, t558States));
        // ----------------------- TRANSITION 157
        List<String> t557States = new ArrayList<String>();
        t557States.add(newStateTypeReferenceString("S675", idPrefix));
        t557States.add(newStateTypeReferenceString("S17", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS157", idPrefix, "EPSG:4326", new double[] { 23.5562170335, 23.556193510128 }, new double[] { 46.0715943479, 46.071570972243 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T157", idPrefix, 1d, tmpTransitionLine, t557States));
        // ----------------------- TRANSITION 178
        List<String> t578States = new ArrayList<String>();
        t578States.add(newStateTypeReferenceString("S17", idPrefix));
        t578States.add(newStateTypeReferenceString("S678", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS178", idPrefix, "EPSG:4326", new double[] { 23.556193510128, 23.5562189419 }, new double[] { 46.071570972243, 46.0715783463 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T178", idPrefix, 1d, tmpTransitionLine, t578States));
    }

    public void setWalkInterFloorEdgesList(EdgesType tmpEdge, String idPrefix, final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory) {
        LineStringType tmpTransitionLine;// PLACEHOLDER
        // ----------------------- TRANSITION 001
        List<String> stairwellLinkStates = new ArrayList<String>();
        stairwellLinkStates.add(newStateTypeReferenceString("S1", idPrefix));
        stairwellLinkStates.add(newStateTypeReferenceString("S11", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS001", idPrefix, "EPSG:4326", new double[] { 23.556150930059, 23.556150930059 },
            new double[] { 46.071584048012, 46.071584048012 }, new double[] { 0d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T001", idPrefix, 2d, tmpTransitionLine, stairwellLinkStates, TypeOfTransitionEnumerationType.STAIRS));
        // ----------------------- TRANSITION 002
        List<String> elevatorLinkStates = new ArrayList<String>();
        elevatorLinkStates.add(newStateTypeReferenceString("S2", idPrefix));
        elevatorLinkStates.add(newStateTypeReferenceString("S12", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS002", idPrefix, "EPSG:4326", new double[] { 23.556200886202, 23.556200886202 },
            new double[] { 46.071611540654, 46.071611540654 }, new double[] { 0d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T002", idPrefix, 2d, tmpTransitionLine, elevatorLinkStates, TypeOfTransitionEnumerationType.ELEVATOR));
    }

    // ===== WHEELCHAIR
    public SpaceLayerMemberType getWheelchairGraph(net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory, String idPrefix) {
        // ----SPACE LAYER TYPE WHEELCHAIR
        SpaceLayerMemberType spaceLayerMember = new SpaceLayerMemberType();

        SpaceLayerType spaceLayerType = new SpaceLayerType();
        spaceLayerType.setClazz(SpaceLayerClassType.LOGICAL);
        spaceLayerType.setNavigationType(TypeOfNavigationGraphEnumerationType.WHEELCHAIR);
        spaceLayerMember.setSpaceLayer(spaceLayerType);
        spaceLayerType.setId("wheelchair");

        // ========================================== ADD NODES(STATES)!!!!
        // -----NODES
        List<NodesType> nodes = spaceLayerType.getNodes();
        NodesType tmpNode = new NodesType();
        tmpNode.setId("Nodes" + idPrefix);
        nodes.add(tmpNode);
        // ------ STATES
        setWheelChairGroundNodesList(tmpNode, idPrefix);// GROUND FLOOR
        setWheelChairFirstNodesList(tmpNode, idPrefix); // FIRST FLOOR

        // ========================================== NOW ADD EDGES(TRANSITIONS)!!!!
        // -----EDGES
        List<EdgesType> edges = spaceLayerType.getEdges();
        EdgesType tmpEdge = new EdgesType();
        tmpEdge.setId("Edges" + idPrefix);
        edges.add(tmpEdge);
        setWheelChairGroundEdgesList(tmpEdge, idPrefix, _gmlObjectFactory);// GROUND FLOOR
        setWheelChairFirstEdgesList(tmpEdge, idPrefix, _gmlObjectFactory);// FIRST FLOOR
        setWheelChairInterFloorEdgesList(tmpEdge, idPrefix, _gmlObjectFactory);
        // -------------------------
        return spaceLayerMember;
    }

    public void setWheelChairGroundNodesList(NodesType tmpNode, String idPrefix) {
        PointPropertyType tmpStatePosition;// PLACEHOLDER

        // ----------------------- STATE 502
        List<String> S502Transitions = new ArrayList<String>();
        S502Transitions.add(newTransitionTypeReferenceString("T012", idPrefix));
        S502Transitions.add(newTransitionTypeReferenceString("T013", idPrefix));
        tmpStatePosition = newPointProperty("P502", idPrefix, "EPSG:4326", 23.556196192337, 46.071601482371, 0d);
        tmpNode.getStateMember().add(newStateMember("S502", idPrefix, "DoorElevator", tmpStatePosition, S502Transitions, true));
        // ----------------------- STATE 2
        List<String> S2Transitions = new ArrayList<String>();
        S2Transitions.add(newTransitionTypeReferenceString("T012", idPrefix));
        S2Transitions.add(newTransitionTypeReferenceString("T002", idPrefix));
        tmpStatePosition = newPointProperty("P2", idPrefix, "EPSG:4326", 23.556200886202, 46.071611540654, 0d);
        tmpNode.getStateMember().add(newStateMember("S2", idPrefix, "Elevator", tmpStatePosition, S2Transitions));
        // ----------------------- STATE 510
        List<String> S510Transitions = new ArrayList<String>();
        S510Transitions.add(newTransitionTypeReferenceString("T015", idPrefix));
        S510Transitions.add(newTransitionTypeReferenceString("T016", idPrefix));
        tmpStatePosition = newPointProperty("P510", idPrefix, "EPSG:4326", 23.556215638352, 46.071569966415, 0d);
        tmpNode.getStateMember().add(newStateMember("S510", idPrefix, "HallwaySASDoor", tmpStatePosition, S510Transitions, true));
        // ----------------------- STATE 10
        List<String> S10Transitions = new ArrayList<String>();
        S10Transitions.add(newTransitionTypeReferenceString("T016", idPrefix));
        S10Transitions.add(newTransitionTypeReferenceString("T017", idPrefix));
        tmpStatePosition = newPointProperty("P10", idPrefix, "EPSG:4326", 23.556222343874, 46.071558567026, 0d);
        tmpNode.getStateMember().add(newStateMember("S10", idPrefix, "SAS", tmpStatePosition, S10Transitions));
        // ----------------------- STATE 509
        List<String> S509Transitions = new ArrayList<String>();
        S509Transitions.add(newTransitionTypeReferenceString("T017", idPrefix));
        S509Transitions.add(newTransitionTypeReferenceString("T018", idPrefix));
        tmpStatePosition = newPointProperty("P509", idPrefix, "EPSG:4326", 23.556235754920, 46.071566613653, 0d);
        tmpNode.getStateMember().add(newStateMember("S509", idPrefix, "SASDiningRoomDoor", tmpStatePosition, S509Transitions, true));
        // ----------------------- STATE 9
        List<String> S9Transitions = new ArrayList<String>();
        S9Transitions.add(newTransitionTypeReferenceString("T018", idPrefix));
        tmpStatePosition = newPointProperty("P9", idPrefix, "EPSG:4326", 23.556254530383, 46.071558902303, 0d);
        tmpNode.getStateMember().add(newStateMember("S9", idPrefix, "Dining Room", tmpStatePosition, S9Transitions));
        // ----------------------- STATE 7
        List<String> S7Transitions = new ArrayList<String>();
        S7Transitions.add(newTransitionTypeReferenceString("T013", idPrefix));
        S7Transitions.add(newTransitionTypeReferenceString("T015", idPrefix));
        S7Transitions.add(newTransitionTypeReferenceString("T057", idPrefix));
        S7Transitions.add(newTransitionTypeReferenceString("T050", idPrefix));
        tmpStatePosition = newPointProperty("P7", idPrefix, "EPSG:4326", 23.556193510128, 46.071570972243, 0d);
        tmpNode.getStateMember().add(newStateMember("S7", idPrefix, "Hallway", tmpStatePosition, S7Transitions));

        // ----------------------- STATE 5
        List<String> s5Transitions = new ArrayList<String>();
        s5Transitions.add(newTransitionTypeReferenceString("T075", idPrefix));
        s5Transitions.add(newTransitionTypeReferenceString("T045", idPrefix));
        tmpStatePosition = newPointProperty("P5", idPrefix, "EPSG:4326", 23.5562299912, 46.0716058242, 0d);
        tmpNode.getStateMember().add(newStateMember("S5", idPrefix, "SAS", tmpStatePosition, s5Transitions));
        // ----------------------- STATE 575
        List<String> S575Transitions = new ArrayList<String>();
        S575Transitions.add(newTransitionTypeReferenceString("T075", idPrefix));
        S575Transitions.add(newTransitionTypeReferenceString("T057", idPrefix));
        tmpStatePosition = newPointProperty("P575", idPrefix, "EPSG:4326", 23.5562170335, 46.0715943479, 0d);
        tmpNode.getStateMember().add(newStateMember("S575", idPrefix, "HallwaySASDoor", tmpStatePosition, S575Transitions, true));
        // ----------------------- STATE 4
        List<String> s4Transitions = new ArrayList<String>();
        s4Transitions.add(newTransitionTypeReferenceString("T054", idPrefix));
        tmpStatePosition = newPointProperty("P4", idPrefix, "EPSG:4326", 23.5562698070, 46.0716047232, 0d);
        tmpNode.getStateMember().add(newStateMember("S4", idPrefix, "Waste", tmpStatePosition, s4Transitions));
        // ----------------------- STATE 554
        List<String> s554Transitions = new ArrayList<String>();
        s554Transitions.add(newTransitionTypeReferenceString("T045", idPrefix));
        s554Transitions.add(newTransitionTypeReferenceString("T054", idPrefix));
        tmpStatePosition = newPointProperty("P554", idPrefix, "EPSG:4326", 23.5562520828, 46.0716030093, 0d);
        tmpNode.getStateMember().add(newStateMember("S554", idPrefix, "SASWasteDoor", tmpStatePosition, s554Transitions, true));
        // ----------------------- STATE 1000
        List<String> s1000Transitions = new ArrayList<String>();
        s1000Transitions.add(newTransitionTypeReferenceString("T050", idPrefix));
        tmpStatePosition = newPointProperty("P1000", idPrefix, "EPSG:4326", 23.5561959707, 46.0715554691, 0d);
        StateMemberType anchorNodeSM = newStateMember("S1000", idPrefix, "AnchorNode", tmpStatePosition, s1000Transitions, true, true);
        CellSpacePropertyType cspt = new CellSpacePropertyType();
        cspt.setHref("#AS1");
        anchorNodeSM.getState().setDuality(cspt);
        tmpNode.getStateMember().add(anchorNodeSM);

    }

    public void setWheelChairGroundEdgesList(EdgesType tmpEdge, String idPrefix, final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory) {
        LineStringType tmpTransitionLine;// PLACEHOLDER
        // ----------------------- TRANSITION 012
        List<String> t512States = new ArrayList<String>();
        t512States.add(newStateTypeReferenceString("S2", idPrefix));
        t512States.add(newStateTypeReferenceString("S502", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS012", idPrefix, "EPSG:4326", new double[] { 23.556200886202, 23.556196192337 },
            new double[] { 46.071611540654, 46.071601482371 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T012", idPrefix, 1d, tmpTransitionLine, t512States));

        // ----------------------- TRANSITION 013
        List<String> t513States = new ArrayList<String>();
        t513States.add(newStateTypeReferenceString("S7", idPrefix));
        t513States.add(newStateTypeReferenceString("S502", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS013", idPrefix, "EPSG:4326", new double[] { 23.556193510128, 23.556196192337 },
            new double[] { 46.071570972243, 46.071601482371 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T013", idPrefix, 1d, tmpTransitionLine, t513States));
        // ----------------------- TRANSITION 015
        List<String> t515States = new ArrayList<String>();
        t515States.add(newStateTypeReferenceString("S510", idPrefix));
        t515States.add(newStateTypeReferenceString("S7", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS015", idPrefix, "EPSG:4326", new double[] { 23.556215638352, 23.556193510128 },
            new double[] { 46.071569966415, 46.071570972243 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T015", idPrefix, 1d, tmpTransitionLine, t515States));
        // ----------------------- TRANSITION 016
        List<String> t516States = new ArrayList<String>();
        t516States.add(newStateTypeReferenceString("S10", idPrefix));
        t516States.add(newStateTypeReferenceString("S510", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS016", idPrefix, "EPSG:4326", new double[] { 23.556222343874, 23.556215638352 },
            new double[] { 46.071558567026, 46.071569966415 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T016", idPrefix, 1d, tmpTransitionLine, t516States));
        // ----------------------- TRANSITION 017
        List<String> t517States = new ArrayList<String>();
        t517States.add(newStateTypeReferenceString("S509", idPrefix));
        t517States.add(newStateTypeReferenceString("S10", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS017", idPrefix, "EPSG:4326", new double[] { 23.556235754920, 23.556222343874 },
            new double[] { 46.071566613653, 46.071558567026 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T017", idPrefix, 1d, tmpTransitionLine, t517States));
        // ----------------------- TRANSITION 018
        List<String> t518States = new ArrayList<String>();
        t518States.add(newStateTypeReferenceString("S9", idPrefix));
        t518States.add(newStateTypeReferenceString("S509", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS018", idPrefix, "EPSG:4326", new double[] { 23.556254530383, 23.556235754920 },
            new double[] { 46.071558902303, 46.071566613653 }, new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T018", idPrefix, 1d, tmpTransitionLine, t518States));
        // ----------------------- TRANSITION 075
        List<String> tT575States = new ArrayList<String>();
        tT575States.add(newStateTypeReferenceString("S5", idPrefix));
        tT575States.add(newStateTypeReferenceString("S575", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS075", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562170335 }, new double[] { 46.0716058242, 46.0715943479 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T075", idPrefix, 1d, tmpTransitionLine, tT575States));
        // ----------------------- TRANSITION 045
        List<String> t545States = new ArrayList<String>();
        t545States.add(newStateTypeReferenceString("S5", idPrefix));
        t545States.add(newStateTypeReferenceString("S554", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS045", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562520828 }, new double[] { 46.0716058242, 46.0716030093 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T045", idPrefix, 1d, tmpTransitionLine, t545States));
        // ----------------------- TRANSITION 054
        List<String> t554States = new ArrayList<String>();
        t554States.add(newStateTypeReferenceString("S554", idPrefix));
        t554States.add(newStateTypeReferenceString("S4", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS054", idPrefix, "EPSG:4326", new double[] { 23.5562520828, 23.5562698070 }, new double[] { 46.0716030093, 46.0716047232 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T054", idPrefix, 1d, tmpTransitionLine, t554States));
        // ----------------------- TRANSITION 057
        List<String> t557States = new ArrayList<String>();
        t557States.add(newStateTypeReferenceString("S575", idPrefix));
        t557States.add(newStateTypeReferenceString("S7", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS057", idPrefix, "EPSG:4326", new double[] { 23.5562170335, 23.556193510128 }, new double[] { 46.0715943479, 46.071570972243 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T057", idPrefix, 1d, tmpTransitionLine, t557States));
        // ----------------------- TRANSITION 050
        List<String> t550States = new ArrayList<String>();
        t550States.add(newStateTypeReferenceString("S7", idPrefix));
        t550States.add(newStateTypeReferenceString("S1000", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS050", idPrefix, "EPSG:4326", new double[] { 23.556193510128, 23.5561959707 }, new double[] { 46.071570972243, 46.0715554691 },
            new double[] { 0d, 0d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T050", idPrefix, 1d, tmpTransitionLine, t550States));
    }

    public void setWheelChairFirstNodesList(NodesType tmpNode, String idPrefix) {
        PointPropertyType tmpStatePosition;// PLACEHOLDER
        // ----------------------- STATE 602
        List<String> S602Transitions = new ArrayList<String>();
        S602Transitions.add(newTransitionTypeReferenceString("T112", idPrefix));
        S602Transitions.add(newTransitionTypeReferenceString("T113", idPrefix));
        tmpStatePosition = newPointProperty("P602", idPrefix, "EPSG:4326", 23.556196192337, 46.071601482371, 1d);
        tmpNode.getStateMember().add(newStateMember("S602", idPrefix, "DoorElevator", tmpStatePosition, S602Transitions, true));
        // ----------------------- STATE 12
        List<String> S12Transitions = new ArrayList<String>();
        S12Transitions.add(newTransitionTypeReferenceString("T112", idPrefix));
        S12Transitions.add(newTransitionTypeReferenceString("T002", idPrefix));
        tmpStatePosition = newPointProperty("P12", idPrefix, "EPSG:4326", 23.556200886202, 46.071611540654, 1d);
        tmpNode.getStateMember().add(newStateMember("S12", idPrefix, "Elevator", tmpStatePosition, S12Transitions));
        // ----------------------- STATE 610
        List<String> S610Transitions = new ArrayList<String>();
        S610Transitions.add(newTransitionTypeReferenceString("T115", idPrefix));
        S610Transitions.add(newTransitionTypeReferenceString("T116", idPrefix));
        tmpStatePosition = newPointProperty("P610", idPrefix, "EPSG:4326", 23.556215638352, 46.071569966415, 1d);
        tmpNode.getStateMember().add(newStateMember("S610", idPrefix, "HallwaySASDoor", tmpStatePosition, S610Transitions, true));
        // ----------------------- STATE 20
        List<String> S20Transitions = new ArrayList<String>();
        S20Transitions.add(newTransitionTypeReferenceString("T116", idPrefix));
        S20Transitions.add(newTransitionTypeReferenceString("T117", idPrefix));
        tmpStatePosition = newPointProperty("P20", idPrefix, "EPSG:4326", 23.556222343874, 46.071558567026, 1d);
        tmpNode.getStateMember().add(newStateMember("S20", idPrefix, "SAS", tmpStatePosition, S20Transitions));
        // ----------------------- STATE 609
        List<String> S609Transitions = new ArrayList<String>();
        S609Transitions.add(newTransitionTypeReferenceString("T117", idPrefix));
        S609Transitions.add(newTransitionTypeReferenceString("T118", idPrefix));
        tmpStatePosition = newPointProperty("P609", idPrefix, "EPSG:4326", 23.556235754920, 46.071566613653, 1d);
        tmpNode.getStateMember().add(newStateMember("S609", idPrefix, "SASDiningRoomDoor", tmpStatePosition, S609Transitions, true));
        // ----------------------- STATE 19
        List<String> S19Transitions = new ArrayList<String>();
        S19Transitions.add(newTransitionTypeReferenceString("T118", idPrefix));
        tmpStatePosition = newPointProperty("P19", idPrefix, "EPSG:4326", 23.556254530383, 46.071558902303, 1d);
        tmpNode.getStateMember().add(newStateMember("S19", idPrefix, "Dining Room", tmpStatePosition, S19Transitions));
        // ----------------------- STATE 17
        List<String> S17Transitions = new ArrayList<String>();
        S17Transitions.add(newTransitionTypeReferenceString("T113", idPrefix));
        S17Transitions.add(newTransitionTypeReferenceString("T115", idPrefix));
        S17Transitions.add(newTransitionTypeReferenceString("T157", idPrefix));
        tmpStatePosition = newPointProperty("P17", idPrefix, "EPSG:4326", 23.556193510128, 46.071570972243, 1d);
        tmpNode.getStateMember().add(newStateMember("S17", idPrefix, "Hallway", tmpStatePosition, S17Transitions));
        // ----------------------- STATE 15
        List<String> s15Transitions = new ArrayList<String>();
        s15Transitions.add(newTransitionTypeReferenceString("T175", idPrefix));
        s15Transitions.add(newTransitionTypeReferenceString("T145", idPrefix));
        tmpStatePosition = newPointProperty("P15", idPrefix, "EPSG:4326", 23.5562299912, 46.0716058242, 1d);
        tmpNode.getStateMember().add(newStateMember("S15", idPrefix, "SAS", tmpStatePosition, s15Transitions));
        // ----------------------- STATE 675
        List<String> S675Transitions = new ArrayList<String>();
        S675Transitions.add(newTransitionTypeReferenceString("T175", idPrefix));
        S675Transitions.add(newTransitionTypeReferenceString("T157", idPrefix));
        tmpStatePosition = newPointProperty("P675", idPrefix, "EPSG:4326", 23.5562170335, 46.0715943479, 1d);
        tmpNode.getStateMember().add(newStateMember("S675", idPrefix, "HallwaySASDoor", tmpStatePosition, S675Transitions, true));
        // ----------------------- STATE 654
        List<String> s654Transitions = new ArrayList<String>();
        s654Transitions.add(newTransitionTypeReferenceString("T145", idPrefix));
        s654Transitions.add(newTransitionTypeReferenceString("T154", idPrefix));
        tmpStatePosition = newPointProperty("P654", idPrefix, "EPSG:4326", 23.5562520828, 46.0716030093, 1d);
        tmpNode.getStateMember().add(newStateMember("S654", idPrefix, "SASWasteDoor", tmpStatePosition, s654Transitions, true));
        // ----------------------- STATE 14
        List<String> s14Transitions = new ArrayList<String>();
        s14Transitions.add(newTransitionTypeReferenceString("T154", idPrefix));
        tmpStatePosition = newPointProperty("P14", idPrefix, "EPSG:4326", 23.5562698070, 46.0716047232, 1d);
        tmpNode.getStateMember().add(newStateMember("S14", idPrefix, "Waste", tmpStatePosition, s14Transitions));
    }

    public void setWheelChairFirstEdgesList(EdgesType tmpEdge, String idPrefix, final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory) {
        LineStringType tmpTransitionLine;// PLACEHOLDER
        // ----------------------- TRANSITION 112
        List<String> t512States = new ArrayList<String>();
        t512States.add(newStateTypeReferenceString("S12", idPrefix));
        t512States.add(newStateTypeReferenceString("S602", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS112", idPrefix, "EPSG:4326", new double[] { 23.556200886202, 23.556196192337 },
            new double[] { 46.071611540654, 46.071601482371 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T112", idPrefix, 1d, tmpTransitionLine, t512States));

        // ----------------------- TRANSITION 113
        List<String> t513States = new ArrayList<String>();
        t513States.add(newStateTypeReferenceString("S17", idPrefix));
        t513States.add(newStateTypeReferenceString("S602", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS113", idPrefix, "EPSG:4326", new double[] { 23.556193510128, 23.556196192337 },
            new double[] { 46.071570972243, 46.071601482371 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T113", idPrefix, 1d, tmpTransitionLine, t513States));
        // ----------------------- TRANSITION 115
        List<String> t515States = new ArrayList<String>();
        t515States.add(newStateTypeReferenceString("S610", idPrefix));
        t515States.add(newStateTypeReferenceString("S17", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS115", idPrefix, "EPSG:4326", new double[] { 23.556215638352, 23.556193510128 },
            new double[] { 46.071569966415, 46.071570972243 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T115", idPrefix, 1d, tmpTransitionLine, t515States));
        // ----------------------- TRANSITION 116
        List<String> t516States = new ArrayList<String>();
        t516States.add(newStateTypeReferenceString("S20", idPrefix));
        t516States.add(newStateTypeReferenceString("S610", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS116", idPrefix, "EPSG:4326", new double[] { 23.556222343874, 23.556215638352 },
            new double[] { 46.071558567026, 46.071569966415 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T116", idPrefix, 1d, tmpTransitionLine, t516States));
        // ----------------------- TRANSITION 117
        List<String> t517States = new ArrayList<String>();
        t517States.add(newStateTypeReferenceString("S609", idPrefix));
        t517States.add(newStateTypeReferenceString("S20", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS117", idPrefix, "EPSG:4326", new double[] { 23.556235754920, 23.556222343874 },
            new double[] { 46.071566613653, 46.071558567026 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T117", idPrefix, 1d, tmpTransitionLine, t517States));
        // ----------------------- TRANSITION 118
        List<String> t518States = new ArrayList<String>();
        t518States.add(newStateTypeReferenceString("S19", idPrefix));
        t518States.add(newStateTypeReferenceString("S609", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS118", idPrefix, "EPSG:4326", new double[] { 23.556254530383, 23.556235754920 },
            new double[] { 46.071558902303, 46.071566613653 }, new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T118", idPrefix, 1d, tmpTransitionLine, t518States));
        // ----------------------- TRANSITION 175
        List<String> tT575States = new ArrayList<String>();
        tT575States.add(newStateTypeReferenceString("S15", idPrefix));
        tT575States.add(newStateTypeReferenceString("S675", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS175", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562170335 }, new double[] { 46.0716058242, 46.0715943479 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T175", idPrefix, 1d, tmpTransitionLine, tT575States));

        // ----------------------- TRANSITION 145
        List<String> t545States = new ArrayList<String>();
        t545States.add(newStateTypeReferenceString("S15", idPrefix));
        t545States.add(newStateTypeReferenceString("S654", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS145", idPrefix, "EPSG:4326", new double[] { 23.5562299912, 23.5562520828 }, new double[] { 46.0716058242, 46.0716030093 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T145", idPrefix, 1d, tmpTransitionLine, t545States));
        // ----------------------- TRANSITION 154
        List<String> t554States = new ArrayList<String>();
        t554States.add(newStateTypeReferenceString("S654", idPrefix));
        t554States.add(newStateTypeReferenceString("S14", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS154", idPrefix, "EPSG:4326", new double[] { 23.5562520828, 23.5562698070 }, new double[] { 46.0716030093, 46.0716047232 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T154", idPrefix, 1d, tmpTransitionLine, t554States));

        // ----------------------- TRANSITION 157
        List<String> t557States = new ArrayList<String>();
        t557States.add(newStateTypeReferenceString("S675", idPrefix));
        t557States.add(newStateTypeReferenceString("S17", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS157", idPrefix, "EPSG:4326", new double[] { 23.5562170335, 23.556193510128 }, new double[] { 46.0715943479, 46.071570972243 },
            new double[] { 1d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T157", idPrefix, 1d, tmpTransitionLine, t557States));

    }

    public void setWheelChairInterFloorEdgesList(EdgesType tmpEdge, String idPrefix, final net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory) {
        LineStringType tmpTransitionLine;// PLACEHOLDER
        // ----------------------- TRANSITION 002
        List<String> elevatorLinkStates = new ArrayList<String>();
        elevatorLinkStates.add(newStateTypeReferenceString("S2", idPrefix));
        elevatorLinkStates.add(newStateTypeReferenceString("S12", idPrefix));
        tmpTransitionLine = newLineStringProperty(_gmlObjectFactory, "LS002", idPrefix, "EPSG:4326", new double[] { 23.556200886202, 23.556200886202 },
            new double[] { 46.071611540654, 46.071611540654 }, new double[] { 0d, 1d });
        tmpEdge.getTransitionMember().add(newTransitionMember(_gmlObjectFactory, "T002", idPrefix, 2d, tmpTransitionLine, elevatorLinkStates, TypeOfTransitionEnumerationType.ELEVATOR));
    }

    // ===================== COMMON METHODS ========================

    public StateMemberType newStateMember(String stateId, String idPrefix, String roomName, PointPropertyType statePosition, List<String> connectedTransitions) {
        return newStateMember(stateId, idPrefix, roomName, statePosition, connectedTransitions, false, false);
    }

    public StateMemberType newStateMember(String stateId, String idPrefix, String roomName, PointPropertyType statePosition, List<String> connectedTransitions, boolean isDoor) {
        return newStateMember(stateId, idPrefix, roomName, statePosition, connectedTransitions, isDoor, false);
    }

    public StateMemberType newStateMember(String stateId, String idPrefix, String roomName, PointPropertyType statePosition, List<String> connectedTransitions, boolean isDoor, boolean isAnchorNode) {
        StateMemberType stMemb = new StateMemberType();
        // -------STATE TYPE
        StateType tmpState = new StateType();
        stMemb.setState(tmpState);
        tmpState.setId(idPrefix + stateId);
        StringOrRefType sort = new StringOrRefType();
        sort.setValue(roomName);// the room number?
        tmpState.setDescription(sort);
        CodeType roomNameCT = new CodeType();
        roomNameCT.setValue(roomName);
        tmpState.getName().add(roomNameCT);// TODO add the room name
        // XXX Added parameters that are not in the standard definition (1.0)
        tmpState.setIsAnchorNode(isAnchorNode);
        tmpState.setIsDoor(isDoor);
        // ------GEOMETRY
        tmpState.setGeometry(statePosition);
        // ------CONNECTS
        TransitionPropertyType tmpTransProp;
        for (String tmpTransitionRef : connectedTransitions) {
            if (null != tmpTransitionRef) {
                tmpTransProp = new TransitionPropertyType();
                tmpTransProp.setHref(tmpTransitionRef);
                // IT IS POSSIBLE TO ADD AS A REFERENCE THE ID OF THE TRANSITION BUT IT WILL BE PUT INSIDE THE TRANSITION ITSELF AND NOT AS ATTRIBUTE!
                // PriorityLocationPropertyType loc = new PriorityLocationPropertyType();
                // loc.setHref("#T510");
                // tmpTrans.setLocation(_gmlObjectFactory.createPriorityLocation(loc));
                tmpState.getConnects().add(tmpTransProp);
            }
        }
        return stMemb;
    }

    public PointPropertyType newPointProperty(String pointID, String idPrefix, String pointSrsName, double pointX, double pointY, double pointZ) {
        PointPropertyType tmpStatePosition = new PointPropertyType();
        PointType tmpPointType = new PointType();
        tmpPointType.setId(idPrefix + pointID);
        tmpPointType.setSrsName(pointSrsName);
        DirectPositionType tmpPos = new DirectPositionType();
        // TODO it depends on how to read it!
        tmpPos.getValue().add(pointX);// lon
        tmpPos.getValue().add(pointY);// lat
        tmpPos.getValue().add(pointZ);// elev
        tmpPointType.setPos(tmpPos);
        tmpStatePosition.setPoint(tmpPointType);
        return tmpStatePosition;
    }

    @Deprecated
    public StateType newStateTypeReference(String stateID, String idPrefix) {
        StateType st = new StateType();
        st.setId(stateID + "_" + STATEREFERENCEID_SEQUENCE++);
        st.setHref("#" + idPrefix + stateID);
        return st;
    }

    public String newStateTypeReferenceString(String stateID, String idPrefix) {
        return "#" + idPrefix + stateID;
    }

    public TransitionMemberType newTransitionMember(net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory, String transitionId, String idPrefix, double weight, LineStringType linestring,
        List<String> connectedStates) {
        return newTransitionMember(_gmlObjectFactory, transitionId, idPrefix, weight, linestring, connectedStates, TypeOfTransitionEnumerationType.NORMAL);
    }

    public TransitionMemberType newTransitionMember(net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory, String transitionId, String idPrefix, double weight, LineStringType linestring,
        List<String> connectedStates, TypeOfTransitionEnumerationType transitionType) {
        TransitionMemberType trMemb = new TransitionMemberType();
        // -------TRANSITION TYPE
        TransitionType tmpTrans = new TransitionType();
        trMemb.setTransition(tmpTrans);
        tmpTrans.setId(idPrefix + transitionId);
        StringOrRefType sort = new StringOrRefType();
        sort.setValue(idPrefix + transitionId);
        tmpTrans.setDescription(sort);
        CodeType transitionNameCT = new CodeType();
        transitionNameCT.setValue(idPrefix + transitionId);
        tmpTrans.getName().add(transitionNameCT);
        tmpTrans.setWeight(weight);
        tmpTrans.setTransitionType(transitionType);
        // ------GEOMETRY
        CurvePropertyType tmpGeom = new CurvePropertyType();
        tmpGeom.setAbstractCurve(_gmlObjectFactory.createLineString(linestring));
        tmpTrans.setGeometry(tmpGeom);
        // ------CONNECTS
        StatePropertyType tmpStateProp;
        for (String tmpStateRef : connectedStates) {
            if (null != tmpStateRef) {
                tmpStateProp = new StatePropertyType();
                tmpStateProp.setHref(tmpStateRef);
                tmpTrans.getConnects().add(tmpStateProp);
            }
        }

        return trMemb;
    }

    public LineStringType newLineStringProperty(net.opengis.gml.v_3_2_1.ObjectFactory _gmlObjectFactory, String lineID, String idPrefix, String lineSrsName, double[] pointsX, double[] pointsY,
        double[] pointsZ) {
        LineStringType lst = new LineStringType();
        lst.setId(idPrefix + lineID);
        lst.setSrsName(lineSrsName);
        List<JAXBElement<?>> posList = lst.getPosOrPointPropertyOrPointRep();
        DirectPositionType tmpPos;
        for (int i = 0; i < pointsX.length; i++) {
            tmpPos = new DirectPositionType();
            tmpPos.getValue().add(pointsX[i]);// lon
            tmpPos.getValue().add(pointsY[i]);// lat
            tmpPos.getValue().add(pointsZ[i]);// elev
            posList.add(_gmlObjectFactory.createPos(tmpPos));
        }
        return lst;
    }

    @Deprecated
    public TransitionType newTransitionTypeReference(String transitionID, String idPrefix) {
        TransitionType tmpTrans = new TransitionType();
        tmpTrans.setId(transitionID + "_" + TRANSITIONREFERENCEID_SEQUENCE++);
        tmpTrans.setHref("#" + idPrefix + transitionID);
        return tmpTrans;
    }

    public String newTransitionTypeReferenceString(String transitionID, String idPrefix) {
        return "#" + idPrefix + transitionID;
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
        IndoorFeaturesType customer = unmarshaller.unmarshal(src, IndoorFeaturesType.class).getValue();
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
