package class_path_resource;

import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import java.io.IOException;

@Configuration
@ComponentScan
public class AppConfig {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // ClassPathResource resource = (ClassPathResource) context.getResource("class_path_resource/desc.txt");
        ClassPathResource resource = (ClassPathResource) context.getResource("classpath:class_path_resource/desc.txt");
        System.out.println("resource: " + resource.getURL());
    }
}
