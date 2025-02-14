package com.yedam.app.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMainExample {
	public static void main(String[] args) {
		ApplicationContext ctx 
		= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		// 
		Restaurant res = (Restaurant) ctx.getBean(Restaurant.class);
		
		res.run();
	}
}
