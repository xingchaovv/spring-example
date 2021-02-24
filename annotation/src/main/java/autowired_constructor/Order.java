package autowired_constructor;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Order {

    {
        System.out.printf("In init method of Order-%d", num);
    }

    public static Integer num = 0;
    public String name = "Order-" + ++num;
    private Product product;

    @Autowired
    public Order(Product product) {
        this.product = product;
    }
}
