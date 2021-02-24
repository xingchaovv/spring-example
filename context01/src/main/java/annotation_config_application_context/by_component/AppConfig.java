package annotation_config_application_context.by_component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                LogHelper.class, UserController.class
        );

        UserController userController = context.getBean(UserController.class);
        System.out.println("userController: " + userController);
    }
}
