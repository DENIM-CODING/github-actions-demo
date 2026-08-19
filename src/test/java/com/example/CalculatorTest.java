package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(10, calculator.add(4, 6));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(4, calculator.subtract(10, 6));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(24, calculator.multiply(4, 6));
    }
    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(5, calculator.divide(10, 2));
    }
}