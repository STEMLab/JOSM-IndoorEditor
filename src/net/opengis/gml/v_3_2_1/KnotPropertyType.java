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
 * gml:KnotPropertyType encapsulates a knot to use it in a geometric type.
 * 
 * <p>Java-Klasse für KnotPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="KnotPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Knot" type="{http://www.opengis.net/gml/3.2}KnotType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnotPropertyType", propOrder = {
    "knot"
})
public class KnotPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "Knot", required = true)
    protected KnotType knot;

    /**
     * Ruft den Wert der knot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KnotType }
     *     
     */
    public KnotType getKnot() {
        return knot;
    }

    /**
     * Legt den Wert der knot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KnotType }
     *     
     */
    public void setKnot(KnotType value) {
        this.knot = value;
    }

    public boolean isSetKnot() {
        return (this.knot!= null);
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
            KnotType theKnot;
            theKnot = this.getKnot();
            strategy.appendField(locator, this, "knot", buffer, theKnot);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof KnotPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final KnotPropertyType that = ((KnotPropertyType) object);
        {
            KnotType lhsKnot;
            lhsKnot = this.getKnot();
            KnotType rhsKnot;
            rhsKnot = that.getKnot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "knot", lhsKnot), LocatorUtils.property(thatLocator, "knot", rhsKnot), lhsKnot, rhsKnot)) {
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
            KnotType theKnot;
            theKnot = this.getKnot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "knot", theKnot), currentHashCode, theKnot);
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
        if (draftCopy instanceof KnotPropertyType) {
            final KnotPropertyType copy = ((KnotPropertyType) draftCopy);
            if (this.isSetKnot()) {
                KnotType sourceKnot;
                sourceKnot = this.getKnot();
                KnotType copyKnot = ((KnotType) strategy.copy(LocatorUtils.property(locator, "knot", sourceKnot), sourceKnot));
                copy.setKnot(copyKnot);
            } else {
                copy.knot = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new KnotPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof KnotPropertyType) {
            final KnotPropertyType target = this;
            final KnotPropertyType leftObject = ((KnotPropertyType) left);
            final KnotPropertyType rightObject = ((KnotPropertyType) right);
            {
                KnotType lhsKnot;
                lhsKnot = leftObject.getKnot();
                KnotType rhsKnot;
                rhsKnot = rightObject.getKnot();
                target.setKnot(((KnotType) strategy.merge(LocatorUtils.property(leftLocator, "knot", lhsKnot), LocatorUtils.property(rightLocator, "knot", rhsKnot), lhsKnot, rhsKnot)));
            }
        }
    }

}
