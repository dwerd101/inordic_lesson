package com.myweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/")
    public List<String> getHelloWorld() {
        return Arrays.asList("1","2","3");
    }
}
