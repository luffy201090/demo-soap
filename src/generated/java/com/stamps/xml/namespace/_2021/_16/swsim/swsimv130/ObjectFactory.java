
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.stamps.xml.namespace._2021._16.swsim.swsimv130 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateIndiciumHorizontalOffset_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "horizontalOffset");
    private final static QName _CreateIndiciumVerticalOffset_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "verticalOffset");
    private final static QName _CreateIndiciumPrintDensity_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "printDensity");
    private final static QName _CreateIndiciumPrintMemo_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "printMemo");
    private final static QName _CreateIndiciumPrintInstructions_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "printInstructions");
    private final static QName _CreateIndiciumReturnImageData_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ReturnImageData");
    private final static QName _CreateIndiciumReturnLabelExpirationDays_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ReturnLabelExpirationDays");
    private final static QName _CreateIndiciumBrandingId_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "BrandingId");
    private final static QName _CreateIndiciumNotificationSettingId_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "NotificationSettingId");
    private final static QName _CreateEnvelopeIndiciumPrintFromAddress_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "PrintFromAddress");
    private final static QName _CreateEnvelopeIndiciumPrintToAddress_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "PrintToAddress");
    private final static QName _CreateManifestShipDate_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShipDate");
    private final static QName _RegisterAccountSendEmail_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "SendEmail");
    private final static QName _RegisterAccountResetPasswordAfterRegistration_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ResetPasswordAfterRegistration");
    private final static QName _AddImageImageCategory_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ImageCategory");
    private final static QName _AddUserPaymentMethodDefaultPaymentMethodType_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "DefaultPaymentMethodType");
    private final static QName _CleanseAddressResponseIsPOBox_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "IsPOBox");
    private final static QName _GetBalanceHistoryTransactionsPerPage_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "TransactionsPerPage");
    private final static QName _GetBalanceHistoryTransactionDateMax_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "TransactionDateMax");
    private final static QName _CapabilitiesV31CanRateShop_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "CanRateShop");
    private final static QName _CapabilitiesV31DisplayUPSByDefault_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "DisplayUPSByDefault");
    private final static QName _CapabilitiesV31CanPrintUPSDirect_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "CanPrintUPSDirect");
    private final static QName _CapabilitiesV31CanPrintUPSIntl_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "CanPrintUPSIntl");
    private final static QName _CapabilitiesV32DisplayFXByDefault_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "DisplayFXByDefault");
    private final static QName _CapabilitiesV32CanPrintFXDirect_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "CanPrintFXDirect");
    private final static QName _CapabilitiesV32CanPrintFXIntl_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "CanPrintFXIntl");
    private final static QName _CapabilitiesV32DisplayDXByDefault_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "DisplayDXByDefault");
    private final static QName _PaymentMethodCreditCardType_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "CreditCardType");
    private final static QName _PGClaimDetailsStatusDetail_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "StatusDetail");
    private final static QName _AdjustmentDetailsDateAdjustmentProcessed_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "DateAdjustmentProcessed");
    private final static QName _AdjustmentDetailsDateRecorded_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "DateRecorded");
    private final static QName _AdjustmentDetailsOtherSurchargeAmounts_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "OtherSurchargeAmounts");
    private final static QName _RefundStatusV1EstimatedPostageRefundCompletionDate_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "EstimatedPostageRefundCompletionDate");
    private final static QName _RefundStatusV1InsuranceRefundStatus_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "InsuranceRefundStatus");
    private final static QName _RefundStatusV1EstimatedInsuranceRefundCompletionDate_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "EstimatedInsuranceRefundCompletionDate");
    private final static QName _RefundStatusV1InsuranceAmountRequested_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "InsuranceAmountRequested");
    private final static QName _RefundStatusV1InsuranceAmountApproved_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "InsuranceAmountApproved");
    private final static QName _PackageInfoV6EntryFacility_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "EntryFacility");
    private final static QName _PackageInfoV6SortType_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "SortType");
    private final static QName _PackageInfoV6EnclosedServiceType_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "EnclosedServiceType");
    private final static QName _PackageInfoV6EnclosedPackageType_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "EnclosedPackageType");
    private final static QName _ShipmentV38ShipmentStatus_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShipmentStatus");
    private final static QName _ShipmentV38PrintDate_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "PrintDate");
    private final static QName _ShipmentV38MailDate_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "MailDate");
    private final static QName _ShipmentV38DeliveredDate_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "DeliveredDate");
    private final static QName _ShipmentV38RefundType_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "RefundType");
    private final static QName _ShipmentV38ExpiryDate_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ExpiryDate");
    private final static QName _ShipmentV38LabelCategory_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "LabelCategory");
    private final static QName _TogglesShowCustomColors_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowCustomColors");
    private final static QName _TogglesShowSocialMedia_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowSocialMedia");
    private final static QName _TogglesShowStoreUrl_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowStoreUrl");
    private final static QName _TogglesShowMenuLinks_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowMenuLinks");
    private final static QName _TogglesShowReturnPolicy_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowReturnPolicy");
    private final static QName _TogglesShowEmail_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowEmail");
    private final static QName _TogglesShowPhone_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowPhone");
    private final static QName _TogglesShowShipmentDetails_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowShipmentDetails");
    private final static QName _TogglesShowItemImages_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowItemImages");
    private final static QName _TogglesShowShipmentPrices_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowShipmentPrices");
    private final static QName _TogglesShowStoreAddress_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShowStoreAddress");
    private final static QName _OrderItemUnitPrice_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "UnitPrice");
    private final static QName _AccountInfoV65PendingPlanId_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "PendingPlanId");
    private final static QName _AccountInfoV65RatesetType_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "RatesetType");
    private final static QName _AccountInfoV65USPSRep_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "USPSRep");
    private final static QName _AccountInfoV65OutstandingLabelBalance_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "OutstandingLabelBalance");
    private final static QName _AccountInfoV65MaxOutstandingLabelBalance_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "MaxOutstandingLabelBalance");
    private final static QName _AccountInfoV65MaxParcelGuardInsuredValue_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "MaxParcelGuardInsuredValue");
    private final static QName _FiltersPrintDateMax_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "PrintDateMax");
    private final static QName _NotificationSettingPropertiesAllowSMSOptIn_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "AllowSMSOptIn");
    private final static QName _OrderDetailsShippingAndHandlingPrice_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "ShippingAndHandlingPrice");
    private final static QName _OrderDetailsTotalDiscountAmount_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "TotalDiscountAmount");
    private final static QName _OrderDetailsTotalTaxAmount_QNAME = new QName("http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", "TotalTaxAmount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.stamps.xml.namespace._2021._16.swsim.swsimv130
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateIndicium }
     * 
     */
    public CreateIndicium createCreateIndicium() {
        return new CreateIndicium();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link RateV45 }
     * 
     */
    public RateV45 createRateV45() {
        return new RateV45();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link CustomsV8 }
     * 
     */
    public CustomsV8 createCustomsV8() {
        return new CustomsV8();
    }

    /**
     * Create an instance of {@link ShipmentNotification }
     * 
     */
    public ShipmentNotification createShipmentNotification() {
        return new ShipmentNotification();
    }

    /**
     * Create an instance of {@link LabelRecipientInfo }
     * 
     */
    public LabelRecipientInfo createLabelRecipientInfo() {
        return new LabelRecipientInfo();
    }

    /**
     * Create an instance of {@link ExtendedPostageInfoV1 }
     * 
     */
    public ExtendedPostageInfoV1 createExtendedPostageInfoV1() {
        return new ExtendedPostageInfoV1();
    }

    /**
     * Create an instance of {@link OrderDetails }
     * 
     */
    public OrderDetails createOrderDetails() {
        return new OrderDetails();
    }

    /**
     * Create an instance of {@link CreateIndiciumResponse }
     * 
     */
    public CreateIndiciumResponse createCreateIndiciumResponse() {
        return new CreateIndiciumResponse();
    }

    /**
     * Create an instance of {@link PostageBalance }
     * 
     */
    public PostageBalance createPostageBalance() {
        return new PostageBalance();
    }

    /**
     * Create an instance of {@link ArrayOfBase64Binary }
     * 
     */
    public ArrayOfBase64Binary createArrayOfBase64Binary() {
        return new ArrayOfBase64Binary();
    }

    /**
     * Create an instance of {@link CreateEnvelopeIndicium }
     * 
     */
    public CreateEnvelopeIndicium createCreateEnvelopeIndicium() {
        return new CreateEnvelopeIndicium();
    }

    /**
     * Create an instance of {@link CreateEnvelopeIndiciumResponse }
     * 
     */
    public CreateEnvelopeIndiciumResponse createCreateEnvelopeIndiciumResponse() {
        return new CreateEnvelopeIndiciumResponse();
    }

    /**
     * Create an instance of {@link GetRates }
     * 
     */
    public GetRates createGetRates() {
        return new GetRates();
    }

    /**
     * Create an instance of {@link GetRatesResponse }
     * 
     */
    public GetRatesResponse createGetRatesResponse() {
        return new GetRatesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRateV45 }
     * 
     */
    public ArrayOfRateV45 createArrayOfRateV45() {
        return new ArrayOfRateV45();
    }

    /**
     * Create an instance of {@link CreateMailingLabelIndicia }
     * 
     */
    public CreateMailingLabelIndicia createCreateMailingLabelIndicia() {
        return new CreateMailingLabelIndicia();
    }

    /**
     * Create an instance of {@link ArrayOfIndiciumInfoV38 }
     * 
     */
    public ArrayOfIndiciumInfoV38 createArrayOfIndiciumInfoV38() {
        return new ArrayOfIndiciumInfoV38();
    }

    /**
     * Create an instance of {@link CreateMailingLabelIndiciaResponse }
     * 
     */
    public CreateMailingLabelIndiciaResponse createCreateMailingLabelIndiciaResponse() {
        return new CreateMailingLabelIndiciaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link CreateNetStampsIndicia }
     * 
     */
    public CreateNetStampsIndicia createCreateNetStampsIndicia() {
        return new CreateNetStampsIndicia();
    }

    /**
     * Create an instance of {@link ArrayOfNetStampV41 }
     * 
     */
    public ArrayOfNetStampV41 createArrayOfNetStampV41() {
        return new ArrayOfNetStampV41();
    }

    /**
     * Create an instance of {@link CreateNetStampsIndiciaResponse }
     * 
     */
    public CreateNetStampsIndiciaResponse createCreateNetStampsIndiciaResponse() {
        return new CreateNetStampsIndiciaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIndiciumData }
     * 
     */
    public ArrayOfIndiciumData createArrayOfIndiciumData() {
        return new ArrayOfIndiciumData();
    }

    /**
     * Create an instance of {@link AddCarrier }
     * 
     */
    public AddCarrier createAddCarrier() {
        return new AddCarrier();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link AddCarrierResponse }
     * 
     */
    public AddCarrierResponse createAddCarrierResponse() {
        return new AddCarrierResponse();
    }

    /**
     * Create an instance of {@link DeleteCarrier }
     * 
     */
    public DeleteCarrier createDeleteCarrier() {
        return new DeleteCarrier();
    }

    /**
     * Create an instance of {@link DeleteCarrierResponse }
     * 
     */
    public DeleteCarrierResponse createDeleteCarrierResponse() {
        return new DeleteCarrierResponse();
    }

    /**
     * Create an instance of {@link TrackShipment }
     * 
     */
    public TrackShipment createTrackShipment() {
        return new TrackShipment();
    }

    /**
     * Create an instance of {@link TrackShipmentResponse }
     * 
     */
    public TrackShipmentResponse createTrackShipmentResponse() {
        return new TrackShipmentResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTrackingEvent }
     * 
     */
    public ArrayOfTrackingEvent createArrayOfTrackingEvent() {
        return new ArrayOfTrackingEvent();
    }

    /**
     * Create an instance of {@link DestinationInfo }
     * 
     */
    public DestinationInfo createDestinationInfo() {
        return new DestinationInfo();
    }

    /**
     * Create an instance of {@link ModifyCarrierPickup }
     * 
     */
    public ModifyCarrierPickup createModifyCarrierPickup() {
        return new ModifyCarrierPickup();
    }

    /**
     * Create an instance of {@link CarrierPickupContactInformation }
     * 
     */
    public CarrierPickupContactInformation createCarrierPickupContactInformation() {
        return new CarrierPickupContactInformation();
    }

    /**
     * Create an instance of {@link CarrierPickupPackageInformation }
     * 
     */
    public CarrierPickupPackageInformation createCarrierPickupPackageInformation() {
        return new CarrierPickupPackageInformation();
    }

    /**
     * Create an instance of {@link ModifyCarrierPickupResponse }
     * 
     */
    public ModifyCarrierPickupResponse createModifyCarrierPickupResponse() {
        return new ModifyCarrierPickupResponse();
    }

    /**
     * Create an instance of {@link ScheduleCarrierPickup }
     * 
     */
    public ScheduleCarrierPickup createScheduleCarrierPickup() {
        return new ScheduleCarrierPickup();
    }

    /**
     * Create an instance of {@link CarrierPickupContactInformationV2 }
     * 
     */
    public CarrierPickupContactInformationV2 createCarrierPickupContactInformationV2() {
        return new CarrierPickupContactInformationV2();
    }

    /**
     * Create an instance of {@link CarrierPickupAddressV3 }
     * 
     */
    public CarrierPickupAddressV3 createCarrierPickupAddressV3() {
        return new CarrierPickupAddressV3();
    }

    /**
     * Create an instance of {@link ScheduleCarrierPickupResponse }
     * 
     */
    public ScheduleCarrierPickupResponse createScheduleCarrierPickupResponse() {
        return new ScheduleCarrierPickupResponse();
    }

    /**
     * Create an instance of {@link CheckCarrierPickupAvailability }
     * 
     */
    public CheckCarrierPickupAvailability createCheckCarrierPickupAvailability() {
        return new CheckCarrierPickupAvailability();
    }

    /**
     * Create an instance of {@link CarrierPickupAddress }
     * 
     */
    public CarrierPickupAddress createCarrierPickupAddress() {
        return new CarrierPickupAddress();
    }

    /**
     * Create an instance of {@link CheckCarrierPickupAvailabilityResponse }
     * 
     */
    public CheckCarrierPickupAvailabilityResponse createCheckCarrierPickupAvailabilityResponse() {
        return new CheckCarrierPickupAvailabilityResponse();
    }

    /**
     * Create an instance of {@link CancelCarrierPickup }
     * 
     */
    public CancelCarrierPickup createCancelCarrierPickup() {
        return new CancelCarrierPickup();
    }

    /**
     * Create an instance of {@link CancelCarrierPickupResponse }
     * 
     */
    public CancelCarrierPickupResponse createCancelCarrierPickupResponse() {
        return new CancelCarrierPickupResponse();
    }

    /**
     * Create an instance of {@link RegisterShippingProviderAccount }
     * 
     */
    public RegisterShippingProviderAccount createRegisterShippingProviderAccount() {
        return new RegisterShippingProviderAccount();
    }

    /**
     * Create an instance of {@link RegisterShippingProviderAccountRequest }
     * 
     */
    public RegisterShippingProviderAccountRequest createRegisterShippingProviderAccountRequest() {
        return new RegisterShippingProviderAccountRequest();
    }

    /**
     * Create an instance of {@link RegisterShippingProviderAccountResponse }
     * 
     */
    public RegisterShippingProviderAccountResponse createRegisterShippingProviderAccountResponse() {
        return new RegisterShippingProviderAccountResponse();
    }

    /**
     * Create an instance of {@link GetURL }
     * 
     */
    public GetURL createGetURL() {
        return new GetURL();
    }

    /**
     * Create an instance of {@link GetURLResponse }
     * 
     */
    public GetURLResponse createGetURLResponse() {
        return new GetURLResponse();
    }

    /**
     * Create an instance of {@link CreateShipmentNotification }
     * 
     */
    public CreateShipmentNotification createCreateShipmentNotification() {
        return new CreateShipmentNotification();
    }

    /**
     * Create an instance of {@link CreateShipmentNotificationResponse }
     * 
     */
    public CreateShipmentNotificationResponse createCreateShipmentNotificationResponse() {
        return new CreateShipmentNotificationResponse();
    }

    /**
     * Create an instance of {@link CreateNotificationSetting }
     * 
     */
    public CreateNotificationSetting createCreateNotificationSetting() {
        return new CreateNotificationSetting();
    }

    /**
     * Create an instance of {@link NotificationSettingProperties }
     * 
     */
    public NotificationSettingProperties createNotificationSettingProperties() {
        return new NotificationSettingProperties();
    }

    /**
     * Create an instance of {@link CreateNotificationSettingResponse }
     * 
     */
    public CreateNotificationSettingResponse createCreateNotificationSettingResponse() {
        return new CreateNotificationSettingResponse();
    }

    /**
     * Create an instance of {@link ModifyNotificationSetting }
     * 
     */
    public ModifyNotificationSetting createModifyNotificationSetting() {
        return new ModifyNotificationSetting();
    }

    /**
     * Create an instance of {@link NotificationSetting }
     * 
     */
    public NotificationSetting createNotificationSetting() {
        return new NotificationSetting();
    }

    /**
     * Create an instance of {@link ModifyNotificationSettingResponse }
     * 
     */
    public ModifyNotificationSettingResponse createModifyNotificationSettingResponse() {
        return new ModifyNotificationSettingResponse();
    }

    /**
     * Create an instance of {@link CreateBranding }
     * 
     */
    public CreateBranding createCreateBranding() {
        return new CreateBranding();
    }

    /**
     * Create an instance of {@link BrandingProperties }
     * 
     */
    public BrandingProperties createBrandingProperties() {
        return new BrandingProperties();
    }

    /**
     * Create an instance of {@link CreateBrandingResponse }
     * 
     */
    public CreateBrandingResponse createCreateBrandingResponse() {
        return new CreateBrandingResponse();
    }

    /**
     * Create an instance of {@link ModifyBranding }
     * 
     */
    public ModifyBranding createModifyBranding() {
        return new ModifyBranding();
    }

    /**
     * Create an instance of {@link Branding }
     * 
     */
    public Branding createBranding() {
        return new Branding();
    }

    /**
     * Create an instance of {@link ModifyBrandingResponse }
     * 
     */
    public ModifyBrandingResponse createModifyBrandingResponse() {
        return new ModifyBrandingResponse();
    }

    /**
     * Create an instance of {@link CreateManifest }
     * 
     */
    public CreateManifest createCreateManifest() {
        return new CreateManifest();
    }

    /**
     * Create an instance of {@link ArrayOfGuid }
     * 
     */
    public ArrayOfGuid createArrayOfGuid() {
        return new ArrayOfGuid();
    }

    /**
     * Create an instance of {@link CreateManifestResponse }
     * 
     */
    public CreateManifestResponse createCreateManifestResponse() {
        return new CreateManifestResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEndOfDayManifest }
     * 
     */
    public ArrayOfEndOfDayManifest createArrayOfEndOfDayManifest() {
        return new ArrayOfEndOfDayManifest();
    }

    /**
     * Create an instance of {@link GetNotificationSettings }
     * 
     */
    public GetNotificationSettings createGetNotificationSettings() {
        return new GetNotificationSettings();
    }

    /**
     * Create an instance of {@link GetNotificationSettingsResponse }
     * 
     */
    public GetNotificationSettingsResponse createGetNotificationSettingsResponse() {
        return new GetNotificationSettingsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNotificationSetting }
     * 
     */
    public ArrayOfNotificationSetting createArrayOfNotificationSetting() {
        return new ArrayOfNotificationSetting();
    }

    /**
     * Create an instance of {@link DeleteNotificationSetting }
     * 
     */
    public DeleteNotificationSetting createDeleteNotificationSetting() {
        return new DeleteNotificationSetting();
    }

    /**
     * Create an instance of {@link DeleteNotificationSettingResponse }
     * 
     */
    public DeleteNotificationSettingResponse createDeleteNotificationSettingResponse() {
        return new DeleteNotificationSettingResponse();
    }

    /**
     * Create an instance of {@link RegisterAccount }
     * 
     */
    public RegisterAccount createRegisterAccount() {
        return new RegisterAccount();
    }

    /**
     * Create an instance of {@link MachineInfo }
     * 
     */
    public MachineInfo createMachineInfo() {
        return new MachineInfo();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link AchAccount }
     * 
     */
    public AchAccount createAchAccount() {
        return new AchAccount();
    }

    /**
     * Create an instance of {@link PPLAccount }
     * 
     */
    public PPLAccount createPPLAccount() {
        return new PPLAccount();
    }

    /**
     * Create an instance of {@link RegisterAccountResponse }
     * 
     */
    public RegisterAccountResponse createRegisterAccountResponse() {
        return new RegisterAccountResponse();
    }

    /**
     * Create an instance of {@link AddImage }
     * 
     */
    public AddImage createAddImage() {
        return new AddImage();
    }

    /**
     * Create an instance of {@link AddImageResponse }
     * 
     */
    public AddImageResponse createAddImageResponse() {
        return new AddImageResponse();
    }

    /**
     * Create an instance of {@link GetBranding }
     * 
     */
    public GetBranding createGetBranding() {
        return new GetBranding();
    }

    /**
     * Create an instance of {@link GetBrandingResponse }
     * 
     */
    public GetBrandingResponse createGetBrandingResponse() {
        return new GetBrandingResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBranding }
     * 
     */
    public ArrayOfBranding createArrayOfBranding() {
        return new ArrayOfBranding();
    }

    /**
     * Create an instance of {@link DeleteBranding }
     * 
     */
    public DeleteBranding createDeleteBranding() {
        return new DeleteBranding();
    }

    /**
     * Create an instance of {@link DeleteBrandingResponse }
     * 
     */
    public DeleteBrandingResponse createDeleteBrandingResponse() {
        return new DeleteBrandingResponse();
    }

    /**
     * Create an instance of {@link GetShipmentList }
     * 
     */
    public GetShipmentList createGetShipmentList() {
        return new GetShipmentList();
    }

    /**
     * Create an instance of {@link Filters }
     * 
     */
    public Filters createFilters() {
        return new Filters();
    }

    /**
     * Create an instance of {@link ArrayOfIncludeField }
     * 
     */
    public ArrayOfIncludeField createArrayOfIncludeField() {
        return new ArrayOfIncludeField();
    }

    /**
     * Create an instance of {@link GetShipmentListResponse }
     * 
     */
    public GetShipmentListResponse createGetShipmentListResponse() {
        return new GetShipmentListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfShipmentV38 }
     * 
     */
    public ArrayOfShipmentV38 createArrayOfShipmentV38() {
        return new ArrayOfShipmentV38();
    }

    /**
     * Create an instance of {@link StartAccountVerification }
     * 
     */
    public StartAccountVerification createStartAccountVerification() {
        return new StartAccountVerification();
    }

    /**
     * Create an instance of {@link StartAccountVerificationResponse }
     * 
     */
    public StartAccountVerificationResponse createStartAccountVerificationResponse() {
        return new StartAccountVerificationResponse();
    }

    /**
     * Create an instance of {@link FinishAccountVerification }
     * 
     */
    public FinishAccountVerification createFinishAccountVerification() {
        return new FinishAccountVerification();
    }

    /**
     * Create an instance of {@link FinishAccountVerificationResponse }
     * 
     */
    public FinishAccountVerificationResponse createFinishAccountVerificationResponse() {
        return new FinishAccountVerificationResponse();
    }

    /**
     * Create an instance of {@link AddUserPaymentMethod }
     * 
     */
    public AddUserPaymentMethod createAddUserPaymentMethod() {
        return new AddUserPaymentMethod();
    }

    /**
     * Create an instance of {@link AddUserPaymentMethodResponse }
     * 
     */
    public AddUserPaymentMethodResponse createAddUserPaymentMethodResponse() {
        return new AddUserPaymentMethodResponse();
    }

    /**
     * Create an instance of {@link DeleteUserPaymentMethod }
     * 
     */
    public DeleteUserPaymentMethod createDeleteUserPaymentMethod() {
        return new DeleteUserPaymentMethod();
    }

    /**
     * Create an instance of {@link DeleteUserPaymentMethodResponse }
     * 
     */
    public DeleteUserPaymentMethodResponse createDeleteUserPaymentMethodResponse() {
        return new DeleteUserPaymentMethodResponse();
    }

    /**
     * Create an instance of {@link ListPaymentMethods }
     * 
     */
    public ListPaymentMethods createListPaymentMethods() {
        return new ListPaymentMethods();
    }

    /**
     * Create an instance of {@link ListPaymentMethodsResponse }
     * 
     */
    public ListPaymentMethodsResponse createListPaymentMethodsResponse() {
        return new ListPaymentMethodsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentMethod }
     * 
     */
    public ArrayOfPaymentMethod createArrayOfPaymentMethod() {
        return new ArrayOfPaymentMethod();
    }

    /**
     * Create an instance of {@link ChangeDefaultPaymentMethod }
     * 
     */
    public ChangeDefaultPaymentMethod createChangeDefaultPaymentMethod() {
        return new ChangeDefaultPaymentMethod();
    }

    /**
     * Create an instance of {@link ChangeDefaultPaymentMethodResponse }
     * 
     */
    public ChangeDefaultPaymentMethodResponse createChangeDefaultPaymentMethodResponse() {
        return new ChangeDefaultPaymentMethodResponse();
    }

    /**
     * Create an instance of {@link RecoverUsername }
     * 
     */
    public RecoverUsername createRecoverUsername() {
        return new RecoverUsername();
    }

    /**
     * Create an instance of {@link RecoverUsernameResponse }
     * 
     */
    public RecoverUsernameResponse createRecoverUsernameResponse() {
        return new RecoverUsernameResponse();
    }

    /**
     * Create an instance of {@link PurchasePostage }
     * 
     */
    public PurchasePostage createPurchasePostage() {
        return new PurchasePostage();
    }

    /**
     * Create an instance of {@link PurchasePostageResponse }
     * 
     */
    public PurchasePostageResponse createPurchasePostageResponse() {
        return new PurchasePostageResponse();
    }

    /**
     * Create an instance of {@link AuthenticateBridgeAuthenticator }
     * 
     */
    public AuthenticateBridgeAuthenticator createAuthenticateBridgeAuthenticator() {
        return new AuthenticateBridgeAuthenticator();
    }

    /**
     * Create an instance of {@link AuthenticateBridgeAuthenticatorResponse }
     * 
     */
    public AuthenticateBridgeAuthenticatorResponse createAuthenticateBridgeAuthenticatorResponse() {
        return new AuthenticateBridgeAuthenticatorResponse();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link GetImageList }
     * 
     */
    public GetImageList createGetImageList() {
        return new GetImageList();
    }

    /**
     * Create an instance of {@link GetImageListResponse }
     * 
     */
    public GetImageListResponse createGetImageListResponse() {
        return new GetImageListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfImage }
     * 
     */
    public ArrayOfImage createArrayOfImage() {
        return new ArrayOfImage();
    }

    /**
     * Create an instance of {@link DeleteImage }
     * 
     */
    public DeleteImage createDeleteImage() {
        return new DeleteImage();
    }

    /**
     * Create an instance of {@link DeleteImageResponse }
     * 
     */
    public DeleteImageResponse createDeleteImageResponse() {
        return new DeleteImageResponse();
    }

    /**
     * Create an instance of {@link GetCarrierPickupList }
     * 
     */
    public GetCarrierPickupList createGetCarrierPickupList() {
        return new GetCarrierPickupList();
    }

    /**
     * Create an instance of {@link GetCarrierPickupListResponse }
     * 
     */
    public GetCarrierPickupListResponse createGetCarrierPickupListResponse() {
        return new GetCarrierPickupListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCarrierPickupInformation }
     * 
     */
    public ArrayOfCarrierPickupInformation createArrayOfCarrierPickupInformation() {
        return new ArrayOfCarrierPickupInformation();
    }

    /**
     * Create an instance of {@link CancelAccount }
     * 
     */
    public CancelAccount createCancelAccount() {
        return new CancelAccount();
    }

    /**
     * Create an instance of {@link CancelAccountResponse }
     * 
     */
    public CancelAccountResponse createCancelAccountResponse() {
        return new CancelAccountResponse();
    }

    /**
     * Create an instance of {@link CleanseAddress }
     * 
     */
    public CleanseAddress createCleanseAddress() {
        return new CleanseAddress();
    }

    /**
     * Create an instance of {@link CleanseAddressResponse }
     * 
     */
    public CleanseAddressResponse createCleanseAddressResponse() {
        return new CleanseAddressResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAddress }
     * 
     */
    public ArrayOfAddress createArrayOfAddress() {
        return new ArrayOfAddress();
    }

    /**
     * Create an instance of {@link StatusCodes }
     * 
     */
    public StatusCodes createStatusCodes() {
        return new StatusCodes();
    }

    /**
     * Create an instance of {@link PriceOrder }
     * 
     */
    public PriceOrder createPriceOrder() {
        return new PriceOrder();
    }

    /**
     * Create an instance of {@link ArrayOfSku }
     * 
     */
    public ArrayOfSku createArrayOfSku() {
        return new ArrayOfSku();
    }

    /**
     * Create an instance of {@link PriceOrderResponse }
     * 
     */
    public PriceOrderResponse createPriceOrderResponse() {
        return new PriceOrderResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStoreShippingMethodOption }
     * 
     */
    public ArrayOfStoreShippingMethodOption createArrayOfStoreShippingMethodOption() {
        return new ArrayOfStoreShippingMethodOption();
    }

    /**
     * Create an instance of {@link PlaceOrder }
     * 
     */
    public PlaceOrder createPlaceOrder() {
        return new PlaceOrder();
    }

    /**
     * Create an instance of {@link PlaceOrderResponse }
     * 
     */
    public PlaceOrderResponse createPlaceOrderResponse() {
        return new PlaceOrderResponse();
    }

    /**
     * Create an instance of {@link GetShipmentListByToken }
     * 
     */
    public GetShipmentListByToken createGetShipmentListByToken() {
        return new GetShipmentListByToken();
    }

    /**
     * Create an instance of {@link GetShipmentListByTokenResponse }
     * 
     */
    public GetShipmentListByTokenResponse createGetShipmentListByTokenResponse() {
        return new GetShipmentListByTokenResponse();
    }

    /**
     * Create an instance of {@link ChangePlan }
     * 
     */
    public ChangePlan createChangePlan() {
        return new ChangePlan();
    }

    /**
     * Create an instance of {@link ChangePlanResponse }
     * 
     */
    public ChangePlanResponse createChangePlanResponse() {
        return new ChangePlanResponse();
    }

    /**
     * Create an instance of {@link GetBalanceHistory }
     * 
     */
    public GetBalanceHistory createGetBalanceHistory() {
        return new GetBalanceHistory();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionType }
     * 
     */
    public ArrayOfTransactionType createArrayOfTransactionType() {
        return new ArrayOfTransactionType();
    }

    /**
     * Create an instance of {@link GetBalanceHistoryResponse }
     * 
     */
    public GetBalanceHistoryResponse createGetBalanceHistoryResponse() {
        return new GetBalanceHistoryResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTransaction }
     * 
     */
    public ArrayOfTransaction createArrayOfTransaction() {
        return new ArrayOfTransaction();
    }

    /**
     * Create an instance of {@link GetBalanceHistoryByToken }
     * 
     */
    public GetBalanceHistoryByToken createGetBalanceHistoryByToken() {
        return new GetBalanceHistoryByToken();
    }

    /**
     * Create an instance of {@link GetBalanceHistoryByTokenResponse }
     * 
     */
    public GetBalanceHistoryByTokenResponse createGetBalanceHistoryByTokenResponse() {
        return new GetBalanceHistoryByTokenResponse();
    }

    /**
     * Create an instance of {@link CancelIndicium }
     * 
     */
    public CancelIndicium createCancelIndicium() {
        return new CancelIndicium();
    }

    /**
     * Create an instance of {@link CancelIndiciumResponse }
     * 
     */
    public CancelIndiciumResponse createCancelIndiciumResponse() {
        return new CancelIndiciumResponse();
    }

    /**
     * Create an instance of {@link SetCodeWords }
     * 
     */
    public SetCodeWords createSetCodeWords() {
        return new SetCodeWords();
    }

    /**
     * Create an instance of {@link SetCodeWordsResponse }
     * 
     */
    public SetCodeWordsResponse createSetCodeWordsResponse() {
        return new SetCodeWordsResponse();
    }

    /**
     * Create an instance of {@link SetAutoBuy }
     * 
     */
    public SetAutoBuy createSetAutoBuy() {
        return new SetAutoBuy();
    }

    /**
     * Create an instance of {@link AutoBuySettings }
     * 
     */
    public AutoBuySettings createAutoBuySettings() {
        return new AutoBuySettings();
    }

    /**
     * Create an instance of {@link SetAutoBuyResponse }
     * 
     */
    public SetAutoBuyResponse createSetAutoBuyResponse() {
        return new SetAutoBuyResponse();
    }

    /**
     * Create an instance of {@link EnumCodeWordTypes }
     * 
     */
    public EnumCodeWordTypes createEnumCodeWordTypes() {
        return new EnumCodeWordTypes();
    }

    /**
     * Create an instance of {@link EnumCodeWordTypesResponse }
     * 
     */
    public EnumCodeWordTypesResponse createEnumCodeWordTypesResponse() {
        return new EnumCodeWordTypesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCodeword }
     * 
     */
    public ArrayOfCodeword createArrayOfCodeword() {
        return new ArrayOfCodeword();
    }

    /**
     * Create an instance of {@link GetSupportedCountries }
     * 
     */
    public GetSupportedCountries createGetSupportedCountries() {
        return new GetSupportedCountries();
    }

    /**
     * Create an instance of {@link GetSupportedCountriesResponse }
     * 
     */
    public GetSupportedCountriesResponse createGetSupportedCountriesResponse() {
        return new GetSupportedCountriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCountryInfo }
     * 
     */
    public ArrayOfCountryInfo createArrayOfCountryInfo() {
        return new ArrayOfCountryInfo();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link GetNetStampsImages }
     * 
     */
    public GetNetStampsImages createGetNetStampsImages() {
        return new GetNetStampsImages();
    }

    /**
     * Create an instance of {@link GetNetStampsImagesResponse }
     * 
     */
    public GetNetStampsImagesResponse createGetNetStampsImagesResponse() {
        return new GetNetStampsImagesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNetStampsImage }
     * 
     */
    public ArrayOfNetStampsImage createArrayOfNetStampsImage() {
        return new ArrayOfNetStampsImage();
    }

    /**
     * Create an instance of {@link GetChangePlanStatus }
     * 
     */
    public GetChangePlanStatus createGetChangePlanStatus() {
        return new GetChangePlanStatus();
    }

    /**
     * Create an instance of {@link GetChangePlanStatusResponse }
     * 
     */
    public GetChangePlanStatusResponse createGetChangePlanStatusResponse() {
        return new GetChangePlanStatusResponse();
    }

    /**
     * Create an instance of {@link ResubmitPurchase }
     * 
     */
    public ResubmitPurchase createResubmitPurchase() {
        return new ResubmitPurchase();
    }

    /**
     * Create an instance of {@link ResubmitPurchaseResponse }
     * 
     */
    public ResubmitPurchaseResponse createResubmitPurchaseResponse() {
        return new ResubmitPurchaseResponse();
    }

    /**
     * Create an instance of {@link EnumNetStampsLayouts }
     * 
     */
    public EnumNetStampsLayouts createEnumNetStampsLayouts() {
        return new EnumNetStampsLayouts();
    }

    /**
     * Create an instance of {@link EnumNetStampsLayoutsResponse }
     * 
     */
    public EnumNetStampsLayoutsResponse createEnumNetStampsLayoutsResponse() {
        return new EnumNetStampsLayoutsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNetStampsLayout }
     * 
     */
    public ArrayOfNetStampsLayout createArrayOfNetStampsLayout() {
        return new ArrayOfNetStampsLayout();
    }

    /**
     * Create an instance of {@link EnumCostCodes }
     * 
     */
    public EnumCostCodes createEnumCostCodes() {
        return new EnumCostCodes();
    }

    /**
     * Create an instance of {@link EnumCostCodesResponse }
     * 
     */
    public EnumCostCodesResponse createEnumCostCodesResponse() {
        return new EnumCostCodesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCostCodeInfoV1 }
     * 
     */
    public ArrayOfCostCodeInfoV1 createArrayOfCostCodeInfoV1() {
        return new ArrayOfCostCodeInfoV1();
    }

    /**
     * Create an instance of {@link AuthenticateWithTransferAuthenticator }
     * 
     */
    public AuthenticateWithTransferAuthenticator createAuthenticateWithTransferAuthenticator() {
        return new AuthenticateWithTransferAuthenticator();
    }

    /**
     * Create an instance of {@link AuthenticateWithTransferAuthenticatorResponse }
     * 
     */
    public AuthenticateWithTransferAuthenticatorResponse createAuthenticateWithTransferAuthenticatorResponse() {
        return new AuthenticateWithTransferAuthenticatorResponse();
    }

    /**
     * Create an instance of {@link StartPasswordReset }
     * 
     */
    public StartPasswordReset createStartPasswordReset() {
        return new StartPasswordReset();
    }

    /**
     * Create an instance of {@link StartPasswordResetResponse }
     * 
     */
    public StartPasswordResetResponse createStartPasswordResetResponse() {
        return new StartPasswordResetResponse();
    }

    /**
     * Create an instance of {@link FinishPasswordReset }
     * 
     */
    public FinishPasswordReset createFinishPasswordReset() {
        return new FinishPasswordReset();
    }

    /**
     * Create an instance of {@link FinishPasswordResetResponse }
     * 
     */
    public FinishPasswordResetResponse createFinishPasswordResetResponse() {
        return new FinishPasswordResetResponse();
    }

    /**
     * Create an instance of {@link GetCodewordQuestions }
     * 
     */
    public GetCodewordQuestions createGetCodewordQuestions() {
        return new GetCodewordQuestions();
    }

    /**
     * Create an instance of {@link GetCodewordQuestionsResponse }
     * 
     */
    public GetCodewordQuestionsResponse createGetCodewordQuestionsResponse() {
        return new GetCodewordQuestionsResponse();
    }

    /**
     * Create an instance of {@link AuthenticateUser }
     * 
     */
    public AuthenticateUser createAuthenticateUser() {
        return new AuthenticateUser();
    }

    /**
     * Create an instance of {@link AuthenticateUserResponse }
     * 
     */
    public AuthenticateUserResponse createAuthenticateUserResponse() {
        return new AuthenticateUserResponse();
    }

    /**
     * Create an instance of {@link GetAccountInfo }
     * 
     */
    public GetAccountInfo createGetAccountInfo() {
        return new GetAccountInfo();
    }

    /**
     * Create an instance of {@link GetAccountInfoResponse }
     * 
     */
    public GetAccountInfoResponse createGetAccountInfoResponse() {
        return new GetAccountInfoResponse();
    }

    /**
     * Create an instance of {@link AccountInfoV65 }
     * 
     */
    public AccountInfoV65 createAccountInfoV65() {
        return new AccountInfoV65();
    }

    /**
     * Create an instance of {@link DateAdvance }
     * 
     */
    public DateAdvance createDateAdvance() {
        return new DateAdvance();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAddOnTypeV20 }
     * 
     */
    public ArrayOfArrayOfAddOnTypeV20 createArrayOfArrayOfAddOnTypeV20() {
        return new ArrayOfArrayOfAddOnTypeV20();
    }

    /**
     * Create an instance of {@link ArrayOfAddOnTypeV20 }
     * 
     */
    public ArrayOfAddOnTypeV20 createArrayOfAddOnTypeV20() {
        return new ArrayOfAddOnTypeV20();
    }

    /**
     * Create an instance of {@link ArrayOfAddOnV20 }
     * 
     */
    public ArrayOfAddOnV20 createArrayOfAddOnV20() {
        return new ArrayOfAddOnV20();
    }

    /**
     * Create an instance of {@link AddOnV20 }
     * 
     */
    public AddOnV20 createAddOnV20() {
        return new AddOnV20();
    }

    /**
     * Create an instance of {@link ArrayOfSurchargeV5 }
     * 
     */
    public ArrayOfSurchargeV5 createArrayOfSurchargeV5() {
        return new ArrayOfSurchargeV5();
    }

    /**
     * Create an instance of {@link SurchargeV5 }
     * 
     */
    public SurchargeV5 createSurchargeV5() {
        return new SurchargeV5();
    }

    /**
     * Create an instance of {@link ArrayOfCustomsLine }
     * 
     */
    public ArrayOfCustomsLine createArrayOfCustomsLine() {
        return new ArrayOfCustomsLine();
    }

    /**
     * Create an instance of {@link CustomsLine }
     * 
     */
    public CustomsLine createCustomsLine() {
        return new CustomsLine();
    }

    /**
     * Create an instance of {@link ArrayOfOrderItem }
     * 
     */
    public ArrayOfOrderItem createArrayOfOrderItem() {
        return new ArrayOfOrderItem();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link ArrayOfOption }
     * 
     */
    public ArrayOfOption createArrayOfOption() {
        return new ArrayOfOption();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link IndiciumInfoV38 }
     * 
     */
    public IndiciumInfoV38 createIndiciumInfoV38() {
        return new IndiciumInfoV38();
    }

    /**
     * Create an instance of {@link NetStampV41 }
     * 
     */
    public NetStampV41 createNetStampV41() {
        return new NetStampV41();
    }

    /**
     * Create an instance of {@link IndiciumData }
     * 
     */
    public IndiciumData createIndiciumData() {
        return new IndiciumData();
    }

    /**
     * Create an instance of {@link TrackingEvent }
     * 
     */
    public TrackingEvent createTrackingEvent() {
        return new TrackingEvent();
    }

    /**
     * Create an instance of {@link Zorbit }
     * 
     */
    public Zorbit createZorbit() {
        return new Zorbit();
    }

    /**
     * Create an instance of {@link ArrayOfTrigger }
     * 
     */
    public ArrayOfTrigger createArrayOfTrigger() {
        return new ArrayOfTrigger();
    }

    /**
     * Create an instance of {@link Trigger }
     * 
     */
    public Trigger createTrigger() {
        return new Trigger();
    }

    /**
     * Create an instance of {@link ArrayOfChannel }
     * 
     */
    public ArrayOfChannel createArrayOfChannel() {
        return new ArrayOfChannel();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link EmailConfig }
     * 
     */
    public EmailConfig createEmailConfig() {
        return new EmailConfig();
    }

    /**
     * Create an instance of {@link ArrayOfContentBlock }
     * 
     */
    public ArrayOfContentBlock createArrayOfContentBlock() {
        return new ArrayOfContentBlock();
    }

    /**
     * Create an instance of {@link ContentBlock }
     * 
     */
    public ContentBlock createContentBlock() {
        return new ContentBlock();
    }

    /**
     * Create an instance of {@link ArrayOfBccEmail }
     * 
     */
    public ArrayOfBccEmail createArrayOfBccEmail() {
        return new ArrayOfBccEmail();
    }

    /**
     * Create an instance of {@link BccEmail }
     * 
     */
    public BccEmail createBccEmail() {
        return new BccEmail();
    }

    /**
     * Create an instance of {@link ArrayOfMenuLink }
     * 
     */
    public ArrayOfMenuLink createArrayOfMenuLink() {
        return new ArrayOfMenuLink();
    }

    /**
     * Create an instance of {@link MenuLink }
     * 
     */
    public MenuLink createMenuLink() {
        return new MenuLink();
    }

    /**
     * Create an instance of {@link ArrayOfSocialMedia }
     * 
     */
    public ArrayOfSocialMedia createArrayOfSocialMedia() {
        return new ArrayOfSocialMedia();
    }

    /**
     * Create an instance of {@link SocialMedia }
     * 
     */
    public SocialMedia createSocialMedia() {
        return new SocialMedia();
    }

    /**
     * Create an instance of {@link Toggles }
     * 
     */
    public Toggles createToggles() {
        return new Toggles();
    }

    /**
     * Create an instance of {@link Colors }
     * 
     */
    public Colors createColors() {
        return new Colors();
    }

    /**
     * Create an instance of {@link EndOfDayManifest }
     * 
     */
    public EndOfDayManifest createEndOfDayManifest() {
        return new EndOfDayManifest();
    }

    /**
     * Create an instance of {@link ArrayOfContainerLabelV1 }
     * 
     */
    public ArrayOfContainerLabelV1 createArrayOfContainerLabelV1() {
        return new ArrayOfContainerLabelV1();
    }

    /**
     * Create an instance of {@link ContainerLabelV1 }
     * 
     */
    public ContainerLabelV1 createContainerLabelV1() {
        return new ContainerLabelV1();
    }

    /**
     * Create an instance of {@link FP }
     * 
     */
    public FP createFP() {
        return new FP();
    }

    /**
     * Create an instance of {@link ReprintIndiciumRequest }
     * 
     */
    public ReprintIndiciumRequest createReprintIndiciumRequest() {
        return new ReprintIndiciumRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSearchFor }
     * 
     */
    public ArrayOfSearchFor createArrayOfSearchFor() {
        return new ArrayOfSearchFor();
    }

    /**
     * Create an instance of {@link ShipmentV38 }
     * 
     */
    public ShipmentV38 createShipmentV38() {
        return new ShipmentV38();
    }

    /**
     * Create an instance of {@link ServicesV21 }
     * 
     */
    public ServicesV21 createServicesV21() {
        return new ServicesV21();
    }

    /**
     * Create an instance of {@link PackageInfoV6 }
     * 
     */
    public PackageInfoV6 createPackageInfoV6() {
        return new PackageInfoV6();
    }

    /**
     * Create an instance of {@link ReferencesV3 }
     * 
     */
    public ReferencesV3 createReferencesV3() {
        return new ReferencesV3();
    }

    /**
     * Create an instance of {@link RefundStatusV1 }
     * 
     */
    public RefundStatusV1 createRefundStatusV1() {
        return new RefundStatusV1();
    }

    /**
     * Create an instance of {@link AdjustmentDetails }
     * 
     */
    public AdjustmentDetails createAdjustmentDetails() {
        return new AdjustmentDetails();
    }

    /**
     * Create an instance of {@link ActualService }
     * 
     */
    public ActualService createActualService() {
        return new ActualService();
    }

    /**
     * Create an instance of {@link ActualPackageInfo }
     * 
     */
    public ActualPackageInfo createActualPackageInfo() {
        return new ActualPackageInfo();
    }

    /**
     * Create an instance of {@link DisputeInfoV1 }
     * 
     */
    public DisputeInfoV1 createDisputeInfoV1() {
        return new DisputeInfoV1();
    }

    /**
     * Create an instance of {@link PGClaimDetails }
     * 
     */
    public PGClaimDetails createPGClaimDetails() {
        return new PGClaimDetails();
    }

    /**
     * Create an instance of {@link PaymentMethod }
     * 
     */
    public PaymentMethod createPaymentMethod() {
        return new PaymentMethod();
    }

    /**
     * Create an instance of {@link ArrayOfDefaultPaymentMethodTypeOptions }
     * 
     */
    public ArrayOfDefaultPaymentMethodTypeOptions createArrayOfDefaultPaymentMethodTypeOptions() {
        return new ArrayOfDefaultPaymentMethodTypeOptions();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link CarrierPickupInformation }
     * 
     */
    public CarrierPickupInformation createCarrierPickupInformation() {
        return new CarrierPickupInformation();
    }

    /**
     * Create an instance of {@link CarrierPickupAddressV2 }
     * 
     */
    public CarrierPickupAddressV2 createCarrierPickupAddressV2() {
        return new CarrierPickupAddressV2();
    }

    /**
     * Create an instance of {@link ArrayOfFootnote }
     * 
     */
    public ArrayOfFootnote createArrayOfFootnote() {
        return new ArrayOfFootnote();
    }

    /**
     * Create an instance of {@link Footnote }
     * 
     */
    public Footnote createFootnote() {
        return new Footnote();
    }

    /**
     * Create an instance of {@link ArrayOfDpvFootnote }
     * 
     */
    public ArrayOfDpvFootnote createArrayOfDpvFootnote() {
        return new ArrayOfDpvFootnote();
    }

    /**
     * Create an instance of {@link DpvFootnote }
     * 
     */
    public DpvFootnote createDpvFootnote() {
        return new DpvFootnote();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link Sku }
     * 
     */
    public Sku createSku() {
        return new Sku();
    }

    /**
     * Create an instance of {@link StoreShippingMethodOption }
     * 
     */
    public StoreShippingMethodOption createStoreShippingMethodOption() {
        return new StoreShippingMethodOption();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link Codeword }
     * 
     */
    public Codeword createCodeword() {
        return new Codeword();
    }

    /**
     * Create an instance of {@link CountryInfo }
     * 
     */
    public CountryInfo createCountryInfo() {
        return new CountryInfo();
    }

    /**
     * Create an instance of {@link NetStampsImage }
     * 
     */
    public NetStampsImage createNetStampsImage() {
        return new NetStampsImage();
    }

    /**
     * Create an instance of {@link ArrayOfPlan }
     * 
     */
    public ArrayOfPlan createArrayOfPlan() {
        return new ArrayOfPlan();
    }

    /**
     * Create an instance of {@link Plan }
     * 
     */
    public Plan createPlan() {
        return new Plan();
    }

    /**
     * Create an instance of {@link NetStampsLayout }
     * 
     */
    public NetStampsLayout createNetStampsLayout() {
        return new NetStampsLayout();
    }

    /**
     * Create an instance of {@link CostCodeInfoV1 }
     * 
     */
    public CostCodeInfoV1 createCostCodeInfoV1() {
        return new CostCodeInfoV1();
    }

    /**
     * Create an instance of {@link CapabilitiesV50 }
     * 
     */
    public CapabilitiesV50 createCapabilitiesV50() {
        return new CapabilitiesV50();
    }

    /**
     * Create an instance of {@link CapabilitiesV49 }
     * 
     */
    public CapabilitiesV49 createCapabilitiesV49() {
        return new CapabilitiesV49();
    }

    /**
     * Create an instance of {@link CapabilitiesV48 }
     * 
     */
    public CapabilitiesV48 createCapabilitiesV48() {
        return new CapabilitiesV48();
    }

    /**
     * Create an instance of {@link CapabilitiesV47 }
     * 
     */
    public CapabilitiesV47 createCapabilitiesV47() {
        return new CapabilitiesV47();
    }

    /**
     * Create an instance of {@link CapabilitiesV46 }
     * 
     */
    public CapabilitiesV46 createCapabilitiesV46() {
        return new CapabilitiesV46();
    }

    /**
     * Create an instance of {@link CapabilitiesV45 }
     * 
     */
    public CapabilitiesV45 createCapabilitiesV45() {
        return new CapabilitiesV45();
    }

    /**
     * Create an instance of {@link CapabilitiesV44 }
     * 
     */
    public CapabilitiesV44 createCapabilitiesV44() {
        return new CapabilitiesV44();
    }

    /**
     * Create an instance of {@link CapabilitiesV43 }
     * 
     */
    public CapabilitiesV43 createCapabilitiesV43() {
        return new CapabilitiesV43();
    }

    /**
     * Create an instance of {@link CapabilitiesV42 }
     * 
     */
    public CapabilitiesV42 createCapabilitiesV42() {
        return new CapabilitiesV42();
    }

    /**
     * Create an instance of {@link CapabilitiesV41 }
     * 
     */
    public CapabilitiesV41 createCapabilitiesV41() {
        return new CapabilitiesV41();
    }

    /**
     * Create an instance of {@link CapabilitiesV40 }
     * 
     */
    public CapabilitiesV40 createCapabilitiesV40() {
        return new CapabilitiesV40();
    }

    /**
     * Create an instance of {@link CapabilitiesV39 }
     * 
     */
    public CapabilitiesV39 createCapabilitiesV39() {
        return new CapabilitiesV39();
    }

    /**
     * Create an instance of {@link CapabilitiesV38 }
     * 
     */
    public CapabilitiesV38 createCapabilitiesV38() {
        return new CapabilitiesV38();
    }

    /**
     * Create an instance of {@link CapabilitiesV37 }
     * 
     */
    public CapabilitiesV37 createCapabilitiesV37() {
        return new CapabilitiesV37();
    }

    /**
     * Create an instance of {@link CapabilitiesV36 }
     * 
     */
    public CapabilitiesV36 createCapabilitiesV36() {
        return new CapabilitiesV36();
    }

    /**
     * Create an instance of {@link CapabilitiesV35 }
     * 
     */
    public CapabilitiesV35 createCapabilitiesV35() {
        return new CapabilitiesV35();
    }

    /**
     * Create an instance of {@link CapabilitiesV34 }
     * 
     */
    public CapabilitiesV34 createCapabilitiesV34() {
        return new CapabilitiesV34();
    }

    /**
     * Create an instance of {@link CapabilitiesV33 }
     * 
     */
    public CapabilitiesV33 createCapabilitiesV33() {
        return new CapabilitiesV33();
    }

    /**
     * Create an instance of {@link CapabilitiesV32 }
     * 
     */
    public CapabilitiesV32 createCapabilitiesV32() {
        return new CapabilitiesV32();
    }

    /**
     * Create an instance of {@link CapabilitiesV31 }
     * 
     */
    public CapabilitiesV31 createCapabilitiesV31() {
        return new CapabilitiesV31();
    }

    /**
     * Create an instance of {@link CapabilitiesV30 }
     * 
     */
    public CapabilitiesV30 createCapabilitiesV30() {
        return new CapabilitiesV30();
    }

    /**
     * Create an instance of {@link CapabilitiesV29 }
     * 
     */
    public CapabilitiesV29 createCapabilitiesV29() {
        return new CapabilitiesV29();
    }

    /**
     * Create an instance of {@link CapabilitiesV28 }
     * 
     */
    public CapabilitiesV28 createCapabilitiesV28() {
        return new CapabilitiesV28();
    }

    /**
     * Create an instance of {@link CapabilitiesV27 }
     * 
     */
    public CapabilitiesV27 createCapabilitiesV27() {
        return new CapabilitiesV27();
    }

    /**
     * Create an instance of {@link CapabilitiesV26 }
     * 
     */
    public CapabilitiesV26 createCapabilitiesV26() {
        return new CapabilitiesV26();
    }

    /**
     * Create an instance of {@link CapabilitiesV25 }
     * 
     */
    public CapabilitiesV25 createCapabilitiesV25() {
        return new CapabilitiesV25();
    }

    /**
     * Create an instance of {@link CapabilitiesV24 }
     * 
     */
    public CapabilitiesV24 createCapabilitiesV24() {
        return new CapabilitiesV24();
    }

    /**
     * Create an instance of {@link CapabilitiesV23 }
     * 
     */
    public CapabilitiesV23 createCapabilitiesV23() {
        return new CapabilitiesV23();
    }

    /**
     * Create an instance of {@link CapabilitiesV22 }
     * 
     */
    public CapabilitiesV22 createCapabilitiesV22() {
        return new CapabilitiesV22();
    }

    /**
     * Create an instance of {@link CapabilitiesV21 }
     * 
     */
    public CapabilitiesV21 createCapabilitiesV21() {
        return new CapabilitiesV21();
    }

    /**
     * Create an instance of {@link CapabilitiesV20 }
     * 
     */
    public CapabilitiesV20 createCapabilitiesV20() {
        return new CapabilitiesV20();
    }

    /**
     * Create an instance of {@link CapabilitiesV19 }
     * 
     */
    public CapabilitiesV19 createCapabilitiesV19() {
        return new CapabilitiesV19();
    }

    /**
     * Create an instance of {@link CapabilitiesV18 }
     * 
     */
    public CapabilitiesV18 createCapabilitiesV18() {
        return new CapabilitiesV18();
    }

    /**
     * Create an instance of {@link CapabilitiesV17 }
     * 
     */
    public CapabilitiesV17 createCapabilitiesV17() {
        return new CapabilitiesV17();
    }

    /**
     * Create an instance of {@link CapabilitiesV16 }
     * 
     */
    public CapabilitiesV16 createCapabilitiesV16() {
        return new CapabilitiesV16();
    }

    /**
     * Create an instance of {@link CapabilitiesV15 }
     * 
     */
    public CapabilitiesV15 createCapabilitiesV15() {
        return new CapabilitiesV15();
    }

    /**
     * Create an instance of {@link CapabilitiesV14 }
     * 
     */
    public CapabilitiesV14 createCapabilitiesV14() {
        return new CapabilitiesV14();
    }

    /**
     * Create an instance of {@link CapabilitiesV13 }
     * 
     */
    public CapabilitiesV13 createCapabilitiesV13() {
        return new CapabilitiesV13();
    }

    /**
     * Create an instance of {@link CapabilitiesV12 }
     * 
     */
    public CapabilitiesV12 createCapabilitiesV12() {
        return new CapabilitiesV12();
    }

    /**
     * Create an instance of {@link CapabilitiesV11 }
     * 
     */
    public CapabilitiesV11 createCapabilitiesV11() {
        return new CapabilitiesV11();
    }

    /**
     * Create an instance of {@link CapabilitiesV10 }
     * 
     */
    public CapabilitiesV10 createCapabilitiesV10() {
        return new CapabilitiesV10();
    }

    /**
     * Create an instance of {@link CapabilitiesV9 }
     * 
     */
    public CapabilitiesV9 createCapabilitiesV9() {
        return new CapabilitiesV9();
    }

    /**
     * Create an instance of {@link CapabilitiesV8 }
     * 
     */
    public CapabilitiesV8 createCapabilitiesV8() {
        return new CapabilitiesV8();
    }

    /**
     * Create an instance of {@link CapabilitiesV7 }
     * 
     */
    public CapabilitiesV7 createCapabilitiesV7() {
        return new CapabilitiesV7();
    }

    /**
     * Create an instance of {@link CapabilitiesV6 }
     * 
     */
    public CapabilitiesV6 createCapabilitiesV6() {
        return new CapabilitiesV6();
    }

    /**
     * Create an instance of {@link CapabilitiesV5 }
     * 
     */
    public CapabilitiesV5 createCapabilitiesV5() {
        return new CapabilitiesV5();
    }

    /**
     * Create an instance of {@link CapabilitiesV4 }
     * 
     */
    public CapabilitiesV4 createCapabilitiesV4() {
        return new CapabilitiesV4();
    }

    /**
     * Create an instance of {@link CapabilitiesV3 }
     * 
     */
    public CapabilitiesV3 createCapabilitiesV3() {
        return new CapabilitiesV3();
    }

    /**
     * Create an instance of {@link CapabilitiesV2 }
     * 
     */
    public CapabilitiesV2 createCapabilitiesV2() {
        return new CapabilitiesV2();
    }

    /**
     * Create an instance of {@link Capabilities }
     * 
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link Terms }
     * 
     */
    public Terms createTerms() {
        return new Terms();
    }

    /**
     * Create an instance of {@link ArrayOfConfiguredCarriers }
     * 
     */
    public ArrayOfConfiguredCarriers createArrayOfConfiguredCarriers() {
        return new ArrayOfConfiguredCarriers();
    }

    /**
     * Create an instance of {@link ConfiguredCarriers }
     * 
     */
    public ConfiguredCarriers createConfiguredCarriers() {
        return new ConfiguredCarriers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "horizontalOffset", scope = CreateIndicium.class)
    public JAXBElement<Integer> createCreateIndiciumHorizontalOffset(Integer value) {
        return new JAXBElement<Integer>(_CreateIndiciumHorizontalOffset_QNAME, Integer.class, CreateIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "verticalOffset", scope = CreateIndicium.class)
    public JAXBElement<Integer> createCreateIndiciumVerticalOffset(Integer value) {
        return new JAXBElement<Integer>(_CreateIndiciumVerticalOffset_QNAME, Integer.class, CreateIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "printDensity", scope = CreateIndicium.class)
    public JAXBElement<Integer> createCreateIndiciumPrintDensity(Integer value) {
        return new JAXBElement<Integer>(_CreateIndiciumPrintDensity_QNAME, Integer.class, CreateIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "printMemo", scope = CreateIndicium.class)
    public JAXBElement<Boolean> createCreateIndiciumPrintMemo(Boolean value) {
        return new JAXBElement<Boolean>(_CreateIndiciumPrintMemo_QNAME, Boolean.class, CreateIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "printInstructions", scope = CreateIndicium.class)
    public JAXBElement<Boolean> createCreateIndiciumPrintInstructions(Boolean value) {
        return new JAXBElement<Boolean>(_CreateIndiciumPrintInstructions_QNAME, Boolean.class, CreateIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ReturnImageData", scope = CreateIndicium.class)
    public JAXBElement<Boolean> createCreateIndiciumReturnImageData(Boolean value) {
        return new JAXBElement<Boolean>(_CreateIndiciumReturnImageData_QNAME, Boolean.class, CreateIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ReturnLabelExpirationDays", scope = CreateIndicium.class)
    public JAXBElement<Integer> createCreateIndiciumReturnLabelExpirationDays(Integer value) {
        return new JAXBElement<Integer>(_CreateIndiciumReturnLabelExpirationDays_QNAME, Integer.class, CreateIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "BrandingId", scope = CreateIndicium.class)
    public JAXBElement<String> createCreateIndiciumBrandingId(String value) {
        return new JAXBElement<String>(_CreateIndiciumBrandingId_QNAME, String.class, CreateIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "NotificationSettingId", scope = CreateIndicium.class)
    public JAXBElement<String> createCreateIndiciumNotificationSettingId(String value) {
        return new JAXBElement<String>(_CreateIndiciumNotificationSettingId_QNAME, String.class, CreateIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "PrintFromAddress", scope = CreateEnvelopeIndicium.class)
    public JAXBElement<Boolean> createCreateEnvelopeIndiciumPrintFromAddress(Boolean value) {
        return new JAXBElement<Boolean>(_CreateEnvelopeIndiciumPrintFromAddress_QNAME, Boolean.class, CreateEnvelopeIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "PrintToAddress", scope = CreateEnvelopeIndicium.class)
    public JAXBElement<Boolean> createCreateEnvelopeIndiciumPrintToAddress(Boolean value) {
        return new JAXBElement<Boolean>(_CreateEnvelopeIndiciumPrintToAddress_QNAME, Boolean.class, CreateEnvelopeIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "PrintFromAddress", scope = CreateMailingLabelIndicia.class)
    public JAXBElement<Boolean> createCreateMailingLabelIndiciaPrintFromAddress(Boolean value) {
        return new JAXBElement<Boolean>(_CreateEnvelopeIndiciumPrintFromAddress_QNAME, Boolean.class, CreateMailingLabelIndicia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "BrandingId", scope = CreateShipmentNotification.class)
    public JAXBElement<String> createCreateShipmentNotificationBrandingId(String value) {
        return new JAXBElement<String>(_CreateIndiciumBrandingId_QNAME, String.class, CreateShipmentNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "NotificationSettingId", scope = CreateShipmentNotification.class)
    public JAXBElement<String> createCreateShipmentNotificationNotificationSettingId(String value) {
        return new JAXBElement<String>(_CreateIndiciumNotificationSettingId_QNAME, String.class, CreateShipmentNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShipDate", scope = CreateManifest.class)
    public JAXBElement<XMLGregorianCalendar> createCreateManifestShipDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateManifestShipDate_QNAME, XMLGregorianCalendar.class, CreateManifest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "SendEmail", scope = RegisterAccount.class)
    public JAXBElement<Boolean> createRegisterAccountSendEmail(Boolean value) {
        return new JAXBElement<Boolean>(_RegisterAccountSendEmail_QNAME, Boolean.class, RegisterAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ResetPasswordAfterRegistration", scope = RegisterAccount.class)
    public JAXBElement<Boolean> createRegisterAccountResetPasswordAfterRegistration(Boolean value) {
        return new JAXBElement<Boolean>(_RegisterAccountResetPasswordAfterRegistration_QNAME, Boolean.class, RegisterAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageCategory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImageCategory }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ImageCategory", scope = AddImage.class)
    public JAXBElement<ImageCategory> createAddImageImageCategory(ImageCategory value) {
        return new JAXBElement<ImageCategory>(_AddImageImageCategory_QNAME, ImageCategory.class, AddImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefaultPaymentMethodTypeOptions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DefaultPaymentMethodTypeOptions }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "DefaultPaymentMethodType", scope = AddUserPaymentMethod.class)
    public JAXBElement<DefaultPaymentMethodTypeOptions> createAddUserPaymentMethodDefaultPaymentMethodType(DefaultPaymentMethodTypeOptions value) {
        return new JAXBElement<DefaultPaymentMethodTypeOptions>(_AddUserPaymentMethodDefaultPaymentMethodType_QNAME, DefaultPaymentMethodTypeOptions.class, AddUserPaymentMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "SendEmail", scope = AddUserPaymentMethod.class)
    public JAXBElement<Boolean> createAddUserPaymentMethodSendEmail(Boolean value) {
        return new JAXBElement<Boolean>(_RegisterAccountSendEmail_QNAME, Boolean.class, AddUserPaymentMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "SendEmail", scope = ChangeDefaultPaymentMethod.class)
    public JAXBElement<Boolean> createChangeDefaultPaymentMethodSendEmail(Boolean value) {
        return new JAXBElement<Boolean>(_RegisterAccountSendEmail_QNAME, Boolean.class, ChangeDefaultPaymentMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "SendEmail", scope = PurchasePostage.class)
    public JAXBElement<Boolean> createPurchasePostageSendEmail(Boolean value) {
        return new JAXBElement<Boolean>(_RegisterAccountSendEmail_QNAME, Boolean.class, PurchasePostage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "IsPOBox", scope = CleanseAddressResponse.class)
    public JAXBElement<Boolean> createCleanseAddressResponseIsPOBox(Boolean value) {
        return new JAXBElement<Boolean>(_CleanseAddressResponseIsPOBox_QNAME, Boolean.class, CleanseAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "SendEmail", scope = ChangePlan.class)
    public JAXBElement<Boolean> createChangePlanSendEmail(Boolean value) {
        return new JAXBElement<Boolean>(_RegisterAccountSendEmail_QNAME, Boolean.class, ChangePlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "TransactionsPerPage", scope = GetBalanceHistory.class)
    public JAXBElement<Integer> createGetBalanceHistoryTransactionsPerPage(Integer value) {
        return new JAXBElement<Integer>(_GetBalanceHistoryTransactionsPerPage_QNAME, Integer.class, GetBalanceHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "TransactionDateMax", scope = GetBalanceHistory.class)
    public JAXBElement<XMLGregorianCalendar> createGetBalanceHistoryTransactionDateMax(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetBalanceHistoryTransactionDateMax_QNAME, XMLGregorianCalendar.class, GetBalanceHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "SendEmail", scope = CancelIndicium.class)
    public JAXBElement<Boolean> createCancelIndiciumSendEmail(Boolean value) {
        return new JAXBElement<Boolean>(_RegisterAccountSendEmail_QNAME, Boolean.class, CancelIndicium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "CanRateShop", scope = CapabilitiesV31 .class)
    public JAXBElement<Boolean> createCapabilitiesV31CanRateShop(Boolean value) {
        return new JAXBElement<Boolean>(_CapabilitiesV31CanRateShop_QNAME, Boolean.class, CapabilitiesV31 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "DisplayUPSByDefault", scope = CapabilitiesV31 .class)
    public JAXBElement<Boolean> createCapabilitiesV31DisplayUPSByDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CapabilitiesV31DisplayUPSByDefault_QNAME, Boolean.class, CapabilitiesV31 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "CanPrintUPSDirect", scope = CapabilitiesV31 .class)
    public JAXBElement<Boolean> createCapabilitiesV31CanPrintUPSDirect(Boolean value) {
        return new JAXBElement<Boolean>(_CapabilitiesV31CanPrintUPSDirect_QNAME, Boolean.class, CapabilitiesV31 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "CanPrintUPSIntl", scope = CapabilitiesV31 .class)
    public JAXBElement<Boolean> createCapabilitiesV31CanPrintUPSIntl(Boolean value) {
        return new JAXBElement<Boolean>(_CapabilitiesV31CanPrintUPSIntl_QNAME, Boolean.class, CapabilitiesV31 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "DisplayFXByDefault", scope = CapabilitiesV32 .class)
    public JAXBElement<Boolean> createCapabilitiesV32DisplayFXByDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CapabilitiesV32DisplayFXByDefault_QNAME, Boolean.class, CapabilitiesV32 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "CanPrintFXDirect", scope = CapabilitiesV32 .class)
    public JAXBElement<Boolean> createCapabilitiesV32CanPrintFXDirect(Boolean value) {
        return new JAXBElement<Boolean>(_CapabilitiesV32CanPrintFXDirect_QNAME, Boolean.class, CapabilitiesV32 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "CanPrintFXIntl", scope = CapabilitiesV32 .class)
    public JAXBElement<Boolean> createCapabilitiesV32CanPrintFXIntl(Boolean value) {
        return new JAXBElement<Boolean>(_CapabilitiesV32CanPrintFXIntl_QNAME, Boolean.class, CapabilitiesV32 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "DisplayDXByDefault", scope = CapabilitiesV32 .class)
    public JAXBElement<Boolean> createCapabilitiesV32DisplayDXByDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CapabilitiesV32DisplayDXByDefault_QNAME, Boolean.class, CapabilitiesV32 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreditCardType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "CreditCardType", scope = PaymentMethod.class)
    public JAXBElement<CreditCardType> createPaymentMethodCreditCardType(CreditCardType value) {
        return new JAXBElement<CreditCardType>(_PaymentMethodCreditCardType_QNAME, CreditCardType.class, PaymentMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGClaimSubStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PGClaimSubStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "StatusDetail", scope = PGClaimDetails.class)
    public JAXBElement<PGClaimSubStatus> createPGClaimDetailsStatusDetail(PGClaimSubStatus value) {
        return new JAXBElement<PGClaimSubStatus>(_PGClaimDetailsStatusDetail_QNAME, PGClaimSubStatus.class, PGClaimDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "DateAdjustmentProcessed", scope = AdjustmentDetails.class)
    public JAXBElement<XMLGregorianCalendar> createAdjustmentDetailsDateAdjustmentProcessed(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdjustmentDetailsDateAdjustmentProcessed_QNAME, XMLGregorianCalendar.class, AdjustmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "DateRecorded", scope = AdjustmentDetails.class)
    public JAXBElement<XMLGregorianCalendar> createAdjustmentDetailsDateRecorded(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdjustmentDetailsDateRecorded_QNAME, XMLGregorianCalendar.class, AdjustmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "OtherSurchargeAmounts", scope = AdjustmentDetails.class)
    public JAXBElement<BigDecimal> createAdjustmentDetailsOtherSurchargeAmounts(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AdjustmentDetailsOtherSurchargeAmounts_QNAME, BigDecimal.class, AdjustmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "EstimatedPostageRefundCompletionDate", scope = RefundStatusV1 .class)
    public JAXBElement<XMLGregorianCalendar> createRefundStatusV1EstimatedPostageRefundCompletionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RefundStatusV1EstimatedPostageRefundCompletionDate_QNAME, XMLGregorianCalendar.class, RefundStatusV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostageRefundStatusV1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PostageRefundStatusV1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "InsuranceRefundStatus", scope = RefundStatusV1 .class)
    public JAXBElement<PostageRefundStatusV1> createRefundStatusV1InsuranceRefundStatus(PostageRefundStatusV1 value) {
        return new JAXBElement<PostageRefundStatusV1>(_RefundStatusV1InsuranceRefundStatus_QNAME, PostageRefundStatusV1 .class, RefundStatusV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "EstimatedInsuranceRefundCompletionDate", scope = RefundStatusV1 .class)
    public JAXBElement<XMLGregorianCalendar> createRefundStatusV1EstimatedInsuranceRefundCompletionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RefundStatusV1EstimatedInsuranceRefundCompletionDate_QNAME, XMLGregorianCalendar.class, RefundStatusV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "InsuranceAmountRequested", scope = RefundStatusV1 .class)
    public JAXBElement<BigDecimal> createRefundStatusV1InsuranceAmountRequested(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RefundStatusV1InsuranceAmountRequested_QNAME, BigDecimal.class, RefundStatusV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "InsuranceAmountApproved", scope = RefundStatusV1 .class)
    public JAXBElement<BigDecimal> createRefundStatusV1InsuranceAmountApproved(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RefundStatusV1InsuranceAmountApproved_QNAME, BigDecimal.class, RefundStatusV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryFacilityV1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EntryFacilityV1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "EntryFacility", scope = PackageInfoV6 .class)
    public JAXBElement<EntryFacilityV1> createPackageInfoV6EntryFacility(EntryFacilityV1 value) {
        return new JAXBElement<EntryFacilityV1>(_PackageInfoV6EntryFacility_QNAME, EntryFacilityV1 .class, PackageInfoV6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortTypeV1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortTypeV1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "SortType", scope = PackageInfoV6 .class)
    public JAXBElement<SortTypeV1> createPackageInfoV6SortType(SortTypeV1 value) {
        return new JAXBElement<SortTypeV1>(_PackageInfoV6SortType_QNAME, SortTypeV1 .class, PackageInfoV6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnclosedServiceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnclosedServiceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "EnclosedServiceType", scope = PackageInfoV6 .class)
    public JAXBElement<EnclosedServiceType> createPackageInfoV6EnclosedServiceType(EnclosedServiceType value) {
        return new JAXBElement<EnclosedServiceType>(_PackageInfoV6EnclosedServiceType_QNAME, EnclosedServiceType.class, PackageInfoV6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnclosedPackageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnclosedPackageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "EnclosedPackageType", scope = PackageInfoV6 .class)
    public JAXBElement<EnclosedPackageType> createPackageInfoV6EnclosedPackageType(EnclosedPackageType value) {
        return new JAXBElement<EnclosedPackageType>(_PackageInfoV6EnclosedPackageType_QNAME, EnclosedPackageType.class, PackageInfoV6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusV2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShipmentStatusV2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShipmentStatus", scope = ShipmentV38 .class)
    public JAXBElement<ShipmentStatusV2> createShipmentV38ShipmentStatus(ShipmentStatusV2 value) {
        return new JAXBElement<ShipmentStatusV2>(_ShipmentV38ShipmentStatus_QNAME, ShipmentStatusV2 .class, ShipmentV38 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "PrintDate", scope = ShipmentV38 .class)
    public JAXBElement<XMLGregorianCalendar> createShipmentV38PrintDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ShipmentV38PrintDate_QNAME, XMLGregorianCalendar.class, ShipmentV38 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "MailDate", scope = ShipmentV38 .class)
    public JAXBElement<XMLGregorianCalendar> createShipmentV38MailDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ShipmentV38MailDate_QNAME, XMLGregorianCalendar.class, ShipmentV38 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "DeliveredDate", scope = ShipmentV38 .class)
    public JAXBElement<XMLGregorianCalendar> createShipmentV38DeliveredDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ShipmentV38DeliveredDate_QNAME, XMLGregorianCalendar.class, ShipmentV38 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundTypeV1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RefundTypeV1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "RefundType", scope = ShipmentV38 .class)
    public JAXBElement<RefundTypeV1> createShipmentV38RefundType(RefundTypeV1 value) {
        return new JAXBElement<RefundTypeV1>(_ShipmentV38RefundType_QNAME, RefundTypeV1 .class, ShipmentV38 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ExpiryDate", scope = ShipmentV38 .class)
    public JAXBElement<XMLGregorianCalendar> createShipmentV38ExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ShipmentV38ExpiryDate_QNAME, XMLGregorianCalendar.class, ShipmentV38 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "LabelCategory", scope = ShipmentV38 .class)
    public JAXBElement<Integer> createShipmentV38LabelCategory(Integer value) {
        return new JAXBElement<Integer>(_ShipmentV38LabelCategory_QNAME, Integer.class, ShipmentV38 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowCustomColors", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowCustomColors(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowCustomColors_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowSocialMedia", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowSocialMedia(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowSocialMedia_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowStoreUrl", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowStoreUrl(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowStoreUrl_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowMenuLinks", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowMenuLinks(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowMenuLinks_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowReturnPolicy", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowReturnPolicy(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowReturnPolicy_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowEmail", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowEmail(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowEmail_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowPhone", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowPhone(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowPhone_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowShipmentDetails", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowShipmentDetails(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowShipmentDetails_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowItemImages", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowItemImages(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowItemImages_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowShipmentPrices", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowShipmentPrices(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowShipmentPrices_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShowStoreAddress", scope = Toggles.class)
    public JAXBElement<Boolean> createTogglesShowStoreAddress(Boolean value) {
        return new JAXBElement<Boolean>(_TogglesShowStoreAddress_QNAME, Boolean.class, Toggles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "UnitPrice", scope = OrderItem.class)
    public JAXBElement<BigDecimal> createOrderItemUnitPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderItemUnitPrice_QNAME, BigDecimal.class, OrderItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "PendingPlanId", scope = AccountInfoV65 .class)
    public JAXBElement<Integer> createAccountInfoV65PendingPlanId(Integer value) {
        return new JAXBElement<Integer>(_AccountInfoV65PendingPlanId_QNAME, Integer.class, AccountInfoV65 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatesetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RatesetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "RatesetType", scope = AccountInfoV65 .class)
    public JAXBElement<RatesetType> createAccountInfoV65RatesetType(RatesetType value) {
        return new JAXBElement<RatesetType>(_AccountInfoV65RatesetType_QNAME, RatesetType.class, AccountInfoV65 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "USPSRep", scope = AccountInfoV65 .class)
    public JAXBElement<Boolean> createAccountInfoV65USPSRep(Boolean value) {
        return new JAXBElement<Boolean>(_AccountInfoV65USPSRep_QNAME, Boolean.class, AccountInfoV65 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "OutstandingLabelBalance", scope = AccountInfoV65 .class)
    public JAXBElement<BigDecimal> createAccountInfoV65OutstandingLabelBalance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AccountInfoV65OutstandingLabelBalance_QNAME, BigDecimal.class, AccountInfoV65 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "MaxOutstandingLabelBalance", scope = AccountInfoV65 .class)
    public JAXBElement<BigDecimal> createAccountInfoV65MaxOutstandingLabelBalance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AccountInfoV65MaxOutstandingLabelBalance_QNAME, BigDecimal.class, AccountInfoV65 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "MaxParcelGuardInsuredValue", scope = AccountInfoV65 .class)
    public JAXBElement<BigDecimal> createAccountInfoV65MaxParcelGuardInsuredValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AccountInfoV65MaxParcelGuardInsuredValue_QNAME, BigDecimal.class, AccountInfoV65 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "PrintDateMax", scope = Filters.class)
    public JAXBElement<XMLGregorianCalendar> createFiltersPrintDateMax(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FiltersPrintDateMax_QNAME, XMLGregorianCalendar.class, Filters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "AllowSMSOptIn", scope = NotificationSettingProperties.class)
    public JAXBElement<Boolean> createNotificationSettingPropertiesAllowSMSOptIn(Boolean value) {
        return new JAXBElement<Boolean>(_NotificationSettingPropertiesAllowSMSOptIn_QNAME, Boolean.class, NotificationSettingProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "ShippingAndHandlingPrice", scope = OrderDetails.class)
    public JAXBElement<BigDecimal> createOrderDetailsShippingAndHandlingPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderDetailsShippingAndHandlingPrice_QNAME, BigDecimal.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "TotalDiscountAmount", scope = OrderDetails.class)
    public JAXBElement<BigDecimal> createOrderDetailsTotalDiscountAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderDetailsTotalDiscountAmount_QNAME, BigDecimal.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130", name = "TotalTaxAmount", scope = OrderDetails.class)
    public JAXBElement<BigDecimal> createOrderDetailsTotalTaxAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrderDetailsTotalTaxAmount_QNAME, BigDecimal.class, OrderDetails.class, value);
    }

}
