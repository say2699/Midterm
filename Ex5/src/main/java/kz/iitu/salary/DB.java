package kz.iitu.salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DB {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void getEmpById(Long id) {

        jdbcTemplate.query("select * from name", new EmployeeMapper());
    }

}
