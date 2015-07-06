//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java-Klasse für ArcByCenterPointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArcByCenterPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinates"/>
 *         &lt;/choice>
 *         &lt;element name="radius" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         &lt;element name="startAngle" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="endAngle" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="circularArcCenterPointWithRadius" />
 *       &lt;attribute name="numArc" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArcByCenterPointType", propOrder = {
    "pos",
    "pointProperty",
    "pointRep",
    "posList",
    "coordinates",
    "radius",
    "startAngle",
    "endAngle"
})
@XmlSeeAlso({
    CircleByCenterPointType.class
})
public class ArcByCenterPointType
    extends AbstractCurveSegmentType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected DirectPositionType pos;
    protected PointPropertyType pointProperty;
    protected PointPropertyType pointRep;
    protected DirectPositionListType posList;
    protected CoordinatesType coordinates;
    @XmlElement(required = true)
    protected LengthType radius;
    protected AngleType startAngle;
    protected AngleType endAngle;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "interpolation")
    public final static CurveInterpolationType INTERPOLATION = CurveInterpolationType.CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "numArc", required = true)
    public final static BigInteger NUM_ARC = new BigInteger("1");

    /**
     * Ruft den Wert der pos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getPos() {
        return pos;
    }

    /**
     * Legt den Wert der pos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setPos(DirectPositionType value) {
        this.pos = value;
    }

    public boolean isSetPos() {
        return (this.pos!= null);
    }

    /**
     * Ruft den Wert der pointProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointProperty() {
        return pointProperty;
    }

    /**
     * Legt den Wert der pointProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPointProperty(PointPropertyType value) {
        this.pointProperty = value;
    }

    public boolean isSetPointProperty() {
        return (this.pointProperty!= null);
    }

    /**
     * Ruft den Wert der pointRep-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointRep() {
        return pointRep;
    }

    /**
     * Legt den Wert der pointRep-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPointRep(PointPropertyType value) {
        this.pointRep = value;
    }

    public boolean isSetPointRep() {
        return (this.pointRep!= null);
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
     * Ruft den Wert der radius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRadius() {
        return radius;
    }

    /**
     * Legt den Wert der radius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRadius(LengthType value) {
        this.radius = value;
    }

    public boolean isSetRadius() {
        return (this.radius!= null);
    }

    /**
     * Ruft den Wert der startAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getStartAngle() {
        return startAngle;
    }

    /**
     * Legt den Wert der startAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setStartAngle(AngleType value) {
        this.startAngle = value;
    }

    public boolean isSetStartAngle() {
        return (this.startAngle!= null);
    }

    /**
     * Ruft den Wert der endAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getEndAngle() {
        return endAngle;
    }

    /**
     * Legt den Wert der endAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setEndAngle(AngleType value) {
        this.endAngle = value;
    }

    public boolean isSetEndAngle() {
        return (this.endAngle!= null);
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
            DirectPositionType thePos;
            thePos = this.getPos();
            strategy.appendField(locator, this, "pos", buffer, thePos);
        }
        {
            PointPropertyType thePointProperty;
            thePointProperty = this.getPointProperty();
            strategy.appendField(locator, this, "pointProperty", buffer, thePointProperty);
        }
        {
            PointPropertyType thePointRep;
            thePointRep = this.getPointRep();
            strategy.appendField(locator, this, "pointRep", buffer, thePointRep);
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
            LengthType theRadius;
            theRadius = this.getRadius();
            strategy.appendField(locator, this, "radius", buffer, theRadius);
        }
        {
            AngleType theStartAngle;
            theStartAngle = this.getStartAngle();
            strategy.appendField(locator, this, "startAngle", buffer, theStartAngle);
        }
        {
            AngleType theEndAngle;
            theEndAngle = this.getEndAngle();
            strategy.appendField(locator, this, "endAngle", buffer, theEndAngle);
        }
        {
            CurveInterpolationType theINTERPOLATION;
            theINTERPOLATION = ArcByCenterPointType.INTERPOLATION;
            strategy.appendField(locator, this, "interpolation", buffer, theINTERPOLATION);
        }
        {
            BigInteger theNUM_ARC;
            theNUM_ARC = ArcByCenterPointType.NUM_ARC;
            strategy.appendField(locator, this, "numARC", buffer, theNUM_ARC);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArcByCenterPointType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ArcByCenterPointType that = ((ArcByCenterPointType) object);
        {
            DirectPositionType lhsPos;
            lhsPos = this.getPos();
            DirectPositionType rhsPos;
            rhsPos = that.getPos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pos", lhsPos), LocatorUtils.property(thatLocator, "pos", rhsPos), lhsPos, rhsPos)) {
                return false;
            }
        }
        {
            PointPropertyType lhsPointProperty;
            lhsPointProperty = this.getPointProperty();
            PointPropertyType rhsPointProperty;
            rhsPointProperty = that.getPointProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pointProperty", lhsPointProperty), LocatorUtils.property(thatLocator, "pointProperty", rhsPointProperty), lhsPointProperty, rhsPointProperty)) {
                return false;
            }
        }
        {
            PointPropertyType lhsPointRep;
            lhsPointRep = this.getPointRep();
            PointPropertyType rhsPointRep;
            rhsPointRep = that.getPointRep();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pointRep", lhsPointRep), LocatorUtils.property(thatLocator, "pointRep", rhsPointRep), lhsPointRep, rhsPointRep)) {
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
            LengthType lhsRadius;
            lhsRadius = this.getRadius();
            LengthType rhsRadius;
            rhsRadius = that.getRadius();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "radius", lhsRadius), LocatorUtils.property(thatLocator, "radius", rhsRadius), lhsRadius, rhsRadius)) {
                return false;
            }
        }
        {
            AngleType lhsStartAngle;
            lhsStartAngle = this.getStartAngle();
            AngleType rhsStartAngle;
            rhsStartAngle = that.getStartAngle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startAngle", lhsStartAngle), LocatorUtils.property(thatLocator, "startAngle", rhsStartAngle), lhsStartAngle, rhsStartAngle)) {
                return false;
            }
        }
        {
            AngleType lhsEndAngle;
            lhsEndAngle = this.getEndAngle();
            AngleType rhsEndAngle;
            rhsEndAngle = that.getEndAngle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endAngle", lhsEndAngle), LocatorUtils.property(thatLocator, "endAngle", rhsEndAngle), lhsEndAngle, rhsEndAngle)) {
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
            DirectPositionType thePos;
            thePos = this.getPos();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pos", thePos), currentHashCode, thePos);
        }
        {
            PointPropertyType thePointProperty;
            thePointProperty = this.getPointProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pointProperty", thePointProperty), currentHashCode, thePointProperty);
        }
        {
            PointPropertyType thePointRep;
            thePointRep = this.getPointRep();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pointRep", thePointRep), currentHashCode, thePointRep);
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
            LengthType theRadius;
            theRadius = this.getRadius();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "radius", theRadius), currentHashCode, theRadius);
        }
        {
            AngleType theStartAngle;
            theStartAngle = this.getStartAngle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startAngle", theStartAngle), currentHashCode, theStartAngle);
        }
        {
            AngleType theEndAngle;
            theEndAngle = this.getEndAngle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endAngle", theEndAngle), currentHashCode, theEndAngle);
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
        if (draftCopy instanceof ArcByCenterPointType) {
            final ArcByCenterPointType copy = ((ArcByCenterPointType) draftCopy);
            if (this.isSetPos()) {
                DirectPositionType sourcePos;
                sourcePos = this.getPos();
                DirectPositionType copyPos = ((DirectPositionType) strategy.copy(LocatorUtils.property(locator, "pos", sourcePos), sourcePos));
                copy.setPos(copyPos);
            } else {
                copy.pos = null;
            }
            if (this.isSetPointProperty()) {
                PointPropertyType sourcePointProperty;
                sourcePointProperty = this.getPointProperty();
                PointPropertyType copyPointProperty = ((PointPropertyType) strategy.copy(LocatorUtils.property(locator, "pointProperty", sourcePointProperty), sourcePointProperty));
                copy.setPointProperty(copyPointProperty);
            } else {
                copy.pointProperty = null;
            }
            if (this.isSetPointRep()) {
                PointPropertyType sourcePointRep;
                sourcePointRep = this.getPointRep();
                PointPropertyType copyPointRep = ((PointPropertyType) strategy.copy(LocatorUtils.property(locator, "pointRep", sourcePointRep), sourcePointRep));
                copy.setPointRep(copyPointRep);
            } else {
                copy.pointRep = null;
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
            if (this.isSetRadius()) {
                LengthType sourceRadius;
                sourceRadius = this.getRadius();
                LengthType copyRadius = ((LengthType) strategy.copy(LocatorUtils.property(locator, "radius", sourceRadius), sourceRadius));
                copy.setRadius(copyRadius);
            } else {
                copy.radius = null;
            }
            if (this.isSetStartAngle()) {
                AngleType sourceStartAngle;
                sourceStartAngle = this.getStartAngle();
                AngleType copyStartAngle = ((AngleType) strategy.copy(LocatorUtils.property(locator, "startAngle", sourceStartAngle), sourceStartAngle));
                copy.setStartAngle(copyStartAngle);
            } else {
                copy.startAngle = null;
            }
            if (this.isSetEndAngle()) {
                AngleType sourceEndAngle;
                sourceEndAngle = this.getEndAngle();
                AngleType copyEndAngle = ((AngleType) strategy.copy(LocatorUtils.property(locator, "endAngle", sourceEndAngle), sourceEndAngle));
                copy.setEndAngle(copyEndAngle);
            } else {
                copy.endAngle = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ArcByCenterPointType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ArcByCenterPointType) {
            final ArcByCenterPointType target = this;
            final ArcByCenterPointType leftObject = ((ArcByCenterPointType) left);
            final ArcByCenterPointType rightObject = ((ArcByCenterPointType) right);
            {
                DirectPositionType lhsPos;
                lhsPos = leftObject.getPos();
                DirectPositionType rhsPos;
                rhsPos = rightObject.getPos();
                target.setPos(((DirectPositionType) strategy.merge(LocatorUtils.property(leftLocator, "pos", lhsPos), LocatorUtils.property(rightLocator, "pos", rhsPos), lhsPos, rhsPos)));
            }
            {
                PointPropertyType lhsPointProperty;
                lhsPointProperty = leftObject.getPointProperty();
                PointPropertyType rhsPointProperty;
                rhsPointProperty = rightObject.getPointProperty();
                target.setPointProperty(((PointPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "pointProperty", lhsPointProperty), LocatorUtils.property(rightLocator, "pointProperty", rhsPointProperty), lhsPointProperty, rhsPointProperty)));
            }
            {
                PointPropertyType lhsPointRep;
                lhsPointRep = leftObject.getPointRep();
                PointPropertyType rhsPointRep;
                rhsPointRep = rightObject.getPointRep();
                target.setPointRep(((PointPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "pointRep", lhsPointRep), LocatorUtils.property(rightLocator, "pointRep", rhsPointRep), lhsPointRep, rhsPointRep)));
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
                LengthType lhsRadius;
                lhsRadius = leftObject.getRadius();
                LengthType rhsRadius;
                rhsRadius = rightObject.getRadius();
                target.setRadius(((LengthType) strategy.merge(LocatorUtils.property(leftLocator, "radius", lhsRadius), LocatorUtils.property(rightLocator, "radius", rhsRadius), lhsRadius, rhsRadius)));
            }
            {
                AngleType lhsStartAngle;
                lhsStartAngle = leftObject.getStartAngle();
                AngleType rhsStartAngle;
                rhsStartAngle = rightObject.getStartAngle();
                target.setStartAngle(((AngleType) strategy.merge(LocatorUtils.property(leftLocator, "startAngle", lhsStartAngle), LocatorUtils.property(rightLocator, "startAngle", rhsStartAngle), lhsStartAngle, rhsStartAngle)));
            }
            {
                AngleType lhsEndAngle;
                lhsEndAngle = leftObject.getEndAngle();
                AngleType rhsEndAngle;
                rhsEndAngle = rightObject.getEndAngle();
                target.setEndAngle(((AngleType) strategy.merge(LocatorUtils.property(leftLocator, "endAngle", lhsEndAngle), LocatorUtils.property(rightLocator, "endAngle", rhsEndAngle), lhsEndAngle, rhsEndAngle)));
            }
        }
    }

}
