package chao.spring.example.main.commands.consumingrest;

import chao.spring.example.main.services.consumingrest.Quote;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class ConsumingRestCommand implements CommandLineRunner {

    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }

    @Override
    public void run(String... args) throws Exception {
        Quote quote = restTemplate.getForObject(
                "https://gturnquist-quoters.cfapps.io/api/random",
                Quote.class);
        log.info(quote.toString());
    }
}
