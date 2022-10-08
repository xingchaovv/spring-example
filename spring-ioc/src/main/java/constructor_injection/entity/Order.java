package constructor_injection.entity;

import lombok.ToString;

@ToString
public class Order {

    private Product product;
    private User user;

    public Order(Product product, User user) {
        this.product = product;
        this.user = user;
    }
}
