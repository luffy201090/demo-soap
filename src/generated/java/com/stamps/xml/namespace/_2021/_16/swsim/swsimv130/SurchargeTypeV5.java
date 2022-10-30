
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurchargeTypeV5.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SurchargeTypeV5"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUR-A-ER"/&gt;
 *     &lt;enumeration value="SUR-A-EV"/&gt;
 *     &lt;enumeration value="SUR-A-FUEL"/&gt;
 *     &lt;enumeration value="SUR-A-OS"/&gt;
 *     &lt;enumeration value="SUR-A-OW"/&gt;
 *     &lt;enumeration value="SUR-A-RAD"/&gt;
 *     &lt;enumeration value="SUR-A-RD"/&gt;
 *     &lt;enumeration value="SUR-A-AHS"/&gt;
 *     &lt;enumeration value="SUR-A-NCS"/&gt;
 *     &lt;enumeration value="SUR-A-DAS"/&gt;
 *     &lt;enumeration value="SUR-A-DAE"/&gt;
 *     &lt;enumeration value="SUR-A-RAE"/&gt;
 *     &lt;enumeration value="SUR-A-NM"/&gt;
 *     &lt;enumeration value="SUR-A-NSDIM1"/&gt;
 *     &lt;enumeration value="SUR-A-NSDIM2"/&gt;
 *     &lt;enumeration value="SUR-A-NSVOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SurchargeTypeV5")
@XmlEnum
public enum SurchargeTypeV5 {

    @XmlEnumValue("SUR-A-ER")
    SUR_A_ER("SUR-A-ER"),
    @XmlEnumValue("SUR-A-EV")
    SUR_A_EV("SUR-A-EV"),
    @XmlEnumValue("SUR-A-FUEL")
    SUR_A_FUEL("SUR-A-FUEL"),
    @XmlEnumValue("SUR-A-OS")
    SUR_A_OS("SUR-A-OS"),
    @XmlEnumValue("SUR-A-OW")
    SUR_A_OW("SUR-A-OW"),
    @XmlEnumValue("SUR-A-RAD")
    SUR_A_RAD("SUR-A-RAD"),
    @XmlEnumValue("SUR-A-RD")
    SUR_A_RD("SUR-A-RD"),
    @XmlEnumValue("SUR-A-AHS")
    SUR_A_AHS("SUR-A-AHS"),
    @XmlEnumValue("SUR-A-NCS")
    SUR_A_NCS("SUR-A-NCS"),
    @XmlEnumValue("SUR-A-DAS")
    SUR_A_DAS("SUR-A-DAS"),
    @XmlEnumValue("SUR-A-DAE")
    SUR_A_DAE("SUR-A-DAE"),
    @XmlEnumValue("SUR-A-RAE")
    SUR_A_RAE("SUR-A-RAE"),
    @XmlEnumValue("SUR-A-NM")
    SUR_A_NM("SUR-A-NM"),
    @XmlEnumValue("SUR-A-NSDIM1")
    SUR_A_NSDIM_1("SUR-A-NSDIM1"),
    @XmlEnumValue("SUR-A-NSDIM2")
    SUR_A_NSDIM_2("SUR-A-NSDIM2"),
    @XmlEnumValue("SUR-A-NSVOL")
    SUR_A_NSVOL("SUR-A-NSVOL");
    private final String value;

    SurchargeTypeV5(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurchargeTypeV5 fromValue(String v) {
        for (SurchargeTypeV5 c: SurchargeTypeV5 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
