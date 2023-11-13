package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.Set;

@Component
@Profile("03")
public class Runner04 implements CommandLineRunner {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void run(String... args) {
        String key = String.format("%s_%s", "name", new Random().nextInt());
        System.out.println("Key: " + key);

        stringRedisTemplate.opsForList().rightPush(key, "zhang");
        stringRedisTemplate.opsForList().rightPush(key, "wang");
        stringRedisTemplate.opsForList().rightPush(key, "yang");

        System.out.println("Length: " + stringRedisTemplate.opsForList().size(key));

        List<String> members = stringRedisTemplate.opsForList().range(key, 0, -1);
        // Members: [zhang, wang]
        System.out.println("Members: " + members);
    }
}
