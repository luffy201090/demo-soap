
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentBlockType" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ContentBlockType"/&gt;
 *         &lt;element name="Value" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-2147483647"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentBlock", propOrder = {
    "contentBlockType",
    "value"
})
public class ContentBlock {

    @XmlElement(name = "ContentBlockType", required = true)
    @XmlSchemaType(name = "string")
    protected ContentBlockType contentBlockType;
    @XmlElement(name = "Value", required = true)
    protected String value;

    /**
     * Gets the value of the contentBlockType property.
     * 
     * @return
     *     possible object is
     *     {@link ContentBlockType }
     *     
     */
    public ContentBlockType getContentBlockType() {
        return contentBlockType;
    }

    /**
     * Sets the value of the contentBlockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentBlockType }
     *     
     */
    public void setContentBlockType(ContentBlockType value) {
        this.contentBlockType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
