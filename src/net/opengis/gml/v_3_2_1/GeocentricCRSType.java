//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

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
 * <p>Java-Klasse für GeocentricCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeocentricCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}usesCartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}usesSphericalCS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}usesGeodeticDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocentricCRSType", propOrder = {
    "usesCartesianCS",
    "usesSphericalCS",
    "usesGeodeticDatum"
})
public class GeocentricCRSType
    extends AbstractCRSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected CartesianCSPropertyType usesCartesianCS;
    protected SphericalCSPropertyType usesSphericalCS;
    @XmlElement(required = true)
    protected GeodeticDatumPropertyType usesGeodeticDatum;

    /**
     * Ruft den Wert der usesCartesianCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CartesianCSPropertyType }
     *     
     */
    public CartesianCSPropertyType getUsesCartesianCS() {
        return usesCartesianCS;
    }

    /**
     * Legt den Wert der usesCartesianCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CartesianCSPropertyType }
     *     
     */
    public void setUsesCartesianCS(CartesianCSPropertyType value) {
        this.usesCartesianCS = value;
    }

    public boolean isSetUsesCartesianCS() {
        return (this.usesCartesianCS!= null);
    }

    /**
     * Ruft den Wert der usesSphericalCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SphericalCSPropertyType }
     *     
     */
    public SphericalCSPropertyType getUsesSphericalCS() {
        return usesSphericalCS;
    }

    /**
     * Legt den Wert der usesSphericalCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SphericalCSPropertyType }
     *     
     */
    public void setUsesSphericalCS(SphericalCSPropertyType value) {
        this.usesSphericalCS = value;
    }

    public boolean isSetUsesSphericalCS() {
        return (this.usesSphericalCS!= null);
    }

    /**
     * Ruft den Wert der usesGeodeticDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticDatumPropertyType }
     *     
     */
    public GeodeticDatumPropertyType getUsesGeodeticDatum() {
        return usesGeodeticDatum;
    }

    /**
     * Legt den Wert der usesGeodeticDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticDatumPropertyType }
     *     
     */
    public void setUsesGeodeticDatum(GeodeticDatumPropertyType value) {
        this.usesGeodeticDatum = value;
    }

    public boolean isSetUsesGeodeticDatum() {
        return (this.usesGeodeticDatum!= null);
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
            CartesianCSPropertyType theUsesCartesianCS;
            theUsesCartesianCS = this.getUsesCartesianCS();
            strategy.appendField(locator, this, "usesCartesianCS", buffer, theUsesCartesianCS);
        }
        {
            SphericalCSPropertyType theUsesSphericalCS;
            theUsesSphericalCS = this.getUsesSphericalCS();
            strategy.appendField(locator, this, "usesSphericalCS", buffer, theUsesSphericalCS);
        }
        {
            GeodeticDatumPropertyType theUsesGeodeticDatum;
            theUsesGeodeticDatum = this.getUsesGeodeticDatum();
            strategy.appendField(locator, this, "usesGeodeticDatum", buffer, theUsesGeodeticDatum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeocentricCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GeocentricCRSType that = ((GeocentricCRSType) object);
        {
            CartesianCSPropertyType lhsUsesCartesianCS;
            lhsUsesCartesianCS = this.getUsesCartesianCS();
            CartesianCSPropertyType rhsUsesCartesianCS;
            rhsUsesCartesianCS = that.getUsesCartesianCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesCartesianCS", lhsUsesCartesianCS), LocatorUtils.property(thatLocator, "usesCartesianCS", rhsUsesCartesianCS), lhsUsesCartesianCS, rhsUsesCartesianCS)) {
                return false;
            }
        }
        {
            SphericalCSPropertyType lhsUsesSphericalCS;
            lhsUsesSphericalCS = this.getUsesSphericalCS();
            SphericalCSPropertyType rhsUsesSphericalCS;
            rhsUsesSphericalCS = that.getUsesSphericalCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesSphericalCS", lhsUsesSphericalCS), LocatorUtils.property(thatLocator, "usesSphericalCS", rhsUsesSphericalCS), lhsUsesSphericalCS, rhsUsesSphericalCS)) {
                return false;
            }
        }
        {
            GeodeticDatumPropertyType lhsUsesGeodeticDatum;
            lhsUsesGeodeticDatum = this.getUsesGeodeticDatum();
            GeodeticDatumPropertyType rhsUsesGeodeticDatum;
            rhsUsesGeodeticDatum = that.getUsesGeodeticDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesGeodeticDatum", lhsUsesGeodeticDatum), LocatorUtils.property(thatLocator, "usesGeodeticDatum", rhsUsesGeodeticDatum), lhsUsesGeodeticDatum, rhsUsesGeodeticDatum)) {
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
            CartesianCSPropertyType theUsesCartesianCS;
            theUsesCartesianCS = this.getUsesCartesianCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesCartesianCS", theUsesCartesianCS), currentHashCode, theUsesCartesianCS);
        }
        {
            SphericalCSPropertyType theUsesSphericalCS;
            theUsesSphericalCS = this.getUsesSphericalCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesSphericalCS", theUsesSphericalCS), currentHashCode, theUsesSphericalCS);
        }
        {
            GeodeticDatumPropertyType theUsesGeodeticDatum;
            theUsesGeodeticDatum = this.getUsesGeodeticDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesGeodeticDatum", theUsesGeodeticDatum), currentHashCode, theUsesGeodeticDatum);
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
        if (draftCopy instanceof GeocentricCRSType) {
            final GeocentricCRSType copy = ((GeocentricCRSType) draftCopy);
            if (this.isSetUsesCartesianCS()) {
                CartesianCSPropertyType sourceUsesCartesianCS;
                sourceUsesCartesianCS = this.getUsesCartesianCS();
                CartesianCSPropertyType copyUsesCartesianCS = ((CartesianCSPropertyType) strategy.copy(LocatorUtils.property(locator, "usesCartesianCS", sourceUsesCartesianCS), sourceUsesCartesianCS));
                copy.setUsesCartesianCS(copyUsesCartesianCS);
            } else {
                copy.usesCartesianCS = null;
            }
            if (this.isSetUsesSphericalCS()) {
                SphericalCSPropertyType sourceUsesSphericalCS;
                sourceUsesSphericalCS = this.getUsesSphericalCS();
                SphericalCSPropertyType copyUsesSphericalCS = ((SphericalCSPropertyType) strategy.copy(LocatorUtils.property(locator, "usesSphericalCS", sourceUsesSphericalCS), sourceUsesSphericalCS));
                copy.setUsesSphericalCS(copyUsesSphericalCS);
            } else {
                copy.usesSphericalCS = null;
            }
            if (this.isSetUsesGeodeticDatum()) {
                GeodeticDatumPropertyType sourceUsesGeodeticDatum;
                sourceUsesGeodeticDatum = this.getUsesGeodeticDatum();
                GeodeticDatumPropertyType copyUsesGeodeticDatum = ((GeodeticDatumPropertyType) strategy.copy(LocatorUtils.property(locator, "usesGeodeticDatum", sourceUsesGeodeticDatum), sourceUsesGeodeticDatum));
                copy.setUsesGeodeticDatum(copyUsesGeodeticDatum);
            } else {
                copy.usesGeodeticDatum = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeocentricCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof GeocentricCRSType) {
            final GeocentricCRSType target = this;
            final GeocentricCRSType leftObject = ((GeocentricCRSType) left);
            final GeocentricCRSType rightObject = ((GeocentricCRSType) right);
            {
                CartesianCSPropertyType lhsUsesCartesianCS;
                lhsUsesCartesianCS = leftObject.getUsesCartesianCS();
                CartesianCSPropertyType rhsUsesCartesianCS;
                rhsUsesCartesianCS = rightObject.getUsesCartesianCS();
                target.setUsesCartesianCS(((CartesianCSPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "usesCartesianCS", lhsUsesCartesianCS), LocatorUtils.property(rightLocator, "usesCartesianCS", rhsUsesCartesianCS), lhsUsesCartesianCS, rhsUsesCartesianCS)));
            }
            {
                SphericalCSPropertyType lhsUsesSphericalCS;
                lhsUsesSphericalCS = leftObject.getUsesSphericalCS();
                SphericalCSPropertyType rhsUsesSphericalCS;
                rhsUsesSphericalCS = rightObject.getUsesSphericalCS();
                target.setUsesSphericalCS(((SphericalCSPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "usesSphericalCS", lhsUsesSphericalCS), LocatorUtils.property(rightLocator, "usesSphericalCS", rhsUsesSphericalCS), lhsUsesSphericalCS, rhsUsesSphericalCS)));
            }
            {
                GeodeticDatumPropertyType lhsUsesGeodeticDatum;
                lhsUsesGeodeticDatum = leftObject.getUsesGeodeticDatum();
                GeodeticDatumPropertyType rhsUsesGeodeticDatum;
                rhsUsesGeodeticDatum = rightObject.getUsesGeodeticDatum();
                target.setUsesGeodeticDatum(((GeodeticDatumPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "usesGeodeticDatum", lhsUsesGeodeticDatum), LocatorUtils.property(rightLocator, "usesGeodeticDatum", rhsUsesGeodeticDatum), lhsUsesGeodeticDatum, rhsUsesGeodeticDatum)));
            }
        }
    }

}
