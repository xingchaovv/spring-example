package com.xingchaovv.spring.demo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.actuate.autoconfigure.web.server.ConditionalOnManagementPort;
import org.springframework.stereotype.Component;

@Component
public class Command implements CommandLineRunner {

    @Autowired
    private DataSourceOne dataSourceOne;

    @Override
    public void run(String... args) throws Exception {
        dataSourceOne.showConnection();
    }
}