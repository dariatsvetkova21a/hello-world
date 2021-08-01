package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> greeting(@RequestParam("name") String name) {
        return new ResponseEntity<>("Hello, " + name, HttpStatus.OK);
    }
}
