package com.example.converter.converters;

import com.example.converter.configurations.MapperConfiguration;
import com.example.converter.models.objects.coah.Content;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamToContentConverter implements Converter<InputStream, Content> {
    private static final Logger LOG = LoggerFactory.getLogger(InputStreamToContentConverter.class);

    private final MapperConfiguration configuration;

    public InputStreamToContentConverter(final MapperConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Content convert(final InputStream inputStream) {
        try {
            final XmlMapper mapper = this.configuration.getConfiguredXmlMapper();
            final JsonNode jsonNode = mapper.readTree(inputStream);
            this.configuration.fixEmptyKeys(jsonNode);
            final Content content = mapper.treeToValue(jsonNode, Content.class);
            LOG.debug("Successfully converted: {}", content);
            return content;
        } catch(IOException e) {
            return null;
        }
    }
}
