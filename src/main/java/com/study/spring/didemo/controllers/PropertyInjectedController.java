package com.study.spring.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.didemo.service.GreetingServiceImpl;

/**
 * demos DI with property injection
 * @author Navdeep
 *
 */
@Controller
public class PropertyInjectedController
{
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}

	/*public GreetingServiceImpl getGreetingService()
	{
		return greetingService;
	}*/
}
