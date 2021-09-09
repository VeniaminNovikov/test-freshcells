package com.example.converter.models;

import com.example.converter.models.objects.coah.Hotel;
import com.example.converter.models.objects.giata.Data;

import java.io.Serializable;
import java.util.Objects;

public class HotelData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Hotel hotel;
    private Data data;

    public HotelData() {
        // empty
    }

    private HotelData(final Builder builder) {
        this.name = builder.name;
        this.hotel = builder.hotel;
        this.data = builder.data;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(final HotelData copy) {
        final Builder builder = new Builder();
        builder.name = copy.getName();
        builder.hotel = copy.getHotel();
        builder.data = copy.getData();

        return builder;
    }

    public String getName() {
        return this.name;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public Data getData() {
        return this.data;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelData)) return false;
        final HotelData hotelData = (HotelData) o;
        return Objects.equals(this.name, hotelData.name)
            && Objects.equals(this.hotel, hotelData.hotel)
            && Objects.equals(this.data, hotelData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.hotel, this.data);
    }

    @Override
    public String toString() {
        return "HotelData{" +
            "name='" + this.name + '\'' +
            ", hotel=" + this.hotel +
            ", data=" + this.data +
            '}';
    }

    public static final class Builder {
        private String name;
        private Hotel hotel;
        private Data data;

        private Builder() {
        }

        public Builder name(final String val) {
            this.name = val;
            return this;
        }

        public Builder hotel(final Hotel val) {
            this.hotel = val;
            return this;
        }

        public Builder data(final Data val) {
            this.data = val;
            return this;
        }

        public HotelData build() {
            return new HotelData(this);
        }
    }
}
