package component_scan_filter.main;

import component_scan_filter.app.entity.Product;
import lombok.ToString;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
    basePackages = "component_scan_filter.app",
    excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Product.class)
)
@ToString
public class AppConfig {

}
