package com.study.spring.didemo;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomPostProcessor implements BeanPostProcessor
{
	public Object postProcessBeforeInitialization(Object bean, String beanName)
	{
		if(bean instanceof LifeCycleDemoBean)
		{
			((LifeCycleDemoBean)bean).beforeInit();
		}
		
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName)
	{
		if(bean instanceof LifeCycleDemoBean)
		{
			((LifeCycleDemoBean)bean).afterInit();
		}
		
		return bean;
	}
}
