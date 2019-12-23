package com.example.demo.java;

import org.springframework.web.bind.annotation.GetMapping;

public class HeoolWorld {
    @GetMapping
    public String helloworld(){
        return "hello, world!!!";
    }
}
