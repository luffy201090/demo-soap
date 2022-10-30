
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfiguredCarriers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfiguredCarriers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Carrier" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Carrier"/&gt;
 *         &lt;element name="UserOwnedAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfiguredCarriers", propOrder = {
    "carrier",
    "userOwnedAccount"
})
public class ConfiguredCarriers {

    @XmlElement(name = "Carrier", required = true)
    @XmlSchemaType(name = "string")
    protected Carrier carrier;
    @XmlElement(name = "UserOwnedAccount")
    protected boolean userOwnedAccount;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link Carrier }
     *     
     */
    public Carrier getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Carrier }
     *     
     */
    public void setCarrier(Carrier value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the userOwnedAccount property.
     * 
     */
    public boolean isUserOwnedAccount() {
        return userOwnedAccount;
    }

    /**
     * Sets the value of the userOwnedAccount property.
     * 
     */
    public void setUserOwnedAccount(boolean value) {
        this.userOwnedAccount = value;
    }

}
