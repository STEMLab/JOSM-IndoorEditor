//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

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
 * <p>Java-Klasse für PrimeMeridianType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PrimeMeridianType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}greenwichLongitude"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimeMeridianType", propOrder = {
    "greenwichLongitude"
})
public class PrimeMeridianType
    extends IdentifiedObjectType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected AngleType greenwichLongitude;

    /**
     * Ruft den Wert der greenwichLongitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getGreenwichLongitude() {
        return greenwichLongitude;
    }

    /**
     * Legt den Wert der greenwichLongitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setGreenwichLongitude(AngleType value) {
        this.greenwichLongitude = value;
    }

    public boolean isSetGreenwichLongitude() {
        return (this.greenwichLongitude!= null);
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
            AngleType theGreenwichLongitude;
            theGreenwichLongitude = this.getGreenwichLongitude();
            strategy.appendField(locator, this, "greenwichLongitude", buffer, theGreenwichLongitude);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PrimeMeridianType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PrimeMeridianType that = ((PrimeMeridianType) object);
        {
            AngleType lhsGreenwichLongitude;
            lhsGreenwichLongitude = this.getGreenwichLongitude();
            AngleType rhsGreenwichLongitude;
            rhsGreenwichLongitude = that.getGreenwichLongitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "greenwichLongitude", lhsGreenwichLongitude), LocatorUtils.property(thatLocator, "greenwichLongitude", rhsGreenwichLongitude), lhsGreenwichLongitude, rhsGreenwichLongitude)) {
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
            AngleType theGreenwichLongitude;
            theGreenwichLongitude = this.getGreenwichLongitude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "greenwichLongitude", theGreenwichLongitude), currentHashCode, theGreenwichLongitude);
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
        if (draftCopy instanceof PrimeMeridianType) {
            final PrimeMeridianType copy = ((PrimeMeridianType) draftCopy);
            if (this.isSetGreenwichLongitude()) {
                AngleType sourceGreenwichLongitude;
                sourceGreenwichLongitude = this.getGreenwichLongitude();
                AngleType copyGreenwichLongitude = ((AngleType) strategy.copy(LocatorUtils.property(locator, "greenwichLongitude", sourceGreenwichLongitude), sourceGreenwichLongitude));
                copy.setGreenwichLongitude(copyGreenwichLongitude);
            } else {
                copy.greenwichLongitude = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PrimeMeridianType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof PrimeMeridianType) {
            final PrimeMeridianType target = this;
            final PrimeMeridianType leftObject = ((PrimeMeridianType) left);
            final PrimeMeridianType rightObject = ((PrimeMeridianType) right);
            {
                AngleType lhsGreenwichLongitude;
                lhsGreenwichLongitude = leftObject.getGreenwichLongitude();
                AngleType rhsGreenwichLongitude;
                rhsGreenwichLongitude = rightObject.getGreenwichLongitude();
                target.setGreenwichLongitude(((AngleType) strategy.merge(LocatorUtils.property(leftLocator, "greenwichLongitude", lhsGreenwichLongitude), LocatorUtils.property(rightLocator, "greenwichLongitude", rhsGreenwichLongitude), lhsGreenwichLongitude, rhsGreenwichLongitude)));
            }
        }
    }

}
