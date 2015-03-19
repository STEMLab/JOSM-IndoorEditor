package it.trilogis.josm.pesce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.openstreetmap.josm.data.osm.DataSet;

import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;




public class MainTest {

    public static void main(String[] args) {
  
        
        try {
            JAXBContext jc = JAXBContext.newInstance("trilogis.net.opengis.gml.v_3_2_1:"
                    + "net.opengis.gml.v_3_2_1:"
                    + "net.opengis.indoorgml.v_1_0.core:"
                    + "net.opengis.indoorgml.v_1_0.navigation");
            
            Unmarshaller u = jc.createUnmarshaller();
            // System.out.println(doc.getDeclaredType());
            @SuppressWarnings("unchecked")
            JAXBElement<IndoorFeaturesType> jaxb = (JAXBElement<IndoorFeaturesType>) u.unmarshal( new FileInputStream("alba_ground_and_first.xml"));
            IndoorFeaturesType root = (IndoorFeaturesType) jaxb.getValue(); 
            System.out.println("!");
            
            DataSet result = IGMLConverter.convert(root);
            
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
