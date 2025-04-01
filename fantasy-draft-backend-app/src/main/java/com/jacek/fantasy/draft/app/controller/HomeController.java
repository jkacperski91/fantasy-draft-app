package com.jacek.fantasy.draft.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String test() {
        return "This is a test";
    }
}
