package bean_usage.alias_usage;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import javax.annotation.Resource;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean({"myOrder", "theOrder"})
    @Description("Has multiple names")
    public Order order() {
        return new Order();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("order: " + context.getBean(Order.class));
        System.out.println("order: " + context.getBean("myOrder"));
        System.out.println("order: " + context.getBean("theOrder"));
    }
}
