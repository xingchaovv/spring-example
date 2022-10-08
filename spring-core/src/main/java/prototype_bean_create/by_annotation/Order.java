package prototype_bean_create.by_annotation;

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
