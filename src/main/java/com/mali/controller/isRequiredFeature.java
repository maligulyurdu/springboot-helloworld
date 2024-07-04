package com.mali.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class isRequiredFeature {

    @GetMapping({"/message1","/message1/{message}"}) // Both of end-points are available.
    public String getMyMessageWithVariable(@PathVariable(name = "message", required = false) String message){
        return "Your message is: " + message;
    }

    @GetMapping("/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message", required = false, defaultValue = "Default message by mali") String message){
        return "Your message is: " + message;
    }
}



