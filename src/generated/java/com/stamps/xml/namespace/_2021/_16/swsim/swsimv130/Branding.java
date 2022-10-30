
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Branding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Branding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrandingId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="BrandingProperties" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}BrandingProperties" minOccurs="0"/&gt;
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Branding", propOrder = {
    "brandingId",
    "brandingProperties",
    "reference"
})
public class Branding {

    @XmlElement(name = "BrandingId", required = true, nillable = true)
    protected String brandingId;
    @XmlElement(name = "BrandingProperties")
    protected BrandingProperties brandingProperties;
    @XmlElement(name = "Reference")
    protected String reference;

    /**
     * Gets the value of the brandingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingId() {
        return brandingId;
    }

    /**
     * Sets the value of the brandingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingId(String value) {
        this.brandingId = value;
    }

    /**
     * Gets the value of the brandingProperties property.
     * 
     * @return
     *     possible object is
     *     {@link BrandingProperties }
     *     
     */
    public BrandingProperties getBrandingProperties() {
        return brandingProperties;
    }

    /**
     * Sets the value of the brandingProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandingProperties }
     *     
     */
    public void setBrandingProperties(BrandingProperties value) {
        this.brandingProperties = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
