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
 * gml:SurfacePatchArrayPropertyType is a container for a sequence of surface patches.
 * 
 * <p>Java-Klasse für SurfacePatchArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SurfacePatchArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractSurfacePatch"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfacePatchArrayPropertyType", propOrder = {
    "abstractSurfacePatch"
})
public class SurfacePatchArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "AbstractSurfacePatch", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractSurfacePatchType>> abstractSurfacePatch;

    /**
     * Gets the value of the abstractSurfacePatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractSurfacePatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractSurfacePatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractParametricCurveSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfacePatchType }{@code >}
     * {@link JAXBElement }{@code <}{@link SphereType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConeType }{@code >}
     * {@link JAXBElement }{@code <}{@link RectangleType }{@code >}
     * {@link JAXBElement }{@code <}{@link TriangleType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonPatchType }{@code >}
     * {@link JAXBElement }{@code <}{@link CylinderType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGriddedSurfaceType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractSurfacePatchType>> getAbstractSurfacePatch() {
        if (abstractSurfacePatch == null) {
            abstractSurfacePatch = new ArrayList<JAXBElement<? extends AbstractSurfacePatchType>>();
        }
        return this.abstractSurfacePatch;
    }

    public boolean isSetAbstractSurfacePatch() {
        return ((this.abstractSurfacePatch!= null)&&(!this.abstractSurfacePatch.isEmpty()));
    }

    public void unsetAbstractSurfacePatch() {
        this.abstractSurfacePatch = null;
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
            List<JAXBElement<? extends AbstractSurfacePatchType>> theAbstractSurfacePatch;
            theAbstractSurfacePatch = this.getAbstractSurfacePatch();
            strategy.appendField(locator, this, "abstractSurfacePatch", buffer, theAbstractSurfacePatch);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SurfacePatchArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SurfacePatchArrayPropertyType that = ((SurfacePatchArrayPropertyType) object);
        {
            List<JAXBElement<? extends AbstractSurfacePatchType>> lhsAbstractSurfacePatch;
            lhsAbstractSurfacePatch = this.getAbstractSurfacePatch();
            List<JAXBElement<? extends AbstractSurfacePatchType>> rhsAbstractSurfacePatch;
            rhsAbstractSurfacePatch = that.getAbstractSurfacePatch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstractSurfacePatch", lhsAbstractSurfacePatch), LocatorUtils.property(thatLocator, "abstractSurfacePatch", rhsAbstractSurfacePatch), lhsAbstractSurfacePatch, rhsAbstractSurfacePatch)) {
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
            List<JAXBElement<? extends AbstractSurfacePatchType>> theAbstractSurfacePatch;
            theAbstractSurfacePatch = this.getAbstractSurfacePatch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abstractSurfacePatch", theAbstractSurfacePatch), currentHashCode, theAbstractSurfacePatch);
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
        if (draftCopy instanceof SurfacePatchArrayPropertyType) {
            final SurfacePatchArrayPropertyType copy = ((SurfacePatchArrayPropertyType) draftCopy);
            if (this.isSetAbstractSurfacePatch()) {
                List<JAXBElement<? extends AbstractSurfacePatchType>> sourceAbstractSurfacePatch;
                sourceAbstractSurfacePatch = this.getAbstractSurfacePatch();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractSurfacePatchType>> copyAbstractSurfacePatch = ((List<JAXBElement<? extends AbstractSurfacePatchType>> ) strategy.copy(LocatorUtils.property(locator, "abstractSurfacePatch", sourceAbstractSurfacePatch), sourceAbstractSurfacePatch));
                copy.unsetAbstractSurfacePatch();
                List<JAXBElement<? extends AbstractSurfacePatchType>> uniqueAbstractSurfacePatchl = copy.getAbstractSurfacePatch();
                uniqueAbstractSurfacePatchl.addAll(copyAbstractSurfacePatch);
            } else {
                copy.unsetAbstractSurfacePatch();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SurfacePatchArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof SurfacePatchArrayPropertyType) {
            final SurfacePatchArrayPropertyType target = this;
            final SurfacePatchArrayPropertyType leftObject = ((SurfacePatchArrayPropertyType) left);
            final SurfacePatchArrayPropertyType rightObject = ((SurfacePatchArrayPropertyType) right);
            {
                List<JAXBElement<? extends AbstractSurfacePatchType>> lhsAbstractSurfacePatch;
                lhsAbstractSurfacePatch = leftObject.getAbstractSurfacePatch();
                List<JAXBElement<? extends AbstractSurfacePatchType>> rhsAbstractSurfacePatch;
                rhsAbstractSurfacePatch = rightObject.getAbstractSurfacePatch();
                target.unsetAbstractSurfacePatch();
                List<JAXBElement<? extends AbstractSurfacePatchType>> uniqueAbstractSurfacePatchl = target.getAbstractSurfacePatch();
                uniqueAbstractSurfacePatchl.addAll(((List<JAXBElement<? extends AbstractSurfacePatchType>> ) strategy.merge(LocatorUtils.property(leftLocator, "abstractSurfacePatch", lhsAbstractSurfacePatch), LocatorUtils.property(rightLocator, "abstractSurfacePatch", rhsAbstractSurfacePatch), lhsAbstractSurfacePatch, rhsAbstractSurfacePatch)));
            }
        }
    }

    public void setAbstractSurfacePatch(List<JAXBElement<? extends AbstractSurfacePatchType>> value) {
        List<JAXBElement<? extends AbstractSurfacePatchType>> draftl = this.getAbstractSurfacePatch();
        draftl.addAll(value);
    }

}
