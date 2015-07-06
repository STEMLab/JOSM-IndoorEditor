//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
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
 * <p>Java-Klasse für GridEnvelopeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GridEnvelopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="low" type="{http://www.opengis.net/gml/3.2}integerList"/>
 *         &lt;element name="high" type="{http://www.opengis.net/gml/3.2}integerList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridEnvelopeType", propOrder = {
    "low",
    "high"
})
public class GridEnvelopeType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlList
    @XmlElement(required = true)
    protected List<BigInteger> low;
    @XmlList
    @XmlElement(required = true)
    protected List<BigInteger> high;

    /**
     * Gets the value of the low property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the low property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLow() {
        if (low == null) {
            low = new ArrayList<BigInteger>();
        }
        return this.low;
    }

    public boolean isSetLow() {
        return ((this.low!= null)&&(!this.low.isEmpty()));
    }

    public void unsetLow() {
        this.low = null;
    }

    /**
     * Gets the value of the high property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the high property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHigh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getHigh() {
        if (high == null) {
            high = new ArrayList<BigInteger>();
        }
        return this.high;
    }

    public boolean isSetHigh() {
        return ((this.high!= null)&&(!this.high.isEmpty()));
    }

    public void unsetHigh() {
        this.high = null;
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
            List<BigInteger> theLow;
            theLow = this.getLow();
            strategy.appendField(locator, this, "low", buffer, theLow);
        }
        {
            List<BigInteger> theHigh;
            theHigh = this.getHigh();
            strategy.appendField(locator, this, "high", buffer, theHigh);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GridEnvelopeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GridEnvelopeType that = ((GridEnvelopeType) object);
        {
            List<BigInteger> lhsLow;
            lhsLow = this.getLow();
            List<BigInteger> rhsLow;
            rhsLow = that.getLow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "low", lhsLow), LocatorUtils.property(thatLocator, "low", rhsLow), lhsLow, rhsLow)) {
                return false;
            }
        }
        {
            List<BigInteger> lhsHigh;
            lhsHigh = this.getHigh();
            List<BigInteger> rhsHigh;
            rhsHigh = that.getHigh();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "high", lhsHigh), LocatorUtils.property(thatLocator, "high", rhsHigh), lhsHigh, rhsHigh)) {
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
            List<BigInteger> theLow;
            theLow = this.getLow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "low", theLow), currentHashCode, theLow);
        }
        {
            List<BigInteger> theHigh;
            theHigh = this.getHigh();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "high", theHigh), currentHashCode, theHigh);
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
        if (draftCopy instanceof GridEnvelopeType) {
            final GridEnvelopeType copy = ((GridEnvelopeType) draftCopy);
            if (this.isSetLow()) {
                List<BigInteger> sourceLow;
                sourceLow = this.getLow();
                @SuppressWarnings("unchecked")
                List<BigInteger> copyLow = ((List<BigInteger> ) strategy.copy(LocatorUtils.property(locator, "low", sourceLow), sourceLow));
                copy.unsetLow();
                List<BigInteger> uniqueLowl = copy.getLow();
                uniqueLowl.addAll(copyLow);
            } else {
                copy.unsetLow();
            }
            if (this.isSetHigh()) {
                List<BigInteger> sourceHigh;
                sourceHigh = this.getHigh();
                @SuppressWarnings("unchecked")
                List<BigInteger> copyHigh = ((List<BigInteger> ) strategy.copy(LocatorUtils.property(locator, "high", sourceHigh), sourceHigh));
                copy.unsetHigh();
                List<BigInteger> uniqueHighl = copy.getHigh();
                uniqueHighl.addAll(copyHigh);
            } else {
                copy.unsetHigh();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GridEnvelopeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof GridEnvelopeType) {
            final GridEnvelopeType target = this;
            final GridEnvelopeType leftObject = ((GridEnvelopeType) left);
            final GridEnvelopeType rightObject = ((GridEnvelopeType) right);
            {
                List<BigInteger> lhsLow;
                lhsLow = leftObject.getLow();
                List<BigInteger> rhsLow;
                rhsLow = rightObject.getLow();
                target.unsetLow();
                List<BigInteger> uniqueLowl = target.getLow();
                uniqueLowl.addAll(((List<BigInteger> ) strategy.merge(LocatorUtils.property(leftLocator, "low", lhsLow), LocatorUtils.property(rightLocator, "low", rhsLow), lhsLow, rhsLow)));
            }
            {
                List<BigInteger> lhsHigh;
                lhsHigh = leftObject.getHigh();
                List<BigInteger> rhsHigh;
                rhsHigh = rightObject.getHigh();
                target.unsetHigh();
                List<BigInteger> uniqueHighl = target.getHigh();
                uniqueHighl.addAll(((List<BigInteger> ) strategy.merge(LocatorUtils.property(leftLocator, "high", lhsHigh), LocatorUtils.property(rightLocator, "high", rhsHigh), lhsHigh, rhsHigh)));
            }
        }
    }

    public void setLow(List<BigInteger> value) {
        List<BigInteger> draftl = this.getLow();
        draftl.addAll(value);
    }

    public void setHigh(List<BigInteger> value) {
        List<BigInteger> draftl = this.getHigh();
        draftl.addAll(value);
    }

}
