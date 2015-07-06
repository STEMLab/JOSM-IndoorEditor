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
 * <p>Java-Klasse für AffinePlacementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AffinePlacementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.opengis.net/gml/3.2}DirectPositionType"/>
 *         &lt;element name="refDirection" type="{http://www.opengis.net/gml/3.2}VectorType" maxOccurs="unbounded"/>
 *         &lt;element name="inDimension" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="outDimension" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinePlacementType", propOrder = {
    "location",
    "refDirection",
    "inDimension",
    "outDimension"
})
public class AffinePlacementType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected DirectPositionType location;
    @XmlElement(required = true)
    protected List<VectorType> refDirection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger inDimension;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger outDimension;

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setLocation(DirectPositionType value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Gets the value of the refDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorType }
     * 
     * 
     */
    public List<VectorType> getRefDirection() {
        if (refDirection == null) {
            refDirection = new ArrayList<VectorType>();
        }
        return this.refDirection;
    }

    public boolean isSetRefDirection() {
        return ((this.refDirection!= null)&&(!this.refDirection.isEmpty()));
    }

    public void unsetRefDirection() {
        this.refDirection = null;
    }

    /**
     * Ruft den Wert der inDimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInDimension() {
        return inDimension;
    }

    /**
     * Legt den Wert der inDimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInDimension(BigInteger value) {
        this.inDimension = value;
    }

    public boolean isSetInDimension() {
        return (this.inDimension!= null);
    }

    /**
     * Ruft den Wert der outDimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutDimension() {
        return outDimension;
    }

    /**
     * Legt den Wert der outDimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutDimension(BigInteger value) {
        this.outDimension = value;
    }

    public boolean isSetOutDimension() {
        return (this.outDimension!= null);
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
            DirectPositionType theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            List<VectorType> theRefDirection;
            theRefDirection = this.getRefDirection();
            strategy.appendField(locator, this, "refDirection", buffer, theRefDirection);
        }
        {
            BigInteger theInDimension;
            theInDimension = this.getInDimension();
            strategy.appendField(locator, this, "inDimension", buffer, theInDimension);
        }
        {
            BigInteger theOutDimension;
            theOutDimension = this.getOutDimension();
            strategy.appendField(locator, this, "outDimension", buffer, theOutDimension);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AffinePlacementType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AffinePlacementType that = ((AffinePlacementType) object);
        {
            DirectPositionType lhsLocation;
            lhsLocation = this.getLocation();
            DirectPositionType rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                return false;
            }
        }
        {
            List<VectorType> lhsRefDirection;
            lhsRefDirection = this.getRefDirection();
            List<VectorType> rhsRefDirection;
            rhsRefDirection = that.getRefDirection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refDirection", lhsRefDirection), LocatorUtils.property(thatLocator, "refDirection", rhsRefDirection), lhsRefDirection, rhsRefDirection)) {
                return false;
            }
        }
        {
            BigInteger lhsInDimension;
            lhsInDimension = this.getInDimension();
            BigInteger rhsInDimension;
            rhsInDimension = that.getInDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inDimension", lhsInDimension), LocatorUtils.property(thatLocator, "inDimension", rhsInDimension), lhsInDimension, rhsInDimension)) {
                return false;
            }
        }
        {
            BigInteger lhsOutDimension;
            lhsOutDimension = this.getOutDimension();
            BigInteger rhsOutDimension;
            rhsOutDimension = that.getOutDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outDimension", lhsOutDimension), LocatorUtils.property(thatLocator, "outDimension", rhsOutDimension), lhsOutDimension, rhsOutDimension)) {
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
            DirectPositionType theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            List<VectorType> theRefDirection;
            theRefDirection = this.getRefDirection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refDirection", theRefDirection), currentHashCode, theRefDirection);
        }
        {
            BigInteger theInDimension;
            theInDimension = this.getInDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inDimension", theInDimension), currentHashCode, theInDimension);
        }
        {
            BigInteger theOutDimension;
            theOutDimension = this.getOutDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outDimension", theOutDimension), currentHashCode, theOutDimension);
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
        if (draftCopy instanceof AffinePlacementType) {
            final AffinePlacementType copy = ((AffinePlacementType) draftCopy);
            if (this.isSetLocation()) {
                DirectPositionType sourceLocation;
                sourceLocation = this.getLocation();
                DirectPositionType copyLocation = ((DirectPositionType) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation));
                copy.setLocation(copyLocation);
            } else {
                copy.location = null;
            }
            if (this.isSetRefDirection()) {
                List<VectorType> sourceRefDirection;
                sourceRefDirection = this.getRefDirection();
                @SuppressWarnings("unchecked")
                List<VectorType> copyRefDirection = ((List<VectorType> ) strategy.copy(LocatorUtils.property(locator, "refDirection", sourceRefDirection), sourceRefDirection));
                copy.unsetRefDirection();
                List<VectorType> uniqueRefDirectionl = copy.getRefDirection();
                uniqueRefDirectionl.addAll(copyRefDirection);
            } else {
                copy.unsetRefDirection();
            }
            if (this.isSetInDimension()) {
                BigInteger sourceInDimension;
                sourceInDimension = this.getInDimension();
                BigInteger copyInDimension = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "inDimension", sourceInDimension), sourceInDimension));
                copy.setInDimension(copyInDimension);
            } else {
                copy.inDimension = null;
            }
            if (this.isSetOutDimension()) {
                BigInteger sourceOutDimension;
                sourceOutDimension = this.getOutDimension();
                BigInteger copyOutDimension = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "outDimension", sourceOutDimension), sourceOutDimension));
                copy.setOutDimension(copyOutDimension);
            } else {
                copy.outDimension = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AffinePlacementType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof AffinePlacementType) {
            final AffinePlacementType target = this;
            final AffinePlacementType leftObject = ((AffinePlacementType) left);
            final AffinePlacementType rightObject = ((AffinePlacementType) right);
            {
                DirectPositionType lhsLocation;
                lhsLocation = leftObject.getLocation();
                DirectPositionType rhsLocation;
                rhsLocation = rightObject.getLocation();
                target.setLocation(((DirectPositionType) strategy.merge(LocatorUtils.property(leftLocator, "location", lhsLocation), LocatorUtils.property(rightLocator, "location", rhsLocation), lhsLocation, rhsLocation)));
            }
            {
                List<VectorType> lhsRefDirection;
                lhsRefDirection = leftObject.getRefDirection();
                List<VectorType> rhsRefDirection;
                rhsRefDirection = rightObject.getRefDirection();
                target.unsetRefDirection();
                List<VectorType> uniqueRefDirectionl = target.getRefDirection();
                uniqueRefDirectionl.addAll(((List<VectorType> ) strategy.merge(LocatorUtils.property(leftLocator, "refDirection", lhsRefDirection), LocatorUtils.property(rightLocator, "refDirection", rhsRefDirection), lhsRefDirection, rhsRefDirection)));
            }
            {
                BigInteger lhsInDimension;
                lhsInDimension = leftObject.getInDimension();
                BigInteger rhsInDimension;
                rhsInDimension = rightObject.getInDimension();
                target.setInDimension(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "inDimension", lhsInDimension), LocatorUtils.property(rightLocator, "inDimension", rhsInDimension), lhsInDimension, rhsInDimension)));
            }
            {
                BigInteger lhsOutDimension;
                lhsOutDimension = leftObject.getOutDimension();
                BigInteger rhsOutDimension;
                rhsOutDimension = rightObject.getOutDimension();
                target.setOutDimension(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "outDimension", lhsOutDimension), LocatorUtils.property(rightLocator, "outDimension", rhsOutDimension), lhsOutDimension, rhsOutDimension)));
            }
        }
    }

    public void setRefDirection(List<VectorType> value) {
        List<VectorType> draftl = this.getRefDirection();
        draftl.addAll(value);
    }

}
