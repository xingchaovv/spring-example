package soundsystem2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SptPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(compactDisc());
    }

    @Bean
    public CDPlayer anotherCDPlayer() {
        return new CDPlayer(compactDisc());
    }
}
