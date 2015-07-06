//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java-Klasse für AbstractCurveSegmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractCurveSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="numDerivativesAtStart" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="numDerivativesAtEnd" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="numDerivativeInterior" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCurveSegmentType")
@XmlSeeAlso({
    GeodesicStringType.class,
    LineStringSegmentType.class,
    ArcStringType.class,
    BSplineType.class,
    OffsetCurveType.class,
    ClothoidType.class,
    CubicSplineType.class,
    ArcByCenterPointType.class,
    ArcStringByBulgeType.class
})
public abstract class AbstractCurveSegmentType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlAttribute(name = "numDerivativesAtStart")
    protected BigInteger numDerivativesAtStart;
    @XmlAttribute(name = "numDerivativesAtEnd")
    protected BigInteger numDerivativesAtEnd;
    @XmlAttribute(name = "numDerivativeInterior")
    protected BigInteger numDerivativeInterior;

    /**
     * Ruft den Wert der numDerivativesAtStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativesAtStart() {
        if (numDerivativesAtStart == null) {
            return new BigInteger("0");
        } else {
            return numDerivativesAtStart;
        }
    }

    /**
     * Legt den Wert der numDerivativesAtStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativesAtStart(BigInteger value) {
        this.numDerivativesAtStart = value;
    }

    public boolean isSetNumDerivativesAtStart() {
        return (this.numDerivativesAtStart!= null);
    }

    /**
     * Ruft den Wert der numDerivativesAtEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativesAtEnd() {
        if (numDerivativesAtEnd == null) {
            return new BigInteger("0");
        } else {
            return numDerivativesAtEnd;
        }
    }

    /**
     * Legt den Wert der numDerivativesAtEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativesAtEnd(BigInteger value) {
        this.numDerivativesAtEnd = value;
    }

    public boolean isSetNumDerivativesAtEnd() {
        return (this.numDerivativesAtEnd!= null);
    }

    /**
     * Ruft den Wert der numDerivativeInterior-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativeInterior() {
        if (numDerivativeInterior == null) {
            return new BigInteger("0");
        } else {
            return numDerivativeInterior;
        }
    }

    /**
     * Legt den Wert der numDerivativeInterior-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativeInterior(BigInteger value) {
        this.numDerivativeInterior = value;
    }

    public boolean isSetNumDerivativeInterior() {
        return (this.numDerivativeInterior!= null);
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
        {
            BigInteger theNumDerivativesAtStart;
            theNumDerivativesAtStart = this.getNumDerivativesAtStart();
            strategy.appendField(locator, this, "numDerivativesAtStart", buffer, theNumDerivativesAtStart);
        }
        {
            BigInteger theNumDerivativesAtEnd;
            theNumDerivativesAtEnd = this.getNumDerivativesAtEnd();
            strategy.appendField(locator, this, "numDerivativesAtEnd", buffer, theNumDerivativesAtEnd);
        }
        {
            BigInteger theNumDerivativeInterior;
            theNumDerivativeInterior = this.getNumDerivativeInterior();
            strategy.appendField(locator, this, "numDerivativeInterior", buffer, theNumDerivativeInterior);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractCurveSegmentType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AbstractCurveSegmentType that = ((AbstractCurveSegmentType) object);
        {
            BigInteger lhsNumDerivativesAtStart;
            lhsNumDerivativesAtStart = this.getNumDerivativesAtStart();
            BigInteger rhsNumDerivativesAtStart;
            rhsNumDerivativesAtStart = that.getNumDerivativesAtStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numDerivativesAtStart", lhsNumDerivativesAtStart), LocatorUtils.property(thatLocator, "numDerivativesAtStart", rhsNumDerivativesAtStart), lhsNumDerivativesAtStart, rhsNumDerivativesAtStart)) {
                return false;
            }
        }
        {
            BigInteger lhsNumDerivativesAtEnd;
            lhsNumDerivativesAtEnd = this.getNumDerivativesAtEnd();
            BigInteger rhsNumDerivativesAtEnd;
            rhsNumDerivativesAtEnd = that.getNumDerivativesAtEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numDerivativesAtEnd", lhsNumDerivativesAtEnd), LocatorUtils.property(thatLocator, "numDerivativesAtEnd", rhsNumDerivativesAtEnd), lhsNumDerivativesAtEnd, rhsNumDerivativesAtEnd)) {
                return false;
            }
        }
        {
            BigInteger lhsNumDerivativeInterior;
            lhsNumDerivativeInterior = this.getNumDerivativeInterior();
            BigInteger rhsNumDerivativeInterior;
            rhsNumDerivativeInterior = that.getNumDerivativeInterior();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numDerivativeInterior", lhsNumDerivativeInterior), LocatorUtils.property(thatLocator, "numDerivativeInterior", rhsNumDerivativeInterior), lhsNumDerivativeInterior, rhsNumDerivativeInterior)) {
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
        int currentHashCode = 1;
        {
            BigInteger theNumDerivativesAtStart;
            theNumDerivativesAtStart = this.getNumDerivativesAtStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numDerivativesAtStart", theNumDerivativesAtStart), currentHashCode, theNumDerivativesAtStart);
        }
        {
            BigInteger theNumDerivativesAtEnd;
            theNumDerivativesAtEnd = this.getNumDerivativesAtEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numDerivativesAtEnd", theNumDerivativesAtEnd), currentHashCode, theNumDerivativesAtEnd);
        }
        {
            BigInteger theNumDerivativeInterior;
            theNumDerivativeInterior = this.getNumDerivativeInterior();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numDerivativeInterior", theNumDerivativeInterior), currentHashCode, theNumDerivativeInterior);
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
        if (target instanceof AbstractCurveSegmentType) {
            final AbstractCurveSegmentType copy = ((AbstractCurveSegmentType) target);
            if (this.isSetNumDerivativesAtStart()) {
                BigInteger sourceNumDerivativesAtStart;
                sourceNumDerivativesAtStart = this.getNumDerivativesAtStart();
                BigInteger copyNumDerivativesAtStart = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "numDerivativesAtStart", sourceNumDerivativesAtStart), sourceNumDerivativesAtStart));
                copy.setNumDerivativesAtStart(copyNumDerivativesAtStart);
            } else {
                copy.numDerivativesAtStart = null;
            }
            if (this.isSetNumDerivativesAtEnd()) {
                BigInteger sourceNumDerivativesAtEnd;
                sourceNumDerivativesAtEnd = this.getNumDerivativesAtEnd();
                BigInteger copyNumDerivativesAtEnd = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "numDerivativesAtEnd", sourceNumDerivativesAtEnd), sourceNumDerivativesAtEnd));
                copy.setNumDerivativesAtEnd(copyNumDerivativesAtEnd);
            } else {
                copy.numDerivativesAtEnd = null;
            }
            if (this.isSetNumDerivativeInterior()) {
                BigInteger sourceNumDerivativeInterior;
                sourceNumDerivativeInterior = this.getNumDerivativeInterior();
                BigInteger copyNumDerivativeInterior = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "numDerivativeInterior", sourceNumDerivativeInterior), sourceNumDerivativeInterior));
                copy.setNumDerivativeInterior(copyNumDerivativeInterior);
            } else {
                copy.numDerivativeInterior = null;
            }
        }
        return target;
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof AbstractCurveSegmentType) {
            final AbstractCurveSegmentType target = this;
            final AbstractCurveSegmentType leftObject = ((AbstractCurveSegmentType) left);
            final AbstractCurveSegmentType rightObject = ((AbstractCurveSegmentType) right);
            {
                BigInteger lhsNumDerivativesAtStart;
                lhsNumDerivativesAtStart = leftObject.getNumDerivativesAtStart();
                BigInteger rhsNumDerivativesAtStart;
                rhsNumDerivativesAtStart = rightObject.getNumDerivativesAtStart();
                target.setNumDerivativesAtStart(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "numDerivativesAtStart", lhsNumDerivativesAtStart), LocatorUtils.property(rightLocator, "numDerivativesAtStart", rhsNumDerivativesAtStart), lhsNumDerivativesAtStart, rhsNumDerivativesAtStart)));
            }
            {
                BigInteger lhsNumDerivativesAtEnd;
                lhsNumDerivativesAtEnd = leftObject.getNumDerivativesAtEnd();
                BigInteger rhsNumDerivativesAtEnd;
                rhsNumDerivativesAtEnd = rightObject.getNumDerivativesAtEnd();
                target.setNumDerivativesAtEnd(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "numDerivativesAtEnd", lhsNumDerivativesAtEnd), LocatorUtils.property(rightLocator, "numDerivativesAtEnd", rhsNumDerivativesAtEnd), lhsNumDerivativesAtEnd, rhsNumDerivativesAtEnd)));
            }
            {
                BigInteger lhsNumDerivativeInterior;
                lhsNumDerivativeInterior = leftObject.getNumDerivativeInterior();
                BigInteger rhsNumDerivativeInterior;
                rhsNumDerivativeInterior = rightObject.getNumDerivativeInterior();
                target.setNumDerivativeInterior(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "numDerivativeInterior", lhsNumDerivativeInterior), LocatorUtils.property(rightLocator, "numDerivativeInterior", rhsNumDerivativeInterior), lhsNumDerivativeInterior, rhsNumDerivativeInterior)));
            }
        }
    }

}
