package com.example.converter.controllers;

import com.example.converter.facades.HotelDataServiceFacade;
import com.example.converter.models.responses.HotelDataResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.TimeZone;

import static com.example.converter.constants.Constants.BASE_HOTELS_URI;
import static com.example.converter.constants.TestConstants.TEST_DOUBLE;
import static com.example.converter.constants.TestConstants.TEST_INT;
import static com.example.converter.constants.TestConstants.TEST_NAME;
import static com.example.converter.constants.TestConstants.TEST_STRING;
import static com.example.converter.constants.TestConstants.TEST_TIMESTAMP;
import static com.example.converter.constants.TestHotelDataFactory.createData;
import static com.example.converter.constants.TestHotelDataFactory.createHotel;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles({"test"})
@WebMvcTest(HotelsController.class)
@ContextConfiguration
class HotelsControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    private ObjectMapper mapper;

    @MockBean
    private HotelDataServiceFacade hotelDataServiceFacade;

    @BeforeEach
    void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        this.mapper = new ObjectMapper();
        final JavaTimeModule module = new JavaTimeModule();
        final LocalDateTimeDeserializer localDateTimeDeserializer =  new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        module.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
        module.addSerializer(new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        this.mapper.registerModule(module);
        this.mapper.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        this.mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        this.mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
    }

    @Test
    void getHotelData() throws Exception {
        final HotelDataResponse response = HotelDataResponse.newBuilder()
            .name(TEST_NAME)
            .hotel(createHotel())
            .data(createData())
            .build();
        final Page<HotelDataResponse> dataResponse = new PageImpl<>(Arrays.asList(response), Pageable.unpaged(), 1L);
        when(this.hotelDataServiceFacade.getAll(any(Pageable.class))).thenReturn(dataResponse);
        final String content = this.mapper.writeValueAsString(dataResponse);
        final RequestBuilder builder = get(BASE_HOTELS_URI)
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .content(content);

        this.mockMvc.perform(builder)
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.content[*].name").value(TEST_NAME))
            .andExpect(jsonPath("$.content[*].hotel.iff").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].hotel.name").value(TEST_NAME))
            .andExpect(jsonPath("$.content[*].hotel.latitude").value(TEST_DOUBLE))
            .andExpect(jsonPath("$.content[*].hotel.longitude").value(TEST_DOUBLE))
            .andExpect(jsonPath("$.content[*].hotel.phone").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.email").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.url").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.category").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.address.zip").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.address.city").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.address.country").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.address.formatted.line[0]").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.texts.text.paragraph").isArray())
            .andExpect(jsonPath("$.content[*].hotel.texts.text.copyrightText").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.texts.text.tourOperator").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.texts.text.source").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.texts.text.tourOperatorLong").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.texts.text.id").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.texts.text.name").value(TEST_NAME))
            .andExpect(jsonPath("$.content[*].hotel.texts.text.paragraph[*].headline").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.texts.text.paragraph[*].description").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.texts.text.paragraph[*].content").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.texts.text.paragraph[*].value").doesNotExist())
            .andExpect(jsonPath("$.content[*].hotel.usps.hotelAttributes.attribute").isArray())
            .andExpect(jsonPath("$.content[*].hotel.usps.hotelAttributes.source").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.additionalTexts[*]").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.images.image[*].url").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.videos.urls[*].urls").isArray())
            .andExpect(jsonPath("$.content[*].hotel.videos.urls[*].source").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.videos.urls[*].priority").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.videos.urls[*].hasPlayer").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.attributes.source").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.attributes.category[*]").isArray())
            .andExpect(jsonPath("$.content[*].hotel.ratings.source").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.ratings.rating").value(TEST_DOUBLE))
            .andExpect(jsonPath("$.content[*].hotel.ratings.reviews").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].hotel.ratings.url").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.ratings.detailedRating[*]").isEmpty())
            .andExpect(jsonPath("$.content[*].hotel.ratings.hc_id").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].hotel.ratings.recommendation_rate").value(TEST_DOUBLE))
            .andExpect(jsonPath("$.content[*].hotel.hotelAwards[*]").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.giata_id").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].hotel.update_timestamp").value(TEST_TIMESTAMP))
            .andExpect(jsonPath("$.content[*].hotel.region_code").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].hotel.country_name").value(TEST_STRING))

            .andExpect(jsonPath("$.content[*].data.text").doesNotExist())
            .andExpect(jsonPath("$.content[*].data.Hotelname").value(TEST_NAME))
            .andExpect(jsonPath("$.content[*].data.Hotelkategorie").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].data.Stadtname").value(TEST_NAME))
            .andExpect(jsonPath("$.content[*].data.Stadtnummer").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].data.Zielgebietsname").value(TEST_NAME))
            .andExpect(jsonPath("$.content[*].data.Zielgebietsnummer").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].data.Landname").value(TEST_NAME))
            .andExpect(jsonPath("$.content[*].data.Landcode").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].data.Veranstaltercode").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].data.datestart").isArray())
            .andExpect(jsonPath("$.content[*].data.datestart").isArray())
            .andExpect(jsonPath("$.content[*].data.KatalogID").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].data.Katalogseite").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].data.Preisseite").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].data.Katalogname").value(TEST_NAME))
            .andExpect(jsonPath("$.content[*].data.Veranstaltername").value(TEST_NAME))
            .andExpect(jsonPath("$.content[*].data.VeranstalterID").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].data.KataloghotelID").value(TEST_INT))
            .andExpect(jsonPath("$.content[*].data.KatalogSaisonTyp").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].data.Objectcode").value(TEST_STRING))
            .andExpect(jsonPath("$.content[*].data.GeoData").doesNotExist())
            .andExpect(jsonPath("$.content[*].data.climate").doesNotExist())
            .andExpect(jsonPath("$.content[*].data.Bildfile").isArray())

            .andDo(print());
        verify(this.hotelDataServiceFacade, times(1)).getAll(any(Pageable.class));
    }

    @Test
    void getImages() {
        // todo
    }
}
