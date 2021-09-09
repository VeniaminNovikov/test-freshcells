package com.example.converter.converters;

import com.example.converter.models.HotelData;
import com.example.converter.models.objects.coah.Content;
import org.springframework.core.convert.converter.Converter;

public class ContentToHotelDataConverter implements Converter<Content, HotelData> {

    @Override
    public HotelData convert(final Content source) {
        return HotelData.newBuilder()
            .name(source.getHotel().getName())
            .hotel(source.getHotel())
            .build();
    }
}
