package com.example.converter.converters;

import com.example.converter.models.HotelData;
import com.example.converter.models.objects.coah.ContentWrapper;
import org.springframework.core.convert.converter.Converter;

public class ContentWrapperToHotelDataConverter implements Converter<ContentWrapper, HotelData> {

    @Override
    public HotelData convert(final ContentWrapper source) {
        return HotelData.newBuilder()
            .name(source.getContent().getHotel().getName())
            .hotel(source.getContent().getHotel())
            .build();
    }
}
