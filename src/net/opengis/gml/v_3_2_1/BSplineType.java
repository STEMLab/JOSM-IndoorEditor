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
 * <p>Java-Klasse für BSplineType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BSplineType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinates"/>
 *         &lt;/choice>
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="knot" type="{http://www.opengis.net/gml/3.2}KnotPropertyType" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" default="polynomialSpline" />
 *       &lt;attribute name="isPolynomial" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="knotType" type="{http://www.opengis.net/gml/3.2}KnotTypesType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BSplineType", propOrder = {
    "posOrPointPropertyOrPointRep",
    "posList",
    "coordinates",
    "degree",
    "knot"
})
@XmlSeeAlso({
    BezierType.class
})
public class BSplineType
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
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger degree;
    @XmlElement(required = true)
    protected List<KnotPropertyType> knot;
    @XmlAttribute(name = "interpolation")
    protected CurveInterpolationType interpolation;
    @XmlAttribute(name = "isPolynomial")
    protected java.lang.Boolean isPolynomial;
    @XmlAttribute(name = "knotType")
    protected KnotTypesType knotType;

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
     * Ruft den Wert der degree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDegree() {
        return degree;
    }

    /**
     * Legt den Wert der degree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDegree(BigInteger value) {
        this.degree = value;
    }

    public boolean isSetDegree() {
        return (this.degree!= null);
    }

    /**
     * Gets the value of the knot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KnotPropertyType }
     * 
     * 
     */
    public List<KnotPropertyType> getKnot() {
        if (knot == null) {
            knot = new ArrayList<KnotPropertyType>();
        }
        return this.knot;
    }

    public boolean isSetKnot() {
        return ((this.knot!= null)&&(!this.knot.isEmpty()));
    }

    public void unsetKnot() {
        this.knot = null;
    }

    /**
     * Ruft den Wert der interpolation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getInterpolation() {
        if (interpolation == null) {
            return CurveInterpolationType.POLYNOMIAL_SPLINE;
        } else {
            return interpolation;
        }
    }

    /**
     * Legt den Wert der interpolation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setInterpolation(CurveInterpolationType value) {
        this.interpolation = value;
    }

    public boolean isSetInterpolation() {
        return (this.interpolation!= null);
    }

    /**
     * Ruft den Wert der isPolynomial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isIsPolynomial() {
        return isPolynomial;
    }

    /**
     * Legt den Wert der isPolynomial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setIsPolynomial(boolean value) {
        this.isPolynomial = value;
    }

    public boolean isSetIsPolynomial() {
        return (this.isPolynomial!= null);
    }

    public void unsetIsPolynomial() {
        this.isPolynomial = null;
    }

    /**
     * Ruft den Wert der knotType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KnotTypesType }
     *     
     */
    public KnotTypesType getKnotType() {
        return knotType;
    }

    /**
     * Legt den Wert der knotType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KnotTypesType }
     *     
     */
    public void setKnotType(KnotTypesType value) {
        this.knotType = value;
    }

    public boolean isSetKnotType() {
        return (this.knotType!= null);
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
            BigInteger theDegree;
            theDegree = this.getDegree();
            strategy.appendField(locator, this, "degree", buffer, theDegree);
        }
        {
            List<KnotPropertyType> theKnot;
            theKnot = this.getKnot();
            strategy.appendField(locator, this, "knot", buffer, theKnot);
        }
        {
            CurveInterpolationType theInterpolation;
            theInterpolation = this.getInterpolation();
            strategy.appendField(locator, this, "interpolation", buffer, theInterpolation);
        }
        {
            boolean theIsPolynomial;
            theIsPolynomial = this.isIsPolynomial();
            strategy.appendField(locator, this, "isPolynomial", buffer, theIsPolynomial);
        }
        {
            KnotTypesType theKnotType;
            theKnotType = this.getKnotType();
            strategy.appendField(locator, this, "knotType", buffer, theKnotType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BSplineType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BSplineType that = ((BSplineType) object);
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
            BigInteger lhsDegree;
            lhsDegree = this.getDegree();
            BigInteger rhsDegree;
            rhsDegree = that.getDegree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "degree", lhsDegree), LocatorUtils.property(thatLocator, "degree", rhsDegree), lhsDegree, rhsDegree)) {
                return false;
            }
        }
        {
            List<KnotPropertyType> lhsKnot;
            lhsKnot = this.getKnot();
            List<KnotPropertyType> rhsKnot;
            rhsKnot = that.getKnot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "knot", lhsKnot), LocatorUtils.property(thatLocator, "knot", rhsKnot), lhsKnot, rhsKnot)) {
                return false;
            }
        }
        {
            CurveInterpolationType lhsInterpolation;
            lhsInterpolation = this.getInterpolation();
            CurveInterpolationType rhsInterpolation;
            rhsInterpolation = that.getInterpolation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interpolation", lhsInterpolation), LocatorUtils.property(thatLocator, "interpolation", rhsInterpolation), lhsInterpolation, rhsInterpolation)) {
                return false;
            }
        }
        {
            boolean lhsIsPolynomial;
            lhsIsPolynomial = this.isIsPolynomial();
            boolean rhsIsPolynomial;
            rhsIsPolynomial = that.isIsPolynomial();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isPolynomial", lhsIsPolynomial), LocatorUtils.property(thatLocator, "isPolynomial", rhsIsPolynomial), lhsIsPolynomial, rhsIsPolynomial)) {
                return false;
            }
        }
        {
            KnotTypesType lhsKnotType;
            lhsKnotType = this.getKnotType();
            KnotTypesType rhsKnotType;
            rhsKnotType = that.getKnotType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "knotType", lhsKnotType), LocatorUtils.property(thatLocator, "knotType", rhsKnotType), lhsKnotType, rhsKnotType)) {
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
            BigInteger theDegree;
            theDegree = this.getDegree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "degree", theDegree), currentHashCode, theDegree);
        }
        {
            List<KnotPropertyType> theKnot;
            theKnot = this.getKnot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "knot", theKnot), currentHashCode, theKnot);
        }
        {
            CurveInterpolationType theInterpolation;
            theInterpolation = this.getInterpolation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "interpolation", theInterpolation), currentHashCode, theInterpolation);
        }
        {
            boolean theIsPolynomial;
            theIsPolynomial = this.isIsPolynomial();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isPolynomial", theIsPolynomial), currentHashCode, theIsPolynomial);
        }
        {
            KnotTypesType theKnotType;
            theKnotType = this.getKnotType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "knotType", theKnotType), currentHashCode, theKnotType);
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
        if (draftCopy instanceof BSplineType) {
            final BSplineType copy = ((BSplineType) draftCopy);
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
            if (this.isSetDegree()) {
                BigInteger sourceDegree;
                sourceDegree = this.getDegree();
                BigInteger copyDegree = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "degree", sourceDegree), sourceDegree));
                copy.setDegree(copyDegree);
            } else {
                copy.degree = null;
            }
            if (this.isSetKnot()) {
                List<KnotPropertyType> sourceKnot;
                sourceKnot = this.getKnot();
                @SuppressWarnings("unchecked")
                List<KnotPropertyType> copyKnot = ((List<KnotPropertyType> ) strategy.copy(LocatorUtils.property(locator, "knot", sourceKnot), sourceKnot));
                copy.unsetKnot();
                List<KnotPropertyType> uniqueKnotl = copy.getKnot();
                uniqueKnotl.addAll(copyKnot);
            } else {
                copy.unsetKnot();
            }
            if (this.isSetInterpolation()) {
                CurveInterpolationType sourceInterpolation;
                sourceInterpolation = this.getInterpolation();
                CurveInterpolationType copyInterpolation = ((CurveInterpolationType) strategy.copy(LocatorUtils.property(locator, "interpolation", sourceInterpolation), sourceInterpolation));
                copy.setInterpolation(copyInterpolation);
            } else {
                copy.interpolation = null;
            }
            if (this.isSetIsPolynomial()) {
                boolean sourceIsPolynomial;
                sourceIsPolynomial = this.isIsPolynomial();
                boolean copyIsPolynomial = strategy.copy(LocatorUtils.property(locator, "isPolynomial", sourceIsPolynomial), sourceIsPolynomial);
                copy.setIsPolynomial(copyIsPolynomial);
            } else {
                copy.unsetIsPolynomial();
            }
            if (this.isSetKnotType()) {
                KnotTypesType sourceKnotType;
                sourceKnotType = this.getKnotType();
                KnotTypesType copyKnotType = ((KnotTypesType) strategy.copy(LocatorUtils.property(locator, "knotType", sourceKnotType), sourceKnotType));
                copy.setKnotType(copyKnotType);
            } else {
                copy.knotType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BSplineType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof BSplineType) {
            final BSplineType target = this;
            final BSplineType leftObject = ((BSplineType) left);
            final BSplineType rightObject = ((BSplineType) right);
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
                BigInteger lhsDegree;
                lhsDegree = leftObject.getDegree();
                BigInteger rhsDegree;
                rhsDegree = rightObject.getDegree();
                target.setDegree(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "degree", lhsDegree), LocatorUtils.property(rightLocator, "degree", rhsDegree), lhsDegree, rhsDegree)));
            }
            {
                List<KnotPropertyType> lhsKnot;
                lhsKnot = leftObject.getKnot();
                List<KnotPropertyType> rhsKnot;
                rhsKnot = rightObject.getKnot();
                target.unsetKnot();
                List<KnotPropertyType> uniqueKnotl = target.getKnot();
                uniqueKnotl.addAll(((List<KnotPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "knot", lhsKnot), LocatorUtils.property(rightLocator, "knot", rhsKnot), lhsKnot, rhsKnot)));
            }
            {
                CurveInterpolationType lhsInterpolation;
                lhsInterpolation = leftObject.getInterpolation();
                CurveInterpolationType rhsInterpolation;
                rhsInterpolation = rightObject.getInterpolation();
                target.setInterpolation(((CurveInterpolationType) strategy.merge(LocatorUtils.property(leftLocator, "interpolation", lhsInterpolation), LocatorUtils.property(rightLocator, "interpolation", rhsInterpolation), lhsInterpolation, rhsInterpolation)));
            }
            {
                boolean lhsIsPolynomial;
                lhsIsPolynomial = leftObject.isIsPolynomial();
                boolean rhsIsPolynomial;
                rhsIsPolynomial = rightObject.isIsPolynomial();
                target.setIsPolynomial(((boolean) strategy.merge(LocatorUtils.property(leftLocator, "isPolynomial", lhsIsPolynomial), LocatorUtils.property(rightLocator, "isPolynomial", rhsIsPolynomial), lhsIsPolynomial, rhsIsPolynomial)));
            }
            {
                KnotTypesType lhsKnotType;
                lhsKnotType = leftObject.getKnotType();
                KnotTypesType rhsKnotType;
                rhsKnotType = rightObject.getKnotType();
                target.setKnotType(((KnotTypesType) strategy.merge(LocatorUtils.property(leftLocator, "knotType", lhsKnotType), LocatorUtils.property(rightLocator, "knotType", rhsKnotType), lhsKnotType, rhsKnotType)));
            }
        }
    }

    public void setPosOrPointPropertyOrPointRep(List<JAXBElement<?>> value) {
        List<JAXBElement<?>> draftl = this.getPosOrPointPropertyOrPointRep();
        draftl.addAll(value);
    }

    public void setKnot(List<KnotPropertyType> value) {
        List<KnotPropertyType> draftl = this.getKnot();
        draftl.addAll(value);
    }

}
