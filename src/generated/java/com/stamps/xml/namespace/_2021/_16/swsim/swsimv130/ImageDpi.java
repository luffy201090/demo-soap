
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageDpi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ImageDpi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ImageDpiDefault"/&gt;
 *     &lt;enumeration value="ImageDpi200"/&gt;
 *     &lt;enumeration value="ImageDpi300"/&gt;
 *     &lt;enumeration value="ImageDpi203"/&gt;
 *     &lt;enumeration value="ImageDpi96"/&gt;
 *     &lt;enumeration value="ImageDpi150"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageDpi")
@XmlEnum
public enum ImageDpi {

    @XmlEnumValue("ImageDpiDefault")
    IMAGE_DPI_DEFAULT("ImageDpiDefault"),
    @XmlEnumValue("ImageDpi200")
    IMAGE_DPI_200("ImageDpi200"),
    @XmlEnumValue("ImageDpi300")
    IMAGE_DPI_300("ImageDpi300"),
    @XmlEnumValue("ImageDpi203")
    IMAGE_DPI_203("ImageDpi203"),
    @XmlEnumValue("ImageDpi96")
    IMAGE_DPI_96("ImageDpi96"),
    @XmlEnumValue("ImageDpi150")
    IMAGE_DPI_150("ImageDpi150");
    private final String value;

    ImageDpi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageDpi fromValue(String v) {
        for (ImageDpi c: ImageDpi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
