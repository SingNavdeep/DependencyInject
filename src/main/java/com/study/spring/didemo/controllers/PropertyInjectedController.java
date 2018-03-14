package com.study.spring.didemo.controllers;

import com.study.spring.didemo.service.GreetingServiceImpl;

/**
 * demos DI with property injection
 * @author Navdeep
 *
 */
public class PropertyInjectedController
{
	public GreetingServiceImpl greetingService;
	
	String sayHello()
	{
		return greetingService.sayGreeting();
	}

	/*public GreetingServiceImpl getGreetingService()
	{
		return greetingService;
	}*/
}
