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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java-Klasse für OperationParameterGroupType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OperationParameterGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralOperationParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}maximumOccurs" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}parameter" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationParameterGroupType", propOrder = {
    "maximumOccurs",
    "parameter"
})
public class OperationParameterGroupType
    extends AbstractGeneralOperationParameterType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumOccurs;
    @XmlElementRef(name = "parameter", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> parameter;

    /**
     * Ruft den Wert der maximumOccurs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumOccurs() {
        return maximumOccurs;
    }

    /**
     * Legt den Wert der maximumOccurs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumOccurs(BigInteger value) {
        this.maximumOccurs = value;
    }

    public boolean isSetMaximumOccurs() {
        return (this.maximumOccurs!= null);
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<JAXBElement<AbstractGeneralOperationParameterPropertyType>>();
        }
        return this.parameter;
    }

    public boolean isSetParameter() {
        return ((this.parameter!= null)&&(!this.parameter.isEmpty()));
    }

    public void unsetParameter() {
        this.parameter = null;
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
            BigInteger theMaximumOccurs;
            theMaximumOccurs = this.getMaximumOccurs();
            strategy.appendField(locator, this, "maximumOccurs", buffer, theMaximumOccurs);
        }
        {
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> theParameter;
            theParameter = this.getParameter();
            strategy.appendField(locator, this, "parameter", buffer, theParameter);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OperationParameterGroupType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OperationParameterGroupType that = ((OperationParameterGroupType) object);
        {
            BigInteger lhsMaximumOccurs;
            lhsMaximumOccurs = this.getMaximumOccurs();
            BigInteger rhsMaximumOccurs;
            rhsMaximumOccurs = that.getMaximumOccurs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumOccurs", lhsMaximumOccurs), LocatorUtils.property(thatLocator, "maximumOccurs", rhsMaximumOccurs), lhsMaximumOccurs, rhsMaximumOccurs)) {
                return false;
            }
        }
        {
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> lhsParameter;
            lhsParameter = this.getParameter();
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> rhsParameter;
            rhsParameter = that.getParameter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameter", lhsParameter), LocatorUtils.property(thatLocator, "parameter", rhsParameter), lhsParameter, rhsParameter)) {
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
            BigInteger theMaximumOccurs;
            theMaximumOccurs = this.getMaximumOccurs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumOccurs", theMaximumOccurs), currentHashCode, theMaximumOccurs);
        }
        {
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> theParameter;
            theParameter = this.getParameter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameter", theParameter), currentHashCode, theParameter);
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
        if (draftCopy instanceof OperationParameterGroupType) {
            final OperationParameterGroupType copy = ((OperationParameterGroupType) draftCopy);
            if (this.isSetMaximumOccurs()) {
                BigInteger sourceMaximumOccurs;
                sourceMaximumOccurs = this.getMaximumOccurs();
                BigInteger copyMaximumOccurs = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "maximumOccurs", sourceMaximumOccurs), sourceMaximumOccurs));
                copy.setMaximumOccurs(copyMaximumOccurs);
            } else {
                copy.maximumOccurs = null;
            }
            if (this.isSetParameter()) {
                List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> sourceParameter;
                sourceParameter = this.getParameter();
                @SuppressWarnings("unchecked")
                List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> copyParameter = ((List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> ) strategy.copy(LocatorUtils.property(locator, "parameter", sourceParameter), sourceParameter));
                copy.unsetParameter();
                List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> uniqueParameterl = copy.getParameter();
                uniqueParameterl.addAll(copyParameter);
            } else {
                copy.unsetParameter();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OperationParameterGroupType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof OperationParameterGroupType) {
            final OperationParameterGroupType target = this;
            final OperationParameterGroupType leftObject = ((OperationParameterGroupType) left);
            final OperationParameterGroupType rightObject = ((OperationParameterGroupType) right);
            {
                BigInteger lhsMaximumOccurs;
                lhsMaximumOccurs = leftObject.getMaximumOccurs();
                BigInteger rhsMaximumOccurs;
                rhsMaximumOccurs = rightObject.getMaximumOccurs();
                target.setMaximumOccurs(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "maximumOccurs", lhsMaximumOccurs), LocatorUtils.property(rightLocator, "maximumOccurs", rhsMaximumOccurs), lhsMaximumOccurs, rhsMaximumOccurs)));
            }
            {
                List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> lhsParameter;
                lhsParameter = leftObject.getParameter();
                List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> rhsParameter;
                rhsParameter = rightObject.getParameter();
                target.unsetParameter();
                List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> uniqueParameterl = target.getParameter();
                uniqueParameterl.addAll(((List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> ) strategy.merge(LocatorUtils.property(leftLocator, "parameter", lhsParameter), LocatorUtils.property(rightLocator, "parameter", rhsParameter), lhsParameter, rhsParameter)));
            }
        }
    }

    public void setParameter(List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> value) {
        List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> draftl = this.getParameter();
        draftl.addAll(value);
    }

}
