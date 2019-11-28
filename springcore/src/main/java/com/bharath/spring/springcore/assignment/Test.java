package com.bharath.spring.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/assignment/assignmentconfig.xml");
		ShoppingCart shoopingCart = (ShoppingCart) context.getBean("shoppingCart");
		System.out.println(shoopingCart);

	}

}
