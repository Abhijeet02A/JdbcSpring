package com.learn.SpringJDBC.employee.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.learn.SpringJDBC.employee.model.Employee;

public class EmployeeImpl implements Dao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int inserOneData(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		return jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		// TODO Auto-generated method stub
		
	}

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
