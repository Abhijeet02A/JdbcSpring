package com.learn.SpringJDBC.employee.dao;

import com.learn.SpringJDBC.employee.model.Employee;

public interface EmployeeDao {
	int inserOneData(Employee employee);
	int updateLastName(String name, int id);
	int deleteData(int id);
}
