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
 * <p>Java-Klasse für MultiSurfaceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MultiSurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}surfaceMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}surfaceMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSurfaceType", propOrder = {
    "surfaceMember",
    "surfaceMembers"
})
public class MultiSurfaceType
    extends AbstractGeometricAggregateType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<SurfacePropertyType> surfaceMember;
    protected SurfaceArrayPropertyType surfaceMembers;

    /**
     * Gets the value of the surfaceMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfaceMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfaceMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfacePropertyType }
     * 
     * 
     */
    public List<SurfacePropertyType> getSurfaceMember() {
        if (surfaceMember == null) {
            surfaceMember = new ArrayList<SurfacePropertyType>();
        }
        return this.surfaceMember;
    }

    public boolean isSetSurfaceMember() {
        return ((this.surfaceMember!= null)&&(!this.surfaceMember.isEmpty()));
    }

    public void unsetSurfaceMember() {
        this.surfaceMember = null;
    }

    /**
     * Ruft den Wert der surfaceMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceArrayPropertyType }
     *     
     */
    public SurfaceArrayPropertyType getSurfaceMembers() {
        return surfaceMembers;
    }

    /**
     * Legt den Wert der surfaceMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceArrayPropertyType }
     *     
     */
    public void setSurfaceMembers(SurfaceArrayPropertyType value) {
        this.surfaceMembers = value;
    }

    public boolean isSetSurfaceMembers() {
        return (this.surfaceMembers!= null);
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
            List<SurfacePropertyType> theSurfaceMember;
            theSurfaceMember = this.getSurfaceMember();
            strategy.appendField(locator, this, "surfaceMember", buffer, theSurfaceMember);
        }
        {
            SurfaceArrayPropertyType theSurfaceMembers;
            theSurfaceMembers = this.getSurfaceMembers();
            strategy.appendField(locator, this, "surfaceMembers", buffer, theSurfaceMembers);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MultiSurfaceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MultiSurfaceType that = ((MultiSurfaceType) object);
        {
            List<SurfacePropertyType> lhsSurfaceMember;
            lhsSurfaceMember = this.getSurfaceMember();
            List<SurfacePropertyType> rhsSurfaceMember;
            rhsSurfaceMember = that.getSurfaceMember();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceMember", lhsSurfaceMember), LocatorUtils.property(thatLocator, "surfaceMember", rhsSurfaceMember), lhsSurfaceMember, rhsSurfaceMember)) {
                return false;
            }
        }
        {
            SurfaceArrayPropertyType lhsSurfaceMembers;
            lhsSurfaceMembers = this.getSurfaceMembers();
            SurfaceArrayPropertyType rhsSurfaceMembers;
            rhsSurfaceMembers = that.getSurfaceMembers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceMembers", lhsSurfaceMembers), LocatorUtils.property(thatLocator, "surfaceMembers", rhsSurfaceMembers), lhsSurfaceMembers, rhsSurfaceMembers)) {
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
            List<SurfacePropertyType> theSurfaceMember;
            theSurfaceMember = this.getSurfaceMember();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surfaceMember", theSurfaceMember), currentHashCode, theSurfaceMember);
        }
        {
            SurfaceArrayPropertyType theSurfaceMembers;
            theSurfaceMembers = this.getSurfaceMembers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surfaceMembers", theSurfaceMembers), currentHashCode, theSurfaceMembers);
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
        if (draftCopy instanceof MultiSurfaceType) {
            final MultiSurfaceType copy = ((MultiSurfaceType) draftCopy);
            if (this.isSetSurfaceMember()) {
                List<SurfacePropertyType> sourceSurfaceMember;
                sourceSurfaceMember = this.getSurfaceMember();
                @SuppressWarnings("unchecked")
                List<SurfacePropertyType> copySurfaceMember = ((List<SurfacePropertyType> ) strategy.copy(LocatorUtils.property(locator, "surfaceMember", sourceSurfaceMember), sourceSurfaceMember));
                copy.unsetSurfaceMember();
                List<SurfacePropertyType> uniqueSurfaceMemberl = copy.getSurfaceMember();
                uniqueSurfaceMemberl.addAll(copySurfaceMember);
            } else {
                copy.unsetSurfaceMember();
            }
            if (this.isSetSurfaceMembers()) {
                SurfaceArrayPropertyType sourceSurfaceMembers;
                sourceSurfaceMembers = this.getSurfaceMembers();
                SurfaceArrayPropertyType copySurfaceMembers = ((SurfaceArrayPropertyType) strategy.copy(LocatorUtils.property(locator, "surfaceMembers", sourceSurfaceMembers), sourceSurfaceMembers));
                copy.setSurfaceMembers(copySurfaceMembers);
            } else {
                copy.surfaceMembers = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MultiSurfaceType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof MultiSurfaceType) {
            final MultiSurfaceType target = this;
            final MultiSurfaceType leftObject = ((MultiSurfaceType) left);
            final MultiSurfaceType rightObject = ((MultiSurfaceType) right);
            {
                List<SurfacePropertyType> lhsSurfaceMember;
                lhsSurfaceMember = leftObject.getSurfaceMember();
                List<SurfacePropertyType> rhsSurfaceMember;
                rhsSurfaceMember = rightObject.getSurfaceMember();
                target.unsetSurfaceMember();
                List<SurfacePropertyType> uniqueSurfaceMemberl = target.getSurfaceMember();
                uniqueSurfaceMemberl.addAll(((List<SurfacePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "surfaceMember", lhsSurfaceMember), LocatorUtils.property(rightLocator, "surfaceMember", rhsSurfaceMember), lhsSurfaceMember, rhsSurfaceMember)));
            }
            {
                SurfaceArrayPropertyType lhsSurfaceMembers;
                lhsSurfaceMembers = leftObject.getSurfaceMembers();
                SurfaceArrayPropertyType rhsSurfaceMembers;
                rhsSurfaceMembers = rightObject.getSurfaceMembers();
                target.setSurfaceMembers(((SurfaceArrayPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "surfaceMembers", lhsSurfaceMembers), LocatorUtils.property(rightLocator, "surfaceMembers", rhsSurfaceMembers), lhsSurfaceMembers, rhsSurfaceMembers)));
            }
        }
    }

    public void setSurfaceMember(List<SurfacePropertyType> value) {
        List<SurfacePropertyType> draftl = this.getSurfaceMember();
        draftl.addAll(value);
    }

}
