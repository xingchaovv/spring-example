package com.xingchaovv.spring.example.spring_boot_auto_configuration.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

public class BookMapper {

    public void test1() {
        System.out.printf("In method test1.\n");
    }
}
