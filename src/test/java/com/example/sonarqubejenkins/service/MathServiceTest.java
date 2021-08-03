package com.example.sonarqubejenkins.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {

    private MathService mathService;

    @BeforeEach
    void setUp() {
        mathService = new MathService();
    }

    @Test
    public void multipleNumbers() {
        int results = mathService.multiply(3, 5);

        assertEquals(15, results);
    }
}