//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.math.BigDecimal;
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
 * <p>Java-Klasse für TimeCalendarEraType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeCalendarEraType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *       &lt;sequence>
 *         &lt;element name="referenceEvent" type="{http://www.opengis.net/gml/3.2}StringOrRefType"/>
 *         &lt;element name="referenceDate" type="{http://www.opengis.net/gml/3.2}CalDate"/>
 *         &lt;element name="julianReference" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="epochOfUse" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCalendarEraType", propOrder = {
    "referenceEvent",
    "referenceDate",
    "julianReference",
    "epochOfUse"
})
public class TimeCalendarEraType
    extends DefinitionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected StringOrRefType referenceEvent;
    @XmlElement(required = true)
    protected String referenceDate;
    @XmlElement(required = true)
    protected BigDecimal julianReference;
    @XmlElement(required = true)
    protected TimePeriodPropertyType epochOfUse;

    /**
     * Ruft den Wert der referenceEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getReferenceEvent() {
        return referenceEvent;
    }

    /**
     * Legt den Wert der referenceEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setReferenceEvent(StringOrRefType value) {
        this.referenceEvent = value;
    }

    public boolean isSetReferenceEvent() {
        return (this.referenceEvent!= null);
    }

    /**
     * Ruft den Wert der referenceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDate() {
        return referenceDate;
    }

    /**
     * Legt den Wert der referenceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(String value) {
        this.referenceDate = value;
    }

    public boolean isSetReferenceDate() {
        return (this.referenceDate!= null);
    }

    /**
     * Ruft den Wert der julianReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJulianReference() {
        return julianReference;
    }

    /**
     * Legt den Wert der julianReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJulianReference(BigDecimal value) {
        this.julianReference = value;
    }

    public boolean isSetJulianReference() {
        return (this.julianReference!= null);
    }

    /**
     * Ruft den Wert der epochOfUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getEpochOfUse() {
        return epochOfUse;
    }

    /**
     * Legt den Wert der epochOfUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setEpochOfUse(TimePeriodPropertyType value) {
        this.epochOfUse = value;
    }

    public boolean isSetEpochOfUse() {
        return (this.epochOfUse!= null);
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
            StringOrRefType theReferenceEvent;
            theReferenceEvent = this.getReferenceEvent();
            strategy.appendField(locator, this, "referenceEvent", buffer, theReferenceEvent);
        }
        {
            String theReferenceDate;
            theReferenceDate = this.getReferenceDate();
            strategy.appendField(locator, this, "referenceDate", buffer, theReferenceDate);
        }
        {
            BigDecimal theJulianReference;
            theJulianReference = this.getJulianReference();
            strategy.appendField(locator, this, "julianReference", buffer, theJulianReference);
        }
        {
            TimePeriodPropertyType theEpochOfUse;
            theEpochOfUse = this.getEpochOfUse();
            strategy.appendField(locator, this, "epochOfUse", buffer, theEpochOfUse);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeCalendarEraType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimeCalendarEraType that = ((TimeCalendarEraType) object);
        {
            StringOrRefType lhsReferenceEvent;
            lhsReferenceEvent = this.getReferenceEvent();
            StringOrRefType rhsReferenceEvent;
            rhsReferenceEvent = that.getReferenceEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceEvent", lhsReferenceEvent), LocatorUtils.property(thatLocator, "referenceEvent", rhsReferenceEvent), lhsReferenceEvent, rhsReferenceEvent)) {
                return false;
            }
        }
        {
            String lhsReferenceDate;
            lhsReferenceDate = this.getReferenceDate();
            String rhsReferenceDate;
            rhsReferenceDate = that.getReferenceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceDate", lhsReferenceDate), LocatorUtils.property(thatLocator, "referenceDate", rhsReferenceDate), lhsReferenceDate, rhsReferenceDate)) {
                return false;
            }
        }
        {
            BigDecimal lhsJulianReference;
            lhsJulianReference = this.getJulianReference();
            BigDecimal rhsJulianReference;
            rhsJulianReference = that.getJulianReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "julianReference", lhsJulianReference), LocatorUtils.property(thatLocator, "julianReference", rhsJulianReference), lhsJulianReference, rhsJulianReference)) {
                return false;
            }
        }
        {
            TimePeriodPropertyType lhsEpochOfUse;
            lhsEpochOfUse = this.getEpochOfUse();
            TimePeriodPropertyType rhsEpochOfUse;
            rhsEpochOfUse = that.getEpochOfUse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "epochOfUse", lhsEpochOfUse), LocatorUtils.property(thatLocator, "epochOfUse", rhsEpochOfUse), lhsEpochOfUse, rhsEpochOfUse)) {
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
            StringOrRefType theReferenceEvent;
            theReferenceEvent = this.getReferenceEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceEvent", theReferenceEvent), currentHashCode, theReferenceEvent);
        }
        {
            String theReferenceDate;
            theReferenceDate = this.getReferenceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceDate", theReferenceDate), currentHashCode, theReferenceDate);
        }
        {
            BigDecimal theJulianReference;
            theJulianReference = this.getJulianReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "julianReference", theJulianReference), currentHashCode, theJulianReference);
        }
        {
            TimePeriodPropertyType theEpochOfUse;
            theEpochOfUse = this.getEpochOfUse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "epochOfUse", theEpochOfUse), currentHashCode, theEpochOfUse);
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
        if (draftCopy instanceof TimeCalendarEraType) {
            final TimeCalendarEraType copy = ((TimeCalendarEraType) draftCopy);
            if (this.isSetReferenceEvent()) {
                StringOrRefType sourceReferenceEvent;
                sourceReferenceEvent = this.getReferenceEvent();
                StringOrRefType copyReferenceEvent = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "referenceEvent", sourceReferenceEvent), sourceReferenceEvent));
                copy.setReferenceEvent(copyReferenceEvent);
            } else {
                copy.referenceEvent = null;
            }
            if (this.isSetReferenceDate()) {
                String sourceReferenceDate;
                sourceReferenceDate = this.getReferenceDate();
                String copyReferenceDate = ((String) strategy.copy(LocatorUtils.property(locator, "referenceDate", sourceReferenceDate), sourceReferenceDate));
                copy.setReferenceDate(copyReferenceDate);
            } else {
                copy.referenceDate = null;
            }
            if (this.isSetJulianReference()) {
                BigDecimal sourceJulianReference;
                sourceJulianReference = this.getJulianReference();
                BigDecimal copyJulianReference = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "julianReference", sourceJulianReference), sourceJulianReference));
                copy.setJulianReference(copyJulianReference);
            } else {
                copy.julianReference = null;
            }
            if (this.isSetEpochOfUse()) {
                TimePeriodPropertyType sourceEpochOfUse;
                sourceEpochOfUse = this.getEpochOfUse();
                TimePeriodPropertyType copyEpochOfUse = ((TimePeriodPropertyType) strategy.copy(LocatorUtils.property(locator, "epochOfUse", sourceEpochOfUse), sourceEpochOfUse));
                copy.setEpochOfUse(copyEpochOfUse);
            } else {
                copy.epochOfUse = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimeCalendarEraType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TimeCalendarEraType) {
            final TimeCalendarEraType target = this;
            final TimeCalendarEraType leftObject = ((TimeCalendarEraType) left);
            final TimeCalendarEraType rightObject = ((TimeCalendarEraType) right);
            {
                StringOrRefType lhsReferenceEvent;
                lhsReferenceEvent = leftObject.getReferenceEvent();
                StringOrRefType rhsReferenceEvent;
                rhsReferenceEvent = rightObject.getReferenceEvent();
                target.setReferenceEvent(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "referenceEvent", lhsReferenceEvent), LocatorUtils.property(rightLocator, "referenceEvent", rhsReferenceEvent), lhsReferenceEvent, rhsReferenceEvent)));
            }
            {
                String lhsReferenceDate;
                lhsReferenceDate = leftObject.getReferenceDate();
                String rhsReferenceDate;
                rhsReferenceDate = rightObject.getReferenceDate();
                target.setReferenceDate(((String) strategy.merge(LocatorUtils.property(leftLocator, "referenceDate", lhsReferenceDate), LocatorUtils.property(rightLocator, "referenceDate", rhsReferenceDate), lhsReferenceDate, rhsReferenceDate)));
            }
            {
                BigDecimal lhsJulianReference;
                lhsJulianReference = leftObject.getJulianReference();
                BigDecimal rhsJulianReference;
                rhsJulianReference = rightObject.getJulianReference();
                target.setJulianReference(((BigDecimal) strategy.merge(LocatorUtils.property(leftLocator, "julianReference", lhsJulianReference), LocatorUtils.property(rightLocator, "julianReference", rhsJulianReference), lhsJulianReference, rhsJulianReference)));
            }
            {
                TimePeriodPropertyType lhsEpochOfUse;
                lhsEpochOfUse = leftObject.getEpochOfUse();
                TimePeriodPropertyType rhsEpochOfUse;
                rhsEpochOfUse = rightObject.getEpochOfUse();
                target.setEpochOfUse(((TimePeriodPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "epochOfUse", lhsEpochOfUse), LocatorUtils.property(rightLocator, "epochOfUse", rhsEpochOfUse), lhsEpochOfUse, rhsEpochOfUse)));
            }
        }
    }

}
