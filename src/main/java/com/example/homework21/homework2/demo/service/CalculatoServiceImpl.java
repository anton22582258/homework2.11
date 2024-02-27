package com.example.homework21.homework2.demo.service;

import com.example.homework21.homework2.demo.exception.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service

public class CalculatoServiceImpl implements CalculatorService {
    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }

}
