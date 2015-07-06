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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java-Klasse für AbstractDatumType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}anchorDefinition" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}realizationEpoch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDatumType", propOrder = {
    "domainOfValidity",
    "scope",
    "anchorDefinition",
    "realizationEpoch"
})
@XmlSeeAlso({
    VerticalDatumType.class,
    EngineeringDatumType.class,
    ImageDatumType.class,
    GeodeticDatumType.class,
    TemporalDatumBaseType.class
})
public abstract class AbstractDatumType
    extends IdentifiedObjectType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected DomainOfValidityElement domainOfValidity;
    @XmlElement(required = true)
    protected List<String> scope;
    @XmlElementRef(name = "anchorDefinition", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CodeType> anchorDefinition;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar realizationEpoch;

    /**
     * Ruft den Wert der domainOfValidity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomainOfValidityElement }
     *     
     */
    public DomainOfValidityElement getDomainOfValidity() {
        return domainOfValidity;
    }

    /**
     * Legt den Wert der domainOfValidity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainOfValidityElement }
     *     
     */
    public void setDomainOfValidity(DomainOfValidityElement value) {
        this.domainOfValidity = value;
    }

    public boolean isSetDomainOfValidity() {
        return (this.domainOfValidity!= null);
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScope() {
        if (scope == null) {
            scope = new ArrayList<String>();
        }
        return this.scope;
    }

    public boolean isSetScope() {
        return ((this.scope!= null)&&(!this.scope.isEmpty()));
    }

    public void unsetScope() {
        this.scope = null;
    }

    /**
     * Ruft den Wert der anchorDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public JAXBElement<CodeType> getAnchorDefinition() {
        return anchorDefinition;
    }

    /**
     * Legt den Wert der anchorDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public void setAnchorDefinition(JAXBElement<CodeType> value) {
        this.anchorDefinition = value;
    }

    public boolean isSetAnchorDefinition() {
        return (this.anchorDefinition!= null);
    }

    /**
     * Ruft den Wert der realizationEpoch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealizationEpoch() {
        return realizationEpoch;
    }

    /**
     * Legt den Wert der realizationEpoch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRealizationEpoch(XMLGregorianCalendar value) {
        this.realizationEpoch = value;
    }

    public boolean isSetRealizationEpoch() {
        return (this.realizationEpoch!= null);
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
            DomainOfValidityElement theDomainOfValidity;
            theDomainOfValidity = this.getDomainOfValidity();
            strategy.appendField(locator, this, "domainOfValidity", buffer, theDomainOfValidity);
        }
        {
            List<String> theScope;
            theScope = this.getScope();
            strategy.appendField(locator, this, "scope", buffer, theScope);
        }
        {
            JAXBElement<CodeType> theAnchorDefinition;
            theAnchorDefinition = this.getAnchorDefinition();
            strategy.appendField(locator, this, "anchorDefinition", buffer, theAnchorDefinition);
        }
        {
            XMLGregorianCalendar theRealizationEpoch;
            theRealizationEpoch = this.getRealizationEpoch();
            strategy.appendField(locator, this, "realizationEpoch", buffer, theRealizationEpoch);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractDatumType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AbstractDatumType that = ((AbstractDatumType) object);
        {
            DomainOfValidityElement lhsDomainOfValidity;
            lhsDomainOfValidity = this.getDomainOfValidity();
            DomainOfValidityElement rhsDomainOfValidity;
            rhsDomainOfValidity = that.getDomainOfValidity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domainOfValidity", lhsDomainOfValidity), LocatorUtils.property(thatLocator, "domainOfValidity", rhsDomainOfValidity), lhsDomainOfValidity, rhsDomainOfValidity)) {
                return false;
            }
        }
        {
            List<String> lhsScope;
            lhsScope = this.getScope();
            List<String> rhsScope;
            rhsScope = that.getScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scope", lhsScope), LocatorUtils.property(thatLocator, "scope", rhsScope), lhsScope, rhsScope)) {
                return false;
            }
        }
        {
            JAXBElement<CodeType> lhsAnchorDefinition;
            lhsAnchorDefinition = this.getAnchorDefinition();
            JAXBElement<CodeType> rhsAnchorDefinition;
            rhsAnchorDefinition = that.getAnchorDefinition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anchorDefinition", lhsAnchorDefinition), LocatorUtils.property(thatLocator, "anchorDefinition", rhsAnchorDefinition), lhsAnchorDefinition, rhsAnchorDefinition)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsRealizationEpoch;
            lhsRealizationEpoch = this.getRealizationEpoch();
            XMLGregorianCalendar rhsRealizationEpoch;
            rhsRealizationEpoch = that.getRealizationEpoch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realizationEpoch", lhsRealizationEpoch), LocatorUtils.property(thatLocator, "realizationEpoch", rhsRealizationEpoch), lhsRealizationEpoch, rhsRealizationEpoch)) {
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
            DomainOfValidityElement theDomainOfValidity;
            theDomainOfValidity = this.getDomainOfValidity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domainOfValidity", theDomainOfValidity), currentHashCode, theDomainOfValidity);
        }
        {
            List<String> theScope;
            theScope = this.getScope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scope", theScope), currentHashCode, theScope);
        }
        {
            JAXBElement<CodeType> theAnchorDefinition;
            theAnchorDefinition = this.getAnchorDefinition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anchorDefinition", theAnchorDefinition), currentHashCode, theAnchorDefinition);
        }
        {
            XMLGregorianCalendar theRealizationEpoch;
            theRealizationEpoch = this.getRealizationEpoch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "realizationEpoch", theRealizationEpoch), currentHashCode, theRealizationEpoch);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof AbstractDatumType) {
            final AbstractDatumType copy = ((AbstractDatumType) target);
            if (this.isSetDomainOfValidity()) {
                DomainOfValidityElement sourceDomainOfValidity;
                sourceDomainOfValidity = this.getDomainOfValidity();
                DomainOfValidityElement copyDomainOfValidity = ((DomainOfValidityElement) strategy.copy(LocatorUtils.property(locator, "domainOfValidity", sourceDomainOfValidity), sourceDomainOfValidity));
                copy.setDomainOfValidity(copyDomainOfValidity);
            } else {
                copy.domainOfValidity = null;
            }
            if (this.isSetScope()) {
                List<String> sourceScope;
                sourceScope = this.getScope();
                @SuppressWarnings("unchecked")
                List<String> copyScope = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "scope", sourceScope), sourceScope));
                copy.unsetScope();
                List<String> uniqueScopel = copy.getScope();
                uniqueScopel.addAll(copyScope);
            } else {
                copy.unsetScope();
            }
            if (this.isSetAnchorDefinition()) {
                JAXBElement<CodeType> sourceAnchorDefinition;
                sourceAnchorDefinition = this.getAnchorDefinition();
                @SuppressWarnings("unchecked")
                JAXBElement<CodeType> copyAnchorDefinition = ((JAXBElement<CodeType> ) strategy.copy(LocatorUtils.property(locator, "anchorDefinition", sourceAnchorDefinition), sourceAnchorDefinition));
                copy.setAnchorDefinition(copyAnchorDefinition);
            } else {
                copy.anchorDefinition = null;
            }
            if (this.isSetRealizationEpoch()) {
                XMLGregorianCalendar sourceRealizationEpoch;
                sourceRealizationEpoch = this.getRealizationEpoch();
                XMLGregorianCalendar copyRealizationEpoch = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "realizationEpoch", sourceRealizationEpoch), sourceRealizationEpoch));
                copy.setRealizationEpoch(copyRealizationEpoch);
            } else {
                copy.realizationEpoch = null;
            }
        }
        return target;
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof AbstractDatumType) {
            final AbstractDatumType target = this;
            final AbstractDatumType leftObject = ((AbstractDatumType) left);
            final AbstractDatumType rightObject = ((AbstractDatumType) right);
            {
                DomainOfValidityElement lhsDomainOfValidity;
                lhsDomainOfValidity = leftObject.getDomainOfValidity();
                DomainOfValidityElement rhsDomainOfValidity;
                rhsDomainOfValidity = rightObject.getDomainOfValidity();
                target.setDomainOfValidity(((DomainOfValidityElement) strategy.merge(LocatorUtils.property(leftLocator, "domainOfValidity", lhsDomainOfValidity), LocatorUtils.property(rightLocator, "domainOfValidity", rhsDomainOfValidity), lhsDomainOfValidity, rhsDomainOfValidity)));
            }
            {
                List<String> lhsScope;
                lhsScope = leftObject.getScope();
                List<String> rhsScope;
                rhsScope = rightObject.getScope();
                target.unsetScope();
                List<String> uniqueScopel = target.getScope();
                uniqueScopel.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "scope", lhsScope), LocatorUtils.property(rightLocator, "scope", rhsScope), lhsScope, rhsScope)));
            }
            {
                JAXBElement<CodeType> lhsAnchorDefinition;
                lhsAnchorDefinition = leftObject.getAnchorDefinition();
                JAXBElement<CodeType> rhsAnchorDefinition;
                rhsAnchorDefinition = rightObject.getAnchorDefinition();
                target.setAnchorDefinition(((JAXBElement<CodeType> ) strategy.merge(LocatorUtils.property(leftLocator, "anchorDefinition", lhsAnchorDefinition), LocatorUtils.property(rightLocator, "anchorDefinition", rhsAnchorDefinition), lhsAnchorDefinition, rhsAnchorDefinition)));
            }
            {
                XMLGregorianCalendar lhsRealizationEpoch;
                lhsRealizationEpoch = leftObject.getRealizationEpoch();
                XMLGregorianCalendar rhsRealizationEpoch;
                rhsRealizationEpoch = rightObject.getRealizationEpoch();
                target.setRealizationEpoch(((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "realizationEpoch", lhsRealizationEpoch), LocatorUtils.property(rightLocator, "realizationEpoch", rhsRealizationEpoch), lhsRealizationEpoch, rhsRealizationEpoch)));
            }
        }
    }

    public void setScope(List<String> value) {
        List<String> draftl = this.getScope();
        draftl.addAll(value);
    }

}
