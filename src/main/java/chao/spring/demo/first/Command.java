package chao.spring.demo.first;

import chao.spring.demo.first.datasource.DataSourceOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Command implements CommandLineRunner {

    @Autowired
    private DataSourceOne dataSourceOne;

    @Override
    public void run(String... args) throws Exception {
        // dataSourceOne.showConnection();
    }
}