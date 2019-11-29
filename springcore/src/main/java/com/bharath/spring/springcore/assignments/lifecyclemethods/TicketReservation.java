package com.bharath.spring.springcore.assignments.lifecyclemethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize method");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUp method");
	}

	@Override
	public String toString() {
		return "TicketReservation [id=" + id + "]";
	}
}
