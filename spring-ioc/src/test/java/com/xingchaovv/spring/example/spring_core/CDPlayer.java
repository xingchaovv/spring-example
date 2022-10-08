package com.xingchaovv.spring.example.spring_core;

import bean_injection.example1.Book;
import bean_injection.example1.CDPlayerConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
class CDPlayer {

    @Autowired
    private Book cd;

    @Test
    public void test() {
        assertNotNull(cd);
        cd.read();
    }
}
