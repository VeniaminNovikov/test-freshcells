package com.example.converter.converters;

import com.example.converter.configurations.MapperConfiguration;
import com.example.converter.models.objects.coah.ContentWrapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamToContentWrapperConverter implements Converter<InputStream, ContentWrapper> {
    private static final Logger LOG = LoggerFactory.getLogger(InputStreamToContentWrapperConverter.class);

    private final MapperConfiguration configuration;

    public InputStreamToContentWrapperConverter(final MapperConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public ContentWrapper convert(final InputStream inputStream) {
        try {
            final ObjectMapper mapper = this.configuration.getConfiguredObjectMapper();
            final JsonNode jsonNode = mapper.readTree(inputStream);
            this.configuration.fixEmptyKeys(jsonNode);
            final ContentWrapper content = mapper.treeToValue(jsonNode, ContentWrapper.class);
            LOG.debug("Successfully converted: {}", content);
            return content;
        } catch(IOException e) {
            return null;
        }
    }
}
