package com.concerto.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    public HomeController(){
        System.out.println("Home controller constructor");
    }
    @RequestMapping("/greet")
    public String greet(){
        System.out.println("greet");
        return "index";
    }
}

