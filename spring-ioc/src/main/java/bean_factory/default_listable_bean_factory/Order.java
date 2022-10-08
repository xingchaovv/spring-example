package bean_factory.default_listable_bean_factory;

import lombok.ToString;

@ToString
public class Order {

    public static Integer num = 0;

    public String name = "Order-" + ++num;
}
