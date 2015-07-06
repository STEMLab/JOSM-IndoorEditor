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
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java-Klasse für AbstractFeatureCollectionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatureCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}featureMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}featureMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureCollectionType", propOrder = {
    "featureMember",
    "featureMembers"
})
@XmlSeeAlso({
    FeatureCollectionType.class
})
public abstract class AbstractFeatureCollectionType
    extends AbstractFeatureType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<FeaturePropertyType> featureMember;
    protected FeatureArrayPropertyType featureMembers;

    /**
     * Gets the value of the featureMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturePropertyType }
     * 
     * 
     */
    public List<FeaturePropertyType> getFeatureMember() {
        if (featureMember == null) {
            featureMember = new ArrayList<FeaturePropertyType>();
        }
        return this.featureMember;
    }

    public boolean isSetFeatureMember() {
        return ((this.featureMember!= null)&&(!this.featureMember.isEmpty()));
    }

    public void unsetFeatureMember() {
        this.featureMember = null;
    }

    /**
     * Ruft den Wert der featureMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureArrayPropertyType }
     *     
     */
    public FeatureArrayPropertyType getFeatureMembers() {
        return featureMembers;
    }

    /**
     * Legt den Wert der featureMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureArrayPropertyType }
     *     
     */
    public void setFeatureMembers(FeatureArrayPropertyType value) {
        this.featureMembers = value;
    }

    public boolean isSetFeatureMembers() {
        return (this.featureMembers!= null);
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
            List<FeaturePropertyType> theFeatureMember;
            theFeatureMember = this.getFeatureMember();
            strategy.appendField(locator, this, "featureMember", buffer, theFeatureMember);
        }
        {
            FeatureArrayPropertyType theFeatureMembers;
            theFeatureMembers = this.getFeatureMembers();
            strategy.appendField(locator, this, "featureMembers", buffer, theFeatureMembers);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractFeatureCollectionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AbstractFeatureCollectionType that = ((AbstractFeatureCollectionType) object);
        {
            List<FeaturePropertyType> lhsFeatureMember;
            lhsFeatureMember = this.getFeatureMember();
            List<FeaturePropertyType> rhsFeatureMember;
            rhsFeatureMember = that.getFeatureMember();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureMember", lhsFeatureMember), LocatorUtils.property(thatLocator, "featureMember", rhsFeatureMember), lhsFeatureMember, rhsFeatureMember)) {
                return false;
            }
        }
        {
            FeatureArrayPropertyType lhsFeatureMembers;
            lhsFeatureMembers = this.getFeatureMembers();
            FeatureArrayPropertyType rhsFeatureMembers;
            rhsFeatureMembers = that.getFeatureMembers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureMembers", lhsFeatureMembers), LocatorUtils.property(thatLocator, "featureMembers", rhsFeatureMembers), lhsFeatureMembers, rhsFeatureMembers)) {
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
            List<FeaturePropertyType> theFeatureMember;
            theFeatureMember = this.getFeatureMember();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureMember", theFeatureMember), currentHashCode, theFeatureMember);
        }
        {
            FeatureArrayPropertyType theFeatureMembers;
            theFeatureMembers = this.getFeatureMembers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureMembers", theFeatureMembers), currentHashCode, theFeatureMembers);
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
        if (target instanceof AbstractFeatureCollectionType) {
            final AbstractFeatureCollectionType copy = ((AbstractFeatureCollectionType) target);
            if (this.isSetFeatureMember()) {
                List<FeaturePropertyType> sourceFeatureMember;
                sourceFeatureMember = this.getFeatureMember();
                @SuppressWarnings("unchecked")
                List<FeaturePropertyType> copyFeatureMember = ((List<FeaturePropertyType> ) strategy.copy(LocatorUtils.property(locator, "featureMember", sourceFeatureMember), sourceFeatureMember));
                copy.unsetFeatureMember();
                List<FeaturePropertyType> uniqueFeatureMemberl = copy.getFeatureMember();
                uniqueFeatureMemberl.addAll(copyFeatureMember);
            } else {
                copy.unsetFeatureMember();
            }
            if (this.isSetFeatureMembers()) {
                FeatureArrayPropertyType sourceFeatureMembers;
                sourceFeatureMembers = this.getFeatureMembers();
                FeatureArrayPropertyType copyFeatureMembers = ((FeatureArrayPropertyType) strategy.copy(LocatorUtils.property(locator, "featureMembers", sourceFeatureMembers), sourceFeatureMembers));
                copy.setFeatureMembers(copyFeatureMembers);
            } else {
                copy.featureMembers = null;
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
        if (right instanceof AbstractFeatureCollectionType) {
            final AbstractFeatureCollectionType target = this;
            final AbstractFeatureCollectionType leftObject = ((AbstractFeatureCollectionType) left);
            final AbstractFeatureCollectionType rightObject = ((AbstractFeatureCollectionType) right);
            {
                List<FeaturePropertyType> lhsFeatureMember;
                lhsFeatureMember = leftObject.getFeatureMember();
                List<FeaturePropertyType> rhsFeatureMember;
                rhsFeatureMember = rightObject.getFeatureMember();
                target.unsetFeatureMember();
                List<FeaturePropertyType> uniqueFeatureMemberl = target.getFeatureMember();
                uniqueFeatureMemberl.addAll(((List<FeaturePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "featureMember", lhsFeatureMember), LocatorUtils.property(rightLocator, "featureMember", rhsFeatureMember), lhsFeatureMember, rhsFeatureMember)));
            }
            {
                FeatureArrayPropertyType lhsFeatureMembers;
                lhsFeatureMembers = leftObject.getFeatureMembers();
                FeatureArrayPropertyType rhsFeatureMembers;
                rhsFeatureMembers = rightObject.getFeatureMembers();
                target.setFeatureMembers(((FeatureArrayPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "featureMembers", lhsFeatureMembers), LocatorUtils.property(rightLocator, "featureMembers", rhsFeatureMembers), lhsFeatureMembers, rhsFeatureMembers)));
            }
        }
    }

    public void setFeatureMember(List<FeaturePropertyType> value) {
        List<FeaturePropertyType> draftl = this.getFeatureMember();
        draftl.addAll(value);
    }

}
