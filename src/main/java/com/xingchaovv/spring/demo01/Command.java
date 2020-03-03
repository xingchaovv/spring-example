package com.xingchaovv.spring.demo01;

import com.xingchaovv.spring.demo01.datasource.DataSourceOne;
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