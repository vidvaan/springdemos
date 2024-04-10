package com.ciq.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.HelloWorldBean;
import com.ciq.bean.HiBean;
import com.ciq.bean.WelcomeBean;

public class HiTestClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		HiBean hiBean = (HiBean) applicationContext.getBean("hi");
		hiBean.displyName();

		applicationContext.close();

	}

}
