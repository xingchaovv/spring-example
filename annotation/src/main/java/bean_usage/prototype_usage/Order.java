package bean_usage.prototype_usage;

import lombok.ToString;

@ToString
public class Order {

    public static Integer num = 0;

    {
        num++;
        System.out.printf("In init method of Order-%d.\n", num);
    }
    public String name = "Order-" + num;
}
