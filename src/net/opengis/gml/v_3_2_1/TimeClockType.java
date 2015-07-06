//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java-Klasse für TimeClockType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeClockType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}TimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element name="referenceEvent" type="{http://www.opengis.net/gml/3.2}StringOrRefType"/>
 *         &lt;element name="referenceTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="utcReference" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="dateBasis" type="{http://www.opengis.net/gml/3.2}TimeCalendarPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeClockType", propOrder = {
    "referenceEvent",
    "referenceTime",
    "utcReference",
    "dateBasis"
})
public class TimeClockType
    extends TimeReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected StringOrRefType referenceEvent;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar referenceTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar utcReference;
    protected List<TimeCalendarPropertyType> dateBasis;

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
     * Ruft den Wert der referenceTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceTime() {
        return referenceTime;
    }

    /**
     * Legt den Wert der referenceTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceTime(XMLGregorianCalendar value) {
        this.referenceTime = value;
    }

    public boolean isSetReferenceTime() {
        return (this.referenceTime!= null);
    }

    /**
     * Ruft den Wert der utcReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcReference() {
        return utcReference;
    }

    /**
     * Legt den Wert der utcReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcReference(XMLGregorianCalendar value) {
        this.utcReference = value;
    }

    public boolean isSetUtcReference() {
        return (this.utcReference!= null);
    }

    /**
     * Gets the value of the dateBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeCalendarPropertyType }
     * 
     * 
     */
    public List<TimeCalendarPropertyType> getDateBasis() {
        if (dateBasis == null) {
            dateBasis = new ArrayList<TimeCalendarPropertyType>();
        }
        return this.dateBasis;
    }

    public boolean isSetDateBasis() {
        return ((this.dateBasis!= null)&&(!this.dateBasis.isEmpty()));
    }

    public void unsetDateBasis() {
        this.dateBasis = null;
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
            XMLGregorianCalendar theReferenceTime;
            theReferenceTime = this.getReferenceTime();
            strategy.appendField(locator, this, "referenceTime", buffer, theReferenceTime);
        }
        {
            XMLGregorianCalendar theUtcReference;
            theUtcReference = this.getUtcReference();
            strategy.appendField(locator, this, "utcReference", buffer, theUtcReference);
        }
        {
            List<TimeCalendarPropertyType> theDateBasis;
            theDateBasis = this.getDateBasis();
            strategy.appendField(locator, this, "dateBasis", buffer, theDateBasis);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeClockType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimeClockType that = ((TimeClockType) object);
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
            XMLGregorianCalendar lhsReferenceTime;
            lhsReferenceTime = this.getReferenceTime();
            XMLGregorianCalendar rhsReferenceTime;
            rhsReferenceTime = that.getReferenceTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceTime", lhsReferenceTime), LocatorUtils.property(thatLocator, "referenceTime", rhsReferenceTime), lhsReferenceTime, rhsReferenceTime)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsUtcReference;
            lhsUtcReference = this.getUtcReference();
            XMLGregorianCalendar rhsUtcReference;
            rhsUtcReference = that.getUtcReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utcReference", lhsUtcReference), LocatorUtils.property(thatLocator, "utcReference", rhsUtcReference), lhsUtcReference, rhsUtcReference)) {
                return false;
            }
        }
        {
            List<TimeCalendarPropertyType> lhsDateBasis;
            lhsDateBasis = this.getDateBasis();
            List<TimeCalendarPropertyType> rhsDateBasis;
            rhsDateBasis = that.getDateBasis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateBasis", lhsDateBasis), LocatorUtils.property(thatLocator, "dateBasis", rhsDateBasis), lhsDateBasis, rhsDateBasis)) {
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
            XMLGregorianCalendar theReferenceTime;
            theReferenceTime = this.getReferenceTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceTime", theReferenceTime), currentHashCode, theReferenceTime);
        }
        {
            XMLGregorianCalendar theUtcReference;
            theUtcReference = this.getUtcReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "utcReference", theUtcReference), currentHashCode, theUtcReference);
        }
        {
            List<TimeCalendarPropertyType> theDateBasis;
            theDateBasis = this.getDateBasis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateBasis", theDateBasis), currentHashCode, theDateBasis);
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
        if (draftCopy instanceof TimeClockType) {
            final TimeClockType copy = ((TimeClockType) draftCopy);
            if (this.isSetReferenceEvent()) {
                StringOrRefType sourceReferenceEvent;
                sourceReferenceEvent = this.getReferenceEvent();
                StringOrRefType copyReferenceEvent = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "referenceEvent", sourceReferenceEvent), sourceReferenceEvent));
                copy.setReferenceEvent(copyReferenceEvent);
            } else {
                copy.referenceEvent = null;
            }
            if (this.isSetReferenceTime()) {
                XMLGregorianCalendar sourceReferenceTime;
                sourceReferenceTime = this.getReferenceTime();
                XMLGregorianCalendar copyReferenceTime = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "referenceTime", sourceReferenceTime), sourceReferenceTime));
                copy.setReferenceTime(copyReferenceTime);
            } else {
                copy.referenceTime = null;
            }
            if (this.isSetUtcReference()) {
                XMLGregorianCalendar sourceUtcReference;
                sourceUtcReference = this.getUtcReference();
                XMLGregorianCalendar copyUtcReference = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "utcReference", sourceUtcReference), sourceUtcReference));
                copy.setUtcReference(copyUtcReference);
            } else {
                copy.utcReference = null;
            }
            if (this.isSetDateBasis()) {
                List<TimeCalendarPropertyType> sourceDateBasis;
                sourceDateBasis = this.getDateBasis();
                @SuppressWarnings("unchecked")
                List<TimeCalendarPropertyType> copyDateBasis = ((List<TimeCalendarPropertyType> ) strategy.copy(LocatorUtils.property(locator, "dateBasis", sourceDateBasis), sourceDateBasis));
                copy.unsetDateBasis();
                List<TimeCalendarPropertyType> uniqueDateBasisl = copy.getDateBasis();
                uniqueDateBasisl.addAll(copyDateBasis);
            } else {
                copy.unsetDateBasis();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimeClockType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TimeClockType) {
            final TimeClockType target = this;
            final TimeClockType leftObject = ((TimeClockType) left);
            final TimeClockType rightObject = ((TimeClockType) right);
            {
                StringOrRefType lhsReferenceEvent;
                lhsReferenceEvent = leftObject.getReferenceEvent();
                StringOrRefType rhsReferenceEvent;
                rhsReferenceEvent = rightObject.getReferenceEvent();
                target.setReferenceEvent(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "referenceEvent", lhsReferenceEvent), LocatorUtils.property(rightLocator, "referenceEvent", rhsReferenceEvent), lhsReferenceEvent, rhsReferenceEvent)));
            }
            {
                XMLGregorianCalendar lhsReferenceTime;
                lhsReferenceTime = leftObject.getReferenceTime();
                XMLGregorianCalendar rhsReferenceTime;
                rhsReferenceTime = rightObject.getReferenceTime();
                target.setReferenceTime(((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "referenceTime", lhsReferenceTime), LocatorUtils.property(rightLocator, "referenceTime", rhsReferenceTime), lhsReferenceTime, rhsReferenceTime)));
            }
            {
                XMLGregorianCalendar lhsUtcReference;
                lhsUtcReference = leftObject.getUtcReference();
                XMLGregorianCalendar rhsUtcReference;
                rhsUtcReference = rightObject.getUtcReference();
                target.setUtcReference(((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "utcReference", lhsUtcReference), LocatorUtils.property(rightLocator, "utcReference", rhsUtcReference), lhsUtcReference, rhsUtcReference)));
            }
            {
                List<TimeCalendarPropertyType> lhsDateBasis;
                lhsDateBasis = leftObject.getDateBasis();
                List<TimeCalendarPropertyType> rhsDateBasis;
                rhsDateBasis = rightObject.getDateBasis();
                target.unsetDateBasis();
                List<TimeCalendarPropertyType> uniqueDateBasisl = target.getDateBasis();
                uniqueDateBasisl.addAll(((List<TimeCalendarPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "dateBasis", lhsDateBasis), LocatorUtils.property(rightLocator, "dateBasis", rhsDateBasis), lhsDateBasis, rhsDateBasis)));
            }
        }
    }

    public void setDateBasis(List<TimeCalendarPropertyType> value) {
        List<TimeCalendarPropertyType> draftl = this.getDateBasis();
        draftl.addAll(value);
    }

}
