
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
 *         &lt;element name="Codeword1Question" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Codeword2Question" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "codeword1Question",
    "codeword2Question"
})
@XmlRootElement(name = "GetCodewordQuestionsResponse")
public class GetCodewordQuestionsResponse {

    @XmlElement(name = "Codeword1Question", required = true)
    protected String codeword1Question;
    @XmlElement(name = "Codeword2Question", required = true)
    protected String codeword2Question;

    /**
     * Gets the value of the codeword1Question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeword1Question() {
        return codeword1Question;
    }

    /**
     * Sets the value of the codeword1Question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeword1Question(String value) {
        this.codeword1Question = value;
    }

    /**
     * Gets the value of the codeword2Question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeword2Question() {
        return codeword2Question;
    }

    /**
     * Sets the value of the codeword2Question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeword2Question(String value) {
        this.codeword2Question = value;
    }

}
