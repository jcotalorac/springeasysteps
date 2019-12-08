package com.bharath.spring.springjdbc.employee.test;

import java.util.List;

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
		/*Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Bob");
		employee.setLastName("Ferguson");*/
//		int result = employeeDao.create(employee);
//		int result = employeeDao.update(employee);
//		int result = employeeDao.delete(1);
//		Employee employee = employeeDao.read(2);
		List<Employee> employees = employeeDao.read();
		System.out.println("Employee record: " + employees);

	}

}
