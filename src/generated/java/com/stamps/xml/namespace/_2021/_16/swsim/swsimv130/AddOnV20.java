
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOnV20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOnV20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AddOnType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}AddOnTypeV20"/&gt;
 *         &lt;element name="AddOnDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequiresAllOf" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfArrayOfAddOnTypeV20" minOccurs="0"/&gt;
 *         &lt;element name="ProhibitedWithAnyOf" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfAddOnTypeV20" minOccurs="0"/&gt;
 *         &lt;element name="MissingData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOnV20", propOrder = {
    "amount",
    "addOnType",
    "addOnDescription",
    "requiresAllOf",
    "prohibitedWithAnyOf",
    "missingData"
})
public class AddOnV20 {

    @XmlElement(name = "Amount", defaultValue = "0.0")
    protected BigDecimal amount;
    @XmlElement(name = "AddOnType", required = true)
    @XmlSchemaType(name = "string")
    protected AddOnTypeV20 addOnType;
    @XmlElement(name = "AddOnDescription")
    protected String addOnDescription;
    @XmlElement(name = "RequiresAllOf")
    protected ArrayOfArrayOfAddOnTypeV20 requiresAllOf;
    @XmlElement(name = "ProhibitedWithAnyOf")
    protected ArrayOfAddOnTypeV20 prohibitedWithAnyOf;
    @XmlElement(name = "MissingData")
    protected String missingData;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the addOnType property.
     * 
     * @return
     *     possible object is
     *     {@link AddOnTypeV20 }
     *     
     */
    public AddOnTypeV20 getAddOnType() {
        return addOnType;
    }

    /**
     * Sets the value of the addOnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnTypeV20 }
     *     
     */
    public void setAddOnType(AddOnTypeV20 value) {
        this.addOnType = value;
    }

    /**
     * Gets the value of the addOnDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddOnDescription() {
        return addOnDescription;
    }

    /**
     * Sets the value of the addOnDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddOnDescription(String value) {
        this.addOnDescription = value;
    }

    /**
     * Gets the value of the requiresAllOf property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfAddOnTypeV20 }
     *     
     */
    public ArrayOfArrayOfAddOnTypeV20 getRequiresAllOf() {
        return requiresAllOf;
    }

    /**
     * Sets the value of the requiresAllOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfAddOnTypeV20 }
     *     
     */
    public void setRequiresAllOf(ArrayOfArrayOfAddOnTypeV20 value) {
        this.requiresAllOf = value;
    }

    /**
     * Gets the value of the prohibitedWithAnyOf property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddOnTypeV20 }
     *     
     */
    public ArrayOfAddOnTypeV20 getProhibitedWithAnyOf() {
        return prohibitedWithAnyOf;
    }

    /**
     * Sets the value of the prohibitedWithAnyOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddOnTypeV20 }
     *     
     */
    public void setProhibitedWithAnyOf(ArrayOfAddOnTypeV20 value) {
        this.prohibitedWithAnyOf = value;
    }

    /**
     * Gets the value of the missingData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissingData() {
        return missingData;
    }

    /**
     * Sets the value of the missingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissingData(String value) {
        this.missingData = value;
    }

}
