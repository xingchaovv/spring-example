package using_idref;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import using_idref.entity.Order;

@Slf4j
public class Main01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("using_idref/context.xml");

        Order order1 = context.getBean("order1", Order.class);
        log.info("order1: {}", order1);
    }
}
