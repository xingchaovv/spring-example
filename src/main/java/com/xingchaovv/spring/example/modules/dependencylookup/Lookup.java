package com.xingchaovv.spring.example.modules.dependencylookup;

import com.xingchaovv.spring.example.modules.dependencylookup.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class Lookup implements InitializingBean {

    public void afterPropertiesSet() {
        // 配置 XML 文件
        // 启动 Spring 上下文
        ListableBeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        User user1 = (User) beanFactory.getBean("user1");
        log.info(user1.toString());

        // 根据类型查找
        // User user = beanFactory.getBean(User.class);
        // log.info(user.toString());

        // 集合查找
        Map<String, User> users = beanFactory.getBeansOfType(User.class);
        log.info(users.toString());
    }
}
