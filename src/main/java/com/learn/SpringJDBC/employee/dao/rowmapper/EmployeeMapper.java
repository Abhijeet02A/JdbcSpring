package com.learn.SpringJDBC.employee.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.learn.SpringJDBC.employee.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt(1));
		employee.setFirstName(rs.getString(2));
		employee.setFirstName(rs.getString(3));
		
		return employee;
	}

}
