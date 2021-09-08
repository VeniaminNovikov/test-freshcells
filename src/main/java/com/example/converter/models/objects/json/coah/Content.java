package com.example.converter.models.objects.json.coah;

import java.io.Serializable;

public class Content implements Serializable {
    private static final long serialVersionUID = 1L;

    private Hotel hotel;

    public Content() {
        // empty
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    @Override
    public String toString() {
        return "Content{" +
            "hotel=" + (hotel != null ? hotel.getName() : "") +
            '}';
    }
}
