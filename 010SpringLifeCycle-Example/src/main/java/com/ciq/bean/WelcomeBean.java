package com.ciq.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class WelcomeBean implements DisposableBean, InitializingBean  {
	
	public WelcomeBean() {
		System.out.println("Welcome Object Created");
	}

	private String name;

	public void setName(String name) {
		System.out.println("Welcome DI happen");
		this.name = name;
	}

	public void displyName() {
		System.out.println("Welcome : " + name);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Welcome init Invoked");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Welcome destroy invoked ");
		
	}

}
