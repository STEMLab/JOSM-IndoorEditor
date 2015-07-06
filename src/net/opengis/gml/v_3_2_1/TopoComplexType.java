//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java-Klasse für TopoComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopoComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopologyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}maximalComplex"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}superComplex" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}subComplex" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}topoPrimitiveMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}topoPrimitiveMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *       &lt;attribute name="isMaximal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoComplexType", propOrder = {
    "maximalComplex",
    "superComplex",
    "subComplex",
    "topoPrimitiveMember",
    "topoPrimitiveMembers"
})
public class TopoComplexType
    extends AbstractTopologyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected TopoComplexPropertyType maximalComplex;
    protected List<TopoComplexPropertyType> superComplex;
    protected List<TopoComplexPropertyType> subComplex;
    protected List<TopoPrimitiveMemberType> topoPrimitiveMember;
    protected TopoPrimitiveArrayAssociationType topoPrimitiveMembers;
    @XmlAttribute(name = "isMaximal")
    protected java.lang.Boolean isMaximal;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Ruft den Wert der maximalComplex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopoComplexPropertyType }
     *     
     */
    public TopoComplexPropertyType getMaximalComplex() {
        return maximalComplex;
    }

    /**
     * Legt den Wert der maximalComplex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoComplexPropertyType }
     *     
     */
    public void setMaximalComplex(TopoComplexPropertyType value) {
        this.maximalComplex = value;
    }

    public boolean isSetMaximalComplex() {
        return (this.maximalComplex!= null);
    }

    /**
     * Gets the value of the superComplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superComplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperComplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoComplexPropertyType }
     * 
     * 
     */
    public List<TopoComplexPropertyType> getSuperComplex() {
        if (superComplex == null) {
            superComplex = new ArrayList<TopoComplexPropertyType>();
        }
        return this.superComplex;
    }

    public boolean isSetSuperComplex() {
        return ((this.superComplex!= null)&&(!this.superComplex.isEmpty()));
    }

    public void unsetSuperComplex() {
        this.superComplex = null;
    }

    /**
     * Gets the value of the subComplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subComplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubComplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoComplexPropertyType }
     * 
     * 
     */
    public List<TopoComplexPropertyType> getSubComplex() {
        if (subComplex == null) {
            subComplex = new ArrayList<TopoComplexPropertyType>();
        }
        return this.subComplex;
    }

    public boolean isSetSubComplex() {
        return ((this.subComplex!= null)&&(!this.subComplex.isEmpty()));
    }

    public void unsetSubComplex() {
        this.subComplex = null;
    }

    /**
     * Gets the value of the topoPrimitiveMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topoPrimitiveMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopoPrimitiveMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoPrimitiveMemberType }
     * 
     * 
     */
    public List<TopoPrimitiveMemberType> getTopoPrimitiveMember() {
        if (topoPrimitiveMember == null) {
            topoPrimitiveMember = new ArrayList<TopoPrimitiveMemberType>();
        }
        return this.topoPrimitiveMember;
    }

    public boolean isSetTopoPrimitiveMember() {
        return ((this.topoPrimitiveMember!= null)&&(!this.topoPrimitiveMember.isEmpty()));
    }

    public void unsetTopoPrimitiveMember() {
        this.topoPrimitiveMember = null;
    }

    /**
     * Ruft den Wert der topoPrimitiveMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopoPrimitiveArrayAssociationType }
     *     
     */
    public TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers() {
        return topoPrimitiveMembers;
    }

    /**
     * Legt den Wert der topoPrimitiveMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoPrimitiveArrayAssociationType }
     *     
     */
    public void setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType value) {
        this.topoPrimitiveMembers = value;
    }

    public boolean isSetTopoPrimitiveMembers() {
        return (this.topoPrimitiveMembers!= null);
    }

    /**
     * Ruft den Wert der isMaximal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isIsMaximal() {
        if (isMaximal == null) {
            return false;
        } else {
            return isMaximal;
        }
    }

    /**
     * Legt den Wert der isMaximal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setIsMaximal(boolean value) {
        this.isMaximal = value;
    }

    public boolean isSetIsMaximal() {
        return (this.isMaximal!= null);
    }

    public void unsetIsMaximal() {
        this.isMaximal = null;
    }

    /**
     * Ruft den Wert der aggregationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Legt den Wert der aggregationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

    public boolean isSetAggregationType() {
        return (this.aggregationType!= null);
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
            TopoComplexPropertyType theMaximalComplex;
            theMaximalComplex = this.getMaximalComplex();
            strategy.appendField(locator, this, "maximalComplex", buffer, theMaximalComplex);
        }
        {
            List<TopoComplexPropertyType> theSuperComplex;
            theSuperComplex = this.getSuperComplex();
            strategy.appendField(locator, this, "superComplex", buffer, theSuperComplex);
        }
        {
            List<TopoComplexPropertyType> theSubComplex;
            theSubComplex = this.getSubComplex();
            strategy.appendField(locator, this, "subComplex", buffer, theSubComplex);
        }
        {
            List<TopoPrimitiveMemberType> theTopoPrimitiveMember;
            theTopoPrimitiveMember = this.getTopoPrimitiveMember();
            strategy.appendField(locator, this, "topoPrimitiveMember", buffer, theTopoPrimitiveMember);
        }
        {
            TopoPrimitiveArrayAssociationType theTopoPrimitiveMembers;
            theTopoPrimitiveMembers = this.getTopoPrimitiveMembers();
            strategy.appendField(locator, this, "topoPrimitiveMembers", buffer, theTopoPrimitiveMembers);
        }
        {
            boolean theIsMaximal;
            theIsMaximal = this.isIsMaximal();
            strategy.appendField(locator, this, "isMaximal", buffer, theIsMaximal);
        }
        {
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theAggregationType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TopoComplexType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TopoComplexType that = ((TopoComplexType) object);
        {
            TopoComplexPropertyType lhsMaximalComplex;
            lhsMaximalComplex = this.getMaximalComplex();
            TopoComplexPropertyType rhsMaximalComplex;
            rhsMaximalComplex = that.getMaximalComplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximalComplex", lhsMaximalComplex), LocatorUtils.property(thatLocator, "maximalComplex", rhsMaximalComplex), lhsMaximalComplex, rhsMaximalComplex)) {
                return false;
            }
        }
        {
            List<TopoComplexPropertyType> lhsSuperComplex;
            lhsSuperComplex = this.getSuperComplex();
            List<TopoComplexPropertyType> rhsSuperComplex;
            rhsSuperComplex = that.getSuperComplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "superComplex", lhsSuperComplex), LocatorUtils.property(thatLocator, "superComplex", rhsSuperComplex), lhsSuperComplex, rhsSuperComplex)) {
                return false;
            }
        }
        {
            List<TopoComplexPropertyType> lhsSubComplex;
            lhsSubComplex = this.getSubComplex();
            List<TopoComplexPropertyType> rhsSubComplex;
            rhsSubComplex = that.getSubComplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subComplex", lhsSubComplex), LocatorUtils.property(thatLocator, "subComplex", rhsSubComplex), lhsSubComplex, rhsSubComplex)) {
                return false;
            }
        }
        {
            List<TopoPrimitiveMemberType> lhsTopoPrimitiveMember;
            lhsTopoPrimitiveMember = this.getTopoPrimitiveMember();
            List<TopoPrimitiveMemberType> rhsTopoPrimitiveMember;
            rhsTopoPrimitiveMember = that.getTopoPrimitiveMember();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topoPrimitiveMember", lhsTopoPrimitiveMember), LocatorUtils.property(thatLocator, "topoPrimitiveMember", rhsTopoPrimitiveMember), lhsTopoPrimitiveMember, rhsTopoPrimitiveMember)) {
                return false;
            }
        }
        {
            TopoPrimitiveArrayAssociationType lhsTopoPrimitiveMembers;
            lhsTopoPrimitiveMembers = this.getTopoPrimitiveMembers();
            TopoPrimitiveArrayAssociationType rhsTopoPrimitiveMembers;
            rhsTopoPrimitiveMembers = that.getTopoPrimitiveMembers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topoPrimitiveMembers", lhsTopoPrimitiveMembers), LocatorUtils.property(thatLocator, "topoPrimitiveMembers", rhsTopoPrimitiveMembers), lhsTopoPrimitiveMembers, rhsTopoPrimitiveMembers)) {
                return false;
            }
        }
        {
            boolean lhsIsMaximal;
            lhsIsMaximal = this.isIsMaximal();
            boolean rhsIsMaximal;
            rhsIsMaximal = that.isIsMaximal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isMaximal", lhsIsMaximal), LocatorUtils.property(thatLocator, "isMaximal", rhsIsMaximal), lhsIsMaximal, rhsIsMaximal)) {
                return false;
            }
        }
        {
            AggregationType lhsAggregationType;
            lhsAggregationType = this.getAggregationType();
            AggregationType rhsAggregationType;
            rhsAggregationType = that.getAggregationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregationType", lhsAggregationType), LocatorUtils.property(thatLocator, "aggregationType", rhsAggregationType), lhsAggregationType, rhsAggregationType)) {
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
            TopoComplexPropertyType theMaximalComplex;
            theMaximalComplex = this.getMaximalComplex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximalComplex", theMaximalComplex), currentHashCode, theMaximalComplex);
        }
        {
            List<TopoComplexPropertyType> theSuperComplex;
            theSuperComplex = this.getSuperComplex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "superComplex", theSuperComplex), currentHashCode, theSuperComplex);
        }
        {
            List<TopoComplexPropertyType> theSubComplex;
            theSubComplex = this.getSubComplex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subComplex", theSubComplex), currentHashCode, theSubComplex);
        }
        {
            List<TopoPrimitiveMemberType> theTopoPrimitiveMember;
            theTopoPrimitiveMember = this.getTopoPrimitiveMember();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topoPrimitiveMember", theTopoPrimitiveMember), currentHashCode, theTopoPrimitiveMember);
        }
        {
            TopoPrimitiveArrayAssociationType theTopoPrimitiveMembers;
            theTopoPrimitiveMembers = this.getTopoPrimitiveMembers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topoPrimitiveMembers", theTopoPrimitiveMembers), currentHashCode, theTopoPrimitiveMembers);
        }
        {
            boolean theIsMaximal;
            theIsMaximal = this.isIsMaximal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isMaximal", theIsMaximal), currentHashCode, theIsMaximal);
        }
        {
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregationType", theAggregationType), currentHashCode, theAggregationType);
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
        if (draftCopy instanceof TopoComplexType) {
            final TopoComplexType copy = ((TopoComplexType) draftCopy);
            if (this.isSetMaximalComplex()) {
                TopoComplexPropertyType sourceMaximalComplex;
                sourceMaximalComplex = this.getMaximalComplex();
                TopoComplexPropertyType copyMaximalComplex = ((TopoComplexPropertyType) strategy.copy(LocatorUtils.property(locator, "maximalComplex", sourceMaximalComplex), sourceMaximalComplex));
                copy.setMaximalComplex(copyMaximalComplex);
            } else {
                copy.maximalComplex = null;
            }
            if (this.isSetSuperComplex()) {
                List<TopoComplexPropertyType> sourceSuperComplex;
                sourceSuperComplex = this.getSuperComplex();
                @SuppressWarnings("unchecked")
                List<TopoComplexPropertyType> copySuperComplex = ((List<TopoComplexPropertyType> ) strategy.copy(LocatorUtils.property(locator, "superComplex", sourceSuperComplex), sourceSuperComplex));
                copy.unsetSuperComplex();
                List<TopoComplexPropertyType> uniqueSuperComplexl = copy.getSuperComplex();
                uniqueSuperComplexl.addAll(copySuperComplex);
            } else {
                copy.unsetSuperComplex();
            }
            if (this.isSetSubComplex()) {
                List<TopoComplexPropertyType> sourceSubComplex;
                sourceSubComplex = this.getSubComplex();
                @SuppressWarnings("unchecked")
                List<TopoComplexPropertyType> copySubComplex = ((List<TopoComplexPropertyType> ) strategy.copy(LocatorUtils.property(locator, "subComplex", sourceSubComplex), sourceSubComplex));
                copy.unsetSubComplex();
                List<TopoComplexPropertyType> uniqueSubComplexl = copy.getSubComplex();
                uniqueSubComplexl.addAll(copySubComplex);
            } else {
                copy.unsetSubComplex();
            }
            if (this.isSetTopoPrimitiveMember()) {
                List<TopoPrimitiveMemberType> sourceTopoPrimitiveMember;
                sourceTopoPrimitiveMember = this.getTopoPrimitiveMember();
                @SuppressWarnings("unchecked")
                List<TopoPrimitiveMemberType> copyTopoPrimitiveMember = ((List<TopoPrimitiveMemberType> ) strategy.copy(LocatorUtils.property(locator, "topoPrimitiveMember", sourceTopoPrimitiveMember), sourceTopoPrimitiveMember));
                copy.unsetTopoPrimitiveMember();
                List<TopoPrimitiveMemberType> uniqueTopoPrimitiveMemberl = copy.getTopoPrimitiveMember();
                uniqueTopoPrimitiveMemberl.addAll(copyTopoPrimitiveMember);
            } else {
                copy.unsetTopoPrimitiveMember();
            }
            if (this.isSetTopoPrimitiveMembers()) {
                TopoPrimitiveArrayAssociationType sourceTopoPrimitiveMembers;
                sourceTopoPrimitiveMembers = this.getTopoPrimitiveMembers();
                TopoPrimitiveArrayAssociationType copyTopoPrimitiveMembers = ((TopoPrimitiveArrayAssociationType) strategy.copy(LocatorUtils.property(locator, "topoPrimitiveMembers", sourceTopoPrimitiveMembers), sourceTopoPrimitiveMembers));
                copy.setTopoPrimitiveMembers(copyTopoPrimitiveMembers);
            } else {
                copy.topoPrimitiveMembers = null;
            }
            if (this.isSetIsMaximal()) {
                boolean sourceIsMaximal;
                sourceIsMaximal = this.isIsMaximal();
                boolean copyIsMaximal = strategy.copy(LocatorUtils.property(locator, "isMaximal", sourceIsMaximal), sourceIsMaximal);
                copy.setIsMaximal(copyIsMaximal);
            } else {
                copy.unsetIsMaximal();
            }
            if (this.isSetAggregationType()) {
                AggregationType sourceAggregationType;
                sourceAggregationType = this.getAggregationType();
                AggregationType copyAggregationType = ((AggregationType) strategy.copy(LocatorUtils.property(locator, "aggregationType", sourceAggregationType), sourceAggregationType));
                copy.setAggregationType(copyAggregationType);
            } else {
                copy.aggregationType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TopoComplexType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TopoComplexType) {
            final TopoComplexType target = this;
            final TopoComplexType leftObject = ((TopoComplexType) left);
            final TopoComplexType rightObject = ((TopoComplexType) right);
            {
                TopoComplexPropertyType lhsMaximalComplex;
                lhsMaximalComplex = leftObject.getMaximalComplex();
                TopoComplexPropertyType rhsMaximalComplex;
                rhsMaximalComplex = rightObject.getMaximalComplex();
                target.setMaximalComplex(((TopoComplexPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "maximalComplex", lhsMaximalComplex), LocatorUtils.property(rightLocator, "maximalComplex", rhsMaximalComplex), lhsMaximalComplex, rhsMaximalComplex)));
            }
            {
                List<TopoComplexPropertyType> lhsSuperComplex;
                lhsSuperComplex = leftObject.getSuperComplex();
                List<TopoComplexPropertyType> rhsSuperComplex;
                rhsSuperComplex = rightObject.getSuperComplex();
                target.unsetSuperComplex();
                List<TopoComplexPropertyType> uniqueSuperComplexl = target.getSuperComplex();
                uniqueSuperComplexl.addAll(((List<TopoComplexPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "superComplex", lhsSuperComplex), LocatorUtils.property(rightLocator, "superComplex", rhsSuperComplex), lhsSuperComplex, rhsSuperComplex)));
            }
            {
                List<TopoComplexPropertyType> lhsSubComplex;
                lhsSubComplex = leftObject.getSubComplex();
                List<TopoComplexPropertyType> rhsSubComplex;
                rhsSubComplex = rightObject.getSubComplex();
                target.unsetSubComplex();
                List<TopoComplexPropertyType> uniqueSubComplexl = target.getSubComplex();
                uniqueSubComplexl.addAll(((List<TopoComplexPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "subComplex", lhsSubComplex), LocatorUtils.property(rightLocator, "subComplex", rhsSubComplex), lhsSubComplex, rhsSubComplex)));
            }
            {
                List<TopoPrimitiveMemberType> lhsTopoPrimitiveMember;
                lhsTopoPrimitiveMember = leftObject.getTopoPrimitiveMember();
                List<TopoPrimitiveMemberType> rhsTopoPrimitiveMember;
                rhsTopoPrimitiveMember = rightObject.getTopoPrimitiveMember();
                target.unsetTopoPrimitiveMember();
                List<TopoPrimitiveMemberType> uniqueTopoPrimitiveMemberl = target.getTopoPrimitiveMember();
                uniqueTopoPrimitiveMemberl.addAll(((List<TopoPrimitiveMemberType> ) strategy.merge(LocatorUtils.property(leftLocator, "topoPrimitiveMember", lhsTopoPrimitiveMember), LocatorUtils.property(rightLocator, "topoPrimitiveMember", rhsTopoPrimitiveMember), lhsTopoPrimitiveMember, rhsTopoPrimitiveMember)));
            }
            {
                TopoPrimitiveArrayAssociationType lhsTopoPrimitiveMembers;
                lhsTopoPrimitiveMembers = leftObject.getTopoPrimitiveMembers();
                TopoPrimitiveArrayAssociationType rhsTopoPrimitiveMembers;
                rhsTopoPrimitiveMembers = rightObject.getTopoPrimitiveMembers();
                target.setTopoPrimitiveMembers(((TopoPrimitiveArrayAssociationType) strategy.merge(LocatorUtils.property(leftLocator, "topoPrimitiveMembers", lhsTopoPrimitiveMembers), LocatorUtils.property(rightLocator, "topoPrimitiveMembers", rhsTopoPrimitiveMembers), lhsTopoPrimitiveMembers, rhsTopoPrimitiveMembers)));
            }
            {
                boolean lhsIsMaximal;
                lhsIsMaximal = leftObject.isIsMaximal();
                boolean rhsIsMaximal;
                rhsIsMaximal = rightObject.isIsMaximal();
                target.setIsMaximal(((boolean) strategy.merge(LocatorUtils.property(leftLocator, "isMaximal", lhsIsMaximal), LocatorUtils.property(rightLocator, "isMaximal", rhsIsMaximal), lhsIsMaximal, rhsIsMaximal)));
            }
            {
                AggregationType lhsAggregationType;
                lhsAggregationType = leftObject.getAggregationType();
                AggregationType rhsAggregationType;
                rhsAggregationType = rightObject.getAggregationType();
                target.setAggregationType(((AggregationType) strategy.merge(LocatorUtils.property(leftLocator, "aggregationType", lhsAggregationType), LocatorUtils.property(rightLocator, "aggregationType", rhsAggregationType), lhsAggregationType, rhsAggregationType)));
            }
        }
    }

    public void setSuperComplex(List<TopoComplexPropertyType> value) {
        List<TopoComplexPropertyType> draftl = this.getSuperComplex();
        draftl.addAll(value);
    }

    public void setSubComplex(List<TopoComplexPropertyType> value) {
        List<TopoComplexPropertyType> draftl = this.getSubComplex();
        draftl.addAll(value);
    }

    public void setTopoPrimitiveMember(List<TopoPrimitiveMemberType> value) {
        List<TopoPrimitiveMemberType> draftl = this.getTopoPrimitiveMember();
        draftl.addAll(value);
    }

}
