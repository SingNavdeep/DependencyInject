package com.study.spring.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	//NOTE: shortcut for not using @Qualifier. 
		//If name of property matched the bean name, no need to use qualifier
		//This does not work if a primary bean is defined, so need a qualifier
		//SO - Qualifier takes precedence over Primary and Primary over matched bean name property
	@Autowired
	@Qualifier("greetingServiceImpl")
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
