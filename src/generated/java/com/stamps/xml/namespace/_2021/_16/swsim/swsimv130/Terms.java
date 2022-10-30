
package com.stamps.xml.namespace._2021._16.swsim.swsimv130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Terms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Terms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TermsGP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TermsAR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TermsSL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TermsDX" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TermsFX" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TermsUPS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TermsCM" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TermsCanadaPost" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TermsParcelGuard" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terms", propOrder = {
    "termsGP",
    "termsAR",
    "termsSL",
    "termsDX",
    "termsFX",
    "termsUPS",
    "termsCM",
    "termsCanadaPost",
    "termsParcelGuard"
})
public class Terms {

    @XmlElement(name = "TermsGP")
    protected boolean termsGP;
    @XmlElement(name = "TermsAR")
    protected boolean termsAR;
    @XmlElement(name = "TermsSL")
    protected boolean termsSL;
    @XmlElement(name = "TermsDX")
    protected boolean termsDX;
    @XmlElement(name = "TermsFX")
    protected boolean termsFX;
    @XmlElement(name = "TermsUPS")
    protected boolean termsUPS;
    @XmlElement(name = "TermsCM")
    protected boolean termsCM;
    @XmlElement(name = "TermsCanadaPost")
    protected boolean termsCanadaPost;
    @XmlElement(name = "TermsParcelGuard")
    protected boolean termsParcelGuard;

    /**
     * Gets the value of the termsGP property.
     * 
     */
    public boolean isTermsGP() {
        return termsGP;
    }

    /**
     * Sets the value of the termsGP property.
     * 
     */
    public void setTermsGP(boolean value) {
        this.termsGP = value;
    }

    /**
     * Gets the value of the termsAR property.
     * 
     */
    public boolean isTermsAR() {
        return termsAR;
    }

    /**
     * Sets the value of the termsAR property.
     * 
     */
    public void setTermsAR(boolean value) {
        this.termsAR = value;
    }

    /**
     * Gets the value of the termsSL property.
     * 
     */
    public boolean isTermsSL() {
        return termsSL;
    }

    /**
     * Sets the value of the termsSL property.
     * 
     */
    public void setTermsSL(boolean value) {
        this.termsSL = value;
    }

    /**
     * Gets the value of the termsDX property.
     * 
     */
    public boolean isTermsDX() {
        return termsDX;
    }

    /**
     * Sets the value of the termsDX property.
     * 
     */
    public void setTermsDX(boolean value) {
        this.termsDX = value;
    }

    /**
     * Gets the value of the termsFX property.
     * 
     */
    public boolean isTermsFX() {
        return termsFX;
    }

    /**
     * Sets the value of the termsFX property.
     * 
     */
    public void setTermsFX(boolean value) {
        this.termsFX = value;
    }

    /**
     * Gets the value of the termsUPS property.
     * 
     */
    public boolean isTermsUPS() {
        return termsUPS;
    }

    /**
     * Sets the value of the termsUPS property.
     * 
     */
    public void setTermsUPS(boolean value) {
        this.termsUPS = value;
    }

    /**
     * Gets the value of the termsCM property.
     * 
     */
    public boolean isTermsCM() {
        return termsCM;
    }

    /**
     * Sets the value of the termsCM property.
     * 
     */
    public void setTermsCM(boolean value) {
        this.termsCM = value;
    }

    /**
     * Gets the value of the termsCanadaPost property.
     * 
     */
    public boolean isTermsCanadaPost() {
        return termsCanadaPost;
    }

    /**
     * Sets the value of the termsCanadaPost property.
     * 
     */
    public void setTermsCanadaPost(boolean value) {
        this.termsCanadaPost = value;
    }

    /**
     * Gets the value of the termsParcelGuard property.
     * 
     */
    public boolean isTermsParcelGuard() {
        return termsParcelGuard;
    }

    /**
     * Sets the value of the termsParcelGuard property.
     * 
     */
    public void setTermsParcelGuard(boolean value) {
        this.termsParcelGuard = value;
    }

}
