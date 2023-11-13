package example;

import example.web.filter.InitialIdentityFilter;
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
    public FilterRegistrationBean<InitialIdentityFilter> initialIdentityFilterRegistrationBean() {
        FilterRegistrationBean<InitialIdentityFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new InitialIdentityFilter());
        return bean;
    }
}
