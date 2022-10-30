
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authenticator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChargedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PendingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="WaitIntervalSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PurchaseStatus" type="{http://stamps.com/xml/namespace/2021/16/swsim/SwsimV130}PurchaseStatus"/&gt;
 *         &lt;element name="RejectionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authenticator",
    "transactionID",
    "chargedAmount",
    "pendingAmount",
    "waitIntervalSeconds",
    "purchaseStatus",
    "rejectionReason"
})
@XmlRootElement(name = "ResubmitPurchaseResponse")
public class ResubmitPurchaseResponse {

    @XmlElement(name = "Authenticator", required = true)
    protected String authenticator;
    @XmlElement(name = "TransactionID")
    protected int transactionID;
    @XmlElement(name = "ChargedAmount", required = true)
    protected BigDecimal chargedAmount;
    @XmlElement(name = "PendingAmount", required = true)
    protected BigDecimal pendingAmount;
    @XmlElement(name = "WaitIntervalSeconds")
    protected int waitIntervalSeconds;
    @XmlElement(name = "PurchaseStatus", required = true)
    @XmlSchemaType(name = "string")
    protected PurchaseStatus purchaseStatus;
    @XmlElement(name = "RejectionReason")
    protected String rejectionReason;

    /**
     * Gets the value of the authenticator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticator() {
        return authenticator;
    }

    /**
     * Sets the value of the authenticator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticator(String value) {
        this.authenticator = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     */
    public int getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     */
    public void setTransactionID(int value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the chargedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargedAmount() {
        return chargedAmount;
    }

    /**
     * Sets the value of the chargedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargedAmount(BigDecimal value) {
        this.chargedAmount = value;
    }

    /**
     * Gets the value of the pendingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPendingAmount() {
        return pendingAmount;
    }

    /**
     * Sets the value of the pendingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPendingAmount(BigDecimal value) {
        this.pendingAmount = value;
    }

    /**
     * Gets the value of the waitIntervalSeconds property.
     * 
     */
    public int getWaitIntervalSeconds() {
        return waitIntervalSeconds;
    }

    /**
     * Sets the value of the waitIntervalSeconds property.
     * 
     */
    public void setWaitIntervalSeconds(int value) {
        this.waitIntervalSeconds = value;
    }

    /**
     * Gets the value of the purchaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseStatus }
     *     
     */
    public PurchaseStatus getPurchaseStatus() {
        return purchaseStatus;
    }

    /**
     * Sets the value of the purchaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseStatus }
     *     
     */
    public void setPurchaseStatus(PurchaseStatus value) {
        this.purchaseStatus = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReason(String value) {
        this.rejectionReason = value;
    }

}
