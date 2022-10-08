package primary_bean;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Random;

@Configuration
@ToString
public class Product {

    public String name = "Product(" + new Random().nextInt(99999) + ")";

    @Bean
    @Primary
    public Product getProductA() {
        return new Product();
    }

    @Bean
    public Product getProductB() {
        return new Product();
    }
}
