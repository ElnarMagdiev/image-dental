package com.imagedental.controllers;

import com.imagedental.entities.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

//    @GetMapping("/")
//    public String index(@AuthenticationPrincipal User user, Model model) {
//        model.addAttribute("username", user.getUsername());
//        return "index";
//    }

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/settings")
    public String settings(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("username", user.getUsername());
        return "settings";
    }
}
