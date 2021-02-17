package property_ref;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import property_ref.entity.Order;
import property_ref.entity.Product;

@Slf4j
public class Main01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property_ref/context.xml");
        ApplicationContext childContext = new ClassPathXmlApplicationContext(new String[]{"property_ref/child_context.xml"}, context);

        Product productC = context.getBean("productC", Product.class);
        log.info("productC: {}", productC);

        Order order1 = context.getBean("order1", Order.class);
        log.info("order1: {}", order1);

        Order order2 = childContext.getBean("order2", Order.class);
        log.info("order2: {}", order2);
    }
}
