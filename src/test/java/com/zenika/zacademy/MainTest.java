package com.zenika.zacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.zenika.zacademy.Main.getFizzBuzzValue;

class MainTest {
    // Cas passant
    @Test
    void shouldReturnFizzIfValueDivisibleBy3() {
        String result = getFizzBuzzValue(9);
        assertEquals("Fizz", result);
    }

    @Test
    void shouldReturnBuzzIfValueDivisibleBy5() {
        String result = getFizzBuzzValue(10);
        assertEquals("Buzz", result);
    }

    @Test
    void shouldReturnFizzBuzzIfValueDivisibleBy15() {
        String result = getFizzBuzzValue(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void shouldReturnInputIfOtherwise() {
        int inputNumber = 8;
        String result = getFizzBuzzValue(inputNumber);
        assertEquals(String.valueOf(inputNumber), result);
    }
    //Cas non passant
//    @Test
//    void shouldThrowExceptionIfValueIsNotNumber() {
//        assertThrows(Exception.class, () -> {});
//    }

    @Test
    void shouldThrowExceptionifValueInferiorTo1() {
        assertThrows(Exception.class, () -> {
            getFizzBuzzValue(0);
        });

    }

    @Test
    void shouldThrowExceptionIfValueIsSuperiorTo100() {
        assertThrows(Exception.class, () -> {
            getFizzBuzzValue(105);
        });

    }
}