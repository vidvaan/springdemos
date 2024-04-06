package com.ciq.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ciq.controller.EmployeeController;
import com.ciq.dao.EmployeeDAO;
import com.ciq.service.EmployeeService;

@Configuration
public class SpringConfig {

	@Bean
	public EmployeeController employeeController() {
		return new EmployeeController();
	}

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService();
	}

	@Bean
	public EmployeeDAO employeeDAO() {
		return new EmployeeDAO();
	}
}
