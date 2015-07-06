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
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java-Klasse für TimeTopologyComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeTopologyComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimeComplexType">
 *       &lt;sequence>
 *         &lt;element name="primitive" type="{http://www.opengis.net/gml/3.2}TimeTopologyPrimitivePropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTopologyComplexType", propOrder = {
    "primitive"
})
public abstract class TimeTopologyComplexType
    extends AbstractTimeComplexType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<TimeTopologyPrimitivePropertyType> primitive;

    /**
     * Gets the value of the primitive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primitive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimitive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeTopologyPrimitivePropertyType }
     * 
     * 
     */
    public List<TimeTopologyPrimitivePropertyType> getPrimitive() {
        if (primitive == null) {
            primitive = new ArrayList<TimeTopologyPrimitivePropertyType>();
        }
        return this.primitive;
    }

    public boolean isSetPrimitive() {
        return ((this.primitive!= null)&&(!this.primitive.isEmpty()));
    }

    public void unsetPrimitive() {
        this.primitive = null;
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
            List<TimeTopologyPrimitivePropertyType> thePrimitive;
            thePrimitive = this.getPrimitive();
            strategy.appendField(locator, this, "primitive", buffer, thePrimitive);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeTopologyComplexType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimeTopologyComplexType that = ((TimeTopologyComplexType) object);
        {
            List<TimeTopologyPrimitivePropertyType> lhsPrimitive;
            lhsPrimitive = this.getPrimitive();
            List<TimeTopologyPrimitivePropertyType> rhsPrimitive;
            rhsPrimitive = that.getPrimitive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primitive", lhsPrimitive), LocatorUtils.property(thatLocator, "primitive", rhsPrimitive), lhsPrimitive, rhsPrimitive)) {
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
            List<TimeTopologyPrimitivePropertyType> thePrimitive;
            thePrimitive = this.getPrimitive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primitive", thePrimitive), currentHashCode, thePrimitive);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof TimeTopologyComplexType) {
            final TimeTopologyComplexType copy = ((TimeTopologyComplexType) target);
            if (this.isSetPrimitive()) {
                List<TimeTopologyPrimitivePropertyType> sourcePrimitive;
                sourcePrimitive = this.getPrimitive();
                @SuppressWarnings("unchecked")
                List<TimeTopologyPrimitivePropertyType> copyPrimitive = ((List<TimeTopologyPrimitivePropertyType> ) strategy.copy(LocatorUtils.property(locator, "primitive", sourcePrimitive), sourcePrimitive));
                copy.unsetPrimitive();
                List<TimeTopologyPrimitivePropertyType> uniquePrimitivel = copy.getPrimitive();
                uniquePrimitivel.addAll(copyPrimitive);
            } else {
                copy.unsetPrimitive();
            }
        }
        return target;
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TimeTopologyComplexType) {
            final TimeTopologyComplexType target = this;
            final TimeTopologyComplexType leftObject = ((TimeTopologyComplexType) left);
            final TimeTopologyComplexType rightObject = ((TimeTopologyComplexType) right);
            {
                List<TimeTopologyPrimitivePropertyType> lhsPrimitive;
                lhsPrimitive = leftObject.getPrimitive();
                List<TimeTopologyPrimitivePropertyType> rhsPrimitive;
                rhsPrimitive = rightObject.getPrimitive();
                target.unsetPrimitive();
                List<TimeTopologyPrimitivePropertyType> uniquePrimitivel = target.getPrimitive();
                uniquePrimitivel.addAll(((List<TimeTopologyPrimitivePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "primitive", lhsPrimitive), LocatorUtils.property(rightLocator, "primitive", rhsPrimitive), lhsPrimitive, rhsPrimitive)));
            }
        }
    }

    public void setPrimitive(List<TimeTopologyPrimitivePropertyType> value) {
        List<TimeTopologyPrimitivePropertyType> draftl = this.getPrimitive();
        draftl.addAll(value);
    }

}
