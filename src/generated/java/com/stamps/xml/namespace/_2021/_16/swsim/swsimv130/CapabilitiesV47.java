
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV47 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV47"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV46"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrandedExternalPrints" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV47", propOrder = {
    "brandedExternalPrints"
})
@XmlSeeAlso({
    CapabilitiesV48 .class
})
public class CapabilitiesV47
    extends CapabilitiesV46
{

    @XmlElement(name = "BrandedExternalPrints")
    protected boolean brandedExternalPrints;

    /**
     * Gets the value of the brandedExternalPrints property.
     * 
     */
    public boolean isBrandedExternalPrints() {
        return brandedExternalPrints;
    }

    /**
     * Sets the value of the brandedExternalPrints property.
     * 
     */
    public void setBrandedExternalPrints(boolean value) {
        this.brandedExternalPrints = value;
    }

}
