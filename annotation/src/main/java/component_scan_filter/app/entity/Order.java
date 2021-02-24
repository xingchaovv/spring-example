package component_scan_filter.app.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Order {

    @Autowired(required = false)
    private Product product;
}
