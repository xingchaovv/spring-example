package com.example.spring.web.mapper;

import com.example.spring.web.entity.Book;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookMapper implements InitializingBean {

    private List<Book> books;

    public void afterPropertiesSet() {
        books = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 1; i <= 100; i++) {
            books.add(new Book(faker));
        }
    }

    public List<Book> getAll(Integer limitSize) {
        return books.subList(0, limitSize);
    }
}
