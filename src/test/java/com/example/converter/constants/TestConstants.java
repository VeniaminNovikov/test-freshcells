package com.example.converter.constants;

import java.time.LocalDate;

public class TestConstants {
    public static final String TEST_NAME = "Test Name";
    public static final String TEST_STRING = "Test String";
    public static final String TEST_TIMESTAMP = "2018-03-12 06:58:04";
    public static final Integer TEST_INT = 100500;
    public static final Double TEST_DOUBLE = 10.501d;
    public static final LocalDate TEST_START_DATE = LocalDate.MIN;
    public static final LocalDate TEST_END_DATE = LocalDate.MAX;

    private TestConstants() {
        // empty
    }
}
