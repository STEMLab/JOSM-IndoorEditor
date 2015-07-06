//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java-Klasse für OrientableCurveType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OrientableCurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}baseCurve"/>
 *       &lt;/sequence>
 *       &lt;attribute name="orientation" type="{http://www.opengis.net/gml/3.2}SignType" default="+" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrientableCurveType", propOrder = {
    "baseCurve"
})
public class OrientableCurveType
    extends AbstractCurveType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected CurvePropertyType baseCurve;
    @XmlAttribute(name = "orientation")
    protected SignType orientation;

    /**
     * Ruft den Wert der baseCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getBaseCurve() {
        return baseCurve;
    }

    /**
     * Legt den Wert der baseCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setBaseCurve(CurvePropertyType value) {
        this.baseCurve = value;
    }

    public boolean isSetBaseCurve() {
        return (this.baseCurve!= null);
    }

    /**
     * Ruft den Wert der orientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SignType }
     *     
     */
    public SignType getOrientation() {
        if (orientation == null) {
            return SignType.VALUE_2;
        } else {
            return orientation;
        }
    }

    /**
     * Legt den Wert der orientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SignType }
     *     
     */
    public void setOrientation(SignType value) {
        this.orientation = value;
    }

    public boolean isSetOrientation() {
        return (this.orientation!= null);
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
            CurvePropertyType theBaseCurve;
            theBaseCurve = this.getBaseCurve();
            strategy.appendField(locator, this, "baseCurve", buffer, theBaseCurve);
        }
        {
            SignType theOrientation;
            theOrientation = this.getOrientation();
            strategy.appendField(locator, this, "orientation", buffer, theOrientation);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OrientableCurveType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OrientableCurveType that = ((OrientableCurveType) object);
        {
            CurvePropertyType lhsBaseCurve;
            lhsBaseCurve = this.getBaseCurve();
            CurvePropertyType rhsBaseCurve;
            rhsBaseCurve = that.getBaseCurve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseCurve", lhsBaseCurve), LocatorUtils.property(thatLocator, "baseCurve", rhsBaseCurve), lhsBaseCurve, rhsBaseCurve)) {
                return false;
            }
        }
        {
            SignType lhsOrientation;
            lhsOrientation = this.getOrientation();
            SignType rhsOrientation;
            rhsOrientation = that.getOrientation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orientation", lhsOrientation), LocatorUtils.property(thatLocator, "orientation", rhsOrientation), lhsOrientation, rhsOrientation)) {
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
            CurvePropertyType theBaseCurve;
            theBaseCurve = this.getBaseCurve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseCurve", theBaseCurve), currentHashCode, theBaseCurve);
        }
        {
            SignType theOrientation;
            theOrientation = this.getOrientation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orientation", theOrientation), currentHashCode, theOrientation);
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
        if (draftCopy instanceof OrientableCurveType) {
            final OrientableCurveType copy = ((OrientableCurveType) draftCopy);
            if (this.isSetBaseCurve()) {
                CurvePropertyType sourceBaseCurve;
                sourceBaseCurve = this.getBaseCurve();
                CurvePropertyType copyBaseCurve = ((CurvePropertyType) strategy.copy(LocatorUtils.property(locator, "baseCurve", sourceBaseCurve), sourceBaseCurve));
                copy.setBaseCurve(copyBaseCurve);
            } else {
                copy.baseCurve = null;
            }
            if (this.isSetOrientation()) {
                SignType sourceOrientation;
                sourceOrientation = this.getOrientation();
                SignType copyOrientation = ((SignType) strategy.copy(LocatorUtils.property(locator, "orientation", sourceOrientation), sourceOrientation));
                copy.setOrientation(copyOrientation);
            } else {
                copy.orientation = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OrientableCurveType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof OrientableCurveType) {
            final OrientableCurveType target = this;
            final OrientableCurveType leftObject = ((OrientableCurveType) left);
            final OrientableCurveType rightObject = ((OrientableCurveType) right);
            {
                CurvePropertyType lhsBaseCurve;
                lhsBaseCurve = leftObject.getBaseCurve();
                CurvePropertyType rhsBaseCurve;
                rhsBaseCurve = rightObject.getBaseCurve();
                target.setBaseCurve(((CurvePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "baseCurve", lhsBaseCurve), LocatorUtils.property(rightLocator, "baseCurve", rhsBaseCurve), lhsBaseCurve, rhsBaseCurve)));
            }
            {
                SignType lhsOrientation;
                lhsOrientation = leftObject.getOrientation();
                SignType rhsOrientation;
                rhsOrientation = rightObject.getOrientation();
                target.setOrientation(((SignType) strategy.merge(LocatorUtils.property(leftLocator, "orientation", lhsOrientation), LocatorUtils.property(rightLocator, "orientation", rhsOrientation), lhsOrientation, rhsOrientation)));
            }
        }
    }

}
