package com.bharath.spring.springmvcorm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bharath.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	@RequestMapping("registrationPage")
	public String showRegistrationPage() {
		return "userReg";
	}
}
