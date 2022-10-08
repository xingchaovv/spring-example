package property_collection.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Properties;

@ToString
public class Order {

    @Getter
    @Setter
    private List<String> names;

    @Getter
    @Setter
    private Properties config;
}
