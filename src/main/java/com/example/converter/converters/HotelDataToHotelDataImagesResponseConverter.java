package com.example.converter.converters;

import com.example.converter.models.HotelData;
import com.example.converter.models.objects.coah.Image;
import com.example.converter.models.responses.HotelDataImagesResponse;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HotelDataToHotelDataImagesResponseConverter implements Converter<HotelData, HotelDataImagesResponse> {

    @Override
    public HotelDataImagesResponse convert(final HotelData source) {
        final Set<String> hotelUrls = source.getHotel() != null
                                      ? source.getHotel().getImages().getImage().stream().map(Image::getUrl).collect(Collectors.toSet())
                                      : new LinkedHashSet<>();
        final Set<String> dataUls = source.getData() != null ? new HashSet<>(source.getData().getImageFiles()) : new LinkedHashSet<>();
        hotelUrls.addAll(dataUls);

        return HotelDataImagesResponse.newBuilder()
            .name(source.getName())
            .urls(hotelUrls)
            .build();
    }
}
