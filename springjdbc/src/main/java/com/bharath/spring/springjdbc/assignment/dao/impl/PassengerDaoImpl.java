package com.bharath.spring.springjdbc.assignment.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.bharath.spring.springjdbc.assignment.dao.PassengerDao;
import com.bharath.spring.springjdbc.assignment.dto.Passenger;
import com.bharath.spring.springjdbc.assignment.rowmapper.RowMapperPassenger;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Passenger passenger) {
		String sql = "insert into passenger values (?, ?, ?)";
		return jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
	}

	@Override
	public int update(Passenger passenger) {
		String sql = "update passenger set firstname = ?, lastname = ? where id = ?)";
		return jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
	}

	@Override
	public int delete(int id) {
		String sql = "delete passenger where id = ?)";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public Passenger read(int id) {
		String sql = "select * from passenger where id = ?)";
		RowMapperPassenger rowMapper = new RowMapperPassenger();
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}

}
