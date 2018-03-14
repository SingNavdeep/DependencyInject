package com.study.spring.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	//works both ways in setter based injection
	//@Qualifier("setterGreetingService")
	public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetService)
	{
		this.greetingService = greetService;
	}
}