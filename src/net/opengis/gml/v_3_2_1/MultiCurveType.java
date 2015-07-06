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
 * <p>Java-Klasse für MultiCurveType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MultiCurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}curveMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}curveMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiCurveType", propOrder = {
    "curveMember",
    "curveMembers"
})
public class MultiCurveType
    extends AbstractGeometricAggregateType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<CurvePropertyType> curveMember;
    protected CurveArrayPropertyType curveMembers;

    /**
     * Gets the value of the curveMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curveMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurveMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurvePropertyType }
     * 
     * 
     */
    public List<CurvePropertyType> getCurveMember() {
        if (curveMember == null) {
            curveMember = new ArrayList<CurvePropertyType>();
        }
        return this.curveMember;
    }

    public boolean isSetCurveMember() {
        return ((this.curveMember!= null)&&(!this.curveMember.isEmpty()));
    }

    public void unsetCurveMember() {
        this.curveMember = null;
    }

    /**
     * Ruft den Wert der curveMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurveArrayPropertyType }
     *     
     */
    public CurveArrayPropertyType getCurveMembers() {
        return curveMembers;
    }

    /**
     * Legt den Wert der curveMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveArrayPropertyType }
     *     
     */
    public void setCurveMembers(CurveArrayPropertyType value) {
        this.curveMembers = value;
    }

    public boolean isSetCurveMembers() {
        return (this.curveMembers!= null);
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
            List<CurvePropertyType> theCurveMember;
            theCurveMember = this.getCurveMember();
            strategy.appendField(locator, this, "curveMember", buffer, theCurveMember);
        }
        {
            CurveArrayPropertyType theCurveMembers;
            theCurveMembers = this.getCurveMembers();
            strategy.appendField(locator, this, "curveMembers", buffer, theCurveMembers);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MultiCurveType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MultiCurveType that = ((MultiCurveType) object);
        {
            List<CurvePropertyType> lhsCurveMember;
            lhsCurveMember = this.getCurveMember();
            List<CurvePropertyType> rhsCurveMember;
            rhsCurveMember = that.getCurveMember();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "curveMember", lhsCurveMember), LocatorUtils.property(thatLocator, "curveMember", rhsCurveMember), lhsCurveMember, rhsCurveMember)) {
                return false;
            }
        }
        {
            CurveArrayPropertyType lhsCurveMembers;
            lhsCurveMembers = this.getCurveMembers();
            CurveArrayPropertyType rhsCurveMembers;
            rhsCurveMembers = that.getCurveMembers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "curveMembers", lhsCurveMembers), LocatorUtils.property(thatLocator, "curveMembers", rhsCurveMembers), lhsCurveMembers, rhsCurveMembers)) {
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
            List<CurvePropertyType> theCurveMember;
            theCurveMember = this.getCurveMember();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "curveMember", theCurveMember), currentHashCode, theCurveMember);
        }
        {
            CurveArrayPropertyType theCurveMembers;
            theCurveMembers = this.getCurveMembers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "curveMembers", theCurveMembers), currentHashCode, theCurveMembers);
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
        if (draftCopy instanceof MultiCurveType) {
            final MultiCurveType copy = ((MultiCurveType) draftCopy);
            if (this.isSetCurveMember()) {
                List<CurvePropertyType> sourceCurveMember;
                sourceCurveMember = this.getCurveMember();
                @SuppressWarnings("unchecked")
                List<CurvePropertyType> copyCurveMember = ((List<CurvePropertyType> ) strategy.copy(LocatorUtils.property(locator, "curveMember", sourceCurveMember), sourceCurveMember));
                copy.unsetCurveMember();
                List<CurvePropertyType> uniqueCurveMemberl = copy.getCurveMember();
                uniqueCurveMemberl.addAll(copyCurveMember);
            } else {
                copy.unsetCurveMember();
            }
            if (this.isSetCurveMembers()) {
                CurveArrayPropertyType sourceCurveMembers;
                sourceCurveMembers = this.getCurveMembers();
                CurveArrayPropertyType copyCurveMembers = ((CurveArrayPropertyType) strategy.copy(LocatorUtils.property(locator, "curveMembers", sourceCurveMembers), sourceCurveMembers));
                copy.setCurveMembers(copyCurveMembers);
            } else {
                copy.curveMembers = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MultiCurveType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof MultiCurveType) {
            final MultiCurveType target = this;
            final MultiCurveType leftObject = ((MultiCurveType) left);
            final MultiCurveType rightObject = ((MultiCurveType) right);
            {
                List<CurvePropertyType> lhsCurveMember;
                lhsCurveMember = leftObject.getCurveMember();
                List<CurvePropertyType> rhsCurveMember;
                rhsCurveMember = rightObject.getCurveMember();
                target.unsetCurveMember();
                List<CurvePropertyType> uniqueCurveMemberl = target.getCurveMember();
                uniqueCurveMemberl.addAll(((List<CurvePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "curveMember", lhsCurveMember), LocatorUtils.property(rightLocator, "curveMember", rhsCurveMember), lhsCurveMember, rhsCurveMember)));
            }
            {
                CurveArrayPropertyType lhsCurveMembers;
                lhsCurveMembers = leftObject.getCurveMembers();
                CurveArrayPropertyType rhsCurveMembers;
                rhsCurveMembers = rightObject.getCurveMembers();
                target.setCurveMembers(((CurveArrayPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "curveMembers", lhsCurveMembers), LocatorUtils.property(rightLocator, "curveMembers", rhsCurveMembers), lhsCurveMembers, rhsCurveMembers)));
            }
        }
    }

    public void setCurveMember(List<CurvePropertyType> value) {
        List<CurvePropertyType> draftl = this.getCurveMember();
        draftl.addAll(value);
    }

}
