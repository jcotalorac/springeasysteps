package com.bharath.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("")
	void logBefore(JoinPoint joinPoint) {
		System.out.println("Before calling the method");
	}
	
	@After("")
	void logAfter(JoinPoint joinPoint) {
		System.out.println("After the method execution");
	}
}
