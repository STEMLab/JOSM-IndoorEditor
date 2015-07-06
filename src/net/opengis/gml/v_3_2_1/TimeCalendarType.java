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
 * <p>Java-Klasse für TimeCalendarType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeCalendarType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}TimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element name="referenceFrame" type="{http://www.opengis.net/gml/3.2}TimeCalendarEraPropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCalendarType", propOrder = {
    "referenceFrame"
})
public class TimeCalendarType
    extends TimeReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<TimeCalendarEraPropertyType> referenceFrame;

    /**
     * Gets the value of the referenceFrame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceFrame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceFrame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeCalendarEraPropertyType }
     * 
     * 
     */
    public List<TimeCalendarEraPropertyType> getReferenceFrame() {
        if (referenceFrame == null) {
            referenceFrame = new ArrayList<TimeCalendarEraPropertyType>();
        }
        return this.referenceFrame;
    }

    public boolean isSetReferenceFrame() {
        return ((this.referenceFrame!= null)&&(!this.referenceFrame.isEmpty()));
    }

    public void unsetReferenceFrame() {
        this.referenceFrame = null;
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
            List<TimeCalendarEraPropertyType> theReferenceFrame;
            theReferenceFrame = this.getReferenceFrame();
            strategy.appendField(locator, this, "referenceFrame", buffer, theReferenceFrame);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeCalendarType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimeCalendarType that = ((TimeCalendarType) object);
        {
            List<TimeCalendarEraPropertyType> lhsReferenceFrame;
            lhsReferenceFrame = this.getReferenceFrame();
            List<TimeCalendarEraPropertyType> rhsReferenceFrame;
            rhsReferenceFrame = that.getReferenceFrame();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceFrame", lhsReferenceFrame), LocatorUtils.property(thatLocator, "referenceFrame", rhsReferenceFrame), lhsReferenceFrame, rhsReferenceFrame)) {
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
            List<TimeCalendarEraPropertyType> theReferenceFrame;
            theReferenceFrame = this.getReferenceFrame();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceFrame", theReferenceFrame), currentHashCode, theReferenceFrame);
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
        if (draftCopy instanceof TimeCalendarType) {
            final TimeCalendarType copy = ((TimeCalendarType) draftCopy);
            if (this.isSetReferenceFrame()) {
                List<TimeCalendarEraPropertyType> sourceReferenceFrame;
                sourceReferenceFrame = this.getReferenceFrame();
                @SuppressWarnings("unchecked")
                List<TimeCalendarEraPropertyType> copyReferenceFrame = ((List<TimeCalendarEraPropertyType> ) strategy.copy(LocatorUtils.property(locator, "referenceFrame", sourceReferenceFrame), sourceReferenceFrame));
                copy.unsetReferenceFrame();
                List<TimeCalendarEraPropertyType> uniqueReferenceFramel = copy.getReferenceFrame();
                uniqueReferenceFramel.addAll(copyReferenceFrame);
            } else {
                copy.unsetReferenceFrame();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimeCalendarType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TimeCalendarType) {
            final TimeCalendarType target = this;
            final TimeCalendarType leftObject = ((TimeCalendarType) left);
            final TimeCalendarType rightObject = ((TimeCalendarType) right);
            {
                List<TimeCalendarEraPropertyType> lhsReferenceFrame;
                lhsReferenceFrame = leftObject.getReferenceFrame();
                List<TimeCalendarEraPropertyType> rhsReferenceFrame;
                rhsReferenceFrame = rightObject.getReferenceFrame();
                target.unsetReferenceFrame();
                List<TimeCalendarEraPropertyType> uniqueReferenceFramel = target.getReferenceFrame();
                uniqueReferenceFramel.addAll(((List<TimeCalendarEraPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "referenceFrame", lhsReferenceFrame), LocatorUtils.property(rightLocator, "referenceFrame", rhsReferenceFrame), lhsReferenceFrame, rhsReferenceFrame)));
            }
        }
    }

    public void setReferenceFrame(List<TimeCalendarEraPropertyType> value) {
        List<TimeCalendarEraPropertyType> draftl = this.getReferenceFrame();
        draftl.addAll(value);
    }

}
