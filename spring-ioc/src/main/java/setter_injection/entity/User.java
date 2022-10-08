package setter_injection.entity;

import lombok.ToString;

import java.util.Random;

@ToString
public class User {

    public int id = new Random().nextInt(99999);
    public String name = "chao";
}
