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
 * <p>Java-Klasse für IndirectEntryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IndirectEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}DefinitionProxy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndirectEntryType", propOrder = {
    "definitionProxy"
})
public class IndirectEntryType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "DefinitionProxy", required = true)
    protected DefinitionProxyType definitionProxy;

    /**
     * Ruft den Wert der definitionProxy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionProxyType }
     *     
     */
    public DefinitionProxyType getDefinitionProxy() {
        return definitionProxy;
    }

    /**
     * Legt den Wert der definitionProxy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionProxyType }
     *     
     */
    public void setDefinitionProxy(DefinitionProxyType value) {
        this.definitionProxy = value;
    }

    public boolean isSetDefinitionProxy() {
        return (this.definitionProxy!= null);
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
            DefinitionProxyType theDefinitionProxy;
            theDefinitionProxy = this.getDefinitionProxy();
            strategy.appendField(locator, this, "definitionProxy", buffer, theDefinitionProxy);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IndirectEntryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IndirectEntryType that = ((IndirectEntryType) object);
        {
            DefinitionProxyType lhsDefinitionProxy;
            lhsDefinitionProxy = this.getDefinitionProxy();
            DefinitionProxyType rhsDefinitionProxy;
            rhsDefinitionProxy = that.getDefinitionProxy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "definitionProxy", lhsDefinitionProxy), LocatorUtils.property(thatLocator, "definitionProxy", rhsDefinitionProxy), lhsDefinitionProxy, rhsDefinitionProxy)) {
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
            DefinitionProxyType theDefinitionProxy;
            theDefinitionProxy = this.getDefinitionProxy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "definitionProxy", theDefinitionProxy), currentHashCode, theDefinitionProxy);
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
        if (draftCopy instanceof IndirectEntryType) {
            final IndirectEntryType copy = ((IndirectEntryType) draftCopy);
            if (this.isSetDefinitionProxy()) {
                DefinitionProxyType sourceDefinitionProxy;
                sourceDefinitionProxy = this.getDefinitionProxy();
                DefinitionProxyType copyDefinitionProxy = ((DefinitionProxyType) strategy.copy(LocatorUtils.property(locator, "definitionProxy", sourceDefinitionProxy), sourceDefinitionProxy));
                copy.setDefinitionProxy(copyDefinitionProxy);
            } else {
                copy.definitionProxy = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new IndirectEntryType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof IndirectEntryType) {
            final IndirectEntryType target = this;
            final IndirectEntryType leftObject = ((IndirectEntryType) left);
            final IndirectEntryType rightObject = ((IndirectEntryType) right);
            {
                DefinitionProxyType lhsDefinitionProxy;
                lhsDefinitionProxy = leftObject.getDefinitionProxy();
                DefinitionProxyType rhsDefinitionProxy;
                rhsDefinitionProxy = rightObject.getDefinitionProxy();
                target.setDefinitionProxy(((DefinitionProxyType) strategy.merge(LocatorUtils.property(leftLocator, "definitionProxy", lhsDefinitionProxy), LocatorUtils.property(rightLocator, "definitionProxy", rhsDefinitionProxy), lhsDefinitionProxy, rhsDefinitionProxy)));
            }
        }
    }

}
