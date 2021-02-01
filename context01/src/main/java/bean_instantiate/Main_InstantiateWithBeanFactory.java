package bean_instantiate;

import bean_instantiate.dao.LegacyOrderDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main_InstantiateWithBeanFactory {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "bean_instantiate/context_bean_factory.xml"
        );

        LegacyOrderDao daoByBeanFactory = context.getBean("daoByBeanFactory", LegacyOrderDao.class);
        log.info("daoByBeanFactory: {}", daoByBeanFactory);
    }
}
