package com.ciq.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.HelloWorldBean;

public class HelloTestClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorldBean helloWorldBean = (HelloWorldBean) applicationContext.getBean("helloWorld");
		helloWorldBean.displyName();

		applicationContext.close();

	}

}
