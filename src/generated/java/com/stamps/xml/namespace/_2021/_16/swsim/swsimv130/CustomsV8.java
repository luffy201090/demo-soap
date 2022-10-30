
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomsV8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsV8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ContentTypeV2"/&gt;
 *         &lt;element name="Comments" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-76" minOccurs="0"/&gt;
 *         &lt;element name="LicenseNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-16" minOccurs="0"/&gt;
 *         &lt;element name="CertificateNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-12" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-15" minOccurs="0"/&gt;
 *         &lt;element name="OtherDescribe" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-20" minOccurs="0"/&gt;
 *         &lt;element name="CustomsLines" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfCustomsLine"/&gt;
 *         &lt;element name="CustomsSigner" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-2-100" minOccurs="0"/&gt;
 *         &lt;element name="PassportNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="PassportIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PassportExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ImportLicenseNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="SendersCustomsReference" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-14" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsV8", propOrder = {
    "contentType",
    "comments",
    "licenseNumber",
    "certificateNumber",
    "invoiceNumber",
    "otherDescribe",
    "customsLines",
    "customsSigner",
    "passportNumber",
    "passportIssueDate",
    "passportExpiryDate",
    "importLicenseNumber",
    "sendersCustomsReference"
})
public class CustomsV8 {

    @XmlElement(name = "ContentType", required = true)
    @XmlSchemaType(name = "string")
    protected ContentTypeV2 contentType;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "CertificateNumber")
    protected String certificateNumber;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "OtherDescribe")
    protected String otherDescribe;
    @XmlElement(name = "CustomsLines", required = true)
    protected ArrayOfCustomsLine customsLines;
    @XmlElement(name = "CustomsSigner")
    protected String customsSigner;
    @XmlElement(name = "PassportNumber")
    protected String passportNumber;
    @XmlElement(name = "PassportIssueDate", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar passportIssueDate;
    @XmlElement(name = "PassportExpiryDate", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar passportExpiryDate;
    @XmlElement(name = "ImportLicenseNumber")
    protected String importLicenseNumber;
    @XmlElement(name = "SendersCustomsReference")
    protected String sendersCustomsReference;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link ContentTypeV2 }
     *     
     */
    public ContentTypeV2 getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTypeV2 }
     *     
     */
    public void setContentType(ContentTypeV2 value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the otherDescribe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDescribe() {
        return otherDescribe;
    }

    /**
     * Sets the value of the otherDescribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDescribe(String value) {
        this.otherDescribe = value;
    }

    /**
     * Gets the value of the customsLines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomsLine }
     *     
     */
    public ArrayOfCustomsLine getCustomsLines() {
        return customsLines;
    }

    /**
     * Sets the value of the customsLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomsLine }
     *     
     */
    public void setCustomsLines(ArrayOfCustomsLine value) {
        this.customsLines = value;
    }

    /**
     * Gets the value of the customsSigner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsSigner() {
        return customsSigner;
    }

    /**
     * Sets the value of the customsSigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsSigner(String value) {
        this.customsSigner = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the passportIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportIssueDate() {
        return passportIssueDate;
    }

    /**
     * Sets the value of the passportIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportIssueDate(XMLGregorianCalendar value) {
        this.passportIssueDate = value;
    }

    /**
     * Gets the value of the passportExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportExpiryDate() {
        return passportExpiryDate;
    }

    /**
     * Sets the value of the passportExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportExpiryDate(XMLGregorianCalendar value) {
        this.passportExpiryDate = value;
    }

    /**
     * Gets the value of the importLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportLicenseNumber() {
        return importLicenseNumber;
    }

    /**
     * Sets the value of the importLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportLicenseNumber(String value) {
        this.importLicenseNumber = value;
    }

    /**
     * Gets the value of the sendersCustomsReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendersCustomsReference() {
        return sendersCustomsReference;
    }

    /**
     * Sets the value of the sendersCustomsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendersCustomsReference(String value) {
        this.sendersCustomsReference = value;
    }

}
