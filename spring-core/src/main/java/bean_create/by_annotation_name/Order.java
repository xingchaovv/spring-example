package bean_create.by_annotation_name;

import lombok.ToString;

@ToString
public class Order {

    public static Integer num = 0;

    public String name = "Order-" + ++num;
}
