//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java-Klasse für DiscreteCoverageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DiscreteCoverageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCoverageType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}coverageFunction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscreteCoverageType", propOrder = {
    "coverageFunction"
})
public class DiscreteCoverageType
    extends AbstractCoverageType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected CoverageFunctionType coverageFunction;

    /**
     * Ruft den Wert der coverageFunction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoverageFunctionType }
     *     
     */
    public CoverageFunctionType getCoverageFunction() {
        return coverageFunction;
    }

    /**
     * Legt den Wert der coverageFunction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageFunctionType }
     *     
     */
    public void setCoverageFunction(CoverageFunctionType value) {
        this.coverageFunction = value;
    }

    public boolean isSetCoverageFunction() {
        return (this.coverageFunction!= null);
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
            CoverageFunctionType theCoverageFunction;
            theCoverageFunction = this.getCoverageFunction();
            strategy.appendField(locator, this, "coverageFunction", buffer, theCoverageFunction);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DiscreteCoverageType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DiscreteCoverageType that = ((DiscreteCoverageType) object);
        {
            CoverageFunctionType lhsCoverageFunction;
            lhsCoverageFunction = this.getCoverageFunction();
            CoverageFunctionType rhsCoverageFunction;
            rhsCoverageFunction = that.getCoverageFunction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coverageFunction", lhsCoverageFunction), LocatorUtils.property(thatLocator, "coverageFunction", rhsCoverageFunction), lhsCoverageFunction, rhsCoverageFunction)) {
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
            CoverageFunctionType theCoverageFunction;
            theCoverageFunction = this.getCoverageFunction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coverageFunction", theCoverageFunction), currentHashCode, theCoverageFunction);
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
        if (draftCopy instanceof DiscreteCoverageType) {
            final DiscreteCoverageType copy = ((DiscreteCoverageType) draftCopy);
            if (this.isSetCoverageFunction()) {
                CoverageFunctionType sourceCoverageFunction;
                sourceCoverageFunction = this.getCoverageFunction();
                CoverageFunctionType copyCoverageFunction = ((CoverageFunctionType) strategy.copy(LocatorUtils.property(locator, "coverageFunction", sourceCoverageFunction), sourceCoverageFunction));
                copy.setCoverageFunction(copyCoverageFunction);
            } else {
                copy.coverageFunction = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DiscreteCoverageType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof DiscreteCoverageType) {
            final DiscreteCoverageType target = this;
            final DiscreteCoverageType leftObject = ((DiscreteCoverageType) left);
            final DiscreteCoverageType rightObject = ((DiscreteCoverageType) right);
            {
                CoverageFunctionType lhsCoverageFunction;
                lhsCoverageFunction = leftObject.getCoverageFunction();
                CoverageFunctionType rhsCoverageFunction;
                rhsCoverageFunction = rightObject.getCoverageFunction();
                target.setCoverageFunction(((CoverageFunctionType) strategy.merge(LocatorUtils.property(leftLocator, "coverageFunction", lhsCoverageFunction), LocatorUtils.property(rightLocator, "coverageFunction", rhsCoverageFunction), lhsCoverageFunction, rhsCoverageFunction)));
            }
        }
    }

}
