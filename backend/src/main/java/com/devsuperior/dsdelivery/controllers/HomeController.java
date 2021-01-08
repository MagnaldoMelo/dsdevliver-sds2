package com.devsuperior.dsdelivery.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class HomeController {

    @GetMapping
    public String index(){
        return "Funcionando";
    }
}
