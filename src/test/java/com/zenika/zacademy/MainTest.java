package com.zenika.zacademy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.*;
import static com.zenika.zacademy.Main.getFizzBuzzValue;

class MainTest {
    // Cas passant
    @Nested
    class CheckPassingCases {
        @Test
        void shouldReturnFizzIfValueDivisibleBy3() {
            String result = getFizzBuzzValue(9);
            assertEquals("Fizz", result);
        }

        @ParameterizedTest
        @ValueSource(ints = {5, 10, 20, 25, 35})
        void shouldReturnBuzzIfValueDivisibleBy5(int currentValue) {
            String result = getFizzBuzzValue(currentValue);
            assertEquals("Buzz", result);
        }


        @ParameterizedTest
        @ValueSource(ints = {15, 30, 45, 60, 75, 90})
        void shouldReturnFizzBuzzIfValueDivisibleBy15(int currentValue) {
            String result = getFizzBuzzValue(currentValue);
            assertEquals("FizzBuzz", result);
        }

        @Test
        void shouldReturnInputIfOtherwise() {
            int inputNumber = 8;
            String result = getFizzBuzzValue(inputNumber);
            assertEquals(String.valueOf(inputNumber), result);
        }
    }
//    Cas non passant
//    @Test
//    void shouldThrowExceptionIfValueIsNotNumber() {
//        assertThrows(Exception.class, () -> {});
//    }

    @Test
    void shouldThrowExceptionIfValueInferiorTo1() {
        Exception exception = assertThrows(Exception.class, () -> {
            getFizzBuzzValue(0);
        });
        assertEquals("La valeur doit être supérieur à 0 !", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionIfValueIsSuperiorTo100() {
        Exception exception = assertThrows(Exception.class, () -> {
            getFizzBuzzValue(105);
        });
        assertEquals("La valeur doit être inférieur à 101 !", exception.getMessage());
    }
}