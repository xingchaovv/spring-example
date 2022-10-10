package application_context.generic_application_context.example;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

@Configuration
public class Application {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        GenericApplicationContext context = new GenericApplicationContext(beanFactory);
        context.registerBean(Product.class);
        context.refresh();

        Product product = context.getBean(Product.class);
        System.out.println("product: " + product);
    }
}
