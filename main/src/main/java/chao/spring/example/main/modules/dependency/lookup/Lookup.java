package chao.spring.example.main.modules.dependency.lookup;

import chao.spring.example.main.modules.dependency.domain.User;
import chao.spring.example.main.modules.dependency.annotation.Super;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class Lookup implements InitializingBean {

    @SuppressWarnings("unchecked")
    public void afterPropertiesSet() {
        // 配置 XML 文件
        // 启动 Spring 上下文
        ListableBeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        User user1 = (User) beanFactory.getBean("user1");
        log.info(user1.toString());

        User sameUser1 = (User) beanFactory.getBean("sameUser1");
        log.info("Same user: " + (user1 == sameUser1));

        // 根据类型查找
        // User user = beanFactory.getBean(User.class);
        // log.info(user.toString());

        // 集合查找
        Map<String, User> users1 = beanFactory.getBeansOfType(User.class);
        log.info(users1.toString());

        // 通过注解查找
        Map<String, User> users2 = (Map) beanFactory.getBeansWithAnnotation(Super.class);
        log.info(users2.toString());
    }
}
