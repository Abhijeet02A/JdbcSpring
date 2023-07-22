package com.learn.SpringJDBC.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.SpringJDBC.employee.dao.EmployeeDao;
import com.learn.SpringJDBC.employee.model.Employee;
/**
 * Simple JDBC connectivity test
 * @author Abhijit Awari
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learn/SpringJDBC/employee/test/config.xml");
		EmployeeDao employeeDao = (EmployeeDao)context.getBean("employeeDao");
		
		int result = employeeDao.inserOneData(new Employee(1, "Abhi", "padh"));
		employeeDao.inserOneData(new Employee(2, "Ram", "Charan"));
		employeeDao.inserOneData(new Employee(3, "Si", "Pi"));
		
		System.out.println("Inserted " + result);
		employeeDao.updateLastName("Awari", 1);
		employeeDao.deleteData(1);
		
	}
	
}
