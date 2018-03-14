package com.study.spring.didemo.controllers;

import org.junit.Before;
import org.junit.Test;

import com.study.spring.didemo.service.GreetingServiceImpl;

public class TestConstructorInjectedController
{
	private ConstructorInjectedController cInjController;
	
	@Before
	public void setUp() throws Exception
	{
		cInjController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void testSayHello()
	{
		org.junit.Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, cInjController.sayHello());
	}

}
