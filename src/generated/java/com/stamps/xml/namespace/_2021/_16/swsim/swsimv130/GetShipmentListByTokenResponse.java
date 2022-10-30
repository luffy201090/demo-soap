
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
 *         &lt;element name="ShipmentListToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShipmentsPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Shipments" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfShipmentV38" minOccurs="0"/&gt;
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
    "shipmentListToken",
    "shipmentsPerPage",
    "totalPages",
    "shipments"
})
@XmlRootElement(name = "GetShipmentListByTokenResponse")
public class GetShipmentListByTokenResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "ShipmentListToken", required = true)
    protected String shipmentListToken;
    @XmlElement(name = "ShipmentsPerPage")
    protected int shipmentsPerPage;
    @XmlElement(name = "TotalPages")
    protected int totalPages;
    @XmlElement(name = "Shipments")
    protected ArrayOfShipmentV38 shipments;

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
     * Gets the value of the shipmentListToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentListToken() {
        return shipmentListToken;
    }

    /**
     * Sets the value of the shipmentListToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentListToken(String value) {
        this.shipmentListToken = value;
    }

    /**
     * Gets the value of the shipmentsPerPage property.
     * 
     */
    public int getShipmentsPerPage() {
        return shipmentsPerPage;
    }

    /**
     * Sets the value of the shipmentsPerPage property.
     * 
     */
    public void setShipmentsPerPage(int value) {
        this.shipmentsPerPage = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the shipments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentV38 }
     *     
     */
    public ArrayOfShipmentV38 getShipments() {
        return shipments;
    }

    /**
     * Sets the value of the shipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentV38 }
     *     
     */
    public void setShipments(ArrayOfShipmentV38 value) {
        this.shipments = value;
    }

}
