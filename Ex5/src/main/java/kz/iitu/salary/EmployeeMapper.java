package kz.iitu.salary;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employees> {
    @Nullable
    @Override
    public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {

        Employees employees = new Employees();
        employees.setName(rs.getString("name"));
        return employees;
    }
}
