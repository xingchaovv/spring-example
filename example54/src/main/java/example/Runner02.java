package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
@Profile("02")
public class Runner02 implements CommandLineRunner {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void run(String... args) {
        stringRedisTemplate.opsForList().rightPush("name", "xingchao1");
        stringRedisTemplate.opsForList().rightPush("name", "xingchao2");
        /**
         * 127.0.0.1:6379> llen name
         * (integer) 4
         */
    }
}
