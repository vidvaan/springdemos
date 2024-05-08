package com.ciq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.Employee;
import com.ciq.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(Integer eid) {
		
		Optional<Employee> optional = employeeRepository.findById(eid);
		
		if(optional.isPresent()) {
			return optional.get();
		}
		
		return null;
	}

	@Override
	public Employee save(Employee employee) {
        return employeeRepository.save(employee);		
	}

	@Override
	public Employee update(Employee employee) {
		 return employeeRepository.save(employee);	
		
	}

	@Override
	public void deleteById(Integer eid) {
		employeeRepository.deleteById(eid);
	}

}
