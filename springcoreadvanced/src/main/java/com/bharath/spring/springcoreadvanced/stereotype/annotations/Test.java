package com.bharath.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcoreadvanced/stereotype/annotations/stereotypeannotationsconfig.xml");
		Instructor instructor = (Instructor) context.getBean("instructor");
		System.out.println(instructor);

	}

}
