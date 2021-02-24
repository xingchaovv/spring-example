package resource_usage.entity;

import lombok.ToString;

@ToString
public class Product {

    {
        System.out.println("In instance init of Product.");
    }

    public static Integer num = 0;
    public String name = "Product(" + ++num + ")";
}
