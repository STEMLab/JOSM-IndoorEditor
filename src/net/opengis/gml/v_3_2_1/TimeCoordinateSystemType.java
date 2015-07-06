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
 * <p>Java-Klasse für TimeCoordinateSystemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeCoordinateSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}TimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="originPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *           &lt;element name="origin" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;/choice>
 *         &lt;element name="interval" type="{http://www.opengis.net/gml/3.2}TimeIntervalLengthType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCoordinateSystemType", propOrder = {
    "originPosition",
    "origin",
    "interval"
})
public class TimeCoordinateSystemType
    extends TimeReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected TimePositionType originPosition;
    protected TimeInstantPropertyType origin;
    @XmlElement(required = true)
    protected TimeIntervalLengthType interval;

    /**
     * Ruft den Wert der originPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getOriginPosition() {
        return originPosition;
    }

    /**
     * Legt den Wert der originPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setOriginPosition(TimePositionType value) {
        this.originPosition = value;
    }

    public boolean isSetOriginPosition() {
        return (this.originPosition!= null);
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setOrigin(TimeInstantPropertyType value) {
        this.origin = value;
    }

    public boolean isSetOrigin() {
        return (this.origin!= null);
    }

    /**
     * Ruft den Wert der interval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public TimeIntervalLengthType getInterval() {
        return interval;
    }

    /**
     * Legt den Wert der interval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public void setInterval(TimeIntervalLengthType value) {
        this.interval = value;
    }

    public boolean isSetInterval() {
        return (this.interval!= null);
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
            TimePositionType theOriginPosition;
            theOriginPosition = this.getOriginPosition();
            strategy.appendField(locator, this, "originPosition", buffer, theOriginPosition);
        }
        {
            TimeInstantPropertyType theOrigin;
            theOrigin = this.getOrigin();
            strategy.appendField(locator, this, "origin", buffer, theOrigin);
        }
        {
            TimeIntervalLengthType theInterval;
            theInterval = this.getInterval();
            strategy.appendField(locator, this, "interval", buffer, theInterval);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeCoordinateSystemType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimeCoordinateSystemType that = ((TimeCoordinateSystemType) object);
        {
            TimePositionType lhsOriginPosition;
            lhsOriginPosition = this.getOriginPosition();
            TimePositionType rhsOriginPosition;
            rhsOriginPosition = that.getOriginPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originPosition", lhsOriginPosition), LocatorUtils.property(thatLocator, "originPosition", rhsOriginPosition), lhsOriginPosition, rhsOriginPosition)) {
                return false;
            }
        }
        {
            TimeInstantPropertyType lhsOrigin;
            lhsOrigin = this.getOrigin();
            TimeInstantPropertyType rhsOrigin;
            rhsOrigin = that.getOrigin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "origin", lhsOrigin), LocatorUtils.property(thatLocator, "origin", rhsOrigin), lhsOrigin, rhsOrigin)) {
                return false;
            }
        }
        {
            TimeIntervalLengthType lhsInterval;
            lhsInterval = this.getInterval();
            TimeIntervalLengthType rhsInterval;
            rhsInterval = that.getInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interval", lhsInterval), LocatorUtils.property(thatLocator, "interval", rhsInterval), lhsInterval, rhsInterval)) {
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
            TimePositionType theOriginPosition;
            theOriginPosition = this.getOriginPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originPosition", theOriginPosition), currentHashCode, theOriginPosition);
        }
        {
            TimeInstantPropertyType theOrigin;
            theOrigin = this.getOrigin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "origin", theOrigin), currentHashCode, theOrigin);
        }
        {
            TimeIntervalLengthType theInterval;
            theInterval = this.getInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "interval", theInterval), currentHashCode, theInterval);
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
        if (draftCopy instanceof TimeCoordinateSystemType) {
            final TimeCoordinateSystemType copy = ((TimeCoordinateSystemType) draftCopy);
            if (this.isSetOriginPosition()) {
                TimePositionType sourceOriginPosition;
                sourceOriginPosition = this.getOriginPosition();
                TimePositionType copyOriginPosition = ((TimePositionType) strategy.copy(LocatorUtils.property(locator, "originPosition", sourceOriginPosition), sourceOriginPosition));
                copy.setOriginPosition(copyOriginPosition);
            } else {
                copy.originPosition = null;
            }
            if (this.isSetOrigin()) {
                TimeInstantPropertyType sourceOrigin;
                sourceOrigin = this.getOrigin();
                TimeInstantPropertyType copyOrigin = ((TimeInstantPropertyType) strategy.copy(LocatorUtils.property(locator, "origin", sourceOrigin), sourceOrigin));
                copy.setOrigin(copyOrigin);
            } else {
                copy.origin = null;
            }
            if (this.isSetInterval()) {
                TimeIntervalLengthType sourceInterval;
                sourceInterval = this.getInterval();
                TimeIntervalLengthType copyInterval = ((TimeIntervalLengthType) strategy.copy(LocatorUtils.property(locator, "interval", sourceInterval), sourceInterval));
                copy.setInterval(copyInterval);
            } else {
                copy.interval = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimeCoordinateSystemType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TimeCoordinateSystemType) {
            final TimeCoordinateSystemType target = this;
            final TimeCoordinateSystemType leftObject = ((TimeCoordinateSystemType) left);
            final TimeCoordinateSystemType rightObject = ((TimeCoordinateSystemType) right);
            {
                TimePositionType lhsOriginPosition;
                lhsOriginPosition = leftObject.getOriginPosition();
                TimePositionType rhsOriginPosition;
                rhsOriginPosition = rightObject.getOriginPosition();
                target.setOriginPosition(((TimePositionType) strategy.merge(LocatorUtils.property(leftLocator, "originPosition", lhsOriginPosition), LocatorUtils.property(rightLocator, "originPosition", rhsOriginPosition), lhsOriginPosition, rhsOriginPosition)));
            }
            {
                TimeInstantPropertyType lhsOrigin;
                lhsOrigin = leftObject.getOrigin();
                TimeInstantPropertyType rhsOrigin;
                rhsOrigin = rightObject.getOrigin();
                target.setOrigin(((TimeInstantPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "origin", lhsOrigin), LocatorUtils.property(rightLocator, "origin", rhsOrigin), lhsOrigin, rhsOrigin)));
            }
            {
                TimeIntervalLengthType lhsInterval;
                lhsInterval = leftObject.getInterval();
                TimeIntervalLengthType rhsInterval;
                rhsInterval = rightObject.getInterval();
                target.setInterval(((TimeIntervalLengthType) strategy.merge(LocatorUtils.property(leftLocator, "interval", lhsInterval), LocatorUtils.property(rightLocator, "interval", rhsInterval), lhsInterval, rhsInterval)));
            }
        }
    }

}
