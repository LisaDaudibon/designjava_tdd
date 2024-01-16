package com.zenika.zacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    // Cas passant
    @Test
    void shouldReturnFizzIfValueDivisibleBy3() {
        assertEquals("Fizz", result);
    }

    @Test
    void shouldReturnBuzzIfValueDivisibleBy5() {

    }

    @Test
    void shouldReturnFizzBuzzIfValueDivisibleBy15() {

    }

    @Test
    void shouldReturnInputIfOtherwise() {

    }
    //Cas non passant
    @Test
    void shouldThrowExceptionIfValueIsNotNumber() {

    }

    @Test
    void shouldThrowExceptionifValueInferiorTo1() {

    }

    @Test
    void shouldThrowExceptionIfValueIsSuperiorTo100() {

    }
}