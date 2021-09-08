package com.example.converter.models.objects.json.giata;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Climate implements Serializable {
    private static final long serialVersionUID = 1L;

    private String kind;
    private Integer id;
    private final Map<String, Integer> dayTemperature = new LinkedHashMap<>();
    private final Map<String, Integer> nightTemperature = new LinkedHashMap<>();
    private final Map<String, Integer> sunshine = new LinkedHashMap<>();
    private final Map<String, Integer> rainDay = new LinkedHashMap<>();
    private final Map<String, Integer> waterTemperature = new LinkedHashMap<>();

    public String getKind() {
        return this.kind;
    }

    public Integer getId() {
        return this.id;
    }

    public Climate() {
        // empty
    }

    @JsonGetter(value = "day_temperature")
    public Map<String, Integer> getDayTemperature() {
        return this.dayTemperature;
    }

    @JsonGetter(value = "night_temperature")
    public Map<String, Integer> getNightTemperature() {
        return this.nightTemperature;
    }

//    @JsonAnySetter
//    public void addNightTemperature(String key, Integer value) {
//        this.nightTemperature.put(key, value);
//    }

    @JsonGetter(value = "sunshine")
    public Map<String, Integer> getSunshine() {
        return this.sunshine;
    }

//    @JsonAnySetter
//    public void addSunshine(String key, Integer value) {
//        this.sunshine.put(key, value);
//    }

    @JsonGetter(value = "rainday")
    public Map<String, Integer> getRainDay() {
        return this.rainDay;
    }

//    @JsonAnySetter
//    public void addRainDay(String key, Integer value) {
//        this.rainDay.put(key, value);
//    }

    @JsonGetter(value = "water_temperature")
    public Map<String, Integer> getWaterTemperature() {
        return this.waterTemperature;
    }

//    @JsonAnySetter
//    public void addWaterTemperature(String key, Integer value) {
//        this.waterTemperature.put(key, value);
//    }
}
