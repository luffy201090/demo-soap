
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;choice&gt;
 *           &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="Credentials" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Credentials" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ShipmentsPerPage" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}integer-ge-1-le-500" minOccurs="0"/&gt;
 *         &lt;element name="Filters" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Filters"/&gt;
 *         &lt;element name="IncludeFields" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfIncludeField" minOccurs="0"/&gt;
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
    "credentials",
    "shipmentsPerPage",
    "filters",
    "includeFields"
})
@XmlRootElement(name = "GetShipmentList")
public class GetShipmentList {

    @XmlElement(name = "Authenticator")
    protected String authenticator;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;
    @XmlElement(name = "ShipmentsPerPage", defaultValue = "50")
    @XmlSchemaType(name = "integer")
    protected Integer shipmentsPerPage;
    @XmlElement(name = "Filters", required = true)
    protected Filters filters;
    @XmlElement(name = "IncludeFields")
    protected ArrayOfIncludeField includeFields;

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
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredentials(Credentials value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the shipmentsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShipmentsPerPage() {
        return shipmentsPerPage;
    }

    /**
     * Sets the value of the shipmentsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShipmentsPerPage(Integer value) {
        this.shipmentsPerPage = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link Filters }
     *     
     */
    public Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filters }
     *     
     */
    public void setFilters(Filters value) {
        this.filters = value;
    }

    /**
     * Gets the value of the includeFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIncludeField }
     *     
     */
    public ArrayOfIncludeField getIncludeFields() {
        return includeFields;
    }

    /**
     * Sets the value of the includeFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIncludeField }
     *     
     */
    public void setIncludeFields(ArrayOfIncludeField value) {
        this.includeFields = value;
    }

}
