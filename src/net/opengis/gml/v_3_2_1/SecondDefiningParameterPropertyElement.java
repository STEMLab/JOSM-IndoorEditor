//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom;
import org.jvnet.jaxb2_commons.lang.MergeStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * gml:secondDefiningParameter is a property containing the definition of the second parameter that defines the shape of an ellipsoid. An ellipsoid requires two defining parameters: semi-major axis and inverse flattening or semi-major axis and semi-minor axis. When the reference body is a sphere rather than an ellipsoid, only a single defining parameter is required, namely the radius of the sphere; in that case, the semi-major axis "degenerates" into the radius of the sphere.
 * The inverseFlattening element contains the inverse flattening value of the ellipsoid. This value is a scale factor (or ratio). It uses gml:LengthType with the restriction that the unit of measure referenced by the uom attribute must be suitable for a scale factor, such as percent, permil, or parts-per-million.
 * The semiMinorAxis element contains the length of the semi-minor axis of the ellipsoid. When the isSphere element is included, the ellipsoid is degenerate and is actually a sphere. The sphere is completely defined by the semi-major axis, which is the radius of the sphere.
 * 
 * <p>Java-Klasse für secondDefiningParameter element declaration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;element name="secondDefiningParameter">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}SecondDefiningParameter"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "secondDefiningParameter"
})
@XmlRootElement(name = "secondDefiningParameter")
public class SecondDefiningParameterPropertyElement
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "SecondDefiningParameter", required = true)
    protected SecondDefiningParameterElement secondDefiningParameter;

    /**
     * Ruft den Wert der secondDefiningParameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecondDefiningParameterElement }
     *     
     */
    public SecondDefiningParameterElement getSecondDefiningParameter() {
        return secondDefiningParameter;
    }

    /**
     * Legt den Wert der secondDefiningParameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondDefiningParameterElement }
     *     
     */
    public void setSecondDefiningParameter(SecondDefiningParameterElement value) {
        this.secondDefiningParameter = value;
    }

    public boolean isSetSecondDefiningParameter() {
        return (this.secondDefiningParameter!= null);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            SecondDefiningParameterElement theSecondDefiningParameter;
            theSecondDefiningParameter = this.getSecondDefiningParameter();
            strategy.appendField(locator, this, "secondDefiningParameter", buffer, theSecondDefiningParameter);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecondDefiningParameterPropertyElement)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SecondDefiningParameterPropertyElement that = ((SecondDefiningParameterPropertyElement) object);
        {
            SecondDefiningParameterElement lhsSecondDefiningParameter;
            lhsSecondDefiningParameter = this.getSecondDefiningParameter();
            SecondDefiningParameterElement rhsSecondDefiningParameter;
            rhsSecondDefiningParameter = that.getSecondDefiningParameter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondDefiningParameter", lhsSecondDefiningParameter), LocatorUtils.property(thatLocator, "secondDefiningParameter", rhsSecondDefiningParameter), lhsSecondDefiningParameter, rhsSecondDefiningParameter)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            SecondDefiningParameterElement theSecondDefiningParameter;
            theSecondDefiningParameter = this.getSecondDefiningParameter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondDefiningParameter", theSecondDefiningParameter), currentHashCode, theSecondDefiningParameter);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof SecondDefiningParameterPropertyElement) {
            final SecondDefiningParameterPropertyElement copy = ((SecondDefiningParameterPropertyElement) draftCopy);
            if (this.isSetSecondDefiningParameter()) {
                SecondDefiningParameterElement sourceSecondDefiningParameter;
                sourceSecondDefiningParameter = this.getSecondDefiningParameter();
                SecondDefiningParameterElement copySecondDefiningParameter = ((SecondDefiningParameterElement) strategy.copy(LocatorUtils.property(locator, "secondDefiningParameter", sourceSecondDefiningParameter), sourceSecondDefiningParameter));
                copy.setSecondDefiningParameter(copySecondDefiningParameter);
            } else {
                copy.secondDefiningParameter = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SecondDefiningParameterPropertyElement();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof SecondDefiningParameterPropertyElement) {
            final SecondDefiningParameterPropertyElement target = this;
            final SecondDefiningParameterPropertyElement leftObject = ((SecondDefiningParameterPropertyElement) left);
            final SecondDefiningParameterPropertyElement rightObject = ((SecondDefiningParameterPropertyElement) right);
            {
                SecondDefiningParameterElement lhsSecondDefiningParameter;
                lhsSecondDefiningParameter = leftObject.getSecondDefiningParameter();
                SecondDefiningParameterElement rhsSecondDefiningParameter;
                rhsSecondDefiningParameter = rightObject.getSecondDefiningParameter();
                target.setSecondDefiningParameter(((SecondDefiningParameterElement) strategy.merge(LocatorUtils.property(leftLocator, "secondDefiningParameter", lhsSecondDefiningParameter), LocatorUtils.property(rightLocator, "secondDefiningParameter", rhsSecondDefiningParameter), lhsSecondDefiningParameter, rhsSecondDefiningParameter)));
            }
        }
    }

}
