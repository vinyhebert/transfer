package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloController {

    @GetMapping("hello1")
    public String getHello() {
        return  "Olá turma 01";
    }

    @GetMapping("hello2")
    public String getHello2() {
        return  "Olá turma 02";
    }

    @PostMapping("hello")
    public String getHello3(){
        return "Post";
    }
}
