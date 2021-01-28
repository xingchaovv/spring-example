package com.xingchaovv.spring.example.spring_core;

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
    private CD cd;

    @Test
    public void test() {
        assertNotNull(cd);
        cd.play();
    }
}
