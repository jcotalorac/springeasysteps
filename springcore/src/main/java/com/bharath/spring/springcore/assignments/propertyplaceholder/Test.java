package com.bharath.spring.springcore.assignments.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/assignments/propertyplaceholder/assignmentpropertyplaceholderconfig.xml");
		WebServiceClient webServiceClient = (WebServiceClient) context.getBean("webServiceClient");
		System.out.println(webServiceClient);

	}

}
