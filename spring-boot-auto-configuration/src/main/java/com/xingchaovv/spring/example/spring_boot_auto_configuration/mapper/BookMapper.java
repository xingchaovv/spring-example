package com.xingchaovv.spring.example.spring_boot_auto_configuration.mapper;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class BookMapper {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookMapper(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void test1() {
        DataSource dataSource = jdbcTemplate.getDataSource();
        System.out.printf("dataSource: {}", dataSource);
    }
}
