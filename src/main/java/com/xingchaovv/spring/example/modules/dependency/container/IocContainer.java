package com.xingchaovv.spring.example.modules.dependency.container;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Ioc 容器
 */
@Import(IocContainer.book.class)
@Slf4j
public class IocContainer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(IocContainer.class);
        applicationContext.refresh();

        String article1 = (String) applicationContext.getBean("article1");
        log.info(article1);
        String article2 = (String) applicationContext.getBean("article2");
        log.info(article2);

        log.info(Arrays.asList(applicationContext.getBeanDefinitionNames()).toString());
    }

    @Bean(name = "article1")
    public String article() {
        return "This is xxx.";
    }

    public static class book {

        @Bean(name = "article2")
        public String article() {
            return "This is xxx.";
        }
    }
}
