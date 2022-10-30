
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FP1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="FP2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="FP3" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="FP4" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="FP5" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP", propOrder = {
    "fp1",
    "fp2",
    "fp3",
    "fp4",
    "fp5"
})
public class FP {

    @XmlElement(name = "FP1")
    protected byte[] fp1;
    @XmlElement(name = "FP2")
    protected byte[] fp2;
    @XmlElement(name = "FP3")
    protected byte[] fp3;
    @XmlElement(name = "FP4")
    protected byte[] fp4;
    @XmlElement(name = "FP5")
    protected byte[] fp5;

    /**
     * Gets the value of the fp1 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFP1() {
        return fp1;
    }

    /**
     * Sets the value of the fp1 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFP1(byte[] value) {
        this.fp1 = value;
    }

    /**
     * Gets the value of the fp2 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFP2() {
        return fp2;
    }

    /**
     * Sets the value of the fp2 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFP2(byte[] value) {
        this.fp2 = value;
    }

    /**
     * Gets the value of the fp3 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFP3() {
        return fp3;
    }

    /**
     * Sets the value of the fp3 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFP3(byte[] value) {
        this.fp3 = value;
    }

    /**
     * Gets the value of the fp4 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFP4() {
        return fp4;
    }

    /**
     * Sets the value of the fp4 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFP4(byte[] value) {
        this.fp4 = value;
    }

    /**
     * Gets the value of the fp5 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFP5() {
        return fp5;
    }

    /**
     * Sets the value of the fp5 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFP5(byte[] value) {
        this.fp5 = value;
    }

}
