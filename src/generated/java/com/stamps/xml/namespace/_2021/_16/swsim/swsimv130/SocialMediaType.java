
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SocialMediaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Twitter"/&gt;
 *     &lt;enumeration value="Instagram"/&gt;
 *     &lt;enumeration value="Youtube"/&gt;
 *     &lt;enumeration value="Pinterest"/&gt;
 *     &lt;enumeration value="Facebook"/&gt;
 *     &lt;enumeration value="Linkedin"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SocialMediaType")
@XmlEnum
public enum SocialMediaType {

    @XmlEnumValue("Twitter")
    TWITTER("Twitter"),
    @XmlEnumValue("Instagram")
    INSTAGRAM("Instagram"),
    @XmlEnumValue("Youtube")
    YOUTUBE("Youtube"),
    @XmlEnumValue("Pinterest")
    PINTEREST("Pinterest"),
    @XmlEnumValue("Facebook")
    FACEBOOK("Facebook"),
    @XmlEnumValue("Linkedin")
    LINKEDIN("Linkedin");
    private final String value;

    SocialMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SocialMediaType fromValue(String v) {
        for (SocialMediaType c: SocialMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
