package component_scan_xml.main;

import component_scan_xml.shop.entity.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class StartupApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StartupApp.class, args);

        ApplicationContext shopContext = new ClassPathXmlApplicationContext("component_scan_xml/shopContext.xml");

        Order order = shopContext.getBean(Order.class);
        System.out.println("order: " + order);
    }
}
