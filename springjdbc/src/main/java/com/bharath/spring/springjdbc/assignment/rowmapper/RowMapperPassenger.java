package com.bharath.spring.springjdbc.assignment.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bharath.spring.springjdbc.assignment.dto.Passenger;

public class RowMapperPassenger implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger passenger = new Passenger();
		passenger.setId(rs.getInt("id"));
		passenger.setFirstName(rs.getString("firstname"));
		passenger.setLastName(rs.getString("lastname"));
		return passenger;
	}

}
