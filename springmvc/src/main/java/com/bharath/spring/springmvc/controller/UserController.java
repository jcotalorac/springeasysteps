package com.bharath.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	public ModelAndView showRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
}
