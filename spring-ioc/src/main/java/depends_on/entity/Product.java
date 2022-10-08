package depends_on.entity;

import lombok.ToString;

import java.util.Random;

@ToString
public class Product {

    public String name = "Product(" + new Random().nextInt(99999) + ")";
}
