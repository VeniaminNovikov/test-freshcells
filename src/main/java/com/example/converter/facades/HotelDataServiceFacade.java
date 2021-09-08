package com.example.converter.facades;

import com.example.converter.exceptions.ConverterApplicationException;
import com.example.converter.models.responses.HotelDataResponse;
import com.example.converter.models.responses.HotelDataImagesResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface HotelDataServiceFacade {

    Page<HotelDataResponse> getAll(Pageable pageable) throws ConverterApplicationException;

    Page<HotelDataImagesResponse> getAllImagesCombinedByHotelName(Pageable pageable) throws ConverterApplicationException;
}
