package init_method;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(initMethod = "showName", destroyMethod = "sayBye")
    public Order order() {
        return new Order();
    }

    @Bean
    public Product product() {
        return new Product();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("order: " + context.getBean(Order.class));
        System.out.println("product: " + context.getBean(Product.class));
        context.close();
    }
}
