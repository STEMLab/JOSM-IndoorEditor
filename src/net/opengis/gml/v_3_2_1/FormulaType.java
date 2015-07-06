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
 * <p>Java-Klasse für FormulaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FormulaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormulaType", propOrder = {
    "a",
    "b",
    "c",
    "d"
})
public class FormulaType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected Double a;
    protected double b;
    protected double c;
    protected Double d;

    /**
     * Ruft den Wert der a-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getA() {
        return a;
    }

    /**
     * Legt den Wert der a-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setA(Double value) {
        this.a = value;
    }

    public boolean isSetA() {
        return (this.a!= null);
    }

    /**
     * Ruft den Wert der b-Eigenschaft ab.
     * 
     */
    public double getB() {
        return b;
    }

    /**
     * Legt den Wert der b-Eigenschaft fest.
     * 
     */
    public void setB(double value) {
        this.b = value;
    }

    public boolean isSetB() {
        return true;
    }

    /**
     * Ruft den Wert der c-Eigenschaft ab.
     * 
     */
    public double getC() {
        return c;
    }

    /**
     * Legt den Wert der c-Eigenschaft fest.
     * 
     */
    public void setC(double value) {
        this.c = value;
    }

    public boolean isSetC() {
        return true;
    }

    /**
     * Ruft den Wert der d-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getD() {
        return d;
    }

    /**
     * Legt den Wert der d-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setD(Double value) {
        this.d = value;
    }

    public boolean isSetD() {
        return (this.d!= null);
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
            Double theA;
            theA = this.getA();
            strategy.appendField(locator, this, "a", buffer, theA);
        }
        {
            double theB;
            theB = this.getB();
            strategy.appendField(locator, this, "b", buffer, theB);
        }
        {
            double theC;
            theC = this.getC();
            strategy.appendField(locator, this, "c", buffer, theC);
        }
        {
            Double theD;
            theD = this.getD();
            strategy.appendField(locator, this, "d", buffer, theD);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FormulaType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FormulaType that = ((FormulaType) object);
        {
            Double lhsA;
            lhsA = this.getA();
            Double rhsA;
            rhsA = that.getA();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "a", lhsA), LocatorUtils.property(thatLocator, "a", rhsA), lhsA, rhsA)) {
                return false;
            }
        }
        {
            double lhsB;
            lhsB = this.getB();
            double rhsB;
            rhsB = that.getB();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "b", lhsB), LocatorUtils.property(thatLocator, "b", rhsB), lhsB, rhsB)) {
                return false;
            }
        }
        {
            double lhsC;
            lhsC = this.getC();
            double rhsC;
            rhsC = that.getC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "c", lhsC), LocatorUtils.property(thatLocator, "c", rhsC), lhsC, rhsC)) {
                return false;
            }
        }
        {
            Double lhsD;
            lhsD = this.getD();
            Double rhsD;
            rhsD = that.getD();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "d", lhsD), LocatorUtils.property(thatLocator, "d", rhsD), lhsD, rhsD)) {
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
            Double theA;
            theA = this.getA();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "a", theA), currentHashCode, theA);
        }
        {
            double theB;
            theB = this.getB();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "b", theB), currentHashCode, theB);
        }
        {
            double theC;
            theC = this.getC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "c", theC), currentHashCode, theC);
        }
        {
            Double theD;
            theD = this.getD();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "d", theD), currentHashCode, theD);
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
        if (draftCopy instanceof FormulaType) {
            final FormulaType copy = ((FormulaType) draftCopy);
            if (this.isSetA()) {
                Double sourceA;
                sourceA = this.getA();
                Double copyA = ((Double) strategy.copy(LocatorUtils.property(locator, "a", sourceA), sourceA));
                copy.setA(copyA);
            } else {
                copy.a = null;
            }
            if (this.isSetB()) {
                double sourceB;
                sourceB = this.getB();
                double copyB = strategy.copy(LocatorUtils.property(locator, "b", sourceB), sourceB);
                copy.setB(copyB);
            } else {
            }
            if (this.isSetC()) {
                double sourceC;
                sourceC = this.getC();
                double copyC = strategy.copy(LocatorUtils.property(locator, "c", sourceC), sourceC);
                copy.setC(copyC);
            } else {
            }
            if (this.isSetD()) {
                Double sourceD;
                sourceD = this.getD();
                Double copyD = ((Double) strategy.copy(LocatorUtils.property(locator, "d", sourceD), sourceD));
                copy.setD(copyD);
            } else {
                copy.d = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FormulaType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof FormulaType) {
            final FormulaType target = this;
            final FormulaType leftObject = ((FormulaType) left);
            final FormulaType rightObject = ((FormulaType) right);
            {
                Double lhsA;
                lhsA = leftObject.getA();
                Double rhsA;
                rhsA = rightObject.getA();
                target.setA(((Double) strategy.merge(LocatorUtils.property(leftLocator, "a", lhsA), LocatorUtils.property(rightLocator, "a", rhsA), lhsA, rhsA)));
            }
            {
                double lhsB;
                lhsB = leftObject.getB();
                double rhsB;
                rhsB = rightObject.getB();
                target.setB(((double) strategy.merge(LocatorUtils.property(leftLocator, "b", lhsB), LocatorUtils.property(rightLocator, "b", rhsB), lhsB, rhsB)));
            }
            {
                double lhsC;
                lhsC = leftObject.getC();
                double rhsC;
                rhsC = rightObject.getC();
                target.setC(((double) strategy.merge(LocatorUtils.property(leftLocator, "c", lhsC), LocatorUtils.property(rightLocator, "c", rhsC), lhsC, rhsC)));
            }
            {
                Double lhsD;
                lhsD = leftObject.getD();
                Double rhsD;
                rhsD = rightObject.getD();
                target.setD(((Double) strategy.merge(LocatorUtils.property(leftLocator, "d", lhsD), LocatorUtils.property(rightLocator, "d", rhsD), lhsD, rhsD)));
            }
        }
    }

}
