
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MachineInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MachineInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IPAddress" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-15"/&gt;
 *         &lt;element name="MacAddress" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-12" minOccurs="0"/&gt;
 *         &lt;element name="FP" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}FP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MachineInfo", propOrder = {
    "ipAddress",
    "macAddress",
    "fp"
})
public class MachineInfo {

    @XmlElement(name = "IPAddress", required = true)
    protected String ipAddress;
    @XmlElement(name = "MacAddress")
    protected String macAddress;
    @XmlElement(name = "FP")
    protected FP fp;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the fp property.
     * 
     * @return
     *     possible object is
     *     {@link FP }
     *     
     */
    public FP getFP() {
        return fp;
    }

    /**
     * Sets the value of the fp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FP }
     *     
     */
    public void setFP(FP value) {
        this.fp = value;
    }

}
