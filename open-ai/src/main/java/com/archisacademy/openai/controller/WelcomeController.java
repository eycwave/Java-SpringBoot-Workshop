package com.archisacademy.openai.controller;

import com.archisacademy.openai.service.WelcomeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    private final WelcomeService welcomeService;
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }


    @PostMapping("/name")
    public String namePlace(@RequestBody String name){
        return welcomeService.response(name);
    }

    @GetMapping("/{name}")
    public String nameField(@PathVariable(name = "name") String name){
        return welcomeService.response(name);
    }

}
