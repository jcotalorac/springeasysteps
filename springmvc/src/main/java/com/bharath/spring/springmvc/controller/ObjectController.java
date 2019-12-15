package com.bharath.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.bharath.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("John");
		employee.setSalary(8000);
		modelAndView.addObject("employee", employee);
		return modelAndView;
	}
}
