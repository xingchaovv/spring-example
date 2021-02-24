package primary_usage.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Order {

    private Product product;

    @Autowired
    public void putProduct(Product product) {
        this.product = product;
    }
}
