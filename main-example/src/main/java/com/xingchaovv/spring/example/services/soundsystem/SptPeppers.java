package com.xingchaovv.spring.example.services.soundsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SptPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public SptPeppers() {
        log.info("Built The SptPeppers.");
    }

    @Override
    public void play() {
        log.info("Playing %s by %s\n", title, artist);
    }
}
