
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV9"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanCreateUnlimitedStores" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV10", propOrder = {
    "canCreateUnlimitedStores"
})
@XmlSeeAlso({
    CapabilitiesV11 .class
})
public class CapabilitiesV10
    extends CapabilitiesV9
{

    @XmlElement(name = "CanCreateUnlimitedStores")
    protected boolean canCreateUnlimitedStores;

    /**
     * Gets the value of the canCreateUnlimitedStores property.
     * 
     */
    public boolean isCanCreateUnlimitedStores() {
        return canCreateUnlimitedStores;
    }

    /**
     * Sets the value of the canCreateUnlimitedStores property.
     * 
     */
    public void setCanCreateUnlimitedStores(boolean value) {
        this.canCreateUnlimitedStores = value;
    }

}
