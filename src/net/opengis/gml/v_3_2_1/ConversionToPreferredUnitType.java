//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * The inherited attribute uom references the preferred unit that this conversion applies to. The conversion of a unit to the preferred unit for this physical quantity type is specified by an arithmetic conversion (scaling and/or offset). The content model extends gml:UnitOfMeasureType, which has a mandatory attribute uom which identifies the preferred unit for the physical quantity type that this conversion applies to. The conversion is specified by a choice of 
 * -	gml:factor, which defines the scale factor, or
 * -	gml:formula, which defines a formula 
 * by which a value using the conventional unit of measure can be converted to obtain the corresponding value using the preferred unit of measure.  
 * The formula defines the parameters of a simple formula by which a value using the conventional unit of measure can be converted to the corresponding value using the preferred unit of measure. The formula element contains elements a, b, c and d, whose values use the XML Schema type double. These values are used in the formula y = (a + bx) / (c + dx), where x is a value using this unit, and y is the corresponding value using the base unit. The elements a and d are optional, and if values are not provided, those parameters are considered to be zero. If values are not provided for both a and d, the formula is equivalent to a fraction with numerator and denominator parameters.
 * 
 * <p>Java-Klasse für ConversionToPreferredUnitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConversionToPreferredUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}UnitOfMeasureType">
 *       &lt;choice>
 *         &lt;element name="factor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="formula" type="{http://www.opengis.net/gml/3.2}FormulaType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionToPreferredUnitType", propOrder = {
    "factor",
    "formula"
})
public class ConversionToPreferredUnitType
    extends UnitOfMeasureType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected Double factor;
    protected FormulaType formula;

    /**
     * Ruft den Wert der factor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFactor() {
        return factor;
    }

    /**
     * Legt den Wert der factor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFactor(Double value) {
        this.factor = value;
    }

    public boolean isSetFactor() {
        return (this.factor!= null);
    }

    /**
     * Ruft den Wert der formula-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FormulaType }
     *     
     */
    public FormulaType getFormula() {
        return formula;
    }

    /**
     * Legt den Wert der formula-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaType }
     *     
     */
    public void setFormula(FormulaType value) {
        this.formula = value;
    }

    public boolean isSetFormula() {
        return (this.formula!= null);
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
            Double theFactor;
            theFactor = this.getFactor();
            strategy.appendField(locator, this, "factor", buffer, theFactor);
        }
        {
            FormulaType theFormula;
            theFormula = this.getFormula();
            strategy.appendField(locator, this, "formula", buffer, theFormula);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConversionToPreferredUnitType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConversionToPreferredUnitType that = ((ConversionToPreferredUnitType) object);
        {
            Double lhsFactor;
            lhsFactor = this.getFactor();
            Double rhsFactor;
            rhsFactor = that.getFactor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "factor", lhsFactor), LocatorUtils.property(thatLocator, "factor", rhsFactor), lhsFactor, rhsFactor)) {
                return false;
            }
        }
        {
            FormulaType lhsFormula;
            lhsFormula = this.getFormula();
            FormulaType rhsFormula;
            rhsFormula = that.getFormula();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formula", lhsFormula), LocatorUtils.property(thatLocator, "formula", rhsFormula), lhsFormula, rhsFormula)) {
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
            Double theFactor;
            theFactor = this.getFactor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "factor", theFactor), currentHashCode, theFactor);
        }
        {
            FormulaType theFormula;
            theFormula = this.getFormula();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formula", theFormula), currentHashCode, theFormula);
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
        if (draftCopy instanceof ConversionToPreferredUnitType) {
            final ConversionToPreferredUnitType copy = ((ConversionToPreferredUnitType) draftCopy);
            if (this.isSetFactor()) {
                Double sourceFactor;
                sourceFactor = this.getFactor();
                Double copyFactor = ((Double) strategy.copy(LocatorUtils.property(locator, "factor", sourceFactor), sourceFactor));
                copy.setFactor(copyFactor);
            } else {
                copy.factor = null;
            }
            if (this.isSetFormula()) {
                FormulaType sourceFormula;
                sourceFormula = this.getFormula();
                FormulaType copyFormula = ((FormulaType) strategy.copy(LocatorUtils.property(locator, "formula", sourceFormula), sourceFormula));
                copy.setFormula(copyFormula);
            } else {
                copy.formula = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ConversionToPreferredUnitType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ConversionToPreferredUnitType) {
            final ConversionToPreferredUnitType target = this;
            final ConversionToPreferredUnitType leftObject = ((ConversionToPreferredUnitType) left);
            final ConversionToPreferredUnitType rightObject = ((ConversionToPreferredUnitType) right);
            {
                Double lhsFactor;
                lhsFactor = leftObject.getFactor();
                Double rhsFactor;
                rhsFactor = rightObject.getFactor();
                target.setFactor(((Double) strategy.merge(LocatorUtils.property(leftLocator, "factor", lhsFactor), LocatorUtils.property(rightLocator, "factor", rhsFactor), lhsFactor, rhsFactor)));
            }
            {
                FormulaType lhsFormula;
                lhsFormula = leftObject.getFormula();
                FormulaType rhsFormula;
                rhsFormula = rightObject.getFormula();
                target.setFormula(((FormulaType) strategy.merge(LocatorUtils.property(leftLocator, "formula", lhsFormula), LocatorUtils.property(rightLocator, "formula", rhsFormula), lhsFormula, rhsFormula)));
            }
        }
    }

}
