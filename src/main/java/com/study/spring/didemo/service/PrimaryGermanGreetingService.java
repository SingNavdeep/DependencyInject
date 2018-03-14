package com.study.spring.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//primary bean for profile "de"
@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService {

	@Override
	public String sayGreeting()
	{
		return "Hello from primary german service bean";
	}

}
