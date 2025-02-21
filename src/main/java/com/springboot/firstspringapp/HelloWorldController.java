package com.springboot.firstspringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping
    public String helloWorld() {
        return "Hello From BridgeLabz!!!";
    }

    @GetMapping ("goodbye")
    public String goodbye() {
        return "Goodbye From BridgeLabz!!!";
    }
}
