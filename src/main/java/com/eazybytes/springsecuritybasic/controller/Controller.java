package com.eazybytes.springsecuritybasic.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/print")
    public static String printSomething()
    {
        return "This is something";
    }
}
