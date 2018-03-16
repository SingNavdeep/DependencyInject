package com.study.spring.didemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * demonstrates the spring bean's life cycle.
 * @author Navdeep
 *
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean,
		BeanNameAware, BeanFactoryAware, ApplicationContextAware
{
	public LifeCycleDemoBean()
	{
		System.out.println("In life cycle bean's constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("Application context has been set");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("Bean factory has been set");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("My bean name is: " + name);
	}

	@Override
	public void destroy() throws Exception
	{
		System.out.println("LifeCycle bean has been terminated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("The bean has its properties set");
	}
	
	@PostConstruct
	public void postConstruct()
	{
		System.out.println("Post construct method called");
	}
	
	@PreDestroy
	public void preDestroy()
	{
		System.out.println("Pre destroy method called");
	}
	
	public void beforeInit()
	{
		System.out.println("before init method called by bean post processor");
	}
	
	public void afterInit()
	{
		System.out.println("after init method called by bean post processor");
	}
}
