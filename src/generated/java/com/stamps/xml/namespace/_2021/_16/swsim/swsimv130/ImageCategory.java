
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ImageCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LabelLogo"/&gt;
 *     &lt;enumeration value="BrandedTracking"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageCategory")
@XmlEnum
public enum ImageCategory {

    @XmlEnumValue("LabelLogo")
    LABEL_LOGO("LabelLogo"),
    @XmlEnumValue("BrandedTracking")
    BRANDED_TRACKING("BrandedTracking");
    private final String value;

    ImageCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageCategory fromValue(String v) {
        for (ImageCategory c: ImageCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
