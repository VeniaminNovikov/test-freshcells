package com.example.converter.converters.deserializers;

import com.example.converter.models.objects.coah.Attribute;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AttributeDeserializerTest {

    private AttributeDeserializer deserializer;

    private JsonParser jp;
    private DeserializationContext ctxt;
    private ObjectCodec objectCodec;

    @BeforeEach
    void setUp() {
        this.deserializer = new AttributeDeserializer();
        this.jp = mock(JsonParser.class);
        this.ctxt = mock(DeserializationContext.class);
        this.objectCodec = mock(ObjectCodec.class);
        when(this.jp.getCodec()).thenReturn(this.objectCodec);
    }

    @Test
    void deserialize() throws Exception {
        final String usp = "sehr schöne Zimmer";
        final String rating = "112.356";
        final int priority = 105;
        final LinkedHashMap<String, Object> container = new LinkedHashMap<>();
        container.put("priority", priority);
        container.put("rating", rating);
        final Attribute attribute = Attribute.newBuilder()
            .container(container)
            .value(usp)
            .build();
        final ObjectMapper objectMapper = new ObjectMapper();
        JsonNode node =  objectMapper.valueToTree(attribute);
        when(this.objectCodec.readTree(this.jp)).thenReturn(node);

        final Attribute actual = this.deserializer.deserialize(this.jp, this.ctxt);

        assertThat(actual).isEqualTo(Attribute.newBuilder()
            .priority(priority)
            .rating(rating)
            .usp(usp)
            .value(null)
            .container(null)
            .build());
    }
}
