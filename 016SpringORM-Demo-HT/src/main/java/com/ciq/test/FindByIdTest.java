package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class FindByIdTest {
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeController employeeController =  (EmployeeController) applicationContext.getBean("employeeController");
		
	    Employee employee = 	employeeController.findById(1001);
		System.out.println("Employee :: "+employee);
		
		
	}

}
