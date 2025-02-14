package com.yedam.app.spring.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnotationMainExample {

	public static void main(String[] args) {
		ApplicationContext ctx
		= new GenericXmlApplicationContext
		("classpath:applicationContext.xml");
		
		Card card = (Card)ctx.getBean(NHCard.class);
				
		card.showOnerInfo();
		card.addServices();
		card.payment(10000);

	}

}
