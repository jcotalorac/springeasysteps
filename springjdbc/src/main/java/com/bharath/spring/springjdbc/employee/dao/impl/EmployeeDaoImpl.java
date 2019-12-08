package com.bharath.spring.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bharath.spring.springjdbc.employee.dao.EmployeeDao;
import com.bharath.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jcbcTemplate;

	public JdbcTemplate getJcbcTemplate() {
		return jcbcTemplate;
	}

	public void setJcbcTemplate(JdbcTemplate jcbcTemplate) {
		this.jcbcTemplate = jcbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?, ?, ?)";
		int result = jcbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

}
