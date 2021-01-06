package chao.spring.example.bean.wire.xmlconfig.soundsystem;

import chao.spring.example.bean.wire.javaconfig.soundsystem.CompactDisc;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SptPeppers implements CompactDisc {

    public SptPeppers() {
        log.info("In construct of SptPeppers.");
    }

    @Override
    public void play() {
        String title = "Sgt. Pepper's Lonely Hearts Club Band";
        String artist = "The Beatles";
        log.info("Playing {} by {} in SptPeppers.\n", title, artist);
    }
}
