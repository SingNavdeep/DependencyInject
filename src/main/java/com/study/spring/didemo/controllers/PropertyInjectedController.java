package com.study.spring.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.didemo.service.GreetingService;

/**
 * demos DI with property injection
 * @author Navdeep
 *
 */
@Controller
public class PropertyInjectedController
{
	@Autowired
	//@Qualifier("greetingServiceImpl")
	//NOTE: shortcut for not using @Qualifier. 
	//If name of property matched the bean name, no need to use qualifier
	public GreetingService greetingServiceImpl;
	
	public String sayHello()
	{
		return greetingServiceImpl.sayGreeting();
	}

	/*public GreetingServiceImpl getGreetingService()
	{
		return greetingService;
	}*/
}
