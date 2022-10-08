package soundsystem;

import chao.spring.example.bean.wire.javaconfig.soundsystem2.CompactDisc;
import chao.spring.example.bean.wire.javaconfig.soundsystem2.MediaPlayer;

public class CDPlayer implements MediaPlayer {

    private final chao.spring.example.bean.wire.javaconfig.soundsystem2.CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
