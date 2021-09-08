
package com.example.converter.models.objects.xml.coah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locationRatingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationRatingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overall" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="single" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="couple" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="friends" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beach" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wintersport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationRatingType", propOrder = {
    "overall",
    "single",
    "couple",
    "family",
    "friends",
    "beach",
    "wintersport",
    "other"
})
public class LocationRatingType {

    @XmlElement(required = true)
    protected String overall;
    @XmlElement(required = true)
    protected String single;
    @XmlElement(required = true)
    protected String couple;
    @XmlElement(required = true)
    protected String family;
    @XmlElement(required = true)
    protected String friends;
    @XmlElement(required = true)
    protected String beach;
    @XmlElement(required = true)
    protected String wintersport;
    @XmlElement(required = true)
    protected String other;

    /**
     * Gets the value of the overall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverall() {
        return overall;
    }

    /**
     * Sets the value of the overall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverall(String value) {
        this.overall = value;
    }

    /**
     * Gets the value of the single property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingle() {
        return single;
    }

    /**
     * Sets the value of the single property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingle(String value) {
        this.single = value;
    }

    /**
     * Gets the value of the couple property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouple() {
        return couple;
    }

    /**
     * Sets the value of the couple property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouple(String value) {
        this.couple = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Gets the value of the friends property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriends() {
        return friends;
    }

    /**
     * Sets the value of the friends property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriends(String value) {
        this.friends = value;
    }

    /**
     * Gets the value of the beach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeach() {
        return beach;
    }

    /**
     * Sets the value of the beach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeach(String value) {
        this.beach = value;
    }

    /**
     * Gets the value of the wintersport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWintersport() {
        return wintersport;
    }

    /**
     * Sets the value of the wintersport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWintersport(String value) {
        this.wintersport = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

}
