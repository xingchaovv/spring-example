package bean_create.by_annotation_with_param;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Product {

    public static Integer num = 0;

    {
        num++;
        System.out.printf("In init method of Product-%d.\n", num);
    }
    public String name = "Product-" + num;
}
