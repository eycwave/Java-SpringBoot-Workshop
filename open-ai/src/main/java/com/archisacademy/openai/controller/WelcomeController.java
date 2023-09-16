package com.archisacademy.openai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class WelcomeController {

    @PostMapping("/name")
    public String namePlace(@RequestBody String name){
        return null;
    }

    @GetMapping("/{name}")
    public String nameField(@PathVariable(name = "name") String name){
        return null;
    }

}
