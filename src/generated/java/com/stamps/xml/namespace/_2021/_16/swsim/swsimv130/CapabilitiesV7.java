
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV6"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanUseCertifiedMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintAllIndiciumValues" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV7", propOrder = {
    "canUseCertifiedMail",
    "canPrintAllIndiciumValues"
})
@XmlSeeAlso({
    CapabilitiesV8 .class
})
public class CapabilitiesV7
    extends CapabilitiesV6
{

    @XmlElement(name = "CanUseCertifiedMail")
    protected boolean canUseCertifiedMail;
    @XmlElement(name = "CanPrintAllIndiciumValues")
    protected boolean canPrintAllIndiciumValues;

    /**
     * Gets the value of the canUseCertifiedMail property.
     * 
     */
    public boolean isCanUseCertifiedMail() {
        return canUseCertifiedMail;
    }

    /**
     * Sets the value of the canUseCertifiedMail property.
     * 
     */
    public void setCanUseCertifiedMail(boolean value) {
        this.canUseCertifiedMail = value;
    }

    /**
     * Gets the value of the canPrintAllIndiciumValues property.
     * 
     */
    public boolean isCanPrintAllIndiciumValues() {
        return canPrintAllIndiciumValues;
    }

    /**
     * Sets the value of the canPrintAllIndiciumValues property.
     * 
     */
    public void setCanPrintAllIndiciumValues(boolean value) {
        this.canPrintAllIndiciumValues = value;
    }

}
