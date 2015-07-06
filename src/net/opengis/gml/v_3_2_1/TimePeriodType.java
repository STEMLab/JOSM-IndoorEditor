//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
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
 * <p>Java-Klasse für TimePeriodType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimeGeometricPrimitiveType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="beginPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *           &lt;element name="begin" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="endPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *           &lt;element name="end" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.opengis.net/gml/3.2}timeLength" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodType", propOrder = {
    "beginPosition",
    "begin",
    "endPosition",
    "end",
    "duration",
    "timeInterval"
})
public class TimePeriodType
    extends AbstractTimeGeometricPrimitiveType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected TimePositionType beginPosition;
    protected TimeInstantPropertyType begin;
    protected TimePositionType endPosition;
    protected TimeInstantPropertyType end;
    protected Duration duration;
    protected TimeIntervalLengthType timeInterval;

    /**
     * Ruft den Wert der beginPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getBeginPosition() {
        return beginPosition;
    }

    /**
     * Legt den Wert der beginPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setBeginPosition(TimePositionType value) {
        this.beginPosition = value;
    }

    public boolean isSetBeginPosition() {
        return (this.beginPosition!= null);
    }

    /**
     * Ruft den Wert der begin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getBegin() {
        return begin;
    }

    /**
     * Legt den Wert der begin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setBegin(TimeInstantPropertyType value) {
        this.begin = value;
    }

    public boolean isSetBegin() {
        return (this.begin!= null);
    }

    /**
     * Ruft den Wert der endPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getEndPosition() {
        return endPosition;
    }

    /**
     * Legt den Wert der endPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setEndPosition(TimePositionType value) {
        this.endPosition = value;
    }

    public boolean isSetEndPosition() {
        return (this.endPosition!= null);
    }

    /**
     * Ruft den Wert der end-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getEnd() {
        return end;
    }

    /**
     * Legt den Wert der end-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setEnd(TimeInstantPropertyType value) {
        this.end = value;
    }

    public boolean isSetEnd() {
        return (this.end!= null);
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    public boolean isSetDuration() {
        return (this.duration!= null);
    }

    /**
     * Ruft den Wert der timeInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public TimeIntervalLengthType getTimeInterval() {
        return timeInterval;
    }

    /**
     * Legt den Wert der timeInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public void setTimeInterval(TimeIntervalLengthType value) {
        this.timeInterval = value;
    }

    public boolean isSetTimeInterval() {
        return (this.timeInterval!= null);
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
            TimePositionType theBeginPosition;
            theBeginPosition = this.getBeginPosition();
            strategy.appendField(locator, this, "beginPosition", buffer, theBeginPosition);
        }
        {
            TimeInstantPropertyType theBegin;
            theBegin = this.getBegin();
            strategy.appendField(locator, this, "begin", buffer, theBegin);
        }
        {
            TimePositionType theEndPosition;
            theEndPosition = this.getEndPosition();
            strategy.appendField(locator, this, "endPosition", buffer, theEndPosition);
        }
        {
            TimeInstantPropertyType theEnd;
            theEnd = this.getEnd();
            strategy.appendField(locator, this, "end", buffer, theEnd);
        }
        {
            Duration theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration);
        }
        {
            TimeIntervalLengthType theTimeInterval;
            theTimeInterval = this.getTimeInterval();
            strategy.appendField(locator, this, "timeInterval", buffer, theTimeInterval);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimePeriodType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimePeriodType that = ((TimePeriodType) object);
        {
            TimePositionType lhsBeginPosition;
            lhsBeginPosition = this.getBeginPosition();
            TimePositionType rhsBeginPosition;
            rhsBeginPosition = that.getBeginPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beginPosition", lhsBeginPosition), LocatorUtils.property(thatLocator, "beginPosition", rhsBeginPosition), lhsBeginPosition, rhsBeginPosition)) {
                return false;
            }
        }
        {
            TimeInstantPropertyType lhsBegin;
            lhsBegin = this.getBegin();
            TimeInstantPropertyType rhsBegin;
            rhsBegin = that.getBegin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "begin", lhsBegin), LocatorUtils.property(thatLocator, "begin", rhsBegin), lhsBegin, rhsBegin)) {
                return false;
            }
        }
        {
            TimePositionType lhsEndPosition;
            lhsEndPosition = this.getEndPosition();
            TimePositionType rhsEndPosition;
            rhsEndPosition = that.getEndPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endPosition", lhsEndPosition), LocatorUtils.property(thatLocator, "endPosition", rhsEndPosition), lhsEndPosition, rhsEndPosition)) {
                return false;
            }
        }
        {
            TimeInstantPropertyType lhsEnd;
            lhsEnd = this.getEnd();
            TimeInstantPropertyType rhsEnd;
            rhsEnd = that.getEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "end", lhsEnd), LocatorUtils.property(thatLocator, "end", rhsEnd), lhsEnd, rhsEnd)) {
                return false;
            }
        }
        {
            Duration lhsDuration;
            lhsDuration = this.getDuration();
            Duration rhsDuration;
            rhsDuration = that.getDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duration", lhsDuration), LocatorUtils.property(thatLocator, "duration", rhsDuration), lhsDuration, rhsDuration)) {
                return false;
            }
        }
        {
            TimeIntervalLengthType lhsTimeInterval;
            lhsTimeInterval = this.getTimeInterval();
            TimeIntervalLengthType rhsTimeInterval;
            rhsTimeInterval = that.getTimeInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeInterval", lhsTimeInterval), LocatorUtils.property(thatLocator, "timeInterval", rhsTimeInterval), lhsTimeInterval, rhsTimeInterval)) {
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
            TimePositionType theBeginPosition;
            theBeginPosition = this.getBeginPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beginPosition", theBeginPosition), currentHashCode, theBeginPosition);
        }
        {
            TimeInstantPropertyType theBegin;
            theBegin = this.getBegin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "begin", theBegin), currentHashCode, theBegin);
        }
        {
            TimePositionType theEndPosition;
            theEndPosition = this.getEndPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endPosition", theEndPosition), currentHashCode, theEndPosition);
        }
        {
            TimeInstantPropertyType theEnd;
            theEnd = this.getEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "end", theEnd), currentHashCode, theEnd);
        }
        {
            Duration theDuration;
            theDuration = this.getDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duration", theDuration), currentHashCode, theDuration);
        }
        {
            TimeIntervalLengthType theTimeInterval;
            theTimeInterval = this.getTimeInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeInterval", theTimeInterval), currentHashCode, theTimeInterval);
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
        if (draftCopy instanceof TimePeriodType) {
            final TimePeriodType copy = ((TimePeriodType) draftCopy);
            if (this.isSetBeginPosition()) {
                TimePositionType sourceBeginPosition;
                sourceBeginPosition = this.getBeginPosition();
                TimePositionType copyBeginPosition = ((TimePositionType) strategy.copy(LocatorUtils.property(locator, "beginPosition", sourceBeginPosition), sourceBeginPosition));
                copy.setBeginPosition(copyBeginPosition);
            } else {
                copy.beginPosition = null;
            }
            if (this.isSetBegin()) {
                TimeInstantPropertyType sourceBegin;
                sourceBegin = this.getBegin();
                TimeInstantPropertyType copyBegin = ((TimeInstantPropertyType) strategy.copy(LocatorUtils.property(locator, "begin", sourceBegin), sourceBegin));
                copy.setBegin(copyBegin);
            } else {
                copy.begin = null;
            }
            if (this.isSetEndPosition()) {
                TimePositionType sourceEndPosition;
                sourceEndPosition = this.getEndPosition();
                TimePositionType copyEndPosition = ((TimePositionType) strategy.copy(LocatorUtils.property(locator, "endPosition", sourceEndPosition), sourceEndPosition));
                copy.setEndPosition(copyEndPosition);
            } else {
                copy.endPosition = null;
            }
            if (this.isSetEnd()) {
                TimeInstantPropertyType sourceEnd;
                sourceEnd = this.getEnd();
                TimeInstantPropertyType copyEnd = ((TimeInstantPropertyType) strategy.copy(LocatorUtils.property(locator, "end", sourceEnd), sourceEnd));
                copy.setEnd(copyEnd);
            } else {
                copy.end = null;
            }
            if (this.isSetDuration()) {
                Duration sourceDuration;
                sourceDuration = this.getDuration();
                Duration copyDuration = ((Duration) strategy.copy(LocatorUtils.property(locator, "duration", sourceDuration), sourceDuration));
                copy.setDuration(copyDuration);
            } else {
                copy.duration = null;
            }
            if (this.isSetTimeInterval()) {
                TimeIntervalLengthType sourceTimeInterval;
                sourceTimeInterval = this.getTimeInterval();
                TimeIntervalLengthType copyTimeInterval = ((TimeIntervalLengthType) strategy.copy(LocatorUtils.property(locator, "timeInterval", sourceTimeInterval), sourceTimeInterval));
                copy.setTimeInterval(copyTimeInterval);
            } else {
                copy.timeInterval = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimePeriodType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TimePeriodType) {
            final TimePeriodType target = this;
            final TimePeriodType leftObject = ((TimePeriodType) left);
            final TimePeriodType rightObject = ((TimePeriodType) right);
            {
                TimePositionType lhsBeginPosition;
                lhsBeginPosition = leftObject.getBeginPosition();
                TimePositionType rhsBeginPosition;
                rhsBeginPosition = rightObject.getBeginPosition();
                target.setBeginPosition(((TimePositionType) strategy.merge(LocatorUtils.property(leftLocator, "beginPosition", lhsBeginPosition), LocatorUtils.property(rightLocator, "beginPosition", rhsBeginPosition), lhsBeginPosition, rhsBeginPosition)));
            }
            {
                TimeInstantPropertyType lhsBegin;
                lhsBegin = leftObject.getBegin();
                TimeInstantPropertyType rhsBegin;
                rhsBegin = rightObject.getBegin();
                target.setBegin(((TimeInstantPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "begin", lhsBegin), LocatorUtils.property(rightLocator, "begin", rhsBegin), lhsBegin, rhsBegin)));
            }
            {
                TimePositionType lhsEndPosition;
                lhsEndPosition = leftObject.getEndPosition();
                TimePositionType rhsEndPosition;
                rhsEndPosition = rightObject.getEndPosition();
                target.setEndPosition(((TimePositionType) strategy.merge(LocatorUtils.property(leftLocator, "endPosition", lhsEndPosition), LocatorUtils.property(rightLocator, "endPosition", rhsEndPosition), lhsEndPosition, rhsEndPosition)));
            }
            {
                TimeInstantPropertyType lhsEnd;
                lhsEnd = leftObject.getEnd();
                TimeInstantPropertyType rhsEnd;
                rhsEnd = rightObject.getEnd();
                target.setEnd(((TimeInstantPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "end", lhsEnd), LocatorUtils.property(rightLocator, "end", rhsEnd), lhsEnd, rhsEnd)));
            }
            {
                Duration lhsDuration;
                lhsDuration = leftObject.getDuration();
                Duration rhsDuration;
                rhsDuration = rightObject.getDuration();
                target.setDuration(((Duration) strategy.merge(LocatorUtils.property(leftLocator, "duration", lhsDuration), LocatorUtils.property(rightLocator, "duration", rhsDuration), lhsDuration, rhsDuration)));
            }
            {
                TimeIntervalLengthType lhsTimeInterval;
                lhsTimeInterval = leftObject.getTimeInterval();
                TimeIntervalLengthType rhsTimeInterval;
                rhsTimeInterval = rightObject.getTimeInterval();
                target.setTimeInterval(((TimeIntervalLengthType) strategy.merge(LocatorUtils.property(leftLocator, "timeInterval", lhsTimeInterval), LocatorUtils.property(rightLocator, "timeInterval", rhsTimeInterval), lhsTimeInterval, rhsTimeInterval)));
            }
        }
    }

}
