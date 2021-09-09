package com.example.converter.converters;

import com.example.converter.models.HotelData;
import com.example.converter.models.objects.giata.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.converter.constants.TestHotelDataFactory.createHotelData;
import static org.assertj.core.api.Assertions.assertThat;

class ResultToHotelDataConverterTest {

    private ResultToHotelDataConverter converter;

    @BeforeEach
    void setUp() {
        this.converter = new ResultToHotelDataConverter();
    }

    @Test
    void convert() {
        final HotelData hotelData = createHotelData();
        final Result source = Result.newBuilder()
            .data(hotelData.getData())
            .build();
        final HotelData expected = HotelData.newBuilder()
            .name(source.getData().getHotelName())
            .data(source.getData())
            .build();

        final HotelData actual = this.converter.convert(source);

        assertThat(actual).isEqualTo(expected);
    }
}
