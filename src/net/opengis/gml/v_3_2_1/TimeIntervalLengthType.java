//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java-Klasse für TimeIntervalLengthType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeIntervalLengthType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="unit" use="required" type="{http://www.opengis.net/gml/3.2}TimeUnitType" />
 *       &lt;attribute name="radix" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="factor" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeIntervalLengthType", propOrder = {
    "value"
})
public class TimeIntervalLengthType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "unit", required = true)
    protected String unit;
    @XmlAttribute(name = "radix")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger radix;
    @XmlAttribute(name = "factor")
    protected BigInteger factor;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    public boolean isSetUnit() {
        return (this.unit!= null);
    }

    /**
     * Ruft den Wert der radix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadix() {
        return radix;
    }

    /**
     * Legt den Wert der radix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadix(BigInteger value) {
        this.radix = value;
    }

    public boolean isSetRadix() {
        return (this.radix!= null);
    }

    /**
     * Ruft den Wert der factor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactor() {
        return factor;
    }

    /**
     * Legt den Wert der factor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactor(BigInteger value) {
        this.factor = value;
    }

    public boolean isSetFactor() {
        return (this.factor!= null);
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
            BigDecimal theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            String theUnit;
            theUnit = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theUnit);
        }
        {
            BigInteger theRadix;
            theRadix = this.getRadix();
            strategy.appendField(locator, this, "radix", buffer, theRadix);
        }
        {
            BigInteger theFactor;
            theFactor = this.getFactor();
            strategy.appendField(locator, this, "factor", buffer, theFactor);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeIntervalLengthType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeIntervalLengthType that = ((TimeIntervalLengthType) object);
        {
            BigDecimal lhsValue;
            lhsValue = this.getValue();
            BigDecimal rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsUnit;
            lhsUnit = this.getUnit();
            String rhsUnit;
            rhsUnit = that.getUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unit", lhsUnit), LocatorUtils.property(thatLocator, "unit", rhsUnit), lhsUnit, rhsUnit)) {
                return false;
            }
        }
        {
            BigInteger lhsRadix;
            lhsRadix = this.getRadix();
            BigInteger rhsRadix;
            rhsRadix = that.getRadix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "radix", lhsRadix), LocatorUtils.property(thatLocator, "radix", rhsRadix), lhsRadix, rhsRadix)) {
                return false;
            }
        }
        {
            BigInteger lhsFactor;
            lhsFactor = this.getFactor();
            BigInteger rhsFactor;
            rhsFactor = that.getFactor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "factor", lhsFactor), LocatorUtils.property(thatLocator, "factor", rhsFactor), lhsFactor, rhsFactor)) {
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
            BigDecimal theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theUnit;
            theUnit = this.getUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unit", theUnit), currentHashCode, theUnit);
        }
        {
            BigInteger theRadix;
            theRadix = this.getRadix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "radix", theRadix), currentHashCode, theRadix);
        }
        {
            BigInteger theFactor;
            theFactor = this.getFactor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "factor", theFactor), currentHashCode, theFactor);
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
        if (draftCopy instanceof TimeIntervalLengthType) {
            final TimeIntervalLengthType copy = ((TimeIntervalLengthType) draftCopy);
            if (this.isSetValue()) {
                BigDecimal sourceValue;
                sourceValue = this.getValue();
                BigDecimal copyValue = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.isSetUnit()) {
                String sourceUnit;
                sourceUnit = this.getUnit();
                String copyUnit = ((String) strategy.copy(LocatorUtils.property(locator, "unit", sourceUnit), sourceUnit));
                copy.setUnit(copyUnit);
            } else {
                copy.unit = null;
            }
            if (this.isSetRadix()) {
                BigInteger sourceRadix;
                sourceRadix = this.getRadix();
                BigInteger copyRadix = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "radix", sourceRadix), sourceRadix));
                copy.setRadix(copyRadix);
            } else {
                copy.radix = null;
            }
            if (this.isSetFactor()) {
                BigInteger sourceFactor;
                sourceFactor = this.getFactor();
                BigInteger copyFactor = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "factor", sourceFactor), sourceFactor));
                copy.setFactor(copyFactor);
            } else {
                copy.factor = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimeIntervalLengthType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof TimeIntervalLengthType) {
            final TimeIntervalLengthType target = this;
            final TimeIntervalLengthType leftObject = ((TimeIntervalLengthType) left);
            final TimeIntervalLengthType rightObject = ((TimeIntervalLengthType) right);
            {
                BigDecimal lhsValue;
                lhsValue = leftObject.getValue();
                BigDecimal rhsValue;
                rhsValue = rightObject.getValue();
                target.setValue(((BigDecimal) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue)));
            }
            {
                String lhsUnit;
                lhsUnit = leftObject.getUnit();
                String rhsUnit;
                rhsUnit = rightObject.getUnit();
                target.setUnit(((String) strategy.merge(LocatorUtils.property(leftLocator, "unit", lhsUnit), LocatorUtils.property(rightLocator, "unit", rhsUnit), lhsUnit, rhsUnit)));
            }
            {
                BigInteger lhsRadix;
                lhsRadix = leftObject.getRadix();
                BigInteger rhsRadix;
                rhsRadix = rightObject.getRadix();
                target.setRadix(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "radix", lhsRadix), LocatorUtils.property(rightLocator, "radix", rhsRadix), lhsRadix, rhsRadix)));
            }
            {
                BigInteger lhsFactor;
                lhsFactor = leftObject.getFactor();
                BigInteger rhsFactor;
                rhsFactor = rightObject.getFactor();
                target.setFactor(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "factor", lhsFactor), LocatorUtils.property(rightLocator, "factor", rhsFactor), lhsFactor, rhsFactor)));
            }
        }
    }

}
