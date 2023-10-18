package example;

import example.web.filter.CamelParamRequestFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public FilterRegistrationBean<CamelParamRequestFilter> camelParamRequestFilterFilterRegistrationBean() {
        FilterRegistrationBean<CamelParamRequestFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new CamelParamRequestFilter());
        return bean;
    }
}
