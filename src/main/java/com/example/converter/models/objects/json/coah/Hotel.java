package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer giataId;
    private Integer iff;
    private String name;
    private Double latitude;
    private Double longitude;
    private String phone;
    private String email;
    private String url;
    private String updateTimestamp;
    private String category;
    private String regionCode;
    private String countryName;

    private Address address;
    private Texts texts;
    private Usps usps;
    private List<String> additionalTexts = new LinkedList<>();
    private Images images;
    private Videos videos;
    private Attributes attributes;
    private Ratings ratings;
    private final List<Object> hotelAwards = new LinkedList<>();

    /*
    private final Map<String, Object> texts = new LinkedHashMap<>();
    private final Map<String, Object> usps = new LinkedHashMap<>();
    private final List<String> additionalTexts = new LinkedList<>();
    private final Map<String, Object> videos = new LinkedHashMap<>();
    private final Map<String, Object> attributes = new LinkedHashMap<>();
    private final Map<String, Object> ratings = new LinkedHashMap<>();
//    private Ratings ratings;
*/

//    private final List<Texts> texts = new LinkedList<>();

    public Hotel() {
        // empty
    }

    private Hotel(final Builder builder) {
        giataId = builder.giataId;
        iff = builder.iff;
        name = builder.name;
        latitude = builder.latitude;
        longitude = builder.longitude;
        address = builder.address;
        phone = builder.phone;
        email = builder.email;
        url = builder.url;
        updateTimestamp = builder.updateTimestamp;
        category = builder.category;
        regionCode = builder.regionCode;
        countryName = builder.countryName;
        texts = builder.texts;
        usps = builder.usps;
        additionalTexts = builder.additionalTexts;
        images = builder.images;
        videos = builder.videos;
        attributes = builder.attributes;
        ratings = builder.ratings;
        hotelAwards.addAll(builder.hotelAwards);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Hotel copy) {
        Builder builder = new Builder();
        builder.giataId = copy.getGiataId();
        builder.iff = copy.getIff();
        builder.name = copy.getName();
        builder.latitude = copy.getLatitude();
        builder.longitude = copy.getLongitude();
        builder.address = copy.getAddress();
        builder.phone = copy.getPhone();
        builder.email = copy.getEmail();
        builder.url = copy.getUrl();
        builder.updateTimestamp = copy.getUpdateTimestamp();
        builder.category = copy.getCategory();
        builder.regionCode = copy.getRegionCode();
        builder.countryName = copy.getCountryName();
        builder.texts = copy.getTexts();
        builder.usps = copy.getUsps();
        builder.additionalTexts = copy.getAdditionalTexts();
        builder.images = copy.getImages();
        builder.videos = copy.getVideos();
        builder.attributes = copy.getAttributes();
        builder.ratings = copy.getRatings();
        builder.hotelAwards = copy.getHotelAwards();
        return builder;
    }

    @JsonGetter(value = "giata_id")
    public Integer getGiataId() {
        return this.giataId;
    }

    public Integer getIff() {
        return this.iff;
    }

    public String getName() {
        return this.name;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Address getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUrl() {
        return this.url;
    }

    @JsonGetter(value = "update_timestamp")
    public String getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public String getCategory() {
        return this.category;
    }

    @JsonGetter(value = "region_code")
    public String getRegionCode() {
        return this.regionCode;
    }

    @JsonGetter(value = "country_name")
    public String getCountryName() {
        return this.countryName;
    }

    public Texts getTexts() {
        return this.texts;
    }

    public Usps getUsps() {
        return this.usps;
    }

    public List<String> getAdditionalTexts() {
        return this.additionalTexts;
    }

    public Images getImages() {
        return this.images;
    }

    public Videos getVideos() {
        return this.videos;
    }

    public Attributes getAttributes() {
        return this.attributes;
    }

    public Ratings getRatings() {
        return this.ratings;
    }

    public List<Object> getHotelAwards() {
        return this.hotelAwards;
    }

    //    @JsonGetter(value = "texts")
//    public Map<String, Object> getTexts() {
//        return this.texts;
//    }
//
//    @JsonGetter(value = "usps")
//    public Map<String, Object> getUsps() {
//        return this.usps;
//    }
//
//    public List<String> getAdditionalTexts() {
//        return this.additionalTexts;
//    }
//
//    public Images getImages() {
//        return this.images;
//    }
//
//    @JsonGetter(value = "videos")
//    public Map<String, Object> getVideos() {
//        return this.videos;
//    }
//
//    @JacksonXmlProperty(isAttribute=true)
//    public Map<String, Object> getAttributes() {
//        return this.attributes;
//    }
//
//    @JacksonXmlProperty(isAttribute=true)
//    public Map<String, Object> getRatings() {
//        return this.ratings;
//    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Hotel)) return false;
        final Hotel hotel = (Hotel) o;
        return Objects.equals(giataId, hotel.giataId)
            && Objects.equals(iff, hotel.iff)
            && Objects.equals(name, hotel.name)
            && Objects.equals(latitude, hotel.latitude)
            && Objects.equals(longitude, hotel.longitude)
            && Objects.equals(address, hotel.address)
            && Objects.equals(phone, hotel.phone)
            && Objects.equals(email, hotel.email)
            && Objects.equals(url, hotel.url)
            && Objects.equals(updateTimestamp, hotel.updateTimestamp)
            && Objects.equals(category, hotel.category)
            && Objects.equals(regionCode, hotel.regionCode)
            && Objects.equals(countryName, hotel.countryName)
            && Objects.equals(texts, hotel.texts)
            && Objects.equals(usps, hotel.usps)
            && Objects.equals(additionalTexts, hotel.additionalTexts)
            && Objects.equals(images, hotel.images)
            && Objects.equals(videos, hotel.videos)
            && Objects.equals(attributes, hotel.attributes)
            && Objects.equals(ratings, hotel.ratings)
            && Objects.equals(hotelAwards, hotel.hotelAwards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(giataId, iff, name, latitude, longitude, address, phone, email, url, updateTimestamp,
            category, regionCode, countryName, texts, usps, additionalTexts, images, videos, attributes, ratings, hotelAwards);
    }

    @Override
    public String toString() {
        return "Hotel{" +
            "giataId=" + giataId +
            ", iff=" + iff +
            ", name='" + name + '\'' +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", address=" + address +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", url='" + url + '\'' +
            ", updateTimestamp='" + updateTimestamp + '\'' +
            ", category='" + category + '\'' +
            ", regionCode='" + regionCode + '\'' +
            ", countryName='" + countryName + '\'' +
            ", texts=" + texts +
            ", usps=" + usps +
            ", additionalTexts=" + additionalTexts +
            ", images=" + images +
            ", videos=" + videos +
            ", attributes=" + attributes +
            ", ratings=" + ratings +
            ", hotelAwards=" + hotelAwards +
            '}';
    }

    public static final class Builder {
        private Integer giataId;
        private Integer iff;
        private String name;
        private Double latitude;
        private Double longitude;
        private Address address;
        private String phone;
        private String email;
        private String url;
        private String updateTimestamp;
        private String category;
        private String regionCode;
        private String countryName;
        private Texts texts;
        private Usps usps;
        private List<String> additionalTexts;
        private Images images;
        private Videos videos;
        private Attributes attributes;
        private Ratings ratings;
        private List<Object> hotelAwards;

        private Builder() {
        }

        public Builder giataId(final Integer val) {
            giataId = val;
            return this;
        }

        public Builder iff(final Integer val) {
            iff = val;
            return this;
        }

        public Builder name(final String val) {
            name = val;
            return this;
        }

        public Builder latitude(final Double val) {
            latitude = val;
            return this;
        }

        public Builder longitude(final Double val) {
            longitude = val;
            return this;
        }

        public Builder address(final Address val) {
            address = val;
            return this;
        }

        public Builder phone(final String val) {
            phone = val;
            return this;
        }

        public Builder email(final String val) {
            email = val;
            return this;
        }

        public Builder url(final String val) {
            url = val;
            return this;
        }

        public Builder updateTimestamp(final String val) {
            updateTimestamp = val;
            return this;
        }

        public Builder category(final String val) {
            category = val;
            return this;
        }

        public Builder regionCode(final String val) {
            regionCode = val;
            return this;
        }

        public Builder countryName(final String val) {
            countryName = val;
            return this;
        }

        public Builder texts(final Texts val) {
            texts = val;
            return this;
        }

        public Builder usps(final Usps val) {
            usps = val;
            return this;
        }

        public Builder additionalTexts(final List<String> val) {
            additionalTexts = val;
            return this;
        }

        public Builder images(final Images val) {
            images = val;
            return this;
        }

        public Builder videos(final Videos val) {
            videos = val;
            return this;
        }

        public Builder attributes(final Attributes val) {
            attributes = val;
            return this;
        }

        public Builder ratings(final Ratings val) {
            ratings = val;
            return this;
        }

        public Builder hotelAwards(final List<Object> val) {
            hotelAwards = val;
            return this;
        }

        public Hotel build() {
            return new Hotel(this);
        }
    }
}
