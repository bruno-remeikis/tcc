package com.remeikis.tcc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class Health {

    @GetMapping
    public String getHealth() {
        return "API is running.";
    }
}
