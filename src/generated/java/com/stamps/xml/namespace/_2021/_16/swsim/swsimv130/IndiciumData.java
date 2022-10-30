
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndiciumData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndiciumData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IBI" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="IBILite" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndiciumData", propOrder = {
    "ibi",
    "ibiLite"
})
public class IndiciumData {

    @XmlElement(name = "IBI", required = true)
    protected byte[] ibi;
    @XmlElement(name = "IBILite", required = true)
    protected byte[] ibiLite;

    /**
     * Gets the value of the ibi property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIBI() {
        return ibi;
    }

    /**
     * Sets the value of the ibi property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIBI(byte[] value) {
        this.ibi = value;
    }

    /**
     * Gets the value of the ibiLite property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIBILite() {
        return ibiLite;
    }

    /**
     * Sets the value of the ibiLite property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIBILite(byte[] value) {
        this.ibiLite = value;
    }

}
