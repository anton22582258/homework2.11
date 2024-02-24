package com.example.homework21.homework2.demo.controller;

import com.example.homework21.homework2.demo.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping()
    public String greeting() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return String.format("%s + %s = %s", a, b, service.plus(a, b));
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = service.minus(a, b);
        return String.format("%s - %s = %s", a, b, result);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = service.multiply(a, b);
        return String.format("%s * %s = %s", a, b, result);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        try {
            int result = service.divide(a, b);
            return String.format("%s / %s = %s", a, b, result);
        } catch (RuntimeException e) {
            return "На ноль делить нельзя";
        }
    }
}
