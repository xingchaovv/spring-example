package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
@Profile("01")
public class Runner01 implements CommandLineRunner {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void run(String... args) {
        stringRedisTemplate.opsForValue().set("name01", "xingchao");
        /**
         * 127.0.0.1:6379> get "name01"
         * "xingchao"
         */
    }
}
