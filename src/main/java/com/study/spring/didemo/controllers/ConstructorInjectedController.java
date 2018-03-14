package com.study.spring.didemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.study.spring.didemo.service.GreetingService;

/**
 * demos DI with constructor injection
 * @author Navdeep
 *
 */
@Controller
public class ConstructorInjectedController
{
	private GreetingService greetingService;
	
	//note that in latest versions of spring IOC, no need to autowire constructors.
	//although its a good idea to autowire constructors also to maintain backward compatibility
	//@Autowired
	//qualifiers required if more that one bean of a specific type is present
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetService)
	{
		this.greetingService = greetService;
	}
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
}
