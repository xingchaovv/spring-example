package application_context.generic_application_context.example;

import lombok.ToString;

@ToString
public class Product {

    public static Integer globalNum = 0;

    public Integer num = ++globalNum;
}
