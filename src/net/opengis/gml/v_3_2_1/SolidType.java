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
 * <p>Java-Klasse für SolidType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SolidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractSolidType">
 *       &lt;sequence>
 *         &lt;element name="exterior" type="{http://www.opengis.net/gml/3.2}ShellPropertyType" minOccurs="0"/>
 *         &lt;element name="interior" type="{http://www.opengis.net/gml/3.2}ShellPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolidType", propOrder = {
    "exterior",
    "interior"
})
public class SolidType
    extends AbstractSolidType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected ShellPropertyType exterior;
    protected List<ShellPropertyType> interior;

    /**
     * Ruft den Wert der exterior-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShellPropertyType }
     *     
     */
    public ShellPropertyType getExterior() {
        return exterior;
    }

    /**
     * Legt den Wert der exterior-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShellPropertyType }
     *     
     */
    public void setExterior(ShellPropertyType value) {
        this.exterior = value;
    }

    public boolean isSetExterior() {
        return (this.exterior!= null);
    }

    /**
     * Gets the value of the interior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShellPropertyType }
     * 
     * 
     */
    public List<ShellPropertyType> getInterior() {
        if (interior == null) {
            interior = new ArrayList<ShellPropertyType>();
        }
        return this.interior;
    }

    public boolean isSetInterior() {
        return ((this.interior!= null)&&(!this.interior.isEmpty()));
    }

    public void unsetInterior() {
        this.interior = null;
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
            ShellPropertyType theExterior;
            theExterior = this.getExterior();
            strategy.appendField(locator, this, "exterior", buffer, theExterior);
        }
        {
            List<ShellPropertyType> theInterior;
            theInterior = this.getInterior();
            strategy.appendField(locator, this, "interior", buffer, theInterior);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SolidType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SolidType that = ((SolidType) object);
        {
            ShellPropertyType lhsExterior;
            lhsExterior = this.getExterior();
            ShellPropertyType rhsExterior;
            rhsExterior = that.getExterior();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exterior", lhsExterior), LocatorUtils.property(thatLocator, "exterior", rhsExterior), lhsExterior, rhsExterior)) {
                return false;
            }
        }
        {
            List<ShellPropertyType> lhsInterior;
            lhsInterior = this.getInterior();
            List<ShellPropertyType> rhsInterior;
            rhsInterior = that.getInterior();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interior", lhsInterior), LocatorUtils.property(thatLocator, "interior", rhsInterior), lhsInterior, rhsInterior)) {
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
            ShellPropertyType theExterior;
            theExterior = this.getExterior();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exterior", theExterior), currentHashCode, theExterior);
        }
        {
            List<ShellPropertyType> theInterior;
            theInterior = this.getInterior();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "interior", theInterior), currentHashCode, theInterior);
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
        if (draftCopy instanceof SolidType) {
            final SolidType copy = ((SolidType) draftCopy);
            if (this.isSetExterior()) {
                ShellPropertyType sourceExterior;
                sourceExterior = this.getExterior();
                ShellPropertyType copyExterior = ((ShellPropertyType) strategy.copy(LocatorUtils.property(locator, "exterior", sourceExterior), sourceExterior));
                copy.setExterior(copyExterior);
            } else {
                copy.exterior = null;
            }
            if (this.isSetInterior()) {
                List<ShellPropertyType> sourceInterior;
                sourceInterior = this.getInterior();
                @SuppressWarnings("unchecked")
                List<ShellPropertyType> copyInterior = ((List<ShellPropertyType> ) strategy.copy(LocatorUtils.property(locator, "interior", sourceInterior), sourceInterior));
                copy.unsetInterior();
                List<ShellPropertyType> uniqueInteriorl = copy.getInterior();
                uniqueInteriorl.addAll(copyInterior);
            } else {
                copy.unsetInterior();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SolidType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof SolidType) {
            final SolidType target = this;
            final SolidType leftObject = ((SolidType) left);
            final SolidType rightObject = ((SolidType) right);
            {
                ShellPropertyType lhsExterior;
                lhsExterior = leftObject.getExterior();
                ShellPropertyType rhsExterior;
                rhsExterior = rightObject.getExterior();
                target.setExterior(((ShellPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "exterior", lhsExterior), LocatorUtils.property(rightLocator, "exterior", rhsExterior), lhsExterior, rhsExterior)));
            }
            {
                List<ShellPropertyType> lhsInterior;
                lhsInterior = leftObject.getInterior();
                List<ShellPropertyType> rhsInterior;
                rhsInterior = rightObject.getInterior();
                target.unsetInterior();
                List<ShellPropertyType> uniqueInteriorl = target.getInterior();
                uniqueInteriorl.addAll(((List<ShellPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "interior", lhsInterior), LocatorUtils.property(rightLocator, "interior", rhsInterior), lhsInterior, rhsInterior)));
            }
        }
    }

    public void setInterior(List<ShellPropertyType> value) {
        List<ShellPropertyType> draftl = this.getInterior();
        draftl.addAll(value);
    }

}
