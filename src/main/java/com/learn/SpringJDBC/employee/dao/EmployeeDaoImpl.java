package com.learn.SpringJDBC.employee.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.learn.SpringJDBC.employee.dao.rowmapper.EmployeeMapper;
import com.learn.SpringJDBC.employee.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int inserOneData(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		return jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
	}

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int updateLastName(String name, int id) {
		String sql = "update employee set lastName = ? where id = ?";
		return jdbcTemplate.update(sql, name, id);
	}


	@Override
	public int deleteData(int id) {
		String sql = "delete from employee where id = ?";
		return jdbcTemplate.update(sql, id);
	}


	@Override
	public Employee readEmployeeData(int id) {
		String sql = "select * from employee where id = ?";
		EmployeeMapper employeeRowMapper = new EmployeeMapper();
		jdbcTemplate.queryForObject(sql, employeeRowMapper, id);
		return null;
	}
}
