
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReprintIndiciumRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReprintIndiciumRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="Credentials" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Credentials" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="IntegratorTxId" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-128" minOccurs="0"/&gt;
 *         &lt;element name="StampsTxId" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-128" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-128" minOccurs="0"/&gt;
 *         &lt;element name="ImageType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ImageType" minOccurs="0"/&gt;
 *         &lt;element name="ImageDpi" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ImageDpi" minOccurs="0"/&gt;
 *         &lt;element name="EltronPrinterDpiType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}EltronPrinterDPIType" minOccurs="0"/&gt;
 *         &lt;element name="RotationDegrees" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HorizontalOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VerticalOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrintDensity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PaperSize" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PaperSizeV1" minOccurs="0"/&gt;
 *         &lt;element name="StartRow" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StartColumn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReturnImageData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReturnIndiciumData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReprintIndiciumRequest", propOrder = {
    "authenticator",
    "credentials",
    "integratorTxId",
    "stampsTxId",
    "trackingNumber",
    "imageType",
    "imageDpi",
    "eltronPrinterDpiType",
    "rotationDegrees",
    "horizontalOffset",
    "verticalOffset",
    "printDensity",
    "paperSize",
    "startRow",
    "startColumn",
    "returnImageData",
    "returnIndiciumData"
})
public class ReprintIndiciumRequest {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "IntegratorTxId")
    protected String integratorTxId;
    @XmlElement(name = "StampsTxId")
    protected String stampsTxId;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "ImageType", defaultValue = "Auto")
    @XmlSchemaType(name = "string")
    protected ImageType imageType;
    @XmlElement(name = "ImageDpi", defaultValue = "ImageDpiDefault")
    @XmlSchemaType(name = "string")
    protected ImageDpi imageDpi;
    @XmlElement(name = "EltronPrinterDpiType", defaultValue = "Default")
    @XmlSchemaType(name = "string")
    protected EltronPrinterDPIType eltronPrinterDpiType;
    @XmlElement(name = "RotationDegrees")
    protected int rotationDegrees;
    @XmlElement(name = "HorizontalOffset", defaultValue = "-1")
    protected Integer horizontalOffset;
    @XmlElement(name = "VerticalOffset", defaultValue = "-1")
    protected Integer verticalOffset;
    @XmlElement(name = "PrintDensity", defaultValue = "-1")
    protected Integer printDensity;
    @XmlElement(name = "PaperSize", defaultValue = "Default")
    @XmlSchemaType(name = "string")
    protected PaperSizeV1 paperSize;
    @XmlElement(name = "StartRow")
    protected int startRow;
    @XmlElement(name = "StartColumn")
    protected int startColumn;
    @XmlElement(name = "ReturnImageData", defaultValue = "false")
    protected Boolean returnImageData;
    @XmlElement(name = "ReturnIndiciumData", defaultValue = "false")
    protected Boolean returnIndiciumData;

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
     * Gets the value of the integratorTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratorTxId() {
        return integratorTxId;
    }

    /**
     * Sets the value of the integratorTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratorTxId(String value) {
        this.integratorTxId = value;
    }

    /**
     * Gets the value of the stampsTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStampsTxId() {
        return stampsTxId;
    }

    /**
     * Sets the value of the stampsTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStampsTxId(String value) {
        this.stampsTxId = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
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
     * Gets the value of the imageDpi property.
     * 
     * @return
     *     possible object is
     *     {@link ImageDpi }
     *     
     */
    public ImageDpi getImageDpi() {
        return imageDpi;
    }

    /**
     * Sets the value of the imageDpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDpi }
     *     
     */
    public void setImageDpi(ImageDpi value) {
        this.imageDpi = value;
    }

    /**
     * Gets the value of the eltronPrinterDpiType property.
     * 
     * @return
     *     possible object is
     *     {@link EltronPrinterDPIType }
     *     
     */
    public EltronPrinterDPIType getEltronPrinterDpiType() {
        return eltronPrinterDpiType;
    }

    /**
     * Sets the value of the eltronPrinterDpiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EltronPrinterDPIType }
     *     
     */
    public void setEltronPrinterDpiType(EltronPrinterDPIType value) {
        this.eltronPrinterDpiType = value;
    }

    /**
     * Gets the value of the rotationDegrees property.
     * 
     */
    public int getRotationDegrees() {
        return rotationDegrees;
    }

    /**
     * Sets the value of the rotationDegrees property.
     * 
     */
    public void setRotationDegrees(int value) {
        this.rotationDegrees = value;
    }

    /**
     * Gets the value of the horizontalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorizontalOffset() {
        return horizontalOffset;
    }

    /**
     * Sets the value of the horizontalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorizontalOffset(Integer value) {
        this.horizontalOffset = value;
    }

    /**
     * Gets the value of the verticalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVerticalOffset() {
        return verticalOffset;
    }

    /**
     * Sets the value of the verticalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVerticalOffset(Integer value) {
        this.verticalOffset = value;
    }

    /**
     * Gets the value of the printDensity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrintDensity() {
        return printDensity;
    }

    /**
     * Sets the value of the printDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrintDensity(Integer value) {
        this.printDensity = value;
    }

    /**
     * Gets the value of the paperSize property.
     * 
     * @return
     *     possible object is
     *     {@link PaperSizeV1 }
     *     
     */
    public PaperSizeV1 getPaperSize() {
        return paperSize;
    }

    /**
     * Sets the value of the paperSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperSizeV1 }
     *     
     */
    public void setPaperSize(PaperSizeV1 value) {
        this.paperSize = value;
    }

    /**
     * Gets the value of the startRow property.
     * 
     */
    public int getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     * 
     */
    public void setStartRow(int value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the startColumn property.
     * 
     */
    public int getStartColumn() {
        return startColumn;
    }

    /**
     * Sets the value of the startColumn property.
     * 
     */
    public void setStartColumn(int value) {
        this.startColumn = value;
    }

    /**
     * Gets the value of the returnImageData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnImageData() {
        return returnImageData;
    }

    /**
     * Sets the value of the returnImageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnImageData(Boolean value) {
        this.returnImageData = value;
    }

    /**
     * Gets the value of the returnIndiciumData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnIndiciumData() {
        return returnIndiciumData;
    }

    /**
     * Sets the value of the returnIndiciumData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnIndiciumData(Boolean value) {
        this.returnIndiciumData = value;
    }

}
