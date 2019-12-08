package com.bharath.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bharath.spring.springjdbc.employee.dao.EmployeeDao;
import com.bharath.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springjdbc/employee/test/jdbcconfig.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("John");
		employee.setLastName("Ferguson");
		int result = employeeDao.create(employee);
		System.out.println("Number of records inserted are: " + result);

	}

}
