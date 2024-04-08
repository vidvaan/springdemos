package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.service.CardService;

public class TestDemoJavaConfig {
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringConfig.class);
		CardService cardService = (CardService) applicationContext.getBean("cardService");
		cardService.getCardDetails();
	}
}
