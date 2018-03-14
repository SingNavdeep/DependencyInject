package com.study.spring.didemo.controllers;

import org.springframework.stereotype.Controller;

import com.study.spring.didemo.service.GreetingService;

/**
 * basic controller to demo spring DI
 * @author Navdeep
 *
 */
@Controller
public class MyController
{
	private GreetingService greetService;
	
	public MyController(GreetingService greetServc)
	{
		this.greetService = greetServc;
	}
	public void printHello()
	{
		System.out.println(greetService.sayGreeting());
	}
}
