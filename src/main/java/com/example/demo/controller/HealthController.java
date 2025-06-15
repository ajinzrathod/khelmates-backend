package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {
    @GetMapping({"/", ""})
    public String ok() {
        return "OK";
    }

    @GetMapping({"health", "health/"})
    public String health() {
        return "OK";
    }
}
