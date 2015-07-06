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
 * <p>Java-Klasse für EngineeringCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EngineeringCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}affineCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cylindricalCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}linearCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}polarCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}sphericalCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}userDefinedCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinateSystem"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}engineeringDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineeringCRSType", propOrder = {
    "affineCS",
    "cartesianCS",
    "cylindricalCS",
    "linearCS",
    "polarCS",
    "sphericalCS",
    "userDefinedCS",
    "coordinateSystem",
    "engineeringDatum"
})
public class EngineeringCRSType
    extends AbstractCRSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "affineCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<AffineCSPropertyType> affineCS;
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    protected CylindricalCSPropertyType cylindricalCS;
    protected LinearCSPropertyType linearCS;
    protected PolarCSPropertyType polarCS;
    @XmlElementRef(name = "sphericalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<SphericalCSPropertyType> sphericalCS;
    protected UserDefinedCSPropertyType userDefinedCS;
    @XmlElementRef(name = "coordinateSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CoordinateSystemPropertyType> coordinateSystem;
    @XmlElementRef(name = "engineeringDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<EngineeringDatumPropertyType> engineeringDatum;

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
     * Ruft den Wert der cylindricalCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CylindricalCSPropertyType }
     *     
     */
    public CylindricalCSPropertyType getCylindricalCS() {
        return cylindricalCS;
    }

    /**
     * Legt den Wert der cylindricalCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CylindricalCSPropertyType }
     *     
     */
    public void setCylindricalCS(CylindricalCSPropertyType value) {
        this.cylindricalCS = value;
    }

    public boolean isSetCylindricalCS() {
        return (this.cylindricalCS!= null);
    }

    /**
     * Ruft den Wert der linearCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinearCSPropertyType }
     *     
     */
    public LinearCSPropertyType getLinearCS() {
        return linearCS;
    }

    /**
     * Legt den Wert der linearCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearCSPropertyType }
     *     
     */
    public void setLinearCS(LinearCSPropertyType value) {
        this.linearCS = value;
    }

    public boolean isSetLinearCS() {
        return (this.linearCS!= null);
    }

    /**
     * Ruft den Wert der polarCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolarCSPropertyType }
     *     
     */
    public PolarCSPropertyType getPolarCS() {
        return polarCS;
    }

    /**
     * Legt den Wert der polarCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolarCSPropertyType }
     *     
     */
    public void setPolarCS(PolarCSPropertyType value) {
        this.polarCS = value;
    }

    public boolean isSetPolarCS() {
        return (this.polarCS!= null);
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
     * Ruft den Wert der userDefinedCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedCSPropertyType }
     *     
     */
    public UserDefinedCSPropertyType getUserDefinedCS() {
        return userDefinedCS;
    }

    /**
     * Legt den Wert der userDefinedCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedCSPropertyType }
     *     
     */
    public void setUserDefinedCS(UserDefinedCSPropertyType value) {
        this.userDefinedCS = value;
    }

    public boolean isSetUserDefinedCS() {
        return (this.userDefinedCS!= null);
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

    /**
     * Ruft den Wert der engineeringDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<EngineeringDatumPropertyType> getEngineeringDatum() {
        return engineeringDatum;
    }

    /**
     * Legt den Wert der engineeringDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     
     */
    public void setEngineeringDatum(JAXBElement<EngineeringDatumPropertyType> value) {
        this.engineeringDatum = value;
    }

    public boolean isSetEngineeringDatum() {
        return (this.engineeringDatum!= null);
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
            JAXBElement<AffineCSPropertyType> theAffineCS;
            theAffineCS = this.getAffineCS();
            strategy.appendField(locator, this, "affineCS", buffer, theAffineCS);
        }
        {
            JAXBElement<CartesianCSPropertyType> theCartesianCS;
            theCartesianCS = this.getCartesianCS();
            strategy.appendField(locator, this, "cartesianCS", buffer, theCartesianCS);
        }
        {
            CylindricalCSPropertyType theCylindricalCS;
            theCylindricalCS = this.getCylindricalCS();
            strategy.appendField(locator, this, "cylindricalCS", buffer, theCylindricalCS);
        }
        {
            LinearCSPropertyType theLinearCS;
            theLinearCS = this.getLinearCS();
            strategy.appendField(locator, this, "linearCS", buffer, theLinearCS);
        }
        {
            PolarCSPropertyType thePolarCS;
            thePolarCS = this.getPolarCS();
            strategy.appendField(locator, this, "polarCS", buffer, thePolarCS);
        }
        {
            JAXBElement<SphericalCSPropertyType> theSphericalCS;
            theSphericalCS = this.getSphericalCS();
            strategy.appendField(locator, this, "sphericalCS", buffer, theSphericalCS);
        }
        {
            UserDefinedCSPropertyType theUserDefinedCS;
            theUserDefinedCS = this.getUserDefinedCS();
            strategy.appendField(locator, this, "userDefinedCS", buffer, theUserDefinedCS);
        }
        {
            JAXBElement<CoordinateSystemPropertyType> theCoordinateSystem;
            theCoordinateSystem = this.getCoordinateSystem();
            strategy.appendField(locator, this, "coordinateSystem", buffer, theCoordinateSystem);
        }
        {
            JAXBElement<EngineeringDatumPropertyType> theEngineeringDatum;
            theEngineeringDatum = this.getEngineeringDatum();
            strategy.appendField(locator, this, "engineeringDatum", buffer, theEngineeringDatum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EngineeringCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EngineeringCRSType that = ((EngineeringCRSType) object);
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
            JAXBElement<CartesianCSPropertyType> lhsCartesianCS;
            lhsCartesianCS = this.getCartesianCS();
            JAXBElement<CartesianCSPropertyType> rhsCartesianCS;
            rhsCartesianCS = that.getCartesianCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cartesianCS", lhsCartesianCS), LocatorUtils.property(thatLocator, "cartesianCS", rhsCartesianCS), lhsCartesianCS, rhsCartesianCS)) {
                return false;
            }
        }
        {
            CylindricalCSPropertyType lhsCylindricalCS;
            lhsCylindricalCS = this.getCylindricalCS();
            CylindricalCSPropertyType rhsCylindricalCS;
            rhsCylindricalCS = that.getCylindricalCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cylindricalCS", lhsCylindricalCS), LocatorUtils.property(thatLocator, "cylindricalCS", rhsCylindricalCS), lhsCylindricalCS, rhsCylindricalCS)) {
                return false;
            }
        }
        {
            LinearCSPropertyType lhsLinearCS;
            lhsLinearCS = this.getLinearCS();
            LinearCSPropertyType rhsLinearCS;
            rhsLinearCS = that.getLinearCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "linearCS", lhsLinearCS), LocatorUtils.property(thatLocator, "linearCS", rhsLinearCS), lhsLinearCS, rhsLinearCS)) {
                return false;
            }
        }
        {
            PolarCSPropertyType lhsPolarCS;
            lhsPolarCS = this.getPolarCS();
            PolarCSPropertyType rhsPolarCS;
            rhsPolarCS = that.getPolarCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "polarCS", lhsPolarCS), LocatorUtils.property(thatLocator, "polarCS", rhsPolarCS), lhsPolarCS, rhsPolarCS)) {
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
            UserDefinedCSPropertyType lhsUserDefinedCS;
            lhsUserDefinedCS = this.getUserDefinedCS();
            UserDefinedCSPropertyType rhsUserDefinedCS;
            rhsUserDefinedCS = that.getUserDefinedCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedCS", lhsUserDefinedCS), LocatorUtils.property(thatLocator, "userDefinedCS", rhsUserDefinedCS), lhsUserDefinedCS, rhsUserDefinedCS)) {
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
        {
            JAXBElement<EngineeringDatumPropertyType> lhsEngineeringDatum;
            lhsEngineeringDatum = this.getEngineeringDatum();
            JAXBElement<EngineeringDatumPropertyType> rhsEngineeringDatum;
            rhsEngineeringDatum = that.getEngineeringDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "engineeringDatum", lhsEngineeringDatum), LocatorUtils.property(thatLocator, "engineeringDatum", rhsEngineeringDatum), lhsEngineeringDatum, rhsEngineeringDatum)) {
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
            JAXBElement<AffineCSPropertyType> theAffineCS;
            theAffineCS = this.getAffineCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "affineCS", theAffineCS), currentHashCode, theAffineCS);
        }
        {
            JAXBElement<CartesianCSPropertyType> theCartesianCS;
            theCartesianCS = this.getCartesianCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cartesianCS", theCartesianCS), currentHashCode, theCartesianCS);
        }
        {
            CylindricalCSPropertyType theCylindricalCS;
            theCylindricalCS = this.getCylindricalCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cylindricalCS", theCylindricalCS), currentHashCode, theCylindricalCS);
        }
        {
            LinearCSPropertyType theLinearCS;
            theLinearCS = this.getLinearCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "linearCS", theLinearCS), currentHashCode, theLinearCS);
        }
        {
            PolarCSPropertyType thePolarCS;
            thePolarCS = this.getPolarCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "polarCS", thePolarCS), currentHashCode, thePolarCS);
        }
        {
            JAXBElement<SphericalCSPropertyType> theSphericalCS;
            theSphericalCS = this.getSphericalCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sphericalCS", theSphericalCS), currentHashCode, theSphericalCS);
        }
        {
            UserDefinedCSPropertyType theUserDefinedCS;
            theUserDefinedCS = this.getUserDefinedCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userDefinedCS", theUserDefinedCS), currentHashCode, theUserDefinedCS);
        }
        {
            JAXBElement<CoordinateSystemPropertyType> theCoordinateSystem;
            theCoordinateSystem = this.getCoordinateSystem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinateSystem", theCoordinateSystem), currentHashCode, theCoordinateSystem);
        }
        {
            JAXBElement<EngineeringDatumPropertyType> theEngineeringDatum;
            theEngineeringDatum = this.getEngineeringDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "engineeringDatum", theEngineeringDatum), currentHashCode, theEngineeringDatum);
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
        if (draftCopy instanceof EngineeringCRSType) {
            final EngineeringCRSType copy = ((EngineeringCRSType) draftCopy);
            if (this.isSetAffineCS()) {
                JAXBElement<AffineCSPropertyType> sourceAffineCS;
                sourceAffineCS = this.getAffineCS();
                @SuppressWarnings("unchecked")
                JAXBElement<AffineCSPropertyType> copyAffineCS = ((JAXBElement<AffineCSPropertyType> ) strategy.copy(LocatorUtils.property(locator, "affineCS", sourceAffineCS), sourceAffineCS));
                copy.setAffineCS(copyAffineCS);
            } else {
                copy.affineCS = null;
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
            if (this.isSetCylindricalCS()) {
                CylindricalCSPropertyType sourceCylindricalCS;
                sourceCylindricalCS = this.getCylindricalCS();
                CylindricalCSPropertyType copyCylindricalCS = ((CylindricalCSPropertyType) strategy.copy(LocatorUtils.property(locator, "cylindricalCS", sourceCylindricalCS), sourceCylindricalCS));
                copy.setCylindricalCS(copyCylindricalCS);
            } else {
                copy.cylindricalCS = null;
            }
            if (this.isSetLinearCS()) {
                LinearCSPropertyType sourceLinearCS;
                sourceLinearCS = this.getLinearCS();
                LinearCSPropertyType copyLinearCS = ((LinearCSPropertyType) strategy.copy(LocatorUtils.property(locator, "linearCS", sourceLinearCS), sourceLinearCS));
                copy.setLinearCS(copyLinearCS);
            } else {
                copy.linearCS = null;
            }
            if (this.isSetPolarCS()) {
                PolarCSPropertyType sourcePolarCS;
                sourcePolarCS = this.getPolarCS();
                PolarCSPropertyType copyPolarCS = ((PolarCSPropertyType) strategy.copy(LocatorUtils.property(locator, "polarCS", sourcePolarCS), sourcePolarCS));
                copy.setPolarCS(copyPolarCS);
            } else {
                copy.polarCS = null;
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
            if (this.isSetUserDefinedCS()) {
                UserDefinedCSPropertyType sourceUserDefinedCS;
                sourceUserDefinedCS = this.getUserDefinedCS();
                UserDefinedCSPropertyType copyUserDefinedCS = ((UserDefinedCSPropertyType) strategy.copy(LocatorUtils.property(locator, "userDefinedCS", sourceUserDefinedCS), sourceUserDefinedCS));
                copy.setUserDefinedCS(copyUserDefinedCS);
            } else {
                copy.userDefinedCS = null;
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
            if (this.isSetEngineeringDatum()) {
                JAXBElement<EngineeringDatumPropertyType> sourceEngineeringDatum;
                sourceEngineeringDatum = this.getEngineeringDatum();
                @SuppressWarnings("unchecked")
                JAXBElement<EngineeringDatumPropertyType> copyEngineeringDatum = ((JAXBElement<EngineeringDatumPropertyType> ) strategy.copy(LocatorUtils.property(locator, "engineeringDatum", sourceEngineeringDatum), sourceEngineeringDatum));
                copy.setEngineeringDatum(copyEngineeringDatum);
            } else {
                copy.engineeringDatum = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EngineeringCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof EngineeringCRSType) {
            final EngineeringCRSType target = this;
            final EngineeringCRSType leftObject = ((EngineeringCRSType) left);
            final EngineeringCRSType rightObject = ((EngineeringCRSType) right);
            {
                JAXBElement<AffineCSPropertyType> lhsAffineCS;
                lhsAffineCS = leftObject.getAffineCS();
                JAXBElement<AffineCSPropertyType> rhsAffineCS;
                rhsAffineCS = rightObject.getAffineCS();
                target.setAffineCS(((JAXBElement<AffineCSPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "affineCS", lhsAffineCS), LocatorUtils.property(rightLocator, "affineCS", rhsAffineCS), lhsAffineCS, rhsAffineCS)));
            }
            {
                JAXBElement<CartesianCSPropertyType> lhsCartesianCS;
                lhsCartesianCS = leftObject.getCartesianCS();
                JAXBElement<CartesianCSPropertyType> rhsCartesianCS;
                rhsCartesianCS = rightObject.getCartesianCS();
                target.setCartesianCS(((JAXBElement<CartesianCSPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "cartesianCS", lhsCartesianCS), LocatorUtils.property(rightLocator, "cartesianCS", rhsCartesianCS), lhsCartesianCS, rhsCartesianCS)));
            }
            {
                CylindricalCSPropertyType lhsCylindricalCS;
                lhsCylindricalCS = leftObject.getCylindricalCS();
                CylindricalCSPropertyType rhsCylindricalCS;
                rhsCylindricalCS = rightObject.getCylindricalCS();
                target.setCylindricalCS(((CylindricalCSPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "cylindricalCS", lhsCylindricalCS), LocatorUtils.property(rightLocator, "cylindricalCS", rhsCylindricalCS), lhsCylindricalCS, rhsCylindricalCS)));
            }
            {
                LinearCSPropertyType lhsLinearCS;
                lhsLinearCS = leftObject.getLinearCS();
                LinearCSPropertyType rhsLinearCS;
                rhsLinearCS = rightObject.getLinearCS();
                target.setLinearCS(((LinearCSPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "linearCS", lhsLinearCS), LocatorUtils.property(rightLocator, "linearCS", rhsLinearCS), lhsLinearCS, rhsLinearCS)));
            }
            {
                PolarCSPropertyType lhsPolarCS;
                lhsPolarCS = leftObject.getPolarCS();
                PolarCSPropertyType rhsPolarCS;
                rhsPolarCS = rightObject.getPolarCS();
                target.setPolarCS(((PolarCSPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "polarCS", lhsPolarCS), LocatorUtils.property(rightLocator, "polarCS", rhsPolarCS), lhsPolarCS, rhsPolarCS)));
            }
            {
                JAXBElement<SphericalCSPropertyType> lhsSphericalCS;
                lhsSphericalCS = leftObject.getSphericalCS();
                JAXBElement<SphericalCSPropertyType> rhsSphericalCS;
                rhsSphericalCS = rightObject.getSphericalCS();
                target.setSphericalCS(((JAXBElement<SphericalCSPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "sphericalCS", lhsSphericalCS), LocatorUtils.property(rightLocator, "sphericalCS", rhsSphericalCS), lhsSphericalCS, rhsSphericalCS)));
            }
            {
                UserDefinedCSPropertyType lhsUserDefinedCS;
                lhsUserDefinedCS = leftObject.getUserDefinedCS();
                UserDefinedCSPropertyType rhsUserDefinedCS;
                rhsUserDefinedCS = rightObject.getUserDefinedCS();
                target.setUserDefinedCS(((UserDefinedCSPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "userDefinedCS", lhsUserDefinedCS), LocatorUtils.property(rightLocator, "userDefinedCS", rhsUserDefinedCS), lhsUserDefinedCS, rhsUserDefinedCS)));
            }
            {
                JAXBElement<CoordinateSystemPropertyType> lhsCoordinateSystem;
                lhsCoordinateSystem = leftObject.getCoordinateSystem();
                JAXBElement<CoordinateSystemPropertyType> rhsCoordinateSystem;
                rhsCoordinateSystem = rightObject.getCoordinateSystem();
                target.setCoordinateSystem(((JAXBElement<CoordinateSystemPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "coordinateSystem", lhsCoordinateSystem), LocatorUtils.property(rightLocator, "coordinateSystem", rhsCoordinateSystem), lhsCoordinateSystem, rhsCoordinateSystem)));
            }
            {
                JAXBElement<EngineeringDatumPropertyType> lhsEngineeringDatum;
                lhsEngineeringDatum = leftObject.getEngineeringDatum();
                JAXBElement<EngineeringDatumPropertyType> rhsEngineeringDatum;
                rhsEngineeringDatum = rightObject.getEngineeringDatum();
                target.setEngineeringDatum(((JAXBElement<EngineeringDatumPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "engineeringDatum", lhsEngineeringDatum), LocatorUtils.property(rightLocator, "engineeringDatum", rhsEngineeringDatum), lhsEngineeringDatum, rhsEngineeringDatum)));
            }
        }
    }

}
