package com.example.converter.services;

import com.example.converter.exceptions.ConverterApplicationException;
import com.example.converter.models.HotelData;

import java.util.List;

public interface HotelDataService {

    List<HotelData> getAll() throws ConverterApplicationException;
}
