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
 * <p>Java-Klasse für AbstractGeneralDerivedCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeneralDerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}conversion"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralDerivedCRSType", propOrder = {
    "conversion"
})
@XmlSeeAlso({
    DerivedCRSType.class,
    ProjectedCRSType.class
})
public abstract class AbstractGeneralDerivedCRSType
    extends AbstractCRSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "conversion", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<GeneralConversionPropertyType> conversion;

    /**
     * Ruft den Wert der conversion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}
     *     
     */
    public JAXBElement<GeneralConversionPropertyType> getConversion() {
        return conversion;
    }

    /**
     * Legt den Wert der conversion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}
     *     
     */
    public void setConversion(JAXBElement<GeneralConversionPropertyType> value) {
        this.conversion = value;
    }

    public boolean isSetConversion() {
        return (this.conversion!= null);
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
            JAXBElement<GeneralConversionPropertyType> theConversion;
            theConversion = this.getConversion();
            strategy.appendField(locator, this, "conversion", buffer, theConversion);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractGeneralDerivedCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AbstractGeneralDerivedCRSType that = ((AbstractGeneralDerivedCRSType) object);
        {
            JAXBElement<GeneralConversionPropertyType> lhsConversion;
            lhsConversion = this.getConversion();
            JAXBElement<GeneralConversionPropertyType> rhsConversion;
            rhsConversion = that.getConversion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conversion", lhsConversion), LocatorUtils.property(thatLocator, "conversion", rhsConversion), lhsConversion, rhsConversion)) {
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
            JAXBElement<GeneralConversionPropertyType> theConversion;
            theConversion = this.getConversion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conversion", theConversion), currentHashCode, theConversion);
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
        if (target instanceof AbstractGeneralDerivedCRSType) {
            final AbstractGeneralDerivedCRSType copy = ((AbstractGeneralDerivedCRSType) target);
            if (this.isSetConversion()) {
                JAXBElement<GeneralConversionPropertyType> sourceConversion;
                sourceConversion = this.getConversion();
                @SuppressWarnings("unchecked")
                JAXBElement<GeneralConversionPropertyType> copyConversion = ((JAXBElement<GeneralConversionPropertyType> ) strategy.copy(LocatorUtils.property(locator, "conversion", sourceConversion), sourceConversion));
                copy.setConversion(copyConversion);
            } else {
                copy.conversion = null;
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
        if (right instanceof AbstractGeneralDerivedCRSType) {
            final AbstractGeneralDerivedCRSType target = this;
            final AbstractGeneralDerivedCRSType leftObject = ((AbstractGeneralDerivedCRSType) left);
            final AbstractGeneralDerivedCRSType rightObject = ((AbstractGeneralDerivedCRSType) right);
            {
                JAXBElement<GeneralConversionPropertyType> lhsConversion;
                lhsConversion = leftObject.getConversion();
                JAXBElement<GeneralConversionPropertyType> rhsConversion;
                rhsConversion = rightObject.getConversion();
                target.setConversion(((JAXBElement<GeneralConversionPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "conversion", lhsConversion), LocatorUtils.property(rightLocator, "conversion", rhsConversion), lhsConversion, rhsConversion)));
            }
        }
    }

}
