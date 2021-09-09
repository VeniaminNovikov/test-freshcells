package com.example.converter;

import com.example.converter.controllers.HotelsController;
import com.example.converter.facades.HotelDataServiceFacade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class ConverterApplicationTest {

    private HotelsController controller;

    @BeforeEach
    void setUp() {
        HotelDataServiceFacade hotelDataServiceFacade = mock(HotelDataServiceFacade.class);
        this.controller = new HotelsController(hotelDataServiceFacade);
    }

    @Test
    void contextLoads() {
        assertThat(this.controller).isNotNull();
    }
}
