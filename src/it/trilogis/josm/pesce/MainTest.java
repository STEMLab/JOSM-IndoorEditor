package it.trilogis.josm.pesce;

import it.trilogis.josm.pesce.converters.IGMLConverter;

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
            IGMLConverter.convertDebug(Marshalling.unmarshal(new FileInputStream("alba_ground_and_first.igml")));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
