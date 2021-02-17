package property_collection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import property_collection.entity.Order;

@Slf4j
public class Main01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property_collection/context.xml");

        Order order1 = context.getBean("order1", Order.class);
        log.info("order1: {}", order1);
    }
}
