
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="IntegratorTxId" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-128"/&gt;
 *         &lt;element name="Layout" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-128"/&gt;
 *         &lt;element name="PrintToAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartRow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StartColumn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IndiciumInfo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfIndiciumInfoV38"/&gt;
 *         &lt;element name="Mode" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CreateIndiciumModeV1" minOccurs="0"/&gt;
 *         &lt;element name="ImageType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ImageType" minOccurs="0"/&gt;
 *         &lt;element name="RateToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-150" minOccurs="0"/&gt;
 *         &lt;element name="BypassCleanseAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Reference1" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-100" minOccurs="0"/&gt;
 *         &lt;element name="Reference2" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-100" minOccurs="0"/&gt;
 *         &lt;element name="Reference3" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-100" minOccurs="0"/&gt;
 *         &lt;element name="Reference4" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-100" minOccurs="0"/&gt;
 *         &lt;element name="ReturnIndiciumData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedPostageInfo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ExtendedPostageInfoV1" minOccurs="0"/&gt;
 *         &lt;element name="ImageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrintFromAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "integratorTxId",
    "layout",
    "printToAddress",
    "startRow",
    "startColumn",
    "indiciumInfo",
    "mode",
    "imageType",
    "rateToken",
    "memo",
    "bypassCleanseAddress",
    "reference1",
    "reference2",
    "reference3",
    "reference4",
    "returnIndiciumData",
    "extendedPostageInfo",
    "imageId",
    "printFromAddress"
})
@XmlRootElement(name = "CreateMailingLabelIndicia")
public class CreateMailingLabelIndicia {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "IntegratorTxId", required = true)
    protected String integratorTxId;
    @XmlElement(name = "Layout", required = true)
    protected String layout;
    @XmlElement(name = "PrintToAddress", defaultValue = "false")
    protected Boolean printToAddress;
    @XmlElement(name = "StartRow", defaultValue = "0")
    protected Integer startRow;
    @XmlElement(name = "StartColumn", defaultValue = "0")
    protected Integer startColumn;
    @XmlElement(name = "IndiciumInfo", required = true)
    protected ArrayOfIndiciumInfoV38 indiciumInfo;
    @XmlElement(name = "Mode", defaultValue = "Normal")
    @XmlSchemaType(name = "string")
    protected CreateIndiciumModeV1 mode;
    @XmlElement(name = "ImageType", defaultValue = "Auto")
    @XmlSchemaType(name = "string")
    protected ImageType imageType;
    @XmlElement(name = "RateToken")
    protected String rateToken;
    @XmlElement(defaultValue = "")
    protected String memo;
    @XmlElement(name = "BypassCleanseAddress", defaultValue = "false")
    protected Boolean bypassCleanseAddress;
    @XmlElement(name = "Reference1")
    protected String reference1;
    @XmlElement(name = "Reference2")
    protected String reference2;
    @XmlElement(name = "Reference3")
    protected String reference3;
    @XmlElement(name = "Reference4")
    protected String reference4;
    @XmlElement(name = "ReturnIndiciumData", defaultValue = "false")
    protected Boolean returnIndiciumData;
    @XmlElement(name = "ExtendedPostageInfo")
    protected ExtendedPostageInfoV1 extendedPostageInfo;
    @XmlElement(name = "ImageId", defaultValue = "0")
    protected Integer imageId;
    @XmlElementRef(name = "PrintFromAddress", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> printFromAddress;

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
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

    /**
     * Gets the value of the printToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintToAddress() {
        return printToAddress;
    }

    /**
     * Sets the value of the printToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintToAddress(Boolean value) {
        this.printToAddress = value;
    }

    /**
     * Gets the value of the startRow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartRow(Integer value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the startColumn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartColumn() {
        return startColumn;
    }

    /**
     * Sets the value of the startColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartColumn(Integer value) {
        this.startColumn = value;
    }

    /**
     * Gets the value of the indiciumInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndiciumInfoV38 }
     *     
     */
    public ArrayOfIndiciumInfoV38 getIndiciumInfo() {
        return indiciumInfo;
    }

    /**
     * Sets the value of the indiciumInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndiciumInfoV38 }
     *     
     */
    public void setIndiciumInfo(ArrayOfIndiciumInfoV38 value) {
        this.indiciumInfo = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link CreateIndiciumModeV1 }
     *     
     */
    public CreateIndiciumModeV1 getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateIndiciumModeV1 }
     *     
     */
    public void setMode(CreateIndiciumModeV1 value) {
        this.mode = value;
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
     * Gets the value of the rateToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateToken() {
        return rateToken;
    }

    /**
     * Sets the value of the rateToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateToken(String value) {
        this.rateToken = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the bypassCleanseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassCleanseAddress() {
        return bypassCleanseAddress;
    }

    /**
     * Sets the value of the bypassCleanseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassCleanseAddress(Boolean value) {
        this.bypassCleanseAddress = value;
    }

    /**
     * Gets the value of the reference1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1() {
        return reference1;
    }

    /**
     * Sets the value of the reference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1(String value) {
        this.reference1 = value;
    }

    /**
     * Gets the value of the reference2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2() {
        return reference2;
    }

    /**
     * Sets the value of the reference2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2(String value) {
        this.reference2 = value;
    }

    /**
     * Gets the value of the reference3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference3() {
        return reference3;
    }

    /**
     * Sets the value of the reference3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference3(String value) {
        this.reference3 = value;
    }

    /**
     * Gets the value of the reference4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference4() {
        return reference4;
    }

    /**
     * Sets the value of the reference4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference4(String value) {
        this.reference4 = value;
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

    /**
     * Gets the value of the extendedPostageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPostageInfoV1 }
     *     
     */
    public ExtendedPostageInfoV1 getExtendedPostageInfo() {
        return extendedPostageInfo;
    }

    /**
     * Sets the value of the extendedPostageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPostageInfoV1 }
     *     
     */
    public void setExtendedPostageInfo(ExtendedPostageInfoV1 value) {
        this.extendedPostageInfo = value;
    }

    /**
     * Gets the value of the imageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageId(Integer value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the printFromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrintFromAddress() {
        return printFromAddress;
    }

    /**
     * Sets the value of the printFromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrintFromAddress(JAXBElement<Boolean> value) {
        this.printFromAddress = value;
    }

}
