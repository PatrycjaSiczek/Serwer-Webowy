package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//Zadanie 1
@RestController
public class TestController {
    @GetMapping("hello")
    public String test() {
        return "Hello world!";
    }
}
