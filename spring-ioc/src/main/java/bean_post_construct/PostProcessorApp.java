package bean_post_construct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PostProcessorApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PostProcessorApp.class, args);

        Config config = context.getBean(Config.class);
        System.out.println("config: " + config);
    }
}
