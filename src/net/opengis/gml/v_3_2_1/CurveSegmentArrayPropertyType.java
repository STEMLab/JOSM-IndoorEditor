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
 * gml:CurveSegmentArrayPropertyType is a container for an array of curve segments.
 * 
 * <p>Java-Klasse für CurveSegmentArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CurveSegmentArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractCurveSegment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveSegmentArrayPropertyType", propOrder = {
    "abstractCurveSegment"
})
public class CurveSegmentArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "AbstractCurveSegment", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractCurveSegmentType>> abstractCurveSegment;

    /**
     * Gets the value of the abstractCurveSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractCurveSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractCurveSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link OffsetCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link BSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link BezierType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClothoidType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicStringType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractCurveSegmentType>> getAbstractCurveSegment() {
        if (abstractCurveSegment == null) {
            abstractCurveSegment = new ArrayList<JAXBElement<? extends AbstractCurveSegmentType>>();
        }
        return this.abstractCurveSegment;
    }

    public boolean isSetAbstractCurveSegment() {
        return ((this.abstractCurveSegment!= null)&&(!this.abstractCurveSegment.isEmpty()));
    }

    public void unsetAbstractCurveSegment() {
        this.abstractCurveSegment = null;
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
            List<JAXBElement<? extends AbstractCurveSegmentType>> theAbstractCurveSegment;
            theAbstractCurveSegment = this.getAbstractCurveSegment();
            strategy.appendField(locator, this, "abstractCurveSegment", buffer, theAbstractCurveSegment);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CurveSegmentArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CurveSegmentArrayPropertyType that = ((CurveSegmentArrayPropertyType) object);
        {
            List<JAXBElement<? extends AbstractCurveSegmentType>> lhsAbstractCurveSegment;
            lhsAbstractCurveSegment = this.getAbstractCurveSegment();
            List<JAXBElement<? extends AbstractCurveSegmentType>> rhsAbstractCurveSegment;
            rhsAbstractCurveSegment = that.getAbstractCurveSegment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstractCurveSegment", lhsAbstractCurveSegment), LocatorUtils.property(thatLocator, "abstractCurveSegment", rhsAbstractCurveSegment), lhsAbstractCurveSegment, rhsAbstractCurveSegment)) {
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
            List<JAXBElement<? extends AbstractCurveSegmentType>> theAbstractCurveSegment;
            theAbstractCurveSegment = this.getAbstractCurveSegment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abstractCurveSegment", theAbstractCurveSegment), currentHashCode, theAbstractCurveSegment);
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
        if (draftCopy instanceof CurveSegmentArrayPropertyType) {
            final CurveSegmentArrayPropertyType copy = ((CurveSegmentArrayPropertyType) draftCopy);
            if (this.isSetAbstractCurveSegment()) {
                List<JAXBElement<? extends AbstractCurveSegmentType>> sourceAbstractCurveSegment;
                sourceAbstractCurveSegment = this.getAbstractCurveSegment();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractCurveSegmentType>> copyAbstractCurveSegment = ((List<JAXBElement<? extends AbstractCurveSegmentType>> ) strategy.copy(LocatorUtils.property(locator, "abstractCurveSegment", sourceAbstractCurveSegment), sourceAbstractCurveSegment));
                copy.unsetAbstractCurveSegment();
                List<JAXBElement<? extends AbstractCurveSegmentType>> uniqueAbstractCurveSegmentl = copy.getAbstractCurveSegment();
                uniqueAbstractCurveSegmentl.addAll(copyAbstractCurveSegment);
            } else {
                copy.unsetAbstractCurveSegment();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CurveSegmentArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof CurveSegmentArrayPropertyType) {
            final CurveSegmentArrayPropertyType target = this;
            final CurveSegmentArrayPropertyType leftObject = ((CurveSegmentArrayPropertyType) left);
            final CurveSegmentArrayPropertyType rightObject = ((CurveSegmentArrayPropertyType) right);
            {
                List<JAXBElement<? extends AbstractCurveSegmentType>> lhsAbstractCurveSegment;
                lhsAbstractCurveSegment = leftObject.getAbstractCurveSegment();
                List<JAXBElement<? extends AbstractCurveSegmentType>> rhsAbstractCurveSegment;
                rhsAbstractCurveSegment = rightObject.getAbstractCurveSegment();
                target.unsetAbstractCurveSegment();
                List<JAXBElement<? extends AbstractCurveSegmentType>> uniqueAbstractCurveSegmentl = target.getAbstractCurveSegment();
                uniqueAbstractCurveSegmentl.addAll(((List<JAXBElement<? extends AbstractCurveSegmentType>> ) strategy.merge(LocatorUtils.property(leftLocator, "abstractCurveSegment", lhsAbstractCurveSegment), LocatorUtils.property(rightLocator, "abstractCurveSegment", rhsAbstractCurveSegment), lhsAbstractCurveSegment, rhsAbstractCurveSegment)));
            }
        }
    }

    public void setAbstractCurveSegment(List<JAXBElement<? extends AbstractCurveSegmentType>> value) {
        List<JAXBElement<? extends AbstractCurveSegmentType>> draftl = this.getAbstractCurveSegment();
        draftl.addAll(value);
    }

}
