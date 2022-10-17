package com.xingchaovv.spring.example.spring_boot_auto_configuration;

import com.xingchaovv.spring.example.spring_boot_auto_configuration.mapper.BookMapper;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AutoConfiguration
@ConditionalOnClass(name = "com.xingchaovv.spring.example.spring_boot_auto_configuration.mapper.BookMapper2")
public class BookMapperAutoConfiguration {

    @Configuration
    public static class BookMapperConfiguration {

        @Bean
        public BookMapper bookMapper() {
            return new BookMapper();
        }
    }
}
