//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

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
 * <p>Java-Klasse für AngleChoiceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AngleChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}angle"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}dmsAngle"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AngleChoiceType", propOrder = {
    "angle",
    "dmsAngle"
})
public class AngleChoiceType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected AngleType angle;
    protected DMSAngleType dmsAngle;

    /**
     * Ruft den Wert der angle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getAngle() {
        return angle;
    }

    /**
     * Legt den Wert der angle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setAngle(AngleType value) {
        this.angle = value;
    }

    public boolean isSetAngle() {
        return (this.angle!= null);
    }

    /**
     * Ruft den Wert der dmsAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DMSAngleType }
     *     
     */
    public DMSAngleType getDmsAngle() {
        return dmsAngle;
    }

    /**
     * Legt den Wert der dmsAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DMSAngleType }
     *     
     */
    public void setDmsAngle(DMSAngleType value) {
        this.dmsAngle = value;
    }

    public boolean isSetDmsAngle() {
        return (this.dmsAngle!= null);
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
            AngleType theAngle;
            theAngle = this.getAngle();
            strategy.appendField(locator, this, "angle", buffer, theAngle);
        }
        {
            DMSAngleType theDmsAngle;
            theDmsAngle = this.getDmsAngle();
            strategy.appendField(locator, this, "dmsAngle", buffer, theDmsAngle);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AngleChoiceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AngleChoiceType that = ((AngleChoiceType) object);
        {
            AngleType lhsAngle;
            lhsAngle = this.getAngle();
            AngleType rhsAngle;
            rhsAngle = that.getAngle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "angle", lhsAngle), LocatorUtils.property(thatLocator, "angle", rhsAngle), lhsAngle, rhsAngle)) {
                return false;
            }
        }
        {
            DMSAngleType lhsDmsAngle;
            lhsDmsAngle = this.getDmsAngle();
            DMSAngleType rhsDmsAngle;
            rhsDmsAngle = that.getDmsAngle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dmsAngle", lhsDmsAngle), LocatorUtils.property(thatLocator, "dmsAngle", rhsDmsAngle), lhsDmsAngle, rhsDmsAngle)) {
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
            AngleType theAngle;
            theAngle = this.getAngle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "angle", theAngle), currentHashCode, theAngle);
        }
        {
            DMSAngleType theDmsAngle;
            theDmsAngle = this.getDmsAngle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dmsAngle", theDmsAngle), currentHashCode, theDmsAngle);
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
        if (draftCopy instanceof AngleChoiceType) {
            final AngleChoiceType copy = ((AngleChoiceType) draftCopy);
            if (this.isSetAngle()) {
                AngleType sourceAngle;
                sourceAngle = this.getAngle();
                AngleType copyAngle = ((AngleType) strategy.copy(LocatorUtils.property(locator, "angle", sourceAngle), sourceAngle));
                copy.setAngle(copyAngle);
            } else {
                copy.angle = null;
            }
            if (this.isSetDmsAngle()) {
                DMSAngleType sourceDmsAngle;
                sourceDmsAngle = this.getDmsAngle();
                DMSAngleType copyDmsAngle = ((DMSAngleType) strategy.copy(LocatorUtils.property(locator, "dmsAngle", sourceDmsAngle), sourceDmsAngle));
                copy.setDmsAngle(copyDmsAngle);
            } else {
                copy.dmsAngle = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AngleChoiceType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof AngleChoiceType) {
            final AngleChoiceType target = this;
            final AngleChoiceType leftObject = ((AngleChoiceType) left);
            final AngleChoiceType rightObject = ((AngleChoiceType) right);
            {
                AngleType lhsAngle;
                lhsAngle = leftObject.getAngle();
                AngleType rhsAngle;
                rhsAngle = rightObject.getAngle();
                target.setAngle(((AngleType) strategy.merge(LocatorUtils.property(leftLocator, "angle", lhsAngle), LocatorUtils.property(rightLocator, "angle", rhsAngle), lhsAngle, rhsAngle)));
            }
            {
                DMSAngleType lhsDmsAngle;
                lhsDmsAngle = leftObject.getDmsAngle();
                DMSAngleType rhsDmsAngle;
                rhsDmsAngle = rightObject.getDmsAngle();
                target.setDmsAngle(((DMSAngleType) strategy.merge(LocatorUtils.property(leftLocator, "dmsAngle", lhsDmsAngle), LocatorUtils.property(rightLocator, "dmsAngle", rhsDmsAngle), lhsDmsAngle, rhsDmsAngle)));
            }
        }
    }

}
