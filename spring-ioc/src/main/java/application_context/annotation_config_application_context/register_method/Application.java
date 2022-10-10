package application_context.annotation_config_application_context.register_method;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Product.class);
        context.refresh();

        Product product = context.getBean(Product.class);
        System.out.println("product: " + product);
    }
}
