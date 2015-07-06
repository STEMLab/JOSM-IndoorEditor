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
 * gml:GeodeticCRS is a coordinate reference system based on a geodetic datum.
 * 
 * <p>Java-Klasse für GeodeticCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeodeticCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}ellipsoidalCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}sphericalCS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}geodeticDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticCRSType", propOrder = {
    "ellipsoidalCS",
    "cartesianCS",
    "sphericalCS",
    "geodeticDatum"
})
public class GeodeticCRSType
    extends AbstractCRSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "ellipsoidalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<EllipsoidalCSPropertyType> ellipsoidalCS;
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    @XmlElementRef(name = "sphericalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<SphericalCSPropertyType> sphericalCS;
    @XmlElementRef(name = "geodeticDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<GeodeticDatumPropertyType> geodeticDatum;

    /**
     * Ruft den Wert der ellipsoidalCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<EllipsoidalCSPropertyType> getEllipsoidalCS() {
        return ellipsoidalCS;
    }

    /**
     * Legt den Wert der ellipsoidalCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}
     *     
     */
    public void setEllipsoidalCS(JAXBElement<EllipsoidalCSPropertyType> value) {
        this.ellipsoidalCS = value;
    }

    public boolean isSetEllipsoidalCS() {
        return (this.ellipsoidalCS!= null);
    }

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
     * Ruft den Wert der sphericalCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<SphericalCSPropertyType> getSphericalCS() {
        return sphericalCS;
    }

    /**
     * Legt den Wert der sphericalCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     
     */
    public void setSphericalCS(JAXBElement<SphericalCSPropertyType> value) {
        this.sphericalCS = value;
    }

    public boolean isSetSphericalCS() {
        return (this.sphericalCS!= null);
    }

    /**
     * Ruft den Wert der geodeticDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<GeodeticDatumPropertyType> getGeodeticDatum() {
        return geodeticDatum;
    }

    /**
     * Legt den Wert der geodeticDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}
     *     
     */
    public void setGeodeticDatum(JAXBElement<GeodeticDatumPropertyType> value) {
        this.geodeticDatum = value;
    }

    public boolean isSetGeodeticDatum() {
        return (this.geodeticDatum!= null);
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
            JAXBElement<EllipsoidalCSPropertyType> theEllipsoidalCS;
            theEllipsoidalCS = this.getEllipsoidalCS();
            strategy.appendField(locator, this, "ellipsoidalCS", buffer, theEllipsoidalCS);
        }
        {
            JAXBElement<CartesianCSPropertyType> theCartesianCS;
            theCartesianCS = this.getCartesianCS();
            strategy.appendField(locator, this, "cartesianCS", buffer, theCartesianCS);
        }
        {
            JAXBElement<SphericalCSPropertyType> theSphericalCS;
            theSphericalCS = this.getSphericalCS();
            strategy.appendField(locator, this, "sphericalCS", buffer, theSphericalCS);
        }
        {
            JAXBElement<GeodeticDatumPropertyType> theGeodeticDatum;
            theGeodeticDatum = this.getGeodeticDatum();
            strategy.appendField(locator, this, "geodeticDatum", buffer, theGeodeticDatum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeodeticCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GeodeticCRSType that = ((GeodeticCRSType) object);
        {
            JAXBElement<EllipsoidalCSPropertyType> lhsEllipsoidalCS;
            lhsEllipsoidalCS = this.getEllipsoidalCS();
            JAXBElement<EllipsoidalCSPropertyType> rhsEllipsoidalCS;
            rhsEllipsoidalCS = that.getEllipsoidalCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ellipsoidalCS", lhsEllipsoidalCS), LocatorUtils.property(thatLocator, "ellipsoidalCS", rhsEllipsoidalCS), lhsEllipsoidalCS, rhsEllipsoidalCS)) {
                return false;
            }
        }
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
            JAXBElement<SphericalCSPropertyType> lhsSphericalCS;
            lhsSphericalCS = this.getSphericalCS();
            JAXBElement<SphericalCSPropertyType> rhsSphericalCS;
            rhsSphericalCS = that.getSphericalCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sphericalCS", lhsSphericalCS), LocatorUtils.property(thatLocator, "sphericalCS", rhsSphericalCS), lhsSphericalCS, rhsSphericalCS)) {
                return false;
            }
        }
        {
            JAXBElement<GeodeticDatumPropertyType> lhsGeodeticDatum;
            lhsGeodeticDatum = this.getGeodeticDatum();
            JAXBElement<GeodeticDatumPropertyType> rhsGeodeticDatum;
            rhsGeodeticDatum = that.getGeodeticDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geodeticDatum", lhsGeodeticDatum), LocatorUtils.property(thatLocator, "geodeticDatum", rhsGeodeticDatum), lhsGeodeticDatum, rhsGeodeticDatum)) {
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
            JAXBElement<EllipsoidalCSPropertyType> theEllipsoidalCS;
            theEllipsoidalCS = this.getEllipsoidalCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ellipsoidalCS", theEllipsoidalCS), currentHashCode, theEllipsoidalCS);
        }
        {
            JAXBElement<CartesianCSPropertyType> theCartesianCS;
            theCartesianCS = this.getCartesianCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cartesianCS", theCartesianCS), currentHashCode, theCartesianCS);
        }
        {
            JAXBElement<SphericalCSPropertyType> theSphericalCS;
            theSphericalCS = this.getSphericalCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sphericalCS", theSphericalCS), currentHashCode, theSphericalCS);
        }
        {
            JAXBElement<GeodeticDatumPropertyType> theGeodeticDatum;
            theGeodeticDatum = this.getGeodeticDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geodeticDatum", theGeodeticDatum), currentHashCode, theGeodeticDatum);
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
        if (draftCopy instanceof GeodeticCRSType) {
            final GeodeticCRSType copy = ((GeodeticCRSType) draftCopy);
            if (this.isSetEllipsoidalCS()) {
                JAXBElement<EllipsoidalCSPropertyType> sourceEllipsoidalCS;
                sourceEllipsoidalCS = this.getEllipsoidalCS();
                @SuppressWarnings("unchecked")
                JAXBElement<EllipsoidalCSPropertyType> copyEllipsoidalCS = ((JAXBElement<EllipsoidalCSPropertyType> ) strategy.copy(LocatorUtils.property(locator, "ellipsoidalCS", sourceEllipsoidalCS), sourceEllipsoidalCS));
                copy.setEllipsoidalCS(copyEllipsoidalCS);
            } else {
                copy.ellipsoidalCS = null;
            }
            if (this.isSetCartesianCS()) {
                JAXBElement<CartesianCSPropertyType> sourceCartesianCS;
                sourceCartesianCS = this.getCartesianCS();
                @SuppressWarnings("unchecked")
                JAXBElement<CartesianCSPropertyType> copyCartesianCS = ((JAXBElement<CartesianCSPropertyType> ) strategy.copy(LocatorUtils.property(locator, "cartesianCS", sourceCartesianCS), sourceCartesianCS));
                copy.setCartesianCS(copyCartesianCS);
            } else {
                copy.cartesianCS = null;
            }
            if (this.isSetSphericalCS()) {
                JAXBElement<SphericalCSPropertyType> sourceSphericalCS;
                sourceSphericalCS = this.getSphericalCS();
                @SuppressWarnings("unchecked")
                JAXBElement<SphericalCSPropertyType> copySphericalCS = ((JAXBElement<SphericalCSPropertyType> ) strategy.copy(LocatorUtils.property(locator, "sphericalCS", sourceSphericalCS), sourceSphericalCS));
                copy.setSphericalCS(copySphericalCS);
            } else {
                copy.sphericalCS = null;
            }
            if (this.isSetGeodeticDatum()) {
                JAXBElement<GeodeticDatumPropertyType> sourceGeodeticDatum;
                sourceGeodeticDatum = this.getGeodeticDatum();
                @SuppressWarnings("unchecked")
                JAXBElement<GeodeticDatumPropertyType> copyGeodeticDatum = ((JAXBElement<GeodeticDatumPropertyType> ) strategy.copy(LocatorUtils.property(locator, "geodeticDatum", sourceGeodeticDatum), sourceGeodeticDatum));
                copy.setGeodeticDatum(copyGeodeticDatum);
            } else {
                copy.geodeticDatum = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeodeticCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof GeodeticCRSType) {
            final GeodeticCRSType target = this;
            final GeodeticCRSType leftObject = ((GeodeticCRSType) left);
            final GeodeticCRSType rightObject = ((GeodeticCRSType) right);
            {
                JAXBElement<EllipsoidalCSPropertyType> lhsEllipsoidalCS;
                lhsEllipsoidalCS = leftObject.getEllipsoidalCS();
                JAXBElement<EllipsoidalCSPropertyType> rhsEllipsoidalCS;
                rhsEllipsoidalCS = rightObject.getEllipsoidalCS();
                target.setEllipsoidalCS(((JAXBElement<EllipsoidalCSPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "ellipsoidalCS", lhsEllipsoidalCS), LocatorUtils.property(rightLocator, "ellipsoidalCS", rhsEllipsoidalCS), lhsEllipsoidalCS, rhsEllipsoidalCS)));
            }
            {
                JAXBElement<CartesianCSPropertyType> lhsCartesianCS;
                lhsCartesianCS = leftObject.getCartesianCS();
                JAXBElement<CartesianCSPropertyType> rhsCartesianCS;
                rhsCartesianCS = rightObject.getCartesianCS();
                target.setCartesianCS(((JAXBElement<CartesianCSPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "cartesianCS", lhsCartesianCS), LocatorUtils.property(rightLocator, "cartesianCS", rhsCartesianCS), lhsCartesianCS, rhsCartesianCS)));
            }
            {
                JAXBElement<SphericalCSPropertyType> lhsSphericalCS;
                lhsSphericalCS = leftObject.getSphericalCS();
                JAXBElement<SphericalCSPropertyType> rhsSphericalCS;
                rhsSphericalCS = rightObject.getSphericalCS();
                target.setSphericalCS(((JAXBElement<SphericalCSPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "sphericalCS", lhsSphericalCS), LocatorUtils.property(rightLocator, "sphericalCS", rhsSphericalCS), lhsSphericalCS, rhsSphericalCS)));
            }
            {
                JAXBElement<GeodeticDatumPropertyType> lhsGeodeticDatum;
                lhsGeodeticDatum = leftObject.getGeodeticDatum();
                JAXBElement<GeodeticDatumPropertyType> rhsGeodeticDatum;
                rhsGeodeticDatum = rightObject.getGeodeticDatum();
                target.setGeodeticDatum(((JAXBElement<GeodeticDatumPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "geodeticDatum", lhsGeodeticDatum), LocatorUtils.property(rightLocator, "geodeticDatum", rhsGeodeticDatum), lhsGeodeticDatum, rhsGeodeticDatum)));
            }
        }
    }

}
