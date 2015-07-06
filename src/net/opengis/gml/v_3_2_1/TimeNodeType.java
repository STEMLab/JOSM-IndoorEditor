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
 * <p>Java-Klasse für TimeNodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeNodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimeTopologyPrimitiveType">
 *       &lt;sequence>
 *         &lt;element name="previousEdge" type="{http://www.opengis.net/gml/3.2}TimeEdgePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nextEdge" type="{http://www.opengis.net/gml/3.2}TimeEdgePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeNodeType", propOrder = {
    "previousEdge",
    "nextEdge",
    "position"
})
public class TimeNodeType
    extends AbstractTimeTopologyPrimitiveType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<TimeEdgePropertyType> previousEdge;
    protected List<TimeEdgePropertyType> nextEdge;
    protected TimeInstantPropertyType position;

    /**
     * Gets the value of the previousEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeEdgePropertyType }
     * 
     * 
     */
    public List<TimeEdgePropertyType> getPreviousEdge() {
        if (previousEdge == null) {
            previousEdge = new ArrayList<TimeEdgePropertyType>();
        }
        return this.previousEdge;
    }

    public boolean isSetPreviousEdge() {
        return ((this.previousEdge!= null)&&(!this.previousEdge.isEmpty()));
    }

    public void unsetPreviousEdge() {
        this.previousEdge = null;
    }

    /**
     * Gets the value of the nextEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeEdgePropertyType }
     * 
     * 
     */
    public List<TimeEdgePropertyType> getNextEdge() {
        if (nextEdge == null) {
            nextEdge = new ArrayList<TimeEdgePropertyType>();
        }
        return this.nextEdge;
    }

    public boolean isSetNextEdge() {
        return ((this.nextEdge!= null)&&(!this.nextEdge.isEmpty()));
    }

    public void unsetNextEdge() {
        this.nextEdge = null;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setPosition(TimeInstantPropertyType value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return (this.position!= null);
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
            List<TimeEdgePropertyType> thePreviousEdge;
            thePreviousEdge = this.getPreviousEdge();
            strategy.appendField(locator, this, "previousEdge", buffer, thePreviousEdge);
        }
        {
            List<TimeEdgePropertyType> theNextEdge;
            theNextEdge = this.getNextEdge();
            strategy.appendField(locator, this, "nextEdge", buffer, theNextEdge);
        }
        {
            TimeInstantPropertyType thePosition;
            thePosition = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, thePosition);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeNodeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimeNodeType that = ((TimeNodeType) object);
        {
            List<TimeEdgePropertyType> lhsPreviousEdge;
            lhsPreviousEdge = this.getPreviousEdge();
            List<TimeEdgePropertyType> rhsPreviousEdge;
            rhsPreviousEdge = that.getPreviousEdge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousEdge", lhsPreviousEdge), LocatorUtils.property(thatLocator, "previousEdge", rhsPreviousEdge), lhsPreviousEdge, rhsPreviousEdge)) {
                return false;
            }
        }
        {
            List<TimeEdgePropertyType> lhsNextEdge;
            lhsNextEdge = this.getNextEdge();
            List<TimeEdgePropertyType> rhsNextEdge;
            rhsNextEdge = that.getNextEdge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nextEdge", lhsNextEdge), LocatorUtils.property(thatLocator, "nextEdge", rhsNextEdge), lhsNextEdge, rhsNextEdge)) {
                return false;
            }
        }
        {
            TimeInstantPropertyType lhsPosition;
            lhsPosition = this.getPosition();
            TimeInstantPropertyType rhsPosition;
            rhsPosition = that.getPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "position", lhsPosition), LocatorUtils.property(thatLocator, "position", rhsPosition), lhsPosition, rhsPosition)) {
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
            List<TimeEdgePropertyType> thePreviousEdge;
            thePreviousEdge = this.getPreviousEdge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousEdge", thePreviousEdge), currentHashCode, thePreviousEdge);
        }
        {
            List<TimeEdgePropertyType> theNextEdge;
            theNextEdge = this.getNextEdge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nextEdge", theNextEdge), currentHashCode, theNextEdge);
        }
        {
            TimeInstantPropertyType thePosition;
            thePosition = this.getPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "position", thePosition), currentHashCode, thePosition);
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
        if (draftCopy instanceof TimeNodeType) {
            final TimeNodeType copy = ((TimeNodeType) draftCopy);
            if (this.isSetPreviousEdge()) {
                List<TimeEdgePropertyType> sourcePreviousEdge;
                sourcePreviousEdge = this.getPreviousEdge();
                @SuppressWarnings("unchecked")
                List<TimeEdgePropertyType> copyPreviousEdge = ((List<TimeEdgePropertyType> ) strategy.copy(LocatorUtils.property(locator, "previousEdge", sourcePreviousEdge), sourcePreviousEdge));
                copy.unsetPreviousEdge();
                List<TimeEdgePropertyType> uniquePreviousEdgel = copy.getPreviousEdge();
                uniquePreviousEdgel.addAll(copyPreviousEdge);
            } else {
                copy.unsetPreviousEdge();
            }
            if (this.isSetNextEdge()) {
                List<TimeEdgePropertyType> sourceNextEdge;
                sourceNextEdge = this.getNextEdge();
                @SuppressWarnings("unchecked")
                List<TimeEdgePropertyType> copyNextEdge = ((List<TimeEdgePropertyType> ) strategy.copy(LocatorUtils.property(locator, "nextEdge", sourceNextEdge), sourceNextEdge));
                copy.unsetNextEdge();
                List<TimeEdgePropertyType> uniqueNextEdgel = copy.getNextEdge();
                uniqueNextEdgel.addAll(copyNextEdge);
            } else {
                copy.unsetNextEdge();
            }
            if (this.isSetPosition()) {
                TimeInstantPropertyType sourcePosition;
                sourcePosition = this.getPosition();
                TimeInstantPropertyType copyPosition = ((TimeInstantPropertyType) strategy.copy(LocatorUtils.property(locator, "position", sourcePosition), sourcePosition));
                copy.setPosition(copyPosition);
            } else {
                copy.position = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimeNodeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TimeNodeType) {
            final TimeNodeType target = this;
            final TimeNodeType leftObject = ((TimeNodeType) left);
            final TimeNodeType rightObject = ((TimeNodeType) right);
            {
                List<TimeEdgePropertyType> lhsPreviousEdge;
                lhsPreviousEdge = leftObject.getPreviousEdge();
                List<TimeEdgePropertyType> rhsPreviousEdge;
                rhsPreviousEdge = rightObject.getPreviousEdge();
                target.unsetPreviousEdge();
                List<TimeEdgePropertyType> uniquePreviousEdgel = target.getPreviousEdge();
                uniquePreviousEdgel.addAll(((List<TimeEdgePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "previousEdge", lhsPreviousEdge), LocatorUtils.property(rightLocator, "previousEdge", rhsPreviousEdge), lhsPreviousEdge, rhsPreviousEdge)));
            }
            {
                List<TimeEdgePropertyType> lhsNextEdge;
                lhsNextEdge = leftObject.getNextEdge();
                List<TimeEdgePropertyType> rhsNextEdge;
                rhsNextEdge = rightObject.getNextEdge();
                target.unsetNextEdge();
                List<TimeEdgePropertyType> uniqueNextEdgel = target.getNextEdge();
                uniqueNextEdgel.addAll(((List<TimeEdgePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "nextEdge", lhsNextEdge), LocatorUtils.property(rightLocator, "nextEdge", rhsNextEdge), lhsNextEdge, rhsNextEdge)));
            }
            {
                TimeInstantPropertyType lhsPosition;
                lhsPosition = leftObject.getPosition();
                TimeInstantPropertyType rhsPosition;
                rhsPosition = rightObject.getPosition();
                target.setPosition(((TimeInstantPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "position", lhsPosition), LocatorUtils.property(rightLocator, "position", rhsPosition), lhsPosition, rhsPosition)));
            }
        }
    }

    public void setPreviousEdge(List<TimeEdgePropertyType> value) {
        List<TimeEdgePropertyType> draftl = this.getPreviousEdge();
        draftl.addAll(value);
    }

    public void setNextEdge(List<TimeEdgePropertyType> value) {
        List<TimeEdgePropertyType> draftl = this.getNextEdge();
        draftl.addAll(value);
    }

}
