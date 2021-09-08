package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    private String zip;
    private String city;
    private String country;
    private AddressFormatted formatted;

    public Address() {
        // empty
    }

    private Address(final Builder builder) {
        zip = builder.zip;
        city = builder.city;
        country = builder.country;
        formatted = builder.formatted;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Address copy) {
        Builder builder = new Builder();
        builder.zip = copy.getZip();
        builder.city = copy.getCity();
        builder.country = copy.getCountry();
        builder.formatted = copy.getFormatted();
        return builder;
    }

    public String getZip() {
        return this.zip;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public AddressFormatted getFormatted() {
        return this.formatted;
    }

    public static final class Builder {
        private String zip;
        private String city;
        private String country;
        private AddressFormatted formatted;

        private Builder() {
        }

        public Builder zip(final String val) {
            zip = val;
            return this;
        }

        public Builder city(final String val) {
            city = val;
            return this;
        }

        public Builder country(final String val) {
            country = val;
            return this;
        }

        public Builder formatted(final AddressFormatted val) {
            formatted = val;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
