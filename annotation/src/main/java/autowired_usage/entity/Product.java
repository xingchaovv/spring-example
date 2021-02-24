package autowired_usage.entity;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Random;

@Configuration
@ToString
public class Product {

    public String name = "Product(" + new Random().nextInt(99999) + ")";

    @Bean
    public static Product getProductA() {
        return new Product();
    }

    @Bean
    public static Product getProductB() {
        return new Product();
    }
}
