package com.bharath.spring.springcoreadvanced.injecting.interfaces;

public class OrderBOImpl implements OrderBO {

	@Override
	public void placeOrder() {
		System.out.println("Inside Order BO placeOrder()");
	}

}
