package com.bharath.spring.springorm.assignment.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bharath.spring.springorm.assignment.dao.PassengerDao;
import com.bharath.spring.springorm.assignment.entity.Passenger;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(Passenger passenger) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Passenger passenger) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Passenger find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
