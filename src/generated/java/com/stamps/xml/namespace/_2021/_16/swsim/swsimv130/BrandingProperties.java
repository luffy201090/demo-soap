
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandingProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrandingProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogoTargetUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandName" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-2-2147483647"/&gt;
 *         &lt;element name="LogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogoType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}LogoType"/&gt;
 *         &lt;element name="MenuLinks" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfMenuLink" minOccurs="0"/&gt;
 *         &lt;element name="SocialMedia" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfSocialMedia" minOccurs="0"/&gt;
 *         &lt;element name="Toggles" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Toggles" minOccurs="0"/&gt;
 *         &lt;element name="Colors" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Colors" minOccurs="0"/&gt;
 *         &lt;element name="Theme" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Theme"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandingProperties", propOrder = {
    "returnPolicy",
    "email",
    "phone",
    "logoTargetUrl",
    "brandName",
    "logoUrl",
    "logoType",
    "menuLinks",
    "socialMedia",
    "toggles",
    "colors",
    "theme"
})
public class BrandingProperties {

    @XmlElement(name = "ReturnPolicy", defaultValue = "")
    protected String returnPolicy;
    @XmlElement(name = "Email", defaultValue = "")
    protected String email;
    @XmlElement(name = "Phone", defaultValue = "")
    protected String phone;
    @XmlElement(name = "LogoTargetUrl", defaultValue = "")
    protected String logoTargetUrl;
    @XmlElement(name = "BrandName", required = true)
    protected String brandName;
    @XmlElement(name = "LogoUrl", defaultValue = "")
    protected String logoUrl;
    @XmlElement(name = "LogoType", required = true)
    @XmlSchemaType(name = "string")
    protected LogoType logoType;
    @XmlElement(name = "MenuLinks")
    protected ArrayOfMenuLink menuLinks;
    @XmlElement(name = "SocialMedia")
    protected ArrayOfSocialMedia socialMedia;
    @XmlElement(name = "Toggles")
    protected Toggles toggles;
    @XmlElement(name = "Colors")
    protected Colors colors;
    @XmlElement(name = "Theme", required = true)
    @XmlSchemaType(name = "string")
    protected Theme theme;

    /**
     * Gets the value of the returnPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPolicy() {
        return returnPolicy;
    }

    /**
     * Sets the value of the returnPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPolicy(String value) {
        this.returnPolicy = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the logoTargetUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoTargetUrl() {
        return logoTargetUrl;
    }

    /**
     * Sets the value of the logoTargetUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoTargetUrl(String value) {
        this.logoTargetUrl = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the logoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Sets the value of the logoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoUrl(String value) {
        this.logoUrl = value;
    }

    /**
     * Gets the value of the logoType property.
     * 
     * @return
     *     possible object is
     *     {@link LogoType }
     *     
     */
    public LogoType getLogoType() {
        return logoType;
    }

    /**
     * Sets the value of the logoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoType }
     *     
     */
    public void setLogoType(LogoType value) {
        this.logoType = value;
    }

    /**
     * Gets the value of the menuLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMenuLink }
     *     
     */
    public ArrayOfMenuLink getMenuLinks() {
        return menuLinks;
    }

    /**
     * Sets the value of the menuLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMenuLink }
     *     
     */
    public void setMenuLinks(ArrayOfMenuLink value) {
        this.menuLinks = value;
    }

    /**
     * Gets the value of the socialMedia property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialMedia }
     *     
     */
    public ArrayOfSocialMedia getSocialMedia() {
        return socialMedia;
    }

    /**
     * Sets the value of the socialMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialMedia }
     *     
     */
    public void setSocialMedia(ArrayOfSocialMedia value) {
        this.socialMedia = value;
    }

    /**
     * Gets the value of the toggles property.
     * 
     * @return
     *     possible object is
     *     {@link Toggles }
     *     
     */
    public Toggles getToggles() {
        return toggles;
    }

    /**
     * Sets the value of the toggles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Toggles }
     *     
     */
    public void setToggles(Toggles value) {
        this.toggles = value;
    }

    /**
     * Gets the value of the colors property.
     * 
     * @return
     *     possible object is
     *     {@link Colors }
     *     
     */
    public Colors getColors() {
        return colors;
    }

    /**
     * Sets the value of the colors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Colors }
     *     
     */
    public void setColors(Colors value) {
        this.colors = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link Theme }
     *     
     */
    public Theme getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Theme }
     *     
     */
    public void setTheme(Theme value) {
        this.theme = value;
    }

}
