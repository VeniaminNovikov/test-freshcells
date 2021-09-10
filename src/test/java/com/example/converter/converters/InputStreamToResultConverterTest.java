package com.example.converter.converters;

import com.example.converter.configurations.MapperConfiguration;
import com.example.converter.models.objects.coah.ContentWrapper;
import com.example.converter.models.objects.giata.Result;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static com.example.converter.constants.TestHotelDataFactory.createData;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InputStreamToResultConverterTest {

    private InputStreamToResultConverter converter;
    private XmlMapper objectMapper;
    private XmlMapper mockMapper;

    @BeforeEach
    void setUp() {
        final MapperConfiguration configurationMock = mock(MapperConfiguration.class);
        this.converter = new InputStreamToResultConverter(configurationMock);

        this.objectMapper = new XmlMapper();
        final JavaTimeModule module = new JavaTimeModule();
        LocalDateDeserializer localDateTimeDeserializer =  new LocalDateDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        module.addDeserializer(LocalDate.class, localDateTimeDeserializer);
        this.objectMapper.registerModule(module);
        this.mockMapper = mock(XmlMapper.class);
        when(configurationMock.getConfiguredXmlMapper()).thenReturn(this.mockMapper);
    }

    @Test
    void convert_shouldReturnResult() throws Exception {
        final Result resultObject = Result.newBuilder().found(1).data(createData()).build();
        final JsonNode objectNode = this.objectMapper.valueToTree(resultObject);
        when(this.mockMapper.readTree(any(InputStream.class))).thenReturn(objectNode);
        final List<JsonNode> objectNodeInvocationWrapper = new ArrayList<>();
        when(this.mockMapper.treeToValue(any(JsonNode.class), eq(Result.class))).thenAnswer(i -> {
            final JsonNode node = i.getArgument(0);
            objectNodeInvocationWrapper.add(node);
            return resultObject;
        });
        final String read = this.objectMapper.writeValueAsString(resultObject);
        final byte[] bytes = read.getBytes(StandardCharsets.UTF_8);
        final InputStream inputStream = new ByteArrayInputStream(bytes);

        final Result actualResult = this.converter.convert(inputStream);

        assertThat(actualResult).isEqualTo(resultObject);
        assertThat(objectNodeInvocationWrapper).containsOnly(objectNode);
    }

    @Test
    void convert_shouldReturnNull() throws Exception {
        when(this.mockMapper.readTree(any(InputStream.class))).thenThrow(new IOException());
        final byte[] bytes = this.objectMapper.writeValueAsString(ContentWrapper.newBuilder().build()).getBytes(StandardCharsets.UTF_8);
        final InputStream inputStream = new ByteArrayInputStream(bytes);

        final Result actualResult = this.converter.convert(inputStream);

        assertThat(actualResult).isNull();
    }
}
