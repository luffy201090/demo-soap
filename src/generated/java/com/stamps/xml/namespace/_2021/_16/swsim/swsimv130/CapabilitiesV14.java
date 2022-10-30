
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV14"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV13"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisableLabelLogo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV14", propOrder = {
    "disableLabelLogo"
})
@XmlSeeAlso({
    CapabilitiesV15 .class
})
public class CapabilitiesV14
    extends CapabilitiesV13
{

    @XmlElement(name = "DisableLabelLogo")
    protected boolean disableLabelLogo;

    /**
     * Gets the value of the disableLabelLogo property.
     * 
     */
    public boolean isDisableLabelLogo() {
        return disableLabelLogo;
    }

    /**
     * Sets the value of the disableLabelLogo property.
     * 
     */
    public void setDisableLabelLogo(boolean value) {
        this.disableLabelLogo = value;
    }

}
