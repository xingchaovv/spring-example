package chao.spring.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Xingchao Zhang
 */
@SpringBootApplication(
		exclude = {
				// DataSourceAutoConfiguration.class,
				// DataSourceTransactionManagerAutoConfiguration.class,
				// JdbcTemplateAutoConfiguration.class,
		}
)
@EnableScheduling
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
