package com.example.converter.converters;

import com.example.converter.models.HotelData;
import com.example.converter.models.objects.coah.Content;
import com.example.converter.models.objects.coah.ContentWrapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.converter.constants.TestHotelDataFactory.createHotelData;
import static org.assertj.core.api.Assertions.assertThat;

class ContentWrapperToHotelDataConverterTest {

    private ContentWrapperToHotelDataConverter converter;

    @BeforeEach
    void setUp() {
        this.converter = new ContentWrapperToHotelDataConverter();
    }

    @Test
    void convert() {
        final HotelData hotelData = createHotelData();
        final Content source = Content.newBuilder()
            .hotel(hotelData.getHotel())
            .build();
        final HotelData expected = HotelData.newBuilder()
            .name(source.getHotel().getName())
            .hotel(source.getHotel())
            .build();

        final HotelData actual = this.converter.convert(ContentWrapper.newBuilder().content(source).build());

        assertThat(actual).isEqualTo(expected);
    }
}
