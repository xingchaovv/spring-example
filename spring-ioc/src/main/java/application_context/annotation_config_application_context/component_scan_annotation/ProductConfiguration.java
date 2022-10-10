package application_context.annotation_config_application_context.component_scan_annotation;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ToString
public class ProductConfiguration {

    {
        System.out.println("In init method of ProductConfiguration.");
    }

    @Bean
    public Product productA() {
        System.out.println("In productA method of ProductConfiguration.");
        return new Product();
    }

    @Bean
    public Product productB() {
        System.out.println("In productB method of ProductConfiguration.");
        return new Product();
    }
}
