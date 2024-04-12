package com.ciq.test;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.C3poDatasource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ComboPoolSpringDemo {
	
	public static void main(String[] args) throws SQLException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		ComboPooledDataSource comboPooledDataSource = (ComboPooledDataSource) applicationContext.getBean("combopoolDataSource");
		System.out.println(comboPooledDataSource.getConnection());
	}

}
