
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BillingMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACH"/&gt;
 *     &lt;enumeration value="CreditCard"/&gt;
 *     &lt;enumeration value="OMAS"/&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *     &lt;enumeration value="EnterprisePaymentAccount"/&gt;
 *     &lt;enumeration value="PPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingMethod")
@XmlEnum
public enum BillingMethod {

    ACH("ACH"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    OMAS("OMAS"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("EnterprisePaymentAccount")
    ENTERPRISE_PAYMENT_ACCOUNT("EnterprisePaymentAccount"),
    PPL("PPL");
    private final String value;

    BillingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingMethod fromValue(String v) {
        for (BillingMethod c: BillingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
