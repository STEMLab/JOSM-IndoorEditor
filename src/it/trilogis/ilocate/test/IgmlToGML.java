/**
 * 
 */
package it.trilogis.ilocate.test;

import it.trilogis.ingoorgml.utils.GMLNamespaceMapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import net.opengis.gml.v_3_2_1.FeatureCollectionType;
import net.opengis.gml.v_3_2_1.FeaturePropertyType;
import net.opengis.indoorgml.v_1_0.core.EdgesType;
import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;
import net.opengis.indoorgml.v_1_0.core.MultiLayeredGraphType;
import net.opengis.indoorgml.v_1_0.core.NodesType;
import net.opengis.indoorgml.v_1_0.core.SpaceLayerType;
import net.opengis.indoorgml.v_1_0.core.StateMemberType;
import net.opengis.indoorgml.v_1_0.core.TransitionMemberType;
import org.xml.sax.SAXException;
import trilogis.net.opengis.gml.v_3_2_1.CustomLineFeatureMember;
import trilogis.net.opengis.gml.v_3_2_1.CustomPointFeatureMember;
import trilogis.net.opengis.gml.v_3_2_1.ObjectFactory;

/**
 * @author Nicola Dorigatti
 */
public class IgmlToGML {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            // validate
            IndoorFeaturesType features = IgmlToGML.unmarshallFile();
            MultiLayeredGraphType indoorGML_mlg = features.getMultiLayeredGraph();
            // get spacelayers, nodes and edges and check validity
            SpaceLayerType spaceLayer = indoorGML_mlg.getSpaceLayers().get(0).getSpaceLayerMember().get(0).getSpaceLayer();

            NodesType nodesObj = spaceLayer.getNodes().get(0);
            List<StateMemberType> nodesList = nodesObj.getStateMember();
            // cache the list of nodes-edges
            EdgesType edgesObj = spaceLayer.getEdges().get(0);
            List<TransitionMemberType> edgesList = edgesObj.getTransitionMember();

            // GML
            trilogis.net.opengis.gml.v_3_2_1.ObjectFactory oft = new ObjectFactory();
            FeatureCollectionType fct = new FeatureCollectionType();
            List<FeaturePropertyType> fptList = fct.getFeatureMember();

            for (StateMemberType ntype : nodesList) {
                // new point
                CustomPointFeatureMember cfm = new CustomPointFeatureMember();
                cfm.setId(ntype.getState().getId());
                cfm.setGeometry(ntype.getState().getGeometry());
                FeaturePropertyType fpt = new FeaturePropertyType();
                fpt.setAbstractFeature(oft.createCustomPointFeatureMember(cfm));
                fptList.add(fpt);
            }

            for (TransitionMemberType etype : edgesList) {
                CustomLineFeatureMember clm = new CustomLineFeatureMember();
                clm.setId(etype.getTransition().getId());
                clm.setGeometry(etype.getTransition().getGeometry());
                FeaturePropertyType fpt = new FeaturePropertyType();
                fpt.setAbstractFeature(oft.createCustomLineFeatureMember(clm));
                fptList.add(fpt);
            }

            // marshalldata
            marshallData(fct);
        } catch (JAXBException | SAXException | FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static IndoorFeaturesType unmarshallFile() throws JAXBException, SAXException, FileNotFoundException {
        JAXBContext jc = JAXBContext.newInstance(IndoorFeaturesType.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        // SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        // Schema schema = sf.newSchema(new File("indoorgmlcore.xsd"));
        // unmarshaller.setSchema(schema);
        // create new source
        FileInputStream fis = new FileInputStream("indoorExample.xml");
        StreamSource src = new StreamSource();
        src.setInputStream(fis);
        IndoorFeaturesType customer = unmarshaller.unmarshal(src, IndoorFeaturesType.class).getValue();
        return customer;
    }

    public static void marshallData(FeatureCollectionType ifs) throws JAXBException {
        File file = new File("gmltest.gml");
        JAXBContext jaxbContext = JAXBContext.newInstance(FeatureCollectionType.class, CustomPointFeatureMember.class, CustomLineFeatureMember.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        try {
            jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new GMLNamespaceMapper());
        } catch (PropertyException e) {
            // In case another JAXB implementation is used
            e.printStackTrace();
        }
        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        net.opengis.gml.v_3_2_1.ObjectFactory gmlObjfact = new net.opengis.gml.v_3_2_1.ObjectFactory();
        JAXBElement<?> elem = gmlObjfact.createFeatureCollection(ifs);

        jaxbMarshaller.marshal(elem, file);
        jaxbMarshaller.marshal(elem, System.out);
    }
}
