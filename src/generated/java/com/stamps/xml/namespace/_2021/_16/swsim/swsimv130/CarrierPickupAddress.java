
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierPickupAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierPickupAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Company" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-50"/&gt;
 *         &lt;element name="SuiteOrApt" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-35" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-35"/&gt;
 *         &lt;element name="State" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-2-2"/&gt;
 *         &lt;element name="ZIP" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-5-5"/&gt;
 *         &lt;element name="ZIP4" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierPickupAddress", propOrder = {
    "company",
    "address",
    "suiteOrApt",
    "city",
    "state",
    "zip",
    "zip4"
})
@XmlSeeAlso({
    CarrierPickupAddressV2 .class
})
public class CarrierPickupAddress {

    @XmlElement(name = "Company", defaultValue = "")
    protected String company;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "SuiteOrApt", defaultValue = "")
    protected String suiteOrApt;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlElement(name = "ZIP", required = true)
    protected String zip;
    @XmlElement(name = "ZIP4", defaultValue = "")
    protected String zip4;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the suiteOrApt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuiteOrApt() {
        return suiteOrApt;
    }

    /**
     * Sets the value of the suiteOrApt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuiteOrApt(String value) {
        this.suiteOrApt = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIP() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIP(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the zip4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIP4() {
        return zip4;
    }

    /**
     * Sets the value of the zip4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIP4(String value) {
        this.zip4 = value;
    }

}
