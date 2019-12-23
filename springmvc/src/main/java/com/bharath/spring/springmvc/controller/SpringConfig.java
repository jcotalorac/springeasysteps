package com.bharath.spring.springmvc.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@ComponentScan(basePackages = "com.bharath.spring.springmvc.controller")
@Configuration
public class SpringConfig extends WebMvcConfigurerAdapter {

}
