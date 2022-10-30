
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV13"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV12"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanCleanseIntlAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanBypassCleanseAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV13", propOrder = {
    "canCleanseIntlAddress",
    "canBypassCleanseAddress"
})
@XmlSeeAlso({
    CapabilitiesV14 .class
})
public class CapabilitiesV13
    extends CapabilitiesV12
{

    @XmlElement(name = "CanCleanseIntlAddress")
    protected boolean canCleanseIntlAddress;
    @XmlElement(name = "CanBypassCleanseAddress")
    protected boolean canBypassCleanseAddress;

    /**
     * Gets the value of the canCleanseIntlAddress property.
     * 
     */
    public boolean isCanCleanseIntlAddress() {
        return canCleanseIntlAddress;
    }

    /**
     * Sets the value of the canCleanseIntlAddress property.
     * 
     */
    public void setCanCleanseIntlAddress(boolean value) {
        this.canCleanseIntlAddress = value;
    }

    /**
     * Gets the value of the canBypassCleanseAddress property.
     * 
     */
    public boolean isCanBypassCleanseAddress() {
        return canBypassCleanseAddress;
    }

    /**
     * Sets the value of the canBypassCleanseAddress property.
     * 
     */
    public void setCanBypassCleanseAddress(boolean value) {
        this.canBypassCleanseAddress = value;
    }

}
