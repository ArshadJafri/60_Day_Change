package com.example.to_do_list;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class message {

    @GetMapping("/msg")
    public String msg(){
        return "Its here";
    }
}
