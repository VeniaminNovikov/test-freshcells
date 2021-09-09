package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

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
        this.zip = builder.zip;
        this.city = builder.city;
        this.country = builder.country;
        this.formatted = builder.formatted;
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        final Address address = (Address) o;
        return Objects.equals(this.zip, address.zip)
            && Objects.equals(this.city, address.city)
            && Objects.equals(this.country, address.country)
            && Objects.equals(this.formatted, address.formatted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.zip, this.city, this.country, this.formatted);
    }

    @Override
    public String toString() {
        return "Address{" +
            "zip='" + this.zip + '\'' +
            ", city='" + this.city + '\'' +
            ", country='" + this.country + '\'' +
            ", formatted=" + this.formatted +
            '}';
    }

    public static final class Builder {
        private String zip;
        private String city;
        private String country;
        private AddressFormatted formatted;

        private Builder() {
        }

        public Builder zip(final String val) {
            this.zip = val;
            return this;
        }

        public Builder city(final String val) {
            this.city = val;
            return this;
        }

        public Builder country(final String val) {
            this.country = val;
            return this;
        }

        public Builder formatted(final AddressFormatted val) {
            this.formatted = val;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
