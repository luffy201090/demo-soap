
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultPaymentMethodTypeOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DefaultPaymentMethodTypeOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AllDefaultPaymentMethods"/&gt;
 *     &lt;enumeration value="DefaultServiceFeePaymentMethod"/&gt;
 *     &lt;enumeration value="DefaultPostalPurchasePaymentMethod"/&gt;
 *     &lt;enumeration value="DefaultStorePaymentMethod"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DefaultPaymentMethodTypeOptions")
@XmlEnum
public enum DefaultPaymentMethodTypeOptions {

    @XmlEnumValue("AllDefaultPaymentMethods")
    ALL_DEFAULT_PAYMENT_METHODS("AllDefaultPaymentMethods"),
    @XmlEnumValue("DefaultServiceFeePaymentMethod")
    DEFAULT_SERVICE_FEE_PAYMENT_METHOD("DefaultServiceFeePaymentMethod"),
    @XmlEnumValue("DefaultPostalPurchasePaymentMethod")
    DEFAULT_POSTAL_PURCHASE_PAYMENT_METHOD("DefaultPostalPurchasePaymentMethod"),
    @XmlEnumValue("DefaultStorePaymentMethod")
    DEFAULT_STORE_PAYMENT_METHOD("DefaultStorePaymentMethod");
    private final String value;

    DefaultPaymentMethodTypeOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefaultPaymentMethodTypeOptions fromValue(String v) {
        for (DefaultPaymentMethodTypeOptions c: DefaultPaymentMethodTypeOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
