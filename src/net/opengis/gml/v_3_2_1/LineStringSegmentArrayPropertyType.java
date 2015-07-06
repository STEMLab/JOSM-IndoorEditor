//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
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
 * gml:LineStringSegmentArrayPropertyType provides a container for line strings.
 * 
 * <p>Java-Klasse für LineStringSegmentArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LineStringSegmentArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}LineStringSegment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineStringSegmentArrayPropertyType", propOrder = {
    "lineStringSegment"
})
public class LineStringSegmentArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "LineStringSegment")
    protected List<LineStringSegmentType> lineStringSegment;

    /**
     * Gets the value of the lineStringSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineStringSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineStringSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineStringSegmentType }
     * 
     * 
     */
    public List<LineStringSegmentType> getLineStringSegment() {
        if (lineStringSegment == null) {
            lineStringSegment = new ArrayList<LineStringSegmentType>();
        }
        return this.lineStringSegment;
    }

    public boolean isSetLineStringSegment() {
        return ((this.lineStringSegment!= null)&&(!this.lineStringSegment.isEmpty()));
    }

    public void unsetLineStringSegment() {
        this.lineStringSegment = null;
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
            List<LineStringSegmentType> theLineStringSegment;
            theLineStringSegment = this.getLineStringSegment();
            strategy.appendField(locator, this, "lineStringSegment", buffer, theLineStringSegment);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LineStringSegmentArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LineStringSegmentArrayPropertyType that = ((LineStringSegmentArrayPropertyType) object);
        {
            List<LineStringSegmentType> lhsLineStringSegment;
            lhsLineStringSegment = this.getLineStringSegment();
            List<LineStringSegmentType> rhsLineStringSegment;
            rhsLineStringSegment = that.getLineStringSegment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineStringSegment", lhsLineStringSegment), LocatorUtils.property(thatLocator, "lineStringSegment", rhsLineStringSegment), lhsLineStringSegment, rhsLineStringSegment)) {
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
            List<LineStringSegmentType> theLineStringSegment;
            theLineStringSegment = this.getLineStringSegment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineStringSegment", theLineStringSegment), currentHashCode, theLineStringSegment);
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
        if (draftCopy instanceof LineStringSegmentArrayPropertyType) {
            final LineStringSegmentArrayPropertyType copy = ((LineStringSegmentArrayPropertyType) draftCopy);
            if (this.isSetLineStringSegment()) {
                List<LineStringSegmentType> sourceLineStringSegment;
                sourceLineStringSegment = this.getLineStringSegment();
                @SuppressWarnings("unchecked")
                List<LineStringSegmentType> copyLineStringSegment = ((List<LineStringSegmentType> ) strategy.copy(LocatorUtils.property(locator, "lineStringSegment", sourceLineStringSegment), sourceLineStringSegment));
                copy.unsetLineStringSegment();
                List<LineStringSegmentType> uniqueLineStringSegmentl = copy.getLineStringSegment();
                uniqueLineStringSegmentl.addAll(copyLineStringSegment);
            } else {
                copy.unsetLineStringSegment();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LineStringSegmentArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof LineStringSegmentArrayPropertyType) {
            final LineStringSegmentArrayPropertyType target = this;
            final LineStringSegmentArrayPropertyType leftObject = ((LineStringSegmentArrayPropertyType) left);
            final LineStringSegmentArrayPropertyType rightObject = ((LineStringSegmentArrayPropertyType) right);
            {
                List<LineStringSegmentType> lhsLineStringSegment;
                lhsLineStringSegment = leftObject.getLineStringSegment();
                List<LineStringSegmentType> rhsLineStringSegment;
                rhsLineStringSegment = rightObject.getLineStringSegment();
                target.unsetLineStringSegment();
                List<LineStringSegmentType> uniqueLineStringSegmentl = target.getLineStringSegment();
                uniqueLineStringSegmentl.addAll(((List<LineStringSegmentType> ) strategy.merge(LocatorUtils.property(leftLocator, "lineStringSegment", lhsLineStringSegment), LocatorUtils.property(rightLocator, "lineStringSegment", rhsLineStringSegment), lhsLineStringSegment, rhsLineStringSegment)));
            }
        }
    }

    public void setLineStringSegment(List<LineStringSegmentType> value) {
        List<LineStringSegmentType> draftl = this.getLineStringSegment();
        draftl.addAll(value);
    }

}
