package com.xingchaovv.spring.demo01.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xingchao Zhang
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world!";
    }
}
