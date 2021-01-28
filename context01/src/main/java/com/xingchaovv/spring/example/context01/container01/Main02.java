package com.xingchaovv.spring.example.context01.container01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main02 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "container01/context.xml"
        );
    }
}
