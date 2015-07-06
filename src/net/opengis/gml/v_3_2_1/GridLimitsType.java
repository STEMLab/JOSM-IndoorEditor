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
 * <p>Java-Klasse für GridLimitsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GridLimitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GridEnvelope" type="{http://www.opengis.net/gml/3.2}GridEnvelopeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridLimitsType", propOrder = {
    "gridEnvelope"
})
public class GridLimitsType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "GridEnvelope", required = true)
    protected GridEnvelopeType gridEnvelope;

    /**
     * Ruft den Wert der gridEnvelope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GridEnvelopeType }
     *     
     */
    public GridEnvelopeType getGridEnvelope() {
        return gridEnvelope;
    }

    /**
     * Legt den Wert der gridEnvelope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GridEnvelopeType }
     *     
     */
    public void setGridEnvelope(GridEnvelopeType value) {
        this.gridEnvelope = value;
    }

    public boolean isSetGridEnvelope() {
        return (this.gridEnvelope!= null);
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
            GridEnvelopeType theGridEnvelope;
            theGridEnvelope = this.getGridEnvelope();
            strategy.appendField(locator, this, "gridEnvelope", buffer, theGridEnvelope);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GridLimitsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GridLimitsType that = ((GridLimitsType) object);
        {
            GridEnvelopeType lhsGridEnvelope;
            lhsGridEnvelope = this.getGridEnvelope();
            GridEnvelopeType rhsGridEnvelope;
            rhsGridEnvelope = that.getGridEnvelope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gridEnvelope", lhsGridEnvelope), LocatorUtils.property(thatLocator, "gridEnvelope", rhsGridEnvelope), lhsGridEnvelope, rhsGridEnvelope)) {
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
            GridEnvelopeType theGridEnvelope;
            theGridEnvelope = this.getGridEnvelope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gridEnvelope", theGridEnvelope), currentHashCode, theGridEnvelope);
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
        if (draftCopy instanceof GridLimitsType) {
            final GridLimitsType copy = ((GridLimitsType) draftCopy);
            if (this.isSetGridEnvelope()) {
                GridEnvelopeType sourceGridEnvelope;
                sourceGridEnvelope = this.getGridEnvelope();
                GridEnvelopeType copyGridEnvelope = ((GridEnvelopeType) strategy.copy(LocatorUtils.property(locator, "gridEnvelope", sourceGridEnvelope), sourceGridEnvelope));
                copy.setGridEnvelope(copyGridEnvelope);
            } else {
                copy.gridEnvelope = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GridLimitsType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof GridLimitsType) {
            final GridLimitsType target = this;
            final GridLimitsType leftObject = ((GridLimitsType) left);
            final GridLimitsType rightObject = ((GridLimitsType) right);
            {
                GridEnvelopeType lhsGridEnvelope;
                lhsGridEnvelope = leftObject.getGridEnvelope();
                GridEnvelopeType rhsGridEnvelope;
                rhsGridEnvelope = rightObject.getGridEnvelope();
                target.setGridEnvelope(((GridEnvelopeType) strategy.merge(LocatorUtils.property(leftLocator, "gridEnvelope", lhsGridEnvelope), LocatorUtils.property(rightLocator, "gridEnvelope", rhsGridEnvelope), lhsGridEnvelope, rhsGridEnvelope)));
            }
        }
    }

}
