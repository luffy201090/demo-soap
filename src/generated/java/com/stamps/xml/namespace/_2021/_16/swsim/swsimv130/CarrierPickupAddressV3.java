
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierPickupAddressV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierPickupAddressV3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Company" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-50"/&gt;
 *         &lt;element name="City" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-35"/&gt;
 *         &lt;element name="State" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-2-2"/&gt;
 *         &lt;element name="ZIP" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-5-5"/&gt;
 *         &lt;element name="ZIP4" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-4" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *         &lt;element name="Address3" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-0-50" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierPickupAddressV3", propOrder = {
    "company",
    "address",
    "city",
    "state",
    "zip",
    "zip4",
    "address2",
    "address3"
})
public class CarrierPickupAddressV3 {

    @XmlElement(name = "Company", defaultValue = "")
    protected String company;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlElement(name = "ZIP", required = true)
    protected String zip;
    @XmlElement(name = "ZIP4", defaultValue = "")
    protected String zip4;
    @XmlElement(name = "Address2", defaultValue = "")
    protected String address2;
    @XmlElement(name = "Address3", defaultValue = "")
    protected String address3;

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

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

}
