package it.trilogis.josm.pesce;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import net.opengis.indoorgml.v_1_0.core.*;

import org.openstreetmap.josm.Main;


public class Marshalling {
    
    public static IndoorFeaturesType unmarshal(InputStream in) {
        debug(">>> -5");
        try {
            //JAXBContext jc = JAXBContext.newInstance("net.opengis.gml.v_3_2_1:"
            //        + "net.opengis.indoorgml.v_1_0.core:"
            //        + "net.opengis.indoorgml.v_1_0.navigation");

            debug(">>> -2");
            JAXBContext jc = JAXBContext.newInstance(IndoorFeaturesType.class);
            debug(">>> -1");
            Unmarshaller u = jc.createUnmarshaller();
            debug(">>> 0");
            // System.out.println(doc.getDeclaredType());
            //@SuppressWarnings("unchecked")
            //JAXBElement<IndoorFeaturesType> jaxb = (JAXBElement<IndoorFeaturesType>) u.unmarshal(in);
            //IndoorFeaturesType root = (IndoorFeaturesType) jaxb.getValue(); 
            
            StreamSource src = new StreamSource();
            debug(">>> 1");
            src.setInputStream(in);
            debug(">>> 2");
            return u.unmarshal(src,IndoorFeaturesType.class).getValue();
            
        } catch (JAXBException | IllegalArgumentException e) {
            error("Not valid dataset!");
            e.printStackTrace();
            return null;
        }
    }
    
    //temp
    private static boolean ipn(Object par, String name) {
        if(null==par) {
            System.err.println(name+"==NULL");
            return true;
        }
        return false;
    }
    private static boolean checkIntegrity(IndoorFeaturesType document) {
        // Check null fields
        MultiLayeredGraphType mgt = document.getMultiLayeredGraph();
        if(ipn(mgt,"mgt")) return false;
        for(SpaceLayersType slst : mgt.getSpaceLayers()) {
            if(ipn(slst,"slst")) return false;
            
            for(SpaceLayerMemberType slmt : slst.getSpaceLayerMember()) {
                if(ipn(slmt,"slmt")) return false;
                SpaceLayerType slt = slmt.getSpaceLayer();
                if(ipn(slt,"slt")) return false;
                
                for(NodesType nt : slt.getNodes()){
                    if(ipn(nt,"nt")) return false;
                    nt.getStateMember();
                    for(StateMemberType smt : nt.getStateMember()){
                        if(ipn(smt,"smt")) return false;
                        smt.getState(); // This could be null
                        //System.out.println("Nothing to see here");
                    }
                }
            }
            
        }
        return true;
    }
    
    public static void doMarshal(IndoorFeaturesType document, Writer writer, OutputStream stream) {

        if(null == writer && null == stream) {
            System.out.println("[doMarshal] Writer nor Stream are defined");
            return;
        }
        
        if(!checkIntegrity(document)) {
            System.err.println("[doMarshal] Problems with the document");
            return;
        }
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(IndoorFeaturesType.class);
            Marshaller m = jaxbContext.createMarshaller();
            // ADd custom mapping:
            // m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new GMLNamespaceMapper());
            if(null != writer) {
                m.marshal(document, writer);
            } else if(null != stream) {
                m.marshal(document, stream);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return;
        }        
    }
    
    public static void marshal(IndoorFeaturesType document, Writer writer) {
        doMarshal(document,writer,null);
    }
    
    public static void marshal(IndoorFeaturesType document, OutputStream stream) {
        doMarshal(document,null,stream);
    }
    
    private static void error(String msg) {
        //System.err.println(msg);
        Main.error(msg);
    }
    private static void debug(String msg) {
        //System.err.println(msg);
        Main.debug(msg);
    }
}
