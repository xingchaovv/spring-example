package component_scan.app.entity;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ToString
public class Product {

    public static Integer num = 0;
    public String name = "Product(" + ++num + ")";

    @Bean
    public Product getProductA() {
        return new Product();
    }

    @Bean
    public Product getProductB() {
        return new Product();
    }
}
