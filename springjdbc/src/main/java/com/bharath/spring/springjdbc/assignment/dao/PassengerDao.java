package com.bharath.spring.springjdbc.assignment.dao;

import com.bharath.spring.springjdbc.assignment.dto.Passenger;

public interface PassengerDao {

	int create(Passenger passenger);
	
	int update(Passenger passenger);
	
	int delete(int id);
	
	Passenger read(int id);
}
