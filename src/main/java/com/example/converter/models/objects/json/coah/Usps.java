
package com.example.converter.models.objects.json.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Usps implements Serializable {
    private static final long serialVersionUID = 1L;

    protected HotelAttributes hotelAttributes;

    public Usps() {
        // empty
    }

    private Usps(final Builder builder) {
        hotelAttributes = builder.hotelAttributes;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Usps copy) {
        Builder builder = new Builder();
        builder.hotelAttributes = copy.getHotelAttributes();
        return builder;
    }

    public HotelAttributes getHotelAttributes() {
        return this.hotelAttributes;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Usps)) return false;
        final Usps usps = (Usps) o;
        return Objects.equals(hotelAttributes, usps.hotelAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelAttributes);
    }

    @Override
    public String toString() {
        return "Usps{" +
            "hotelAttributes=" + hotelAttributes +
            '}';
    }

    public static final class Builder {
        private HotelAttributes hotelAttributes;

        private Builder() {
        }

        public Builder hotelAttributes(final HotelAttributes val) {
            hotelAttributes = val;
            return this;
        }

        public Usps build() {
            return new Usps(this);
        }
    }
}
