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
 * <p>Java-Klasse für ImageDatumType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImageDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}pixelInCell"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageDatumType", propOrder = {
    "pixelInCell"
})
public class ImageDatumType
    extends AbstractDatumType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected CodeWithAuthorityType pixelInCell;

    /**
     * Ruft den Wert der pixelInCell-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getPixelInCell() {
        return pixelInCell;
    }

    /**
     * Legt den Wert der pixelInCell-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setPixelInCell(CodeWithAuthorityType value) {
        this.pixelInCell = value;
    }

    public boolean isSetPixelInCell() {
        return (this.pixelInCell!= null);
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
            CodeWithAuthorityType thePixelInCell;
            thePixelInCell = this.getPixelInCell();
            strategy.appendField(locator, this, "pixelInCell", buffer, thePixelInCell);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImageDatumType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ImageDatumType that = ((ImageDatumType) object);
        {
            CodeWithAuthorityType lhsPixelInCell;
            lhsPixelInCell = this.getPixelInCell();
            CodeWithAuthorityType rhsPixelInCell;
            rhsPixelInCell = that.getPixelInCell();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pixelInCell", lhsPixelInCell), LocatorUtils.property(thatLocator, "pixelInCell", rhsPixelInCell), lhsPixelInCell, rhsPixelInCell)) {
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
            CodeWithAuthorityType thePixelInCell;
            thePixelInCell = this.getPixelInCell();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pixelInCell", thePixelInCell), currentHashCode, thePixelInCell);
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
        if (draftCopy instanceof ImageDatumType) {
            final ImageDatumType copy = ((ImageDatumType) draftCopy);
            if (this.isSetPixelInCell()) {
                CodeWithAuthorityType sourcePixelInCell;
                sourcePixelInCell = this.getPixelInCell();
                CodeWithAuthorityType copyPixelInCell = ((CodeWithAuthorityType) strategy.copy(LocatorUtils.property(locator, "pixelInCell", sourcePixelInCell), sourcePixelInCell));
                copy.setPixelInCell(copyPixelInCell);
            } else {
                copy.pixelInCell = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ImageDatumType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ImageDatumType) {
            final ImageDatumType target = this;
            final ImageDatumType leftObject = ((ImageDatumType) left);
            final ImageDatumType rightObject = ((ImageDatumType) right);
            {
                CodeWithAuthorityType lhsPixelInCell;
                lhsPixelInCell = leftObject.getPixelInCell();
                CodeWithAuthorityType rhsPixelInCell;
                rhsPixelInCell = rightObject.getPixelInCell();
                target.setPixelInCell(((CodeWithAuthorityType) strategy.merge(LocatorUtils.property(leftLocator, "pixelInCell", lhsPixelInCell), LocatorUtils.property(rightLocator, "pixelInCell", rhsPixelInCell), lhsPixelInCell, rhsPixelInCell)));
            }
        }
    }

}
