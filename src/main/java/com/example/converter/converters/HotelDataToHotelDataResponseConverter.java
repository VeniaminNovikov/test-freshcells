package com.example.converter.converters;

import com.example.converter.models.HotelData;
import com.example.converter.models.responses.HotelDataResponse;
import org.springframework.core.convert.converter.Converter;

public class HotelDataToHotelDataResponseConverter implements Converter<HotelData, HotelDataResponse> {

    @Override
    public HotelDataResponse convert(final HotelData source) {
        return HotelDataResponse.newBuilder()
            .name(source.getName())
            .hotel(source.getHotel())
            .data(source.getData())
            .build();
    }
}
