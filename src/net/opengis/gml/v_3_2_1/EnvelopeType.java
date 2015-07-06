//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java-Klasse für EnvelopeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnvelopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="lowerCorner" type="{http://www.opengis.net/gml/3.2}DirectPositionType"/>
 *           &lt;element name="upperCorner" type="{http://www.opengis.net/gml/3.2}DirectPositionType"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}pos" maxOccurs="2" minOccurs="2"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}coordinates"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}SRSReferenceGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeType", propOrder = {
    "lowerCorner",
    "upperCorner",
    "pos",
    "coordinates"
})
@XmlSeeAlso({
    EnvelopeWithTimePeriodType.class
})
public class EnvelopeType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected DirectPositionType lowerCorner;
    protected DirectPositionType upperCorner;
    protected List<DirectPositionType> pos;
    protected CoordinatesType coordinates;
    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;
    @XmlAttribute(name = "srsDimension")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger srsDimension;
    @XmlAttribute(name = "axisLabels")
    protected List<String> axisLabels;
    @XmlAttribute(name = "uomLabels")
    protected List<String> uomLabels;

    /**
     * Ruft den Wert der lowerCorner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getLowerCorner() {
        return lowerCorner;
    }

    /**
     * Legt den Wert der lowerCorner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setLowerCorner(DirectPositionType value) {
        this.lowerCorner = value;
    }

    public boolean isSetLowerCorner() {
        return (this.lowerCorner!= null);
    }

    /**
     * Ruft den Wert der upperCorner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getUpperCorner() {
        return upperCorner;
    }

    /**
     * Legt den Wert der upperCorner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setUpperCorner(DirectPositionType value) {
        this.upperCorner = value;
    }

    public boolean isSetUpperCorner() {
        return (this.upperCorner!= null);
    }

    /**
     * Gets the value of the pos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectPositionType }
     * 
     * 
     */
    public List<DirectPositionType> getPos() {
        if (pos == null) {
            pos = new ArrayList<DirectPositionType>();
        }
        return this.pos;
    }

    public boolean isSetPos() {
        return ((this.pos!= null)&&(!this.pos.isEmpty()));
    }

    public void unsetPos() {
        this.pos = null;
    }

    /**
     * Ruft den Wert der coordinates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Legt den Wert der coordinates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    public boolean isSetCoordinates() {
        return (this.coordinates!= null);
    }

    /**
     * Ruft den Wert der srsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Legt den Wert der srsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public boolean isSetSrsName() {
        return (this.srsName!= null);
    }

    /**
     * Ruft den Wert der srsDimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSrsDimension() {
        return srsDimension;
    }

    /**
     * Legt den Wert der srsDimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSrsDimension(BigInteger value) {
        this.srsDimension = value;
    }

    public boolean isSetSrsDimension() {
        return (this.srsDimension!= null);
    }

    /**
     * Gets the value of the axisLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAxisLabels() {
        if (axisLabels == null) {
            axisLabels = new ArrayList<String>();
        }
        return this.axisLabels;
    }

    public boolean isSetAxisLabels() {
        return ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
    }

    public void unsetAxisLabels() {
        this.axisLabels = null;
    }

    /**
     * Gets the value of the uomLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uomLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUomLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUomLabels() {
        if (uomLabels == null) {
            uomLabels = new ArrayList<String>();
        }
        return this.uomLabels;
    }

    public boolean isSetUomLabels() {
        return ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
    }

    public void unsetUomLabels() {
        this.uomLabels = null;
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
            DirectPositionType theLowerCorner;
            theLowerCorner = this.getLowerCorner();
            strategy.appendField(locator, this, "lowerCorner", buffer, theLowerCorner);
        }
        {
            DirectPositionType theUpperCorner;
            theUpperCorner = this.getUpperCorner();
            strategy.appendField(locator, this, "upperCorner", buffer, theUpperCorner);
        }
        {
            List<DirectPositionType> thePos;
            thePos = this.getPos();
            strategy.appendField(locator, this, "pos", buffer, thePos);
        }
        {
            CoordinatesType theCoordinates;
            theCoordinates = this.getCoordinates();
            strategy.appendField(locator, this, "coordinates", buffer, theCoordinates);
        }
        {
            String theSrsName;
            theSrsName = this.getSrsName();
            strategy.appendField(locator, this, "srsName", buffer, theSrsName);
        }
        {
            BigInteger theSrsDimension;
            theSrsDimension = this.getSrsDimension();
            strategy.appendField(locator, this, "srsDimension", buffer, theSrsDimension);
        }
        {
            List<String> theAxisLabels;
            theAxisLabels = this.getAxisLabels();
            strategy.appendField(locator, this, "axisLabels", buffer, theAxisLabels);
        }
        {
            List<String> theUomLabels;
            theUomLabels = this.getUomLabels();
            strategy.appendField(locator, this, "uomLabels", buffer, theUomLabels);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EnvelopeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EnvelopeType that = ((EnvelopeType) object);
        {
            DirectPositionType lhsLowerCorner;
            lhsLowerCorner = this.getLowerCorner();
            DirectPositionType rhsLowerCorner;
            rhsLowerCorner = that.getLowerCorner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lowerCorner", lhsLowerCorner), LocatorUtils.property(thatLocator, "lowerCorner", rhsLowerCorner), lhsLowerCorner, rhsLowerCorner)) {
                return false;
            }
        }
        {
            DirectPositionType lhsUpperCorner;
            lhsUpperCorner = this.getUpperCorner();
            DirectPositionType rhsUpperCorner;
            rhsUpperCorner = that.getUpperCorner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "upperCorner", lhsUpperCorner), LocatorUtils.property(thatLocator, "upperCorner", rhsUpperCorner), lhsUpperCorner, rhsUpperCorner)) {
                return false;
            }
        }
        {
            List<DirectPositionType> lhsPos;
            lhsPos = this.getPos();
            List<DirectPositionType> rhsPos;
            rhsPos = that.getPos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pos", lhsPos), LocatorUtils.property(thatLocator, "pos", rhsPos), lhsPos, rhsPos)) {
                return false;
            }
        }
        {
            CoordinatesType lhsCoordinates;
            lhsCoordinates = this.getCoordinates();
            CoordinatesType rhsCoordinates;
            rhsCoordinates = that.getCoordinates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coordinates", lhsCoordinates), LocatorUtils.property(thatLocator, "coordinates", rhsCoordinates), lhsCoordinates, rhsCoordinates)) {
                return false;
            }
        }
        {
            String lhsSrsName;
            lhsSrsName = this.getSrsName();
            String rhsSrsName;
            rhsSrsName = that.getSrsName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "srsName", lhsSrsName), LocatorUtils.property(thatLocator, "srsName", rhsSrsName), lhsSrsName, rhsSrsName)) {
                return false;
            }
        }
        {
            BigInteger lhsSrsDimension;
            lhsSrsDimension = this.getSrsDimension();
            BigInteger rhsSrsDimension;
            rhsSrsDimension = that.getSrsDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "srsDimension", lhsSrsDimension), LocatorUtils.property(thatLocator, "srsDimension", rhsSrsDimension), lhsSrsDimension, rhsSrsDimension)) {
                return false;
            }
        }
        {
            List<String> lhsAxisLabels;
            lhsAxisLabels = this.getAxisLabels();
            List<String> rhsAxisLabels;
            rhsAxisLabels = that.getAxisLabels();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "axisLabels", lhsAxisLabels), LocatorUtils.property(thatLocator, "axisLabels", rhsAxisLabels), lhsAxisLabels, rhsAxisLabels)) {
                return false;
            }
        }
        {
            List<String> lhsUomLabels;
            lhsUomLabels = this.getUomLabels();
            List<String> rhsUomLabels;
            rhsUomLabels = that.getUomLabels();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uomLabels", lhsUomLabels), LocatorUtils.property(thatLocator, "uomLabels", rhsUomLabels), lhsUomLabels, rhsUomLabels)) {
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
            DirectPositionType theLowerCorner;
            theLowerCorner = this.getLowerCorner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lowerCorner", theLowerCorner), currentHashCode, theLowerCorner);
        }
        {
            DirectPositionType theUpperCorner;
            theUpperCorner = this.getUpperCorner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upperCorner", theUpperCorner), currentHashCode, theUpperCorner);
        }
        {
            List<DirectPositionType> thePos;
            thePos = this.getPos();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pos", thePos), currentHashCode, thePos);
        }
        {
            CoordinatesType theCoordinates;
            theCoordinates = this.getCoordinates();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinates", theCoordinates), currentHashCode, theCoordinates);
        }
        {
            String theSrsName;
            theSrsName = this.getSrsName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "srsName", theSrsName), currentHashCode, theSrsName);
        }
        {
            BigInteger theSrsDimension;
            theSrsDimension = this.getSrsDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "srsDimension", theSrsDimension), currentHashCode, theSrsDimension);
        }
        {
            List<String> theAxisLabels;
            theAxisLabels = this.getAxisLabels();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axisLabels", theAxisLabels), currentHashCode, theAxisLabels);
        }
        {
            List<String> theUomLabels;
            theUomLabels = this.getUomLabels();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uomLabels", theUomLabels), currentHashCode, theUomLabels);
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
        if (draftCopy instanceof EnvelopeType) {
            final EnvelopeType copy = ((EnvelopeType) draftCopy);
            if (this.isSetLowerCorner()) {
                DirectPositionType sourceLowerCorner;
                sourceLowerCorner = this.getLowerCorner();
                DirectPositionType copyLowerCorner = ((DirectPositionType) strategy.copy(LocatorUtils.property(locator, "lowerCorner", sourceLowerCorner), sourceLowerCorner));
                copy.setLowerCorner(copyLowerCorner);
            } else {
                copy.lowerCorner = null;
            }
            if (this.isSetUpperCorner()) {
                DirectPositionType sourceUpperCorner;
                sourceUpperCorner = this.getUpperCorner();
                DirectPositionType copyUpperCorner = ((DirectPositionType) strategy.copy(LocatorUtils.property(locator, "upperCorner", sourceUpperCorner), sourceUpperCorner));
                copy.setUpperCorner(copyUpperCorner);
            } else {
                copy.upperCorner = null;
            }
            if (this.isSetPos()) {
                List<DirectPositionType> sourcePos;
                sourcePos = this.getPos();
                @SuppressWarnings("unchecked")
                List<DirectPositionType> copyPos = ((List<DirectPositionType> ) strategy.copy(LocatorUtils.property(locator, "pos", sourcePos), sourcePos));
                copy.unsetPos();
                List<DirectPositionType> uniquePosl = copy.getPos();
                uniquePosl.addAll(copyPos);
            } else {
                copy.unsetPos();
            }
            if (this.isSetCoordinates()) {
                CoordinatesType sourceCoordinates;
                sourceCoordinates = this.getCoordinates();
                CoordinatesType copyCoordinates = ((CoordinatesType) strategy.copy(LocatorUtils.property(locator, "coordinates", sourceCoordinates), sourceCoordinates));
                copy.setCoordinates(copyCoordinates);
            } else {
                copy.coordinates = null;
            }
            if (this.isSetSrsName()) {
                String sourceSrsName;
                sourceSrsName = this.getSrsName();
                String copySrsName = ((String) strategy.copy(LocatorUtils.property(locator, "srsName", sourceSrsName), sourceSrsName));
                copy.setSrsName(copySrsName);
            } else {
                copy.srsName = null;
            }
            if (this.isSetSrsDimension()) {
                BigInteger sourceSrsDimension;
                sourceSrsDimension = this.getSrsDimension();
                BigInteger copySrsDimension = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "srsDimension", sourceSrsDimension), sourceSrsDimension));
                copy.setSrsDimension(copySrsDimension);
            } else {
                copy.srsDimension = null;
            }
            if (this.isSetAxisLabels()) {
                List<String> sourceAxisLabels;
                sourceAxisLabels = this.getAxisLabels();
                @SuppressWarnings("unchecked")
                List<String> copyAxisLabels = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "axisLabels", sourceAxisLabels), sourceAxisLabels));
                copy.unsetAxisLabels();
                List<String> uniqueAxisLabelsl = copy.getAxisLabels();
                uniqueAxisLabelsl.addAll(copyAxisLabels);
            } else {
                copy.unsetAxisLabels();
            }
            if (this.isSetUomLabels()) {
                List<String> sourceUomLabels;
                sourceUomLabels = this.getUomLabels();
                @SuppressWarnings("unchecked")
                List<String> copyUomLabels = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "uomLabels", sourceUomLabels), sourceUomLabels));
                copy.unsetUomLabels();
                List<String> uniqueUomLabelsl = copy.getUomLabels();
                uniqueUomLabelsl.addAll(copyUomLabels);
            } else {
                copy.unsetUomLabels();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EnvelopeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof EnvelopeType) {
            final EnvelopeType target = this;
            final EnvelopeType leftObject = ((EnvelopeType) left);
            final EnvelopeType rightObject = ((EnvelopeType) right);
            {
                DirectPositionType lhsLowerCorner;
                lhsLowerCorner = leftObject.getLowerCorner();
                DirectPositionType rhsLowerCorner;
                rhsLowerCorner = rightObject.getLowerCorner();
                target.setLowerCorner(((DirectPositionType) strategy.merge(LocatorUtils.property(leftLocator, "lowerCorner", lhsLowerCorner), LocatorUtils.property(rightLocator, "lowerCorner", rhsLowerCorner), lhsLowerCorner, rhsLowerCorner)));
            }
            {
                DirectPositionType lhsUpperCorner;
                lhsUpperCorner = leftObject.getUpperCorner();
                DirectPositionType rhsUpperCorner;
                rhsUpperCorner = rightObject.getUpperCorner();
                target.setUpperCorner(((DirectPositionType) strategy.merge(LocatorUtils.property(leftLocator, "upperCorner", lhsUpperCorner), LocatorUtils.property(rightLocator, "upperCorner", rhsUpperCorner), lhsUpperCorner, rhsUpperCorner)));
            }
            {
                List<DirectPositionType> lhsPos;
                lhsPos = leftObject.getPos();
                List<DirectPositionType> rhsPos;
                rhsPos = rightObject.getPos();
                target.unsetPos();
                List<DirectPositionType> uniquePosl = target.getPos();
                uniquePosl.addAll(((List<DirectPositionType> ) strategy.merge(LocatorUtils.property(leftLocator, "pos", lhsPos), LocatorUtils.property(rightLocator, "pos", rhsPos), lhsPos, rhsPos)));
            }
            {
                CoordinatesType lhsCoordinates;
                lhsCoordinates = leftObject.getCoordinates();
                CoordinatesType rhsCoordinates;
                rhsCoordinates = rightObject.getCoordinates();
                target.setCoordinates(((CoordinatesType) strategy.merge(LocatorUtils.property(leftLocator, "coordinates", lhsCoordinates), LocatorUtils.property(rightLocator, "coordinates", rhsCoordinates), lhsCoordinates, rhsCoordinates)));
            }
            {
                String lhsSrsName;
                lhsSrsName = leftObject.getSrsName();
                String rhsSrsName;
                rhsSrsName = rightObject.getSrsName();
                target.setSrsName(((String) strategy.merge(LocatorUtils.property(leftLocator, "srsName", lhsSrsName), LocatorUtils.property(rightLocator, "srsName", rhsSrsName), lhsSrsName, rhsSrsName)));
            }
            {
                BigInteger lhsSrsDimension;
                lhsSrsDimension = leftObject.getSrsDimension();
                BigInteger rhsSrsDimension;
                rhsSrsDimension = rightObject.getSrsDimension();
                target.setSrsDimension(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "srsDimension", lhsSrsDimension), LocatorUtils.property(rightLocator, "srsDimension", rhsSrsDimension), lhsSrsDimension, rhsSrsDimension)));
            }
            {
                List<String> lhsAxisLabels;
                lhsAxisLabels = leftObject.getAxisLabels();
                List<String> rhsAxisLabels;
                rhsAxisLabels = rightObject.getAxisLabels();
                target.unsetAxisLabels();
                List<String> uniqueAxisLabelsl = target.getAxisLabels();
                uniqueAxisLabelsl.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "axisLabels", lhsAxisLabels), LocatorUtils.property(rightLocator, "axisLabels", rhsAxisLabels), lhsAxisLabels, rhsAxisLabels)));
            }
            {
                List<String> lhsUomLabels;
                lhsUomLabels = leftObject.getUomLabels();
                List<String> rhsUomLabels;
                rhsUomLabels = rightObject.getUomLabels();
                target.unsetUomLabels();
                List<String> uniqueUomLabelsl = target.getUomLabels();
                uniqueUomLabelsl.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "uomLabels", lhsUomLabels), LocatorUtils.property(rightLocator, "uomLabels", rhsUomLabels), lhsUomLabels, rhsUomLabels)));
            }
        }
    }

    public void setPos(List<DirectPositionType> value) {
        List<DirectPositionType> draftl = this.getPos();
        draftl.addAll(value);
    }

    public void setAxisLabels(List<String> value) {
        List<String> draftl = this.getAxisLabels();
        draftl.addAll(value);
    }

    public void setUomLabels(List<String> value) {
        List<String> draftl = this.getUomLabels();
        draftl.addAll(value);
    }

}
