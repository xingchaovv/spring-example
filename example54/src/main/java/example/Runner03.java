package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.Set;

@Component
@Profile("03")
public class Runner03 implements CommandLineRunner {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void run(String... args) {
        String key = String.format("%s_%s", "name", new Random().nextInt());
        System.out.println("Key: " + key);

        String[] keys2 = new String[]{"li", "liu"};
        stringRedisTemplate.opsForSet().add(key, keys2);

        stringRedisTemplate.opsForSet().add(key, "zhang");
        stringRedisTemplate.opsForSet().add(key, "wang");

        System.out.println("Length: " + stringRedisTemplate.opsForSet().size(key));

        Set<String> members = stringRedisTemplate.opsForSet().members(key);
        // Members: [zhang, wang]
        System.out.println("Members: " + members);
    }
}
