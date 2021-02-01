package com.xingchaovv.spring.example.context01.setter_injection;

import com.xingchaovv.spring.example.context01.setter_injection.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setter_injection/context.xml");

        Order order1 = context.getBean("order1", Order.class);
        log.info("order1: {}", order1);

        Order order2 = context.getBean("order2", Order.class);
        log.info("order2: {}", order2);
    }
}
