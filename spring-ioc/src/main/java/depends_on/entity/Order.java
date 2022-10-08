package depends_on.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Order {

    @Getter
    @Setter
    private Product product1;

    @Getter
    @Setter
    private Product product2;

    @Getter
    @Setter
    private Product product3;

    @Getter
    @Setter
    private Product product4;

    @Getter
    @Setter
    private Product product5;
}
