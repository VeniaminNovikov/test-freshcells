
package com.example.converter.models.objects.xml.coah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hotelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hotelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giata_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{}addressType"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="update_timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="region_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="texts" type="{}textsType"/>
 *         &lt;element name="usps" type="{}uspsType"/>
 *         &lt;element name="additionalTexts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="images" type="{}imagesType"/>
 *         &lt;element name="videos" type="{}videosType"/>
 *         &lt;element name="attributes" type="{}attributesType"/>
 *         &lt;element name="ratings" type="{}ratingsType"/>
 *         &lt;element name="hotelAwards" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelType", propOrder = {
    "giataId",
    "iff",
    "name",
    "latitude",
    "longitude",
    "address",
    "phone",
    "email",
    "url",
    "updateTimestamp",
    "category",
    "regionCode",
    "countryName",
    "texts",
    "usps",
    "additionalTexts",
    "images",
    "videos",
    "attributes",
    "ratings",
    "hotelAwards"
})
public class HotelType {

    @XmlElement(name = "giata_id", required = true)
    protected String giataId;
    @XmlElement(required = true)
    protected String iff;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String latitude;
    @XmlElement(required = true)
    protected String longitude;
    @XmlElement(required = true)
    protected AddressType address;
    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(name = "update_timestamp", required = true)
    protected String updateTimestamp;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(name = "region_code", required = true)
    protected String regionCode;
    @XmlElement(name = "country_name", required = true)
    protected String countryName;
    @XmlElement(required = true)
    protected TextsType texts;
    @XmlElement(required = true)
    protected UspsType usps;
    @XmlElement(required = true)
    protected String additionalTexts;
    @XmlElement(required = true)
    protected ImagesType images;
    @XmlElement(required = true)
    protected VideosType videos;
    @XmlElement(required = true)
    protected AttributesType attributes;
    @XmlElement(required = true)
    protected RatingsType ratings;
    @XmlElement(required = true)
    protected String hotelAwards;

    /**
     * Gets the value of the giataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiataId() {
        return giataId;
    }

    /**
     * Sets the value of the giataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiataId(String value) {
        this.giataId = value;
    }

    /**
     * Gets the value of the iff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIff() {
        return iff;
    }

    /**
     * Sets the value of the iff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIff(String value) {
        this.iff = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the updateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * Sets the value of the updateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTimestamp(String value) {
        this.updateTimestamp = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the texts property.
     * 
     * @return
     *     possible object is
     *     {@link TextsType }
     *     
     */
    public TextsType getTexts() {
        return texts;
    }

    /**
     * Sets the value of the texts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextsType }
     *     
     */
    public void setTexts(TextsType value) {
        this.texts = value;
    }

    /**
     * Gets the value of the usps property.
     * 
     * @return
     *     possible object is
     *     {@link UspsType }
     *     
     */
    public UspsType getUsps() {
        return usps;
    }

    /**
     * Sets the value of the usps property.
     * 
     * @param value
     *     allowed object is
     *     {@link UspsType }
     *     
     */
    public void setUsps(UspsType value) {
        this.usps = value;
    }

    /**
     * Gets the value of the additionalTexts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTexts() {
        return additionalTexts;
    }

    /**
     * Sets the value of the additionalTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTexts(String value) {
        this.additionalTexts = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ImagesType }
     *     
     */
    public ImagesType getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagesType }
     *     
     */
    public void setImages(ImagesType value) {
        this.images = value;
    }

    /**
     * Gets the value of the videos property.
     * 
     * @return
     *     possible object is
     *     {@link VideosType }
     *     
     */
    public VideosType getVideos() {
        return videos;
    }

    /**
     * Sets the value of the videos property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideosType }
     *     
     */
    public void setVideos(VideosType value) {
        this.videos = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesType }
     *     
     */
    public AttributesType getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType }
     *     
     */
    public void setAttributes(AttributesType value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the ratings property.
     * 
     * @return
     *     possible object is
     *     {@link RatingsType }
     *     
     */
    public RatingsType getRatings() {
        return ratings;
    }

    /**
     * Sets the value of the ratings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingsType }
     *     
     */
    public void setRatings(RatingsType value) {
        this.ratings = value;
    }

    /**
     * Gets the value of the hotelAwards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelAwards() {
        return hotelAwards;
    }

    /**
     * Sets the value of the hotelAwards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelAwards(String value) {
        this.hotelAwards = value;
    }

}
