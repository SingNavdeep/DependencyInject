package com.study.spring.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//primary bean when no profiles are active(default is active profile) or en is the active profile
@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting()
	{
		return "Hello - primary greeting service";
	}
}
