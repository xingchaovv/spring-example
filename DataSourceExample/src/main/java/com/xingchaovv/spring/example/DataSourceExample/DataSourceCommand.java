package com.xingchaovv.spring.example.DataSourceExample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
@Slf4j
public class DataSourceCommand implements CommandLineRunner {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public DataSourceCommand(DataSource dataSource, JdbcTemplate jdbcTemplate) {
        this.dataSource = dataSource;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        showConnection();
        showData();
    }

    private void showConnection() throws SQLException {
        log.info("数据源 DataSource ：" + dataSource.toString());
        log.info("数据源 DataSource 连接：" + dataSource.getConnection().toString());
    }

    private void showData() {
        jdbcTemplate.queryForList("select * from foo")
                    .forEach(row -> log.info("从 FOO 表读取一条记录：" + row.toString()));
    }
}
