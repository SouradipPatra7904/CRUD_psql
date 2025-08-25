package basedev.CRUD_psql.EmployeeCRUD.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import basedev.CRUD_psql.EmployeeCRUD.entity.Employee;
import org.springframework.lang.NonNull;
public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(@NonNull ResultSet rs, int arg1) throws SQLException {
		Employee emp = new Employee();
		emp.setEmployeeId(rs.getString("employeeId"));
		emp.setEmployeeName(rs.getString("employeeName"));
		emp.setEmployeeEmail(rs.getString("employeeEmail"));
		emp.setEmployeeAddress(rs.getString("employeeAddress"));
 
        return emp;
	}


}
