package com.bharath.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages countriesAndLangs = (CountriesAndLanguages) context.getBean("countriesAndLangs");
		System.out.println(countriesAndLangs);
		System.out.println(countriesAndLangs.getCountryAndLangs().getClass());

	}

}
