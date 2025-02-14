package com.yedam.app.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlMainExample {

	public static void main(String[] args) {
		ApplicationContext ctx
		= new GenericXmlApplicationContext
		("classpath:applicationContext.xml");
		
		Card card = (Card)ctx.getBean(KBCard.class);
				
		card.showOnerInfo();
		card.addServices();
		card.payment(10000);
	}

}
