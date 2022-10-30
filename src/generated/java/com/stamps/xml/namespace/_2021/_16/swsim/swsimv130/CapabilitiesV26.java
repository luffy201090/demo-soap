
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV26 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV26"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV25"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanPrintPMOD" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintPMEOD" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintRetailGround" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanPrintPSLW" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ZPB" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV26", propOrder = {
    "canPrintPMOD",
    "canPrintPMEOD",
    "canPrintRetailGround",
    "canPrintPSLW",
    "zpb"
})
@XmlSeeAlso({
    CapabilitiesV27 .class
})
public class CapabilitiesV26
    extends CapabilitiesV25
{

    @XmlElement(name = "CanPrintPMOD")
    protected boolean canPrintPMOD;
    @XmlElement(name = "CanPrintPMEOD")
    protected boolean canPrintPMEOD;
    @XmlElement(name = "CanPrintRetailGround")
    protected boolean canPrintRetailGround;
    @XmlElement(name = "CanPrintPSLW")
    protected boolean canPrintPSLW;
    @XmlElement(name = "ZPB")
    protected boolean zpb;

    /**
     * Gets the value of the canPrintPMOD property.
     * 
     */
    public boolean isCanPrintPMOD() {
        return canPrintPMOD;
    }

    /**
     * Sets the value of the canPrintPMOD property.
     * 
     */
    public void setCanPrintPMOD(boolean value) {
        this.canPrintPMOD = value;
    }

    /**
     * Gets the value of the canPrintPMEOD property.
     * 
     */
    public boolean isCanPrintPMEOD() {
        return canPrintPMEOD;
    }

    /**
     * Sets the value of the canPrintPMEOD property.
     * 
     */
    public void setCanPrintPMEOD(boolean value) {
        this.canPrintPMEOD = value;
    }

    /**
     * Gets the value of the canPrintRetailGround property.
     * 
     */
    public boolean isCanPrintRetailGround() {
        return canPrintRetailGround;
    }

    /**
     * Sets the value of the canPrintRetailGround property.
     * 
     */
    public void setCanPrintRetailGround(boolean value) {
        this.canPrintRetailGround = value;
    }

    /**
     * Gets the value of the canPrintPSLW property.
     * 
     */
    public boolean isCanPrintPSLW() {
        return canPrintPSLW;
    }

    /**
     * Sets the value of the canPrintPSLW property.
     * 
     */
    public void setCanPrintPSLW(boolean value) {
        this.canPrintPSLW = value;
    }

    /**
     * Gets the value of the zpb property.
     * 
     */
    public boolean isZPB() {
        return zpb;
    }

    /**
     * Sets the value of the zpb property.
     * 
     */
    public void setZPB(boolean value) {
        this.zpb = value;
    }

}
