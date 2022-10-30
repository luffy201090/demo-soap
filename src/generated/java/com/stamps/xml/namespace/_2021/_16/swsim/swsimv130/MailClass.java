
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MailClass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="FirstClass"/&gt;
 *     &lt;enumeration value="Priority"/&gt;
 *     &lt;enumeration value="Express"/&gt;
 *     &lt;enumeration value="ParcelPost"/&gt;
 *     &lt;enumeration value="MediaMail"/&gt;
 *     &lt;enumeration value="BoundPrintedMatter"/&gt;
 *     &lt;enumeration value="MailClassIntlGxg"/&gt;
 *     &lt;enumeration value="MailClassIntlAirmailMBag"/&gt;
 *     &lt;enumeration value="MailClassIntlMatterForBlind"/&gt;
 *     &lt;enumeration value="LibraryMail"/&gt;
 *     &lt;enumeration value="ExpressMailInternational"/&gt;
 *     &lt;enumeration value="PriorityMailInternational"/&gt;
 *     &lt;enumeration value="FirstClassMailInternational"/&gt;
 *     &lt;enumeration value="MailClassIntlMBag"/&gt;
 *     &lt;enumeration value="MailClassIntlFirstClassParcel"/&gt;
 *     &lt;enumeration value="MailClassIntlFirstClassFlat"/&gt;
 *     &lt;enumeration value="Critical"/&gt;
 *     &lt;enumeration value="ParcelSelect"/&gt;
 *     &lt;enumeration value="DhlSMParcelsExpedited"/&gt;
 *     &lt;enumeration value="DhlSMParcelsGround"/&gt;
 *     &lt;enumeration value="DhlSMParcelPlusExpedited"/&gt;
 *     &lt;enumeration value="DhlSMParcelPlusGround"/&gt;
 *     &lt;enumeration value="DhlSMBpmExpedited"/&gt;
 *     &lt;enumeration value="DhlSMBpmGround"/&gt;
 *     &lt;enumeration value="DhlSMMarketingParcelExpedited"/&gt;
 *     &lt;enumeration value="DhlSMMarketingParcelGround"/&gt;
 *     &lt;enumeration value="StandardMailMarketingParcels"/&gt;
 *     &lt;enumeration value="AsendiaIpa"/&gt;
 *     &lt;enumeration value="AsendiaIsal"/&gt;
 *     &lt;enumeration value="AsendiaEpkt"/&gt;
 *     &lt;enumeration value="DhlGlobalmailPacketIpa"/&gt;
 *     &lt;enumeration value="DHLGlobalmailPacketIsal"/&gt;
 *     &lt;enumeration value="GlobegisticsIpa"/&gt;
 *     &lt;enumeration value="GlobegisticsIsal"/&gt;
 *     &lt;enumeration value="GlobegisticsEpkt"/&gt;
 *     &lt;enumeration value="InternationalBondedCouriersIpa"/&gt;
 *     &lt;enumeration value="InternationalBondedCouriersIsal"/&gt;
 *     &lt;enumeration value="InternationalBondedCouriersEpkt"/&gt;
 *     &lt;enumeration value="RrdIpa"/&gt;
 *     &lt;enumeration value="RrdIsal"/&gt;
 *     &lt;enumeration value="RrdEpkt"/&gt;
 *     &lt;enumeration value="UspsIpa"/&gt;
 *     &lt;enumeration value="UspsIsal"/&gt;
 *     &lt;enumeration value="UspsEpkt"/&gt;
 *     &lt;enumeration value="AsendiaGeneric"/&gt;
 *     &lt;enumeration value="GlobegisticsGeneric"/&gt;
 *     &lt;enumeration value="ScGeneric"/&gt;
 *     &lt;enumeration value="RrdGeneric"/&gt;
 *     &lt;enumeration value="GlobalPostEconomy"/&gt;
 *     &lt;enumeration value="GlobalPostPriority"/&gt;
 *     &lt;enumeration value="GlobalPostEconomySmartSaver"/&gt;
 *     &lt;enumeration value="GlobalPostPrioritySmartSaver"/&gt;
 *     &lt;enumeration value="DHLExpress"/&gt;
 *     &lt;enumeration value="FedExGround"/&gt;
 *     &lt;enumeration value="FedExHomeDelivery"/&gt;
 *     &lt;enumeration value="FedEx2Day"/&gt;
 *     &lt;enumeration value="FedExExpressSaver"/&gt;
 *     &lt;enumeration value="FedExStandardOvernight"/&gt;
 *     &lt;enumeration value="FedExPriorityOvernight"/&gt;
 *     &lt;enumeration value="FedExInternationalGround"/&gt;
 *     &lt;enumeration value="FedExInternationalEconomy"/&gt;
 *     &lt;enumeration value="FedExInternationalPriority"/&gt;
 *     &lt;enumeration value="GlobalPostPlusSmartSaver"/&gt;
 *     &lt;enumeration value="RetailGround"/&gt;
 *     &lt;enumeration value="GlobalPostPlus"/&gt;
 *     &lt;enumeration value="UPSNextDayAirEarly"/&gt;
 *     &lt;enumeration value="UPSNextDayAir"/&gt;
 *     &lt;enumeration value="UPSNextDayAirSaver"/&gt;
 *     &lt;enumeration value="UPS2ndDayAirAM"/&gt;
 *     &lt;enumeration value="UPS2ndDayAir"/&gt;
 *     &lt;enumeration value="UPS3DaySelect"/&gt;
 *     &lt;enumeration value="UPSGround"/&gt;
 *     &lt;enumeration value="UPSStandard"/&gt;
 *     &lt;enumeration value="UPSWorldwideExpress"/&gt;
 *     &lt;enumeration value="UPSWorldwideExpressPlus"/&gt;
 *     &lt;enumeration value="UPSWorldwideExpedited"/&gt;
 *     &lt;enumeration value="UPSWorldwideSaver"/&gt;
 *     &lt;enumeration value="GlobalPostFCI"/&gt;
 *     &lt;enumeration value="GlobalPostFCISS"/&gt;
 *     &lt;enumeration value="GlobalPostPMI"/&gt;
 *     &lt;enumeration value="GlobalPostPMISS"/&gt;
 *     &lt;enumeration value="GlobalPostEMI"/&gt;
 *     &lt;enumeration value="GlobalPostEMISS"/&gt;
 *     &lt;enumeration value="GlobalPostFCSS"/&gt;
 *     &lt;enumeration value="GlobalPostPSSS"/&gt;
 *     &lt;enumeration value="CanadaPostPriority"/&gt;
 *     &lt;enumeration value="CanadaPostXpressPost"/&gt;
 *     &lt;enumeration value="CanadaPostExpeditedParcel"/&gt;
 *     &lt;enumeration value="CanadaPostRegularParcel"/&gt;
 *     &lt;enumeration value="CanadaPostPriorityWorldWide"/&gt;
 *     &lt;enumeration value="CanadaPostPriorityWorldWideUSA"/&gt;
 *     &lt;enumeration value="CanadaPostXpresspostInternational"/&gt;
 *     &lt;enumeration value="CanadaPostXpresspostUSA"/&gt;
 *     &lt;enumeration value="CanadaPostExpeditedParcelUSA"/&gt;
 *     &lt;enumeration value="CanadaPostTrackedPacketInternational"/&gt;
 *     &lt;enumeration value="CanadaPostTrackedPackageUSA"/&gt;
 *     &lt;enumeration value="CanadaPostSmallPacketInternationalAir"/&gt;
 *     &lt;enumeration value="CanadaPostSmallPacketInternationalSurface"/&gt;
 *     &lt;enumeration value="CanadaPostSmallPacketUSAAir"/&gt;
 *     &lt;enumeration value="CanadaPostInternationalParcelAir"/&gt;
 *     &lt;enumeration value="CanadaPostInternationalParcelSurface"/&gt;
 *     &lt;enumeration value="FedEx2DayAM"/&gt;
 *     &lt;enumeration value="FedExFirstOvernight"/&gt;
 *     &lt;enumeration value="FedExInternationalFirst"/&gt;
 *     &lt;enumeration value="UspsReturn"/&gt;
 *     &lt;enumeration value="DhlGlobalmailPacketIpl"/&gt;
 *     &lt;enumeration value="DhlGlobalmailPacketIpr"/&gt;
 *     &lt;enumeration value="DhlGlobalmailPacketIst"/&gt;
 *     &lt;enumeration value="DhlGlobalmailParcelIdep"/&gt;
 *     &lt;enumeration value="DhlGlobalmailParcelIdeu"/&gt;
 *     &lt;enumeration value="DhlGlobalmailParcelIdpp"/&gt;
 *     &lt;enumeration value="DhlGlobalmailParcelIdpu"/&gt;
 *     &lt;enumeration value="DhlGlobalmailParcelIp"/&gt;
 *     &lt;enumeration value="DhlGlobalmailParcelIs"/&gt;
 *     &lt;enumeration value="DhlPacketInternational"/&gt;
 *     &lt;enumeration value="DhlParcelInternationalDirect"/&gt;
 *     &lt;enumeration value="DhlSMParcelExpeditedMax"/&gt;
 *     &lt;enumeration value="UPSGroundSaver"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MailClass")
