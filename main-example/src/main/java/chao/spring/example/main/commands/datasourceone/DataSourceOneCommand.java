package chao.spring.example.main.commands.datasourceone;

import chao.spring.example.main.services.datasourceone.DataSourceOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSourceOneCommand implements CommandLineRunner {

    @Autowired
    private DataSourceOne dataSourceOne;

    @Override
    public void run(String... args) throws Exception {
        // dataSourceOne.showConnection();
    }
}