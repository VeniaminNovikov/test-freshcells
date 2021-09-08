package com.example.converter.services.impl;

import com.example.converter.exceptions.ConverterApplicationException;
import com.example.converter.models.HotelData;
import com.example.converter.repositories.DataRepository;
import com.example.converter.services.HotelDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelDataServiceImpl implements HotelDataService {
    private static final Logger LOG = LoggerFactory.getLogger(HotelDataServiceImpl.class);

    private final DataRepository<String, HotelData> dataRepository;

    public HotelDataServiceImpl(final DataRepository<String, HotelData> dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public List<HotelData> getAll() throws ConverterApplicationException {
        final List<HotelData> data = this.dataRepository.getAll();

        return data;
    }
}
