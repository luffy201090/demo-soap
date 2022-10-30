
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV42 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV42"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV41"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintDHLEcommerce" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV42", propOrder = {
    "canPrintDHLEcommerce"
})
@XmlSeeAlso({
    CapabilitiesV43 .class
})
public class CapabilitiesV42
    extends CapabilitiesV41
{

    @XmlElement(name = "CanPrintDHLEcommerce")
    protected boolean canPrintDHLEcommerce;

    /**
     * Gets the value of the canPrintDHLEcommerce property.
     * 
     */
    public boolean isCanPrintDHLEcommerce() {
        return canPrintDHLEcommerce;
    }

    /**
     * Sets the value of the canPrintDHLEcommerce property.
     * 
     */
    public void setCanPrintDHLEcommerce(boolean value) {
        this.canPrintDHLEcommerce = value;
    }

}
