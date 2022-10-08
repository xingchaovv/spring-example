package bean_injection.by_constructor;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
@Slf4j
public class Order {

    public static Integer num = 0;

    public String name = "Order-" + ++num;
    private final Product product1;
    private final Product product2;

    @Autowired
    public Order(Product product1, Product product2) {
        this.product1 = product1;
        this.product2 = product2;
    }

    {
        log.info("In init method of {}", name);
    }
}
