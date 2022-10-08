package bean_injection.with_interface_type_bean;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@Slf4j
public class Application {

    @Bean
    public BookOrder order1() {
        return new BookOrder();
    }

    @Bean
    public BookOrder order2() {
        return new BookOrder();
    }

    @Autowired
    @Getter
    private BookOrder order1;

    @Autowired
    @Getter
    private Order order2;

    @Autowired
    @Qualifier("order2")
    @Getter
    private BookOrder order3;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        System.out.printf("order1: %s", context.getBean(Application.class).getOrder1());
        System.out.printf("order2: %s", context.getBean(Application.class).getOrder2());
        System.out.printf("order3: %s", context.getBean(Application.class).getOrder3());
    }
}
