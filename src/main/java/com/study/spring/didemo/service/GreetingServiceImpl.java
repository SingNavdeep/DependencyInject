package com.study.spring.didemo.service;

import org.springframework.stereotype.Service;


@Service
public class GreetingServiceImpl implements GreetingService
{
	public static final String HELLO_GURUS = "Hello gurus!!! - injected via property";
	
	public String sayGreeting()
	{
		return HELLO_GURUS;
	}
}
