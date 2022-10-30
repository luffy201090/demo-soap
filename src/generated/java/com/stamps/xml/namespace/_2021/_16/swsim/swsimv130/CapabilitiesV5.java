
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV4"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanCreateCriticalMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV5", propOrder = {
    "canCreateCriticalMail"
})
@XmlSeeAlso({
    CapabilitiesV6 .class
})
public class CapabilitiesV5
    extends CapabilitiesV4
{

    @XmlElement(name = "CanCreateCriticalMail")
    protected boolean canCreateCriticalMail;

    /**
     * Gets the value of the canCreateCriticalMail property.
     * 
     */
    public boolean isCanCreateCriticalMail() {
        return canCreateCriticalMail;
    }

    /**
     * Sets the value of the canCreateCriticalMail property.
     * 
     */
    public void setCanCreateCriticalMail(boolean value) {
        this.canCreateCriticalMail = value;
    }

}
