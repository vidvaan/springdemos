package com.ciq.test;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBCPDatasouceSpringDemo {
	
	public static void main(String[] args) throws SQLException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		BasicDataSource basicDataSource = (BasicDataSource) applicationContext.getBean("basicDataSource");
		System.out.println(basicDataSource.getConnection());
	}

}
