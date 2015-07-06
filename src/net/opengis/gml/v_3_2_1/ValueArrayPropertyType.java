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
import javax.xml.bind.annotation.XmlElementRefs;
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
 * <p>Java-Klasse für ValueArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValueArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;group ref="{http://www.opengis.net/gml/3.2}Value"/>
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
@XmlType(name = "ValueArrayPropertyType", propOrder = {
    "abstractValueOrAbstractGeometryOrAbstractTimeObject"
})
public class ValueArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "Null", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class),
        @XmlElementRef(name = "AbstractGeometry", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class),
        @XmlElementRef(name = "AbstractValue", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class),
        @XmlElementRef(name = "AbstractTimeObject", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> abstractValueOrAbstractGeometryOrAbstractTimeObject;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractValueOrAbstractGeometryOrAbstractTimeObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractValueOrAbstractGeometryOrAbstractTimeObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractValueOrAbstractGeometryOrAbstractTimeObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeNodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.v_3_2_1.Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeInstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeEdgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link GridType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link CodeOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link SolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link Category }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link Quantity }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeTopologyComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link TinType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoryExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
     * {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimePeriodType }{@code >}
     * {@link JAXBElement }{@code <}{@link QuantityExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimePrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Count }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeTopologyPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractValueOrAbstractGeometryOrAbstractTimeObject() {
        if (abstractValueOrAbstractGeometryOrAbstractTimeObject == null) {
            abstractValueOrAbstractGeometryOrAbstractTimeObject = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractValueOrAbstractGeometryOrAbstractTimeObject;
    }

    public boolean isSetAbstractValueOrAbstractGeometryOrAbstractTimeObject() {
        return ((this.abstractValueOrAbstractGeometryOrAbstractTimeObject!= null)&&(!this.abstractValueOrAbstractGeometryOrAbstractTimeObject.isEmpty()));
    }

    public void unsetAbstractValueOrAbstractGeometryOrAbstractTimeObject() {
        this.abstractValueOrAbstractGeometryOrAbstractTimeObject = null;
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
            List<JAXBElement<?>> theAbstractValueOrAbstractGeometryOrAbstractTimeObject;
            theAbstractValueOrAbstractGeometryOrAbstractTimeObject = this.getAbstractValueOrAbstractGeometryOrAbstractTimeObject();
            strategy.appendField(locator, this, "abstractValueOrAbstractGeometryOrAbstractTimeObject", buffer, theAbstractValueOrAbstractGeometryOrAbstractTimeObject);
        }
        {
            boolean theOwns;
            theOwns = this.isOwns();
            strategy.appendField(locator, this, "owns", buffer, theOwns);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ValueArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ValueArrayPropertyType that = ((ValueArrayPropertyType) object);
        {
            List<JAXBElement<?>> lhsAbstractValueOrAbstractGeometryOrAbstractTimeObject;
            lhsAbstractValueOrAbstractGeometryOrAbstractTimeObject = this.getAbstractValueOrAbstractGeometryOrAbstractTimeObject();
            List<JAXBElement<?>> rhsAbstractValueOrAbstractGeometryOrAbstractTimeObject;
            rhsAbstractValueOrAbstractGeometryOrAbstractTimeObject = that.getAbstractValueOrAbstractGeometryOrAbstractTimeObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstractValueOrAbstractGeometryOrAbstractTimeObject", lhsAbstractValueOrAbstractGeometryOrAbstractTimeObject), LocatorUtils.property(thatLocator, "abstractValueOrAbstractGeometryOrAbstractTimeObject", rhsAbstractValueOrAbstractGeometryOrAbstractTimeObject), lhsAbstractValueOrAbstractGeometryOrAbstractTimeObject, rhsAbstractValueOrAbstractGeometryOrAbstractTimeObject)) {
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
            List<JAXBElement<?>> theAbstractValueOrAbstractGeometryOrAbstractTimeObject;
            theAbstractValueOrAbstractGeometryOrAbstractTimeObject = this.getAbstractValueOrAbstractGeometryOrAbstractTimeObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abstractValueOrAbstractGeometryOrAbstractTimeObject", theAbstractValueOrAbstractGeometryOrAbstractTimeObject), currentHashCode, theAbstractValueOrAbstractGeometryOrAbstractTimeObject);
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
        if (draftCopy instanceof ValueArrayPropertyType) {
            final ValueArrayPropertyType copy = ((ValueArrayPropertyType) draftCopy);
            if (this.isSetAbstractValueOrAbstractGeometryOrAbstractTimeObject()) {
                List<JAXBElement<?>> sourceAbstractValueOrAbstractGeometryOrAbstractTimeObject;
                sourceAbstractValueOrAbstractGeometryOrAbstractTimeObject = this.getAbstractValueOrAbstractGeometryOrAbstractTimeObject();
                @SuppressWarnings("unchecked")
                List<JAXBElement<?>> copyAbstractValueOrAbstractGeometryOrAbstractTimeObject = ((List<JAXBElement<?>> ) strategy.copy(LocatorUtils.property(locator, "abstractValueOrAbstractGeometryOrAbstractTimeObject", sourceAbstractValueOrAbstractGeometryOrAbstractTimeObject), sourceAbstractValueOrAbstractGeometryOrAbstractTimeObject));
                copy.unsetAbstractValueOrAbstractGeometryOrAbstractTimeObject();
                List<JAXBElement<?>> uniqueAbstractValueOrAbstractGeometryOrAbstractTimeObjectl = copy.getAbstractValueOrAbstractGeometryOrAbstractTimeObject();
                uniqueAbstractValueOrAbstractGeometryOrAbstractTimeObjectl.addAll(copyAbstractValueOrAbstractGeometryOrAbstractTimeObject);
            } else {
                copy.unsetAbstractValueOrAbstractGeometryOrAbstractTimeObject();
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
        return new ValueArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof ValueArrayPropertyType) {
            final ValueArrayPropertyType target = this;
            final ValueArrayPropertyType leftObject = ((ValueArrayPropertyType) left);
            final ValueArrayPropertyType rightObject = ((ValueArrayPropertyType) right);
            {
                List<JAXBElement<?>> lhsAbstractValueOrAbstractGeometryOrAbstractTimeObject;
                lhsAbstractValueOrAbstractGeometryOrAbstractTimeObject = leftObject.getAbstractValueOrAbstractGeometryOrAbstractTimeObject();
                List<JAXBElement<?>> rhsAbstractValueOrAbstractGeometryOrAbstractTimeObject;
                rhsAbstractValueOrAbstractGeometryOrAbstractTimeObject = rightObject.getAbstractValueOrAbstractGeometryOrAbstractTimeObject();
                target.unsetAbstractValueOrAbstractGeometryOrAbstractTimeObject();
                List<JAXBElement<?>> uniqueAbstractValueOrAbstractGeometryOrAbstractTimeObjectl = target.getAbstractValueOrAbstractGeometryOrAbstractTimeObject();
                uniqueAbstractValueOrAbstractGeometryOrAbstractTimeObjectl.addAll(((List<JAXBElement<?>> ) strategy.merge(LocatorUtils.property(leftLocator, "abstractValueOrAbstractGeometryOrAbstractTimeObject", lhsAbstractValueOrAbstractGeometryOrAbstractTimeObject), LocatorUtils.property(rightLocator, "abstractValueOrAbstractGeometryOrAbstractTimeObject", rhsAbstractValueOrAbstractGeometryOrAbstractTimeObject), lhsAbstractValueOrAbstractGeometryOrAbstractTimeObject, rhsAbstractValueOrAbstractGeometryOrAbstractTimeObject)));
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

    public void setAbstractValueOrAbstractGeometryOrAbstractTimeObject(List<JAXBElement<?>> value) {
        List<JAXBElement<?>> draftl = this.getAbstractValueOrAbstractGeometryOrAbstractTimeObject();
        draftl.addAll(value);
    }

}
