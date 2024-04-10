package com.ciq.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.HelloWorldBean;
import com.ciq.bean.WelcomeBean;

public class WelcomeTestClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		WelcomeBean welcomeBean = (WelcomeBean) applicationContext.getBean("welcome");
		welcomeBean.displyName();

		applicationContext.close();

	}

}
