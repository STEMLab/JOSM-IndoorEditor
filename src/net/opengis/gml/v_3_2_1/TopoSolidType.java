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
 * <p>Java-Klasse für TopoSolidType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopoSolidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitiveType">
 *       &lt;sequence>
 *         &lt;element name="isolated" type="{http://www.opengis.net/gml/3.2}NodeOrEdgePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}directedFace" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}solidProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *       &lt;attribute name="universal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoSolidType", propOrder = {
    "isolated",
    "directedFace",
    "solidProperty"
})
public class TopoSolidType
    extends AbstractTopoPrimitiveType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<NodeOrEdgePropertyType> isolated;
    @XmlElement(required = true)
    protected List<DirectedFacePropertyType> directedFace;
    protected SolidPropertyType solidProperty;
    @XmlAttribute(name = "universal")
    protected java.lang.Boolean universal;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the isolated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isolated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsolated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeOrEdgePropertyType }
     * 
     * 
     */
    public List<NodeOrEdgePropertyType> getIsolated() {
        if (isolated == null) {
            isolated = new ArrayList<NodeOrEdgePropertyType>();
        }
        return this.isolated;
    }

    public boolean isSetIsolated() {
        return ((this.isolated!= null)&&(!this.isolated.isEmpty()));
    }

    public void unsetIsolated() {
        this.isolated = null;
    }

    /**
     * Gets the value of the directedFace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedFace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedFace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedFacePropertyType }
     * 
     * 
     */
    public List<DirectedFacePropertyType> getDirectedFace() {
        if (directedFace == null) {
            directedFace = new ArrayList<DirectedFacePropertyType>();
        }
        return this.directedFace;
    }

    public boolean isSetDirectedFace() {
        return ((this.directedFace!= null)&&(!this.directedFace.isEmpty()));
    }

    public void unsetDirectedFace() {
        this.directedFace = null;
    }

    /**
     * Ruft den Wert der solidProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SolidPropertyType }
     *     
     */
    public SolidPropertyType getSolidProperty() {
        return solidProperty;
    }

    /**
     * Legt den Wert der solidProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidPropertyType }
     *     
     */
    public void setSolidProperty(SolidPropertyType value) {
        this.solidProperty = value;
    }

    public boolean isSetSolidProperty() {
        return (this.solidProperty!= null);
    }

    /**
     * Ruft den Wert der universal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isUniversal() {
        if (universal == null) {
            return false;
        } else {
            return universal;
        }
    }

    /**
     * Legt den Wert der universal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setUniversal(boolean value) {
        this.universal = value;
    }

    public boolean isSetUniversal() {
        return (this.universal!= null);
    }

    public void unsetUniversal() {
        this.universal = null;
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
            List<NodeOrEdgePropertyType> theIsolated;
            theIsolated = this.getIsolated();
            strategy.appendField(locator, this, "isolated", buffer, theIsolated);
        }
        {
            List<DirectedFacePropertyType> theDirectedFace;
            theDirectedFace = this.getDirectedFace();
            strategy.appendField(locator, this, "directedFace", buffer, theDirectedFace);
        }
        {
            SolidPropertyType theSolidProperty;
            theSolidProperty = this.getSolidProperty();
            strategy.appendField(locator, this, "solidProperty", buffer, theSolidProperty);
        }
        {
            boolean theUniversal;
            theUniversal = this.isUniversal();
            strategy.appendField(locator, this, "universal", buffer, theUniversal);
        }
        {
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theAggregationType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TopoSolidType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TopoSolidType that = ((TopoSolidType) object);
        {
            List<NodeOrEdgePropertyType> lhsIsolated;
            lhsIsolated = this.getIsolated();
            List<NodeOrEdgePropertyType> rhsIsolated;
            rhsIsolated = that.getIsolated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isolated", lhsIsolated), LocatorUtils.property(thatLocator, "isolated", rhsIsolated), lhsIsolated, rhsIsolated)) {
                return false;
            }
        }
        {
            List<DirectedFacePropertyType> lhsDirectedFace;
            lhsDirectedFace = this.getDirectedFace();
            List<DirectedFacePropertyType> rhsDirectedFace;
            rhsDirectedFace = that.getDirectedFace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directedFace", lhsDirectedFace), LocatorUtils.property(thatLocator, "directedFace", rhsDirectedFace), lhsDirectedFace, rhsDirectedFace)) {
                return false;
            }
        }
        {
            SolidPropertyType lhsSolidProperty;
            lhsSolidProperty = this.getSolidProperty();
            SolidPropertyType rhsSolidProperty;
            rhsSolidProperty = that.getSolidProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "solidProperty", lhsSolidProperty), LocatorUtils.property(thatLocator, "solidProperty", rhsSolidProperty), lhsSolidProperty, rhsSolidProperty)) {
                return false;
            }
        }
        {
            boolean lhsUniversal;
            lhsUniversal = this.isUniversal();
            boolean rhsUniversal;
            rhsUniversal = that.isUniversal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "universal", lhsUniversal), LocatorUtils.property(thatLocator, "universal", rhsUniversal), lhsUniversal, rhsUniversal)) {
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
            List<NodeOrEdgePropertyType> theIsolated;
            theIsolated = this.getIsolated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isolated", theIsolated), currentHashCode, theIsolated);
        }
        {
            List<DirectedFacePropertyType> theDirectedFace;
            theDirectedFace = this.getDirectedFace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directedFace", theDirectedFace), currentHashCode, theDirectedFace);
        }
        {
            SolidPropertyType theSolidProperty;
            theSolidProperty = this.getSolidProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "solidProperty", theSolidProperty), currentHashCode, theSolidProperty);
        }
        {
            boolean theUniversal;
            theUniversal = this.isUniversal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "universal", theUniversal), currentHashCode, theUniversal);
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
        if (draftCopy instanceof TopoSolidType) {
            final TopoSolidType copy = ((TopoSolidType) draftCopy);
            if (this.isSetIsolated()) {
                List<NodeOrEdgePropertyType> sourceIsolated;
                sourceIsolated = this.getIsolated();
                @SuppressWarnings("unchecked")
                List<NodeOrEdgePropertyType> copyIsolated = ((List<NodeOrEdgePropertyType> ) strategy.copy(LocatorUtils.property(locator, "isolated", sourceIsolated), sourceIsolated));
                copy.unsetIsolated();
                List<NodeOrEdgePropertyType> uniqueIsolatedl = copy.getIsolated();
                uniqueIsolatedl.addAll(copyIsolated);
            } else {
                copy.unsetIsolated();
            }
            if (this.isSetDirectedFace()) {
                List<DirectedFacePropertyType> sourceDirectedFace;
                sourceDirectedFace = this.getDirectedFace();
                @SuppressWarnings("unchecked")
                List<DirectedFacePropertyType> copyDirectedFace = ((List<DirectedFacePropertyType> ) strategy.copy(LocatorUtils.property(locator, "directedFace", sourceDirectedFace), sourceDirectedFace));
                copy.unsetDirectedFace();
                List<DirectedFacePropertyType> uniqueDirectedFacel = copy.getDirectedFace();
                uniqueDirectedFacel.addAll(copyDirectedFace);
            } else {
                copy.unsetDirectedFace();
            }
            if (this.isSetSolidProperty()) {
                SolidPropertyType sourceSolidProperty;
                sourceSolidProperty = this.getSolidProperty();
                SolidPropertyType copySolidProperty = ((SolidPropertyType) strategy.copy(LocatorUtils.property(locator, "solidProperty", sourceSolidProperty), sourceSolidProperty));
                copy.setSolidProperty(copySolidProperty);
            } else {
                copy.solidProperty = null;
            }
            if (this.isSetUniversal()) {
                boolean sourceUniversal;
                sourceUniversal = this.isUniversal();
                boolean copyUniversal = strategy.copy(LocatorUtils.property(locator, "universal", sourceUniversal), sourceUniversal);
                copy.setUniversal(copyUniversal);
            } else {
                copy.unsetUniversal();
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
        return new TopoSolidType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TopoSolidType) {
            final TopoSolidType target = this;
            final TopoSolidType leftObject = ((TopoSolidType) left);
            final TopoSolidType rightObject = ((TopoSolidType) right);
            {
                List<NodeOrEdgePropertyType> lhsIsolated;
                lhsIsolated = leftObject.getIsolated();
                List<NodeOrEdgePropertyType> rhsIsolated;
                rhsIsolated = rightObject.getIsolated();
                target.unsetIsolated();
                List<NodeOrEdgePropertyType> uniqueIsolatedl = target.getIsolated();
                uniqueIsolatedl.addAll(((List<NodeOrEdgePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "isolated", lhsIsolated), LocatorUtils.property(rightLocator, "isolated", rhsIsolated), lhsIsolated, rhsIsolated)));
            }
            {
                List<DirectedFacePropertyType> lhsDirectedFace;
                lhsDirectedFace = leftObject.getDirectedFace();
                List<DirectedFacePropertyType> rhsDirectedFace;
                rhsDirectedFace = rightObject.getDirectedFace();
                target.unsetDirectedFace();
                List<DirectedFacePropertyType> uniqueDirectedFacel = target.getDirectedFace();
                uniqueDirectedFacel.addAll(((List<DirectedFacePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "directedFace", lhsDirectedFace), LocatorUtils.property(rightLocator, "directedFace", rhsDirectedFace), lhsDirectedFace, rhsDirectedFace)));
            }
            {
                SolidPropertyType lhsSolidProperty;
                lhsSolidProperty = leftObject.getSolidProperty();
                SolidPropertyType rhsSolidProperty;
                rhsSolidProperty = rightObject.getSolidProperty();
                target.setSolidProperty(((SolidPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "solidProperty", lhsSolidProperty), LocatorUtils.property(rightLocator, "solidProperty", rhsSolidProperty), lhsSolidProperty, rhsSolidProperty)));
            }
            {
                boolean lhsUniversal;
                lhsUniversal = leftObject.isUniversal();
                boolean rhsUniversal;
                rhsUniversal = rightObject.isUniversal();
                target.setUniversal(((boolean) strategy.merge(LocatorUtils.property(leftLocator, "universal", lhsUniversal), LocatorUtils.property(rightLocator, "universal", rhsUniversal), lhsUniversal, rhsUniversal)));
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

    public void setIsolated(List<NodeOrEdgePropertyType> value) {
        List<NodeOrEdgePropertyType> draftl = this.getIsolated();
        draftl.addAll(value);
    }

    public void setDirectedFace(List<DirectedFacePropertyType> value) {
        List<DirectedFacePropertyType> draftl = this.getDirectedFace();
        draftl.addAll(value);
    }

}
