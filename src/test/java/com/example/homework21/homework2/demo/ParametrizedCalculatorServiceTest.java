package com.example.homework21.homework2.demo;

import com.example.homework21.homework2.demo.service.CalculatoServiceImpl;
import com.example.homework21.homework2.demo.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParametrizedCalculatorServiceTest {
    CalculatorService calculatorService = new CalculatoServiceImpl();
    static Stream<Arguments> data () {
        return Stream.of(
        Arguments.of(2, 4),
        Arguments.of( 6, 5),
        Arguments.of(27, -12),
        Arguments.of( -124, -543));
    }
    @ParameterizedTest
    @MethodSource ("data")
    void plus (int a, int b) {
        int expected = a + b;
        Assertions.assertEquals(expected, calculatorService.plus(a, b));
    }
    @ParameterizedTest
    @MethodSource ("data")
    void minus (int a, int b) {
        int expected = a - b;
        Assertions.assertEquals(expected, calculatorService.minus(a, b));
    }
    @ParameterizedTest
    @MethodSource ("data")
    void multiply (int a, int b) {
        int expected = a * b;
        Assertions.assertEquals(expected, calculatorService.multiply(a, b));
    }
    @ParameterizedTest
    @MethodSource ("data")
    void divide (int a, int b) throws Exception {
        int expected = a / b;
        Assertions.assertEquals(expected, calculatorService.divide(a, b));
    }
}
