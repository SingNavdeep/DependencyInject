package com.study.spring.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * basic controller to demo spring DI
 * @author Navdeep
 *
 */
@Controller
public class MyController
{
	public void printHello()
	{
		System.out.println("Hello!!!");
	}
}
