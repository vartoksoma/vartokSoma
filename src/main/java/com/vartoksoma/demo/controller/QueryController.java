package com.vartoksoma.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {
    @GetMapping("/")
    public String listUsers(){
        return "index";
    }
}
