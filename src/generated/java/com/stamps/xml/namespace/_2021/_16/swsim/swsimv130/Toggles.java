
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Toggles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Toggles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShowCustomColors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowSocialMedia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowStoreUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowMenuLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowReturnPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowShipmentDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowItemImages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowShipmentPrices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowStoreAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Toggles", propOrder = {
    "showCustomColors",
    "showSocialMedia",
    "showStoreUrl",
    "showMenuLinks",
    "showReturnPolicy",
    "showEmail",
    "showPhone",
    "showShipmentDetails",
    "showItemImages",
    "showShipmentPrices",
    "showStoreAddress"
})
public class Toggles {

    @XmlElementRef(name = "ShowCustomColors", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showCustomColors;
    @XmlElementRef(name = "ShowSocialMedia", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showSocialMedia;
    @XmlElementRef(name = "ShowStoreUrl", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showStoreUrl;
    @XmlElementRef(name = "ShowMenuLinks", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showMenuLinks;
    @XmlElementRef(name = "ShowReturnPolicy", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showReturnPolicy;
    @XmlElementRef(name = "ShowEmail", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showEmail;
    @XmlElementRef(name = "ShowPhone", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showPhone;
    @XmlElementRef(name = "ShowShipmentDetails", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showShipmentDetails;
    @XmlElementRef(name = "ShowItemImages", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showItemImages;
    @XmlElementRef(name = "ShowShipmentPrices", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showShipmentPrices;
    @XmlElementRef(name = "ShowStoreAddress", namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showStoreAddress;

    /**
     * Gets the value of the showCustomColors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowCustomColors() {
        return showCustomColors;
    }

    /**
     * Sets the value of the showCustomColors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowCustomColors(JAXBElement<Boolean> value) {
        this.showCustomColors = value;
    }

    /**
     * Gets the value of the showSocialMedia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowSocialMedia() {
        return showSocialMedia;
    }

    /**
     * Sets the value of the showSocialMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowSocialMedia(JAXBElement<Boolean> value) {
        this.showSocialMedia = value;
    }

    /**
     * Gets the value of the showStoreUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowStoreUrl() {
        return showStoreUrl;
    }

    /**
     * Sets the value of the showStoreUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowStoreUrl(JAXBElement<Boolean> value) {
        this.showStoreUrl = value;
    }

    /**
     * Gets the value of the showMenuLinks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowMenuLinks() {
        return showMenuLinks;
    }

    /**
     * Sets the value of the showMenuLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowMenuLinks(JAXBElement<Boolean> value) {
        this.showMenuLinks = value;
    }

    /**
     * Gets the value of the showReturnPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowReturnPolicy() {
        return showReturnPolicy;
    }

    /**
     * Sets the value of the showReturnPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowReturnPolicy(JAXBElement<Boolean> value) {
        this.showReturnPolicy = value;
    }

    /**
     * Gets the value of the showEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowEmail() {
        return showEmail;
    }

    /**
     * Sets the value of the showEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowEmail(JAXBElement<Boolean> value) {
        this.showEmail = value;
    }

    /**
     * Gets the value of the showPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowPhone() {
        return showPhone;
    }

    /**
     * Sets the value of the showPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowPhone(JAXBElement<Boolean> value) {
        this.showPhone = value;
    }

    /**
     * Gets the value of the showShipmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowShipmentDetails() {
        return showShipmentDetails;
    }

    /**
     * Sets the value of the showShipmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowShipmentDetails(JAXBElement<Boolean> value) {
        this.showShipmentDetails = value;
    }

    /**
     * Gets the value of the showItemImages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowItemImages() {
        return showItemImages;
    }

    /**
     * Sets the value of the showItemImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowItemImages(JAXBElement<Boolean> value) {
        this.showItemImages = value;
    }

    /**
     * Gets the value of the showShipmentPrices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowShipmentPrices() {
        return showShipmentPrices;
    }

    /**
     * Sets the value of the showShipmentPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowShipmentPrices(JAXBElement<Boolean> value) {
        this.showShipmentPrices = value;
    }

    /**
     * Gets the value of the showStoreAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowStoreAddress() {
        return showStoreAddress;
    }

    /**
     * Sets the value of the showStoreAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowStoreAddress(JAXBElement<Boolean> value) {
        this.showStoreAddress = value;
    }

}
