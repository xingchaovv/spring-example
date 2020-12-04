package simple.jdbc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@SpringBootApplication
@Slf4j
public class Application implements CommandLineRunner {

    private FooRepos fooRepos;

    public FooRepos getFooRepos() {
        return fooRepos;
    }

    @Autowired
    public void setFooRepos(FooRepos fooRepos) {
        this.fooRepos = fooRepos;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public SimpleJdbcInsert simpleJdbcInsert(JdbcTemplate jdbcTemplate) {
        return new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("FOO")
                .usingGeneratedKeyColumns("ID");
    }

    @Override
    public void run(String... args) throws Exception {
        fooRepos.insertData();
    }
}