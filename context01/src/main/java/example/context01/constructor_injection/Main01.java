package example.context01.constructor_injection;

import example.context01.constructor_injection.entity.Car;
import example.context01.constructor_injection.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injection/context.xml");

        Order order = context.getBean(Order.class);
        log.info("order: {}", order);

        Car myCar = context.getBean("myCar", Car.class);
        log.info("myCar: {}", myCar);

        Car mySecondCar = context.getBean("mySecondCar", Car.class);
        log.info("mySecondCar: {}", mySecondCar);

        Car myThirdCar = context.getBean("myThirdCar", Car.class);
        log.info("myThirdCar: {}", myThirdCar);
    }
}
