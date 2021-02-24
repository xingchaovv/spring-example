package component_scan.main;

import lombok.ToString;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("component_scan.app")
@ToString
public class AppConfig {

}
