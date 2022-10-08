package bean_factory.default_listable_bean_factory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

import java.util.Map;

public class Main02 {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        GenericBeanDefinition definition = new GenericBeanDefinition();
        definition.setBeanClass(Order.class);
        factory.registerBeanDefinition("order1", definition);

        GenericBeanDefinition definition2 = new GenericBeanDefinition();
        definition2.setBeanClass(Order.class);
        factory.registerBeanDefinition("order2", definition2);

        Map<String, Order> orders1 = factory.getBeansOfType(Order.class);
        System.out.printf("orders1: %s", orders1);

        Class<?> order1Type = factory.getType("order1");
        System.out.printf("orders: %s", order1Type);
    }
}
