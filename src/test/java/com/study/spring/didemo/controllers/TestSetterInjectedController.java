package com.study.spring.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.study.spring.didemo.service.GreetingServiceImpl;

public class TestSetterInjectedController
{
	private SetterInjectedController sInjController;
	
	@Before
	public void setUp() throws Exception
	{
		sInjController = new SetterInjectedController();
		sInjController.setGreetingService(new GreetingServiceImpl());
	}
	@Test
	public void testSayHello()
	{
		assertEquals(GreetingServiceImpl.HELLO_GURUS, sInjController.sayHello());
	}

}
