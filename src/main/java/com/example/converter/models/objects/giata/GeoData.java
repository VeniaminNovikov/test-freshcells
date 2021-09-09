package com.example.converter.models.objects.giata;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoData implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer giataId;
    private Double latitude;
    private Double longitude;
    private Integer accuracy;

    public GeoData() {
        // empty
    }

    private GeoData(final Builder builder) {
        this.giataId = builder.giataId;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.accuracy = builder.accuracy;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final GeoData copy) {
        Builder builder = new Builder();
        builder.giataId = copy.getGiataId();
        builder.latitude = copy.getLatitude();
        builder.longitude = copy.getLongitude();
        builder.accuracy = copy.getAccuracy();
        return builder;
    }

    @JsonGetter(value = "GiataID")
    public Integer getGiataId() {
        return this.giataId;
    }

    @JsonGetter(value = "Latitude")
    public Double getLatitude() {
        return this.latitude;
    }

    @JsonGetter(value = "Longitude")
    public Double getLongitude() {
        return this.longitude;
    }

    @JsonGetter(value = "Accuracy")
    public Integer getAccuracy() {
        return this.accuracy;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoData)) return false;
        final GeoData geoData = (GeoData) o;
        return Objects.equals(this.giataId, geoData.giataId)
            && Objects.equals(this.latitude, geoData.latitude)
            && Objects.equals(this.longitude, geoData.longitude)
            && Objects.equals(this.accuracy, geoData.accuracy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.giataId, this.latitude, this.longitude, this.accuracy);
    }

    @Override
    public String toString() {
        return "GeoData{" +
            "giataId=" + this.giataId +
            ", latitude=" + this.latitude +
            ", longitude=" + this.longitude +
            ", accuracy=" + this.accuracy +
            '}';
    }

    public static final class Builder {
        private Integer giataId;
        private Double latitude;
        private Double longitude;
        private Integer accuracy;

        private Builder() {
        }

        public Builder giataId(final Integer val) {
            this.giataId = val;
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

        public Builder accuracy(final Integer val) {
            this.accuracy = val;
            return this;
        }

        public GeoData build() {
            return new GeoData(this);
        }
    }
}
