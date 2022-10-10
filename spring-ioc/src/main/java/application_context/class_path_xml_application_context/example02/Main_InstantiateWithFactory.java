package application_context.class_path_xml_application_context.example02;

import application_context.class_path_xml_application_context.example02.dao.LegacyOrderDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main_InstantiateWithFactory {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "bean_instantiate/context_static_method.xml"
        );

        LegacyOrderDao daoByStaticMethod = context.getBean("daoByStaticMethod", LegacyOrderDao.class);
        log.info("daoByStaticMethod: {}", daoByStaticMethod);
    }
}
