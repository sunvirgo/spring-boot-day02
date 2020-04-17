package com.example.springbootday02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明:
 *
 * @Author: 黄刚
 * @Date: 2020/4/17 13:02
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello!";
    }
}
