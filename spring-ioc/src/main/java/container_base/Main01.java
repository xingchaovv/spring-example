package container_base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "container_base/service.xml", "container_base/dao.xml"
        );
    }
}
