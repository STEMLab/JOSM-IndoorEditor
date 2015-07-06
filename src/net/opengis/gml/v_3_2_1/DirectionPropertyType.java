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
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java-Klasse für DirectionPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DirectionPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="DirectionVector" type="{http://www.opengis.net/gml/3.2}DirectionVectorType"/>
 *         &lt;element name="DirectionDescription" type="{http://www.opengis.net/gml/3.2}DirectionDescriptionType"/>
 *         &lt;element name="CompassPoint" type="{http://www.opengis.net/gml/3.2}CompassPointEnumeration"/>
 *         &lt;element name="DirectionKeyword" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="DirectionString" type="{http://www.opengis.net/gml/3.2}StringOrRefType"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionPropertyType", propOrder = {
    "directionVector",
    "directionDescription",
    "compassPoint",
    "directionKeyword",
    "directionString"
})
public class DirectionPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "DirectionVector")
    protected DirectionVectorType directionVector;
    @XmlElement(name = "DirectionDescription")
    protected DirectionDescriptionType directionDescription;
    @XmlElement(name = "CompassPoint")
    protected CompassPointEnumeration compassPoint;
    @XmlElement(name = "DirectionKeyword")
    protected CodeType directionKeyword;
    @XmlElement(name = "DirectionString")
    protected StringOrRefType directionString;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    public final static String TYPE = "simple";
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected String actuate;

    /**
     * Ruft den Wert der directionVector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionVectorType }
     *     
     */
    public DirectionVectorType getDirectionVector() {
        return directionVector;
    }

    /**
     * Legt den Wert der directionVector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionVectorType }
     *     
     */
    public void setDirectionVector(DirectionVectorType value) {
        this.directionVector = value;
    }

    public boolean isSetDirectionVector() {
        return (this.directionVector!= null);
    }

    /**
     * Ruft den Wert der directionDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionDescriptionType }
     *     
     */
    public DirectionDescriptionType getDirectionDescription() {
        return directionDescription;
    }

    /**
     * Legt den Wert der directionDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionDescriptionType }
     *     
     */
    public void setDirectionDescription(DirectionDescriptionType value) {
        this.directionDescription = value;
    }

    public boolean isSetDirectionDescription() {
        return (this.directionDescription!= null);
    }

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
     * Ruft den Wert der directionKeyword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDirectionKeyword() {
        return directionKeyword;
    }

    /**
     * Legt den Wert der directionKeyword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDirectionKeyword(CodeType value) {
        this.directionKeyword = value;
    }

    public boolean isSetDirectionKeyword() {
        return (this.directionKeyword!= null);
    }

    /**
     * Ruft den Wert der directionString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDirectionString() {
        return directionString;
    }

    /**
     * Legt den Wert der directionString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDirectionString(StringOrRefType value) {
        this.directionString = value;
    }

    public boolean isSetDirectionString() {
        return (this.directionString!= null);
    }

    /**
     * Ruft den Wert der owns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Legt den Wert der owns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    public boolean isSetNilReason() {
        return ((this.nilReason!= null)&&(!this.nilReason.isEmpty()));
    }

    public void unsetNilReason() {
        this.nilReason = null;
    }

    /**
     * Ruft den Wert der remoteSchema-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Legt den Wert der remoteSchema-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * Ruft den Wert der href-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Ruft den Wert der arcrole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Legt den Wert der arcrole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Ruft den Wert der show-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Legt den Wert der show-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Ruft den Wert der actuate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Legt den Wert der actuate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
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
            DirectionVectorType theDirectionVector;
            theDirectionVector = this.getDirectionVector();
            strategy.appendField(locator, this, "directionVector", buffer, theDirectionVector);
        }
        {
            DirectionDescriptionType theDirectionDescription;
            theDirectionDescription = this.getDirectionDescription();
            strategy.appendField(locator, this, "directionDescription", buffer, theDirectionDescription);
        }
        {
            CompassPointEnumeration theCompassPoint;
            theCompassPoint = this.getCompassPoint();
            strategy.appendField(locator, this, "compassPoint", buffer, theCompassPoint);
        }
        {
            CodeType theDirectionKeyword;
            theDirectionKeyword = this.getDirectionKeyword();
            strategy.appendField(locator, this, "directionKeyword", buffer, theDirectionKeyword);
        }
        {
            StringOrRefType theDirectionString;
            theDirectionString = this.getDirectionString();
            strategy.appendField(locator, this, "directionString", buffer, theDirectionString);
        }
        {
            boolean theOwns;
            theOwns = this.isOwns();
            strategy.appendField(locator, this, "owns", buffer, theOwns);
        }
        {
            List<String> theNilReason;
            theNilReason = this.getNilReason();
            strategy.appendField(locator, this, "nilReason", buffer, theNilReason);
        }
        {
            String theRemoteSchema;
            theRemoteSchema = this.getRemoteSchema();
            strategy.appendField(locator, this, "remoteSchema", buffer, theRemoteSchema);
        }
        {
            String theTYPE;
            theTYPE = DirectionPropertyType.TYPE;
            strategy.appendField(locator, this, "type", buffer, theTYPE);
        }
        {
            String theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref);
        }
        {
            String theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole);
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            strategy.appendField(locator, this, "arcrole", buffer, theArcrole);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            String theShow;
            theShow = this.getShow();
            strategy.appendField(locator, this, "show", buffer, theShow);
        }
        {
            String theActuate;
            theActuate = this.getActuate();
            strategy.appendField(locator, this, "actuate", buffer, theActuate);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DirectionPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DirectionPropertyType that = ((DirectionPropertyType) object);
        {
            DirectionVectorType lhsDirectionVector;
            lhsDirectionVector = this.getDirectionVector();
            DirectionVectorType rhsDirectionVector;
            rhsDirectionVector = that.getDirectionVector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directionVector", lhsDirectionVector), LocatorUtils.property(thatLocator, "directionVector", rhsDirectionVector), lhsDirectionVector, rhsDirectionVector)) {
                return false;
            }
        }
        {
            DirectionDescriptionType lhsDirectionDescription;
            lhsDirectionDescription = this.getDirectionDescription();
            DirectionDescriptionType rhsDirectionDescription;
            rhsDirectionDescription = that.getDirectionDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directionDescription", lhsDirectionDescription), LocatorUtils.property(thatLocator, "directionDescription", rhsDirectionDescription), lhsDirectionDescription, rhsDirectionDescription)) {
                return false;
            }
        }
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
            CodeType lhsDirectionKeyword;
            lhsDirectionKeyword = this.getDirectionKeyword();
            CodeType rhsDirectionKeyword;
            rhsDirectionKeyword = that.getDirectionKeyword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directionKeyword", lhsDirectionKeyword), LocatorUtils.property(thatLocator, "directionKeyword", rhsDirectionKeyword), lhsDirectionKeyword, rhsDirectionKeyword)) {
                return false;
            }
        }
        {
            StringOrRefType lhsDirectionString;
            lhsDirectionString = this.getDirectionString();
            StringOrRefType rhsDirectionString;
            rhsDirectionString = that.getDirectionString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directionString", lhsDirectionString), LocatorUtils.property(thatLocator, "directionString", rhsDirectionString), lhsDirectionString, rhsDirectionString)) {
                return false;
            }
        }
        {
            boolean lhsOwns;
            lhsOwns = this.isOwns();
            boolean rhsOwns;
            rhsOwns = that.isOwns();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owns", lhsOwns), LocatorUtils.property(thatLocator, "owns", rhsOwns), lhsOwns, rhsOwns)) {
                return false;
            }
        }
        {
            List<String> lhsNilReason;
            lhsNilReason = this.getNilReason();
            List<String> rhsNilReason;
            rhsNilReason = that.getNilReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nilReason", lhsNilReason), LocatorUtils.property(thatLocator, "nilReason", rhsNilReason), lhsNilReason, rhsNilReason)) {
                return false;
            }
        }
        {
            String lhsRemoteSchema;
            lhsRemoteSchema = this.getRemoteSchema();
            String rhsRemoteSchema;
            rhsRemoteSchema = that.getRemoteSchema();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remoteSchema", lhsRemoteSchema), LocatorUtils.property(thatLocator, "remoteSchema", rhsRemoteSchema), lhsRemoteSchema, rhsRemoteSchema)) {
                return false;
            }
        }
        {
            String lhsHref;
            lhsHref = this.getHref();
            String rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref)) {
                return false;
            }
        }
        {
            String lhsRole;
            lhsRole = this.getRole();
            String rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
                return false;
            }
        }
        {
            String lhsArcrole;
            lhsArcrole = this.getArcrole();
            String rhsArcrole;
            rhsArcrole = that.getArcrole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arcrole", lhsArcrole), LocatorUtils.property(thatLocator, "arcrole", rhsArcrole), lhsArcrole, rhsArcrole)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            String lhsShow;
            lhsShow = this.getShow();
            String rhsShow;
            rhsShow = that.getShow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "show", lhsShow), LocatorUtils.property(thatLocator, "show", rhsShow), lhsShow, rhsShow)) {
                return false;
            }
        }
        {
            String lhsActuate;
            lhsActuate = this.getActuate();
            String rhsActuate;
            rhsActuate = that.getActuate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actuate", lhsActuate), LocatorUtils.property(thatLocator, "actuate", rhsActuate), lhsActuate, rhsActuate)) {
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
            DirectionVectorType theDirectionVector;
            theDirectionVector = this.getDirectionVector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directionVector", theDirectionVector), currentHashCode, theDirectionVector);
        }
        {
            DirectionDescriptionType theDirectionDescription;
            theDirectionDescription = this.getDirectionDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directionDescription", theDirectionDescription), currentHashCode, theDirectionDescription);
        }
        {
            CompassPointEnumeration theCompassPoint;
            theCompassPoint = this.getCompassPoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compassPoint", theCompassPoint), currentHashCode, theCompassPoint);
        }
        {
            CodeType theDirectionKeyword;
            theDirectionKeyword = this.getDirectionKeyword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directionKeyword", theDirectionKeyword), currentHashCode, theDirectionKeyword);
        }
        {
            StringOrRefType theDirectionString;
            theDirectionString = this.getDirectionString();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directionString", theDirectionString), currentHashCode, theDirectionString);
        }
        {
            boolean theOwns;
            theOwns = this.isOwns();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owns", theOwns), currentHashCode, theOwns);
        }
        {
            List<String> theNilReason;
            theNilReason = this.getNilReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nilReason", theNilReason), currentHashCode, theNilReason);
        }
        {
            String theRemoteSchema;
            theRemoteSchema = this.getRemoteSchema();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remoteSchema", theRemoteSchema), currentHashCode, theRemoteSchema);
        }
        {
            String theHref;
            theHref = this.getHref();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "href", theHref), currentHashCode, theHref);
        }
        {
            String theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole);
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arcrole", theArcrole), currentHashCode, theArcrole);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle);
        }
        {
            String theShow;
            theShow = this.getShow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "show", theShow), currentHashCode, theShow);
        }
        {
            String theActuate;
            theActuate = this.getActuate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actuate", theActuate), currentHashCode, theActuate);
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
        if (draftCopy instanceof DirectionPropertyType) {
            final DirectionPropertyType copy = ((DirectionPropertyType) draftCopy);
            if (this.isSetDirectionVector()) {
                DirectionVectorType sourceDirectionVector;
                sourceDirectionVector = this.getDirectionVector();
                DirectionVectorType copyDirectionVector = ((DirectionVectorType) strategy.copy(LocatorUtils.property(locator, "directionVector", sourceDirectionVector), sourceDirectionVector));
                copy.setDirectionVector(copyDirectionVector);
            } else {
                copy.directionVector = null;
            }
            if (this.isSetDirectionDescription()) {
                DirectionDescriptionType sourceDirectionDescription;
                sourceDirectionDescription = this.getDirectionDescription();
                DirectionDescriptionType copyDirectionDescription = ((DirectionDescriptionType) strategy.copy(LocatorUtils.property(locator, "directionDescription", sourceDirectionDescription), sourceDirectionDescription));
                copy.setDirectionDescription(copyDirectionDescription);
            } else {
                copy.directionDescription = null;
            }
            if (this.isSetCompassPoint()) {
                CompassPointEnumeration sourceCompassPoint;
                sourceCompassPoint = this.getCompassPoint();
                CompassPointEnumeration copyCompassPoint = ((CompassPointEnumeration) strategy.copy(LocatorUtils.property(locator, "compassPoint", sourceCompassPoint), sourceCompassPoint));
                copy.setCompassPoint(copyCompassPoint);
            } else {
                copy.compassPoint = null;
            }
            if (this.isSetDirectionKeyword()) {
                CodeType sourceDirectionKeyword;
                sourceDirectionKeyword = this.getDirectionKeyword();
                CodeType copyDirectionKeyword = ((CodeType) strategy.copy(LocatorUtils.property(locator, "directionKeyword", sourceDirectionKeyword), sourceDirectionKeyword));
                copy.setDirectionKeyword(copyDirectionKeyword);
            } else {
                copy.directionKeyword = null;
            }
            if (this.isSetDirectionString()) {
                StringOrRefType sourceDirectionString;
                sourceDirectionString = this.getDirectionString();
                StringOrRefType copyDirectionString = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "directionString", sourceDirectionString), sourceDirectionString));
                copy.setDirectionString(copyDirectionString);
            } else {
                copy.directionString = null;
            }
            if (this.isSetOwns()) {
                boolean sourceOwns;
                sourceOwns = this.isOwns();
                boolean copyOwns = strategy.copy(LocatorUtils.property(locator, "owns", sourceOwns), sourceOwns);
                copy.setOwns(copyOwns);
            } else {
                copy.unsetOwns();
            }
            if (this.isSetNilReason()) {
                List<String> sourceNilReason;
                sourceNilReason = this.getNilReason();
                @SuppressWarnings("unchecked")
                List<String> copyNilReason = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "nilReason", sourceNilReason), sourceNilReason));
                copy.unsetNilReason();
                List<String> uniqueNilReasonl = copy.getNilReason();
                uniqueNilReasonl.addAll(copyNilReason);
            } else {
                copy.unsetNilReason();
            }
            if (this.isSetRemoteSchema()) {
                String sourceRemoteSchema;
                sourceRemoteSchema = this.getRemoteSchema();
                String copyRemoteSchema = ((String) strategy.copy(LocatorUtils.property(locator, "remoteSchema", sourceRemoteSchema), sourceRemoteSchema));
                copy.setRemoteSchema(copyRemoteSchema);
            } else {
                copy.remoteSchema = null;
            }
            if (this.isSetHref()) {
                String sourceHref;
                sourceHref = this.getHref();
                String copyHref = ((String) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref));
                copy.setHref(copyHref);
            } else {
                copy.href = null;
            }
            if (this.isSetRole()) {
                String sourceRole;
                sourceRole = this.getRole();
                String copyRole = ((String) strategy.copy(LocatorUtils.property(locator, "role", sourceRole), sourceRole));
                copy.setRole(copyRole);
            } else {
                copy.role = null;
            }
            if (this.isSetArcrole()) {
                String sourceArcrole;
                sourceArcrole = this.getArcrole();
                String copyArcrole = ((String) strategy.copy(LocatorUtils.property(locator, "arcrole", sourceArcrole), sourceArcrole));
                copy.setArcrole(copyArcrole);
            } else {
                copy.arcrole = null;
            }
            if (this.isSetTitle()) {
                String sourceTitle;
                sourceTitle = this.getTitle();
                String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                copy.setTitle(copyTitle);
            } else {
                copy.title = null;
            }
            if (this.isSetShow()) {
                String sourceShow;
                sourceShow = this.getShow();
                String copyShow = ((String) strategy.copy(LocatorUtils.property(locator, "show", sourceShow), sourceShow));
                copy.setShow(copyShow);
            } else {
                copy.show = null;
            }
            if (this.isSetActuate()) {
                String sourceActuate;
                sourceActuate = this.getActuate();
                String copyActuate = ((String) strategy.copy(LocatorUtils.property(locator, "actuate", sourceActuate), sourceActuate));
                copy.setActuate(copyActuate);
            } else {
                copy.actuate = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DirectionPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof DirectionPropertyType) {
            final DirectionPropertyType target = this;
            final DirectionPropertyType leftObject = ((DirectionPropertyType) left);
            final DirectionPropertyType rightObject = ((DirectionPropertyType) right);
            {
                DirectionVectorType lhsDirectionVector;
                lhsDirectionVector = leftObject.getDirectionVector();
                DirectionVectorType rhsDirectionVector;
                rhsDirectionVector = rightObject.getDirectionVector();
                target.setDirectionVector(((DirectionVectorType) strategy.merge(LocatorUtils.property(leftLocator, "directionVector", lhsDirectionVector), LocatorUtils.property(rightLocator, "directionVector", rhsDirectionVector), lhsDirectionVector, rhsDirectionVector)));
            }
            {
                DirectionDescriptionType lhsDirectionDescription;
                lhsDirectionDescription = leftObject.getDirectionDescription();
                DirectionDescriptionType rhsDirectionDescription;
                rhsDirectionDescription = rightObject.getDirectionDescription();
                target.setDirectionDescription(((DirectionDescriptionType) strategy.merge(LocatorUtils.property(leftLocator, "directionDescription", lhsDirectionDescription), LocatorUtils.property(rightLocator, "directionDescription", rhsDirectionDescription), lhsDirectionDescription, rhsDirectionDescription)));
            }
            {
                CompassPointEnumeration lhsCompassPoint;
                lhsCompassPoint = leftObject.getCompassPoint();
                CompassPointEnumeration rhsCompassPoint;
                rhsCompassPoint = rightObject.getCompassPoint();
                target.setCompassPoint(((CompassPointEnumeration) strategy.merge(LocatorUtils.property(leftLocator, "compassPoint", lhsCompassPoint), LocatorUtils.property(rightLocator, "compassPoint", rhsCompassPoint), lhsCompassPoint, rhsCompassPoint)));
            }
            {
                CodeType lhsDirectionKeyword;
                lhsDirectionKeyword = leftObject.getDirectionKeyword();
                CodeType rhsDirectionKeyword;
                rhsDirectionKeyword = rightObject.getDirectionKeyword();
                target.setDirectionKeyword(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "directionKeyword", lhsDirectionKeyword), LocatorUtils.property(rightLocator, "directionKeyword", rhsDirectionKeyword), lhsDirectionKeyword, rhsDirectionKeyword)));
            }
            {
                StringOrRefType lhsDirectionString;
                lhsDirectionString = leftObject.getDirectionString();
                StringOrRefType rhsDirectionString;
                rhsDirectionString = rightObject.getDirectionString();
                target.setDirectionString(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "directionString", lhsDirectionString), LocatorUtils.property(rightLocator, "directionString", rhsDirectionString), lhsDirectionString, rhsDirectionString)));
            }
            {
                boolean lhsOwns;
                lhsOwns = leftObject.isOwns();
                boolean rhsOwns;
                rhsOwns = rightObject.isOwns();
                target.setOwns(((boolean) strategy.merge(LocatorUtils.property(leftLocator, "owns", lhsOwns), LocatorUtils.property(rightLocator, "owns", rhsOwns), lhsOwns, rhsOwns)));
            }
            {
                List<String> lhsNilReason;
                lhsNilReason = leftObject.getNilReason();
                List<String> rhsNilReason;
                rhsNilReason = rightObject.getNilReason();
                target.unsetNilReason();
                List<String> uniqueNilReasonl = target.getNilReason();
                uniqueNilReasonl.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "nilReason", lhsNilReason), LocatorUtils.property(rightLocator, "nilReason", rhsNilReason), lhsNilReason, rhsNilReason)));
            }
            {
                String lhsRemoteSchema;
                lhsRemoteSchema = leftObject.getRemoteSchema();
                String rhsRemoteSchema;
                rhsRemoteSchema = rightObject.getRemoteSchema();
                target.setRemoteSchema(((String) strategy.merge(LocatorUtils.property(leftLocator, "remoteSchema", lhsRemoteSchema), LocatorUtils.property(rightLocator, "remoteSchema", rhsRemoteSchema), lhsRemoteSchema, rhsRemoteSchema)));
            }
            {
                String lhsHref;
                lhsHref = leftObject.getHref();
                String rhsHref;
                rhsHref = rightObject.getHref();
                target.setHref(((String) strategy.merge(LocatorUtils.property(leftLocator, "href", lhsHref), LocatorUtils.property(rightLocator, "href", rhsHref), lhsHref, rhsHref)));
            }
            {
                String lhsRole;
                lhsRole = leftObject.getRole();
                String rhsRole;
                rhsRole = rightObject.getRole();
                target.setRole(((String) strategy.merge(LocatorUtils.property(leftLocator, "role", lhsRole), LocatorUtils.property(rightLocator, "role", rhsRole), lhsRole, rhsRole)));
            }
            {
                String lhsArcrole;
                lhsArcrole = leftObject.getArcrole();
                String rhsArcrole;
                rhsArcrole = rightObject.getArcrole();
                target.setArcrole(((String) strategy.merge(LocatorUtils.property(leftLocator, "arcrole", lhsArcrole), LocatorUtils.property(rightLocator, "arcrole", rhsArcrole), lhsArcrole, rhsArcrole)));
            }
            {
                String lhsTitle;
                lhsTitle = leftObject.getTitle();
                String rhsTitle;
                rhsTitle = rightObject.getTitle();
                target.setTitle(((String) strategy.merge(LocatorUtils.property(leftLocator, "title", lhsTitle), LocatorUtils.property(rightLocator, "title", rhsTitle), lhsTitle, rhsTitle)));
            }
            {
                String lhsShow;
                lhsShow = leftObject.getShow();
                String rhsShow;
                rhsShow = rightObject.getShow();
                target.setShow(((String) strategy.merge(LocatorUtils.property(leftLocator, "show", lhsShow), LocatorUtils.property(rightLocator, "show", rhsShow), lhsShow, rhsShow)));
            }
            {
                String lhsActuate;
                lhsActuate = leftObject.getActuate();
                String rhsActuate;
                rhsActuate = rightObject.getActuate();
                target.setActuate(((String) strategy.merge(LocatorUtils.property(leftLocator, "actuate", lhsActuate), LocatorUtils.property(rightLocator, "actuate", rhsActuate), lhsActuate, rhsActuate)));
            }
        }
    }

    public void setNilReason(List<String> value) {
        List<String> draftl = this.getNilReason();
        draftl.addAll(value);
    }

}
