package com.example.homework21.homework2.demo;

import com.example.homework21.homework2.demo.exception.DivisionByZeroException;
import com.example.homework21.homework2.demo.service.CalculatoServiceImpl;
import com.example.homework21.homework2.demo.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatoServiceImpl();

    @Test
    void plusPositive() {
        int a = 10;
        int b = 5;
        int actual = calculatorService.plus(a, b);
        Assertions.assertEquals(15, actual);
    }

    @Test
    void plusNegative() {
        int a = -10;
        int b = -5;
        int actual = calculatorService.plus(a, b);
        Assertions.assertEquals(-15, actual);
    }

    @Test
    void minusPositive() {
        int a = 10;
        int b = 5;
        int actual = calculatorService.minus(a, b);
        Assertions.assertEquals(5, actual);
    }

    @Test
    void minusNegative() {
        int a = -10;
        int b = -5;
        int actual = calculatorService.minus(a, b);
        Assertions.assertEquals(-5, actual);
    }

    @Test
    void multiplyPositive() {
        int a = 10;
        int b = 5;
        int actual = calculatorService.multiply(a, b);
        Assertions.assertEquals(50, actual);
    }

    @Test
    void multiplyNegative() {
        int a = -10;
        int b = -5;
        int actual = calculatorService.multiply(a, b);
        Assertions.assertEquals(50, actual);
    }

    @Test
    void dividePositive() {
        int a = 10;
        int b = 5;
        int actual = calculatorService.divide(a, b);
        Assertions.assertEquals(2, actual);
    }

    @Test
    void divideNegative() {
        int a = -10;
        int b = -5;
        int actual = calculatorService.divide(a, b);
        Assertions.assertEquals(2, actual);
    }

    @Test
    void divisionByZero() {
        Assertions.assertThrows(DivisionByZeroException.class, () -> {
            calculatorService.divide(10, 0);
        });
    }
}
