package com.bharath.spring.springorm.assignment.dao;

import java.util.List;

import com.bharath.spring.springorm.assignment.entity.Passenger;

public interface PassengerDao {

	int create(Passenger passenger);
	
	void update(Passenger passenger);
	
	int delete(int id);
	
	Passenger find(int id);
	
	List<Passenger> findAll();
}
