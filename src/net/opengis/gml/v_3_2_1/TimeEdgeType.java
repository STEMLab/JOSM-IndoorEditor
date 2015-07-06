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
 * <p>Java-Klasse für TimeEdgeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeEdgeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimeTopologyPrimitiveType">
 *       &lt;sequence>
 *         &lt;element name="start" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType"/>
 *         &lt;element name="end" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType"/>
 *         &lt;element name="extent" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeEdgeType", propOrder = {
    "start",
    "end",
    "extent"
})
public class TimeEdgeType
    extends AbstractTimeTopologyPrimitiveType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected TimeNodePropertyType start;
    @XmlElement(required = true)
    protected TimeNodePropertyType end;
    protected TimePeriodPropertyType extent;

    /**
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getStart() {
        return start;
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setStart(TimeNodePropertyType value) {
        this.start = value;
    }

    public boolean isSetStart() {
        return (this.start!= null);
    }

    /**
     * Ruft den Wert der end-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getEnd() {
        return end;
    }

    /**
     * Legt den Wert der end-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setEnd(TimeNodePropertyType value) {
        this.end = value;
    }

    public boolean isSetEnd() {
        return (this.end!= null);
    }

    /**
     * Ruft den Wert der extent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getExtent() {
        return extent;
    }

    /**
     * Legt den Wert der extent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setExtent(TimePeriodPropertyType value) {
        this.extent = value;
    }

    public boolean isSetExtent() {
        return (this.extent!= null);
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
        super.appendFields(locator, buffer, strategy);
        {
            TimeNodePropertyType theStart;
            theStart = this.getStart();
            strategy.appendField(locator, this, "start", buffer, theStart);
        }
        {
            TimeNodePropertyType theEnd;
            theEnd = this.getEnd();
            strategy.appendField(locator, this, "end", buffer, theEnd);
        }
        {
            TimePeriodPropertyType theExtent;
            theExtent = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theExtent);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeEdgeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimeEdgeType that = ((TimeEdgeType) object);
        {
            TimeNodePropertyType lhsStart;
            lhsStart = this.getStart();
            TimeNodePropertyType rhsStart;
            rhsStart = that.getStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "start", lhsStart), LocatorUtils.property(thatLocator, "start", rhsStart), lhsStart, rhsStart)) {
                return false;
            }
        }
        {
            TimeNodePropertyType lhsEnd;
            lhsEnd = this.getEnd();
            TimeNodePropertyType rhsEnd;
            rhsEnd = that.getEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "end", lhsEnd), LocatorUtils.property(thatLocator, "end", rhsEnd), lhsEnd, rhsEnd)) {
                return false;
            }
        }
        {
            TimePeriodPropertyType lhsExtent;
            lhsExtent = this.getExtent();
            TimePeriodPropertyType rhsExtent;
            rhsExtent = that.getExtent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extent", lhsExtent), LocatorUtils.property(thatLocator, "extent", rhsExtent), lhsExtent, rhsExtent)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            TimeNodePropertyType theStart;
            theStart = this.getStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "start", theStart), currentHashCode, theStart);
        }
        {
            TimeNodePropertyType theEnd;
            theEnd = this.getEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "end", theEnd), currentHashCode, theEnd);
        }
        {
            TimePeriodPropertyType theExtent;
            theExtent = this.getExtent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extent", theExtent), currentHashCode, theExtent);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof TimeEdgeType) {
            final TimeEdgeType copy = ((TimeEdgeType) draftCopy);
            if (this.isSetStart()) {
                TimeNodePropertyType sourceStart;
                sourceStart = this.getStart();
                TimeNodePropertyType copyStart = ((TimeNodePropertyType) strategy.copy(LocatorUtils.property(locator, "start", sourceStart), sourceStart));
                copy.setStart(copyStart);
            } else {
                copy.start = null;
            }
            if (this.isSetEnd()) {
                TimeNodePropertyType sourceEnd;
                sourceEnd = this.getEnd();
                TimeNodePropertyType copyEnd = ((TimeNodePropertyType) strategy.copy(LocatorUtils.property(locator, "end", sourceEnd), sourceEnd));
                copy.setEnd(copyEnd);
            } else {
                copy.end = null;
            }
            if (this.isSetExtent()) {
                TimePeriodPropertyType sourceExtent;
                sourceExtent = this.getExtent();
                TimePeriodPropertyType copyExtent = ((TimePeriodPropertyType) strategy.copy(LocatorUtils.property(locator, "extent", sourceExtent), sourceExtent));
                copy.setExtent(copyExtent);
            } else {
                copy.extent = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimeEdgeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TimeEdgeType) {
            final TimeEdgeType target = this;
            final TimeEdgeType leftObject = ((TimeEdgeType) left);
            final TimeEdgeType rightObject = ((TimeEdgeType) right);
            {
                TimeNodePropertyType lhsStart;
                lhsStart = leftObject.getStart();
                TimeNodePropertyType rhsStart;
                rhsStart = rightObject.getStart();
                target.setStart(((TimeNodePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "start", lhsStart), LocatorUtils.property(rightLocator, "start", rhsStart), lhsStart, rhsStart)));
            }
            {
                TimeNodePropertyType lhsEnd;
                lhsEnd = leftObject.getEnd();
                TimeNodePropertyType rhsEnd;
                rhsEnd = rightObject.getEnd();
                target.setEnd(((TimeNodePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "end", lhsEnd), LocatorUtils.property(rightLocator, "end", rhsEnd), lhsEnd, rhsEnd)));
            }
            {
                TimePeriodPropertyType lhsExtent;
                lhsExtent = leftObject.getExtent();
                TimePeriodPropertyType rhsExtent;
                rhsExtent = rightObject.getExtent();
                target.setExtent(((TimePeriodPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "extent", lhsExtent), LocatorUtils.property(rightLocator, "extent", rhsExtent), lhsExtent, rhsExtent)));
            }
        }
    }

}
