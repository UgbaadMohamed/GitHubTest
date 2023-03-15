package com.example.githubtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String index () {
        return "Hello world!";
    }


    //rebrand test

    //hhff

    //hhh


    //dette er den sidste test med merge 



}
