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
 * <p>Java-Klasse für MultiGeometryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MultiGeometryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}geometryMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}geometryMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiGeometryType", propOrder = {
    "geometryMember",
    "geometryMembers"
})
public class MultiGeometryType
    extends AbstractGeometricAggregateType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<GeometryPropertyType> geometryMember;
    protected GeometryArrayPropertyType geometryMembers;

    /**
     * Gets the value of the geometryMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometryMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometryMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeometryPropertyType }
     * 
     * 
     */
    public List<GeometryPropertyType> getGeometryMember() {
        if (geometryMember == null) {
            geometryMember = new ArrayList<GeometryPropertyType>();
        }
        return this.geometryMember;
    }

    public boolean isSetGeometryMember() {
        return ((this.geometryMember!= null)&&(!this.geometryMember.isEmpty()));
    }

    public void unsetGeometryMember() {
        this.geometryMember = null;
    }

    /**
     * Ruft den Wert der geometryMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeometryArrayPropertyType }
     *     
     */
    public GeometryArrayPropertyType getGeometryMembers() {
        return geometryMembers;
    }

    /**
     * Legt den Wert der geometryMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryArrayPropertyType }
     *     
     */
    public void setGeometryMembers(GeometryArrayPropertyType value) {
        this.geometryMembers = value;
    }

    public boolean isSetGeometryMembers() {
        return (this.geometryMembers!= null);
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
            List<GeometryPropertyType> theGeometryMember;
            theGeometryMember = this.getGeometryMember();
            strategy.appendField(locator, this, "geometryMember", buffer, theGeometryMember);
        }
        {
            GeometryArrayPropertyType theGeometryMembers;
            theGeometryMembers = this.getGeometryMembers();
            strategy.appendField(locator, this, "geometryMembers", buffer, theGeometryMembers);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MultiGeometryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MultiGeometryType that = ((MultiGeometryType) object);
        {
            List<GeometryPropertyType> lhsGeometryMember;
            lhsGeometryMember = this.getGeometryMember();
            List<GeometryPropertyType> rhsGeometryMember;
            rhsGeometryMember = that.getGeometryMember();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometryMember", lhsGeometryMember), LocatorUtils.property(thatLocator, "geometryMember", rhsGeometryMember), lhsGeometryMember, rhsGeometryMember)) {
                return false;
            }
        }
        {
            GeometryArrayPropertyType lhsGeometryMembers;
            lhsGeometryMembers = this.getGeometryMembers();
            GeometryArrayPropertyType rhsGeometryMembers;
            rhsGeometryMembers = that.getGeometryMembers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometryMembers", lhsGeometryMembers), LocatorUtils.property(thatLocator, "geometryMembers", rhsGeometryMembers), lhsGeometryMembers, rhsGeometryMembers)) {
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
            List<GeometryPropertyType> theGeometryMember;
            theGeometryMember = this.getGeometryMember();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometryMember", theGeometryMember), currentHashCode, theGeometryMember);
        }
        {
            GeometryArrayPropertyType theGeometryMembers;
            theGeometryMembers = this.getGeometryMembers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometryMembers", theGeometryMembers), currentHashCode, theGeometryMembers);
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
        if (draftCopy instanceof MultiGeometryType) {
            final MultiGeometryType copy = ((MultiGeometryType) draftCopy);
            if (this.isSetGeometryMember()) {
                List<GeometryPropertyType> sourceGeometryMember;
                sourceGeometryMember = this.getGeometryMember();
                @SuppressWarnings("unchecked")
                List<GeometryPropertyType> copyGeometryMember = ((List<GeometryPropertyType> ) strategy.copy(LocatorUtils.property(locator, "geometryMember", sourceGeometryMember), sourceGeometryMember));
                copy.unsetGeometryMember();
                List<GeometryPropertyType> uniqueGeometryMemberl = copy.getGeometryMember();
                uniqueGeometryMemberl.addAll(copyGeometryMember);
            } else {
                copy.unsetGeometryMember();
            }
            if (this.isSetGeometryMembers()) {
                GeometryArrayPropertyType sourceGeometryMembers;
                sourceGeometryMembers = this.getGeometryMembers();
                GeometryArrayPropertyType copyGeometryMembers = ((GeometryArrayPropertyType) strategy.copy(LocatorUtils.property(locator, "geometryMembers", sourceGeometryMembers), sourceGeometryMembers));
                copy.setGeometryMembers(copyGeometryMembers);
            } else {
                copy.geometryMembers = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MultiGeometryType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof MultiGeometryType) {
            final MultiGeometryType target = this;
            final MultiGeometryType leftObject = ((MultiGeometryType) left);
            final MultiGeometryType rightObject = ((MultiGeometryType) right);
            {
                List<GeometryPropertyType> lhsGeometryMember;
                lhsGeometryMember = leftObject.getGeometryMember();
                List<GeometryPropertyType> rhsGeometryMember;
                rhsGeometryMember = rightObject.getGeometryMember();
                target.unsetGeometryMember();
                List<GeometryPropertyType> uniqueGeometryMemberl = target.getGeometryMember();
                uniqueGeometryMemberl.addAll(((List<GeometryPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "geometryMember", lhsGeometryMember), LocatorUtils.property(rightLocator, "geometryMember", rhsGeometryMember), lhsGeometryMember, rhsGeometryMember)));
            }
            {
                GeometryArrayPropertyType lhsGeometryMembers;
                lhsGeometryMembers = leftObject.getGeometryMembers();
                GeometryArrayPropertyType rhsGeometryMembers;
                rhsGeometryMembers = rightObject.getGeometryMembers();
                target.setGeometryMembers(((GeometryArrayPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "geometryMembers", lhsGeometryMembers), LocatorUtils.property(rightLocator, "geometryMembers", rhsGeometryMembers), lhsGeometryMembers, rhsGeometryMembers)));
            }
        }
    }

    public void setGeometryMember(List<GeometryPropertyType> value) {
        List<GeometryPropertyType> draftl = this.getGeometryMember();
        draftl.addAll(value);
    }

}
