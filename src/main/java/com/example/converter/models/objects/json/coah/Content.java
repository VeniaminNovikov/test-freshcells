package com.example.converter.models.objects.json.coah;

import java.io.Serializable;
import java.util.Objects;

public class Content implements Serializable {
    private static final long serialVersionUID = 1L;

    private Hotel hotel;

    public Content() {
        // empty
    }

    private Content(final Builder builder) {
        this.hotel = builder.hotel;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final Content copy) {
        Builder builder = new Builder();
        builder.hotel = copy.getHotel();
        return builder;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Content)) return false;
        final Content content = (Content) o;
        return Objects.equals(this.hotel, content.hotel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.hotel);
    }

    @Override
    public String toString() {
        return "Content{" +
            "hotel=" + (this.hotel != null ? this.hotel.getName() : "") +
            '}';
    }

    public static final class Builder {
        private Hotel hotel;

        private Builder() {
        }

        public Builder hotel(final Hotel val) {
            this.hotel = val;
            return this;
        }

        public Content build() {
            return new Content(this);
        }
    }
}
