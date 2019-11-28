package com.bharath.spring.springcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/lc/xmlconfig/lcxmlconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);

	}

}
