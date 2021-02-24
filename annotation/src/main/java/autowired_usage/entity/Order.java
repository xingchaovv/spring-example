package autowired_usage.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Order {

    private final Product product;

    @Autowired
    public Order(Product product) {
        this.product = product;
    }
}
