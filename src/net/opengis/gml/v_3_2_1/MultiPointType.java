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
 * <p>Java-Klasse für MultiPointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MultiPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}pointMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}pointMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiPointType", propOrder = {
    "pointMember",
    "pointMembers"
})
public class MultiPointType
    extends AbstractGeometricAggregateType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<PointPropertyType> pointMember;
    protected PointArrayPropertyType pointMembers;

    /**
     * Gets the value of the pointMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointPropertyType }
     * 
     * 
     */
    public List<PointPropertyType> getPointMember() {
        if (pointMember == null) {
            pointMember = new ArrayList<PointPropertyType>();
        }
        return this.pointMember;
    }

    public boolean isSetPointMember() {
        return ((this.pointMember!= null)&&(!this.pointMember.isEmpty()));
    }

    public void unsetPointMember() {
        this.pointMember = null;
    }

    /**
     * Ruft den Wert der pointMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointArrayPropertyType }
     *     
     */
    public PointArrayPropertyType getPointMembers() {
        return pointMembers;
    }

    /**
     * Legt den Wert der pointMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointArrayPropertyType }
     *     
     */
    public void setPointMembers(PointArrayPropertyType value) {
        this.pointMembers = value;
    }

    public boolean isSetPointMembers() {
        return (this.pointMembers!= null);
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
            List<PointPropertyType> thePointMember;
            thePointMember = this.getPointMember();
            strategy.appendField(locator, this, "pointMember", buffer, thePointMember);
        }
        {
            PointArrayPropertyType thePointMembers;
            thePointMembers = this.getPointMembers();
            strategy.appendField(locator, this, "pointMembers", buffer, thePointMembers);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MultiPointType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MultiPointType that = ((MultiPointType) object);
        {
            List<PointPropertyType> lhsPointMember;
            lhsPointMember = this.getPointMember();
            List<PointPropertyType> rhsPointMember;
            rhsPointMember = that.getPointMember();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pointMember", lhsPointMember), LocatorUtils.property(thatLocator, "pointMember", rhsPointMember), lhsPointMember, rhsPointMember)) {
                return false;
            }
        }
        {
            PointArrayPropertyType lhsPointMembers;
            lhsPointMembers = this.getPointMembers();
            PointArrayPropertyType rhsPointMembers;
            rhsPointMembers = that.getPointMembers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pointMembers", lhsPointMembers), LocatorUtils.property(thatLocator, "pointMembers", rhsPointMembers), lhsPointMembers, rhsPointMembers)) {
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
            List<PointPropertyType> thePointMember;
            thePointMember = this.getPointMember();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pointMember", thePointMember), currentHashCode, thePointMember);
        }
        {
            PointArrayPropertyType thePointMembers;
            thePointMembers = this.getPointMembers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pointMembers", thePointMembers), currentHashCode, thePointMembers);
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
        if (draftCopy instanceof MultiPointType) {
            final MultiPointType copy = ((MultiPointType) draftCopy);
            if (this.isSetPointMember()) {
                List<PointPropertyType> sourcePointMember;
                sourcePointMember = this.getPointMember();
                @SuppressWarnings("unchecked")
                List<PointPropertyType> copyPointMember = ((List<PointPropertyType> ) strategy.copy(LocatorUtils.property(locator, "pointMember", sourcePointMember), sourcePointMember));
                copy.unsetPointMember();
                List<PointPropertyType> uniquePointMemberl = copy.getPointMember();
                uniquePointMemberl.addAll(copyPointMember);
            } else {
                copy.unsetPointMember();
            }
            if (this.isSetPointMembers()) {
                PointArrayPropertyType sourcePointMembers;
                sourcePointMembers = this.getPointMembers();
                PointArrayPropertyType copyPointMembers = ((PointArrayPropertyType) strategy.copy(LocatorUtils.property(locator, "pointMembers", sourcePointMembers), sourcePointMembers));
                copy.setPointMembers(copyPointMembers);
            } else {
                copy.pointMembers = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MultiPointType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof MultiPointType) {
            final MultiPointType target = this;
            final MultiPointType leftObject = ((MultiPointType) left);
            final MultiPointType rightObject = ((MultiPointType) right);
            {
                List<PointPropertyType> lhsPointMember;
                lhsPointMember = leftObject.getPointMember();
                List<PointPropertyType> rhsPointMember;
                rhsPointMember = rightObject.getPointMember();
                target.unsetPointMember();
                List<PointPropertyType> uniquePointMemberl = target.getPointMember();
                uniquePointMemberl.addAll(((List<PointPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "pointMember", lhsPointMember), LocatorUtils.property(rightLocator, "pointMember", rhsPointMember), lhsPointMember, rhsPointMember)));
            }
            {
                PointArrayPropertyType lhsPointMembers;
                lhsPointMembers = leftObject.getPointMembers();
                PointArrayPropertyType rhsPointMembers;
                rhsPointMembers = rightObject.getPointMembers();
                target.setPointMembers(((PointArrayPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "pointMembers", lhsPointMembers), LocatorUtils.property(rightLocator, "pointMembers", rhsPointMembers), lhsPointMembers, rhsPointMembers)));
            }
        }
    }

    public void setPointMember(List<PointPropertyType> value) {
        List<PointPropertyType> draftl = this.getPointMember();
        draftl.addAll(value);
    }

}
