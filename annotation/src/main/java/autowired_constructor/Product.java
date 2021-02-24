package autowired_constructor;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Product {

    {
        System.out.printf("In init method of Product-%d", num);
    }

    public static Integer num = 0;
    public String name = "Product-" + ++num;
}
