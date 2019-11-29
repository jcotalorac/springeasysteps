package com.bharath.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/innerbeans/innerbeansconfig.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.hashCode());
		
		Employee employee1 = (Employee) context.getBean("employee");
		System.out.println(employee1.hashCode());

	}

}
