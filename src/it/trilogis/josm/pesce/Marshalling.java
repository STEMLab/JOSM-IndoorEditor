package it.trilogis.josm.pesce;

import it.trilogis.ingoorgml.utils.GMLNamespaceMapper;

import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.openstreetmap.josm.Main;

import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;

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
            
        } catch (JAXBException e) {
            error("Not valid dataset!");
            e.printStackTrace();
            return null;
        }
    }
    
    public static void marshal(IndoorFeaturesType document, OutputStream output) {
        
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(IndoorFeaturesType.class);
            Marshaller m = jaxbContext.createMarshaller();
            // ADd custom mapping:
            // m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new GMLNamespaceMapper());
            m.marshal(document, output);
        } catch (JAXBException e) {
            e.printStackTrace();
            return;
        }
        
        
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
