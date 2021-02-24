package value_usage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:value_usage/application.properties"})
public class ValueUsageApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ValueUsageApp.class, args);

        Config config = context.getBean(Config.class);
        System.out.println("config: " + config);
    }
}
