
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="US-FC"/&gt;
 *     &lt;enumeration value="US-PM"/&gt;
 *     &lt;enumeration value="US-XM"/&gt;
 *     &lt;enumeration value="US-MM"/&gt;
 *     &lt;enumeration value="US-BP"/&gt;
 *     &lt;enumeration value="US-LM"/&gt;
 *     &lt;enumeration value="US-EMI"/&gt;
 *     &lt;enumeration value="US-PMI"/&gt;
 *     &lt;enumeration value="US-FCI"/&gt;
 *     &lt;enumeration value="US-CM"/&gt;
 *     &lt;enumeration value="US-PS"/&gt;
 *     &lt;enumeration value="DHL-PE"/&gt;
 *     &lt;enumeration value="DHL-PG"/&gt;
 *     &lt;enumeration value="DHL-BPME"/&gt;
 *     &lt;enumeration value="DHL-BPMG"/&gt;
 *     &lt;enumeration value="DHL-MPE"/&gt;
 *     &lt;enumeration value="DHL-MPG"/&gt;
 *     &lt;enumeration value="AS-IPA"/&gt;
 *     &lt;enumeration value="AS-ISAL"/&gt;
 *     &lt;enumeration value="AS-EPKT"/&gt;
 *     &lt;enumeration value="DHL-PIPA"/&gt;
 *     &lt;enumeration value="GG-IPA"/&gt;
 *     &lt;enumeration value="GG-ISAL"/&gt;
 *     &lt;enumeration value="GG-EPKT"/&gt;
 *     &lt;enumeration value="IBC-IPA"/&gt;
 *     &lt;enumeration value="IBC-ISAL"/&gt;
 *     &lt;enumeration value="IBC-EPKT"/&gt;
 *     &lt;enumeration value="RRD-IPA"/&gt;
 *     &lt;enumeration value="RRD-ISAL"/&gt;
 *     &lt;enumeration value="RRD-EPKT"/&gt;
 *     &lt;enumeration value="AS-GNRC"/&gt;
 *     &lt;enumeration value="GG-GNRC"/&gt;
 *     &lt;enumeration value="RRD-GNRC"/&gt;
 *     &lt;enumeration value="SC-GPE"/&gt;
 *     &lt;enumeration value="SC-GPP"/&gt;
 *     &lt;enumeration value="SC-GPESS"/&gt;
 *     &lt;enumeration value="SC-GPPSS"/&gt;
 *     &lt;enumeration value="DHL-EWW"/&gt;
 *     &lt;enumeration value="FX-GD"/&gt;
 *     &lt;enumeration value="FX-HD"/&gt;
 *     &lt;enumeration value="FX-2D"/&gt;
 *     &lt;enumeration value="FX-ES"/&gt;
 *     &lt;enumeration value="FX-SO"/&gt;
 *     &lt;enumeration value="FX-PO"/&gt;
 *     &lt;enumeration value="FX-GDI"/&gt;
 *     &lt;enumeration value="FX-EI"/&gt;
 *     &lt;enumeration value="FX-PI"/&gt;
 *     &lt;enumeration value="SC-GPLSS"/&gt;
 *     &lt;enumeration value="US-RG"/&gt;
 *     &lt;enumeration value="SC-GPL"/&gt;
 *     &lt;enumeration value="UPS-NDAE"/&gt;
 *     &lt;enumeration value="UPS-NDA"/&gt;
 *     &lt;enumeration value="UPS-NDAS"/&gt;
 *     &lt;enumeration value="UPS-2DAA"/&gt;
 *     &lt;enumeration value="UPS-2DA"/&gt;
 *     &lt;enumeration value="UPS-3DS"/&gt;
 *     &lt;enumeration value="UPS-GD"/&gt;
 *     &lt;enumeration value="UPS-SD"/&gt;
 *     &lt;enumeration value="UPS-WES"/&gt;
 *     &lt;enumeration value="UPS-WESP"/&gt;
 *     &lt;enumeration value="UPS-WED"/&gt;
 *     &lt;enumeration value="UPS-WSR"/&gt;
 *     &lt;enumeration value="SC-GPFCI"/&gt;
 *     &lt;enumeration value="SC-GPFCISS"/&gt;
 *     &lt;enumeration value="SC-GPPMI"/&gt;
 *     &lt;enumeration value="SC-GPPMISS"/&gt;
 *     &lt;enumeration value="SC-GPEMI"/&gt;
 *     &lt;enumeration value="SC-GPEMISS"/&gt;
 *     &lt;enumeration value="SC-GPFCSS"/&gt;
 *     &lt;enumeration value="SC-GPPSSS"/&gt;
 *     &lt;enumeration value="CP-PM"/&gt;
 *     &lt;enumeration value="CP-XP"/&gt;
 *     &lt;enumeration value="CP-EP"/&gt;
 *     &lt;enumeration value="CP-RP"/&gt;
 *     &lt;enumeration value="CP-PMW"/&gt;
 *     &lt;enumeration value="CP-PMWU"/&gt;
 *     &lt;enumeration value="CP-XPI"/&gt;
 *     &lt;enumeration value="CP-XPU"/&gt;
 *     &lt;enumeration value="CP-EPU"/&gt;
 *     &lt;enumeration value="CP-TPI"/&gt;
 *     &lt;enumeration value="CP-TPU"/&gt;
 *     &lt;enumeration value="CP-SPIA"/&gt;
 *     &lt;enumeration value="CP-SPIS"/&gt;
 *     &lt;enumeration value="CP-SPUA"/&gt;
 *     &lt;enumeration value="CP-IPA"/&gt;
 *     &lt;enumeration value="CP-IPS"/&gt;
 *     &lt;enumeration value="FX-2DAM"/&gt;
 *     &lt;enumeration value="FX-FO"/&gt;
 *     &lt;enumeration value="FX-FI"/&gt;
 *     &lt;enumeration value="US-RETURN"/&gt;
 *     &lt;enumeration value="DHL-PIPL"/&gt;
 *     &lt;enumeration value="DHL-PIS"/&gt;
 *     &lt;enumeration value="DHL-PI"/&gt;
 *     &lt;enumeration value="DHL-PID"/&gt;
 *     &lt;enumeration value="DHL-PEM"/&gt;
 *     &lt;enumeration value="UPS-GDS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceType")
