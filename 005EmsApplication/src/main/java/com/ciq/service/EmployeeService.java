package com.ciq.service;

import java.util.List;

import com.ciq.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(Integer eid);
	
	public Employee save(Employee employee);
	
	public Employee update(Employee employee);
	
	public void deleteById(Integer eid);

}
