package component_scan_xml.main;

import component_scan_xml.shop.entity.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:component_scan_xml/shopContext.xml")
public class StartupApp02 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StartupApp02.class, args);

        Order order = context.getBean(Order.class);
        System.out.println("order: " + order);
    }
}
