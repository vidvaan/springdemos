package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.demo.HelloWorldBean;
import com.ciq.demo.WelcomeBean;

public class HelloWorldTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	    HelloWorldBean helloWorldBean =  	(HelloWorldBean) applicationContext.getBean("helloworld");
		helloWorldBean.sayHello();
		
		WelcomeBean welcomeBean =  (WelcomeBean) applicationContext.getBean("welcome");
		welcomeBean.sayWelcome();
	}

}
