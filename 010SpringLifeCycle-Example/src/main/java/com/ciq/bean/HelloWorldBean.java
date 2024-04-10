package com.ciq.bean;

public class HelloWorldBean {
	
	public HelloWorldBean() {
		System.out.println("Hello world Object Created");
	}

	private String name;

	public void setName(String name) {
		System.out.println(" Hello World DI happen");
		this.name = name;
	}

	public void displyName() {
		System.out.println("HelloWorld : " + name);
	}
	
	public void init() {
		System.out.println("Hello World Init method called");
	}
	
	public void destory() {
		System.out.println("Hello World destory method invoked");
	}

}
