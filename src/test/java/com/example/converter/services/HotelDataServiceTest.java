package com.example.converter.services;

import com.example.converter.models.HotelData;
import com.example.converter.repositories.DataRepository;
import com.example.converter.services.impl.HotelDataServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.example.converter.constants.TestHotelDataFactory.createHotelData;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class HotelDataServiceTest {

    private DataRepository<String, HotelData> dataRepository;
    private HotelDataService service;

    @BeforeEach
    void setUp() {
        this.dataRepository = mock(DataRepository.class);
        this.service = new HotelDataServiceImpl(this.dataRepository);
    }

    @Test
    void getAll() throws Exception {
        when(this.dataRepository.getAll()).thenReturn(Arrays.asList(createHotelData()));

        final List<HotelData> actual = this.service.getAll();

        assertThat(actual).containsExactly(createHotelData());
    }
}
