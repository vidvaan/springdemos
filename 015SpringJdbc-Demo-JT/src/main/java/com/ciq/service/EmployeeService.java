package com.ciq.service;

import com.ciq.dto.Employee;

public interface EmployeeService {

public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void deleteById(Integer eid);
	
	
}
