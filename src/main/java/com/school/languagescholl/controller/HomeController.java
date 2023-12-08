package com.school.languagescholl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    public HomeController() {
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/confirmlogout")
    public String logout() {
        return "/confirmlogout";
    }



    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/students")
    public String students (){
        return "/students";
    }

}

