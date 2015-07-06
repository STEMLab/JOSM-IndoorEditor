//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java-Klasse für TransformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralTransformationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}method"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}parameterValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformationType", propOrder = {
    "method",
    "parameterValue"
})
public class TransformationType
    extends AbstractGeneralTransformationType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "method", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<OperationMethodPropertyType> method;
    @XmlElementRef(name = "parameterValue", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<AbstractGeneralParameterValuePropertyType>> parameterValue;

    /**
     * Ruft den Wert der method-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}
     *     
     */
    public JAXBElement<OperationMethodPropertyType> getMethod() {
        return method;
    }

    /**
     * Legt den Wert der method-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}
     *     
     */
    public void setMethod(JAXBElement<OperationMethodPropertyType> value) {
        this.method = value;
    }

    public boolean isSetMethod() {
        return (this.method!= null);
    }

    /**
     * Gets the value of the parameterValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AbstractGeneralParameterValuePropertyType>> getParameterValue() {
        if (parameterValue == null) {
            parameterValue = new ArrayList<JAXBElement<AbstractGeneralParameterValuePropertyType>>();
        }
        return this.parameterValue;
    }

    public boolean isSetParameterValue() {
        return ((this.parameterValue!= null)&&(!this.parameterValue.isEmpty()));
    }

    public void unsetParameterValue() {
        this.parameterValue = null;
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
            JAXBElement<OperationMethodPropertyType> theMethod;
            theMethod = this.getMethod();
            strategy.appendField(locator, this, "method", buffer, theMethod);
        }
        {
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> theParameterValue;
            theParameterValue = this.getParameterValue();
            strategy.appendField(locator, this, "parameterValue", buffer, theParameterValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TransformationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TransformationType that = ((TransformationType) object);
        {
            JAXBElement<OperationMethodPropertyType> lhsMethod;
            lhsMethod = this.getMethod();
            JAXBElement<OperationMethodPropertyType> rhsMethod;
            rhsMethod = that.getMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "method", lhsMethod), LocatorUtils.property(thatLocator, "method", rhsMethod), lhsMethod, rhsMethod)) {
                return false;
            }
        }
        {
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> lhsParameterValue;
            lhsParameterValue = this.getParameterValue();
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> rhsParameterValue;
            rhsParameterValue = that.getParameterValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameterValue", lhsParameterValue), LocatorUtils.property(thatLocator, "parameterValue", rhsParameterValue), lhsParameterValue, rhsParameterValue)) {
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
            JAXBElement<OperationMethodPropertyType> theMethod;
            theMethod = this.getMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "method", theMethod), currentHashCode, theMethod);
        }
        {
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> theParameterValue;
            theParameterValue = this.getParameterValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameterValue", theParameterValue), currentHashCode, theParameterValue);
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
        if (draftCopy instanceof TransformationType) {
            final TransformationType copy = ((TransformationType) draftCopy);
            if (this.isSetMethod()) {
                JAXBElement<OperationMethodPropertyType> sourceMethod;
                sourceMethod = this.getMethod();
                @SuppressWarnings("unchecked")
                JAXBElement<OperationMethodPropertyType> copyMethod = ((JAXBElement<OperationMethodPropertyType> ) strategy.copy(LocatorUtils.property(locator, "method", sourceMethod), sourceMethod));
                copy.setMethod(copyMethod);
            } else {
                copy.method = null;
            }
            if (this.isSetParameterValue()) {
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> sourceParameterValue;
                sourceParameterValue = this.getParameterValue();
                @SuppressWarnings("unchecked")
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> copyParameterValue = ((List<JAXBElement<AbstractGeneralParameterValuePropertyType>> ) strategy.copy(LocatorUtils.property(locator, "parameterValue", sourceParameterValue), sourceParameterValue));
                copy.unsetParameterValue();
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> uniqueParameterValuel = copy.getParameterValue();
                uniqueParameterValuel.addAll(copyParameterValue);
            } else {
                copy.unsetParameterValue();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TransformationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TransformationType) {
            final TransformationType target = this;
            final TransformationType leftObject = ((TransformationType) left);
            final TransformationType rightObject = ((TransformationType) right);
            {
                JAXBElement<OperationMethodPropertyType> lhsMethod;
                lhsMethod = leftObject.getMethod();
                JAXBElement<OperationMethodPropertyType> rhsMethod;
                rhsMethod = rightObject.getMethod();
                target.setMethod(((JAXBElement<OperationMethodPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "method", lhsMethod), LocatorUtils.property(rightLocator, "method", rhsMethod), lhsMethod, rhsMethod)));
            }
            {
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> lhsParameterValue;
                lhsParameterValue = leftObject.getParameterValue();
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> rhsParameterValue;
                rhsParameterValue = rightObject.getParameterValue();
                target.unsetParameterValue();
                List<JAXBElement<AbstractGeneralParameterValuePropertyType>> uniqueParameterValuel = target.getParameterValue();
                uniqueParameterValuel.addAll(((List<JAXBElement<AbstractGeneralParameterValuePropertyType>> ) strategy.merge(LocatorUtils.property(leftLocator, "parameterValue", lhsParameterValue), LocatorUtils.property(rightLocator, "parameterValue", rhsParameterValue), lhsParameterValue, rhsParameterValue)));
            }
        }
    }

    public void setParameterValue(List<JAXBElement<AbstractGeneralParameterValuePropertyType>> value) {
        List<JAXBElement<AbstractGeneralParameterValuePropertyType>> draftl = this.getParameterValue();
        draftl.addAll(value);
    }

}
