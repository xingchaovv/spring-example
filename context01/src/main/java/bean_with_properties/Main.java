package bean_with_properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_with_properties/context.xml");
        MySystem mySystem = context.getBean(MySystem.class);
        System.out.println(mySystem);
    }
}
