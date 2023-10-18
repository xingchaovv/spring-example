package example;

import org.springframework.stereotype.Component;

/**
 * 通过 Component 注解，实现组件 UserManager
 */
@Component
public class UserManager {

    @Override
    public String toString() {
        return "UserManager{}";
    }
}
