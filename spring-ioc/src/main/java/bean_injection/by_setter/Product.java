package bean_injection.by_setter;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Random;

@Configuration
@ToString
public class Product {

    public String name = "Product(" + new Random().nextInt(99999) + ")";

    @Bean(name="productA")
    public Product productA() {
        return new Product();
    }

    @Bean(name="productB")
    public Product productB() {
        return new Product();
    }
}
