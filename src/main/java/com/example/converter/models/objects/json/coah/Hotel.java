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
    private Images images;
    private Videos videos;
    private Attributes attributes;
    private Ratings ratings;
    private List<String> additionalTexts = new LinkedList<>();
    private List<Object> hotelAwards = new LinkedList<>();

    public Hotel() {
        // empty
    }

    private Hotel(final Builder builder) {
        this.giataId = builder.giataId;
        this.iff = builder.iff;
        this.name = builder.name;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.phone = builder.phone;
        this.email = builder.email;
        this.url = builder.url;
        this.updateTimestamp = builder.updateTimestamp;
        this.category = builder.category;
        this.regionCode = builder.regionCode;
        this.countryName = builder.countryName;
        this.address = builder.address;
        this.texts = builder.texts;
        this.usps = builder.usps;
        this.images = builder.images;
        this.videos = builder.videos;
        this.attributes = builder.attributes;
        this.ratings = builder.ratings;
        this.additionalTexts = builder.additionalTexts;
        this.hotelAwards = builder.hotelAwards;
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
        builder.phone = copy.getPhone();
        builder.email = copy.getEmail();
        builder.url = copy.getUrl();
        builder.updateTimestamp = copy.getUpdateTimestamp();
        builder.category = copy.getCategory();
        builder.regionCode = copy.getRegionCode();
        builder.countryName = copy.getCountryName();
        builder.address = copy.getAddress();
        builder.texts = copy.getTexts();
        builder.usps = copy.getUsps();
        builder.images = copy.getImages();
        builder.videos = copy.getVideos();
        builder.attributes = copy.getAttributes();
        builder.ratings = copy.getRatings();
        builder.additionalTexts = copy.getAdditionalTexts();
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

    public List<String> getAdditionalTexts() {
        return this.additionalTexts;
    }

    public List<Object> getHotelAwards() {
        return this.hotelAwards;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Hotel)) return false;
        final Hotel hotel = (Hotel) o;
        return Objects.equals(this.giataId, hotel.giataId)
            && Objects.equals(this.iff, hotel.iff)
            && Objects.equals(this.name, hotel.name)
            && Objects.equals(this.latitude, hotel.latitude)
            && Objects.equals(this.longitude, hotel.longitude)
            && Objects.equals(this.address, hotel.address)
            && Objects.equals(this.phone, hotel.phone)
            && Objects.equals(this.email, hotel.email)
            && Objects.equals(this.url, hotel.url)
            && Objects.equals(this.updateTimestamp, hotel.updateTimestamp)
            && Objects.equals(this.category, hotel.category)
            && Objects.equals(this.regionCode, hotel.regionCode)
            && Objects.equals(this.countryName, hotel.countryName)
            && Objects.equals(this.texts, hotel.texts)
            && Objects.equals(this.usps, hotel.usps)
            && Objects.equals(this.additionalTexts, hotel.additionalTexts)
            && Objects.equals(this.images, hotel.images)
            && Objects.equals(this.videos, hotel.videos)
            && Objects.equals(this.attributes, hotel.attributes)
            && Objects.equals(this.ratings, hotel.ratings)
            && Objects.equals(this.hotelAwards, hotel.hotelAwards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.giataId, this.iff, this.name, this.latitude, this.longitude, this.address, this.phone, this.email,
            this.url, this.updateTimestamp, this.category, this.regionCode, this.countryName, this.texts, this.usps, this.additionalTexts,
            this.images, this.videos, this.attributes, this.ratings, this.hotelAwards);
    }

    @Override
    public String toString() {
        return "Hotel{" +
            "giataId=" + this.giataId +
            ", iff=" + this.iff +
            ", name='" + this.name + '\'' +
            ", latitude=" + this.latitude +
            ", longitude=" + this.longitude +
            ", address=" + this.address +
            ", phone='" + this.phone + '\'' +
            ", email='" + this.email + '\'' +
            ", url='" + this.url + '\'' +
            ", updateTimestamp='" + this.updateTimestamp + '\'' +
            ", category='" + this.category + '\'' +
            ", regionCode='" + this.regionCode + '\'' +
            ", countryName='" + this.countryName + '\'' +
            ", texts=" + this.texts +
            ", usps=" + this.usps +
            ", additionalTexts=" + this.additionalTexts +
            ", images=" + this.images +
            ", videos=" + this.videos +
            ", attributes=" + this.attributes +
            ", ratings=" + this.ratings +
            ", hotelAwards=" + this.hotelAwards +
            '}';
    }

    public static final class Builder {
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
        private Images images;
        private Videos videos;
        private Attributes attributes;
        private Ratings ratings;
        private List<String> additionalTexts;
        private List<Object> hotelAwards;

        private Builder() {
        }

        public Builder giataId(final Integer val) {
            this.giataId = val;
            return this;
        }

        public Builder iff(final Integer val) {
            this.iff = val;
            return this;
        }

        public Builder name(final String val) {
            this.name = val;
            return this;
        }

        public Builder latitude(final Double val) {
            this.latitude = val;
            return this;
        }

        public Builder longitude(final Double val) {
            this.longitude = val;
            return this;
        }

        public Builder phone(final String val) {
            this.phone = val;
            return this;
        }

        public Builder email(final String val) {
            this.email = val;
            return this;
        }

        public Builder url(final String val) {
            this.url = val;
            return this;
        }

        public Builder updateTimestamp(final String val) {
            this.updateTimestamp = val;
            return this;
        }

        public Builder category(final String val) {
            this.category = val;
            return this;
        }

        public Builder regionCode(final String val) {
            this.regionCode = val;
            return this;
        }

        public Builder countryName(final String val) {
            this.countryName = val;
            return this;
        }

        public Builder address(final Address val) {
            this.address = val;
            return this;
        }

        public Builder texts(final Texts val) {
            this.texts = val;
            return this;
        }

        public Builder usps(final Usps val) {
            this.usps = val;
            return this;
        }

        public Builder images(final Images val) {
            this.images = val;
            return this;
        }

        public Builder videos(final Videos val) {
            this.videos = val;
            return this;
        }

        public Builder attributes(final Attributes val) {
            this.attributes = val;
            return this;
        }

        public Builder ratings(final Ratings val) {
            this.ratings = val;
            return this;
        }

        public Builder additionalTexts(final List<String> val) {
            this.additionalTexts = val;
            return this;
        }

        public Builder hotelAwards(final List<Object> val) {
            this.hotelAwards = val;
            return this;
        }

        public Hotel build() {
            return new Hotel(this);
        }
    }
}
