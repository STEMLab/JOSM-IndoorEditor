//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java-Klasse für MovingObjectStatusType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MovingObjectStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimeSliceType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}locationName"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}locationReference"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}location"/>
 *         &lt;/choice>
 *         &lt;element name="speed" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/>
 *         &lt;element name="bearing" type="{http://www.opengis.net/gml/3.2}DirectionPropertyType" minOccurs="0"/>
 *         &lt;element name="acceleration" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/>
 *         &lt;element name="elevation" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}status" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}statusReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovingObjectStatusType", propOrder = {
    "position",
    "pos",
    "locationName",
    "locationReference",
    "location",
    "speed",
    "bearing",
    "acceleration",
    "elevation",
    "status",
    "statusReference"
})
public class MovingObjectStatusType
    extends AbstractTimeSliceType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected GeometryPropertyType position;
    protected DirectPositionType pos;
    protected CodeType locationName;
    protected ReferenceType locationReference;
    @XmlElementRef(name = "location", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends LocationPropertyType> location;
    protected MeasureType speed;
    protected DirectionPropertyType bearing;
    protected MeasureType acceleration;
    protected MeasureType elevation;
    protected StringOrRefType status;
    protected ReferenceType statusReference;

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setPosition(GeometryPropertyType value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return (this.position!= null);
    }

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
     * Ruft den Wert der locationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLocationName() {
        return locationName;
    }

    /**
     * Legt den Wert der locationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLocationName(CodeType value) {
        this.locationName = value;
    }

    public boolean isSetLocationName() {
        return (this.locationName!= null);
    }

    /**
     * Ruft den Wert der locationReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getLocationReference() {
        return locationReference;
    }

    /**
     * Legt den Wert der locationReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setLocationReference(ReferenceType value) {
        this.locationReference = value;
    }

    public boolean isSetLocationReference() {
        return (this.locationReference!= null);
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     
     */
    public JAXBElement<? extends LocationPropertyType> getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<? extends LocationPropertyType> value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpeed() {
        return speed;
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpeed(MeasureType value) {
        this.speed = value;
    }

    public boolean isSetSpeed() {
        return (this.speed!= null);
    }

    /**
     * Ruft den Wert der bearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionPropertyType }
     *     
     */
    public DirectionPropertyType getBearing() {
        return bearing;
    }

    /**
     * Legt den Wert der bearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionPropertyType }
     *     
     */
    public void setBearing(DirectionPropertyType value) {
        this.bearing = value;
    }

    public boolean isSetBearing() {
        return (this.bearing!= null);
    }

    /**
     * Ruft den Wert der acceleration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAcceleration() {
        return acceleration;
    }

    /**
     * Legt den Wert der acceleration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAcceleration(MeasureType value) {
        this.acceleration = value;
    }

    public boolean isSetAcceleration() {
        return (this.acceleration!= null);
    }

    /**
     * Ruft den Wert der elevation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getElevation() {
        return elevation;
    }

    /**
     * Legt den Wert der elevation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setElevation(MeasureType value) {
        this.elevation = value;
    }

    public boolean isSetElevation() {
        return (this.elevation!= null);
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setStatus(StringOrRefType value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Ruft den Wert der statusReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getStatusReference() {
        return statusReference;
    }

    /**
     * Legt den Wert der statusReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setStatusReference(ReferenceType value) {
        this.statusReference = value;
    }

    public boolean isSetStatusReference() {
        return (this.statusReference!= null);
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
            GeometryPropertyType thePosition;
            thePosition = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, thePosition);
        }
        {
            DirectPositionType thePos;
            thePos = this.getPos();
            strategy.appendField(locator, this, "pos", buffer, thePos);
        }
        {
            CodeType theLocationName;
            theLocationName = this.getLocationName();
            strategy.appendField(locator, this, "locationName", buffer, theLocationName);
        }
        {
            ReferenceType theLocationReference;
            theLocationReference = this.getLocationReference();
            strategy.appendField(locator, this, "locationReference", buffer, theLocationReference);
        }
        {
            JAXBElement<? extends LocationPropertyType> theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            MeasureType theSpeed;
            theSpeed = this.getSpeed();
            strategy.appendField(locator, this, "speed", buffer, theSpeed);
        }
        {
            DirectionPropertyType theBearing;
            theBearing = this.getBearing();
            strategy.appendField(locator, this, "bearing", buffer, theBearing);
        }
        {
            MeasureType theAcceleration;
            theAcceleration = this.getAcceleration();
            strategy.appendField(locator, this, "acceleration", buffer, theAcceleration);
        }
        {
            MeasureType theElevation;
            theElevation = this.getElevation();
            strategy.appendField(locator, this, "elevation", buffer, theElevation);
        }
        {
            StringOrRefType theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ReferenceType theStatusReference;
            theStatusReference = this.getStatusReference();
            strategy.appendField(locator, this, "statusReference", buffer, theStatusReference);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MovingObjectStatusType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MovingObjectStatusType that = ((MovingObjectStatusType) object);
        {
            GeometryPropertyType lhsPosition;
            lhsPosition = this.getPosition();
            GeometryPropertyType rhsPosition;
            rhsPosition = that.getPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "position", lhsPosition), LocatorUtils.property(thatLocator, "position", rhsPosition), lhsPosition, rhsPosition)) {
                return false;
            }
        }
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
            CodeType lhsLocationName;
            lhsLocationName = this.getLocationName();
            CodeType rhsLocationName;
            rhsLocationName = that.getLocationName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationName", lhsLocationName), LocatorUtils.property(thatLocator, "locationName", rhsLocationName), lhsLocationName, rhsLocationName)) {
                return false;
            }
        }
        {
            ReferenceType lhsLocationReference;
            lhsLocationReference = this.getLocationReference();
            ReferenceType rhsLocationReference;
            rhsLocationReference = that.getLocationReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationReference", lhsLocationReference), LocatorUtils.property(thatLocator, "locationReference", rhsLocationReference), lhsLocationReference, rhsLocationReference)) {
                return false;
            }
        }
        {
            JAXBElement<? extends LocationPropertyType> lhsLocation;
            lhsLocation = this.getLocation();
            JAXBElement<? extends LocationPropertyType> rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                return false;
            }
        }
        {
            MeasureType lhsSpeed;
            lhsSpeed = this.getSpeed();
            MeasureType rhsSpeed;
            rhsSpeed = that.getSpeed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "speed", lhsSpeed), LocatorUtils.property(thatLocator, "speed", rhsSpeed), lhsSpeed, rhsSpeed)) {
                return false;
            }
        }
        {
            DirectionPropertyType lhsBearing;
            lhsBearing = this.getBearing();
            DirectionPropertyType rhsBearing;
            rhsBearing = that.getBearing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bearing", lhsBearing), LocatorUtils.property(thatLocator, "bearing", rhsBearing), lhsBearing, rhsBearing)) {
                return false;
            }
        }
        {
            MeasureType lhsAcceleration;
            lhsAcceleration = this.getAcceleration();
            MeasureType rhsAcceleration;
            rhsAcceleration = that.getAcceleration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceleration", lhsAcceleration), LocatorUtils.property(thatLocator, "acceleration", rhsAcceleration), lhsAcceleration, rhsAcceleration)) {
                return false;
            }
        }
        {
            MeasureType lhsElevation;
            lhsElevation = this.getElevation();
            MeasureType rhsElevation;
            rhsElevation = that.getElevation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elevation", lhsElevation), LocatorUtils.property(thatLocator, "elevation", rhsElevation), lhsElevation, rhsElevation)) {
                return false;
            }
        }
        {
            StringOrRefType lhsStatus;
            lhsStatus = this.getStatus();
            StringOrRefType rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            ReferenceType lhsStatusReference;
            lhsStatusReference = this.getStatusReference();
            ReferenceType rhsStatusReference;
            rhsStatusReference = that.getStatusReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusReference", lhsStatusReference), LocatorUtils.property(thatLocator, "statusReference", rhsStatusReference), lhsStatusReference, rhsStatusReference)) {
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
            GeometryPropertyType thePosition;
            thePosition = this.getPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "position", thePosition), currentHashCode, thePosition);
        }
        {
            DirectPositionType thePos;
            thePos = this.getPos();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pos", thePos), currentHashCode, thePos);
        }
        {
            CodeType theLocationName;
            theLocationName = this.getLocationName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationName", theLocationName), currentHashCode, theLocationName);
        }
        {
            ReferenceType theLocationReference;
            theLocationReference = this.getLocationReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationReference", theLocationReference), currentHashCode, theLocationReference);
        }
        {
            JAXBElement<? extends LocationPropertyType> theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            MeasureType theSpeed;
            theSpeed = this.getSpeed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "speed", theSpeed), currentHashCode, theSpeed);
        }
        {
            DirectionPropertyType theBearing;
            theBearing = this.getBearing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bearing", theBearing), currentHashCode, theBearing);
        }
        {
            MeasureType theAcceleration;
            theAcceleration = this.getAcceleration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceleration", theAcceleration), currentHashCode, theAcceleration);
        }
        {
            MeasureType theElevation;
            theElevation = this.getElevation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "elevation", theElevation), currentHashCode, theElevation);
        }
        {
            StringOrRefType theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            ReferenceType theStatusReference;
            theStatusReference = this.getStatusReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusReference", theStatusReference), currentHashCode, theStatusReference);
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
        if (draftCopy instanceof MovingObjectStatusType) {
            final MovingObjectStatusType copy = ((MovingObjectStatusType) draftCopy);
            if (this.isSetPosition()) {
                GeometryPropertyType sourcePosition;
                sourcePosition = this.getPosition();
                GeometryPropertyType copyPosition = ((GeometryPropertyType) strategy.copy(LocatorUtils.property(locator, "position", sourcePosition), sourcePosition));
                copy.setPosition(copyPosition);
            } else {
                copy.position = null;
            }
            if (this.isSetPos()) {
                DirectPositionType sourcePos;
                sourcePos = this.getPos();
                DirectPositionType copyPos = ((DirectPositionType) strategy.copy(LocatorUtils.property(locator, "pos", sourcePos), sourcePos));
                copy.setPos(copyPos);
            } else {
                copy.pos = null;
            }
            if (this.isSetLocationName()) {
                CodeType sourceLocationName;
                sourceLocationName = this.getLocationName();
                CodeType copyLocationName = ((CodeType) strategy.copy(LocatorUtils.property(locator, "locationName", sourceLocationName), sourceLocationName));
                copy.setLocationName(copyLocationName);
            } else {
                copy.locationName = null;
            }
            if (this.isSetLocationReference()) {
                ReferenceType sourceLocationReference;
                sourceLocationReference = this.getLocationReference();
                ReferenceType copyLocationReference = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "locationReference", sourceLocationReference), sourceLocationReference));
                copy.setLocationReference(copyLocationReference);
            } else {
                copy.locationReference = null;
            }
            if (this.isSetLocation()) {
                JAXBElement<? extends LocationPropertyType> sourceLocation;
                sourceLocation = this.getLocation();
                @SuppressWarnings("unchecked")
                JAXBElement<? extends LocationPropertyType> copyLocation = ((JAXBElement<? extends LocationPropertyType> ) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation));
                copy.setLocation(copyLocation);
            } else {
                copy.location = null;
            }
            if (this.isSetSpeed()) {
                MeasureType sourceSpeed;
                sourceSpeed = this.getSpeed();
                MeasureType copySpeed = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "speed", sourceSpeed), sourceSpeed));
                copy.setSpeed(copySpeed);
            } else {
                copy.speed = null;
            }
            if (this.isSetBearing()) {
                DirectionPropertyType sourceBearing;
                sourceBearing = this.getBearing();
                DirectionPropertyType copyBearing = ((DirectionPropertyType) strategy.copy(LocatorUtils.property(locator, "bearing", sourceBearing), sourceBearing));
                copy.setBearing(copyBearing);
            } else {
                copy.bearing = null;
            }
            if (this.isSetAcceleration()) {
                MeasureType sourceAcceleration;
                sourceAcceleration = this.getAcceleration();
                MeasureType copyAcceleration = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "acceleration", sourceAcceleration), sourceAcceleration));
                copy.setAcceleration(copyAcceleration);
            } else {
                copy.acceleration = null;
            }
            if (this.isSetElevation()) {
                MeasureType sourceElevation;
                sourceElevation = this.getElevation();
                MeasureType copyElevation = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "elevation", sourceElevation), sourceElevation));
                copy.setElevation(copyElevation);
            } else {
                copy.elevation = null;
            }
            if (this.isSetStatus()) {
                StringOrRefType sourceStatus;
                sourceStatus = this.getStatus();
                StringOrRefType copyStatus = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus));
                copy.setStatus(copyStatus);
            } else {
                copy.status = null;
            }
            if (this.isSetStatusReference()) {
                ReferenceType sourceStatusReference;
                sourceStatusReference = this.getStatusReference();
                ReferenceType copyStatusReference = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "statusReference", sourceStatusReference), sourceStatusReference));
                copy.setStatusReference(copyStatusReference);
            } else {
                copy.statusReference = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MovingObjectStatusType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof MovingObjectStatusType) {
            final MovingObjectStatusType target = this;
            final MovingObjectStatusType leftObject = ((MovingObjectStatusType) left);
            final MovingObjectStatusType rightObject = ((MovingObjectStatusType) right);
            {
                GeometryPropertyType lhsPosition;
                lhsPosition = leftObject.getPosition();
                GeometryPropertyType rhsPosition;
                rhsPosition = rightObject.getPosition();
                target.setPosition(((GeometryPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "position", lhsPosition), LocatorUtils.property(rightLocator, "position", rhsPosition), lhsPosition, rhsPosition)));
            }
            {
                DirectPositionType lhsPos;
                lhsPos = leftObject.getPos();
                DirectPositionType rhsPos;
                rhsPos = rightObject.getPos();
                target.setPos(((DirectPositionType) strategy.merge(LocatorUtils.property(leftLocator, "pos", lhsPos), LocatorUtils.property(rightLocator, "pos", rhsPos), lhsPos, rhsPos)));
            }
            {
                CodeType lhsLocationName;
                lhsLocationName = leftObject.getLocationName();
                CodeType rhsLocationName;
                rhsLocationName = rightObject.getLocationName();
                target.setLocationName(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "locationName", lhsLocationName), LocatorUtils.property(rightLocator, "locationName", rhsLocationName), lhsLocationName, rhsLocationName)));
            }
            {
                ReferenceType lhsLocationReference;
                lhsLocationReference = leftObject.getLocationReference();
                ReferenceType rhsLocationReference;
                rhsLocationReference = rightObject.getLocationReference();
                target.setLocationReference(((ReferenceType) strategy.merge(LocatorUtils.property(leftLocator, "locationReference", lhsLocationReference), LocatorUtils.property(rightLocator, "locationReference", rhsLocationReference), lhsLocationReference, rhsLocationReference)));
            }
            {
                JAXBElement<? extends LocationPropertyType> lhsLocation;
                lhsLocation = leftObject.getLocation();
                JAXBElement<? extends LocationPropertyType> rhsLocation;
                rhsLocation = rightObject.getLocation();
                target.setLocation(((JAXBElement<? extends LocationPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "location", lhsLocation), LocatorUtils.property(rightLocator, "location", rhsLocation), lhsLocation, rhsLocation)));
            }
            {
                MeasureType lhsSpeed;
                lhsSpeed = leftObject.getSpeed();
                MeasureType rhsSpeed;
                rhsSpeed = rightObject.getSpeed();
                target.setSpeed(((MeasureType) strategy.merge(LocatorUtils.property(leftLocator, "speed", lhsSpeed), LocatorUtils.property(rightLocator, "speed", rhsSpeed), lhsSpeed, rhsSpeed)));
            }
            {
                DirectionPropertyType lhsBearing;
                lhsBearing = leftObject.getBearing();
                DirectionPropertyType rhsBearing;
                rhsBearing = rightObject.getBearing();
                target.setBearing(((DirectionPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "bearing", lhsBearing), LocatorUtils.property(rightLocator, "bearing", rhsBearing), lhsBearing, rhsBearing)));
            }
            {
                MeasureType lhsAcceleration;
                lhsAcceleration = leftObject.getAcceleration();
                MeasureType rhsAcceleration;
                rhsAcceleration = rightObject.getAcceleration();
                target.setAcceleration(((MeasureType) strategy.merge(LocatorUtils.property(leftLocator, "acceleration", lhsAcceleration), LocatorUtils.property(rightLocator, "acceleration", rhsAcceleration), lhsAcceleration, rhsAcceleration)));
            }
            {
                MeasureType lhsElevation;
                lhsElevation = leftObject.getElevation();
                MeasureType rhsElevation;
                rhsElevation = rightObject.getElevation();
                target.setElevation(((MeasureType) strategy.merge(LocatorUtils.property(leftLocator, "elevation", lhsElevation), LocatorUtils.property(rightLocator, "elevation", rhsElevation), lhsElevation, rhsElevation)));
            }
            {
                StringOrRefType lhsStatus;
                lhsStatus = leftObject.getStatus();
                StringOrRefType rhsStatus;
                rhsStatus = rightObject.getStatus();
                target.setStatus(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "status", lhsStatus), LocatorUtils.property(rightLocator, "status", rhsStatus), lhsStatus, rhsStatus)));
            }
            {
                ReferenceType lhsStatusReference;
                lhsStatusReference = leftObject.getStatusReference();
                ReferenceType rhsStatusReference;
                rhsStatusReference = rightObject.getStatusReference();
                target.setStatusReference(((ReferenceType) strategy.merge(LocatorUtils.property(leftLocator, "statusReference", lhsStatusReference), LocatorUtils.property(rightLocator, "statusReference", rhsStatusReference), lhsStatusReference, rhsStatusReference)));
            }
        }
    }

}
