package com.example.converter.converters;

import com.example.converter.models.HotelData;
import com.example.converter.models.objects.json.giata.Result;
import org.springframework.core.convert.converter.Converter;

public class ResultToHotelDataConverter implements Converter<Result, HotelData> {

    @Override
    public HotelData convert(final Result source) {
        return HotelData.newBuilder()
            .name(source.getData().getHotelName())
            .data(source.getData())
            .build();
    }
}
