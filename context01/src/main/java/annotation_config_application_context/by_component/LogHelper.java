package annotation_config_application_context.by_component;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class LogHelper {

    {
        System.out.println("In init method of LogHelper.");
    }
}
