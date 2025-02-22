package com.springboot.MVCcontroler;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
         model.addAttribute("message","Hello from Bridgelabz!");
         return "hello";
    }

}
