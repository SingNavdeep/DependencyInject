package com.study.spring.didemo.controllers;

import com.study.spring.didemo.service.GreetingService;

/**
 * demos DI with setter injection
 * @author Navdeep
 *
 */
public class SetterInjectedController
{
	private GreetingService greetingService;
	
	String sayHello()
	{
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetService)
	{
		this.greetingService = greetService;
	}
}
