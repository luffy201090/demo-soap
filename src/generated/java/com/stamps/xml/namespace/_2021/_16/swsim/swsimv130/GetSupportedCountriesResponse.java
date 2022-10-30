
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
 *         &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CountryInfo" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfCountryInfo"/&gt;
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
    "authenticator",
    "countryInfo"
})
@XmlRootElement(name = "GetSupportedCountriesResponse")
public class GetSupportedCountriesResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "CountryInfo", required = true)
    protected ArrayOfCountryInfo countryInfo;

    /**
     * Gets the value of the authenticator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticator() {
        return authenticator;
    }

    /**
     * Sets the value of the authenticator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticator(String value) {
        this.authenticator = value;
    }

    /**
     * Gets the value of the countryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountryInfo }
     *     
     */
    public ArrayOfCountryInfo getCountryInfo() {
        return countryInfo;
    }

    /**
     * Sets the value of the countryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountryInfo }
     *     
     */
    public void setCountryInfo(ArrayOfCountryInfo value) {
        this.countryInfo = value;
    }

}
