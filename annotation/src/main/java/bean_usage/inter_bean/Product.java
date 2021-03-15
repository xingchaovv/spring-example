package bean_usage.inter_bean;

import lombok.ToString;

@ToString
public class Product {

    public static Integer num = 0;

    {
        num++;
        System.out.printf("In init method of Product-%d.\n", num);
    }
    public String name = "Product-" + num;
}
