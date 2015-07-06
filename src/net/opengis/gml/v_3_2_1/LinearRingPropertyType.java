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
 * A property with the content model of gml:LinearRingPropertyType encapsulates a linear ring to represent a component of a surface boundary.
 * 
 * <p>Java-Klasse für LinearRingPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinearRingPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}LinearRing"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearRingPropertyType", propOrder = {
    "linearRing"
})
public class LinearRingPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "LinearRing", required = true)
    protected LinearRingType linearRing;

    /**
     * Ruft den Wert der linearRing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinearRingType }
     *     
     */
    public LinearRingType getLinearRing() {
        return linearRing;
    }

    /**
     * Legt den Wert der linearRing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearRingType }
     *     
     */
    public void setLinearRing(LinearRingType value) {
        this.linearRing = value;
    }

    public boolean isSetLinearRing() {
        return (this.linearRing!= null);
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
            LinearRingType theLinearRing;
            theLinearRing = this.getLinearRing();
            strategy.appendField(locator, this, "linearRing", buffer, theLinearRing);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LinearRingPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LinearRingPropertyType that = ((LinearRingPropertyType) object);
        {
            LinearRingType lhsLinearRing;
            lhsLinearRing = this.getLinearRing();
            LinearRingType rhsLinearRing;
            rhsLinearRing = that.getLinearRing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "linearRing", lhsLinearRing), LocatorUtils.property(thatLocator, "linearRing", rhsLinearRing), lhsLinearRing, rhsLinearRing)) {
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
            LinearRingType theLinearRing;
            theLinearRing = this.getLinearRing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "linearRing", theLinearRing), currentHashCode, theLinearRing);
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
        if (draftCopy instanceof LinearRingPropertyType) {
            final LinearRingPropertyType copy = ((LinearRingPropertyType) draftCopy);
            if (this.isSetLinearRing()) {
                LinearRingType sourceLinearRing;
                sourceLinearRing = this.getLinearRing();
                LinearRingType copyLinearRing = ((LinearRingType) strategy.copy(LocatorUtils.property(locator, "linearRing", sourceLinearRing), sourceLinearRing));
                copy.setLinearRing(copyLinearRing);
            } else {
                copy.linearRing = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LinearRingPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof LinearRingPropertyType) {
            final LinearRingPropertyType target = this;
            final LinearRingPropertyType leftObject = ((LinearRingPropertyType) left);
            final LinearRingPropertyType rightObject = ((LinearRingPropertyType) right);
            {
                LinearRingType lhsLinearRing;
                lhsLinearRing = leftObject.getLinearRing();
                LinearRingType rhsLinearRing;
                rhsLinearRing = rightObject.getLinearRing();
                target.setLinearRing(((LinearRingType) strategy.merge(LocatorUtils.property(leftLocator, "linearRing", lhsLinearRing), LocatorUtils.property(rightLocator, "linearRing", rhsLinearRing), lhsLinearRing, rhsLinearRing)));
            }
        }
    }

}
