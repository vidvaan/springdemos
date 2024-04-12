package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class SaveTest {
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeController employeeController =  (EmployeeController) applicationContext.getBean("employeeController");
		
		employeeController.save(new Employee(1003, "Roy", 20000.00));
		employeeController.save(new Employee(1004, "Joy", 20000.00));
		employeeController.save(new Employee(1005, "Tom", 20000.00));
	}

}
