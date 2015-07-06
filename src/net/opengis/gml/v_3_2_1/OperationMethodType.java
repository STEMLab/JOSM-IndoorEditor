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
 * <p>Java-Klasse für OperationMethodType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OperationMethodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}formulaCitation"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}formula"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}sourceDimensions" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}targetDimensions" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationMethodType", propOrder = {
    "formulaCitation",
    "formula",
    "sourceDimensions",
    "targetDimensions",
    "parameter"
})
public class OperationMethodType
    extends IdentifiedObjectType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected FormulaCitationElement formulaCitation;
    @XmlElementRef(name = "formula", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CodeType> formula;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sourceDimensions;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger targetDimensions;
    @XmlElementRef(name = "parameter", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> parameter;

    /**
     * Ruft den Wert der formulaCitation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FormulaCitationElement }
     *     
     */
    public FormulaCitationElement getFormulaCitation() {
        return formulaCitation;
    }

    /**
     * Legt den Wert der formulaCitation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaCitationElement }
     *     
     */
    public void setFormulaCitation(FormulaCitationElement value) {
        this.formulaCitation = value;
    }

    public boolean isSetFormulaCitation() {
        return (this.formulaCitation!= null);
    }

    /**
     * Ruft den Wert der formula-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public JAXBElement<CodeType> getFormula() {
        return formula;
    }

    /**
     * Legt den Wert der formula-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public void setFormula(JAXBElement<CodeType> value) {
        this.formula = value;
    }

    public boolean isSetFormula() {
        return (this.formula!= null);
    }

    /**
     * Ruft den Wert der sourceDimensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceDimensions() {
        return sourceDimensions;
    }

    /**
     * Legt den Wert der sourceDimensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceDimensions(BigInteger value) {
        this.sourceDimensions = value;
    }

    public boolean isSetSourceDimensions() {
        return (this.sourceDimensions!= null);
    }

    /**
     * Ruft den Wert der targetDimensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetDimensions() {
        return targetDimensions;
    }

    /**
     * Legt den Wert der targetDimensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetDimensions(BigInteger value) {
        this.targetDimensions = value;
    }

    public boolean isSetTargetDimensions() {
        return (this.targetDimensions!= null);
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
            FormulaCitationElement theFormulaCitation;
            theFormulaCitation = this.getFormulaCitation();
            strategy.appendField(locator, this, "formulaCitation", buffer, theFormulaCitation);
        }
        {
            JAXBElement<CodeType> theFormula;
            theFormula = this.getFormula();
            strategy.appendField(locator, this, "formula", buffer, theFormula);
        }
        {
            BigInteger theSourceDimensions;
            theSourceDimensions = this.getSourceDimensions();
            strategy.appendField(locator, this, "sourceDimensions", buffer, theSourceDimensions);
        }
        {
            BigInteger theTargetDimensions;
            theTargetDimensions = this.getTargetDimensions();
            strategy.appendField(locator, this, "targetDimensions", buffer, theTargetDimensions);
        }
        {
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> theParameter;
            theParameter = this.getParameter();
            strategy.appendField(locator, this, "parameter", buffer, theParameter);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OperationMethodType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OperationMethodType that = ((OperationMethodType) object);
        {
            FormulaCitationElement lhsFormulaCitation;
            lhsFormulaCitation = this.getFormulaCitation();
            FormulaCitationElement rhsFormulaCitation;
            rhsFormulaCitation = that.getFormulaCitation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formulaCitation", lhsFormulaCitation), LocatorUtils.property(thatLocator, "formulaCitation", rhsFormulaCitation), lhsFormulaCitation, rhsFormulaCitation)) {
                return false;
            }
        }
        {
            JAXBElement<CodeType> lhsFormula;
            lhsFormula = this.getFormula();
            JAXBElement<CodeType> rhsFormula;
            rhsFormula = that.getFormula();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formula", lhsFormula), LocatorUtils.property(thatLocator, "formula", rhsFormula), lhsFormula, rhsFormula)) {
                return false;
            }
        }
        {
            BigInteger lhsSourceDimensions;
            lhsSourceDimensions = this.getSourceDimensions();
            BigInteger rhsSourceDimensions;
            rhsSourceDimensions = that.getSourceDimensions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceDimensions", lhsSourceDimensions), LocatorUtils.property(thatLocator, "sourceDimensions", rhsSourceDimensions), lhsSourceDimensions, rhsSourceDimensions)) {
                return false;
            }
        }
        {
            BigInteger lhsTargetDimensions;
            lhsTargetDimensions = this.getTargetDimensions();
            BigInteger rhsTargetDimensions;
            rhsTargetDimensions = that.getTargetDimensions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetDimensions", lhsTargetDimensions), LocatorUtils.property(thatLocator, "targetDimensions", rhsTargetDimensions), lhsTargetDimensions, rhsTargetDimensions)) {
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
            FormulaCitationElement theFormulaCitation;
            theFormulaCitation = this.getFormulaCitation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formulaCitation", theFormulaCitation), currentHashCode, theFormulaCitation);
        }
        {
            JAXBElement<CodeType> theFormula;
            theFormula = this.getFormula();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formula", theFormula), currentHashCode, theFormula);
        }
        {
            BigInteger theSourceDimensions;
            theSourceDimensions = this.getSourceDimensions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceDimensions", theSourceDimensions), currentHashCode, theSourceDimensions);
        }
        {
            BigInteger theTargetDimensions;
            theTargetDimensions = this.getTargetDimensions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetDimensions", theTargetDimensions), currentHashCode, theTargetDimensions);
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
        if (draftCopy instanceof OperationMethodType) {
            final OperationMethodType copy = ((OperationMethodType) draftCopy);
            if (this.isSetFormulaCitation()) {
                FormulaCitationElement sourceFormulaCitation;
                sourceFormulaCitation = this.getFormulaCitation();
                FormulaCitationElement copyFormulaCitation = ((FormulaCitationElement) strategy.copy(LocatorUtils.property(locator, "formulaCitation", sourceFormulaCitation), sourceFormulaCitation));
                copy.setFormulaCitation(copyFormulaCitation);
            } else {
                copy.formulaCitation = null;
            }
            if (this.isSetFormula()) {
                JAXBElement<CodeType> sourceFormula;
                sourceFormula = this.getFormula();
                @SuppressWarnings("unchecked")
                JAXBElement<CodeType> copyFormula = ((JAXBElement<CodeType> ) strategy.copy(LocatorUtils.property(locator, "formula", sourceFormula), sourceFormula));
                copy.setFormula(copyFormula);
            } else {
                copy.formula = null;
            }
            if (this.isSetSourceDimensions()) {
                BigInteger sourceSourceDimensions;
                sourceSourceDimensions = this.getSourceDimensions();
                BigInteger copySourceDimensions = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "sourceDimensions", sourceSourceDimensions), sourceSourceDimensions));
                copy.setSourceDimensions(copySourceDimensions);
            } else {
                copy.sourceDimensions = null;
            }
            if (this.isSetTargetDimensions()) {
                BigInteger sourceTargetDimensions;
                sourceTargetDimensions = this.getTargetDimensions();
                BigInteger copyTargetDimensions = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "targetDimensions", sourceTargetDimensions), sourceTargetDimensions));
                copy.setTargetDimensions(copyTargetDimensions);
            } else {
                copy.targetDimensions = null;
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
        return new OperationMethodType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof OperationMethodType) {
            final OperationMethodType target = this;
            final OperationMethodType leftObject = ((OperationMethodType) left);
            final OperationMethodType rightObject = ((OperationMethodType) right);
            {
                FormulaCitationElement lhsFormulaCitation;
                lhsFormulaCitation = leftObject.getFormulaCitation();
                FormulaCitationElement rhsFormulaCitation;
                rhsFormulaCitation = rightObject.getFormulaCitation();
                target.setFormulaCitation(((FormulaCitationElement) strategy.merge(LocatorUtils.property(leftLocator, "formulaCitation", lhsFormulaCitation), LocatorUtils.property(rightLocator, "formulaCitation", rhsFormulaCitation), lhsFormulaCitation, rhsFormulaCitation)));
            }
            {
                JAXBElement<CodeType> lhsFormula;
                lhsFormula = leftObject.getFormula();
                JAXBElement<CodeType> rhsFormula;
                rhsFormula = rightObject.getFormula();
                target.setFormula(((JAXBElement<CodeType> ) strategy.merge(LocatorUtils.property(leftLocator, "formula", lhsFormula), LocatorUtils.property(rightLocator, "formula", rhsFormula), lhsFormula, rhsFormula)));
            }
            {
                BigInteger lhsSourceDimensions;
                lhsSourceDimensions = leftObject.getSourceDimensions();
                BigInteger rhsSourceDimensions;
                rhsSourceDimensions = rightObject.getSourceDimensions();
                target.setSourceDimensions(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "sourceDimensions", lhsSourceDimensions), LocatorUtils.property(rightLocator, "sourceDimensions", rhsSourceDimensions), lhsSourceDimensions, rhsSourceDimensions)));
            }
            {
                BigInteger lhsTargetDimensions;
                lhsTargetDimensions = leftObject.getTargetDimensions();
                BigInteger rhsTargetDimensions;
                rhsTargetDimensions = rightObject.getTargetDimensions();
                target.setTargetDimensions(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "targetDimensions", lhsTargetDimensions), LocatorUtils.property(rightLocator, "targetDimensions", rhsTargetDimensions), lhsTargetDimensions, rhsTargetDimensions)));
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
