package com.mali.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    //localhost:8080/api/hello

    // GET: When we want to see the data. @GetMapping
    // POST: When we want to save the data. @PostMapping
    // PUT: When we want to update the data. @PutMapping
    // PATCH: When we want to update the part of the data. @PatchMapping
    //       for example: want update the password.
    // DELETE: When we want to delete the data. @DeleteMapping


    // @RequestMapping(path = "/hello", method = RequestMethod.GET) -> Same with bottom line
    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @PostMapping("/save") // You can also use path = "/hello"
    public String save(){
        return "Data saved!";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted!";
    }


}

