
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCodeword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCodeword"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodewordV2" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}Codeword" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCodeword", propOrder = {
    "codewordV2"
})
public class ArrayOfCodeword {

    @XmlElement(name = "CodewordV2", nillable = true)
    protected List<Codeword> codewordV2;

    /**
     * Gets the value of the codewordV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codewordV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodewordV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Codeword }
     * 
     * 
     */
    public List<Codeword> getCodewordV2() {
        if (codewordV2 == null) {
            codewordV2 = new ArrayList<Codeword>();
        }
        return this.codewordV2;
    }

}
