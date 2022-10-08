package bean_injection.by_constructor;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@ToString
@Slf4j
public class Product {

    public static Integer num = 0;

    public String name = "Product-" + ++num;

    {
        log.info("In init method of {}", name);
    }
}
