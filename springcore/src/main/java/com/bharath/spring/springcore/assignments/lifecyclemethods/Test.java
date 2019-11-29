package com.bharath.spring.springcore.assignments.lifecyclemethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/assignments/lifecyclemethods/lifecyclemethodsconfig.xml");
		TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketReservation");
		System.out.println(ticketReservation);
		context.registerShutdownHook();

	}

}
