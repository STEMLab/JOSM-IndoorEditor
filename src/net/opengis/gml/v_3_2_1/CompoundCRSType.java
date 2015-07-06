//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java-Klasse für CompoundCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompoundCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}componentReferenceSystem" maxOccurs="unbounded" minOccurs="2"/>
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
@XmlType(name = "CompoundCRSType", propOrder = {
    "componentReferenceSystem"
})
public class CompoundCRSType
    extends AbstractCRSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "componentReferenceSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<SingleCRSPropertyType>> componentReferenceSystem;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the componentReferenceSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentReferenceSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentReferenceSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SingleCRSPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link SingleCRSPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<SingleCRSPropertyType>> getComponentReferenceSystem() {
        if (componentReferenceSystem == null) {
            componentReferenceSystem = new ArrayList<JAXBElement<SingleCRSPropertyType>>();
        }
        return this.componentReferenceSystem;
    }

    public boolean isSetComponentReferenceSystem() {
        return ((this.componentReferenceSystem!= null)&&(!this.componentReferenceSystem.isEmpty()));
    }

    public void unsetComponentReferenceSystem() {
        this.componentReferenceSystem = null;
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
            List<JAXBElement<SingleCRSPropertyType>> theComponentReferenceSystem;
            theComponentReferenceSystem = this.getComponentReferenceSystem();
            strategy.appendField(locator, this, "componentReferenceSystem", buffer, theComponentReferenceSystem);
        }
        {
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theAggregationType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompoundCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CompoundCRSType that = ((CompoundCRSType) object);
        {
            List<JAXBElement<SingleCRSPropertyType>> lhsComponentReferenceSystem;
            lhsComponentReferenceSystem = this.getComponentReferenceSystem();
            List<JAXBElement<SingleCRSPropertyType>> rhsComponentReferenceSystem;
            rhsComponentReferenceSystem = that.getComponentReferenceSystem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentReferenceSystem", lhsComponentReferenceSystem), LocatorUtils.property(thatLocator, "componentReferenceSystem", rhsComponentReferenceSystem), lhsComponentReferenceSystem, rhsComponentReferenceSystem)) {
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
            List<JAXBElement<SingleCRSPropertyType>> theComponentReferenceSystem;
            theComponentReferenceSystem = this.getComponentReferenceSystem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentReferenceSystem", theComponentReferenceSystem), currentHashCode, theComponentReferenceSystem);
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
        if (draftCopy instanceof CompoundCRSType) {
            final CompoundCRSType copy = ((CompoundCRSType) draftCopy);
            if (this.isSetComponentReferenceSystem()) {
                List<JAXBElement<SingleCRSPropertyType>> sourceComponentReferenceSystem;
                sourceComponentReferenceSystem = this.getComponentReferenceSystem();
                @SuppressWarnings("unchecked")
                List<JAXBElement<SingleCRSPropertyType>> copyComponentReferenceSystem = ((List<JAXBElement<SingleCRSPropertyType>> ) strategy.copy(LocatorUtils.property(locator, "componentReferenceSystem", sourceComponentReferenceSystem), sourceComponentReferenceSystem));
                copy.unsetComponentReferenceSystem();
                List<JAXBElement<SingleCRSPropertyType>> uniqueComponentReferenceSysteml = copy.getComponentReferenceSystem();
                uniqueComponentReferenceSysteml.addAll(copyComponentReferenceSystem);
            } else {
                copy.unsetComponentReferenceSystem();
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
        return new CompoundCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof CompoundCRSType) {
            final CompoundCRSType target = this;
            final CompoundCRSType leftObject = ((CompoundCRSType) left);
            final CompoundCRSType rightObject = ((CompoundCRSType) right);
            {
                List<JAXBElement<SingleCRSPropertyType>> lhsComponentReferenceSystem;
                lhsComponentReferenceSystem = leftObject.getComponentReferenceSystem();
                List<JAXBElement<SingleCRSPropertyType>> rhsComponentReferenceSystem;
                rhsComponentReferenceSystem = rightObject.getComponentReferenceSystem();
                target.unsetComponentReferenceSystem();
                List<JAXBElement<SingleCRSPropertyType>> uniqueComponentReferenceSysteml = target.getComponentReferenceSystem();
                uniqueComponentReferenceSysteml.addAll(((List<JAXBElement<SingleCRSPropertyType>> ) strategy.merge(LocatorUtils.property(leftLocator, "componentReferenceSystem", lhsComponentReferenceSystem), LocatorUtils.property(rightLocator, "componentReferenceSystem", rhsComponentReferenceSystem), lhsComponentReferenceSystem, rhsComponentReferenceSystem)));
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

    public void setComponentReferenceSystem(List<JAXBElement<SingleCRSPropertyType>> value) {
        List<JAXBElement<SingleCRSPropertyType>> draftl = this.getComponentReferenceSystem();
        draftl.addAll(value);
    }

}
