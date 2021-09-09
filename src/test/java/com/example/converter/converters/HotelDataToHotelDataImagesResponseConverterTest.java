package com.example.converter.converters;

import com.example.converter.models.responses.HotelDataImagesResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.converter.constants.TestHotelDataFactory.createHotelData;
import static com.example.converter.constants.TestHotelDataFactory.createHotelDataImagesResponse;
import static org.assertj.core.api.Assertions.assertThat;

class HotelDataToHotelDataImagesResponseConverterTest {

    private HotelDataToHotelDataImagesResponseConverter converter;

    @BeforeEach
    void setUp() {
        this.converter = new HotelDataToHotelDataImagesResponseConverter();
    }

    @Test
    void convert() {

        final HotelDataImagesResponse response = this.converter.convert(createHotelData());

        assertThat(response)
            .usingRecursiveComparison()
            .isEqualTo(createHotelDataImagesResponse());
    }
}
