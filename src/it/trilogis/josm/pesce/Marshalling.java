package it.trilogis.josm.pesce;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.openstreetmap.josm.Main;

import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;

public class Marshalling {
    
    public static IndoorFeaturesType unmarshal(InputStream in) {
        error(">>> -5");
        try {
            //JAXBContext jc = JAXBContext.newInstance("net.opengis.gml.v_3_2_1:"
            //        + "net.opengis.indoorgml.v_1_0.core:"
            //        + "net.opengis.indoorgml.v_1_0.navigation");

            error(">>> -2");
            JAXBContext jc = JAXBContext.newInstance(IndoorFeaturesType.class);
            error(">>> -1");
            Unmarshaller u = jc.createUnmarshaller();
            error(">>> 0");
            // System.out.println(doc.getDeclaredType());
            //@SuppressWarnings("unchecked")
            //JAXBElement<IndoorFeaturesType> jaxb = (JAXBElement<IndoorFeaturesType>) u.unmarshal(in);
            //IndoorFeaturesType root = (IndoorFeaturesType) jaxb.getValue(); 
            
            StreamSource src = new StreamSource();
            error(">>> 1");
            src.setInputStream(in);
            error(">>> 2");
            return u.unmarshal(src,IndoorFeaturesType.class).getValue();
            
        } catch (JAXBException e) {
            error("Not valid dataset!");
            e.printStackTrace();
            return null;
        }
    }
    
    private static void error(String msg) {
        //System.err.println(msg);
        Main.error(msg);
    }
}
