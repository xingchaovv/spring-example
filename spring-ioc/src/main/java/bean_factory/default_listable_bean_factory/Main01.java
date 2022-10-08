package bean_factory.default_listable_bean_factory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class Main01 {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        GenericBeanDefinition definition = new GenericBeanDefinition();
        definition.setBeanClass(Order.class);
        factory.registerBeanDefinition("order1", definition);

        System.out.printf("order: %s\n", factory.getBean(Order.class));

        System.out.printf("order: %s\n", factory.getBean("order1"));
    }
}
