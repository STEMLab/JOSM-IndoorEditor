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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java-Klasse für CompositeValueType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompositeValueType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}valueComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}valueComponents" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeValueType", propOrder = {
    "valueComponent",
    "valueComponents"
})
@XmlSeeAlso({
    ValueArrayType.class
})
public class CompositeValueType
    extends AbstractGMLType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<ValuePropertyType> valueComponent;
    protected ValueArrayPropertyType valueComponents;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the valueComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuePropertyType }
     * 
     * 
     */
    public List<ValuePropertyType> getValueComponent() {
        if (valueComponent == null) {
            valueComponent = new ArrayList<ValuePropertyType>();
        }
        return this.valueComponent;
    }

    public boolean isSetValueComponent() {
        return ((this.valueComponent!= null)&&(!this.valueComponent.isEmpty()));
    }

    public void unsetValueComponent() {
        this.valueComponent = null;
    }

    /**
     * Ruft den Wert der valueComponents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueArrayPropertyType }
     *     
     */
    public ValueArrayPropertyType getValueComponents() {
        return valueComponents;
    }

    /**
     * Legt den Wert der valueComponents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueArrayPropertyType }
     *     
     */
    public void setValueComponents(ValueArrayPropertyType value) {
        this.valueComponents = value;
    }

    public boolean isSetValueComponents() {
        return (this.valueComponents!= null);
    }

    /**
     * Ruft den Wert der aggregationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Legt den Wert der aggregationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

    public boolean isSetAggregationType() {
        return (this.aggregationType!= null);
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
            List<ValuePropertyType> theValueComponent;
            theValueComponent = this.getValueComponent();
            strategy.appendField(locator, this, "valueComponent", buffer, theValueComponent);
        }
        {
            ValueArrayPropertyType theValueComponents;
            theValueComponents = this.getValueComponents();
            strategy.appendField(locator, this, "valueComponents", buffer, theValueComponents);
        }
        {
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theAggregationType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompositeValueType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CompositeValueType that = ((CompositeValueType) object);
        {
            List<ValuePropertyType> lhsValueComponent;
            lhsValueComponent = this.getValueComponent();
            List<ValuePropertyType> rhsValueComponent;
            rhsValueComponent = that.getValueComponent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueComponent", lhsValueComponent), LocatorUtils.property(thatLocator, "valueComponent", rhsValueComponent), lhsValueComponent, rhsValueComponent)) {
                return false;
            }
        }
        {
            ValueArrayPropertyType lhsValueComponents;
            lhsValueComponents = this.getValueComponents();
            ValueArrayPropertyType rhsValueComponents;
            rhsValueComponents = that.getValueComponents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueComponents", lhsValueComponents), LocatorUtils.property(thatLocator, "valueComponents", rhsValueComponents), lhsValueComponents, rhsValueComponents)) {
                return false;
            }
        }
        {
            AggregationType lhsAggregationType;
            lhsAggregationType = this.getAggregationType();
            AggregationType rhsAggregationType;
            rhsAggregationType = that.getAggregationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregationType", lhsAggregationType), LocatorUtils.property(thatLocator, "aggregationType", rhsAggregationType), lhsAggregationType, rhsAggregationType)) {
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
            List<ValuePropertyType> theValueComponent;
            theValueComponent = this.getValueComponent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueComponent", theValueComponent), currentHashCode, theValueComponent);
        }
        {
            ValueArrayPropertyType theValueComponents;
            theValueComponents = this.getValueComponents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueComponents", theValueComponents), currentHashCode, theValueComponents);
        }
        {
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregationType", theAggregationType), currentHashCode, theAggregationType);
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
        if (draftCopy instanceof CompositeValueType) {
            final CompositeValueType copy = ((CompositeValueType) draftCopy);
            if (this.isSetValueComponent()) {
                List<ValuePropertyType> sourceValueComponent;
                sourceValueComponent = this.getValueComponent();
                @SuppressWarnings("unchecked")
                List<ValuePropertyType> copyValueComponent = ((List<ValuePropertyType> ) strategy.copy(LocatorUtils.property(locator, "valueComponent", sourceValueComponent), sourceValueComponent));
                copy.unsetValueComponent();
                List<ValuePropertyType> uniqueValueComponentl = copy.getValueComponent();
                uniqueValueComponentl.addAll(copyValueComponent);
            } else {
                copy.unsetValueComponent();
            }
            if (this.isSetValueComponents()) {
                ValueArrayPropertyType sourceValueComponents;
                sourceValueComponents = this.getValueComponents();
                ValueArrayPropertyType copyValueComponents = ((ValueArrayPropertyType) strategy.copy(LocatorUtils.property(locator, "valueComponents", sourceValueComponents), sourceValueComponents));
                copy.setValueComponents(copyValueComponents);
            } else {
                copy.valueComponents = null;
            }
            if (this.isSetAggregationType()) {
                AggregationType sourceAggregationType;
                sourceAggregationType = this.getAggregationType();
                AggregationType copyAggregationType = ((AggregationType) strategy.copy(LocatorUtils.property(locator, "aggregationType", sourceAggregationType), sourceAggregationType));
                copy.setAggregationType(copyAggregationType);
            } else {
                copy.aggregationType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CompositeValueType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof CompositeValueType) {
            final CompositeValueType target = this;
            final CompositeValueType leftObject = ((CompositeValueType) left);
            final CompositeValueType rightObject = ((CompositeValueType) right);
            {
                List<ValuePropertyType> lhsValueComponent;
                lhsValueComponent = leftObject.getValueComponent();
                List<ValuePropertyType> rhsValueComponent;
                rhsValueComponent = rightObject.getValueComponent();
                target.unsetValueComponent();
                List<ValuePropertyType> uniqueValueComponentl = target.getValueComponent();
                uniqueValueComponentl.addAll(((List<ValuePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "valueComponent", lhsValueComponent), LocatorUtils.property(rightLocator, "valueComponent", rhsValueComponent), lhsValueComponent, rhsValueComponent)));
            }
            {
                ValueArrayPropertyType lhsValueComponents;
                lhsValueComponents = leftObject.getValueComponents();
                ValueArrayPropertyType rhsValueComponents;
                rhsValueComponents = rightObject.getValueComponents();
                target.setValueComponents(((ValueArrayPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "valueComponents", lhsValueComponents), LocatorUtils.property(rightLocator, "valueComponents", rhsValueComponents), lhsValueComponents, rhsValueComponents)));
            }
            {
                AggregationType lhsAggregationType;
                lhsAggregationType = leftObject.getAggregationType();
                AggregationType rhsAggregationType;
                rhsAggregationType = rightObject.getAggregationType();
                target.setAggregationType(((AggregationType) strategy.merge(LocatorUtils.property(leftLocator, "aggregationType", lhsAggregationType), LocatorUtils.property(rightLocator, "aggregationType", rhsAggregationType), lhsAggregationType, rhsAggregationType)));
            }
        }
    }

    public void setValueComponent(List<ValuePropertyType> value) {
        List<ValuePropertyType> draftl = this.getValueComponent();
        draftl.addAll(value);
    }

}
