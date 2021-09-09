package com.example.converter.models;

import com.example.converter.models.objects.json.coah.Hotel;
import com.example.converter.models.objects.json.giata.Data;

import java.io.Serializable;

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
