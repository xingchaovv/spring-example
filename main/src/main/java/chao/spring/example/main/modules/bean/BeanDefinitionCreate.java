package chao.spring.example.main.modules.bean;

import chao.spring.example.main.modules.dependency.domain.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class BeanDefinitionCreate implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(User.class);
        MutablePropertyValues values = new MutablePropertyValues();
        values.addPropertyValue("id", 101);
        beanDefinition.setPropertyValues(values);
    }
}
