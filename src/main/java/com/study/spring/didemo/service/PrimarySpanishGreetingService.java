package com.study.spring.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//primary bean for profile "es"
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting()
	{
		return "Hello from primary spanish service bean";
	}

}
