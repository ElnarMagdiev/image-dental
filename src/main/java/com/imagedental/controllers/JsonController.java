package com.imagedental.controllers;

import com.imagedental.entities.Order;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JsonController {

    @RequestMapping(
            value = "/from1c"
            , method = RequestMethod.POST
    )
    public String from1c(@RequestBody List<Order> orders) {
        System.out.println("YES");
        return "YES";
    }
}
