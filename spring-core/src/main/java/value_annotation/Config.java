package value_annotation;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:value_usage/config.properties"})
@ToString
public class Config {

    public String name;

    @Value("${admin.email}")
    public String email;

    @Value("${config.msg_id}")
    public Integer msgId;

    @Value("${config.type_id:2}")
    public Integer typeId;

    public Config(@Value("${config.name}") String name) {
        this.name = name;
    }
}
