package annotation_config_application_context.register_usage;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ToString
public class ProductFactory {

    {
        System.out.println("In init method of ProductFactory.");
    }

    @Bean
    public Product productA() {
        System.out.println("In method: productA.");
        return new Product();
    }

    @Bean
    public Product productB() {
        System.out.println("In method: productB.");
        return new Product();
    }
}
