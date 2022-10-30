
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentBlocks" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfContentBlock" minOccurs="0"/&gt;
 *         &lt;element name="FromName" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}string-1-2147483647"/&gt;
 *         &lt;element name="ReplyToEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BCCEmails" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}ArrayOfBccEmail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailConfig", propOrder = {
    "contentBlocks",
    "fromName",
    "replyToEmail",
    "bccEmails"
})
public class EmailConfig {

    @XmlElement(name = "ContentBlocks")
    protected ArrayOfContentBlock contentBlocks;
    @XmlElement(name = "FromName", required = true)
    protected String fromName;
    @XmlElement(name = "ReplyToEmail")
    protected String replyToEmail;
    @XmlElement(name = "BCCEmails")
    protected ArrayOfBccEmail bccEmails;

    /**
     * Gets the value of the contentBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContentBlock }
     *     
     */
    public ArrayOfContentBlock getContentBlocks() {
        return contentBlocks;
    }

    /**
     * Sets the value of the contentBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContentBlock }
     *     
     */
    public void setContentBlocks(ArrayOfContentBlock value) {
        this.contentBlocks = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the replyToEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToEmail() {
        return replyToEmail;
    }

    /**
     * Sets the value of the replyToEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToEmail(String value) {
        this.replyToEmail = value;
    }

    /**
     * Gets the value of the bccEmails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBccEmail }
     *     
     */
    public ArrayOfBccEmail getBCCEmails() {
        return bccEmails;
    }

    /**
     * Sets the value of the bccEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBccEmail }
     *     
     */
    public void setBCCEmails(ArrayOfBccEmail value) {
        this.bccEmails = value;
    }

}
