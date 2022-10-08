package resource_annotation;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ToString
@Lazy
public class ProductFactory {

    {
        System.out.println("In instance init of ProductFactory.");
    }

    @Bean
    public Product getProductA() {
        System.out.println("In getProductA.");
        return new Product();
    }

    @Bean
    public Product getProductB() {
        System.out.println("In getProductB.");
        return new Product();
    }
}
