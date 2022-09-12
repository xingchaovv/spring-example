package com.example.spring.web.controller;

import com.example.spring.web.entity.Book;
import com.example.spring.web.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<Book> list(@RequestParam  Integer limitSize) {
        return bookMapper.getAll(limitSize);
    }
}
