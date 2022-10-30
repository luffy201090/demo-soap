
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Capabilities"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowAllMailClasses" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV2", propOrder = {
    "allowAllMailClasses"
})
@XmlSeeAlso({
    CapabilitiesV3 .class
})
public class CapabilitiesV2
    extends Capabilities
{

    @XmlElement(name = "AllowAllMailClasses")
    protected boolean allowAllMailClasses;

    /**
     * Gets the value of the allowAllMailClasses property.
     * 
     */
    public boolean isAllowAllMailClasses() {
        return allowAllMailClasses;
    }

    /**
     * Sets the value of the allowAllMailClasses property.
     * 
     */
    public void setAllowAllMailClasses(boolean value) {
        this.allowAllMailClasses = value;
    }

}
