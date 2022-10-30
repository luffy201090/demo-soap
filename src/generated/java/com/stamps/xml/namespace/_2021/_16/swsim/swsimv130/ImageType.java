
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ImageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Png"/&gt;
 *     &lt;enumeration value="Gif"/&gt;
 *     &lt;enumeration value="Pdf"/&gt;
 *     &lt;enumeration value="Epl"/&gt;
 *     &lt;enumeration value="Jpg"/&gt;
 *     &lt;enumeration value="PrintOncePdf"/&gt;
 *     &lt;enumeration value="EncryptedPngUrl"/&gt;
 *     &lt;enumeration value="Zpl"/&gt;
 *     &lt;enumeration value="AZpl"/&gt;
 *     &lt;enumeration value="BZpl"/&gt;
 *     &lt;enumeration value="Bmp"/&gt;
 *     &lt;enumeration value="BmpMonochrome"/&gt;
 *     &lt;enumeration value="PngMonochrome"/&gt;
 *     &lt;enumeration value="JpgMonochrome"/&gt;
 *     &lt;enumeration value="GifMonochrome"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageType")
@XmlEnum
public enum ImageType {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Png")
    PNG("Png"),
    @XmlEnumValue("Gif")
    GIF("Gif"),
    @XmlEnumValue("Pdf")
    PDF("Pdf"),
    @XmlEnumValue("Epl")
    EPL("Epl"),
    @XmlEnumValue("Jpg")
    JPG("Jpg"),
    @XmlEnumValue("PrintOncePdf")
    PRINT_ONCE_PDF("PrintOncePdf"),
    @XmlEnumValue("EncryptedPngUrl")
    ENCRYPTED_PNG_URL("EncryptedPngUrl"),
    @XmlEnumValue("Zpl")
    ZPL("Zpl"),
    @XmlEnumValue("AZpl")
    A_ZPL("AZpl"),
    @XmlEnumValue("BZpl")
    B_ZPL("BZpl"),
    @XmlEnumValue("Bmp")
    BMP("Bmp"),
    @XmlEnumValue("BmpMonochrome")
    BMP_MONOCHROME("BmpMonochrome"),
    @XmlEnumValue("PngMonochrome")
    PNG_MONOCHROME("PngMonochrome"),
    @XmlEnumValue("JpgMonochrome")
    JPG_MONOCHROME("JpgMonochrome"),
    @XmlEnumValue("GifMonochrome")
    GIF_MONOCHROME("GifMonochrome");
    private final String value;

    ImageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageType fromValue(String v) {
        for (ImageType c: ImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
