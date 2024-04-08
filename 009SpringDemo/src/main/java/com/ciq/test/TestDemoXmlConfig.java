package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.service.CardService;

public class TestDemoXmlConfig {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
		CardService cardService = (CardService) applicationContext.getBean("cardService");
		cardService.getCardDetails();
	}

}
