package resource_usage.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
@ToString
@Lazy
public class Order {

    {
        System.out.println("In instance init of Order.");
    }

    @Resource
    @Qualifier("getProductB")
    private Product product;
}
