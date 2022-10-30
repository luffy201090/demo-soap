
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UrlType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HomePage"/&gt;
 *     &lt;enumeration value="AccountSettingsPage"/&gt;
 *     &lt;enumeration value="EditCostCodesPage"/&gt;
 *     &lt;enumeration value="OnlineReportsPage"/&gt;
 *     &lt;enumeration value="HelpPage"/&gt;
 *     &lt;enumeration value="OnlineReportingHistory"/&gt;
 *     &lt;enumeration value="OnlineReportingRefund"/&gt;
 *     &lt;enumeration value="OnlineReportingPickup"/&gt;
 *     &lt;enumeration value="OnlineReportingSCAN"/&gt;
 *     &lt;enumeration value="OnlineReportingClaim"/&gt;
 *     &lt;enumeration value="StoreChangePlan"/&gt;
 *     &lt;enumeration value="WebClientHome"/&gt;
 *     &lt;enumeration value="ReportsBalances"/&gt;
 *     &lt;enumeration value="ReportsExpenses"/&gt;
 *     &lt;enumeration value="ReportsPrints"/&gt;
 *     &lt;enumeration value="StoreBuyPostage"/&gt;
 *     &lt;enumeration value="StoreMeters"/&gt;
 *     &lt;enumeration value="StoreUsers"/&gt;
 *     &lt;enumeration value="StorePaymentMethods"/&gt;
 *     &lt;enumeration value="StoreCorpContactInfo"/&gt;
 *     &lt;enumeration value="StoreMeterUsers"/&gt;
 *     &lt;enumeration value="StoreMeterSettings"/&gt;
 *     &lt;enumeration value="StoreMeterAddress"/&gt;
 *     &lt;enumeration value="StoreShippingAddresses"/&gt;
 *     &lt;enumeration value="StoreReferAFriend"/&gt;
 *     &lt;enumeration value="StoreAccountCredit"/&gt;
 *     &lt;enumeration value="StoreReorder"/&gt;
 *     &lt;enumeration value="StoreMyProfile"/&gt;
 *     &lt;enumeration value="StorePassword"/&gt;
 *     &lt;enumeration value="StoreCommPreferences"/&gt;
 *     &lt;enumeration value="StoreNetStampsLabels"/&gt;
 *     &lt;enumeration value="StoreShippingLabels"/&gt;
 *     &lt;enumeration value="StoreMailingLabels"/&gt;
 *     &lt;enumeration value="StoreScalesAndPrinters"/&gt;
 *     &lt;enumeration value="StoreFreeUSPSSupplies"/&gt;
 *     &lt;enumeration value="StoreBubbleMailers"/&gt;
 *     &lt;enumeration value="StoreShippingSupplies"/&gt;
 *     &lt;enumeration value="StoreScales"/&gt;
 *     &lt;enumeration value="StoreAveryNetStampsLabels"/&gt;
 *     &lt;enumeration value="StoreAveryMailingLabels"/&gt;
 *     &lt;enumeration value="StoreMeterContactInfo"/&gt;
 *     &lt;enumeration value="StoreEditMeterAddress"/&gt;
 *     &lt;enumeration value="StoreHome"/&gt;
 *     &lt;enumeration value="StoreAccount"/&gt;
 *     &lt;enumeration value="StoreCostCode"/&gt;
 *     &lt;enumeration value="StoreHistory"/&gt;
 *     &lt;enumeration value="StoreFaq"/&gt;
 *     &lt;enumeration value="StoreCustomerHome"/&gt;
 *     &lt;enumeration value="StoreGetAccountInfoJSon"/&gt;
 *     &lt;enumeration value="StoreSetAccountInfoJSon"/&gt;
 *     &lt;enumeration value="StoreUserCategories"/&gt;
 *     &lt;enumeration value="StoreCategory"/&gt;
 *     &lt;enumeration value="StoreUpdatePaymentMethodResubmit"/&gt;
 *     &lt;enumeration value="StoreDefaultPaymentMethods"/&gt;
 *     &lt;enumeration value="StoreSignOut"/&gt;
 *     &lt;enumeration value="CustomShipNotifyEmail"/&gt;
 *     &lt;enumeration value="HelpCenterHome"/&gt;
 *     &lt;enumeration value="MustChangePassword"/&gt;
 *     &lt;enumeration value="Contacts"/&gt;
 *     &lt;enumeration value="WebClientPreferences"/&gt;
 *     &lt;enumeration value="WebClientDefault"/&gt;
 *     &lt;enumeration value="StoreAutoBuy"/&gt;
 *     &lt;enumeration value="SetTermsGeneral"/&gt;
 *     &lt;enumeration value="UploadImage"/&gt;
 *     &lt;enumeration value="EndiciaLogin"/&gt;
 *     &lt;enumeration value="PhoneVerification"/&gt;
 *     &lt;enumeration value="CarrierSetupDHLExpress"/&gt;
 *     &lt;enumeration value="CarrierSetupUPS"/&gt;
 *     &lt;enumeration value="CarrierManagement"/&gt;
 *     &lt;enumeration value="StoreOrderHistory"/&gt;
 *     &lt;enumeration value="StoreSubscriptions"/&gt;
 *     &lt;enumeration value="StoreHardware"/&gt;
 *     &lt;enumeration value="StoreEnvelopes"/&gt;
 *     &lt;enumeration value="StoreLabels"/&gt;
 *     &lt;enumeration value="StoreClearNetStamps"/&gt;
 *     &lt;enumeration value="StoreOriginalNetStamps"/&gt;
 *     &lt;enumeration value="StoreNetStamps"/&gt;
 *     &lt;enumeration value="StoreSignIn"/&gt;
 *     &lt;enumeration value="AddPayment"/&gt;
 *     &lt;enumeration value="CarrierSetupFedEx"/&gt;
 *     &lt;enumeration value="ParcelGuard"/&gt;
 *     &lt;enumeration value="BrandedTracking"/&gt;
 *     &lt;enumeration value="RateAdvisor"/&gt;
 *     &lt;enumeration value="PPL"/&gt;
 *     &lt;enumeration value="ParcelGuardClaim"/&gt;
 *     &lt;enumeration value="ParcelGuardClaimStatus"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrlType")
