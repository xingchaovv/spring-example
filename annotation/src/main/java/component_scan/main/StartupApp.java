package component_scan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import component_scan.app.entity.Order;

@SpringBootApplication
public class StartupApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StartupApp.class, args);

        Order order = context.getBean(Order.class);
        System.out.println("order: " + order);
    }
}