@XmlEnum
public enum ServiceType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("US-FC")
    US_FC("US-FC"),
    @XmlEnumValue("US-PM")
    US_PM("US-PM"),
    @XmlEnumValue("US-XM")
    US_XM("US-XM"),
    @XmlEnumValue("US-MM")
    US_MM("US-MM"),
    @XmlEnumValue("US-BP")
    US_BP("US-BP"),
    @XmlEnumValue("US-LM")
    US_LM("US-LM"),
    @XmlEnumValue("US-EMI")
    US_EMI("US-EMI"),
    @XmlEnumValue("US-PMI")
    US_PMI("US-PMI"),
    @XmlEnumValue("US-FCI")
    US_FCI("US-FCI"),
    @XmlEnumValue("US-CM")
    US_CM("US-CM"),
    @XmlEnumValue("US-PS")
    US_PS("US-PS"),
    @XmlEnumValue("DHL-PE")
    DHL_PE("DHL-PE"),
    @XmlEnumValue("DHL-PG")
    DHL_PG("DHL-PG"),
    @XmlEnumValue("DHL-BPME")
    DHL_BPME("DHL-BPME"),
    @XmlEnumValue("DHL-BPMG")
    DHL_BPMG("DHL-BPMG"),
    @XmlEnumValue("DHL-MPE")
    DHL_MPE("DHL-MPE"),
    @XmlEnumValue("DHL-MPG")
    DHL_MPG("DHL-MPG"),
    @XmlEnumValue("AS-IPA")
    AS_IPA("AS-IPA"),
    @XmlEnumValue("AS-ISAL")
    AS_ISAL("AS-ISAL"),
    @XmlEnumValue("AS-EPKT")
    AS_EPKT("AS-EPKT"),
    @XmlEnumValue("DHL-PIPA")
    DHL_PIPA("DHL-PIPA"),
    @XmlEnumValue("GG-IPA")
    GG_IPA("GG-IPA"),
    @XmlEnumValue("GG-ISAL")
    GG_ISAL("GG-ISAL"),
    @XmlEnumValue("GG-EPKT")
    GG_EPKT("GG-EPKT"),
    @XmlEnumValue("IBC-IPA")
    IBC_IPA("IBC-IPA"),
    @XmlEnumValue("IBC-ISAL")
    IBC_ISAL("IBC-ISAL"),
    @XmlEnumValue("IBC-EPKT")
    IBC_EPKT("IBC-EPKT"),
    @XmlEnumValue("RRD-IPA")
    RRD_IPA("RRD-IPA"),
    @XmlEnumValue("RRD-ISAL")
    RRD_ISAL("RRD-ISAL"),
    @XmlEnumValue("RRD-EPKT")
    RRD_EPKT("RRD-EPKT"),
    @XmlEnumValue("AS-GNRC")
    AS_GNRC("AS-GNRC"),
    @XmlEnumValue("GG-GNRC")
    GG_GNRC("GG-GNRC"),
    @XmlEnumValue("RRD-GNRC")
    RRD_GNRC("RRD-GNRC"),
    @XmlEnumValue("SC-GPE")
    SC_GPE("SC-GPE"),
    @XmlEnumValue("SC-GPP")
    SC_GPP("SC-GPP"),
    @XmlEnumValue("SC-GPESS")
    SC_GPESS("SC-GPESS"),
    @XmlEnumValue("SC-GPPSS")
    SC_GPPSS("SC-GPPSS"),
    @XmlEnumValue("DHL-EWW")
    DHL_EWW("DHL-EWW"),
    @XmlEnumValue("FX-GD")
    FX_GD("FX-GD"),
    @XmlEnumValue("FX-HD")
    FX_HD("FX-HD"),
    @XmlEnumValue("FX-2D")
    FX_2_D("FX-2D"),
    @XmlEnumValue("FX-ES")
    FX_ES("FX-ES"),
    @XmlEnumValue("FX-SO")
    FX_SO("FX-SO"),
    @XmlEnumValue("FX-PO")
    FX_PO("FX-PO"),
    @XmlEnumValue("FX-GDI")
    FX_GDI("FX-GDI"),
    @XmlEnumValue("FX-EI")
    FX_EI("FX-EI"),
    @XmlEnumValue("FX-PI")
    FX_PI("FX-PI"),
    @XmlEnumValue("SC-GPLSS")
    SC_GPLSS("SC-GPLSS"),
    @XmlEnumValue("US-RG")
    US_RG("US-RG"),
    @XmlEnumValue("SC-GPL")
    SC_GPL("SC-GPL"),
    @XmlEnumValue("UPS-NDAE")
    UPS_NDAE("UPS-NDAE"),
    @XmlEnumValue("UPS-NDA")
    UPS_NDA("UPS-NDA"),
    @XmlEnumValue("UPS-NDAS")
    UPS_NDAS("UPS-NDAS"),
    @XmlEnumValue("UPS-2DAA")
    UPS_2_DAA("UPS-2DAA"),
    @XmlEnumValue("UPS-2DA")
    UPS_2_DA("UPS-2DA"),
    @XmlEnumValue("UPS-3DS")
    UPS_3_DS("UPS-3DS"),
    @XmlEnumValue("UPS-GD")
    UPS_GD("UPS-GD"),
    @XmlEnumValue("UPS-SD")
    UPS_SD("UPS-SD"),
    @XmlEnumValue("UPS-WES")
    UPS_WES("UPS-WES"),
    @XmlEnumValue("UPS-WESP")
    UPS_WESP("UPS-WESP"),
    @XmlEnumValue("UPS-WED")
    UPS_WED("UPS-WED"),
    @XmlEnumValue("UPS-WSR")
    UPS_WSR("UPS-WSR"),
    @XmlEnumValue("SC-GPFCI")
    SC_GPFCI("SC-GPFCI"),
    @XmlEnumValue("SC-GPFCISS")
    SC_GPFCISS("SC-GPFCISS"),
    @XmlEnumValue("SC-GPPMI")
    SC_GPPMI("SC-GPPMI"),
    @XmlEnumValue("SC-GPPMISS")
    SC_GPPMISS("SC-GPPMISS"),
    @XmlEnumValue("SC-GPEMI")
    SC_GPEMI("SC-GPEMI"),
    @XmlEnumValue("SC-GPEMISS")
    SC_GPEMISS("SC-GPEMISS"),
    @XmlEnumValue("SC-GPFCSS")
    SC_GPFCSS("SC-GPFCSS"),
    @XmlEnumValue("SC-GPPSSS")
    SC_GPPSSS("SC-GPPSSS"),
    @XmlEnumValue("CP-PM")
    CP_PM("CP-PM"),
    @XmlEnumValue("CP-XP")
    CP_XP("CP-XP"),
    @XmlEnumValue("CP-EP")
    CP_EP("CP-EP"),
    @XmlEnumValue("CP-RP")
    CP_RP("CP-RP"),
    @XmlEnumValue("CP-PMW")
    CP_PMW("CP-PMW"),
    @XmlEnumValue("CP-PMWU")
    CP_PMWU("CP-PMWU"),
    @XmlEnumValue("CP-XPI")
    CP_XPI("CP-XPI"),
    @XmlEnumValue("CP-XPU")
    CP_XPU("CP-XPU"),
    @XmlEnumValue("CP-EPU")
    CP_EPU("CP-EPU"),
    @XmlEnumValue("CP-TPI")
    CP_TPI("CP-TPI"),
    @XmlEnumValue("CP-TPU")
    CP_TPU("CP-TPU"),
    @XmlEnumValue("CP-SPIA")
    CP_SPIA("CP-SPIA"),
    @XmlEnumValue("CP-SPIS")
    CP_SPIS("CP-SPIS"),
    @XmlEnumValue("CP-SPUA")
    CP_SPUA("CP-SPUA"),
    @XmlEnumValue("CP-IPA")
    CP_IPA("CP-IPA"),
    @XmlEnumValue("CP-IPS")
    CP_IPS("CP-IPS"),
    @XmlEnumValue("FX-2DAM")
    FX_2_DAM("FX-2DAM"),
    @XmlEnumValue("FX-FO")
    FX_FO("FX-FO"),
    @XmlEnumValue("FX-FI")
    FX_FI("FX-FI"),
    @XmlEnumValue("US-RETURN")
    US_RETURN("US-RETURN"),
    @XmlEnumValue("DHL-PIPL")
    DHL_PIPL("DHL-PIPL"),
    @XmlEnumValue("DHL-PIS")
    DHL_PIS("DHL-PIS"),
    @XmlEnumValue("DHL-PI")
    DHL_PI("DHL-PI"),
    @XmlEnumValue("DHL-PID")
    DHL_PID("DHL-PID"),
    @XmlEnumValue("DHL-PEM")
    DHL_PEM("DHL-PEM"),
    @XmlEnumValue("UPS-GDS")
    UPS_GDS("UPS-GDS");
    private final String value;

    ServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceType fromValue(String v) {
        for (ServiceType c: ServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
