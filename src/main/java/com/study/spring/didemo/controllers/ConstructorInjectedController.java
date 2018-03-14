package com.study.spring.didemo.controllers;

import com.study.spring.didemo.service.GreetingService;

/**
 * demos DI with constructor injection
 * @author Navdeep
 *
 */
public class ConstructorInjectedController
{
	private GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetService)
	{
		this.greetingService = greetService;
	}
	
	String sayHello()
	{
		return greetingService.sayGreeting();
	}
}
