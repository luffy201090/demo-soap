
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.stamps.xml.namespace._2014._3.addressservicev2.HoldForPickUpFacility;


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
 *         &lt;element name="IntegratorTxID" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-128"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-128" minOccurs="0"/&gt;
 *         &lt;element name="EncodedTrackingNumber" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-128" minOccurs="0"/&gt;
 *         &lt;element name="BannerText" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-128" minOccurs="0"/&gt;
 *         &lt;element name="TrailingSuperScript" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-10" minOccurs="0"/&gt;
 *         &lt;element name="ReturnTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}RateV45"/&gt;
 *         &lt;element name="StampsTxID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostageBalance" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PostageBalance"/&gt;
 *         &lt;element name="Mac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostageHash" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ImageData" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfBase64Binary" minOccurs="0"/&gt;
 *         &lt;element name="HoldForPickUpFacility" type="{http://stamps.com/xml/namespace/2014/3/addressservicev2}HoldForPickUpFacility" minOccurs="0"/&gt;
 *         &lt;element name="FormURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reference3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reference4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="labelCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndiciumData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="LabelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "integratorTxID",
    "trackingNumber",
    "encodedTrackingNumber",
    "bannerText",
    "trailingSuperScript",
    "returnTrackingNumber",
    "rate",
    "stampsTxID",
    "url",
    "postageBalance",
    "mac",
    "postageHash",
    "imageData",
    "holdForPickUpFacility",
    "formURL",
    "reference1",
    "reference2",
    "reference3",
    "reference4",
    "labelCategory",
    "indiciumData",
    "labelID"
})
@XmlRootElement(name = "CreateIndiciumResponse")
public class CreateIndiciumResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "IntegratorTxID", required = true)
    protected String integratorTxID;
    @XmlElement(name = "TrackingNumber", defaultValue = "")
    protected String trackingNumber;
    @XmlElement(name = "EncodedTrackingNumber", defaultValue = "")
    protected String encodedTrackingNumber;
    @XmlElement(name = "BannerText", defaultValue = "")
    protected String bannerText;
    @XmlElement(name = "TrailingSuperScript", defaultValue = "")
    protected String trailingSuperScript;
    @XmlElement(name = "ReturnTrackingNumber")
    protected String returnTrackingNumber;
    @XmlElement(name = "Rate", required = true)
    protected RateV45 rate;
    @XmlElement(name = "StampsTxID", required = true)
    protected String stampsTxID;
    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "PostageBalance", required = true)
    protected PostageBalance postageBalance;
    @XmlElement(name = "Mac", required = true)
    protected String mac;
    @XmlElement(name = "PostageHash", required = true)
    protected String postageHash;
    @XmlElement(name = "ImageData")
    protected ArrayOfBase64Binary imageData;
    @XmlElement(name = "HoldForPickUpFacility")
    protected HoldForPickUpFacility holdForPickUpFacility;
    @XmlElement(name = "FormURL")
    protected String formURL;
    @XmlElement(name = "Reference1")
    protected String reference1;
    @XmlElement(name = "Reference2")
    protected String reference2;
    @XmlElement(name = "Reference3")
    protected String reference3;
    @XmlElement(name = "Reference4")
    protected String reference4;
    protected String labelCategory;
    @XmlElement(name = "IndiciumData")
    protected byte[] indiciumData;
    @XmlElement(name = "LabelID")
    protected String labelID;

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
     * Gets the value of the encodedTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodedTrackingNumber() {
        return encodedTrackingNumber;
    }

    /**
     * Sets the value of the encodedTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodedTrackingNumber(String value) {
        this.encodedTrackingNumber = value;
    }

    /**
     * Gets the value of the bannerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBannerText() {
        return bannerText;
    }

    /**
     * Sets the value of the bannerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBannerText(String value) {
        this.bannerText = value;
    }

    /**
     * Gets the value of the trailingSuperScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailingSuperScript() {
        return trailingSuperScript;
    }

    /**
     * Sets the value of the trailingSuperScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailingSuperScript(String value) {
        this.trailingSuperScript = value;
    }

    /**
     * Gets the value of the returnTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTrackingNumber() {
        return returnTrackingNumber;
    }

    /**
     * Sets the value of the returnTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTrackingNumber(String value) {
        this.returnTrackingNumber = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link RateV45 }
     *     
     */
    public RateV45 getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateV45 }
     *     
     */
    public void setRate(RateV45 value) {
        this.rate = value;
    }

    /**
     * Gets the value of the stampsTxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStampsTxID() {
        return stampsTxID;
    }

    /**
     * Sets the value of the stampsTxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStampsTxID(String value) {
        this.stampsTxID = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
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
    public void setURL(String value) {
        this.url = value;
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
     * Gets the value of the postageHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostageHash() {
        return postageHash;
    }

    /**
     * Sets the value of the postageHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostageHash(String value) {
        this.postageHash = value;
    }

    /**
     * Gets the value of the imageData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBase64Binary }
     *     
     */
    public ArrayOfBase64Binary getImageData() {
        return imageData;
    }

    /**
     * Sets the value of the imageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBase64Binary }
     *     
     */
    public void setImageData(ArrayOfBase64Binary value) {
        this.imageData = value;
    }

    /**
     * Gets the value of the holdForPickUpFacility property.
     * 
     * @return
     *     possible object is
     *     {@link HoldForPickUpFacility }
     *     
     */
    public HoldForPickUpFacility getHoldForPickUpFacility() {
        return holdForPickUpFacility;
    }

    /**
     * Sets the value of the holdForPickUpFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldForPickUpFacility }
     *     
     */
    public void setHoldForPickUpFacility(HoldForPickUpFacility value) {
        this.holdForPickUpFacility = value;
    }

    /**
     * Gets the value of the formURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormURL() {
        return formURL;
    }

    /**
     * Sets the value of the formURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormURL(String value) {
        this.formURL = value;
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
     * Gets the value of the labelCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelCategory() {
        return labelCategory;
    }

    /**
     * Sets the value of the labelCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelCategory(String value) {
        this.labelCategory = value;
    }

    /**
     * Gets the value of the indiciumData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIndiciumData() {
        return indiciumData;
    }

    /**
     * Sets the value of the indiciumData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIndiciumData(byte[] value) {
        this.indiciumData = value;
    }

    /**
     * Gets the value of the labelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelID() {
        return labelID;
    }

    /**
     * Sets the value of the labelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelID(String value) {
        this.labelID = value;
    }

}
