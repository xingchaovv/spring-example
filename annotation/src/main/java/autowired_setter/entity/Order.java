package autowired_setter.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Order {

    private Product product;
    private Product productA;
    private Product productC;

    @Autowired
    public void setProduct(Product product) {
        this.product = product;
    }

    @Autowired
    @Qualifier("productA")
    public void putProductA(Product productA) {
        this.productA = productA;
    }

    @Autowired(required = false)
    @Qualifier("productC")
    public void putProductC(Product productC) {
        this.productC = productC;
    }
}
