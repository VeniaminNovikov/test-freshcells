package com.example.converter.converters.deserializers;

import com.example.converter.models.objects.coah.Attributes;
import com.example.converter.models.objects.coah.Category;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AttributesDeserializerTest {

    private AttributesDeserializer deserializer;

    private JsonParser jp;
    private DeserializationContext ctxt;
    private ObjectCodec objectCodec;

    @BeforeEach
    void setUp() {
        this.deserializer = new AttributesDeserializer();
        this.jp = mock(JsonParser.class);
        this.ctxt = mock(DeserializationContext.class);
        this.objectCodec = mock(ObjectCodec.class);
        when(this.jp.getCodec()).thenReturn(this.objectCodec);
    }

    @Test
    void deserialize() throws Exception {
        final String source = "source";
        final String name = "TEST_NAME";
        final String attr00 = "name";
        final String attr01 = "attr01";
        final String attr10 = "attr10";
        final LinkedHashMap<String, Object> container0 = new LinkedHashMap<>();
        container0.put(attr00, attr01);
        final LinkedHashMap<String, Object> container1 = new LinkedHashMap<>();
        container1.put(attr01, attr10);
        final ObjectMapper objectMapper = new ObjectMapper();

        final LinkedList<Object> list1 = new LinkedList<>();
        list1.add(objectMapper.writeValueAsString(container1));
        final LinkedList<Object> list2 = new LinkedList<>();
        list2.add(attr10);
        final Attributes expected = Attributes.newBuilder()
            .source(source)
            .category(Arrays.asList(
                Category.newBuilder()
                    .name(attr01)
                    .attributes(list1)
                    .build(),
                Category.newBuilder()
                    .name(name)
                    .attributes(list2)
                    .build()))
            .build();

        final List<Category> categoryList = new ArrayList<>();
        final Category category1 = Category.newBuilder()
            .container(container0)
            .attributes(Arrays.asList(container1))
            .build();
        categoryList.add(category1);
        final Category category2 = Category.newBuilder()
            .name(name)
            .container(container1)
            .attributes(Arrays.asList(attr10))
            .build();
        categoryList.add(category2);
        final Map<String, String> container = new LinkedHashMap<>();
        container.put("source", source);
        final Attributes attribute = Attributes.newBuilder()
            .container(container)
            .category(categoryList)
            .build();
        JsonNode node =  objectMapper.valueToTree(attribute);
        when(this.objectCodec.readTree(this.jp)).thenReturn(node);

        final Attributes actual = this.deserializer.deserialize(this.jp, this.ctxt);

        assertThat(actual).isEqualTo(expected);
    }
}
