package bean_injection.with_interface_type_bean;

import lombok.ToString;

import java.util.Random;

@ToString
public class BookOrder implements Order {

    private final String name = "BookOrder(" + new Random().nextInt(99999) + ")";

    @Override
    public String getOrderName() {
        return name;
    }
}
