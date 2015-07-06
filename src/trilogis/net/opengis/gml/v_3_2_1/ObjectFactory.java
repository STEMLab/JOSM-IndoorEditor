//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//

package trilogis.net.opengis.gml.v_3_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the net.opengis.gml.v_3_2_1 package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this
 * class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CustomPointFeatureMember_QNAME = new QName("http://www.trilogis.it/gml/3.2.1", "CustomPointFeatureMember");
    private final static QName _CustomLineFeatureMember_QNAME = new QName("http://www.trilogis.it/gml/3.2.1", "CustomLineFeatureMember");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trilogis.net.opengis.gml.v_3_2_1
     */
    public ObjectFactory() {
    }

    @XmlElementDecl(namespace = "http://www.trilogis.it/gml/3.2.1", name = "CustomPointFeatureMember", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<CustomPointFeatureMember> createCustomPointFeatureMember(CustomPointFeatureMember value) {
        return new JAXBElement<CustomPointFeatureMember>(_CustomPointFeatureMember_QNAME, CustomPointFeatureMember.class, null, value);
    }

    public CustomPointFeatureMember createCustomPointFeatureMember() {
        return new CustomPointFeatureMember();
    }
    
    @XmlElementDecl(namespace = "http://www.trilogis.it/gml/3.2.1", name = "CustomLineFeatureMember", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<CustomLineFeatureMember> createCustomLineFeatureMember(CustomLineFeatureMember value) {
        return new JAXBElement<CustomLineFeatureMember>(_CustomLineFeatureMember_QNAME, CustomLineFeatureMember.class, null, value);
    }

    public CustomLineFeatureMember createCustomLineFeatureMember() {
        return new CustomLineFeatureMember();
    }
}
