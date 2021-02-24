package resource_usage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import resource_usage.entity.Order;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        System.out.println("Built context.");

        Order order = context.getBean("order", Order.class);
        System.out.println("Bean for order: " + order);
    }
}
