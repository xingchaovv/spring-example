package soundsystem2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayer2Test {

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
    }
}
