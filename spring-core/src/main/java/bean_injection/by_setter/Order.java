package bean_injection.by_setter;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Order {

    private Product productA;
    private Product productB;
    private Product productC;

    @Autowired
    public void setProductA(Product productA) {
        this.productA = productA;
    }

    @Autowired
    public void setProductB(Product productB) {
        this.productB = productB;
    }

    @Autowired
    public void putProductC(Product productB) {
        this.productC = productB;
    }

}
