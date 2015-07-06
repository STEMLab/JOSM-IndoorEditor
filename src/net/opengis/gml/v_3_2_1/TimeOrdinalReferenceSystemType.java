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
 * <p>Java-Klasse für TimeOrdinalReferenceSystemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeOrdinalReferenceSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}TimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element name="component" type="{http://www.opengis.net/gml/3.2}TimeOrdinalEraPropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOrdinalReferenceSystemType", propOrder = {
    "component"
})
public class TimeOrdinalReferenceSystemType
    extends TimeReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<TimeOrdinalEraPropertyType> component;

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeOrdinalEraPropertyType }
     * 
     * 
     */
    public List<TimeOrdinalEraPropertyType> getComponent() {
        if (component == null) {
            component = new ArrayList<TimeOrdinalEraPropertyType>();
        }
        return this.component;
    }

    public boolean isSetComponent() {
        return ((this.component!= null)&&(!this.component.isEmpty()));
    }

    public void unsetComponent() {
        this.component = null;
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
            List<TimeOrdinalEraPropertyType> theComponent;
            theComponent = this.getComponent();
            strategy.appendField(locator, this, "component", buffer, theComponent);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeOrdinalReferenceSystemType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimeOrdinalReferenceSystemType that = ((TimeOrdinalReferenceSystemType) object);
        {
            List<TimeOrdinalEraPropertyType> lhsComponent;
            lhsComponent = this.getComponent();
            List<TimeOrdinalEraPropertyType> rhsComponent;
            rhsComponent = that.getComponent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "component", lhsComponent), LocatorUtils.property(thatLocator, "component", rhsComponent), lhsComponent, rhsComponent)) {
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
            List<TimeOrdinalEraPropertyType> theComponent;
            theComponent = this.getComponent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "component", theComponent), currentHashCode, theComponent);
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
        if (draftCopy instanceof TimeOrdinalReferenceSystemType) {
            final TimeOrdinalReferenceSystemType copy = ((TimeOrdinalReferenceSystemType) draftCopy);
            if (this.isSetComponent()) {
                List<TimeOrdinalEraPropertyType> sourceComponent;
                sourceComponent = this.getComponent();
                @SuppressWarnings("unchecked")
                List<TimeOrdinalEraPropertyType> copyComponent = ((List<TimeOrdinalEraPropertyType> ) strategy.copy(LocatorUtils.property(locator, "component", sourceComponent), sourceComponent));
                copy.unsetComponent();
                List<TimeOrdinalEraPropertyType> uniqueComponentl = copy.getComponent();
                uniqueComponentl.addAll(copyComponent);
            } else {
                copy.unsetComponent();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimeOrdinalReferenceSystemType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TimeOrdinalReferenceSystemType) {
            final TimeOrdinalReferenceSystemType target = this;
            final TimeOrdinalReferenceSystemType leftObject = ((TimeOrdinalReferenceSystemType) left);
            final TimeOrdinalReferenceSystemType rightObject = ((TimeOrdinalReferenceSystemType) right);
            {
                List<TimeOrdinalEraPropertyType> lhsComponent;
                lhsComponent = leftObject.getComponent();
                List<TimeOrdinalEraPropertyType> rhsComponent;
                rhsComponent = rightObject.getComponent();
                target.unsetComponent();
                List<TimeOrdinalEraPropertyType> uniqueComponentl = target.getComponent();
                uniqueComponentl.addAll(((List<TimeOrdinalEraPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "component", lhsComponent), LocatorUtils.property(rightLocator, "component", rhsComponent), lhsComponent, rhsComponent)));
            }
        }
    }

    public void setComponent(List<TimeOrdinalEraPropertyType> value) {
        List<TimeOrdinalEraPropertyType> draftl = this.getComponent();
        draftl.addAll(value);
    }

}
