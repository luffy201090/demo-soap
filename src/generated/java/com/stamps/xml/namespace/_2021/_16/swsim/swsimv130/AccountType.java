
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AccountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Individual"/&gt;
 *     &lt;enumeration value="HomeOffice"/&gt;
 *     &lt;enumeration value="HomeBasedBusiness"/&gt;
 *     &lt;enumeration value="OfficeBasedBusiness"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountType")
@XmlEnum
public enum AccountType {

    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("HomeOffice")
    HOME_OFFICE("HomeOffice"),
    @XmlEnumValue("HomeBasedBusiness")
    HOME_BASED_BUSINESS("HomeBasedBusiness"),
    @XmlEnumValue("OfficeBasedBusiness")
    OFFICE_BASED_BUSINESS("OfficeBasedBusiness");
    private final String value;

    AccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountType fromValue(String v) {
        for (AccountType c: AccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
