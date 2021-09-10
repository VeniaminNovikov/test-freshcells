package com.example.converter.converters;

import com.example.converter.configurations.MapperConfiguration;
import com.example.converter.models.objects.coah.Content;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
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

class InputStreamToContentConverterTest {

    private MapperConfiguration configurationMock;
    private InputStreamToContentConverter converter;
    private XmlMapper objectMapper;
    private XmlMapper mockMapper;

    @BeforeEach
    void setUp() {
        this.configurationMock = mock(MapperConfiguration.class);
        this.converter = new InputStreamToContentConverter(this.configurationMock);

        this.objectMapper = new XmlMapper();
        this.mockMapper = mock(XmlMapper.class);
        when(this.configurationMock.getConfiguredXmlMapper()).thenReturn(this.mockMapper);
    }

    @Test
    void convert_shouldReturnContent() throws Exception {
        final Content content = Content.newBuilder().hotel(createHotel()).build();
        final ObjectNode objectNode = this.objectMapper.valueToTree(content);
        when(this.mockMapper.readTree(any(InputStream.class))).thenReturn(objectNode);
        final List<ObjectNode> objectNodeInvocationWrapper = new ArrayList<>();
        doAnswer(i -> {
            final ObjectNode node = i.getArgument(0);
            objectNodeInvocationWrapper.add(node);
            return node;
        }).when(this.configurationMock).fixEmptyKeys(any());
        when(this.mockMapper.treeToValue(any(ObjectNode.class), eq(Content.class))).thenAnswer(i -> {
            final ObjectNode node = i.getArgument(0);
            objectNodeInvocationWrapper.add(node);
            return content;
        });
        final String read = this.objectMapper.writeValueAsString(content);
        final byte[] bytes = read.getBytes(StandardCharsets.UTF_8);
        final InputStream inputStream = new ByteArrayInputStream(bytes);

        final Content actualResult = this.converter.convert(inputStream);

        assertThat(actualResult).isEqualTo(content);
        assertThat(objectNodeInvocationWrapper).containsOnly(objectNode);
    }

    @Test
    void convert_shouldReturnNull() throws Exception {
        when(this.mockMapper.readTree(any(InputStream.class))).thenThrow(new IOException());
        final byte[] bytes = this.objectMapper.writeValueAsString(Content.newBuilder().build()).getBytes(StandardCharsets.UTF_8);
        final InputStream inputStream = new ByteArrayInputStream(bytes);

        final Content actualResult = this.converter.convert(inputStream);

        assertThat(actualResult).isNull();
    }
}
