package com.xingchaovv.spring.demo01.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SptPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public SptPeppers() {
        System.out.println("Built one SptPeppers.");
    }

    @Override
    public void play() {
        System.out.printf("Playing %s by %s\n", title, artist);
    }
}
