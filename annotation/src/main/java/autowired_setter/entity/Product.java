package autowired_setter.entity;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Random;

@Configuration
@ToString
public class Product {

    public String name = "Product(" + new Random().nextInt(99999) + ")";

    @Bean(name="productA")
    public Product getProductA() {
        return new Product();
    }

    @Bean(name="productB")
    public Product getProductB() {
        return new Product();
    }
}
