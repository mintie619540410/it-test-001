package com.itcast.ittest001.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    public void test(){
        System.out.println("hello git");
        System.out.println("master test");
        System.out.println("hot-fix edit test");
        System.out.println("test 001");
        System.out.println("test 002");
    }
}
