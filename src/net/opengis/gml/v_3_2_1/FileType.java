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
 * <p>Java-Klasse für FileType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}rangeParameters"/>
 *         &lt;choice>
 *           &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           &lt;element name="fileReference" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;element name="fileStructure" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="compression" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileType", propOrder = {
    "rangeParameters",
    "fileName",
    "fileReference",
    "fileStructure",
    "mimeType",
    "compression"
})
public class FileType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected AssociationRoleType rangeParameters;
    @XmlSchemaType(name = "anyURI")
    protected String fileName;
    @XmlSchemaType(name = "anyURI")
    protected String fileReference;
    @XmlElement(required = true)
    protected CodeType fileStructure;
    @XmlSchemaType(name = "anyURI")
    protected String mimeType;
    @XmlSchemaType(name = "anyURI")
    protected String compression;

    /**
     * Ruft den Wert der rangeParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssociationRoleType }
     *     
     */
    public AssociationRoleType getRangeParameters() {
        return rangeParameters;
    }

    /**
     * Legt den Wert der rangeParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationRoleType }
     *     
     */
    public void setRangeParameters(AssociationRoleType value) {
        this.rangeParameters = value;
    }

    public boolean isSetRangeParameters() {
        return (this.rangeParameters!= null);
    }

    /**
     * Ruft den Wert der fileName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Legt den Wert der fileName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    public boolean isSetFileName() {
        return (this.fileName!= null);
    }

    /**
     * Ruft den Wert der fileReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReference() {
        return fileReference;
    }

    /**
     * Legt den Wert der fileReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReference(String value) {
        this.fileReference = value;
    }

    public boolean isSetFileReference() {
        return (this.fileReference!= null);
    }

    /**
     * Ruft den Wert der fileStructure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFileStructure() {
        return fileStructure;
    }

    /**
     * Legt den Wert der fileStructure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFileStructure(CodeType value) {
        this.fileStructure = value;
    }

    public boolean isSetFileStructure() {
        return (this.fileStructure!= null);
    }

    /**
     * Ruft den Wert der mimeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Legt den Wert der mimeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    public boolean isSetMimeType() {
        return (this.mimeType!= null);
    }

    /**
     * Ruft den Wert der compression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompression() {
        return compression;
    }

    /**
     * Legt den Wert der compression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompression(String value) {
        this.compression = value;
    }

    public boolean isSetCompression() {
        return (this.compression!= null);
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
            AssociationRoleType theRangeParameters;
            theRangeParameters = this.getRangeParameters();
            strategy.appendField(locator, this, "rangeParameters", buffer, theRangeParameters);
        }
        {
            String theFileName;
            theFileName = this.getFileName();
            strategy.appendField(locator, this, "fileName", buffer, theFileName);
        }
        {
            String theFileReference;
            theFileReference = this.getFileReference();
            strategy.appendField(locator, this, "fileReference", buffer, theFileReference);
        }
        {
            CodeType theFileStructure;
            theFileStructure = this.getFileStructure();
            strategy.appendField(locator, this, "fileStructure", buffer, theFileStructure);
        }
        {
            String theMimeType;
            theMimeType = this.getMimeType();
            strategy.appendField(locator, this, "mimeType", buffer, theMimeType);
        }
        {
            String theCompression;
            theCompression = this.getCompression();
            strategy.appendField(locator, this, "compression", buffer, theCompression);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FileType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FileType that = ((FileType) object);
        {
            AssociationRoleType lhsRangeParameters;
            lhsRangeParameters = this.getRangeParameters();
            AssociationRoleType rhsRangeParameters;
            rhsRangeParameters = that.getRangeParameters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rangeParameters", lhsRangeParameters), LocatorUtils.property(thatLocator, "rangeParameters", rhsRangeParameters), lhsRangeParameters, rhsRangeParameters)) {
                return false;
            }
        }
        {
            String lhsFileName;
            lhsFileName = this.getFileName();
            String rhsFileName;
            rhsFileName = that.getFileName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileName", lhsFileName), LocatorUtils.property(thatLocator, "fileName", rhsFileName), lhsFileName, rhsFileName)) {
                return false;
            }
        }
        {
            String lhsFileReference;
            lhsFileReference = this.getFileReference();
            String rhsFileReference;
            rhsFileReference = that.getFileReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileReference", lhsFileReference), LocatorUtils.property(thatLocator, "fileReference", rhsFileReference), lhsFileReference, rhsFileReference)) {
                return false;
            }
        }
        {
            CodeType lhsFileStructure;
            lhsFileStructure = this.getFileStructure();
            CodeType rhsFileStructure;
            rhsFileStructure = that.getFileStructure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileStructure", lhsFileStructure), LocatorUtils.property(thatLocator, "fileStructure", rhsFileStructure), lhsFileStructure, rhsFileStructure)) {
                return false;
            }
        }
        {
            String lhsMimeType;
            lhsMimeType = this.getMimeType();
            String rhsMimeType;
            rhsMimeType = that.getMimeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mimeType", lhsMimeType), LocatorUtils.property(thatLocator, "mimeType", rhsMimeType), lhsMimeType, rhsMimeType)) {
                return false;
            }
        }
        {
            String lhsCompression;
            lhsCompression = this.getCompression();
            String rhsCompression;
            rhsCompression = that.getCompression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compression", lhsCompression), LocatorUtils.property(thatLocator, "compression", rhsCompression), lhsCompression, rhsCompression)) {
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
            AssociationRoleType theRangeParameters;
            theRangeParameters = this.getRangeParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rangeParameters", theRangeParameters), currentHashCode, theRangeParameters);
        }
        {
            String theFileName;
            theFileName = this.getFileName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileName", theFileName), currentHashCode, theFileName);
        }
        {
            String theFileReference;
            theFileReference = this.getFileReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileReference", theFileReference), currentHashCode, theFileReference);
        }
        {
            CodeType theFileStructure;
            theFileStructure = this.getFileStructure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileStructure", theFileStructure), currentHashCode, theFileStructure);
        }
        {
            String theMimeType;
            theMimeType = this.getMimeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mimeType", theMimeType), currentHashCode, theMimeType);
        }
        {
            String theCompression;
            theCompression = this.getCompression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compression", theCompression), currentHashCode, theCompression);
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
        if (draftCopy instanceof FileType) {
            final FileType copy = ((FileType) draftCopy);
            if (this.isSetRangeParameters()) {
                AssociationRoleType sourceRangeParameters;
                sourceRangeParameters = this.getRangeParameters();
                AssociationRoleType copyRangeParameters = ((AssociationRoleType) strategy.copy(LocatorUtils.property(locator, "rangeParameters", sourceRangeParameters), sourceRangeParameters));
                copy.setRangeParameters(copyRangeParameters);
            } else {
                copy.rangeParameters = null;
            }
            if (this.isSetFileName()) {
                String sourceFileName;
                sourceFileName = this.getFileName();
                String copyFileName = ((String) strategy.copy(LocatorUtils.property(locator, "fileName", sourceFileName), sourceFileName));
                copy.setFileName(copyFileName);
            } else {
                copy.fileName = null;
            }
            if (this.isSetFileReference()) {
                String sourceFileReference;
                sourceFileReference = this.getFileReference();
                String copyFileReference = ((String) strategy.copy(LocatorUtils.property(locator, "fileReference", sourceFileReference), sourceFileReference));
                copy.setFileReference(copyFileReference);
            } else {
                copy.fileReference = null;
            }
            if (this.isSetFileStructure()) {
                CodeType sourceFileStructure;
                sourceFileStructure = this.getFileStructure();
                CodeType copyFileStructure = ((CodeType) strategy.copy(LocatorUtils.property(locator, "fileStructure", sourceFileStructure), sourceFileStructure));
                copy.setFileStructure(copyFileStructure);
            } else {
                copy.fileStructure = null;
            }
            if (this.isSetMimeType()) {
                String sourceMimeType;
                sourceMimeType = this.getMimeType();
                String copyMimeType = ((String) strategy.copy(LocatorUtils.property(locator, "mimeType", sourceMimeType), sourceMimeType));
                copy.setMimeType(copyMimeType);
            } else {
                copy.mimeType = null;
            }
            if (this.isSetCompression()) {
                String sourceCompression;
                sourceCompression = this.getCompression();
                String copyCompression = ((String) strategy.copy(LocatorUtils.property(locator, "compression", sourceCompression), sourceCompression));
                copy.setCompression(copyCompression);
            } else {
                copy.compression = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FileType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof FileType) {
            final FileType target = this;
            final FileType leftObject = ((FileType) left);
            final FileType rightObject = ((FileType) right);
            {
                AssociationRoleType lhsRangeParameters;
                lhsRangeParameters = leftObject.getRangeParameters();
                AssociationRoleType rhsRangeParameters;
                rhsRangeParameters = rightObject.getRangeParameters();
                target.setRangeParameters(((AssociationRoleType) strategy.merge(LocatorUtils.property(leftLocator, "rangeParameters", lhsRangeParameters), LocatorUtils.property(rightLocator, "rangeParameters", rhsRangeParameters), lhsRangeParameters, rhsRangeParameters)));
            }
            {
                String lhsFileName;
                lhsFileName = leftObject.getFileName();
                String rhsFileName;
                rhsFileName = rightObject.getFileName();
                target.setFileName(((String) strategy.merge(LocatorUtils.property(leftLocator, "fileName", lhsFileName), LocatorUtils.property(rightLocator, "fileName", rhsFileName), lhsFileName, rhsFileName)));
            }
            {
                String lhsFileReference;
                lhsFileReference = leftObject.getFileReference();
                String rhsFileReference;
                rhsFileReference = rightObject.getFileReference();
                target.setFileReference(((String) strategy.merge(LocatorUtils.property(leftLocator, "fileReference", lhsFileReference), LocatorUtils.property(rightLocator, "fileReference", rhsFileReference), lhsFileReference, rhsFileReference)));
            }
            {
                CodeType lhsFileStructure;
                lhsFileStructure = leftObject.getFileStructure();
                CodeType rhsFileStructure;
                rhsFileStructure = rightObject.getFileStructure();
                target.setFileStructure(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "fileStructure", lhsFileStructure), LocatorUtils.property(rightLocator, "fileStructure", rhsFileStructure), lhsFileStructure, rhsFileStructure)));
            }
            {
                String lhsMimeType;
                lhsMimeType = leftObject.getMimeType();
                String rhsMimeType;
                rhsMimeType = rightObject.getMimeType();
                target.setMimeType(((String) strategy.merge(LocatorUtils.property(leftLocator, "mimeType", lhsMimeType), LocatorUtils.property(rightLocator, "mimeType", rhsMimeType), lhsMimeType, rhsMimeType)));
            }
            {
                String lhsCompression;
                lhsCompression = leftObject.getCompression();
                String rhsCompression;
                rhsCompression = rightObject.getCompression();
                target.setCompression(((String) strategy.merge(LocatorUtils.property(leftLocator, "compression", lhsCompression), LocatorUtils.property(rightLocator, "compression", rhsCompression), lhsCompression, rhsCompression)));
            }
        }
    }

}
