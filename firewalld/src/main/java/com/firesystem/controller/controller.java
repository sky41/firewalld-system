package com.firesystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping("/helloword")
    public String helloword(){
        return "helloword";
    }

}
