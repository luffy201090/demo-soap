
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManifestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ManifestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ScanForm"/&gt;
 *     &lt;enumeration value="GlobalAdvantage"/&gt;
 *     &lt;enumeration value="GlobalPost"/&gt;
 *     &lt;enumeration value="DriverManifest"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ManifestType")
@XmlEnum
public enum ManifestType {

    @XmlEnumValue("ScanForm")
    SCAN_FORM("ScanForm"),
    @XmlEnumValue("GlobalAdvantage")
    GLOBAL_ADVANTAGE("GlobalAdvantage"),
    @XmlEnumValue("GlobalPost")
    GLOBAL_POST("GlobalPost"),
    @XmlEnumValue("DriverManifest")
    DRIVER_MANIFEST("DriverManifest"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ManifestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManifestType fromValue(String v) {
        for (ManifestType c: ManifestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
