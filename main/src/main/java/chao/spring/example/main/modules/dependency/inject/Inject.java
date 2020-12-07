package chao.spring.example.main.modules.dependency.inject;

import chao.spring.example.main.modules.dependency.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Inject implements InitializingBean {

    public void afterPropertiesSet() {
        // 配置 XML 文件
        // 启动 Spring 上下文
        ListableBeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-inject-context.xml");

        UserRepository userRepository = beanFactory.getBean("userRepository", UserRepository.class);
        log.info(userRepository.getUsers().toString());

        log.info(String.valueOf(userRepository.getBeanFactory() == beanFactory));
    }
}
