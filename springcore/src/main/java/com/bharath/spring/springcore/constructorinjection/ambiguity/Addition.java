package com.bharath.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
	public Addition(int a, int b) {
		System.out.println("Inside constructor INT");
	}

	public Addition(double a, double b) {
		System.out.println("Inside constructor DOUBLE");
	}
}
