package annotation_config_application_context.register_usage;

import lombok.ToString;

@ToString
public class Product {

    {
        System.out.printf("In init method of Product-%d", num);
    }

    public static Integer num = 0;
    public String name = "Product(" + ++num + ")";
}
