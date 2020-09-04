package com.imagedental.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @GetMapping("/from1c")
    public String from1c(Model model) {
        return "YES";
    }
}
