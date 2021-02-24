package annotation_config_application_context.register_usage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ProductFactory.class);
        context.refresh();

        Product productA = context.getBean("productA", Product.class);
        System.out.println("productA: " + productA);
    }
}
