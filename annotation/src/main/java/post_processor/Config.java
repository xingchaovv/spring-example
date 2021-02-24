package post_processor;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
@ToString
public class Config {

    private String cacheName;

    @PostConstruct
    private void initCacheName() {
        cacheName = "myConfig";
        System.out.println("In initCacheName.");
    }

    @PreDestroy
    private void clearCacheName() {
        cacheName = null;
        System.out.println("In clearCacheName.");
    }
}
