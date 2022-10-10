package application_context.class_path_xml_application_context.example01.dao;

import lombok.ToString;

import java.util.Random;

@ToString
public class Order {

    public Integer id = new Random().nextInt() % 100;

    public String name = "Order";
}
