package com.fanqilong.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class hello {


    @GetMapping
    public String get() {
        return "Hello Docker World";
    }
}
