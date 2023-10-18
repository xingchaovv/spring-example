package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
/**
 * 组件扫描注解，扫描到组件 UserManager
 */
@ComponentScan
public class Application {

    public static void main(String[] args) {
        /**
         * 支持注解配置的应用上下文 ApplicationContext
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        /**
         * 通过 Class 获取 Bean 实例
         */
        UserManager userManager = context.getBean(UserManager.class);
        // userManager: UserManager{}
        System.out.println("userManager: " + userManager);
    }
}
