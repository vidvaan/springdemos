package com.ciq.dao;

import com.ciq.dto.Employee;

public interface EmployeeDAO {
	public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void deleteById(Integer eid);
	


}
