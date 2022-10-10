package application_context.class_path_xml_application_context.example01;

import application_context.class_path_xml_application_context.example01.dao.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "bean_instantiate/context_bean_factory.xml"
        );

        Order daoByBeanFactory = context.getBean("daoByBeanFactory", Order.class);
        log.info("daoByBeanFactory: {}", daoByBeanFactory);
    }
}
