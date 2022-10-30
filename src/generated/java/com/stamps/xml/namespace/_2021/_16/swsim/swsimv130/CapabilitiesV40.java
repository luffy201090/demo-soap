
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesV40 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesV40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}CapabilitiesV39"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanExportPrintHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanScheduleReports" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanUseRateAdvisor" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanUseBrandedEmails" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesV40", propOrder = {
    "canExportPrintHistory",
    "canScheduleReports",
    "canUseRateAdvisor",
    "canUseBrandedEmails"
})
@XmlSeeAlso({
    CapabilitiesV41 .class
})
public class CapabilitiesV40
    extends CapabilitiesV39
{

    @XmlElement(name = "CanExportPrintHistory")
    protected boolean canExportPrintHistory;
    @XmlElement(name = "CanScheduleReports")
    protected boolean canScheduleReports;
    @XmlElement(name = "CanUseRateAdvisor")
    protected boolean canUseRateAdvisor;
    @XmlElement(name = "CanUseBrandedEmails")
    protected boolean canUseBrandedEmails;

    /**
     * Gets the value of the canExportPrintHistory property.
     * 
     */
    public boolean isCanExportPrintHistory() {
        return canExportPrintHistory;
    }

    /**
     * Sets the value of the canExportPrintHistory property.
     * 
     */
    public void setCanExportPrintHistory(boolean value) {
        this.canExportPrintHistory = value;
    }

    /**
     * Gets the value of the canScheduleReports property.
     * 
     */
    public boolean isCanScheduleReports() {
        return canScheduleReports;
    }

    /**
     * Sets the value of the canScheduleReports property.
     * 
     */
    public void setCanScheduleReports(boolean value) {
        this.canScheduleReports = value;
    }

    /**
     * Gets the value of the canUseRateAdvisor property.
     * 
     */
    public boolean isCanUseRateAdvisor() {
        return canUseRateAdvisor;
    }

    /**
     * Sets the value of the canUseRateAdvisor property.
     * 
     */
    public void setCanUseRateAdvisor(boolean value) {
        this.canUseRateAdvisor = value;
    }

    /**
     * Gets the value of the canUseBrandedEmails property.
     * 
     */
    public boolean isCanUseBrandedEmails() {
        return canUseBrandedEmails;
    }

    /**
     * Sets the value of the canUseBrandedEmails property.
     * 
     */
    public void setCanUseBrandedEmails(boolean value) {
        this.canUseBrandedEmails = value;
    }

}
