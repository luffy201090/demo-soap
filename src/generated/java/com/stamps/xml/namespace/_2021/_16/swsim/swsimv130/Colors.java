
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Colors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Colors"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Secondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tertiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Colors", propOrder = {
    "primary",
    "secondary",
    "tertiary"
})
public class Colors {

    @XmlElement(name = "Primary", defaultValue = "")
    protected String primary;
    @XmlElement(name = "Secondary", defaultValue = "")
    protected String secondary;
    @XmlElement(name = "Tertiary", defaultValue = "")
    protected String tertiary;

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary(String value) {
        this.primary = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondary(String value) {
        this.secondary = value;
    }

    /**
     * Gets the value of the tertiary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTertiary() {
        return tertiary;
    }

    /**
     * Sets the value of the tertiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTertiary(String value) {
        this.tertiary = value;
    }

}
