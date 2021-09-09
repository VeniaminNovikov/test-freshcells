package com.example.converter.converters.deserializers;

import com.example.converter.models.objects.coah.Attribute;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class AttributeDeserializer extends StdDeserializer<Attribute> {
    private static final String PRIORITY_NODE = "priority";
    private static final String RATING_NODE = "rating";
    private static final String USP_NODE = "usp";
    private static final String VALUE_NODE = "value";

    public AttributeDeserializer() {
        this(null);
    }

    protected AttributeDeserializer(final Class<?> vc) {
        super(vc);
    }

    @Override
    public Attribute deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException {
        final ObjectNode node = jp.getCodec().readTree(jp);
        final JsonNode container = node.get("@attributes");
        if (container != null && !container.isEmpty()) {
            final JsonNode priority = container.get(PRIORITY_NODE);
            node.set(PRIORITY_NODE, priority);
            final JsonNode rating = container.get(RATING_NODE);
            node.set(RATING_NODE, rating);
        }
        final JsonNode value = node.get(VALUE_NODE);
        if (value != null && !value.asText().isEmpty()) {
            node.set(USP_NODE, value);
        }

        return Attribute.newBuilder()
            .priority(node.get(PRIORITY_NODE) != null ? node.get(PRIORITY_NODE).asInt() : 0)
            .rating(node.get(RATING_NODE) != null ? node.get(RATING_NODE).asText() : null)
            .usp(node.get(USP_NODE) != null ? node.get(USP_NODE).asText() : null)
            .value(null)
            .container(null)
            .build();
    }
}
