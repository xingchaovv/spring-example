package component_scan.app.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@ToString
public class Order {

    @Resource
    private Product product;
}
