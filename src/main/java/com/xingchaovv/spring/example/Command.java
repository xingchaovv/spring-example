package com.xingchaovv.spring.example;

import com.xingchaovv.spring.example.datasource.DataSourceOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Command implements CommandLineRunner {

    @Autowired
    private DataSourceOne dataSourceOne;

    @Override
    public void run(String... args) throws Exception {
        // dataSourceOne.showConnection();
    }
}