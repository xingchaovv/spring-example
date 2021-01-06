package chao.spring.example.bean.wire.xmlconfig.soundsystem;

import chao.spring.example.bean.wire.javaconfig.soundsystem.CompactDisc;
import chao.spring.example.bean.wire.javaconfig.soundsystem.MediaPlayer;

public class CDPlayer implements MediaPlayer {

    private final chao.spring.example.bean.wire.javaconfig.soundsystem.CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
