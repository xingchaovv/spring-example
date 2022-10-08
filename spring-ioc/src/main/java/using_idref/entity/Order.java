package using_idref.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Order {

    @Getter
    @Setter
    private String product1;

    @Getter
    @Setter
    private String product2;
}
