package bean_usage.using_interface;

import lombok.ToString;

@ToString
public class Product implements ProductType {

    {
        System.out.printf("In init method of Product-%d", num);
    }

    public static Integer num = 0;
    public String name = "Product-" + ++num;

    @Override
    public void sayName() {
        System.out.println("SayName from Product: " + name);
    }
}
