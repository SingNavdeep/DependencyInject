package com.study.spring.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.study.spring.didemo.service.GreetingServiceImpl;

public class TestPropertyInjectedController
{
	private PropertyInjectedController pInjcontroller;
	
	@Before
	public void setUp() throws Exception
	{
		pInjcontroller = new PropertyInjectedController();
		pInjcontroller.greetingServiceImpl = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting()
	{
		assertEquals(GreetingServiceImpl.HELLO_GURUS, pInjcontroller.sayHello());
	}

}
