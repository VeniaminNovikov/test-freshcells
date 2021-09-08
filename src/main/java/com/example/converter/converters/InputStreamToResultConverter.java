package com.example.converter.converters;

import com.example.converter.configurations.MapperConfiguration;
import com.example.converter.models.objects.json.giata.Result;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InputStreamToResultConverter implements Converter<InputStream, Result> {
    private static final Logger LOG = LoggerFactory.getLogger(InputStreamToResultConverter.class);

    private final MapperConfiguration configuration;

    public InputStreamToResultConverter(final MapperConfiguration configuration) {
        this.configuration = configuration;
    }
//    private final XmlMapper mapper = new XmlMapper();

    @Override
    public Result convert(final InputStream inputStream) {
        try {
            final XmlMapper mapper = this.configuration.getConfiguredXmlMapper();
            final JavaTimeModule module = new JavaTimeModule();
            LocalDateDeserializer localDateTimeDeserializer =  new LocalDateDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            module.addDeserializer(LocalDate.class, localDateTimeDeserializer);
            mapper.registerModule(module);
            final JsonNode jsonNode = mapper.readTree(inputStream);
            final Result result = mapper.treeToValue(jsonNode, Result.class);
            LOG.debug("Successfully converted: {}", result);
            return result;
        } catch(IOException e) {
            return null;
        }
    }
}
