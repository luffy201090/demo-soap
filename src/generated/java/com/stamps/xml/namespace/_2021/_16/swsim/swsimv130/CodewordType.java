
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodewordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CodewordType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *     &lt;enumeration value="MothersMaidenName"/&gt;
 *     &lt;enumeration value="PetsName"/&gt;
 *     &lt;enumeration value="BirthCity"/&gt;
 *     &lt;enumeration value="HighSchoolMascot"/&gt;
 *     &lt;enumeration value="FathersBirthplace"/&gt;
 *     &lt;enumeration value="StreetName"/&gt;
 *     &lt;enumeration value="FirstSchoolsName"/&gt;
 *     &lt;enumeration value="FirstCarsMakeModel"/&gt;
 *     &lt;enumeration value="Last4SocialSecurityNumber"/&gt;
 *     &lt;enumeration value="Last4DriversLicense"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodewordType")
@XmlEnum
public enum CodewordType {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("MothersMaidenName")
    MOTHERS_MAIDEN_NAME("MothersMaidenName"),
    @XmlEnumValue("PetsName")
    PETS_NAME("PetsName"),
    @XmlEnumValue("BirthCity")
    BIRTH_CITY("BirthCity"),
    @XmlEnumValue("HighSchoolMascot")
    HIGH_SCHOOL_MASCOT("HighSchoolMascot"),
    @XmlEnumValue("FathersBirthplace")
    FATHERS_BIRTHPLACE("FathersBirthplace"),
    @XmlEnumValue("StreetName")
    STREET_NAME("StreetName"),
    @XmlEnumValue("FirstSchoolsName")
    FIRST_SCHOOLS_NAME("FirstSchoolsName"),
    @XmlEnumValue("FirstCarsMakeModel")
    FIRST_CARS_MAKE_MODEL("FirstCarsMakeModel"),
    @XmlEnumValue("Last4SocialSecurityNumber")
    LAST_4_SOCIAL_SECURITY_NUMBER("Last4SocialSecurityNumber"),
    @XmlEnumValue("Last4DriversLicense")
    LAST_4_DRIVERS_LICENSE("Last4DriversLicense");
    private final String value;

    CodewordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodewordType fromValue(String v) {
        for (CodewordType c: CodewordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
