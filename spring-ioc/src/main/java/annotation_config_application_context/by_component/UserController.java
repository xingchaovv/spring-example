package annotation_config_application_context.by_component;

import lombok.ToString;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

@Controller
@ToString
public class UserController {

    {
        System.out.println("In init method of UserController.");
    }

    @Resource
    private LogHelper logHelper;
}
