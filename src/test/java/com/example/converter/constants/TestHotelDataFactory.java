package com.example.converter.constants;

import com.example.converter.models.HotelData;
import com.example.converter.models.objects.coah.Address;
import com.example.converter.models.objects.coah.AddressFormatted;
import com.example.converter.models.objects.coah.Attribute;
import com.example.converter.models.objects.coah.Attributes;
import com.example.converter.models.objects.coah.Category;
import com.example.converter.models.objects.coah.Hotel;
import com.example.converter.models.objects.coah.HotelAttributes;
import com.example.converter.models.objects.coah.Image;
import com.example.converter.models.objects.coah.Images;
import com.example.converter.models.objects.coah.Paragraph;
import com.example.converter.models.objects.coah.Ratings;
import com.example.converter.models.objects.coah.Text;
import com.example.converter.models.objects.coah.Texts;
import com.example.converter.models.objects.coah.Usps;
import com.example.converter.models.objects.coah.Video;
import com.example.converter.models.objects.coah.Videos;
import com.example.converter.models.objects.giata.Data;
import com.example.converter.models.responses.HotelDataResponse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

import static com.example.converter.constants.TestConstants.TEST_DOUBLE;
import static com.example.converter.constants.TestConstants.TEST_END_DATE;
import static com.example.converter.constants.TestConstants.TEST_INT;
import static com.example.converter.constants.TestConstants.TEST_NAME;
import static com.example.converter.constants.TestConstants.TEST_START_DATE;
import static com.example.converter.constants.TestConstants.TEST_STRING;
import static com.example.converter.constants.TestConstants.TEST_TIMESTAMP;

public class TestHotelDataFactory {

    public static Hotel createHotel() {
        return Hotel.newBuilder()
            .iff(TEST_INT)
            .name(TEST_NAME)
            .giataId(TEST_INT)
            .latitude(TEST_DOUBLE)
            .longitude(TEST_DOUBLE)
            .phone(TEST_STRING)
            .email(TEST_STRING)
            .url(TEST_STRING)
            .updateTimestamp(TEST_TIMESTAMP)
            .category(TEST_STRING)
            .regionCode(TEST_STRING)
            .countryName(TEST_STRING)
            .address(Address.newBuilder()
                .city(TEST_STRING)
                .country(TEST_STRING)
                .zip(TEST_STRING)
                .formatted(AddressFormatted.newBuilder().line(Arrays.asList(TEST_STRING)).build())
                .build())
            .texts(Texts.newBuilder()
                .text(Text.newBuilder()
                    .id(TEST_STRING)
                    .name(TEST_NAME)
                    .source(TEST_STRING)
                    .tourOperator(TEST_STRING)
                    .tourOperatorLong(TEST_STRING)
                    .copyrightText(TEST_STRING)
                    .paragraph(Arrays.asList(Paragraph.newBuilder()
                        .headline(TEST_STRING)
                        .description(TEST_STRING)
                        .content(TEST_STRING)
                        .build()))
                    .build())
                .build())
            .additionalTexts(Arrays.asList(TEST_STRING))
            .usps(Usps.newBuilder()
                .hotelAttributes(HotelAttributes.newBuilder()
                    .source(TEST_STRING)
                    .attribute(Arrays.asList(Attribute.newBuilder()
                            .usp(TEST_STRING)
                            .rating(TEST_STRING)
                            .priority(TEST_INT)
                        .build()))
                    .build())
                .build())
            .images(Images.newBuilder().image(new HashSet<>(Arrays.asList(Image.newBuilder().url(TEST_STRING).build()))).build())
            .videos(Videos.newBuilder().video(Arrays.asList(Video.newBuilder()
                    .source(TEST_STRING)
                    .urls(new LinkedHashMap<String, String>() {{ this.put(TEST_NAME, TEST_STRING); }})
                    .hasPlayer(TEST_STRING)
                    .priority(TEST_STRING)
                    .build()))
                .build())
            .attributes(Attributes.newBuilder()
                .container(new LinkedHashMap<String, String>() {{
                    this.put(TEST_NAME, TEST_STRING); }})
                .source(TEST_STRING)
                .category(Arrays.asList(Category.newBuilder()
                    .name(TEST_NAME)
                    .container(TEST_STRING)
                    .attributes(Arrays.asList(TEST_STRING))
                    .build()))
                .build())
            .ratings(Ratings.newBuilder()
                .hcId(TEST_INT)
                .recommendationRate(TEST_DOUBLE)
                .reviews(TEST_INT)
                .rating(TEST_DOUBLE)
                .source(TEST_STRING)
                .url(TEST_STRING)
                .build())
            .hotelAwards(Arrays.asList(TEST_STRING))
            .build();
    }

    public static Data createData() {
        return Data.newBuilder()
            .hotelName(TEST_NAME)
            .hotelCategory(TEST_INT)
            .districtName(TEST_NAME)
            .districtNumber(TEST_INT)
            .destinationName(TEST_NAME)
            .destinationNumber(TEST_INT)
            .countryName(TEST_NAME)
            .countryCode(TEST_STRING)
            .organizerCode(TEST_STRING)
            .dateStart(TEST_START_DATE)
            .dateEnd(TEST_END_DATE)
            .katalogID(TEST_INT)
            .katalogseite(TEST_INT)
            .preisseite(TEST_INT)
            .katalogname(TEST_NAME)
            .veranstaltername(TEST_NAME)
            .veranstalterID(TEST_INT)
            .kataloghotelID(TEST_INT)
            .katalogSaisonTyp(TEST_STRING)
            .objectCode(TEST_STRING)
            .build();
    }

    public static HotelData createHotelData() {
        return HotelData.newBuilder()
            .name(TEST_NAME)
            .hotel(createHotel())
            .data(createData())
            .build();
    }

    public static HotelDataResponse createHotelDataResponse() {
        final HotelData hotelData = createHotelData();
        return HotelDataResponse.newBuilder()
            .name(hotelData.getName())
            .data(hotelData.getData())
            .hotel(hotelData.getHotel())
            .build();
    }
}
