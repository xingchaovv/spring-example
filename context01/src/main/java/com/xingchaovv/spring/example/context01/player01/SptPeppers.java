package com.xingchaovv.spring.example.context01.player01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SptPeppers implements CD {

    public SptPeppers() {
        log.info("In the construct of SptPeppers.");
    }

    @Override
    public void play() {
        log.info("In the method play of SptPeppers.");
    }
}
