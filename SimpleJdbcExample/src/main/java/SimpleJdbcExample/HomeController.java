package SimpleJdbcExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @RequestMapping("/")
    public String home() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from foo");
        return list.toString();
    }

    @RequestMapping("/count")
    public Long count() {
        return jdbcTemplate.queryForObject("select count(*) from foo", Long.class);
    }

    @RequestMapping("/list1")
    public List<String> list1() {
        return jdbcTemplate.queryForList("select bar from foo", String.class);
    }
}
