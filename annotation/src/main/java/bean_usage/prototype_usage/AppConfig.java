package bean_usage.prototype_usage;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import javax.annotation.Resource;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Order order() {
        return new Order();
    }

    @Resource
    private Order orderA;

    @Resource
    private Order orderB;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig appConfig = context.getBean(AppConfig.class);
        System.out.println("order: " + appConfig.orderA);
        System.out.println("order: " + appConfig.orderB);

        System.out.println("order: " + context.getBean(Order.class));
        System.out.println("order: " + context.getBean(Order.class));
    }
}
