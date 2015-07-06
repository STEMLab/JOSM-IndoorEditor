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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 * <p>Java-Klasse für ArcStringByBulgeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArcStringByBulgeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice maxOccurs="unbounded" minOccurs="2">
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinates"/>
 *         &lt;/choice>
 *         &lt;element name="bulge" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *         &lt;element name="normal" type="{http://www.opengis.net/gml/3.2}VectorType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="circularArc2PointWithBulge" />
 *       &lt;attribute name="numArc" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArcStringByBulgeType", propOrder = {
    "posOrPointPropertyOrPointRep",
    "posList",
    "coordinates",
    "bulge",
    "normal"
})
@XmlSeeAlso({
    ArcByBulgeType.class
})
public class ArcStringByBulgeType
    extends AbstractCurveSegmentType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "pos", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class),
        @XmlElementRef(name = "pointProperty", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class),
        @XmlElementRef(name = "pointRep", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> posOrPointPropertyOrPointRep;
    protected DirectPositionListType posList;
    protected CoordinatesType coordinates;
    @XmlElement(type = Double.class)
    protected List<Double> bulge;
    @XmlElement(required = true)
    protected List<VectorType> normal;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "interpolation")
    public final static CurveInterpolationType INTERPOLATION = CurveInterpolationType.CIRCULAR_ARC_2_POINT_WITH_BULGE;
    @XmlAttribute(name = "numArc")
    protected BigInteger numArc;

    /**
     * Gets the value of the posOrPointPropertyOrPointRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posOrPointPropertyOrPointRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosOrPointPropertyOrPointRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPosOrPointPropertyOrPointRep() {
        if (posOrPointPropertyOrPointRep == null) {
            posOrPointPropertyOrPointRep = new ArrayList<JAXBElement<?>>();
        }
        return this.posOrPointPropertyOrPointRep;
    }

    public boolean isSetPosOrPointPropertyOrPointRep() {
        return ((this.posOrPointPropertyOrPointRep!= null)&&(!this.posOrPointPropertyOrPointRep.isEmpty()));
    }

    public void unsetPosOrPointPropertyOrPointRep() {
        this.posOrPointPropertyOrPointRep = null;
    }

    /**
     * Ruft den Wert der posList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionListType }
     *     
     */
    public DirectPositionListType getPosList() {
        return posList;
    }

    /**
     * Legt den Wert der posList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionListType }
     *     
     */
    public void setPosList(DirectPositionListType value) {
        this.posList = value;
    }

    public boolean isSetPosList() {
        return (this.posList!= null);
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
     * Gets the value of the bulge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bulge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBulge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getBulge() {
        if (bulge == null) {
            bulge = new ArrayList<Double>();
        }
        return this.bulge;
    }

    public boolean isSetBulge() {
        return ((this.bulge!= null)&&(!this.bulge.isEmpty()));
    }

    public void unsetBulge() {
        this.bulge = null;
    }

    /**
     * Gets the value of the normal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorType }
     * 
     * 
     */
    public List<VectorType> getNormal() {
        if (normal == null) {
            normal = new ArrayList<VectorType>();
        }
        return this.normal;
    }

    public boolean isSetNormal() {
        return ((this.normal!= null)&&(!this.normal.isEmpty()));
    }

    public void unsetNormal() {
        this.normal = null;
    }

    /**
     * Ruft den Wert der numArc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumArc() {
        return numArc;
    }

    /**
     * Legt den Wert der numArc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumArc(BigInteger value) {
        this.numArc = value;
    }

    public boolean isSetNumArc() {
        return (this.numArc!= null);
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
            List<JAXBElement<?>> thePosOrPointPropertyOrPointRep;
            thePosOrPointPropertyOrPointRep = this.getPosOrPointPropertyOrPointRep();
            strategy.appendField(locator, this, "posOrPointPropertyOrPointRep", buffer, thePosOrPointPropertyOrPointRep);
        }
        {
            DirectPositionListType thePosList;
            thePosList = this.getPosList();
            strategy.appendField(locator, this, "posList", buffer, thePosList);
        }
        {
            CoordinatesType theCoordinates;
            theCoordinates = this.getCoordinates();
            strategy.appendField(locator, this, "coordinates", buffer, theCoordinates);
        }
        {
            List<Double> theBulge;
            theBulge = this.getBulge();
            strategy.appendField(locator, this, "bulge", buffer, theBulge);
        }
        {
            List<VectorType> theNormal;
            theNormal = this.getNormal();
            strategy.appendField(locator, this, "normal", buffer, theNormal);
        }
        {
            CurveInterpolationType theINTERPOLATION;
            theINTERPOLATION = ArcStringByBulgeType.INTERPOLATION;
            strategy.appendField(locator, this, "interpolation", buffer, theINTERPOLATION);
        }
        {
            BigInteger theNumArc;
            theNumArc = this.getNumArc();
            strategy.appendField(locator, this, "numArc", buffer, theNumArc);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArcStringByBulgeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ArcStringByBulgeType that = ((ArcStringByBulgeType) object);
        {
            List<JAXBElement<?>> lhsPosOrPointPropertyOrPointRep;
            lhsPosOrPointPropertyOrPointRep = this.getPosOrPointPropertyOrPointRep();
            List<JAXBElement<?>> rhsPosOrPointPropertyOrPointRep;
            rhsPosOrPointPropertyOrPointRep = that.getPosOrPointPropertyOrPointRep();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "posOrPointPropertyOrPointRep", lhsPosOrPointPropertyOrPointRep), LocatorUtils.property(thatLocator, "posOrPointPropertyOrPointRep", rhsPosOrPointPropertyOrPointRep), lhsPosOrPointPropertyOrPointRep, rhsPosOrPointPropertyOrPointRep)) {
                return false;
            }
        }
        {
            DirectPositionListType lhsPosList;
            lhsPosList = this.getPosList();
            DirectPositionListType rhsPosList;
            rhsPosList = that.getPosList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "posList", lhsPosList), LocatorUtils.property(thatLocator, "posList", rhsPosList), lhsPosList, rhsPosList)) {
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
            List<Double> lhsBulge;
            lhsBulge = this.getBulge();
            List<Double> rhsBulge;
            rhsBulge = that.getBulge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bulge", lhsBulge), LocatorUtils.property(thatLocator, "bulge", rhsBulge), lhsBulge, rhsBulge)) {
                return false;
            }
        }
        {
            List<VectorType> lhsNormal;
            lhsNormal = this.getNormal();
            List<VectorType> rhsNormal;
            rhsNormal = that.getNormal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "normal", lhsNormal), LocatorUtils.property(thatLocator, "normal", rhsNormal), lhsNormal, rhsNormal)) {
                return false;
            }
        }
        {
            BigInteger lhsNumArc;
            lhsNumArc = this.getNumArc();
            BigInteger rhsNumArc;
            rhsNumArc = that.getNumArc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numArc", lhsNumArc), LocatorUtils.property(thatLocator, "numArc", rhsNumArc), lhsNumArc, rhsNumArc)) {
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
            List<JAXBElement<?>> thePosOrPointPropertyOrPointRep;
            thePosOrPointPropertyOrPointRep = this.getPosOrPointPropertyOrPointRep();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posOrPointPropertyOrPointRep", thePosOrPointPropertyOrPointRep), currentHashCode, thePosOrPointPropertyOrPointRep);
        }
        {
            DirectPositionListType thePosList;
            thePosList = this.getPosList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posList", thePosList), currentHashCode, thePosList);
        }
        {
            CoordinatesType theCoordinates;
            theCoordinates = this.getCoordinates();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinates", theCoordinates), currentHashCode, theCoordinates);
        }
        {
            List<Double> theBulge;
            theBulge = this.getBulge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bulge", theBulge), currentHashCode, theBulge);
        }
        {
            List<VectorType> theNormal;
            theNormal = this.getNormal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "normal", theNormal), currentHashCode, theNormal);
        }
        {
            BigInteger theNumArc;
            theNumArc = this.getNumArc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numArc", theNumArc), currentHashCode, theNumArc);
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
        if (draftCopy instanceof ArcStringByBulgeType) {
            final ArcStringByBulgeType copy = ((ArcStringByBulgeType) draftCopy);
            if (this.isSetPosOrPointPropertyOrPointRep()) {
                List<JAXBElement<?>> sourcePosOrPointPropertyOrPointRep;
                sourcePosOrPointPropertyOrPointRep = this.getPosOrPointPropertyOrPointRep();
                @SuppressWarnings("unchecked")
                List<JAXBElement<?>> copyPosOrPointPropertyOrPointRep = ((List<JAXBElement<?>> ) strategy.copy(LocatorUtils.property(locator, "posOrPointPropertyOrPointRep", sourcePosOrPointPropertyOrPointRep), sourcePosOrPointPropertyOrPointRep));
                copy.unsetPosOrPointPropertyOrPointRep();
                List<JAXBElement<?>> uniquePosOrPointPropertyOrPointRepl = copy.getPosOrPointPropertyOrPointRep();
                uniquePosOrPointPropertyOrPointRepl.addAll(copyPosOrPointPropertyOrPointRep);
            } else {
                copy.unsetPosOrPointPropertyOrPointRep();
            }
            if (this.isSetPosList()) {
                DirectPositionListType sourcePosList;
                sourcePosList = this.getPosList();
                DirectPositionListType copyPosList = ((DirectPositionListType) strategy.copy(LocatorUtils.property(locator, "posList", sourcePosList), sourcePosList));
                copy.setPosList(copyPosList);
            } else {
                copy.posList = null;
            }
            if (this.isSetCoordinates()) {
                CoordinatesType sourceCoordinates;
                sourceCoordinates = this.getCoordinates();
                CoordinatesType copyCoordinates = ((CoordinatesType) strategy.copy(LocatorUtils.property(locator, "coordinates", sourceCoordinates), sourceCoordinates));
                copy.setCoordinates(copyCoordinates);
            } else {
                copy.coordinates = null;
            }
            if (this.isSetBulge()) {
                List<Double> sourceBulge;
                sourceBulge = this.getBulge();
                @SuppressWarnings("unchecked")
                List<Double> copyBulge = ((List<Double> ) strategy.copy(LocatorUtils.property(locator, "bulge", sourceBulge), sourceBulge));
                copy.unsetBulge();
                List<Double> uniqueBulgel = copy.getBulge();
                uniqueBulgel.addAll(copyBulge);
            } else {
                copy.unsetBulge();
            }
            if (this.isSetNormal()) {
                List<VectorType> sourceNormal;
                sourceNormal = this.getNormal();
                @SuppressWarnings("unchecked")
                List<VectorType> copyNormal = ((List<VectorType> ) strategy.copy(LocatorUtils.property(locator, "normal", sourceNormal), sourceNormal));
                copy.unsetNormal();
                List<VectorType> uniqueNormall = copy.getNormal();
                uniqueNormall.addAll(copyNormal);
            } else {
                copy.unsetNormal();
            }
            if (this.isSetNumArc()) {
                BigInteger sourceNumArc;
                sourceNumArc = this.getNumArc();
                BigInteger copyNumArc = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "numArc", sourceNumArc), sourceNumArc));
                copy.setNumArc(copyNumArc);
            } else {
                copy.numArc = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ArcStringByBulgeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ArcStringByBulgeType) {
            final ArcStringByBulgeType target = this;
            final ArcStringByBulgeType leftObject = ((ArcStringByBulgeType) left);
            final ArcStringByBulgeType rightObject = ((ArcStringByBulgeType) right);
            {
                List<JAXBElement<?>> lhsPosOrPointPropertyOrPointRep;
                lhsPosOrPointPropertyOrPointRep = leftObject.getPosOrPointPropertyOrPointRep();
                List<JAXBElement<?>> rhsPosOrPointPropertyOrPointRep;
                rhsPosOrPointPropertyOrPointRep = rightObject.getPosOrPointPropertyOrPointRep();
                target.unsetPosOrPointPropertyOrPointRep();
                List<JAXBElement<?>> uniquePosOrPointPropertyOrPointRepl = target.getPosOrPointPropertyOrPointRep();
                uniquePosOrPointPropertyOrPointRepl.addAll(((List<JAXBElement<?>> ) strategy.merge(LocatorUtils.property(leftLocator, "posOrPointPropertyOrPointRep", lhsPosOrPointPropertyOrPointRep), LocatorUtils.property(rightLocator, "posOrPointPropertyOrPointRep", rhsPosOrPointPropertyOrPointRep), lhsPosOrPointPropertyOrPointRep, rhsPosOrPointPropertyOrPointRep)));
            }
            {
                DirectPositionListType lhsPosList;
                lhsPosList = leftObject.getPosList();
                DirectPositionListType rhsPosList;
                rhsPosList = rightObject.getPosList();
                target.setPosList(((DirectPositionListType) strategy.merge(LocatorUtils.property(leftLocator, "posList", lhsPosList), LocatorUtils.property(rightLocator, "posList", rhsPosList), lhsPosList, rhsPosList)));
            }
            {
                CoordinatesType lhsCoordinates;
                lhsCoordinates = leftObject.getCoordinates();
                CoordinatesType rhsCoordinates;
                rhsCoordinates = rightObject.getCoordinates();
                target.setCoordinates(((CoordinatesType) strategy.merge(LocatorUtils.property(leftLocator, "coordinates", lhsCoordinates), LocatorUtils.property(rightLocator, "coordinates", rhsCoordinates), lhsCoordinates, rhsCoordinates)));
            }
            {
                List<Double> lhsBulge;
                lhsBulge = leftObject.getBulge();
                List<Double> rhsBulge;
                rhsBulge = rightObject.getBulge();
                target.unsetBulge();
                List<Double> uniqueBulgel = target.getBulge();
                uniqueBulgel.addAll(((List<Double> ) strategy.merge(LocatorUtils.property(leftLocator, "bulge", lhsBulge), LocatorUtils.property(rightLocator, "bulge", rhsBulge), lhsBulge, rhsBulge)));
            }
            {
                List<VectorType> lhsNormal;
                lhsNormal = leftObject.getNormal();
                List<VectorType> rhsNormal;
                rhsNormal = rightObject.getNormal();
                target.unsetNormal();
                List<VectorType> uniqueNormall = target.getNormal();
                uniqueNormall.addAll(((List<VectorType> ) strategy.merge(LocatorUtils.property(leftLocator, "normal", lhsNormal), LocatorUtils.property(rightLocator, "normal", rhsNormal), lhsNormal, rhsNormal)));
            }
            {
                BigInteger lhsNumArc;
                lhsNumArc = leftObject.getNumArc();
                BigInteger rhsNumArc;
                rhsNumArc = rightObject.getNumArc();
                target.setNumArc(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "numArc", lhsNumArc), LocatorUtils.property(rightLocator, "numArc", rhsNumArc), lhsNumArc, rhsNumArc)));
            }
        }
    }

    public void setPosOrPointPropertyOrPointRep(List<JAXBElement<?>> value) {
        List<JAXBElement<?>> draftl = this.getPosOrPointPropertyOrPointRep();
        draftl.addAll(value);
    }

    public void setBulge(List<Double> value) {
        List<Double> draftl = this.getBulge();
        draftl.addAll(value);
    }

    public void setNormal(List<VectorType> value) {
        List<VectorType> draftl = this.getNormal();
        draftl.addAll(value);
    }

}
