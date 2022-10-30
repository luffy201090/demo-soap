
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV29"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV28"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintFCMIFlatDelCon" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanBypassDomesticCustoms" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV29", propOrder = {
    "canPrintFCMIFlatDelCon",
    "canBypassDomesticCustoms"
})
@XmlSeeAlso({
    CapabilitiesV30 .class
})
public class CapabilitiesV29
    extends CapabilitiesV28
{

    @XmlElement(name = "CanPrintFCMIFlatDelCon")
    protected boolean canPrintFCMIFlatDelCon;
    @XmlElement(name = "CanBypassDomesticCustoms")
    protected boolean canBypassDomesticCustoms;

    /**
     * Gets the value of the canPrintFCMIFlatDelCon property.
     * 
     */
    public boolean isCanPrintFCMIFlatDelCon() {
        return canPrintFCMIFlatDelCon;
    }

    /**
     * Sets the value of the canPrintFCMIFlatDelCon property.
     * 
     */
    public void setCanPrintFCMIFlatDelCon(boolean value) {
        this.canPrintFCMIFlatDelCon = value;
    }

    /**
     * Gets the value of the canBypassDomesticCustoms property.
     * 
     */
    public boolean isCanBypassDomesticCustoms() {
        return canBypassDomesticCustoms;
    }

    /**
     * Sets the value of the canBypassDomesticCustoms property.
     * 
     */
    public void setCanBypassDomesticCustoms(boolean value) {
        this.canBypassDomesticCustoms = value;
    }

}
