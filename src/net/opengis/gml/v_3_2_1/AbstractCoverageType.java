//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * The base type for coverages is gml:AbstractCoverageType. The basic elements of a coverage can be seen in this content model: the coverage contains gml:domainSet and gml:rangeSet properties. The gml:domainSet property describes the domain of the coverage and the gml:rangeSet property describes the range of the coverage.
 * 
 * <p>Java-Klasse für AbstractCoverageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractCoverageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}domainSet"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}rangeSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoverageType", propOrder = {
    "domainSet",
    "rangeSet"
})
@XmlSeeAlso({
    DiscreteCoverageType.class,
    AbstractContinuousCoverageType.class
})
public abstract class AbstractCoverageType
    extends AbstractFeatureType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "domainSet", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<DomainSetType> domainSet;
    @XmlElement(required = true)
    protected RangeSetType rangeSet;

    /**
     * Ruft den Wert der domainSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     
     */
    public JAXBElement<DomainSetType> getDomainSet() {
        return domainSet;
    }

    /**
     * Legt den Wert der domainSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     
     */
    public void setDomainSet(JAXBElement<DomainSetType> value) {
        this.domainSet = value;
    }

    public boolean isSetDomainSet() {
        return (this.domainSet!= null);
    }

    /**
     * Ruft den Wert der rangeSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RangeSetType }
     *     
     */
    public RangeSetType getRangeSet() {
        return rangeSet;
    }

    /**
     * Legt den Wert der rangeSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeSetType }
     *     
     */
    public void setRangeSet(RangeSetType value) {
        this.rangeSet = value;
    }

    public boolean isSetRangeSet() {
        return (this.rangeSet!= null);
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
            JAXBElement<DomainSetType> theDomainSet;
            theDomainSet = this.getDomainSet();
            strategy.appendField(locator, this, "domainSet", buffer, theDomainSet);
        }
        {
            RangeSetType theRangeSet;
            theRangeSet = this.getRangeSet();
            strategy.appendField(locator, this, "rangeSet", buffer, theRangeSet);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractCoverageType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AbstractCoverageType that = ((AbstractCoverageType) object);
        {
            JAXBElement<DomainSetType> lhsDomainSet;
            lhsDomainSet = this.getDomainSet();
            JAXBElement<DomainSetType> rhsDomainSet;
            rhsDomainSet = that.getDomainSet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domainSet", lhsDomainSet), LocatorUtils.property(thatLocator, "domainSet", rhsDomainSet), lhsDomainSet, rhsDomainSet)) {
                return false;
            }
        }
        {
            RangeSetType lhsRangeSet;
            lhsRangeSet = this.getRangeSet();
            RangeSetType rhsRangeSet;
            rhsRangeSet = that.getRangeSet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rangeSet", lhsRangeSet), LocatorUtils.property(thatLocator, "rangeSet", rhsRangeSet), lhsRangeSet, rhsRangeSet)) {
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
            JAXBElement<DomainSetType> theDomainSet;
            theDomainSet = this.getDomainSet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domainSet", theDomainSet), currentHashCode, theDomainSet);
        }
        {
            RangeSetType theRangeSet;
            theRangeSet = this.getRangeSet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rangeSet", theRangeSet), currentHashCode, theRangeSet);
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
        if (target instanceof AbstractCoverageType) {
            final AbstractCoverageType copy = ((AbstractCoverageType) target);
            if (this.isSetDomainSet()) {
                JAXBElement<DomainSetType> sourceDomainSet;
                sourceDomainSet = this.getDomainSet();
                @SuppressWarnings("unchecked")
                JAXBElement<DomainSetType> copyDomainSet = ((JAXBElement<DomainSetType> ) strategy.copy(LocatorUtils.property(locator, "domainSet", sourceDomainSet), sourceDomainSet));
                copy.setDomainSet(copyDomainSet);
            } else {
                copy.domainSet = null;
            }
            if (this.isSetRangeSet()) {
                RangeSetType sourceRangeSet;
                sourceRangeSet = this.getRangeSet();
                RangeSetType copyRangeSet = ((RangeSetType) strategy.copy(LocatorUtils.property(locator, "rangeSet", sourceRangeSet), sourceRangeSet));
                copy.setRangeSet(copyRangeSet);
            } else {
                copy.rangeSet = null;
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
        if (right instanceof AbstractCoverageType) {
            final AbstractCoverageType target = this;
            final AbstractCoverageType leftObject = ((AbstractCoverageType) left);
            final AbstractCoverageType rightObject = ((AbstractCoverageType) right);
            {
                JAXBElement<DomainSetType> lhsDomainSet;
                lhsDomainSet = leftObject.getDomainSet();
                JAXBElement<DomainSetType> rhsDomainSet;
                rhsDomainSet = rightObject.getDomainSet();
                target.setDomainSet(((JAXBElement<DomainSetType> ) strategy.merge(LocatorUtils.property(leftLocator, "domainSet", lhsDomainSet), LocatorUtils.property(rightLocator, "domainSet", rhsDomainSet), lhsDomainSet, rhsDomainSet)));
            }
            {
                RangeSetType lhsRangeSet;
                lhsRangeSet = leftObject.getRangeSet();
                RangeSetType rhsRangeSet;
                rhsRangeSet = rightObject.getRangeSet();
                target.setRangeSet(((RangeSetType) strategy.merge(LocatorUtils.property(leftLocator, "rangeSet", lhsRangeSet), LocatorUtils.property(rightLocator, "rangeSet", rhsRangeSet), lhsRangeSet, rhsRangeSet)));
            }
        }
    }

}
