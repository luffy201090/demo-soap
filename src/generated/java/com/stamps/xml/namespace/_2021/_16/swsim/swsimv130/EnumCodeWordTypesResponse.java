
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
 *         &lt;element name="CodeWords" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfCodeword"/&gt;
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
    "codeWords"
})
@XmlRootElement(name = "EnumCodeWordTypesResponse")
public class EnumCodeWordTypesResponse {

    @XmlElement(name = "CodeWords", required = true)
    protected ArrayOfCodeword codeWords;

    /**
     * Gets the value of the codeWords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCodeword }
     *     
     */
    public ArrayOfCodeword getCodeWords() {
        return codeWords;
    }

    /**
     * Sets the value of the codeWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCodeword }
     *     
     */
    public void setCodeWords(ArrayOfCodeword value) {
        this.codeWords = value;
    }

}
