package SpringExample.MuitiDataSourceExample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootApplication(
        exclude = {
                DataSourceAutoConfiguration.class,
        }
)
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    @ConfigurationProperties("database.foo")
    public DataSourceProperties fooDataSourceProperties() {
        log.info("fooDataSourceProperties 方法开始");
        return new DataSourceProperties();
    }

    @Bean
    public DataSource fooDataSource(DataSourceProperties fooDataSourceProperties) {
        log.info("fooDataSource 方法开始");
        log.info("fooDataSource 方法的参数 fooDataSourceProperties：" + fooDataSourceProperties.getUrl());
        return fooDataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Bean
    @ConfigurationProperties("database.bar")
    public DataSourceProperties barDataSourceProperties() {
        log.info("barDataSourceProperties 方法开始");
        return new DataSourceProperties();
    }

    @Bean
    public DataSource barDataSource(DataSourceProperties barDataSourceProperties) {
        log.info("barDataSource 方法开始");
        log.info("barDataSource 方法的参数 fooDataSourceProperties：" + barDataSourceProperties.getUrl());
        return barDataSourceProperties.initializeDataSourceBuilder().build();
    }
}