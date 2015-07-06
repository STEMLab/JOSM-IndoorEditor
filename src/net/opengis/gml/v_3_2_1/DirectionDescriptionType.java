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
 * direction descriptions are specified by a compass point code, a keyword, a textual description or a reference to a description.
 * A gml:compassPoint is specified by a simple enumeration.  	
 * In addition, thre elements to contain text-based descriptions of direction are provided.  
 * If the direction is specified using a term from a list, gml:keyword should be used, and the list indicated using the value of the codeSpace attribute. 
 * if the direction is decribed in prose, gml:direction or gml:reference should be used, allowing the value to be included inline or by reference.
 * 
 * <p>Java-Klasse für DirectionDescriptionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DirectionDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="compassPoint" type="{http://www.opengis.net/gml/3.2}CompassPointEnumeration"/>
 *         &lt;element name="keyword" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reference" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionDescriptionType", propOrder = {
    "compassPoint",
    "keyword",
    "description",
    "reference"
})
public class DirectionDescriptionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected CompassPointEnumeration compassPoint;
    protected CodeType keyword;
    protected String description;
    protected ReferenceType reference;

    /**
     * Ruft den Wert der compassPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompassPointEnumeration }
     *     
     */
    public CompassPointEnumeration getCompassPoint() {
        return compassPoint;
    }

    /**
     * Legt den Wert der compassPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompassPointEnumeration }
     *     
     */
    public void setCompassPoint(CompassPointEnumeration value) {
        this.compassPoint = value;
    }

    public boolean isSetCompassPoint() {
        return (this.compassPoint!= null);
    }

    /**
     * Ruft den Wert der keyword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getKeyword() {
        return keyword;
    }

    /**
     * Legt den Wert der keyword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setKeyword(CodeType value) {
        this.keyword = value;
    }

    public boolean isSetKeyword() {
        return (this.keyword!= null);
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Ruft den Wert der reference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getReference() {
        return reference;
    }

    /**
     * Legt den Wert der reference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setReference(ReferenceType value) {
        this.reference = value;
    }

    public boolean isSetReference() {
        return (this.reference!= null);
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
            CompassPointEnumeration theCompassPoint;
            theCompassPoint = this.getCompassPoint();
            strategy.appendField(locator, this, "compassPoint", buffer, theCompassPoint);
        }
        {
            CodeType theKeyword;
            theKeyword = this.getKeyword();
            strategy.appendField(locator, this, "keyword", buffer, theKeyword);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            ReferenceType theReference;
            theReference = this.getReference();
            strategy.appendField(locator, this, "reference", buffer, theReference);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DirectionDescriptionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DirectionDescriptionType that = ((DirectionDescriptionType) object);
        {
            CompassPointEnumeration lhsCompassPoint;
            lhsCompassPoint = this.getCompassPoint();
            CompassPointEnumeration rhsCompassPoint;
            rhsCompassPoint = that.getCompassPoint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compassPoint", lhsCompassPoint), LocatorUtils.property(thatLocator, "compassPoint", rhsCompassPoint), lhsCompassPoint, rhsCompassPoint)) {
                return false;
            }
        }
        {
            CodeType lhsKeyword;
            lhsKeyword = this.getKeyword();
            CodeType rhsKeyword;
            rhsKeyword = that.getKeyword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyword", lhsKeyword), LocatorUtils.property(thatLocator, "keyword", rhsKeyword), lhsKeyword, rhsKeyword)) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            ReferenceType lhsReference;
            lhsReference = this.getReference();
            ReferenceType rhsReference;
            rhsReference = that.getReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reference", lhsReference), LocatorUtils.property(thatLocator, "reference", rhsReference), lhsReference, rhsReference)) {
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
            CompassPointEnumeration theCompassPoint;
            theCompassPoint = this.getCompassPoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compassPoint", theCompassPoint), currentHashCode, theCompassPoint);
        }
        {
            CodeType theKeyword;
            theKeyword = this.getKeyword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyword", theKeyword), currentHashCode, theKeyword);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            ReferenceType theReference;
            theReference = this.getReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reference", theReference), currentHashCode, theReference);
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
        if (draftCopy instanceof DirectionDescriptionType) {
            final DirectionDescriptionType copy = ((DirectionDescriptionType) draftCopy);
            if (this.isSetCompassPoint()) {
                CompassPointEnumeration sourceCompassPoint;
                sourceCompassPoint = this.getCompassPoint();
                CompassPointEnumeration copyCompassPoint = ((CompassPointEnumeration) strategy.copy(LocatorUtils.property(locator, "compassPoint", sourceCompassPoint), sourceCompassPoint));
                copy.setCompassPoint(copyCompassPoint);
            } else {
                copy.compassPoint = null;
            }
            if (this.isSetKeyword()) {
                CodeType sourceKeyword;
                sourceKeyword = this.getKeyword();
                CodeType copyKeyword = ((CodeType) strategy.copy(LocatorUtils.property(locator, "keyword", sourceKeyword), sourceKeyword));
                copy.setKeyword(copyKeyword);
            } else {
                copy.keyword = null;
            }
            if (this.isSetDescription()) {
                String sourceDescription;
                sourceDescription = this.getDescription();
                String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                copy.setDescription(copyDescription);
            } else {
                copy.description = null;
            }
            if (this.isSetReference()) {
                ReferenceType sourceReference;
                sourceReference = this.getReference();
                ReferenceType copyReference = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "reference", sourceReference), sourceReference));
                copy.setReference(copyReference);
            } else {
                copy.reference = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DirectionDescriptionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof DirectionDescriptionType) {
            final DirectionDescriptionType target = this;
            final DirectionDescriptionType leftObject = ((DirectionDescriptionType) left);
            final DirectionDescriptionType rightObject = ((DirectionDescriptionType) right);
            {
                CompassPointEnumeration lhsCompassPoint;
                lhsCompassPoint = leftObject.getCompassPoint();
                CompassPointEnumeration rhsCompassPoint;
                rhsCompassPoint = rightObject.getCompassPoint();
                target.setCompassPoint(((CompassPointEnumeration) strategy.merge(LocatorUtils.property(leftLocator, "compassPoint", lhsCompassPoint), LocatorUtils.property(rightLocator, "compassPoint", rhsCompassPoint), lhsCompassPoint, rhsCompassPoint)));
            }
            {
                CodeType lhsKeyword;
                lhsKeyword = leftObject.getKeyword();
                CodeType rhsKeyword;
                rhsKeyword = rightObject.getKeyword();
                target.setKeyword(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "keyword", lhsKeyword), LocatorUtils.property(rightLocator, "keyword", rhsKeyword), lhsKeyword, rhsKeyword)));
            }
            {
                String lhsDescription;
                lhsDescription = leftObject.getDescription();
                String rhsDescription;
                rhsDescription = rightObject.getDescription();
                target.setDescription(((String) strategy.merge(LocatorUtils.property(leftLocator, "description", lhsDescription), LocatorUtils.property(rightLocator, "description", rhsDescription), lhsDescription, rhsDescription)));
            }
            {
                ReferenceType lhsReference;
                lhsReference = leftObject.getReference();
                ReferenceType rhsReference;
                rhsReference = rightObject.getReference();
                target.setReference(((ReferenceType) strategy.merge(LocatorUtils.property(leftLocator, "reference", lhsReference), LocatorUtils.property(rightLocator, "reference", rhsReference), lhsReference, rhsReference)));
            }
        }
    }

}
