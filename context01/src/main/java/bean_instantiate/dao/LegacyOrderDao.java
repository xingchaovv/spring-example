package bean_instantiate.dao;

import lombok.ToString;

import java.util.Random;

@ToString
public class LegacyOrderDao {

    public Integer id = new Random().nextInt() % 100;
    public String name = "My legacyOrderDao";
}
