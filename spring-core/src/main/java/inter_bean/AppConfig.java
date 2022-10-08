package inter_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public Product product() {
        return new Product();
    }

    @Bean
    public Order order() {
        return new Order(product());
    }

    @Resource Order order1;
    @Resource Order order2;

    @Resource Product product1;
    @Resource Product product2;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig appConfig = context.getBean(AppConfig.class);

        System.out.println("order1: " + appConfig.order1);
        System.out.println("order2: " + appConfig.order2);
        System.out.println("product1: " + appConfig.product1);
        System.out.println("product2: " + appConfig.product2);
    }
}
