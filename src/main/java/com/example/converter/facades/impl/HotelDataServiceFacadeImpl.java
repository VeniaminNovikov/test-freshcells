package com.example.converter.facades.impl;

import com.example.converter.exceptions.ConverterApplicationException;
import com.example.converter.facades.HotelDataServiceFacade;
import com.example.converter.models.HotelData;
import com.example.converter.models.responses.HotelDataResponse;
import com.example.converter.models.responses.HotelDataImagesResponse;
import com.example.converter.services.HotelDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@SuppressWarnings("java:S3864")
@Component
public class HotelDataServiceFacadeImpl implements HotelDataServiceFacade {
    private static final Logger LOG = LoggerFactory.getLogger(HotelDataServiceFacadeImpl.class);

    private final HotelDataService hotelDataService;
    private final ConversionService conversionService;

    public HotelDataServiceFacadeImpl(final HotelDataService hotelDataService, final ConversionService conversionService) {
        this.hotelDataService = hotelDataService;
        this.conversionService = conversionService;
    }

    @Override
    public Page<HotelDataResponse> getAll(final Pageable pageable) throws ConverterApplicationException {
        final List<HotelData> hotelData = this.hotelDataService.getAll();

        final List<HotelDataResponse> content = hotelData.stream()
            .peek(data -> LOG.debug("Converting data to response: {}", data != null ? data.getName() : "-"))
            .map(data -> this.conversionService.convert(data, HotelDataResponse.class))
            .filter(Objects::nonNull)
            .collect(Collectors.toList());

        return new PageImpl<>(content, pageable, content.size());
    }

    @Override
    public Page<HotelDataImagesResponse> getAllImagesCombinedByHotelName(final Pageable pageable) throws ConverterApplicationException {
        final List<HotelData> hotelData = this.hotelDataService.getAll();

        final Map<String, HotelData> dataByName = this.combineInMapByName(hotelData);
        final List<HotelDataImagesResponse> content = dataByName.values().stream()
            .peek(data -> LOG.debug("Converting data to response: {}", data != null ? data.getName() : "-"))
            .map(data -> this.conversionService.convert(data, HotelDataImagesResponse.class))
            .filter(Objects::nonNull)
            .collect(Collectors.toList());

        return new PageImpl<>(content, pageable, content.size());
    }

    private Map<String, HotelData> combineInMapByName(final List<HotelData> hotelData) {
        final Map<String, HotelData> map = new HashMap<>();
        for (final HotelData current : hotelData) {
            final String name = current.getName();
            if (map.containsKey(name)) {
                final HotelData found = map.get(name);
                final HotelData combined = HotelData.newBuilder(found)
                    .name(name)
                    .data(found.getData() != null ? found.getData() : current.getData())
                    .hotel(found.getHotel() != null ? found.getHotel() : current.getHotel())
                    .build();
                map.put(name, combined);
            } else {
                map.put(name, current);
            }
        }
        return map;
    }
}
