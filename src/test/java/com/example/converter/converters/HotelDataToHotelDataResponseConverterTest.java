package com.example.converter.converters;

import com.example.converter.models.responses.HotelDataResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.converter.constants.TestHotelDataFactory.createHotelData;
import static com.example.converter.constants.TestHotelDataFactory.createHotelDataResponse;
import static org.assertj.core.api.Assertions.assertThat;

class HotelDataToHotelDataResponseConverterTest {
    private HotelDataToHotelDataResponseConverter converter;

    @BeforeEach
    void setUp() {
        this.converter = new HotelDataToHotelDataResponseConverter();
    }

    @Test
    void convert() {

        final HotelDataResponse response = this.converter.convert(createHotelData());

        assertThat(response)
            .usingRecursiveComparison()
            .isEqualTo(createHotelDataResponse());
    }
}
