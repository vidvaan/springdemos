package com.ciq.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class FindAllTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");

		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");

		List<Employee> employees = employeeController.findAll();

		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
