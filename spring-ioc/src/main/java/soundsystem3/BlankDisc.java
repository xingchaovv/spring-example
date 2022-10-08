package soundsystem3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        log.info("Playing {} by {}", title, artist);
    }
}
