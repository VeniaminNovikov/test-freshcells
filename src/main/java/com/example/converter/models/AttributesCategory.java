package com.example.converter.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

// todo remove
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributesCategory implements Serializable {
    private static final long serialVersionUID = 1L;

//    @JacksonXmlProperty(isAttribute=true)
//    private final Map<String, String> name = new LinkedHashMap<>();

    private String name;
    private final List<Object> attribute = new LinkedList<>();

    public AttributesCategory() {
        // empty
    }

//    @JsonGetter(value = "@attributes")
//    public Map<String, String> getName() {
//        return this.name;
//    }

    public String getName() {
        return this.name;
    }

    //    @JsonGetter(value = "attribute")
    public List<Object> getAttribute() {
        return this.attribute;
    }
}
