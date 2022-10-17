package com.xingchaovv.spring.example.spring_boot_auto_configuration.controller;

import com.xingchaovv.spring.example.spring_boot_auto_configuration.entity.Book;
import com.xingchaovv.spring.example.spring_boot_auto_configuration.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("book")
@Validated
public class BookController {

    private final BookMapper bookMapper;

    @Autowired
    public BookController(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @GetMapping("list")
    public List<Book> list() {
        DataSourceAutoConfiguration configuration = new DataSourceAutoConfiguration();
        CacheAutoConfiguration cacheAutoConfiguration = new CacheAutoConfiguration();

        bookMapper.test1();
        return null;
    }
}
