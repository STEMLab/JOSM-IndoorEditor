//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java-Klasse für TemporalCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TemporalCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}timeCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}usesTemporalCS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}temporalDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalCRSType", propOrder = {
    "timeCS",
    "usesTemporalCS",
    "temporalDatum"
})
public class TemporalCRSType
    extends AbstractCRSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "timeCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<TimeCSPropertyType> timeCS;
    protected TemporalCSPropertyType usesTemporalCS;
    @XmlElementRef(name = "temporalDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<TemporalDatumPropertyType> temporalDatum;

    /**
     * Ruft den Wert der timeCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<TimeCSPropertyType> getTimeCS() {
        return timeCS;
    }

    /**
     * Legt den Wert der timeCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeCSPropertyType }{@code >}
     *     
     */
    public void setTimeCS(JAXBElement<TimeCSPropertyType> value) {
        this.timeCS = value;
    }

    public boolean isSetTimeCS() {
        return (this.timeCS!= null);
    }

    /**
     * Ruft den Wert der usesTemporalCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TemporalCSPropertyType }
     *     
     */
    public TemporalCSPropertyType getUsesTemporalCS() {
        return usesTemporalCS;
    }

    /**
     * Legt den Wert der usesTemporalCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalCSPropertyType }
     *     
     */
    public void setUsesTemporalCS(TemporalCSPropertyType value) {
        this.usesTemporalCS = value;
    }

    public boolean isSetUsesTemporalCS() {
        return (this.usesTemporalCS!= null);
    }

    /**
     * Ruft den Wert der temporalDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<TemporalDatumPropertyType> getTemporalDatum() {
        return temporalDatum;
    }

    /**
     * Legt den Wert der temporalDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}
     *     
     */
    public void setTemporalDatum(JAXBElement<TemporalDatumPropertyType> value) {
        this.temporalDatum = value;
    }

    public boolean isSetTemporalDatum() {
        return (this.temporalDatum!= null);
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
            JAXBElement<TimeCSPropertyType> theTimeCS;
            theTimeCS = this.getTimeCS();
            strategy.appendField(locator, this, "timeCS", buffer, theTimeCS);
        }
        {
            TemporalCSPropertyType theUsesTemporalCS;
            theUsesTemporalCS = this.getUsesTemporalCS();
            strategy.appendField(locator, this, "usesTemporalCS", buffer, theUsesTemporalCS);
        }
        {
            JAXBElement<TemporalDatumPropertyType> theTemporalDatum;
            theTemporalDatum = this.getTemporalDatum();
            strategy.appendField(locator, this, "temporalDatum", buffer, theTemporalDatum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TemporalCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TemporalCRSType that = ((TemporalCRSType) object);
        {
            JAXBElement<TimeCSPropertyType> lhsTimeCS;
            lhsTimeCS = this.getTimeCS();
            JAXBElement<TimeCSPropertyType> rhsTimeCS;
            rhsTimeCS = that.getTimeCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeCS", lhsTimeCS), LocatorUtils.property(thatLocator, "timeCS", rhsTimeCS), lhsTimeCS, rhsTimeCS)) {
                return false;
            }
        }
        {
            TemporalCSPropertyType lhsUsesTemporalCS;
            lhsUsesTemporalCS = this.getUsesTemporalCS();
            TemporalCSPropertyType rhsUsesTemporalCS;
            rhsUsesTemporalCS = that.getUsesTemporalCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesTemporalCS", lhsUsesTemporalCS), LocatorUtils.property(thatLocator, "usesTemporalCS", rhsUsesTemporalCS), lhsUsesTemporalCS, rhsUsesTemporalCS)) {
                return false;
            }
        }
        {
            JAXBElement<TemporalDatumPropertyType> lhsTemporalDatum;
            lhsTemporalDatum = this.getTemporalDatum();
            JAXBElement<TemporalDatumPropertyType> rhsTemporalDatum;
            rhsTemporalDatum = that.getTemporalDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "temporalDatum", lhsTemporalDatum), LocatorUtils.property(thatLocator, "temporalDatum", rhsTemporalDatum), lhsTemporalDatum, rhsTemporalDatum)) {
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
            JAXBElement<TimeCSPropertyType> theTimeCS;
            theTimeCS = this.getTimeCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeCS", theTimeCS), currentHashCode, theTimeCS);
        }
        {
            TemporalCSPropertyType theUsesTemporalCS;
            theUsesTemporalCS = this.getUsesTemporalCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesTemporalCS", theUsesTemporalCS), currentHashCode, theUsesTemporalCS);
        }
        {
            JAXBElement<TemporalDatumPropertyType> theTemporalDatum;
            theTemporalDatum = this.getTemporalDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "temporalDatum", theTemporalDatum), currentHashCode, theTemporalDatum);
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
        if (draftCopy instanceof TemporalCRSType) {
            final TemporalCRSType copy = ((TemporalCRSType) draftCopy);
            if (this.isSetTimeCS()) {
                JAXBElement<TimeCSPropertyType> sourceTimeCS;
                sourceTimeCS = this.getTimeCS();
                @SuppressWarnings("unchecked")
                JAXBElement<TimeCSPropertyType> copyTimeCS = ((JAXBElement<TimeCSPropertyType> ) strategy.copy(LocatorUtils.property(locator, "timeCS", sourceTimeCS), sourceTimeCS));
                copy.setTimeCS(copyTimeCS);
            } else {
                copy.timeCS = null;
            }
            if (this.isSetUsesTemporalCS()) {
                TemporalCSPropertyType sourceUsesTemporalCS;
                sourceUsesTemporalCS = this.getUsesTemporalCS();
                TemporalCSPropertyType copyUsesTemporalCS = ((TemporalCSPropertyType) strategy.copy(LocatorUtils.property(locator, "usesTemporalCS", sourceUsesTemporalCS), sourceUsesTemporalCS));
                copy.setUsesTemporalCS(copyUsesTemporalCS);
            } else {
                copy.usesTemporalCS = null;
            }
            if (this.isSetTemporalDatum()) {
                JAXBElement<TemporalDatumPropertyType> sourceTemporalDatum;
                sourceTemporalDatum = this.getTemporalDatum();
                @SuppressWarnings("unchecked")
                JAXBElement<TemporalDatumPropertyType> copyTemporalDatum = ((JAXBElement<TemporalDatumPropertyType> ) strategy.copy(LocatorUtils.property(locator, "temporalDatum", sourceTemporalDatum), sourceTemporalDatum));
                copy.setTemporalDatum(copyTemporalDatum);
            } else {
                copy.temporalDatum = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TemporalCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TemporalCRSType) {
            final TemporalCRSType target = this;
            final TemporalCRSType leftObject = ((TemporalCRSType) left);
            final TemporalCRSType rightObject = ((TemporalCRSType) right);
            {
                JAXBElement<TimeCSPropertyType> lhsTimeCS;
                lhsTimeCS = leftObject.getTimeCS();
                JAXBElement<TimeCSPropertyType> rhsTimeCS;
                rhsTimeCS = rightObject.getTimeCS();
                target.setTimeCS(((JAXBElement<TimeCSPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "timeCS", lhsTimeCS), LocatorUtils.property(rightLocator, "timeCS", rhsTimeCS), lhsTimeCS, rhsTimeCS)));
            }
            {
                TemporalCSPropertyType lhsUsesTemporalCS;
                lhsUsesTemporalCS = leftObject.getUsesTemporalCS();
                TemporalCSPropertyType rhsUsesTemporalCS;
                rhsUsesTemporalCS = rightObject.getUsesTemporalCS();
                target.setUsesTemporalCS(((TemporalCSPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "usesTemporalCS", lhsUsesTemporalCS), LocatorUtils.property(rightLocator, "usesTemporalCS", rhsUsesTemporalCS), lhsUsesTemporalCS, rhsUsesTemporalCS)));
            }
            {
                JAXBElement<TemporalDatumPropertyType> lhsTemporalDatum;
                lhsTemporalDatum = leftObject.getTemporalDatum();
                JAXBElement<TemporalDatumPropertyType> rhsTemporalDatum;
                rhsTemporalDatum = rightObject.getTemporalDatum();
                target.setTemporalDatum(((JAXBElement<TemporalDatumPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "temporalDatum", lhsTemporalDatum), LocatorUtils.property(rightLocator, "temporalDatum", rhsTemporalDatum), lhsTemporalDatum, rhsTemporalDatum)));
            }
        }
    }

}
