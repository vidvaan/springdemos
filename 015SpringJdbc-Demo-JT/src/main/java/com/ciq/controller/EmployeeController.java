package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.dto.Employee;
import com.ciq.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public void save(Employee employee) {
		System.out.println("Employee Controller Save Method");
		employeeService.save(employee);
	}

	public void update(Employee employee) {
		employeeService.update(employee);
	}

	public void deleteById(Integer eid) {
		employeeService.deleteById(eid);
	}

	public Employee findById(Integer eid) {
		return employeeService.findById(eid);
	}
	
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

}
