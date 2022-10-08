package inter_bean;

import lombok.ToString;

@ToString
public class Order {

    public static Integer num = 0;

    {
        num++;
        System.out.printf("In init method of Order-%d.\n", num);
    }
    public String name = "Order-" + num;
    private final Product product;

    public Order(Product product) {
        this.product = product;
    }
}
