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
 * <p>Java-Klasse für ImageCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImageCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}affineCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}usesObliqueCartesianCS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}imageDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageCRSType", propOrder = {
    "cartesianCS",
    "affineCS",
    "usesObliqueCartesianCS",
    "imageDatum"
})
public class ImageCRSType
    extends AbstractCRSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    @XmlElementRef(name = "affineCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<AffineCSPropertyType> affineCS;
    protected ObliqueCartesianCSPropertyType usesObliqueCartesianCS;
    @XmlElementRef(name = "imageDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<ImageDatumPropertyType> imageDatum;

    /**
     * Ruft den Wert der cartesianCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<CartesianCSPropertyType> getCartesianCS() {
        return cartesianCS;
    }

    /**
     * Legt den Wert der cartesianCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public void setCartesianCS(JAXBElement<CartesianCSPropertyType> value) {
        this.cartesianCS = value;
    }

    public boolean isSetCartesianCS() {
        return (this.cartesianCS!= null);
    }

    /**
     * Ruft den Wert der affineCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<AffineCSPropertyType> getAffineCS() {
        return affineCS;
    }

    /**
     * Legt den Wert der affineCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     
     */
    public void setAffineCS(JAXBElement<AffineCSPropertyType> value) {
        this.affineCS = value;
    }

    public boolean isSetAffineCS() {
        return (this.affineCS!= null);
    }

    /**
     * Ruft den Wert der usesObliqueCartesianCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObliqueCartesianCSPropertyType }
     *     
     */
    public ObliqueCartesianCSPropertyType getUsesObliqueCartesianCS() {
        return usesObliqueCartesianCS;
    }

    /**
     * Legt den Wert der usesObliqueCartesianCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObliqueCartesianCSPropertyType }
     *     
     */
    public void setUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType value) {
        this.usesObliqueCartesianCS = value;
    }

    public boolean isSetUsesObliqueCartesianCS() {
        return (this.usesObliqueCartesianCS!= null);
    }

    /**
     * Ruft den Wert der imageDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<ImageDatumPropertyType> getImageDatum() {
        return imageDatum;
    }

    /**
     * Legt den Wert der imageDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     
     */
    public void setImageDatum(JAXBElement<ImageDatumPropertyType> value) {
        this.imageDatum = value;
    }

    public boolean isSetImageDatum() {
        return (this.imageDatum!= null);
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
            JAXBElement<CartesianCSPropertyType> theCartesianCS;
            theCartesianCS = this.getCartesianCS();
            strategy.appendField(locator, this, "cartesianCS", buffer, theCartesianCS);
        }
        {
            JAXBElement<AffineCSPropertyType> theAffineCS;
            theAffineCS = this.getAffineCS();
            strategy.appendField(locator, this, "affineCS", buffer, theAffineCS);
        }
        {
            ObliqueCartesianCSPropertyType theUsesObliqueCartesianCS;
            theUsesObliqueCartesianCS = this.getUsesObliqueCartesianCS();
            strategy.appendField(locator, this, "usesObliqueCartesianCS", buffer, theUsesObliqueCartesianCS);
        }
        {
            JAXBElement<ImageDatumPropertyType> theImageDatum;
            theImageDatum = this.getImageDatum();
            strategy.appendField(locator, this, "imageDatum", buffer, theImageDatum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImageCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ImageCRSType that = ((ImageCRSType) object);
        {
            JAXBElement<CartesianCSPropertyType> lhsCartesianCS;
            lhsCartesianCS = this.getCartesianCS();
            JAXBElement<CartesianCSPropertyType> rhsCartesianCS;
            rhsCartesianCS = that.getCartesianCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cartesianCS", lhsCartesianCS), LocatorUtils.property(thatLocator, "cartesianCS", rhsCartesianCS), lhsCartesianCS, rhsCartesianCS)) {
                return false;
            }
        }
        {
            JAXBElement<AffineCSPropertyType> lhsAffineCS;
            lhsAffineCS = this.getAffineCS();
            JAXBElement<AffineCSPropertyType> rhsAffineCS;
            rhsAffineCS = that.getAffineCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "affineCS", lhsAffineCS), LocatorUtils.property(thatLocator, "affineCS", rhsAffineCS), lhsAffineCS, rhsAffineCS)) {
                return false;
            }
        }
        {
            ObliqueCartesianCSPropertyType lhsUsesObliqueCartesianCS;
            lhsUsesObliqueCartesianCS = this.getUsesObliqueCartesianCS();
            ObliqueCartesianCSPropertyType rhsUsesObliqueCartesianCS;
            rhsUsesObliqueCartesianCS = that.getUsesObliqueCartesianCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesObliqueCartesianCS", lhsUsesObliqueCartesianCS), LocatorUtils.property(thatLocator, "usesObliqueCartesianCS", rhsUsesObliqueCartesianCS), lhsUsesObliqueCartesianCS, rhsUsesObliqueCartesianCS)) {
                return false;
            }
        }
        {
            JAXBElement<ImageDatumPropertyType> lhsImageDatum;
            lhsImageDatum = this.getImageDatum();
            JAXBElement<ImageDatumPropertyType> rhsImageDatum;
            rhsImageDatum = that.getImageDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imageDatum", lhsImageDatum), LocatorUtils.property(thatLocator, "imageDatum", rhsImageDatum), lhsImageDatum, rhsImageDatum)) {
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
            JAXBElement<CartesianCSPropertyType> theCartesianCS;
            theCartesianCS = this.getCartesianCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cartesianCS", theCartesianCS), currentHashCode, theCartesianCS);
        }
        {
            JAXBElement<AffineCSPropertyType> theAffineCS;
            theAffineCS = this.getAffineCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "affineCS", theAffineCS), currentHashCode, theAffineCS);
        }
        {
            ObliqueCartesianCSPropertyType theUsesObliqueCartesianCS;
            theUsesObliqueCartesianCS = this.getUsesObliqueCartesianCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesObliqueCartesianCS", theUsesObliqueCartesianCS), currentHashCode, theUsesObliqueCartesianCS);
        }
        {
            JAXBElement<ImageDatumPropertyType> theImageDatum;
            theImageDatum = this.getImageDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "imageDatum", theImageDatum), currentHashCode, theImageDatum);
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
        if (draftCopy instanceof ImageCRSType) {
            final ImageCRSType copy = ((ImageCRSType) draftCopy);
            if (this.isSetCartesianCS()) {
                JAXBElement<CartesianCSPropertyType> sourceCartesianCS;
                sourceCartesianCS = this.getCartesianCS();
                @SuppressWarnings("unchecked")
                JAXBElement<CartesianCSPropertyType> copyCartesianCS = ((JAXBElement<CartesianCSPropertyType> ) strategy.copy(LocatorUtils.property(locator, "cartesianCS", sourceCartesianCS), sourceCartesianCS));
                copy.setCartesianCS(copyCartesianCS);
            } else {
                copy.cartesianCS = null;
            }
            if (this.isSetAffineCS()) {
                JAXBElement<AffineCSPropertyType> sourceAffineCS;
                sourceAffineCS = this.getAffineCS();
                @SuppressWarnings("unchecked")
                JAXBElement<AffineCSPropertyType> copyAffineCS = ((JAXBElement<AffineCSPropertyType> ) strategy.copy(LocatorUtils.property(locator, "affineCS", sourceAffineCS), sourceAffineCS));
                copy.setAffineCS(copyAffineCS);
            } else {
                copy.affineCS = null;
            }
            if (this.isSetUsesObliqueCartesianCS()) {
                ObliqueCartesianCSPropertyType sourceUsesObliqueCartesianCS;
                sourceUsesObliqueCartesianCS = this.getUsesObliqueCartesianCS();
                ObliqueCartesianCSPropertyType copyUsesObliqueCartesianCS = ((ObliqueCartesianCSPropertyType) strategy.copy(LocatorUtils.property(locator, "usesObliqueCartesianCS", sourceUsesObliqueCartesianCS), sourceUsesObliqueCartesianCS));
                copy.setUsesObliqueCartesianCS(copyUsesObliqueCartesianCS);
            } else {
                copy.usesObliqueCartesianCS = null;
            }
            if (this.isSetImageDatum()) {
                JAXBElement<ImageDatumPropertyType> sourceImageDatum;
                sourceImageDatum = this.getImageDatum();
                @SuppressWarnings("unchecked")
                JAXBElement<ImageDatumPropertyType> copyImageDatum = ((JAXBElement<ImageDatumPropertyType> ) strategy.copy(LocatorUtils.property(locator, "imageDatum", sourceImageDatum), sourceImageDatum));
                copy.setImageDatum(copyImageDatum);
            } else {
                copy.imageDatum = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ImageCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ImageCRSType) {
            final ImageCRSType target = this;
            final ImageCRSType leftObject = ((ImageCRSType) left);
            final ImageCRSType rightObject = ((ImageCRSType) right);
            {
                JAXBElement<CartesianCSPropertyType> lhsCartesianCS;
                lhsCartesianCS = leftObject.getCartesianCS();
                JAXBElement<CartesianCSPropertyType> rhsCartesianCS;
                rhsCartesianCS = rightObject.getCartesianCS();
                target.setCartesianCS(((JAXBElement<CartesianCSPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "cartesianCS", lhsCartesianCS), LocatorUtils.property(rightLocator, "cartesianCS", rhsCartesianCS), lhsCartesianCS, rhsCartesianCS)));
            }
            {
                JAXBElement<AffineCSPropertyType> lhsAffineCS;
                lhsAffineCS = leftObject.getAffineCS();
                JAXBElement<AffineCSPropertyType> rhsAffineCS;
                rhsAffineCS = rightObject.getAffineCS();
                target.setAffineCS(((JAXBElement<AffineCSPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "affineCS", lhsAffineCS), LocatorUtils.property(rightLocator, "affineCS", rhsAffineCS), lhsAffineCS, rhsAffineCS)));
            }
            {
                ObliqueCartesianCSPropertyType lhsUsesObliqueCartesianCS;
                lhsUsesObliqueCartesianCS = leftObject.getUsesObliqueCartesianCS();
                ObliqueCartesianCSPropertyType rhsUsesObliqueCartesianCS;
                rhsUsesObliqueCartesianCS = rightObject.getUsesObliqueCartesianCS();
                target.setUsesObliqueCartesianCS(((ObliqueCartesianCSPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "usesObliqueCartesianCS", lhsUsesObliqueCartesianCS), LocatorUtils.property(rightLocator, "usesObliqueCartesianCS", rhsUsesObliqueCartesianCS), lhsUsesObliqueCartesianCS, rhsUsesObliqueCartesianCS)));
            }
            {
                JAXBElement<ImageDatumPropertyType> lhsImageDatum;
                lhsImageDatum = leftObject.getImageDatum();
                JAXBElement<ImageDatumPropertyType> rhsImageDatum;
                rhsImageDatum = rightObject.getImageDatum();
                target.setImageDatum(((JAXBElement<ImageDatumPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "imageDatum", lhsImageDatum), LocatorUtils.property(rightLocator, "imageDatum", rhsImageDatum), lhsImageDatum, rhsImageDatum)));
            }
        }
    }

}
