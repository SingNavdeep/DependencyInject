package com.study.spring.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.study.spring.didemo.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args)
	{
		//spring app context
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		//get the bean...notice naming convention to get the bean
		MyController controller = (MyController) ctx.getBean("myController");
		controller.printHello();
	}
}
