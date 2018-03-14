package com.study.spring.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.didemo.service.GreetingService;

/**
 * demos DI with setter injection
 * @author Navdeep
 *
 */
@Controller
public class SetterInjectedController
{
	private GreetingService greetingService;
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}

	@Autowired
	public void setGreetingService(GreetingService greetService)
	{
		this.greetingService = greetService;
	}
}