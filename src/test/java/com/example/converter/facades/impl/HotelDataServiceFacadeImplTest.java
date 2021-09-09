package com.example.converter.facades.impl;

import com.example.converter.facades.HotelDataServiceFacade;
import com.example.converter.models.HotelData;
import com.example.converter.models.objects.json.coah.Hotel;
import com.example.converter.models.objects.json.coah.Image;
import com.example.converter.models.objects.json.coah.Images;
import com.example.converter.models.objects.json.giata.Data;
import com.example.converter.models.responses.HotelDataImagesResponse;
import com.example.converter.models.responses.HotelDataResponse;
import com.example.converter.services.HotelDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.example.converter.constants.TestConstants.TEST_NAME;
import static com.example.converter.constants.TestHotelDataFactory.createData;
import static com.example.converter.constants.TestHotelDataFactory.createHotel;
import static com.example.converter.constants.TestHotelDataFactory.createHotelData;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class HotelDataServiceFacadeImplTest {

    private ConversionService conversionService;
    private HotelDataService hotelDataService;
    private HotelDataServiceFacade facade;

    @BeforeEach
    void setUp() {
        this.conversionService = mock(ConversionService.class);
        this.hotelDataService = mock(HotelDataService.class);
        this.facade = new HotelDataServiceFacadeImpl(this.hotelDataService, this.conversionService);
    }

    @Test
    void getAll() throws Exception {
        final List<HotelData> hotelData = Arrays.asList(createHotelData(), HotelData.newBuilder(createHotelData()).name("Another name").build());
        final List<HotelDataResponse> expectedResponses = hotelData.stream()
            .map(i -> HotelDataResponse.newBuilder().name(i.getName()).data(i.getData()).hotel(i.getHotel()).build())
            .collect(Collectors.toList());
        when(this.hotelDataService.getAll()).thenReturn(hotelData);
        ArrayList<HotelDataResponse> resultWrapper = new ArrayList<>();
        when(this.conversionService.convert(any(HotelData.class), eq(HotelDataResponse.class))).thenAnswer(i -> {
            final HotelData invocation = i.getArgument(0);
            final HotelDataResponse response = HotelDataResponse.newBuilder()
                .name(invocation.getName())
                .data(invocation.getData())
                .hotel(invocation.getHotel())
                .build();
            resultWrapper.add(response);
            return response;
        });

        final Page<HotelDataResponse> actual = this.facade.getAll(Pageable.unpaged());

        assertThat(actual.getContent())
            .containsExactlyElementsOf(resultWrapper);
        assertThat(actual.getContent().get(0))
            .usingRecursiveComparison()
            .ignoringCollectionOrder()
            .isEqualTo(expectedResponses.get(0));
        assertThat(actual.getContent().get(1))
            .usingRecursiveComparison()
            .ignoringCollectionOrder()
            .isEqualTo(expectedResponses.get(1));
    }

    @Test
    void getAllImagesCombinedByHotelName() throws Exception{
        final List<String> expectedUrls = Arrays.asList("first", "second", "third");
        final List<HotelData> hotelData = Arrays.asList(
            HotelData.newBuilder()
                .name(TEST_NAME)
                .data(Data.newBuilder(createData())
                    .imageFiles(new LinkedHashSet<>(Arrays.asList(expectedUrls.get(0))))
                    .build())
                .build(),
            HotelData.newBuilder()
                .name(TEST_NAME)
                .hotel(Hotel.newBuilder(createHotel())
                    .images(Images.newBuilder().image(new LinkedHashSet<>(Arrays.asList(Image.newBuilder().url(expectedUrls.get(1)).build()))).build())
                    .build())
                .build(),
            HotelData.newBuilder()
                .name("Another name")
                .data(Data.newBuilder(createData())
                    .imageFiles(new LinkedHashSet<>(Arrays.asList(expectedUrls.get(2))))
                    .build())
                .build(),
            HotelData.newBuilder(HotelData.newBuilder().build())
                .name("Another name")
                .build());
        when(this.hotelDataService.getAll()).thenReturn(hotelData);
        final Set<String> testSet = new LinkedHashSet<>(Arrays.asList("first", "second"));
        final Set<String> anotherSet = new LinkedHashSet<>(Arrays.asList("third"));
        final ArrayList<Set<String>> wrapper = new ArrayList<>();
        when(this.conversionService.convert(any(HotelData.class), eq(HotelDataImagesResponse.class))).thenAnswer(i -> {
            final HotelData source = i.getArgument(0);
            final Set<String> urls = source.getHotel() != null
                                     ? source.getHotel().getImages().getImage().stream().map(Image::getUrl).collect(Collectors.toSet())
                                     : new LinkedHashSet<>();
            urls.addAll(source.getData() != null ? new HashSet<>(source.getData().getImageFiles()) : new LinkedHashSet<>());
            wrapper.add(urls);
            return HotelDataImagesResponse.newBuilder()
                .name(source.getName())
                .urls(urls)
                .build();
        });

        final Page<HotelDataImagesResponse> response = this.facade.getAllImagesCombinedByHotelName(Pageable.unpaged());

        assertThat(wrapper).contains(testSet, anotherSet);
        assertThat(response.getContent().get(0))
            .hasFieldOrPropertyWithValue("name", "Another name")
            .hasFieldOrPropertyWithValue("urls", anotherSet);
        assertThat(response.getContent().get(1))
            .hasFieldOrPropertyWithValue("name", TEST_NAME)
            .hasFieldOrPropertyWithValue("urls", testSet);
    }
}
