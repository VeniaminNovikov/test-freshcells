package com.example.converter.converters.deserializers;

import com.example.converter.models.objects.coah.Attributes;
import com.example.converter.models.objects.coah.Category;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class AttributesDeserializer extends StdDeserializer<Attributes> {
    private static final String SOURCE_NODE = "source";
    private static final String NAME_NODE = "name";

    public AttributesDeserializer() {
        this(null);
    }

    protected AttributesDeserializer(final Class<?> vc) {
        super(vc);
    }

    @Override
    public Attributes deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException {
        final ObjectNode node = jp.getCodec().readTree(jp);
        final JsonNode container = node.get("@attributes");
        if (container != null && !container.isEmpty()) {
            final JsonNode source = container.get(SOURCE_NODE);
            node.set(SOURCE_NODE, source);
        }
        final List<Category> categoryList = new ArrayList<>();
        final ArrayNode categories = (ArrayNode) node.get("category");
        if (categories != null && !categories.isEmpty()) {
            final Iterable<JsonNode> elements = categories::elements;
            for (final JsonNode el : elements) {
                final ObjectNode categoryNode = (ObjectNode) el;
                final Category category = this.createCategory(categoryNode);
                categoryList.add(category);
            }
        }

        return Attributes.newBuilder()
            .source(node.get(SOURCE_NODE).asText())
            .category(categoryList)
            .container(new LinkedHashMap<>())
            .build();
    }

    private Category createCategory(final ObjectNode categoryNode) {
        final ObjectNode container = (ObjectNode) categoryNode.get("@attributes");
        final JsonNode nameNode = categoryNode.get(NAME_NODE);
        String name = null;
        if (nameNode != null) {
            name = nameNode.asText();
        } else if (container != null && !container.isEmpty() && container.get(NAME_NODE) != null) {
            name = container.get(NAME_NODE).asText();
        }

        final JsonNode attribute = categoryNode.get("attribute");
        final List<Object> attributesList = new LinkedList<>();
        if (attribute.isObject() && name != null) {
            final ObjectNode objectNode = (ObjectNode) attribute;
            attributesList.add(objectNode.get(name));
        } else if (attribute.isArray()) {
            final ArrayNode attributes = (ArrayNode) attribute;
            final Iterable<JsonNode> elements = attributes::elements;
            for (final JsonNode el : elements) {
                if (el.isTextual()) {
                    attributesList.add(el.asText());
                } else {
                    attributesList.add(el);
                }
            }
        }

        return Category.newBuilder()
            .name(name)
            .attributes(attributesList)
            .container(null)
            .build();
    }
}
