package com.study.spring.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.study.spring.didemo.controllers.ConstructorInjectedController;
import com.study.spring.didemo.controllers.MyController;
import com.study.spring.didemo.controllers.PropertyInjectedController;
import com.study.spring.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args)
	{
		//spring app context
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		//get the bean...notice naming convention to get the bean
		MyController controller = (MyController) ctx.getBean("myController");
		controller.printHello();
		
		//property based dependency controller
		System.out.println(((PropertyInjectedController)ctx.getBean("propertyInjectedController")).sayHello());
		
		//setter based dependency injected controller
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		
		//constructor based DI controller
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
