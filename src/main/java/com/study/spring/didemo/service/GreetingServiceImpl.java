package com.study.spring.didemo.service;


//@Service
public class GreetingServiceImpl implements GreetingService
{
	public static final String HELLO_GURUS = "Hello gurus!!!";
	
	public String sayGreeting()
	{
		return this.HELLO_GURUS;
	}
}
