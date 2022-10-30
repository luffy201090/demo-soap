
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV44 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV44"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV43"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrandedTrackingSMSSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV44", propOrder = {
    "brandedTrackingSMSSupport"
})
@XmlSeeAlso({
    CapabilitiesV45 .class
})
public class CapabilitiesV44
    extends CapabilitiesV43
{

    @XmlElement(name = "BrandedTrackingSMSSupport")
    protected boolean brandedTrackingSMSSupport;

    /**
     * Gets the value of the brandedTrackingSMSSupport property.
     * 
     */
    public boolean isBrandedTrackingSMSSupport() {
        return brandedTrackingSMSSupport;
    }

    /**
     * Sets the value of the brandedTrackingSMSSupport property.
     * 
     */
    public void setBrandedTrackingSMSSupport(boolean value) {
        this.brandedTrackingSMSSupport = value;
    }

}
