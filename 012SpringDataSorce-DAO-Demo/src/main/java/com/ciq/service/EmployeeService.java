package com.ciq.service;

import java.util.List;

import com.ciq.dto.Employee;

public interface EmployeeService {

public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void deleteById(Integer eid);
	
	public Employee findById(Integer eid);
	
	public List<Employee> findAll();

}
