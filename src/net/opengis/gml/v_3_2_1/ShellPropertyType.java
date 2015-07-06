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
 * A property with the content model of gml:ShellPropertyType encapsulates a shell to represent a component of a solid boundary.
 * 
 * <p>Java-Klasse für ShellPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShellPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}Shell"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShellPropertyType", propOrder = {
    "shell"
})
public class ShellPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "Shell", required = true)
    protected ShellType shell;

    /**
     * Ruft den Wert der shell-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShellType }
     *     
     */
    public ShellType getShell() {
        return shell;
    }

    /**
     * Legt den Wert der shell-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShellType }
     *     
     */
    public void setShell(ShellType value) {
        this.shell = value;
    }

    public boolean isSetShell() {
        return (this.shell!= null);
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
            ShellType theShell;
            theShell = this.getShell();
            strategy.appendField(locator, this, "shell", buffer, theShell);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ShellPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ShellPropertyType that = ((ShellPropertyType) object);
        {
            ShellType lhsShell;
            lhsShell = this.getShell();
            ShellType rhsShell;
            rhsShell = that.getShell();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shell", lhsShell), LocatorUtils.property(thatLocator, "shell", rhsShell), lhsShell, rhsShell)) {
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
            ShellType theShell;
            theShell = this.getShell();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shell", theShell), currentHashCode, theShell);
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
        if (draftCopy instanceof ShellPropertyType) {
            final ShellPropertyType copy = ((ShellPropertyType) draftCopy);
            if (this.isSetShell()) {
                ShellType sourceShell;
                sourceShell = this.getShell();
                ShellType copyShell = ((ShellType) strategy.copy(LocatorUtils.property(locator, "shell", sourceShell), sourceShell));
                copy.setShell(copyShell);
            } else {
                copy.shell = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ShellPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof ShellPropertyType) {
            final ShellPropertyType target = this;
            final ShellPropertyType leftObject = ((ShellPropertyType) left);
            final ShellPropertyType rightObject = ((ShellPropertyType) right);
            {
                ShellType lhsShell;
                lhsShell = leftObject.getShell();
                ShellType rhsShell;
                rhsShell = rightObject.getShell();
                target.setShell(((ShellType) strategy.merge(LocatorUtils.property(leftLocator, "shell", lhsShell), LocatorUtils.property(rightLocator, "shell", rhsShell), lhsShell, rhsShell)));
            }
        }
    }

}
