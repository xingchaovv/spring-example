package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private ConfigProperties configProperties;

    @Override
    public void run(String... args) {
        System.out.println(configProperties.getHostName());
        System.out.println(configProperties.getPort());
        System.out.println(configProperties.getFrom());
    }
}
