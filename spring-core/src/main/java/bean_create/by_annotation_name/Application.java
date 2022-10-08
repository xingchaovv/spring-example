package bean_create.by_annotation_name;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@Slf4j
public class Application {

    @Bean({"myOrder", "currentOrder"})
    public Order order() {
        return new Order();
    }

    @Bean("secondOrder")
    public Order secondOrder() {
        return new Order();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        System.out.println("myOrder: " + context.getBean("myOrder"));
        System.out.println("currentOrder: " + context.getBean("currentOrder"));
        System.out.println("secondOrder: " + context.getBean("secondOrder"));
    }
}
