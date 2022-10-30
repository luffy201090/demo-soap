
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV17"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV16"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnableExProShipperODBC" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV17", propOrder = {
    "enableExProShipperODBC"
})
@XmlSeeAlso({
    CapabilitiesV18 .class
})
public class CapabilitiesV17
    extends CapabilitiesV16
{

    @XmlElement(name = "EnableExProShipperODBC")
    protected boolean enableExProShipperODBC;

    /**
     * Gets the value of the enableExProShipperODBC property.
     * 
     */
    public boolean isEnableExProShipperODBC() {
        return enableExProShipperODBC;
    }

    /**
     * Sets the value of the enableExProShipperODBC property.
     * 
     */
    public void setEnableExProShipperODBC(boolean value) {
        this.enableExProShipperODBC = value;
    }

}
