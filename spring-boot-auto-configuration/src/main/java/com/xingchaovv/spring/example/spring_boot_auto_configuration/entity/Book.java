package com.xingchaovv.spring.example.spring_boot_auto_configuration.entity;

import com.github.javafaker.Faker;

public class Book extends com.github.javafaker.Book {

    public Book(Faker faker) {
        super(faker);
    }

    public String getTitle() {
        return super.title();
    }

    public String getAuthor() {
        return super.author();
    }

    public String getPublisher() {
        return super.publisher();
    }
}
