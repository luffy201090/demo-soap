
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
 *         &lt;element name="CostCodes" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfCost_code_info_v1"/&gt;
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
    "costCodes"
})
@XmlRootElement(name = "EnumCostCodesResponse")
public class EnumCostCodesResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "CostCodes", required = true)
    protected ArrayOfCostCodeInfoV1 costCodes;

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
     * Gets the value of the costCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCostCodeInfoV1 }
     *     
     */
    public ArrayOfCostCodeInfoV1 getCostCodes() {
        return costCodes;
    }

    /**
     * Sets the value of the costCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCostCodeInfoV1 }
     *     
     */
    public void setCostCodes(ArrayOfCostCodeInfoV1 value) {
        this.costCodes = value;
    }

}
