
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="Credentials" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Credentials" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="IntegratorTxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StampsTxIds" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfGuid" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumbers" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PrintLayout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromAddress" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Address"/&gt;
 *         &lt;element name="ImageType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ImageType"/&gt;
 *         &lt;element name="PrintInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ManifestType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ManifestType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLabels" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authenticator",
    "credentials",
    "integratorTxID",
    "stampsTxIds",
    "trackingNumbers",
    "shipDate",
    "printLayout",
    "fromAddress",
    "imageType",
    "printInstructions",
    "manifestType",
    "numberOfLabels"
})
@XmlRootElement(name = "CreateManifest")
public class CreateManifest {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "IntegratorTxID")
    protected String integratorTxID;
    @XmlElement(name = "StampsTxIds")
    protected ArrayOfGuid stampsTxIds;
    @XmlElement(name = "TrackingNumbers")
    protected ArrayOfString trackingNumbers;
    @XmlElementRef(name = "ShipDate", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> shipDate;
    @XmlElement(name = "PrintLayout", defaultValue = "Normal")
    protected String printLayout;
    @XmlElement(name = "FromAddress", required = true)
    protected Address fromAddress;
    @XmlElement(name = "ImageType", required = true)
    @XmlSchemaType(name = "string")
    protected ImageType imageType;
    @XmlElement(name = "PrintInstructions")
    protected boolean printInstructions;
    @XmlElement(name = "ManifestType", defaultValue = "ScanForm")
    @XmlSchemaType(name = "string")
    protected ManifestType manifestType;
    @XmlElement(name = "NumberOfLabels", defaultValue = "0")
    protected Integer numberOfLabels;

    /**
     * Gets the value of the authenticator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticator() {
        return authenticator;
    }

    /**
     * Sets the value of the authenticator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticator(String value) {
        this.authenticator = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredentials(Credentials value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the integratorTxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratorTxID() {
        return integratorTxID;
    }

    /**
     * Sets the value of the integratorTxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratorTxID(String value) {
        this.integratorTxID = value;
    }

    /**
     * Gets the value of the stampsTxIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getStampsTxIds() {
        return stampsTxIds;
    }

    /**
     * Sets the value of the stampsTxIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setStampsTxIds(ArrayOfGuid value) {
        this.stampsTxIds = value;
    }

    /**
     * Gets the value of the trackingNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTrackingNumbers() {
        return trackingNumbers;
    }

    /**
     * Sets the value of the trackingNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTrackingNumbers(ArrayOfString value) {
        this.trackingNumbers = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setShipDate(JAXBElement<XMLGregorianCalendar> value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the printLayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintLayout() {
        return printLayout;
    }

    /**
     * Sets the value of the printLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintLayout(String value) {
        this.printLayout = value;
    }

    /**
     * Gets the value of the fromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setFromAddress(Address value) {
        this.fromAddress = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImageType(ImageType value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the printInstructions property.
     * 
     */
    public boolean isPrintInstructions() {
        return printInstructions;
    }

    /**
     * Sets the value of the printInstructions property.
     * 
     */
    public void setPrintInstructions(boolean value) {
        this.printInstructions = value;
    }

    /**
     * Gets the value of the manifestType property.
     * 
     * @return
     *     possible object is
     *     {@link ManifestType }
     *     
     */
    public ManifestType getManifestType() {
        return manifestType;
    }

    /**
     * Sets the value of the manifestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestType }
     *     
     */
    public void setManifestType(ManifestType value) {
        this.manifestType = value;
    }

    /**
     * Gets the value of the numberOfLabels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfLabels() {
        return numberOfLabels;
    }

    /**
     * Sets the value of the numberOfLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfLabels(Integer value) {
        this.numberOfLabels = value;
    }

}
