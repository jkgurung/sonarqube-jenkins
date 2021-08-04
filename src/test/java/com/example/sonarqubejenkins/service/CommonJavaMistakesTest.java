package com.example.sonarqubejenkins.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonJavaMistakesTest {

    private CommonJavaMistakes commonJavaMistakes;

    @BeforeEach
    void setUp() {
        commonJavaMistakes = new CommonJavaMistakes();
    }
    @Test
    void goodExampleGC() {
        commonJavaMistakes.goodExampleGC();
    }

    @Test
    void badExampleComparingDiffType() {
        boolean results = commonJavaMistakes.goodExampleComparingDiffType("1234567");
        assertTrue(results);
    }
}