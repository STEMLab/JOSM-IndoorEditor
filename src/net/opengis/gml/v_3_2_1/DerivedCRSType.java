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
 * <p>Java-Klasse für DerivedCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralDerivedCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}baseCRS"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}derivedCRSType"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}coordinateSystem"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedCRSType", propOrder = {
    "baseCRS",
    "derivedCRSType",
    "coordinateSystem"
})
public class DerivedCRSType
    extends AbstractGeneralDerivedCRSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected SingleCRSPropertyType baseCRS;
    @XmlElement(required = true)
    protected CodeWithAuthorityType derivedCRSType;
    @XmlElementRef(name = "coordinateSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CoordinateSystemPropertyType> coordinateSystem;

    /**
     * Ruft den Wert der baseCRS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleCRSPropertyType }
     *     
     */
    public SingleCRSPropertyType getBaseCRS() {
        return baseCRS;
    }

    /**
     * Legt den Wert der baseCRS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleCRSPropertyType }
     *     
     */
    public void setBaseCRS(SingleCRSPropertyType value) {
        this.baseCRS = value;
    }

    public boolean isSetBaseCRS() {
        return (this.baseCRS!= null);
    }

    /**
     * Ruft den Wert der derivedCRSType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getDerivedCRSType() {
        return derivedCRSType;
    }

    /**
     * Legt den Wert der derivedCRSType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setDerivedCRSType(CodeWithAuthorityType value) {
        this.derivedCRSType = value;
    }

    public boolean isSetDerivedCRSType() {
        return (this.derivedCRSType!= null);
    }

    /**
     * Ruft den Wert der coordinateSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<CoordinateSystemPropertyType> getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * Legt den Wert der coordinateSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public void setCoordinateSystem(JAXBElement<CoordinateSystemPropertyType> value) {
        this.coordinateSystem = value;
    }

    public boolean isSetCoordinateSystem() {
        return (this.coordinateSystem!= null);
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
            SingleCRSPropertyType theBaseCRS;
            theBaseCRS = this.getBaseCRS();
            strategy.appendField(locator, this, "baseCRS", buffer, theBaseCRS);
        }
        {
            CodeWithAuthorityType theDerivedCRSType;
            theDerivedCRSType = this.getDerivedCRSType();
            strategy.appendField(locator, this, "derivedCRSType", buffer, theDerivedCRSType);
        }
        {
            JAXBElement<CoordinateSystemPropertyType> theCoordinateSystem;
            theCoordinateSystem = this.getCoordinateSystem();
            strategy.appendField(locator, this, "coordinateSystem", buffer, theCoordinateSystem);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DerivedCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DerivedCRSType that = ((DerivedCRSType) object);
        {
            SingleCRSPropertyType lhsBaseCRS;
            lhsBaseCRS = this.getBaseCRS();
            SingleCRSPropertyType rhsBaseCRS;
            rhsBaseCRS = that.getBaseCRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseCRS", lhsBaseCRS), LocatorUtils.property(thatLocator, "baseCRS", rhsBaseCRS), lhsBaseCRS, rhsBaseCRS)) {
                return false;
            }
        }
        {
            CodeWithAuthorityType lhsDerivedCRSType;
            lhsDerivedCRSType = this.getDerivedCRSType();
            CodeWithAuthorityType rhsDerivedCRSType;
            rhsDerivedCRSType = that.getDerivedCRSType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "derivedCRSType", lhsDerivedCRSType), LocatorUtils.property(thatLocator, "derivedCRSType", rhsDerivedCRSType), lhsDerivedCRSType, rhsDerivedCRSType)) {
                return false;
            }
        }
        {
            JAXBElement<CoordinateSystemPropertyType> lhsCoordinateSystem;
            lhsCoordinateSystem = this.getCoordinateSystem();
            JAXBElement<CoordinateSystemPropertyType> rhsCoordinateSystem;
            rhsCoordinateSystem = that.getCoordinateSystem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coordinateSystem", lhsCoordinateSystem), LocatorUtils.property(thatLocator, "coordinateSystem", rhsCoordinateSystem), lhsCoordinateSystem, rhsCoordinateSystem)) {
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
            SingleCRSPropertyType theBaseCRS;
            theBaseCRS = this.getBaseCRS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseCRS", theBaseCRS), currentHashCode, theBaseCRS);
        }
        {
            CodeWithAuthorityType theDerivedCRSType;
            theDerivedCRSType = this.getDerivedCRSType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "derivedCRSType", theDerivedCRSType), currentHashCode, theDerivedCRSType);
        }
        {
            JAXBElement<CoordinateSystemPropertyType> theCoordinateSystem;
            theCoordinateSystem = this.getCoordinateSystem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinateSystem", theCoordinateSystem), currentHashCode, theCoordinateSystem);
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
        if (draftCopy instanceof DerivedCRSType) {
            final DerivedCRSType copy = ((DerivedCRSType) draftCopy);
            if (this.isSetBaseCRS()) {
                SingleCRSPropertyType sourceBaseCRS;
                sourceBaseCRS = this.getBaseCRS();
                SingleCRSPropertyType copyBaseCRS = ((SingleCRSPropertyType) strategy.copy(LocatorUtils.property(locator, "baseCRS", sourceBaseCRS), sourceBaseCRS));
                copy.setBaseCRS(copyBaseCRS);
            } else {
                copy.baseCRS = null;
            }
            if (this.isSetDerivedCRSType()) {
                CodeWithAuthorityType sourceDerivedCRSType;
                sourceDerivedCRSType = this.getDerivedCRSType();
                CodeWithAuthorityType copyDerivedCRSType = ((CodeWithAuthorityType) strategy.copy(LocatorUtils.property(locator, "derivedCRSType", sourceDerivedCRSType), sourceDerivedCRSType));
                copy.setDerivedCRSType(copyDerivedCRSType);
            } else {
                copy.derivedCRSType = null;
            }
            if (this.isSetCoordinateSystem()) {
                JAXBElement<CoordinateSystemPropertyType> sourceCoordinateSystem;
                sourceCoordinateSystem = this.getCoordinateSystem();
                @SuppressWarnings("unchecked")
                JAXBElement<CoordinateSystemPropertyType> copyCoordinateSystem = ((JAXBElement<CoordinateSystemPropertyType> ) strategy.copy(LocatorUtils.property(locator, "coordinateSystem", sourceCoordinateSystem), sourceCoordinateSystem));
                copy.setCoordinateSystem(copyCoordinateSystem);
            } else {
                copy.coordinateSystem = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DerivedCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof DerivedCRSType) {
            final DerivedCRSType target = this;
            final DerivedCRSType leftObject = ((DerivedCRSType) left);
            final DerivedCRSType rightObject = ((DerivedCRSType) right);
            {
                SingleCRSPropertyType lhsBaseCRS;
                lhsBaseCRS = leftObject.getBaseCRS();
                SingleCRSPropertyType rhsBaseCRS;
                rhsBaseCRS = rightObject.getBaseCRS();
                target.setBaseCRS(((SingleCRSPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "baseCRS", lhsBaseCRS), LocatorUtils.property(rightLocator, "baseCRS", rhsBaseCRS), lhsBaseCRS, rhsBaseCRS)));
            }
            {
                CodeWithAuthorityType lhsDerivedCRSType;
                lhsDerivedCRSType = leftObject.getDerivedCRSType();
                CodeWithAuthorityType rhsDerivedCRSType;
                rhsDerivedCRSType = rightObject.getDerivedCRSType();
                target.setDerivedCRSType(((CodeWithAuthorityType) strategy.merge(LocatorUtils.property(leftLocator, "derivedCRSType", lhsDerivedCRSType), LocatorUtils.property(rightLocator, "derivedCRSType", rhsDerivedCRSType), lhsDerivedCRSType, rhsDerivedCRSType)));
            }
            {
                JAXBElement<CoordinateSystemPropertyType> lhsCoordinateSystem;
                lhsCoordinateSystem = leftObject.getCoordinateSystem();
                JAXBElement<CoordinateSystemPropertyType> rhsCoordinateSystem;
                rhsCoordinateSystem = rightObject.getCoordinateSystem();
                target.setCoordinateSystem(((JAXBElement<CoordinateSystemPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "coordinateSystem", lhsCoordinateSystem), LocatorUtils.property(rightLocator, "coordinateSystem", rhsCoordinateSystem), lhsCoordinateSystem, rhsCoordinateSystem)));
            }
        }
    }

}
