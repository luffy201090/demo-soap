
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomsLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-2-60"/&gt;
 *         &lt;element name="Quantity" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}double-ge-1"/&gt;
 *         &lt;element name="Value" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}decimal-ge-0"/&gt;
 *         &lt;element name="WeightLb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WeightOz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HSTariffNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfOrigin" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-2-2" minOccurs="0"/&gt;
 *         &lt;element name="sku" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-20" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsLine", propOrder = {
    "description",
    "quantity",
    "value",
    "weightLb",
    "weightOz",
    "hsTariffNumber",
    "countryOfOrigin",
    "sku"
})
public class CustomsLine {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Quantity")
    protected double quantity;
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;
    @XmlElement(name = "WeightLb", defaultValue = "0")
    protected Double weightLb;
    @XmlElement(name = "WeightOz", defaultValue = "0")
    protected Double weightOz;
    @XmlElement(name = "HSTariffNumber")
    protected String hsTariffNumber;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    protected String sku;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the weightLb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightLb() {
        return weightLb;
    }

    /**
     * Sets the value of the weightLb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightLb(Double value) {
        this.weightLb = value;
    }

    /**
     * Gets the value of the weightOz property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightOz() {
        return weightOz;
    }

    /**
     * Sets the value of the weightOz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightOz(Double value) {
        this.weightOz = value;
    }

    /**
     * Gets the value of the hsTariffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSTariffNumber() {
        return hsTariffNumber;
    }

    /**
     * Sets the value of the hsTariffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSTariffNumber(String value) {
        this.hsTariffNumber = value;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfOrigin(String value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

}
