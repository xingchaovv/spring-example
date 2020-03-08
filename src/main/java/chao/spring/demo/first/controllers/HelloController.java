package chao.spring.demo.first.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xingchao Zhang
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/hello2")
    public String hello2(
            @RequestParam(value = "name", defaultValue = "World") String name
    ) {
        return String.format("Hello %s!", name);
    }
}
