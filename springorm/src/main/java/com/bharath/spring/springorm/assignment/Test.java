package com.bharath.spring.springorm.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bharath.spring.springorm.assignment.dao.PassengerDao;
import com.bharath.spring.springorm.assignment.entity.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springorm/assignment/ormconfig.xml");
		PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
		Passenger passenger = new Passenger();
		passenger.setId(1);
		passenger.setFirstName("firstname");
		passenger.setLastName("lastname");
		int result = passengerDao.create(passenger);
		System.out.println("Created passengers: " + result);
	}

}
