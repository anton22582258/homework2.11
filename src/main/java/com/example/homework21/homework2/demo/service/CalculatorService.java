package com.example.homework21.homework2.demo.service;

import com.example.homework21.homework2.demo.exception.DivisionByZeroException;

public interface CalculatorService {
    public int plus(int num1, int num2);

    public int minus(int num1, int num2);

    public int multiply(int num1, int num2);

    public int divide(int num1, int num2) throws DivisionByZeroException;
}
