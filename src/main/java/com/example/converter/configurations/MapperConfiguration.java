package com.example.converter.configurations;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

@Configuration
public class MapperConfiguration {
    private static final Logger LOG = LoggerFactory.getLogger(MapperConfiguration.class);
    
    private XmlMapper xmlMapper;
    private ObjectMapper objectMapper;

    public XmlMapper getConfiguredXmlMapper() {
        if (this.xmlMapper == null) {
            this.initXmlMapper();
        }
        return this.xmlMapper;
    }

    public ObjectMapper getConfiguredObjectMapper() {
        if (this.objectMapper == null) {
            this.initObjectMapper();
        }
        return this.objectMapper;
    }

    private void initXmlMapper() {
        this.xmlMapper = new XmlMapper();
        this.configure(this.xmlMapper);
    }

    private void initObjectMapper() {
        this.objectMapper = new ObjectMapper();
        this.configure(this.objectMapper);
    }

    private void configure(final ObjectMapper mapper) {
        final JavaTimeModule module = new JavaTimeModule();
        final LocalDateTimeDeserializer localDateTimeDeserializer =  new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        module.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
        mapper.registerModule(module);
        mapper.setTimeZone(TimeZone.getTimeZone("UTC"));
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
    }

    public void fixEmptyKeys(final JsonNode jsonNode) {
        if (jsonNode.isArray()) {
            final ArrayNode arrayNode = (ArrayNode) jsonNode;
            final Iterable<JsonNode> elements = arrayNode::elements;
            for (final JsonNode node : elements) {
                this.fixEmptyKeys(node);
            }
        }
        if (jsonNode.isObject()) {
            final ObjectNode objectNode = (ObjectNode) jsonNode;
            final Iterable<String> fieldNames = objectNode::fieldNames;
            for (final String name : fieldNames) {
                this.fixEmptyKeys(objectNode.get(name));
            }
            final JsonNode emptyKeyValue = objectNode.get("");
            final JsonNode existing = objectNode.get("value");
            if (emptyKeyValue != null) {
                if (existing == null || existing.isNull()) {
                    objectNode.set("value", emptyKeyValue);
                    objectNode.remove("");
                } else {
                    LOG.warn("Skipping empty key value as a key named 'value' already exists");
                }
            }
        }
    }
}
