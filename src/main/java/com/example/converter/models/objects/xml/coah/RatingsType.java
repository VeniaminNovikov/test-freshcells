
package com.example.converter.models.objects.xml.coah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ratingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ratingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hc_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recommendation_rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reviews" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detailedRating" type="{}detailedRatingType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ratingsType", propOrder = {
    "hcId",
    "recommendationRate",
    "rating",
    "reviews",
    "url",
    "detailedRating"
})
public class RatingsType {

    @XmlElement(name = "hc_id", required = true)
    protected String hcId;
    @XmlElement(name = "recommendation_rate", required = true)
    protected String recommendationRate;
    @XmlElement(required = true)
    protected String rating;
    @XmlElement(required = true)
    protected String reviews;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected DetailedRatingType detailedRating;
    @XmlAttribute(name = "source")
    protected String source;

    /**
     * Gets the value of the hcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcId() {
        return hcId;
    }

    /**
     * Sets the value of the hcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcId(String value) {
        this.hcId = value;
    }

    /**
     * Gets the value of the recommendationRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationRate() {
        return recommendationRate;
    }

    /**
     * Sets the value of the recommendationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationRate(String value) {
        this.recommendationRate = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the reviews property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviews() {
        return reviews;
    }

    /**
     * Sets the value of the reviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviews(String value) {
        this.reviews = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the detailedRating property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedRatingType }
     *     
     */
    public DetailedRatingType getDetailedRating() {
        return detailedRating;
    }

    /**
     * Sets the value of the detailedRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedRatingType }
     *     
     */
    public void setDetailedRating(DetailedRatingType value) {
        this.detailedRating = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