@XmlEnum
public enum UrlType {

    @XmlEnumValue("HomePage")
    HOME_PAGE("HomePage"),
    @XmlEnumValue("AccountSettingsPage")
    ACCOUNT_SETTINGS_PAGE("AccountSettingsPage"),
    @XmlEnumValue("EditCostCodesPage")
    EDIT_COST_CODES_PAGE("EditCostCodesPage"),
    @XmlEnumValue("OnlineReportsPage")
    ONLINE_REPORTS_PAGE("OnlineReportsPage"),
    @XmlEnumValue("HelpPage")
    HELP_PAGE("HelpPage"),
    @XmlEnumValue("OnlineReportingHistory")
    ONLINE_REPORTING_HISTORY("OnlineReportingHistory"),
    @XmlEnumValue("OnlineReportingRefund")
    ONLINE_REPORTING_REFUND("OnlineReportingRefund"),
    @XmlEnumValue("OnlineReportingPickup")
    ONLINE_REPORTING_PICKUP("OnlineReportingPickup"),
    @XmlEnumValue("OnlineReportingSCAN")
    ONLINE_REPORTING_SCAN("OnlineReportingSCAN"),
    @XmlEnumValue("OnlineReportingClaim")
    ONLINE_REPORTING_CLAIM("OnlineReportingClaim"),
    @XmlEnumValue("StoreChangePlan")
    STORE_CHANGE_PLAN("StoreChangePlan"),
    @XmlEnumValue("WebClientHome")
    WEB_CLIENT_HOME("WebClientHome"),
    @XmlEnumValue("ReportsBalances")
    REPORTS_BALANCES("ReportsBalances"),
    @XmlEnumValue("ReportsExpenses")
    REPORTS_EXPENSES("ReportsExpenses"),
    @XmlEnumValue("ReportsPrints")
    REPORTS_PRINTS("ReportsPrints"),
    @XmlEnumValue("StoreBuyPostage")
    STORE_BUY_POSTAGE("StoreBuyPostage"),
    @XmlEnumValue("StoreMeters")
    STORE_METERS("StoreMeters"),
    @XmlEnumValue("StoreUsers")
    STORE_USERS("StoreUsers"),
    @XmlEnumValue("StorePaymentMethods")
    STORE_PAYMENT_METHODS("StorePaymentMethods"),
    @XmlEnumValue("StoreCorpContactInfo")
    STORE_CORP_CONTACT_INFO("StoreCorpContactInfo"),
    @XmlEnumValue("StoreMeterUsers")
    STORE_METER_USERS("StoreMeterUsers"),
    @XmlEnumValue("StoreMeterSettings")
    STORE_METER_SETTINGS("StoreMeterSettings"),
    @XmlEnumValue("StoreMeterAddress")
    STORE_METER_ADDRESS("StoreMeterAddress"),
    @XmlEnumValue("StoreShippingAddresses")
    STORE_SHIPPING_ADDRESSES("StoreShippingAddresses"),
    @XmlEnumValue("StoreReferAFriend")
    STORE_REFER_A_FRIEND("StoreReferAFriend"),
    @XmlEnumValue("StoreAccountCredit")
    STORE_ACCOUNT_CREDIT("StoreAccountCredit"),
    @XmlEnumValue("StoreReorder")
    STORE_REORDER("StoreReorder"),
    @XmlEnumValue("StoreMyProfile")
    STORE_MY_PROFILE("StoreMyProfile"),
    @XmlEnumValue("StorePassword")
    STORE_PASSWORD("StorePassword"),
    @XmlEnumValue("StoreCommPreferences")
    STORE_COMM_PREFERENCES("StoreCommPreferences"),
    @XmlEnumValue("StoreNetStampsLabels")
    STORE_NET_STAMPS_LABELS("StoreNetStampsLabels"),
    @XmlEnumValue("StoreShippingLabels")
    STORE_SHIPPING_LABELS("StoreShippingLabels"),
    @XmlEnumValue("StoreMailingLabels")
    STORE_MAILING_LABELS("StoreMailingLabels"),
    @XmlEnumValue("StoreScalesAndPrinters")
    STORE_SCALES_AND_PRINTERS("StoreScalesAndPrinters"),
    @XmlEnumValue("StoreFreeUSPSSupplies")
    STORE_FREE_USPS_SUPPLIES("StoreFreeUSPSSupplies"),
    @XmlEnumValue("StoreBubbleMailers")
    STORE_BUBBLE_MAILERS("StoreBubbleMailers"),
    @XmlEnumValue("StoreShippingSupplies")
    STORE_SHIPPING_SUPPLIES("StoreShippingSupplies"),
    @XmlEnumValue("StoreScales")
    STORE_SCALES("StoreScales"),
    @XmlEnumValue("StoreAveryNetStampsLabels")
    STORE_AVERY_NET_STAMPS_LABELS("StoreAveryNetStampsLabels"),
    @XmlEnumValue("StoreAveryMailingLabels")
    STORE_AVERY_MAILING_LABELS("StoreAveryMailingLabels"),
    @XmlEnumValue("StoreMeterContactInfo")
    STORE_METER_CONTACT_INFO("StoreMeterContactInfo"),
    @XmlEnumValue("StoreEditMeterAddress")
    STORE_EDIT_METER_ADDRESS("StoreEditMeterAddress"),
    @XmlEnumValue("StoreHome")
    STORE_HOME("StoreHome"),
    @XmlEnumValue("StoreAccount")
    STORE_ACCOUNT("StoreAccount"),
    @XmlEnumValue("StoreCostCode")
    STORE_COST_CODE("StoreCostCode"),
    @XmlEnumValue("StoreHistory")
    STORE_HISTORY("StoreHistory"),
    @XmlEnumValue("StoreFaq")
    STORE_FAQ("StoreFaq"),
    @XmlEnumValue("StoreCustomerHome")
    STORE_CUSTOMER_HOME("StoreCustomerHome"),
    @XmlEnumValue("StoreGetAccountInfoJSon")
    STORE_GET_ACCOUNT_INFO_J_SON("StoreGetAccountInfoJSon"),
    @XmlEnumValue("StoreSetAccountInfoJSon")
    STORE_SET_ACCOUNT_INFO_J_SON("StoreSetAccountInfoJSon"),
    @XmlEnumValue("StoreUserCategories")
    STORE_USER_CATEGORIES("StoreUserCategories"),
    @XmlEnumValue("StoreCategory")
    STORE_CATEGORY("StoreCategory"),
    @XmlEnumValue("StoreUpdatePaymentMethodResubmit")
    STORE_UPDATE_PAYMENT_METHOD_RESUBMIT("StoreUpdatePaymentMethodResubmit"),
    @XmlEnumValue("StoreDefaultPaymentMethods")
    STORE_DEFAULT_PAYMENT_METHODS("StoreDefaultPaymentMethods"),
    @XmlEnumValue("StoreSignOut")
    STORE_SIGN_OUT("StoreSignOut"),
    @XmlEnumValue("CustomShipNotifyEmail")
    CUSTOM_SHIP_NOTIFY_EMAIL("CustomShipNotifyEmail"),
    @XmlEnumValue("HelpCenterHome")
    HELP_CENTER_HOME("HelpCenterHome"),
    @XmlEnumValue("MustChangePassword")
    MUST_CHANGE_PASSWORD("MustChangePassword"),
    @XmlEnumValue("Contacts")
    CONTACTS("Contacts"),
    @XmlEnumValue("WebClientPreferences")
    WEB_CLIENT_PREFERENCES("WebClientPreferences"),
    @XmlEnumValue("WebClientDefault")
    WEB_CLIENT_DEFAULT("WebClientDefault"),
    @XmlEnumValue("StoreAutoBuy")
    STORE_AUTO_BUY("StoreAutoBuy"),
    @XmlEnumValue("SetTermsGeneral")
    SET_TERMS_GENERAL("SetTermsGeneral"),
    @XmlEnumValue("UploadImage")
    UPLOAD_IMAGE("UploadImage"),
    @XmlEnumValue("EndiciaLogin")
    ENDICIA_LOGIN("EndiciaLogin"),
    @XmlEnumValue("PhoneVerification")
    PHONE_VERIFICATION("PhoneVerification"),
    @XmlEnumValue("CarrierSetupDHLExpress")
    CARRIER_SETUP_DHL_EXPRESS("CarrierSetupDHLExpress"),
    @XmlEnumValue("CarrierSetupUPS")
    CARRIER_SETUP_UPS("CarrierSetupUPS"),
    @XmlEnumValue("CarrierManagement")
    CARRIER_MANAGEMENT("CarrierManagement"),
    @XmlEnumValue("StoreOrderHistory")
    STORE_ORDER_HISTORY("StoreOrderHistory"),
    @XmlEnumValue("StoreSubscriptions")
    STORE_SUBSCRIPTIONS("StoreSubscriptions"),
    @XmlEnumValue("StoreHardware")
    STORE_HARDWARE("StoreHardware"),
    @XmlEnumValue("StoreEnvelopes")
    STORE_ENVELOPES("StoreEnvelopes"),
    @XmlEnumValue("StoreLabels")
    STORE_LABELS("StoreLabels"),
    @XmlEnumValue("StoreClearNetStamps")
    STORE_CLEAR_NET_STAMPS("StoreClearNetStamps"),
    @XmlEnumValue("StoreOriginalNetStamps")
    STORE_ORIGINAL_NET_STAMPS("StoreOriginalNetStamps"),
    @XmlEnumValue("StoreNetStamps")
    STORE_NET_STAMPS("StoreNetStamps"),
    @XmlEnumValue("StoreSignIn")
    STORE_SIGN_IN("StoreSignIn"),
    @XmlEnumValue("AddPayment")
    ADD_PAYMENT("AddPayment"),
    @XmlEnumValue("CarrierSetupFedEx")
    CARRIER_SETUP_FED_EX("CarrierSetupFedEx"),
    @XmlEnumValue("ParcelGuard")
    PARCEL_GUARD("ParcelGuard"),
    @XmlEnumValue("BrandedTracking")
    BRANDED_TRACKING("BrandedTracking"),
    @XmlEnumValue("RateAdvisor")
    RATE_ADVISOR("RateAdvisor"),
    PPL("PPL"),
    @XmlEnumValue("ParcelGuardClaim")
    PARCEL_GUARD_CLAIM("ParcelGuardClaim"),
    @XmlEnumValue("ParcelGuardClaimStatus")
    PARCEL_GUARD_CLAIM_STATUS("ParcelGuardClaimStatus");
    private final String value;

    UrlType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrlType fromValue(String v) {
        for (UrlType c: UrlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
