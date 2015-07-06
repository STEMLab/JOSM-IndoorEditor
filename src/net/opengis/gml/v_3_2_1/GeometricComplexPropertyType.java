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
 * A property that has a geometric complex as its value domain may either be an appropriate geometry element encapsulated in an element of this type or an XLink reference to a remote geometry element (where remote includes geometry elements located elsewhere in the same document). Either the reference or the contained element shall be given, but neither both nor none.
 * 
 * <p>Java-Klasse für GeometricComplexPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeometricComplexPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}GeometricComplex"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}CompositeCurve"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}CompositeSurface"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}CompositeSolid"/>
 *         &lt;/choice>
 *       &lt;/sequence>
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
@XmlType(name = "GeometricComplexPropertyType", propOrder = {
    "geometricComplex",
    "compositeCurve",
    "compositeSurface",
    "compositeSolid"
})
public class GeometricComplexPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "GeometricComplex")
    protected GeometricComplexType geometricComplex;
    @XmlElement(name = "CompositeCurve")
    protected CompositeCurveType compositeCurve;
    @XmlElement(name = "CompositeSurface")
    protected CompositeSurfaceType compositeSurface;
    @XmlElement(name = "CompositeSolid")
    protected CompositeSolidType compositeSolid;
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
     * Ruft den Wert der geometricComplex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeometricComplexType }
     *     
     */
    public GeometricComplexType getGeometricComplex() {
        return geometricComplex;
    }

    /**
     * Legt den Wert der geometricComplex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometricComplexType }
     *     
     */
    public void setGeometricComplex(GeometricComplexType value) {
        this.geometricComplex = value;
    }

    public boolean isSetGeometricComplex() {
        return (this.geometricComplex!= null);
    }

    /**
     * Ruft den Wert der compositeCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompositeCurveType }
     *     
     */
    public CompositeCurveType getCompositeCurve() {
        return compositeCurve;
    }

    /**
     * Legt den Wert der compositeCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeCurveType }
     *     
     */
    public void setCompositeCurve(CompositeCurveType value) {
        this.compositeCurve = value;
    }

    public boolean isSetCompositeCurve() {
        return (this.compositeCurve!= null);
    }

    /**
     * Ruft den Wert der compositeSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompositeSurfaceType }
     *     
     */
    public CompositeSurfaceType getCompositeSurface() {
        return compositeSurface;
    }

    /**
     * Legt den Wert der compositeSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeSurfaceType }
     *     
     */
    public void setCompositeSurface(CompositeSurfaceType value) {
        this.compositeSurface = value;
    }

    public boolean isSetCompositeSurface() {
        return (this.compositeSurface!= null);
    }

    /**
     * Ruft den Wert der compositeSolid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompositeSolidType }
     *     
     */
    public CompositeSolidType getCompositeSolid() {
        return compositeSolid;
    }

    /**
     * Legt den Wert der compositeSolid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeSolidType }
     *     
     */
    public void setCompositeSolid(CompositeSolidType value) {
        this.compositeSolid = value;
    }

    public boolean isSetCompositeSolid() {
        return (this.compositeSolid!= null);
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
            GeometricComplexType theGeometricComplex;
            theGeometricComplex = this.getGeometricComplex();
            strategy.appendField(locator, this, "geometricComplex", buffer, theGeometricComplex);
        }
        {
            CompositeCurveType theCompositeCurve;
            theCompositeCurve = this.getCompositeCurve();
            strategy.appendField(locator, this, "compositeCurve", buffer, theCompositeCurve);
        }
        {
            CompositeSurfaceType theCompositeSurface;
            theCompositeSurface = this.getCompositeSurface();
            strategy.appendField(locator, this, "compositeSurface", buffer, theCompositeSurface);
        }
        {
            CompositeSolidType theCompositeSolid;
            theCompositeSolid = this.getCompositeSolid();
            strategy.appendField(locator, this, "compositeSolid", buffer, theCompositeSolid);
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
            theTYPE = GeometricComplexPropertyType.TYPE;
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
        if (!(object instanceof GeometricComplexPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeometricComplexPropertyType that = ((GeometricComplexPropertyType) object);
        {
            GeometricComplexType lhsGeometricComplex;
            lhsGeometricComplex = this.getGeometricComplex();
            GeometricComplexType rhsGeometricComplex;
            rhsGeometricComplex = that.getGeometricComplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometricComplex", lhsGeometricComplex), LocatorUtils.property(thatLocator, "geometricComplex", rhsGeometricComplex), lhsGeometricComplex, rhsGeometricComplex)) {
                return false;
            }
        }
        {
            CompositeCurveType lhsCompositeCurve;
            lhsCompositeCurve = this.getCompositeCurve();
            CompositeCurveType rhsCompositeCurve;
            rhsCompositeCurve = that.getCompositeCurve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compositeCurve", lhsCompositeCurve), LocatorUtils.property(thatLocator, "compositeCurve", rhsCompositeCurve), lhsCompositeCurve, rhsCompositeCurve)) {
                return false;
            }
        }
        {
            CompositeSurfaceType lhsCompositeSurface;
            lhsCompositeSurface = this.getCompositeSurface();
            CompositeSurfaceType rhsCompositeSurface;
            rhsCompositeSurface = that.getCompositeSurface();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compositeSurface", lhsCompositeSurface), LocatorUtils.property(thatLocator, "compositeSurface", rhsCompositeSurface), lhsCompositeSurface, rhsCompositeSurface)) {
                return false;
            }
        }
        {
            CompositeSolidType lhsCompositeSolid;
            lhsCompositeSolid = this.getCompositeSolid();
            CompositeSolidType rhsCompositeSolid;
            rhsCompositeSolid = that.getCompositeSolid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compositeSolid", lhsCompositeSolid), LocatorUtils.property(thatLocator, "compositeSolid", rhsCompositeSolid), lhsCompositeSolid, rhsCompositeSolid)) {
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
            GeometricComplexType theGeometricComplex;
            theGeometricComplex = this.getGeometricComplex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometricComplex", theGeometricComplex), currentHashCode, theGeometricComplex);
        }
        {
            CompositeCurveType theCompositeCurve;
            theCompositeCurve = this.getCompositeCurve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compositeCurve", theCompositeCurve), currentHashCode, theCompositeCurve);
        }
        {
            CompositeSurfaceType theCompositeSurface;
            theCompositeSurface = this.getCompositeSurface();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compositeSurface", theCompositeSurface), currentHashCode, theCompositeSurface);
        }
        {
            CompositeSolidType theCompositeSolid;
            theCompositeSolid = this.getCompositeSolid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compositeSolid", theCompositeSolid), currentHashCode, theCompositeSolid);
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
        if (draftCopy instanceof GeometricComplexPropertyType) {
            final GeometricComplexPropertyType copy = ((GeometricComplexPropertyType) draftCopy);
            if (this.isSetGeometricComplex()) {
                GeometricComplexType sourceGeometricComplex;
                sourceGeometricComplex = this.getGeometricComplex();
                GeometricComplexType copyGeometricComplex = ((GeometricComplexType) strategy.copy(LocatorUtils.property(locator, "geometricComplex", sourceGeometricComplex), sourceGeometricComplex));
                copy.setGeometricComplex(copyGeometricComplex);
            } else {
                copy.geometricComplex = null;
            }
            if (this.isSetCompositeCurve()) {
                CompositeCurveType sourceCompositeCurve;
                sourceCompositeCurve = this.getCompositeCurve();
                CompositeCurveType copyCompositeCurve = ((CompositeCurveType) strategy.copy(LocatorUtils.property(locator, "compositeCurve", sourceCompositeCurve), sourceCompositeCurve));
                copy.setCompositeCurve(copyCompositeCurve);
            } else {
                copy.compositeCurve = null;
            }
            if (this.isSetCompositeSurface()) {
                CompositeSurfaceType sourceCompositeSurface;
                sourceCompositeSurface = this.getCompositeSurface();
                CompositeSurfaceType copyCompositeSurface = ((CompositeSurfaceType) strategy.copy(LocatorUtils.property(locator, "compositeSurface", sourceCompositeSurface), sourceCompositeSurface));
                copy.setCompositeSurface(copyCompositeSurface);
            } else {
                copy.compositeSurface = null;
            }
            if (this.isSetCompositeSolid()) {
                CompositeSolidType sourceCompositeSolid;
                sourceCompositeSolid = this.getCompositeSolid();
                CompositeSolidType copyCompositeSolid = ((CompositeSolidType) strategy.copy(LocatorUtils.property(locator, "compositeSolid", sourceCompositeSolid), sourceCompositeSolid));
                copy.setCompositeSolid(copyCompositeSolid);
            } else {
                copy.compositeSolid = null;
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
        return new GeometricComplexPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof GeometricComplexPropertyType) {
            final GeometricComplexPropertyType target = this;
            final GeometricComplexPropertyType leftObject = ((GeometricComplexPropertyType) left);
            final GeometricComplexPropertyType rightObject = ((GeometricComplexPropertyType) right);
            {
                GeometricComplexType lhsGeometricComplex;
                lhsGeometricComplex = leftObject.getGeometricComplex();
                GeometricComplexType rhsGeometricComplex;
                rhsGeometricComplex = rightObject.getGeometricComplex();
                target.setGeometricComplex(((GeometricComplexType) strategy.merge(LocatorUtils.property(leftLocator, "geometricComplex", lhsGeometricComplex), LocatorUtils.property(rightLocator, "geometricComplex", rhsGeometricComplex), lhsGeometricComplex, rhsGeometricComplex)));
            }
            {
                CompositeCurveType lhsCompositeCurve;
                lhsCompositeCurve = leftObject.getCompositeCurve();
                CompositeCurveType rhsCompositeCurve;
                rhsCompositeCurve = rightObject.getCompositeCurve();
                target.setCompositeCurve(((CompositeCurveType) strategy.merge(LocatorUtils.property(leftLocator, "compositeCurve", lhsCompositeCurve), LocatorUtils.property(rightLocator, "compositeCurve", rhsCompositeCurve), lhsCompositeCurve, rhsCompositeCurve)));
            }
            {
                CompositeSurfaceType lhsCompositeSurface;
                lhsCompositeSurface = leftObject.getCompositeSurface();
                CompositeSurfaceType rhsCompositeSurface;
                rhsCompositeSurface = rightObject.getCompositeSurface();
                target.setCompositeSurface(((CompositeSurfaceType) strategy.merge(LocatorUtils.property(leftLocator, "compositeSurface", lhsCompositeSurface), LocatorUtils.property(rightLocator, "compositeSurface", rhsCompositeSurface), lhsCompositeSurface, rhsCompositeSurface)));
            }
            {
                CompositeSolidType lhsCompositeSolid;
                lhsCompositeSolid = leftObject.getCompositeSolid();
                CompositeSolidType rhsCompositeSolid;
                rhsCompositeSolid = rightObject.getCompositeSolid();
                target.setCompositeSolid(((CompositeSolidType) strategy.merge(LocatorUtils.property(leftLocator, "compositeSolid", lhsCompositeSolid), LocatorUtils.property(rightLocator, "compositeSolid", rhsCompositeSolid), lhsCompositeSolid, rhsCompositeSolid)));
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
