//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * A container for an array of curves. The elements are always contained in the array property, referencing geometry elements or arrays of geometry elements via XLinks is not supported.
 * 
 * <p>Java-Klasse für CurveArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CurveArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractCurve"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveArrayPropertyType", propOrder = {
    "abstractCurve"
})
public class CurveArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "AbstractCurve", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractCurveType>> abstractCurve;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractCurve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractCurve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractCurve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractCurveType>> getAbstractCurve() {
        if (abstractCurve == null) {
            abstractCurve = new ArrayList<JAXBElement<? extends AbstractCurveType>>();
        }
        return this.abstractCurve;
    }

    public boolean isSetAbstractCurve() {
        return ((this.abstractCurve!= null)&&(!this.abstractCurve.isEmpty()));
    }

    public void unsetAbstractCurve() {
        this.abstractCurve = null;
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
            List<JAXBElement<? extends AbstractCurveType>> theAbstractCurve;
            theAbstractCurve = this.getAbstractCurve();
            strategy.appendField(locator, this, "abstractCurve", buffer, theAbstractCurve);
        }
        {
            boolean theOwns;
            theOwns = this.isOwns();
            strategy.appendField(locator, this, "owns", buffer, theOwns);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CurveArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CurveArrayPropertyType that = ((CurveArrayPropertyType) object);
        {
            List<JAXBElement<? extends AbstractCurveType>> lhsAbstractCurve;
            lhsAbstractCurve = this.getAbstractCurve();
            List<JAXBElement<? extends AbstractCurveType>> rhsAbstractCurve;
            rhsAbstractCurve = that.getAbstractCurve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstractCurve", lhsAbstractCurve), LocatorUtils.property(thatLocator, "abstractCurve", rhsAbstractCurve), lhsAbstractCurve, rhsAbstractCurve)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<JAXBElement<? extends AbstractCurveType>> theAbstractCurve;
            theAbstractCurve = this.getAbstractCurve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abstractCurve", theAbstractCurve), currentHashCode, theAbstractCurve);
        }
        {
            boolean theOwns;
            theOwns = this.isOwns();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owns", theOwns), currentHashCode, theOwns);
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
        if (draftCopy instanceof CurveArrayPropertyType) {
            final CurveArrayPropertyType copy = ((CurveArrayPropertyType) draftCopy);
            if (this.isSetAbstractCurve()) {
                List<JAXBElement<? extends AbstractCurveType>> sourceAbstractCurve;
                sourceAbstractCurve = this.getAbstractCurve();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractCurveType>> copyAbstractCurve = ((List<JAXBElement<? extends AbstractCurveType>> ) strategy.copy(LocatorUtils.property(locator, "abstractCurve", sourceAbstractCurve), sourceAbstractCurve));
                copy.unsetAbstractCurve();
                List<JAXBElement<? extends AbstractCurveType>> uniqueAbstractCurvel = copy.getAbstractCurve();
                uniqueAbstractCurvel.addAll(copyAbstractCurve);
            } else {
                copy.unsetAbstractCurve();
            }
            if (this.isSetOwns()) {
                boolean sourceOwns;
                sourceOwns = this.isOwns();
                boolean copyOwns = strategy.copy(LocatorUtils.property(locator, "owns", sourceOwns), sourceOwns);
                copy.setOwns(copyOwns);
            } else {
                copy.unsetOwns();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CurveArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof CurveArrayPropertyType) {
            final CurveArrayPropertyType target = this;
            final CurveArrayPropertyType leftObject = ((CurveArrayPropertyType) left);
            final CurveArrayPropertyType rightObject = ((CurveArrayPropertyType) right);
            {
                List<JAXBElement<? extends AbstractCurveType>> lhsAbstractCurve;
                lhsAbstractCurve = leftObject.getAbstractCurve();
                List<JAXBElement<? extends AbstractCurveType>> rhsAbstractCurve;
                rhsAbstractCurve = rightObject.getAbstractCurve();
                target.unsetAbstractCurve();
                List<JAXBElement<? extends AbstractCurveType>> uniqueAbstractCurvel = target.getAbstractCurve();
                uniqueAbstractCurvel.addAll(((List<JAXBElement<? extends AbstractCurveType>> ) strategy.merge(LocatorUtils.property(leftLocator, "abstractCurve", lhsAbstractCurve), LocatorUtils.property(rightLocator, "abstractCurve", rhsAbstractCurve), lhsAbstractCurve, rhsAbstractCurve)));
            }
            {
                boolean lhsOwns;
                lhsOwns = leftObject.isOwns();
                boolean rhsOwns;
                rhsOwns = rightObject.isOwns();
                target.setOwns(((boolean) strategy.merge(LocatorUtils.property(leftLocator, "owns", lhsOwns), LocatorUtils.property(rightLocator, "owns", rhsOwns), lhsOwns, rhsOwns)));
            }
        }
    }

    public void setAbstractCurve(List<JAXBElement<? extends AbstractCurveType>> value) {
        List<JAXBElement<? extends AbstractCurveType>> draftl = this.getAbstractCurve();
        draftl.addAll(value);
    }

}