@XmlEnum
public enum MailClass {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("FirstClass")
    FIRST_CLASS("FirstClass"),
    @XmlEnumValue("Priority")
    PRIORITY("Priority"),
    @XmlEnumValue("Express")
    EXPRESS("Express"),
    @XmlEnumValue("ParcelPost")
    PARCEL_POST("ParcelPost"),
    @XmlEnumValue("MediaMail")
    MEDIA_MAIL("MediaMail"),
    @XmlEnumValue("BoundPrintedMatter")
    BOUND_PRINTED_MATTER("BoundPrintedMatter"),
    @XmlEnumValue("MailClassIntlGxg")
    MAIL_CLASS_INTL_GXG("MailClassIntlGxg"),
    @XmlEnumValue("MailClassIntlAirmailMBag")
    MAIL_CLASS_INTL_AIRMAIL_M_BAG("MailClassIntlAirmailMBag"),
    @XmlEnumValue("MailClassIntlMatterForBlind")
    MAIL_CLASS_INTL_MATTER_FOR_BLIND("MailClassIntlMatterForBlind"),
    @XmlEnumValue("LibraryMail")
    LIBRARY_MAIL("LibraryMail"),
    @XmlEnumValue("ExpressMailInternational")
    EXPRESS_MAIL_INTERNATIONAL("ExpressMailInternational"),
    @XmlEnumValue("PriorityMailInternational")
    PRIORITY_MAIL_INTERNATIONAL("PriorityMailInternational"),
    @XmlEnumValue("FirstClassMailInternational")
    FIRST_CLASS_MAIL_INTERNATIONAL("FirstClassMailInternational"),
    @XmlEnumValue("MailClassIntlMBag")
    MAIL_CLASS_INTL_M_BAG("MailClassIntlMBag"),
    @XmlEnumValue("MailClassIntlFirstClassParcel")
    MAIL_CLASS_INTL_FIRST_CLASS_PARCEL("MailClassIntlFirstClassParcel"),
    @XmlEnumValue("MailClassIntlFirstClassFlat")
    MAIL_CLASS_INTL_FIRST_CLASS_FLAT("MailClassIntlFirstClassFlat"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical"),
    @XmlEnumValue("ParcelSelect")
    PARCEL_SELECT("ParcelSelect"),
    @XmlEnumValue("DhlSMParcelsExpedited")
    DHL_SM_PARCELS_EXPEDITED("DhlSMParcelsExpedited"),
    @XmlEnumValue("DhlSMParcelsGround")
    DHL_SM_PARCELS_GROUND("DhlSMParcelsGround"),
    @XmlEnumValue("DhlSMParcelPlusExpedited")
    DHL_SM_PARCEL_PLUS_EXPEDITED("DhlSMParcelPlusExpedited"),
    @XmlEnumValue("DhlSMParcelPlusGround")
    DHL_SM_PARCEL_PLUS_GROUND("DhlSMParcelPlusGround"),
    @XmlEnumValue("DhlSMBpmExpedited")
    DHL_SM_BPM_EXPEDITED("DhlSMBpmExpedited"),
    @XmlEnumValue("DhlSMBpmGround")
    DHL_SM_BPM_GROUND("DhlSMBpmGround"),
    @XmlEnumValue("DhlSMMarketingParcelExpedited")
    DHL_SM_MARKETING_PARCEL_EXPEDITED("DhlSMMarketingParcelExpedited"),
    @XmlEnumValue("DhlSMMarketingParcelGround")
    DHL_SM_MARKETING_PARCEL_GROUND("DhlSMMarketingParcelGround"),
    @XmlEnumValue("StandardMailMarketingParcels")
    STANDARD_MAIL_MARKETING_PARCELS("StandardMailMarketingParcels"),
    @XmlEnumValue("AsendiaIpa")
    ASENDIA_IPA("AsendiaIpa"),
    @XmlEnumValue("AsendiaIsal")
    ASENDIA_ISAL("AsendiaIsal"),
    @XmlEnumValue("AsendiaEpkt")
    ASENDIA_EPKT("AsendiaEpkt"),
    @XmlEnumValue("DhlGlobalmailPacketIpa")
    DHL_GLOBALMAIL_PACKET_IPA("DhlGlobalmailPacketIpa"),
    @XmlEnumValue("DHLGlobalmailPacketIsal")
    DHL_GLOBALMAIL_PACKET_ISAL("DHLGlobalmailPacketIsal"),
    @XmlEnumValue("GlobegisticsIpa")
    GLOBEGISTICS_IPA("GlobegisticsIpa"),
    @XmlEnumValue("GlobegisticsIsal")
    GLOBEGISTICS_ISAL("GlobegisticsIsal"),
    @XmlEnumValue("GlobegisticsEpkt")
    GLOBEGISTICS_EPKT("GlobegisticsEpkt"),
    @XmlEnumValue("InternationalBondedCouriersIpa")
    INTERNATIONAL_BONDED_COURIERS_IPA("InternationalBondedCouriersIpa"),
    @XmlEnumValue("InternationalBondedCouriersIsal")
    INTERNATIONAL_BONDED_COURIERS_ISAL("InternationalBondedCouriersIsal"),
    @XmlEnumValue("InternationalBondedCouriersEpkt")
    INTERNATIONAL_BONDED_COURIERS_EPKT("InternationalBondedCouriersEpkt"),
    @XmlEnumValue("RrdIpa")
    RRD_IPA("RrdIpa"),
    @XmlEnumValue("RrdIsal")
    RRD_ISAL("RrdIsal"),
    @XmlEnumValue("RrdEpkt")
    RRD_EPKT("RrdEpkt"),
    @XmlEnumValue("UspsIpa")
    USPS_IPA("UspsIpa"),
    @XmlEnumValue("UspsIsal")
    USPS_ISAL("UspsIsal"),
    @XmlEnumValue("UspsEpkt")
    USPS_EPKT("UspsEpkt"),
    @XmlEnumValue("AsendiaGeneric")
    ASENDIA_GENERIC("AsendiaGeneric"),
    @XmlEnumValue("GlobegisticsGeneric")
    GLOBEGISTICS_GENERIC("GlobegisticsGeneric"),
    @XmlEnumValue("ScGeneric")
    SC_GENERIC("ScGeneric"),
    @XmlEnumValue("RrdGeneric")
    RRD_GENERIC("RrdGeneric"),
    @XmlEnumValue("GlobalPostEconomy")
    GLOBAL_POST_ECONOMY("GlobalPostEconomy"),
    @XmlEnumValue("GlobalPostPriority")
    GLOBAL_POST_PRIORITY("GlobalPostPriority"),
    @XmlEnumValue("GlobalPostEconomySmartSaver")
    GLOBAL_POST_ECONOMY_SMART_SAVER("GlobalPostEconomySmartSaver"),
    @XmlEnumValue("GlobalPostPrioritySmartSaver")
    GLOBAL_POST_PRIORITY_SMART_SAVER("GlobalPostPrioritySmartSaver"),
    @XmlEnumValue("DHLExpress")
    DHL_EXPRESS("DHLExpress"),
    @XmlEnumValue("FedExGround")
    FED_EX_GROUND("FedExGround"),
    @XmlEnumValue("FedExHomeDelivery")
    FED_EX_HOME_DELIVERY("FedExHomeDelivery"),
    @XmlEnumValue("FedEx2Day")
    FED_EX_2_DAY("FedEx2Day"),
    @XmlEnumValue("FedExExpressSaver")
    FED_EX_EXPRESS_SAVER("FedExExpressSaver"),
    @XmlEnumValue("FedExStandardOvernight")
    FED_EX_STANDARD_OVERNIGHT("FedExStandardOvernight"),
    @XmlEnumValue("FedExPriorityOvernight")
    FED_EX_PRIORITY_OVERNIGHT("FedExPriorityOvernight"),
    @XmlEnumValue("FedExInternationalGround")
    FED_EX_INTERNATIONAL_GROUND("FedExInternationalGround"),
    @XmlEnumValue("FedExInternationalEconomy")
    FED_EX_INTERNATIONAL_ECONOMY("FedExInternationalEconomy"),
    @XmlEnumValue("FedExInternationalPriority")
    FED_EX_INTERNATIONAL_PRIORITY("FedExInternationalPriority"),
    @XmlEnumValue("GlobalPostPlusSmartSaver")
    GLOBAL_POST_PLUS_SMART_SAVER("GlobalPostPlusSmartSaver"),
    @XmlEnumValue("RetailGround")
    RETAIL_GROUND("RetailGround"),
    @XmlEnumValue("GlobalPostPlus")
    GLOBAL_POST_PLUS("GlobalPostPlus"),
    @XmlEnumValue("UPSNextDayAirEarly")
    UPS_NEXT_DAY_AIR_EARLY("UPSNextDayAirEarly"),
    @XmlEnumValue("UPSNextDayAir")
    UPS_NEXT_DAY_AIR("UPSNextDayAir"),
    @XmlEnumValue("UPSNextDayAirSaver")
    UPS_NEXT_DAY_AIR_SAVER("UPSNextDayAirSaver"),
    @XmlEnumValue("UPS2ndDayAirAM")
    UPS_2_ND_DAY_AIR_AM("UPS2ndDayAirAM"),
    @XmlEnumValue("UPS2ndDayAir")
    UPS_2_ND_DAY_AIR("UPS2ndDayAir"),
    @XmlEnumValue("UPS3DaySelect")
    UPS_3_DAY_SELECT("UPS3DaySelect"),
    @XmlEnumValue("UPSGround")
    UPS_GROUND("UPSGround"),
    @XmlEnumValue("UPSStandard")
    UPS_STANDARD("UPSStandard"),
    @XmlEnumValue("UPSWorldwideExpress")
    UPS_WORLDWIDE_EXPRESS("UPSWorldwideExpress"),
    @XmlEnumValue("UPSWorldwideExpressPlus")
    UPS_WORLDWIDE_EXPRESS_PLUS("UPSWorldwideExpressPlus"),
    @XmlEnumValue("UPSWorldwideExpedited")
    UPS_WORLDWIDE_EXPEDITED("UPSWorldwideExpedited"),
    @XmlEnumValue("UPSWorldwideSaver")
    UPS_WORLDWIDE_SAVER("UPSWorldwideSaver"),
    @XmlEnumValue("GlobalPostFCI")
    GLOBAL_POST_FCI("GlobalPostFCI"),
    @XmlEnumValue("GlobalPostFCISS")
    GLOBAL_POST_FCISS("GlobalPostFCISS"),
    @XmlEnumValue("GlobalPostPMI")
    GLOBAL_POST_PMI("GlobalPostPMI"),
    @XmlEnumValue("GlobalPostPMISS")
    GLOBAL_POST_PMISS("GlobalPostPMISS"),
    @XmlEnumValue("GlobalPostEMI")
    GLOBAL_POST_EMI("GlobalPostEMI"),
    @XmlEnumValue("GlobalPostEMISS")
    GLOBAL_POST_EMISS("GlobalPostEMISS"),
    @XmlEnumValue("GlobalPostFCSS")
    GLOBAL_POST_FCSS("GlobalPostFCSS"),
    @XmlEnumValue("GlobalPostPSSS")
    GLOBAL_POST_PSSS("GlobalPostPSSS"),
    @XmlEnumValue("CanadaPostPriority")
    CANADA_POST_PRIORITY("CanadaPostPriority"),
    @XmlEnumValue("CanadaPostXpressPost")
    CANADA_POST_XPRESS_POST("CanadaPostXpressPost"),
    @XmlEnumValue("CanadaPostExpeditedParcel")
    CANADA_POST_EXPEDITED_PARCEL("CanadaPostExpeditedParcel"),
    @XmlEnumValue("CanadaPostRegularParcel")
    CANADA_POST_REGULAR_PARCEL("CanadaPostRegularParcel"),
    @XmlEnumValue("CanadaPostPriorityWorldWide")
    CANADA_POST_PRIORITY_WORLD_WIDE("CanadaPostPriorityWorldWide"),
    @XmlEnumValue("CanadaPostPriorityWorldWideUSA")
    CANADA_POST_PRIORITY_WORLD_WIDE_USA("CanadaPostPriorityWorldWideUSA"),
    @XmlEnumValue("CanadaPostXpresspostInternational")
    CANADA_POST_XPRESSPOST_INTERNATIONAL("CanadaPostXpresspostInternational"),
    @XmlEnumValue("CanadaPostXpresspostUSA")
    CANADA_POST_XPRESSPOST_USA("CanadaPostXpresspostUSA"),
    @XmlEnumValue("CanadaPostExpeditedParcelUSA")
    CANADA_POST_EXPEDITED_PARCEL_USA("CanadaPostExpeditedParcelUSA"),
    @XmlEnumValue("CanadaPostTrackedPacketInternational")
    CANADA_POST_TRACKED_PACKET_INTERNATIONAL("CanadaPostTrackedPacketInternational"),
    @XmlEnumValue("CanadaPostTrackedPackageUSA")
    CANADA_POST_TRACKED_PACKAGE_USA("CanadaPostTrackedPackageUSA"),
    @XmlEnumValue("CanadaPostSmallPacketInternationalAir")
    CANADA_POST_SMALL_PACKET_INTERNATIONAL_AIR("CanadaPostSmallPacketInternationalAir"),
    @XmlEnumValue("CanadaPostSmallPacketInternationalSurface")
    CANADA_POST_SMALL_PACKET_INTERNATIONAL_SURFACE("CanadaPostSmallPacketInternationalSurface"),
    @XmlEnumValue("CanadaPostSmallPacketUSAAir")
    CANADA_POST_SMALL_PACKET_USA_AIR("CanadaPostSmallPacketUSAAir"),
    @XmlEnumValue("CanadaPostInternationalParcelAir")
    CANADA_POST_INTERNATIONAL_PARCEL_AIR("CanadaPostInternationalParcelAir"),
    @XmlEnumValue("CanadaPostInternationalParcelSurface")
    CANADA_POST_INTERNATIONAL_PARCEL_SURFACE("CanadaPostInternationalParcelSurface"),
    @XmlEnumValue("FedEx2DayAM")
    FED_EX_2_DAY_AM("FedEx2DayAM"),
    @XmlEnumValue("FedExFirstOvernight")
    FED_EX_FIRST_OVERNIGHT("FedExFirstOvernight"),
    @XmlEnumValue("FedExInternationalFirst")
    FED_EX_INTERNATIONAL_FIRST("FedExInternationalFirst"),
    @XmlEnumValue("UspsReturn")
    USPS_RETURN("UspsReturn"),
    @XmlEnumValue("DhlGlobalmailPacketIpl")
    DHL_GLOBALMAIL_PACKET_IPL("DhlGlobalmailPacketIpl"),
    @XmlEnumValue("DhlGlobalmailPacketIpr")
    DHL_GLOBALMAIL_PACKET_IPR("DhlGlobalmailPacketIpr"),
    @XmlEnumValue("DhlGlobalmailPacketIst")
    DHL_GLOBALMAIL_PACKET_IST("DhlGlobalmailPacketIst"),
    @XmlEnumValue("DhlGlobalmailParcelIdep")
    DHL_GLOBALMAIL_PARCEL_IDEP("DhlGlobalmailParcelIdep"),
    @XmlEnumValue("DhlGlobalmailParcelIdeu")
    DHL_GLOBALMAIL_PARCEL_IDEU("DhlGlobalmailParcelIdeu"),
    @XmlEnumValue("DhlGlobalmailParcelIdpp")
    DHL_GLOBALMAIL_PARCEL_IDPP("DhlGlobalmailParcelIdpp"),
    @XmlEnumValue("DhlGlobalmailParcelIdpu")
    DHL_GLOBALMAIL_PARCEL_IDPU("DhlGlobalmailParcelIdpu"),
    @XmlEnumValue("DhlGlobalmailParcelIp")
    DHL_GLOBALMAIL_PARCEL_IP("DhlGlobalmailParcelIp"),
    @XmlEnumValue("DhlGlobalmailParcelIs")
    DHL_GLOBALMAIL_PARCEL_IS("DhlGlobalmailParcelIs"),
    @XmlEnumValue("DhlPacketInternational")
    DHL_PACKET_INTERNATIONAL("DhlPacketInternational"),
    @XmlEnumValue("DhlParcelInternationalDirect")
    DHL_PARCEL_INTERNATIONAL_DIRECT("DhlParcelInternationalDirect"),
    @XmlEnumValue("DhlSMParcelExpeditedMax")
    DHL_SM_PARCEL_EXPEDITED_MAX("DhlSMParcelExpeditedMax"),
    @XmlEnumValue("UPSGroundSaver")
    UPS_GROUND_SAVER("UPSGroundSaver");
    private final String value;

    MailClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailClass fromValue(String v) {
        for (MailClass c: MailClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
