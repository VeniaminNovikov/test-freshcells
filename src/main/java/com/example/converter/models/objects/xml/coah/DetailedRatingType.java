
package com.example.converter.models.objects.xml.coah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailedRatingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailedRatingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageRating" type="{}averageRatingType"/>
 *         &lt;element name="hotelRating" type="{}hotelRatingType"/>
 *         &lt;element name="locationRating" type="{}locationRatingType"/>
 *         &lt;element name="serviceRating" type="{}serviceRatingType"/>
 *         &lt;element name="foodRating" type="{}foodRatingType"/>
 *         &lt;element name="roomRating" type="{}roomRatingType"/>
 *         &lt;element name="sportRating" type="{}sportRatingType"/>
 *         &lt;element name="recommendation" type="{}recommendationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailedRatingType", propOrder = {
    "averageRating",
    "hotelRating",
    "locationRating",
    "serviceRating",
    "foodRating",
    "roomRating",
    "sportRating",
    "recommendation"
})
public class DetailedRatingType {

    @XmlElement(required = true)
    protected AverageRatingType averageRating;
    @XmlElement(required = true)
    protected HotelRatingType hotelRating;
    @XmlElement(required = true)
    protected LocationRatingType locationRating;
    @XmlElement(required = true)
    protected ServiceRatingType serviceRating;
    @XmlElement(required = true)
    protected FoodRatingType foodRating;
    @XmlElement(required = true)
    protected RoomRatingType roomRating;
    @XmlElement(required = true)
    protected SportRatingType sportRating;
    @XmlElement(required = true)
    protected RecommendationType recommendation;

    /**
     * Gets the value of the averageRating property.
     * 
     * @return
     *     possible object is
     *     {@link AverageRatingType }
     *     
     */
    public AverageRatingType getAverageRating() {
        return averageRating;
    }

    /**
     * Sets the value of the averageRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link AverageRatingType }
     *     
     */
    public void setAverageRating(AverageRatingType value) {
        this.averageRating = value;
    }

    /**
     * Gets the value of the hotelRating property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRatingType }
     *     
     */
    public HotelRatingType getHotelRating() {
        return hotelRating;
    }

    /**
     * Sets the value of the hotelRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRatingType }
     *     
     */
    public void setHotelRating(HotelRatingType value) {
        this.hotelRating = value;
    }

    /**
     * Gets the value of the locationRating property.
     * 
     * @return
     *     possible object is
     *     {@link LocationRatingType }
     *     
     */
    public LocationRatingType getLocationRating() {
        return locationRating;
    }

    /**
     * Sets the value of the locationRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationRatingType }
     *     
     */
    public void setLocationRating(LocationRatingType value) {
        this.locationRating = value;
    }

    /**
     * Gets the value of the serviceRating property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRatingType }
     *     
     */
    public ServiceRatingType getServiceRating() {
        return serviceRating;
    }

    /**
     * Sets the value of the serviceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRatingType }
     *     
     */
    public void setServiceRating(ServiceRatingType value) {
        this.serviceRating = value;
    }

    /**
     * Gets the value of the foodRating property.
     * 
     * @return
     *     possible object is
     *     {@link FoodRatingType }
     *     
     */
    public FoodRatingType getFoodRating() {
        return foodRating;
    }

    /**
     * Sets the value of the foodRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodRatingType }
     *     
     */
    public void setFoodRating(FoodRatingType value) {
        this.foodRating = value;
    }

    /**
     * Gets the value of the roomRating property.
     * 
     * @return
     *     possible object is
     *     {@link RoomRatingType }
     *     
     */
    public RoomRatingType getRoomRating() {
        return roomRating;
    }

    /**
     * Sets the value of the roomRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRatingType }
     *     
     */
    public void setRoomRating(RoomRatingType value) {
        this.roomRating = value;
    }

    /**
     * Gets the value of the sportRating property.
     * 
     * @return
     *     possible object is
     *     {@link SportRatingType }
     *     
     */
    public SportRatingType getSportRating() {
        return sportRating;
    }

    /**
     * Sets the value of the sportRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link SportRatingType }
     *     
     */
    public void setSportRating(SportRatingType value) {
        this.sportRating = value;
    }

    /**
     * Gets the value of the recommendation property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendationType }
     *     
     */
    public RecommendationType getRecommendation() {
        return recommendation;
    }

    /**
     * Sets the value of the recommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationType }
     *     
     */
    public void setRecommendation(RecommendationType value) {
        this.recommendation = value;
    }

}
