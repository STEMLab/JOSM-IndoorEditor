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
 * <p>Java-Klasse für CoordinateSystemAxisType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CoordinateSystemAxisType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}axisAbbrev"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}axisDirection"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}minimumValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}maximumValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}rangeMeaning" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uom" use="required" type="{http://www.opengis.net/gml/3.2}UomIdentifier" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateSystemAxisType", propOrder = {
    "axisAbbrev",
    "axisDirection",
    "minimumValue",
    "maximumValue",
    "rangeMeaning"
})
public class CoordinateSystemAxisType
    extends IdentifiedObjectType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected CodeType axisAbbrev;
    @XmlElement(required = true)
    protected CodeWithAuthorityType axisDirection;
    protected Double minimumValue;
    protected Double maximumValue;
    protected CodeWithAuthorityType rangeMeaning;
    @XmlAttribute(name = "uom", required = true)
    protected String uom;

    /**
     * Ruft den Wert der axisAbbrev-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAxisAbbrev() {
        return axisAbbrev;
    }

    /**
     * Legt den Wert der axisAbbrev-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAxisAbbrev(CodeType value) {
        this.axisAbbrev = value;
    }

    public boolean isSetAxisAbbrev() {
        return (this.axisAbbrev!= null);
    }

    /**
     * Ruft den Wert der axisDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getAxisDirection() {
        return axisDirection;
    }

    /**
     * Legt den Wert der axisDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setAxisDirection(CodeWithAuthorityType value) {
        this.axisDirection = value;
    }

    public boolean isSetAxisDirection() {
        return (this.axisDirection!= null);
    }

    /**
     * Ruft den Wert der minimumValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumValue() {
        return minimumValue;
    }

    /**
     * Legt den Wert der minimumValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumValue(Double value) {
        this.minimumValue = value;
    }

    public boolean isSetMinimumValue() {
        return (this.minimumValue!= null);
    }

    /**
     * Ruft den Wert der maximumValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumValue() {
        return maximumValue;
    }

    /**
     * Legt den Wert der maximumValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumValue(Double value) {
        this.maximumValue = value;
    }

    public boolean isSetMaximumValue() {
        return (this.maximumValue!= null);
    }

    /**
     * Ruft den Wert der rangeMeaning-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getRangeMeaning() {
        return rangeMeaning;
    }

    /**
     * Legt den Wert der rangeMeaning-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setRangeMeaning(CodeWithAuthorityType value) {
        this.rangeMeaning = value;
    }

    public boolean isSetRangeMeaning() {
        return (this.rangeMeaning!= null);
    }

    /**
     * Ruft den Wert der uom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Legt den Wert der uom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    public boolean isSetUom() {
        return (this.uom!= null);
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
            CodeType theAxisAbbrev;
            theAxisAbbrev = this.getAxisAbbrev();
            strategy.appendField(locator, this, "axisAbbrev", buffer, theAxisAbbrev);
        }
        {
            CodeWithAuthorityType theAxisDirection;
            theAxisDirection = this.getAxisDirection();
            strategy.appendField(locator, this, "axisDirection", buffer, theAxisDirection);
        }
        {
            Double theMinimumValue;
            theMinimumValue = this.getMinimumValue();
            strategy.appendField(locator, this, "minimumValue", buffer, theMinimumValue);
        }
        {
            Double theMaximumValue;
            theMaximumValue = this.getMaximumValue();
            strategy.appendField(locator, this, "maximumValue", buffer, theMaximumValue);
        }
        {
            CodeWithAuthorityType theRangeMeaning;
            theRangeMeaning = this.getRangeMeaning();
            strategy.appendField(locator, this, "rangeMeaning", buffer, theRangeMeaning);
        }
        {
            String theUom;
            theUom = this.getUom();
            strategy.appendField(locator, this, "uom", buffer, theUom);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CoordinateSystemAxisType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CoordinateSystemAxisType that = ((CoordinateSystemAxisType) object);
        {
            CodeType lhsAxisAbbrev;
            lhsAxisAbbrev = this.getAxisAbbrev();
            CodeType rhsAxisAbbrev;
            rhsAxisAbbrev = that.getAxisAbbrev();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "axisAbbrev", lhsAxisAbbrev), LocatorUtils.property(thatLocator, "axisAbbrev", rhsAxisAbbrev), lhsAxisAbbrev, rhsAxisAbbrev)) {
                return false;
            }
        }
        {
            CodeWithAuthorityType lhsAxisDirection;
            lhsAxisDirection = this.getAxisDirection();
            CodeWithAuthorityType rhsAxisDirection;
            rhsAxisDirection = that.getAxisDirection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "axisDirection", lhsAxisDirection), LocatorUtils.property(thatLocator, "axisDirection", rhsAxisDirection), lhsAxisDirection, rhsAxisDirection)) {
                return false;
            }
        }
        {
            Double lhsMinimumValue;
            lhsMinimumValue = this.getMinimumValue();
            Double rhsMinimumValue;
            rhsMinimumValue = that.getMinimumValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumValue", lhsMinimumValue), LocatorUtils.property(thatLocator, "minimumValue", rhsMinimumValue), lhsMinimumValue, rhsMinimumValue)) {
                return false;
            }
        }
        {
            Double lhsMaximumValue;
            lhsMaximumValue = this.getMaximumValue();
            Double rhsMaximumValue;
            rhsMaximumValue = that.getMaximumValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumValue", lhsMaximumValue), LocatorUtils.property(thatLocator, "maximumValue", rhsMaximumValue), lhsMaximumValue, rhsMaximumValue)) {
                return false;
            }
        }
        {
            CodeWithAuthorityType lhsRangeMeaning;
            lhsRangeMeaning = this.getRangeMeaning();
            CodeWithAuthorityType rhsRangeMeaning;
            rhsRangeMeaning = that.getRangeMeaning();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rangeMeaning", lhsRangeMeaning), LocatorUtils.property(thatLocator, "rangeMeaning", rhsRangeMeaning), lhsRangeMeaning, rhsRangeMeaning)) {
                return false;
            }
        }
        {
            String lhsUom;
            lhsUom = this.getUom();
            String rhsUom;
            rhsUom = that.getUom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uom", lhsUom), LocatorUtils.property(thatLocator, "uom", rhsUom), lhsUom, rhsUom)) {
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
            CodeType theAxisAbbrev;
            theAxisAbbrev = this.getAxisAbbrev();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axisAbbrev", theAxisAbbrev), currentHashCode, theAxisAbbrev);
        }
        {
            CodeWithAuthorityType theAxisDirection;
            theAxisDirection = this.getAxisDirection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axisDirection", theAxisDirection), currentHashCode, theAxisDirection);
        }
        {
            Double theMinimumValue;
            theMinimumValue = this.getMinimumValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumValue", theMinimumValue), currentHashCode, theMinimumValue);
        }
        {
            Double theMaximumValue;
            theMaximumValue = this.getMaximumValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumValue", theMaximumValue), currentHashCode, theMaximumValue);
        }
        {
            CodeWithAuthorityType theRangeMeaning;
            theRangeMeaning = this.getRangeMeaning();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rangeMeaning", theRangeMeaning), currentHashCode, theRangeMeaning);
        }
        {
            String theUom;
            theUom = this.getUom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uom", theUom), currentHashCode, theUom);
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
        if (draftCopy instanceof CoordinateSystemAxisType) {
            final CoordinateSystemAxisType copy = ((CoordinateSystemAxisType) draftCopy);
            if (this.isSetAxisAbbrev()) {
                CodeType sourceAxisAbbrev;
                sourceAxisAbbrev = this.getAxisAbbrev();
                CodeType copyAxisAbbrev = ((CodeType) strategy.copy(LocatorUtils.property(locator, "axisAbbrev", sourceAxisAbbrev), sourceAxisAbbrev));
                copy.setAxisAbbrev(copyAxisAbbrev);
            } else {
                copy.axisAbbrev = null;
            }
            if (this.isSetAxisDirection()) {
                CodeWithAuthorityType sourceAxisDirection;
                sourceAxisDirection = this.getAxisDirection();
                CodeWithAuthorityType copyAxisDirection = ((CodeWithAuthorityType) strategy.copy(LocatorUtils.property(locator, "axisDirection", sourceAxisDirection), sourceAxisDirection));
                copy.setAxisDirection(copyAxisDirection);
            } else {
                copy.axisDirection = null;
            }
            if (this.isSetMinimumValue()) {
                Double sourceMinimumValue;
                sourceMinimumValue = this.getMinimumValue();
                Double copyMinimumValue = ((Double) strategy.copy(LocatorUtils.property(locator, "minimumValue", sourceMinimumValue), sourceMinimumValue));
                copy.setMinimumValue(copyMinimumValue);
            } else {
                copy.minimumValue = null;
            }
            if (this.isSetMaximumValue()) {
                Double sourceMaximumValue;
                sourceMaximumValue = this.getMaximumValue();
                Double copyMaximumValue = ((Double) strategy.copy(LocatorUtils.property(locator, "maximumValue", sourceMaximumValue), sourceMaximumValue));
                copy.setMaximumValue(copyMaximumValue);
            } else {
                copy.maximumValue = null;
            }
            if (this.isSetRangeMeaning()) {
                CodeWithAuthorityType sourceRangeMeaning;
                sourceRangeMeaning = this.getRangeMeaning();
                CodeWithAuthorityType copyRangeMeaning = ((CodeWithAuthorityType) strategy.copy(LocatorUtils.property(locator, "rangeMeaning", sourceRangeMeaning), sourceRangeMeaning));
                copy.setRangeMeaning(copyRangeMeaning);
            } else {
                copy.rangeMeaning = null;
            }
            if (this.isSetUom()) {
                String sourceUom;
                sourceUom = this.getUom();
                String copyUom = ((String) strategy.copy(LocatorUtils.property(locator, "uom", sourceUom), sourceUom));
                copy.setUom(copyUom);
            } else {
                copy.uom = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CoordinateSystemAxisType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof CoordinateSystemAxisType) {
            final CoordinateSystemAxisType target = this;
            final CoordinateSystemAxisType leftObject = ((CoordinateSystemAxisType) left);
            final CoordinateSystemAxisType rightObject = ((CoordinateSystemAxisType) right);
            {
                CodeType lhsAxisAbbrev;
                lhsAxisAbbrev = leftObject.getAxisAbbrev();
                CodeType rhsAxisAbbrev;
                rhsAxisAbbrev = rightObject.getAxisAbbrev();
                target.setAxisAbbrev(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "axisAbbrev", lhsAxisAbbrev), LocatorUtils.property(rightLocator, "axisAbbrev", rhsAxisAbbrev), lhsAxisAbbrev, rhsAxisAbbrev)));
            }
            {
                CodeWithAuthorityType lhsAxisDirection;
                lhsAxisDirection = leftObject.getAxisDirection();
                CodeWithAuthorityType rhsAxisDirection;
                rhsAxisDirection = rightObject.getAxisDirection();
                target.setAxisDirection(((CodeWithAuthorityType) strategy.merge(LocatorUtils.property(leftLocator, "axisDirection", lhsAxisDirection), LocatorUtils.property(rightLocator, "axisDirection", rhsAxisDirection), lhsAxisDirection, rhsAxisDirection)));
            }
            {
                Double lhsMinimumValue;
                lhsMinimumValue = leftObject.getMinimumValue();
                Double rhsMinimumValue;
                rhsMinimumValue = rightObject.getMinimumValue();
                target.setMinimumValue(((Double) strategy.merge(LocatorUtils.property(leftLocator, "minimumValue", lhsMinimumValue), LocatorUtils.property(rightLocator, "minimumValue", rhsMinimumValue), lhsMinimumValue, rhsMinimumValue)));
            }
            {
                Double lhsMaximumValue;
                lhsMaximumValue = leftObject.getMaximumValue();
                Double rhsMaximumValue;
                rhsMaximumValue = rightObject.getMaximumValue();
                target.setMaximumValue(((Double) strategy.merge(LocatorUtils.property(leftLocator, "maximumValue", lhsMaximumValue), LocatorUtils.property(rightLocator, "maximumValue", rhsMaximumValue), lhsMaximumValue, rhsMaximumValue)));
            }
            {
                CodeWithAuthorityType lhsRangeMeaning;
                lhsRangeMeaning = leftObject.getRangeMeaning();
                CodeWithAuthorityType rhsRangeMeaning;
                rhsRangeMeaning = rightObject.getRangeMeaning();
                target.setRangeMeaning(((CodeWithAuthorityType) strategy.merge(LocatorUtils.property(leftLocator, "rangeMeaning", lhsRangeMeaning), LocatorUtils.property(rightLocator, "rangeMeaning", rhsRangeMeaning), lhsRangeMeaning, rhsRangeMeaning)));
            }
            {
                String lhsUom;
                lhsUom = leftObject.getUom();
                String rhsUom;
                rhsUom = rightObject.getUom();
                target.setUom(((String) strategy.merge(LocatorUtils.property(leftLocator, "uom", lhsUom), LocatorUtils.property(rightLocator, "uom", rhsUom), lhsUom, rhsUom)));
            }
        }
    }

}
