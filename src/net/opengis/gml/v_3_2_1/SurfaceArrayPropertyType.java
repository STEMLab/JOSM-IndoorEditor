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
 * gml:SurfaceArrayPropertyType is a container for an array of surfaces. The elements are always contained in the array property, referencing geometry elements or arrays of geometry elements via XLinks is not supported.
 * 
 * <p>Java-Klasse für SurfaceArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SurfaceArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractSurface"/>
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
@XmlType(name = "SurfaceArrayPropertyType", propOrder = {
    "abstractSurface"
})
public class SurfaceArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "AbstractSurface", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractSurfaceType>> abstractSurface;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link TinType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractSurfaceType>> getAbstractSurface() {
        if (abstractSurface == null) {
            abstractSurface = new ArrayList<JAXBElement<? extends AbstractSurfaceType>>();
        }
        return this.abstractSurface;
    }

    public boolean isSetAbstractSurface() {
        return ((this.abstractSurface!= null)&&(!this.abstractSurface.isEmpty()));
    }

    public void unsetAbstractSurface() {
        this.abstractSurface = null;
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
            List<JAXBElement<? extends AbstractSurfaceType>> theAbstractSurface;
            theAbstractSurface = this.getAbstractSurface();
            strategy.appendField(locator, this, "abstractSurface", buffer, theAbstractSurface);
        }
        {
            boolean theOwns;
            theOwns = this.isOwns();
            strategy.appendField(locator, this, "owns", buffer, theOwns);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SurfaceArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SurfaceArrayPropertyType that = ((SurfaceArrayPropertyType) object);
        {
            List<JAXBElement<? extends AbstractSurfaceType>> lhsAbstractSurface;
            lhsAbstractSurface = this.getAbstractSurface();
            List<JAXBElement<? extends AbstractSurfaceType>> rhsAbstractSurface;
            rhsAbstractSurface = that.getAbstractSurface();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstractSurface", lhsAbstractSurface), LocatorUtils.property(thatLocator, "abstractSurface", rhsAbstractSurface), lhsAbstractSurface, rhsAbstractSurface)) {
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
            List<JAXBElement<? extends AbstractSurfaceType>> theAbstractSurface;
            theAbstractSurface = this.getAbstractSurface();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abstractSurface", theAbstractSurface), currentHashCode, theAbstractSurface);
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
        if (draftCopy instanceof SurfaceArrayPropertyType) {
            final SurfaceArrayPropertyType copy = ((SurfaceArrayPropertyType) draftCopy);
            if (this.isSetAbstractSurface()) {
                List<JAXBElement<? extends AbstractSurfaceType>> sourceAbstractSurface;
                sourceAbstractSurface = this.getAbstractSurface();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractSurfaceType>> copyAbstractSurface = ((List<JAXBElement<? extends AbstractSurfaceType>> ) strategy.copy(LocatorUtils.property(locator, "abstractSurface", sourceAbstractSurface), sourceAbstractSurface));
                copy.unsetAbstractSurface();
                List<JAXBElement<? extends AbstractSurfaceType>> uniqueAbstractSurfacel = copy.getAbstractSurface();
                uniqueAbstractSurfacel.addAll(copyAbstractSurface);
            } else {
                copy.unsetAbstractSurface();
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
        return new SurfaceArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof SurfaceArrayPropertyType) {
            final SurfaceArrayPropertyType target = this;
            final SurfaceArrayPropertyType leftObject = ((SurfaceArrayPropertyType) left);
            final SurfaceArrayPropertyType rightObject = ((SurfaceArrayPropertyType) right);
            {
                List<JAXBElement<? extends AbstractSurfaceType>> lhsAbstractSurface;
                lhsAbstractSurface = leftObject.getAbstractSurface();
                List<JAXBElement<? extends AbstractSurfaceType>> rhsAbstractSurface;
                rhsAbstractSurface = rightObject.getAbstractSurface();
                target.unsetAbstractSurface();
                List<JAXBElement<? extends AbstractSurfaceType>> uniqueAbstractSurfacel = target.getAbstractSurface();
                uniqueAbstractSurfacel.addAll(((List<JAXBElement<? extends AbstractSurfaceType>> ) strategy.merge(LocatorUtils.property(leftLocator, "abstractSurface", lhsAbstractSurface), LocatorUtils.property(rightLocator, "abstractSurface", rhsAbstractSurface), lhsAbstractSurface, rhsAbstractSurface)));
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

    public void setAbstractSurface(List<JAXBElement<? extends AbstractSurfaceType>> value) {
        List<JAXBElement<? extends AbstractSurfaceType>> draftl = this.getAbstractSurface();
        draftl.addAll(value);
    }

}
