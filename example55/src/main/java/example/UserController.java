package example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @GetMapping("/user/count")
    public Integer count() {
        log.info("开始执行：控制器UserController方法count");
        return 100;
    }
}
