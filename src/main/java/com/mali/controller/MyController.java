package com.mali.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    @GetMapping("/message/{message}")
    public String getMyMessage(@PathVariable String message){
        return "Your message is: " +message;
    }

}

