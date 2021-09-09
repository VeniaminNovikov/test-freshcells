package com.example.converter.repositories.impl;

import com.example.converter.configurations.ResourceConfiguration;
import com.example.converter.exceptions.ConverterApplicationException;
import com.example.converter.models.HotelData;
import com.example.converter.models.objects.coah.Content;
import com.example.converter.models.objects.coah.ContentWrapper;
import com.example.converter.models.objects.giata.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.util.ReflectionTestUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import static com.example.converter.constants.Messages.DATASOURCE_NOT_FOUND;
import static com.example.converter.constants.TestConstants.TEST_NAME;
import static com.example.converter.constants.TestHotelDataFactory.createHotelData;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ContextConfiguration
class ResourceToHotelDataRepositoryAdapterTest {

    private ResourcePatternResolver patternResolver;

    private ResourceToHotelDataRepositoryAdapter adapter;

    private HotelData hotelData;

    @BeforeEach
    void setUp() throws IOException {
        final ResourceLoader resourceLoader = mock(ResourceLoader.class);
        final ResourceConfiguration resourceConfiguration = mock(ResourceConfiguration.class);
        final ConversionService conversionService = mock(ConversionService.class);
        this.adapter = new ResourceToHotelDataRepositoryAdapter(resourceConfiguration, resourceLoader, conversionService);
        this.patternResolver = mock(ResourcePatternResolver.class);
        ReflectionTestUtils.setField(this.adapter, "patternResolver", this.patternResolver);

        this.hotelData = createHotelData();
        final Result result = Result.newBuilder().data(this.hotelData.getData()).found(1).build();
        when(conversionService.convert(any(), eq(Result.class)))
            .thenReturn(result);
        when(conversionService.convert(any(Result.class), eq(HotelData.class)))
            .thenReturn(HotelData.newBuilder().name(TEST_NAME).data(result.getData()).build());
        final Content content = Content.newBuilder().hotel(this.hotelData.getHotel()).build();
        when(conversionService.convert(any(), eq(Content.class)))
            .thenReturn(content);
        when(conversionService.convert(any(Content.class), eq(HotelData.class)))
            .thenReturn(HotelData.newBuilder().name(TEST_NAME).hotel(content.getHotel()).build());
        final ContentWrapper contentWrapper = ContentWrapper.newBuilder().content(content).build();
        when(conversionService.convert(any(), eq(ContentWrapper.class)))
            .thenReturn(contentWrapper);
        when(conversionService.convert(any(ContentWrapper.class), eq(HotelData.class)))
            .thenReturn(HotelData.newBuilder().name(TEST_NAME).hotel(content.getHotel()).build());

        when(resourceConfiguration.getDataSource()).thenReturn("/some/path/");
        final Resource mockResource = mock(Resource.class);
        when(mockResource.getFilename()).thenReturn(TEST_NAME);
        final ByteArrayInputStream is = new ByteArrayInputStream("Some Mock Data".getBytes());
        when(mockResource.getInputStream()).thenReturn(is);
        when(resourceLoader.getResource(anyString())).thenReturn(mockResource);
        Resource[] resources = {mockResource};
        when(this.patternResolver.getResources(anyString())).thenReturn(resources);
    }

    @ParameterizedTest
    @ValueSource(strings = {"*-giata.xml", "*-coah.xml", "*-coah.json"})
    void getByExample(String pattern) throws Exception {

        final List<HotelData> data = this.adapter.getByExample(pattern);

        assertThat(data)
            .anyMatch(d -> this.hotelData.getData().equals(d.getData()) || this.hotelData.getHotel().equals(d.getHotel()));
    }

    @Test
    void getByExample_shouldThrowException() throws Exception {
        when(this.patternResolver.getResources(any())).thenThrow(new IOException());

        final ConverterApplicationException exception = assertThrows(ConverterApplicationException.class,
            () -> this.adapter.getByExample("*-giata.xml"));

        assertThat(exception).hasMessage(DATASOURCE_NOT_FOUND);
    }

    @Test
    void getAll() throws Exception {

        final List<HotelData> data = this.adapter.getAll();

        assertThat(data).containsExactlyInAnyOrder(
            HotelData.newBuilder().name(TEST_NAME).data(this.hotelData.getData()).build(),
            HotelData.newBuilder().name(TEST_NAME).hotel(this.hotelData.getHotel()).build(),
            HotelData.newBuilder().name(TEST_NAME).hotel(this.hotelData.getHotel()).build()
        );
    }
}
