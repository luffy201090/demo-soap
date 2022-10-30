
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV3"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsIBIPEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV4", propOrder = {
    "isIBIPEnabled"
})
@XmlSeeAlso({
    CapabilitiesV5 .class
})
public class CapabilitiesV4
    extends CapabilitiesV3
{

    @XmlElement(name = "IsIBIPEnabled")
    protected boolean isIBIPEnabled;

    /**
     * Gets the value of the isIBIPEnabled property.
     * 
     */
    public boolean isIsIBIPEnabled() {
        return isIBIPEnabled;
    }

    /**
     * Sets the value of the isIBIPEnabled property.
     * 
     */
    public void setIsIBIPEnabled(boolean value) {
        this.isIBIPEnabled = value;
    }

}
