
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StampsTxId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConfirmationNumbers" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfString"/&gt;
 *         &lt;element name="PostageBalance" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PostageBalance"/&gt;
 *         &lt;element name="IssuedLabelCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrintLayout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reference3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reference4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndiciumData" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfBase64Binary" minOccurs="0"/&gt;
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
    "stampsTxId",
    "url",
    "confirmationNumbers",
    "postageBalance",
    "issuedLabelCount",
    "errorReason",
    "mac",
    "printLayout",
    "reference1",
    "reference2",
    "reference3",
    "reference4",
    "indiciumData"
})
@XmlRootElement(name = "CreateMailingLabelIndiciaResponse")
public class CreateMailingLabelIndiciaResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "StampsTxId", required = true)
    protected String stampsTxId;
    @XmlElement(name = "Url", required = true)
    protected String url;
    @XmlElement(name = "ConfirmationNumbers", required = true)
    protected ArrayOfString confirmationNumbers;
    @XmlElement(name = "PostageBalance", required = true)
    protected PostageBalance postageBalance;
    @XmlElement(name = "IssuedLabelCount")
    protected int issuedLabelCount;
    @XmlElement(name = "ErrorReason", required = true)
    protected String errorReason;
    @XmlElement(name = "Mac", required = true)
    protected String mac;
    @XmlElement(name = "PrintLayout")
    protected String printLayout;
    @XmlElement(name = "Reference1")
    protected String reference1;
    @XmlElement(name = "Reference2")
    protected String reference2;
    @XmlElement(name = "Reference3")
    protected String reference3;
    @XmlElement(name = "Reference4")
    protected String reference4;
    @XmlElement(name = "IndiciumData")
    protected ArrayOfBase64Binary indiciumData;

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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the confirmationNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getConfirmationNumbers() {
        return confirmationNumbers;
    }

    /**
     * Sets the value of the confirmationNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setConfirmationNumbers(ArrayOfString value) {
        this.confirmationNumbers = value;
    }

    /**
     * Gets the value of the postageBalance property.
     * 
     * @return
     *     possible object is
     *     {@link PostageBalance }
     *     
     */
    public PostageBalance getPostageBalance() {
        return postageBalance;
    }

    /**
     * Sets the value of the postageBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostageBalance }
     *     
     */
    public void setPostageBalance(PostageBalance value) {
        this.postageBalance = value;
    }

    /**
     * Gets the value of the issuedLabelCount property.
     * 
     */
    public int getIssuedLabelCount() {
        return issuedLabelCount;
    }

    /**
     * Sets the value of the issuedLabelCount property.
     * 
     */
    public void setIssuedLabelCount(int value) {
        this.issuedLabelCount = value;
    }

    /**
     * Gets the value of the errorReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorReason() {
        return errorReason;
    }

    /**
     * Sets the value of the errorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorReason(String value) {
        this.errorReason = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
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
     * Gets the value of the indiciumData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBase64Binary }
     *     
     */
    public ArrayOfBase64Binary getIndiciumData() {
        return indiciumData;
    }

    /**
     * Sets the value of the indiciumData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBase64Binary }
     *     
     */
    public void setIndiciumData(ArrayOfBase64Binary value) {
        this.indiciumData = value;
    }

}
