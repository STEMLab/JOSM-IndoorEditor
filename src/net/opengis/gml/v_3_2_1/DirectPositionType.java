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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * Direct position instances hold the coordinates for a position within some coordinate reference system (CRS). Since direct positions, as data types, will often be included in larger objects (such as geometry elements) that have references to CRS, the srsName attribute will in general be missing, if this particular direct position is included in a larger element with such a reference to a CRS. In this case, the CRS is implicitly assumed to take on the value of the containing object's CRS.
 * if no srsName attribute is given, the CRS shall be specified as part of the larger context this geometry element is part of, typically a geometric object like a point, curve, etc.
 * 
 * <p>Java-Klasse für DirectPositionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DirectPositionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opengis.net/gml/3.2>doubleList">
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}SRSReferenceGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectPositionType", propOrder = {
    "value"
})
@XmlSeeAlso({
    VectorType.class
})
public class DirectPositionType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlValue
    protected List<Double> value;
    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;
    @XmlAttribute(name = "srsDimension")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger srsDimension;
    @XmlAttribute(name = "axisLabels")
    protected List<String> axisLabels;
    @XmlAttribute(name = "uomLabels")
    protected List<String> uomLabels;

    /**
     * A type for a list of values of the respective simple type.Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getValue() {
        if (value == null) {
            value = new ArrayList<Double>();
        }
        return this.value;
    }

    public boolean isSetValue() {
        return ((this.value!= null)&&(!this.value.isEmpty()));
    }

    public void unsetValue() {
        this.value = null;
    }

    /**
     * Ruft den Wert der srsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Legt den Wert der srsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public boolean isSetSrsName() {
        return (this.srsName!= null);
    }

    /**
     * Ruft den Wert der srsDimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSrsDimension() {
        return srsDimension;
    }

    /**
     * Legt den Wert der srsDimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSrsDimension(BigInteger value) {
        this.srsDimension = value;
    }

    public boolean isSetSrsDimension() {
        return (this.srsDimension!= null);
    }

    /**
     * Gets the value of the axisLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAxisLabels() {
        if (axisLabels == null) {
            axisLabels = new ArrayList<String>();
        }
        return this.axisLabels;
    }

    public boolean isSetAxisLabels() {
        return ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
    }

    public void unsetAxisLabels() {
        this.axisLabels = null;
    }

    /**
     * Gets the value of the uomLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uomLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUomLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUomLabels() {
        if (uomLabels == null) {
            uomLabels = new ArrayList<String>();
        }
        return this.uomLabels;
    }

    public boolean isSetUomLabels() {
        return ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
    }

    public void unsetUomLabels() {
        this.uomLabels = null;
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
            List<Double> theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            String theSrsName;
            theSrsName = this.getSrsName();
            strategy.appendField(locator, this, "srsName", buffer, theSrsName);
        }
        {
            BigInteger theSrsDimension;
            theSrsDimension = this.getSrsDimension();
            strategy.appendField(locator, this, "srsDimension", buffer, theSrsDimension);
        }
        {
            List<String> theAxisLabels;
            theAxisLabels = this.getAxisLabels();
            strategy.appendField(locator, this, "axisLabels", buffer, theAxisLabels);
        }
        {
            List<String> theUomLabels;
            theUomLabels = this.getUomLabels();
            strategy.appendField(locator, this, "uomLabels", buffer, theUomLabels);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DirectPositionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DirectPositionType that = ((DirectPositionType) object);
        {
            List<Double> lhsValue;
            lhsValue = this.getValue();
            List<Double> rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsSrsName;
            lhsSrsName = this.getSrsName();
            String rhsSrsName;
            rhsSrsName = that.getSrsName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "srsName", lhsSrsName), LocatorUtils.property(thatLocator, "srsName", rhsSrsName), lhsSrsName, rhsSrsName)) {
                return false;
            }
        }
        {
            BigInteger lhsSrsDimension;
            lhsSrsDimension = this.getSrsDimension();
            BigInteger rhsSrsDimension;
            rhsSrsDimension = that.getSrsDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "srsDimension", lhsSrsDimension), LocatorUtils.property(thatLocator, "srsDimension", rhsSrsDimension), lhsSrsDimension, rhsSrsDimension)) {
                return false;
            }
        }
        {
            List<String> lhsAxisLabels;
            lhsAxisLabels = this.getAxisLabels();
            List<String> rhsAxisLabels;
            rhsAxisLabels = that.getAxisLabels();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "axisLabels", lhsAxisLabels), LocatorUtils.property(thatLocator, "axisLabels", rhsAxisLabels), lhsAxisLabels, rhsAxisLabels)) {
                return false;
            }
        }
        {
            List<String> lhsUomLabels;
            lhsUomLabels = this.getUomLabels();
            List<String> rhsUomLabels;
            rhsUomLabels = that.getUomLabels();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uomLabels", lhsUomLabels), LocatorUtils.property(thatLocator, "uomLabels", rhsUomLabels), lhsUomLabels, rhsUomLabels)) {
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
            List<Double> theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theSrsName;
            theSrsName = this.getSrsName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "srsName", theSrsName), currentHashCode, theSrsName);
        }
        {
            BigInteger theSrsDimension;
            theSrsDimension = this.getSrsDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "srsDimension", theSrsDimension), currentHashCode, theSrsDimension);
        }
        {
            List<String> theAxisLabels;
            theAxisLabels = this.getAxisLabels();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axisLabels", theAxisLabels), currentHashCode, theAxisLabels);
        }
        {
            List<String> theUomLabels;
            theUomLabels = this.getUomLabels();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uomLabels", theUomLabels), currentHashCode, theUomLabels);
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
        if (draftCopy instanceof DirectPositionType) {
            final DirectPositionType copy = ((DirectPositionType) draftCopy);
            if (this.isSetValue()) {
                List<Double> sourceValue;
                sourceValue = this.getValue();
                @SuppressWarnings("unchecked")
                List<Double> copyValue = ((List<Double> ) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.unsetValue();
                List<Double> uniqueValuel = copy.getValue();
                uniqueValuel.addAll(copyValue);
            } else {
                copy.unsetValue();
            }
            if (this.isSetSrsName()) {
                String sourceSrsName;
                sourceSrsName = this.getSrsName();
                String copySrsName = ((String) strategy.copy(LocatorUtils.property(locator, "srsName", sourceSrsName), sourceSrsName));
                copy.setSrsName(copySrsName);
            } else {
                copy.srsName = null;
            }
            if (this.isSetSrsDimension()) {
                BigInteger sourceSrsDimension;
                sourceSrsDimension = this.getSrsDimension();
                BigInteger copySrsDimension = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "srsDimension", sourceSrsDimension), sourceSrsDimension));
                copy.setSrsDimension(copySrsDimension);
            } else {
                copy.srsDimension = null;
            }
            if (this.isSetAxisLabels()) {
                List<String> sourceAxisLabels;
                sourceAxisLabels = this.getAxisLabels();
                @SuppressWarnings("unchecked")
                List<String> copyAxisLabels = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "axisLabels", sourceAxisLabels), sourceAxisLabels));
                copy.unsetAxisLabels();
                List<String> uniqueAxisLabelsl = copy.getAxisLabels();
                uniqueAxisLabelsl.addAll(copyAxisLabels);
            } else {
                copy.unsetAxisLabels();
            }
            if (this.isSetUomLabels()) {
                List<String> sourceUomLabels;
                sourceUomLabels = this.getUomLabels();
                @SuppressWarnings("unchecked")
                List<String> copyUomLabels = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "uomLabels", sourceUomLabels), sourceUomLabels));
                copy.unsetUomLabels();
                List<String> uniqueUomLabelsl = copy.getUomLabels();
                uniqueUomLabelsl.addAll(copyUomLabels);
            } else {
                copy.unsetUomLabels();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DirectPositionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof DirectPositionType) {
            final DirectPositionType target = this;
            final DirectPositionType leftObject = ((DirectPositionType) left);
            final DirectPositionType rightObject = ((DirectPositionType) right);
            {
                List<Double> lhsValue;
                lhsValue = leftObject.getValue();
                List<Double> rhsValue;
                rhsValue = rightObject.getValue();
                target.unsetValue();
                List<Double> uniqueValuel = target.getValue();
                uniqueValuel.addAll(((List<Double> ) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue)));
            }
            {
                String lhsSrsName;
                lhsSrsName = leftObject.getSrsName();
                String rhsSrsName;
                rhsSrsName = rightObject.getSrsName();
                target.setSrsName(((String) strategy.merge(LocatorUtils.property(leftLocator, "srsName", lhsSrsName), LocatorUtils.property(rightLocator, "srsName", rhsSrsName), lhsSrsName, rhsSrsName)));
            }
            {
                BigInteger lhsSrsDimension;
                lhsSrsDimension = leftObject.getSrsDimension();
                BigInteger rhsSrsDimension;
                rhsSrsDimension = rightObject.getSrsDimension();
                target.setSrsDimension(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "srsDimension", lhsSrsDimension), LocatorUtils.property(rightLocator, "srsDimension", rhsSrsDimension), lhsSrsDimension, rhsSrsDimension)));
            }
            {
                List<String> lhsAxisLabels;
                lhsAxisLabels = leftObject.getAxisLabels();
                List<String> rhsAxisLabels;
                rhsAxisLabels = rightObject.getAxisLabels();
                target.unsetAxisLabels();
                List<String> uniqueAxisLabelsl = target.getAxisLabels();
                uniqueAxisLabelsl.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "axisLabels", lhsAxisLabels), LocatorUtils.property(rightLocator, "axisLabels", rhsAxisLabels), lhsAxisLabels, rhsAxisLabels)));
            }
            {
                List<String> lhsUomLabels;
                lhsUomLabels = leftObject.getUomLabels();
                List<String> rhsUomLabels;
                rhsUomLabels = rightObject.getUomLabels();
                target.unsetUomLabels();
                List<String> uniqueUomLabelsl = target.getUomLabels();
                uniqueUomLabelsl.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "uomLabels", lhsUomLabels), LocatorUtils.property(rightLocator, "uomLabels", rhsUomLabels), lhsUomLabels, rhsUomLabels)));
            }
        }
    }

    public void setValue(List<Double> value) {
        List<Double> draftl = this.getValue();
        draftl.addAll(value);
    }

    public void setAxisLabels(List<String> value) {
        List<String> draftl = this.getAxisLabels();
        draftl.addAll(value);
    }

    public void setUomLabels(List<String> value) {
        List<String> draftl = this.getUomLabels();
        draftl.addAll(value);
    }

}
