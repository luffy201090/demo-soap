
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Codeword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Codeword"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodewordType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CodewordType"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Codeword", propOrder = {
    "codewordType",
    "value",
    "description"
})
public class Codeword {

    @XmlElement(name = "CodewordType", required = true)
    @XmlSchemaType(name = "string")
    protected CodewordType codewordType;
    @XmlElement(name = "Value")
    @XmlSchemaType(name = "unsignedInt")
    protected long value;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Gets the value of the codewordType property.
     * 
     * @return
     *     possible object is
     *     {@link CodewordType }
     *     
     */
    public CodewordType getCodewordType() {
        return codewordType;
    }

    /**
     * Sets the value of the codewordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodewordType }
     *     
     */
    public void setCodewordType(CodewordType value) {
        this.codewordType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

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

}
