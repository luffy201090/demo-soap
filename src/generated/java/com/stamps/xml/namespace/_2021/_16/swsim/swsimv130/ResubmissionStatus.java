
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResubmissionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResubmissionStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_IN_RESUBMISSION"/&gt;
 *     &lt;enumeration value="PAYMENT_RESUBMISSION"/&gt;
 *     &lt;enumeration value="NON_CORRECTABLE_PAYMENT_RESUBMISSION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResubmissionStatus")
@XmlEnum
public enum ResubmissionStatus {

    NOT_IN_RESUBMISSION,
    PAYMENT_RESUBMISSION,
    NON_CORRECTABLE_PAYMENT_RESUBMISSION;

    public String value() {
        return name();
    }

    public static ResubmissionStatus fromValue(String v) {
        return valueOf(v);
    }

}
