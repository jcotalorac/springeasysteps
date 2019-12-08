package com.bharath.spring.springjdbc.assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bharath.spring.springjdbc.assignment.dao.PassengerDao;
import com.bharath.spring.springjdbc.assignment.dto.Passenger;
import com.bharath.spring.springjdbc.employee.dao.EmployeeDao;
import com.bharath.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springjdbc/assignment/jdbcconfig.xml");
		PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
		Passenger passenger = new Passenger();
		passenger.setId(1);
		passenger.setFirstName("Devila");
		passenger.setLastName("Devila");
//		int result = passengerDao.create(passenger);
		int result = passengerDao.update(passenger);
//		int result = passengerDao.delete(1);
//		Passenger passenger = passengerDao.read(2);
		System.out.println("Records updated: " + result);

	}

}
