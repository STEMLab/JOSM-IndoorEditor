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
 * <p>Java-Klasse für GeodeticDatumType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeodeticDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}primeMeridian"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}ellipsoid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticDatumType", propOrder = {
    "primeMeridian",
    "ellipsoid"
})
public class GeodeticDatumType
    extends AbstractDatumType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "primeMeridian", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<PrimeMeridianPropertyType> primeMeridian;
    @XmlElementRef(name = "ellipsoid", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<EllipsoidPropertyType> ellipsoid;

    /**
     * Ruft den Wert der primeMeridian-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     
     */
    public JAXBElement<PrimeMeridianPropertyType> getPrimeMeridian() {
        return primeMeridian;
    }

    /**
     * Legt den Wert der primeMeridian-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     
     */
    public void setPrimeMeridian(JAXBElement<PrimeMeridianPropertyType> value) {
        this.primeMeridian = value;
    }

    public boolean isSetPrimeMeridian() {
        return (this.primeMeridian!= null);
    }

    /**
     * Ruft den Wert der ellipsoid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     
     */
    public JAXBElement<EllipsoidPropertyType> getEllipsoid() {
        return ellipsoid;
    }

    /**
     * Legt den Wert der ellipsoid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     
     */
    public void setEllipsoid(JAXBElement<EllipsoidPropertyType> value) {
        this.ellipsoid = value;
    }

    public boolean isSetEllipsoid() {
        return (this.ellipsoid!= null);
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
            JAXBElement<PrimeMeridianPropertyType> thePrimeMeridian;
            thePrimeMeridian = this.getPrimeMeridian();
            strategy.appendField(locator, this, "primeMeridian", buffer, thePrimeMeridian);
        }
        {
            JAXBElement<EllipsoidPropertyType> theEllipsoid;
            theEllipsoid = this.getEllipsoid();
            strategy.appendField(locator, this, "ellipsoid", buffer, theEllipsoid);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeodeticDatumType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GeodeticDatumType that = ((GeodeticDatumType) object);
        {
            JAXBElement<PrimeMeridianPropertyType> lhsPrimeMeridian;
            lhsPrimeMeridian = this.getPrimeMeridian();
            JAXBElement<PrimeMeridianPropertyType> rhsPrimeMeridian;
            rhsPrimeMeridian = that.getPrimeMeridian();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primeMeridian", lhsPrimeMeridian), LocatorUtils.property(thatLocator, "primeMeridian", rhsPrimeMeridian), lhsPrimeMeridian, rhsPrimeMeridian)) {
                return false;
            }
        }
        {
            JAXBElement<EllipsoidPropertyType> lhsEllipsoid;
            lhsEllipsoid = this.getEllipsoid();
            JAXBElement<EllipsoidPropertyType> rhsEllipsoid;
            rhsEllipsoid = that.getEllipsoid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ellipsoid", lhsEllipsoid), LocatorUtils.property(thatLocator, "ellipsoid", rhsEllipsoid), lhsEllipsoid, rhsEllipsoid)) {
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
            JAXBElement<PrimeMeridianPropertyType> thePrimeMeridian;
            thePrimeMeridian = this.getPrimeMeridian();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primeMeridian", thePrimeMeridian), currentHashCode, thePrimeMeridian);
        }
        {
            JAXBElement<EllipsoidPropertyType> theEllipsoid;
            theEllipsoid = this.getEllipsoid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ellipsoid", theEllipsoid), currentHashCode, theEllipsoid);
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
        if (draftCopy instanceof GeodeticDatumType) {
            final GeodeticDatumType copy = ((GeodeticDatumType) draftCopy);
            if (this.isSetPrimeMeridian()) {
                JAXBElement<PrimeMeridianPropertyType> sourcePrimeMeridian;
                sourcePrimeMeridian = this.getPrimeMeridian();
                @SuppressWarnings("unchecked")
                JAXBElement<PrimeMeridianPropertyType> copyPrimeMeridian = ((JAXBElement<PrimeMeridianPropertyType> ) strategy.copy(LocatorUtils.property(locator, "primeMeridian", sourcePrimeMeridian), sourcePrimeMeridian));
                copy.setPrimeMeridian(copyPrimeMeridian);
            } else {
                copy.primeMeridian = null;
            }
            if (this.isSetEllipsoid()) {
                JAXBElement<EllipsoidPropertyType> sourceEllipsoid;
                sourceEllipsoid = this.getEllipsoid();
                @SuppressWarnings("unchecked")
                JAXBElement<EllipsoidPropertyType> copyEllipsoid = ((JAXBElement<EllipsoidPropertyType> ) strategy.copy(LocatorUtils.property(locator, "ellipsoid", sourceEllipsoid), sourceEllipsoid));
                copy.setEllipsoid(copyEllipsoid);
            } else {
                copy.ellipsoid = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeodeticDatumType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof GeodeticDatumType) {
            final GeodeticDatumType target = this;
            final GeodeticDatumType leftObject = ((GeodeticDatumType) left);
            final GeodeticDatumType rightObject = ((GeodeticDatumType) right);
            {
                JAXBElement<PrimeMeridianPropertyType> lhsPrimeMeridian;
                lhsPrimeMeridian = leftObject.getPrimeMeridian();
                JAXBElement<PrimeMeridianPropertyType> rhsPrimeMeridian;
                rhsPrimeMeridian = rightObject.getPrimeMeridian();
                target.setPrimeMeridian(((JAXBElement<PrimeMeridianPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "primeMeridian", lhsPrimeMeridian), LocatorUtils.property(rightLocator, "primeMeridian", rhsPrimeMeridian), lhsPrimeMeridian, rhsPrimeMeridian)));
            }
            {
                JAXBElement<EllipsoidPropertyType> lhsEllipsoid;
                lhsEllipsoid = leftObject.getEllipsoid();
                JAXBElement<EllipsoidPropertyType> rhsEllipsoid;
                rhsEllipsoid = rightObject.getEllipsoid();
                target.setEllipsoid(((JAXBElement<EllipsoidPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "ellipsoid", lhsEllipsoid), LocatorUtils.property(rightLocator, "ellipsoid", rhsEllipsoid), lhsEllipsoid, rhsEllipsoid)));
            }
        }
    }

}
