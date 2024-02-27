package com.example.homework21.homework2.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Делить на ноль нельзя")

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
        System.out.println("Делить на ноль нельзя");
    }

}


