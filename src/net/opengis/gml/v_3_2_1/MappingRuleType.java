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
 * <p>Java-Klasse für MappingRuleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MappingRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ruleDefinition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleReference" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingRuleType", propOrder = {
    "ruleDefinition",
    "ruleReference"
})
public class MappingRuleType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected String ruleDefinition;
    protected ReferenceType ruleReference;

    /**
     * Ruft den Wert der ruleDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDefinition() {
        return ruleDefinition;
    }

    /**
     * Legt den Wert der ruleDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDefinition(String value) {
        this.ruleDefinition = value;
    }

    public boolean isSetRuleDefinition() {
        return (this.ruleDefinition!= null);
    }

    /**
     * Ruft den Wert der ruleReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRuleReference() {
        return ruleReference;
    }

    /**
     * Legt den Wert der ruleReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRuleReference(ReferenceType value) {
        this.ruleReference = value;
    }

    public boolean isSetRuleReference() {
        return (this.ruleReference!= null);
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
            String theRuleDefinition;
            theRuleDefinition = this.getRuleDefinition();
            strategy.appendField(locator, this, "ruleDefinition", buffer, theRuleDefinition);
        }
        {
            ReferenceType theRuleReference;
            theRuleReference = this.getRuleReference();
            strategy.appendField(locator, this, "ruleReference", buffer, theRuleReference);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MappingRuleType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MappingRuleType that = ((MappingRuleType) object);
        {
            String lhsRuleDefinition;
            lhsRuleDefinition = this.getRuleDefinition();
            String rhsRuleDefinition;
            rhsRuleDefinition = that.getRuleDefinition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ruleDefinition", lhsRuleDefinition), LocatorUtils.property(thatLocator, "ruleDefinition", rhsRuleDefinition), lhsRuleDefinition, rhsRuleDefinition)) {
                return false;
            }
        }
        {
            ReferenceType lhsRuleReference;
            lhsRuleReference = this.getRuleReference();
            ReferenceType rhsRuleReference;
            rhsRuleReference = that.getRuleReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ruleReference", lhsRuleReference), LocatorUtils.property(thatLocator, "ruleReference", rhsRuleReference), lhsRuleReference, rhsRuleReference)) {
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
            String theRuleDefinition;
            theRuleDefinition = this.getRuleDefinition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ruleDefinition", theRuleDefinition), currentHashCode, theRuleDefinition);
        }
        {
            ReferenceType theRuleReference;
            theRuleReference = this.getRuleReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ruleReference", theRuleReference), currentHashCode, theRuleReference);
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
        if (draftCopy instanceof MappingRuleType) {
            final MappingRuleType copy = ((MappingRuleType) draftCopy);
            if (this.isSetRuleDefinition()) {
                String sourceRuleDefinition;
                sourceRuleDefinition = this.getRuleDefinition();
                String copyRuleDefinition = ((String) strategy.copy(LocatorUtils.property(locator, "ruleDefinition", sourceRuleDefinition), sourceRuleDefinition));
                copy.setRuleDefinition(copyRuleDefinition);
            } else {
                copy.ruleDefinition = null;
            }
            if (this.isSetRuleReference()) {
                ReferenceType sourceRuleReference;
                sourceRuleReference = this.getRuleReference();
                ReferenceType copyRuleReference = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "ruleReference", sourceRuleReference), sourceRuleReference));
                copy.setRuleReference(copyRuleReference);
            } else {
                copy.ruleReference = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MappingRuleType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof MappingRuleType) {
            final MappingRuleType target = this;
            final MappingRuleType leftObject = ((MappingRuleType) left);
            final MappingRuleType rightObject = ((MappingRuleType) right);
            {
                String lhsRuleDefinition;
                lhsRuleDefinition = leftObject.getRuleDefinition();
                String rhsRuleDefinition;
                rhsRuleDefinition = rightObject.getRuleDefinition();
                target.setRuleDefinition(((String) strategy.merge(LocatorUtils.property(leftLocator, "ruleDefinition", lhsRuleDefinition), LocatorUtils.property(rightLocator, "ruleDefinition", rhsRuleDefinition), lhsRuleDefinition, rhsRuleDefinition)));
            }
            {
                ReferenceType lhsRuleReference;
                lhsRuleReference = leftObject.getRuleReference();
                ReferenceType rhsRuleReference;
                rhsRuleReference = rightObject.getRuleReference();
                target.setRuleReference(((ReferenceType) strategy.merge(LocatorUtils.property(leftLocator, "ruleReference", lhsRuleReference), LocatorUtils.property(rightLocator, "ruleReference", rhsRuleReference), lhsRuleReference, rhsRuleReference)));
            }
        }
    }

}
