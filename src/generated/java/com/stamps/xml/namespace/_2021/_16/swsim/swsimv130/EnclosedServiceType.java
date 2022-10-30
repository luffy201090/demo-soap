
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnclosedServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnclosedServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="MarketingMail"/&gt;
 *     &lt;enumeration value="Periodicals"/&gt;
 *     &lt;enumeration value="NewsPeriodicals"/&gt;
 *     &lt;enumeration value="BoundMedia"/&gt;
 *     &lt;enumeration value="ParcelSelect"/&gt;
 *     &lt;enumeration value="OtherPackageService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnclosedServiceType")
@XmlEnum
public enum EnclosedServiceType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("MarketingMail")
    MARKETING_MAIL("MarketingMail"),
    @XmlEnumValue("Periodicals")
    PERIODICALS("Periodicals"),
    @XmlEnumValue("NewsPeriodicals")
    NEWS_PERIODICALS("NewsPeriodicals"),
    @XmlEnumValue("BoundMedia")
    BOUND_MEDIA("BoundMedia"),
    @XmlEnumValue("ParcelSelect")
    PARCEL_SELECT("ParcelSelect"),
    @XmlEnumValue("OtherPackageService")
    OTHER_PACKAGE_SERVICE("OtherPackageService");
    private final String value;

    EnclosedServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnclosedServiceType fromValue(String v) {
        for (EnclosedServiceType c: EnclosedServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
