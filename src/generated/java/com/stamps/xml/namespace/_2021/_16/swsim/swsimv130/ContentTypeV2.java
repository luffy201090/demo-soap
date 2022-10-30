
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentTypeV2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ContentTypeV2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Commercial Sample"/&gt;
 *     &lt;enumeration value="Gift"/&gt;
 *     &lt;enumeration value="Document"/&gt;
 *     &lt;enumeration value="Returned Goods"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Merchandise"/&gt;
 *     &lt;enumeration value="Humanitarian Donation"/&gt;
 *     &lt;enumeration value="Dangerous Goods"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContentTypeV2")
@XmlEnum
public enum ContentTypeV2 {

    @XmlEnumValue("Commercial Sample")
    COMMERCIAL_SAMPLE("Commercial Sample"),
    @XmlEnumValue("Gift")
    GIFT("Gift"),
    @XmlEnumValue("Document")
    DOCUMENT("Document"),
    @XmlEnumValue("Returned Goods")
    RETURNED_GOODS("Returned Goods"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Merchandise")
    MERCHANDISE("Merchandise"),
    @XmlEnumValue("Humanitarian Donation")
    HUMANITARIAN_DONATION("Humanitarian Donation"),
    @XmlEnumValue("Dangerous Goods")
    DANGEROUS_GOODS("Dangerous Goods");
    private final String value;

    ContentTypeV2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentTypeV2 fromValue(String v) {
        for (ContentTypeV2 c: ContentTypeV2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
