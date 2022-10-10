package application_context.annotation_config_application_context.register_method;

import lombok.ToString;

@ToString
public class Product {

    public static Integer globalNum = 0;

    public Integer num = ++globalNum;
}
