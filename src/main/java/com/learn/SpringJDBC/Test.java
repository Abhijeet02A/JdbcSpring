package com.learn.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * Simple JDBC connectivity 
 * @author Abhijit Awari
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learn/SpringJDBC/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql,Integer.valueOf(1), "Ram", "Charan");
		System.out.println("Inserted " + result);
		
	}
	
}
