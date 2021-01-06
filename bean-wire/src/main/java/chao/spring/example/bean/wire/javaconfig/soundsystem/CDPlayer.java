package chao.spring.example.bean.wire.javaconfig.soundsystem;

public class CDPlayer implements MediaPlayer {

    private final CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
