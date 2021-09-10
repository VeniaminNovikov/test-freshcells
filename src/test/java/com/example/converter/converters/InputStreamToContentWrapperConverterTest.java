package com.example.converter.converters;

import com.example.converter.configurations.MapperConfiguration;
import com.example.converter.models.objects.coah.Content;
import com.example.converter.models.objects.coah.ContentWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static com.example.converter.constants.TestHotelDataFactory.createHotel;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InputStreamToContentWrapperConverterTest {

    private MapperConfiguration configurationMock;
    private InputStreamToContentWrapperConverter converter;
    private ObjectMapper objectMapper;
    private ObjectMapper mockObjectMapper;

    @BeforeEach
    void setUp() {
        this.configurationMock = mock(MapperConfiguration.class);
        this.converter = new InputStreamToContentWrapperConverter(this.configurationMock);

        this.objectMapper = new ObjectMapper();
        this.mockObjectMapper = mock(ObjectMapper.class);
        when(this.configurationMock.getConfiguredObjectMapper()).thenReturn(this.mockObjectMapper);
    }

    @Test
    void convert_shouldReturnContentWrapper() throws Exception {
        final ContentWrapper contentWrapper = ContentWrapper.newBuilder().content(Content.newBuilder().hotel(createHotel()).build()).build();
        final ObjectNode objectNode = this.objectMapper.valueToTree(contentWrapper);
        when(this.mockObjectMapper.readTree(any(InputStream.class))).thenReturn(objectNode);
        final List<ObjectNode> objectNodeInvocationWrapper = new ArrayList<>();
        doAnswer(i -> {
            final ObjectNode node = i.getArgument(0);
            objectNodeInvocationWrapper.add(node);
            return node;
        }).when(this.configurationMock).fixEmptyKeys(any());
        when(this.mockObjectMapper.treeToValue(any(ObjectNode.class), eq(ContentWrapper.class))).thenAnswer(i -> {
            final ObjectNode node = i.getArgument(0);
            objectNodeInvocationWrapper.add(node);
            return contentWrapper;
        });
        final String read = this.objectMapper.writeValueAsString(contentWrapper);
        final byte[] bytes = read.getBytes(StandardCharsets.UTF_8);
        final InputStream inputStream = new ByteArrayInputStream(bytes);

        final ContentWrapper actualResult = this.converter.convert(inputStream);

        assertThat(actualResult).isEqualTo(contentWrapper);
        assertThat(objectNodeInvocationWrapper).containsOnly(objectNode);
    }

    @Test
    void convert_shouldReturnNull() throws Exception {
        when(this.mockObjectMapper.readTree(any(InputStream.class))).thenThrow(new IOException());
        final byte[] bytes = this.objectMapper.writeValueAsString(ContentWrapper.newBuilder().build()).getBytes(StandardCharsets.UTF_8);
        final InputStream inputStream = new ByteArrayInputStream(bytes);

        final ContentWrapper actualResult = this.converter.convert(inputStream);

        assertThat(actualResult).isNull();
    }
}
