package com.bharath.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("registrationPage")
	public ModelAndView showRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
	
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
}
