package com.ciq.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.dto.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
    @Autowired
	private JdbcTemplate jdbcTemplate;

	

	public void save(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMPLOYEE_TAB VALUES(?,?,?)",
				new Object[] { employee.getEid(), employee.getEname(), employee.getEsal() });

	}

	@Override
	public void update(Employee employee) {

		jdbcTemplate.update("UPDATE EMPLOYEE_TAB SET ENAME = ? , ESAL = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEsal(), employee.getEid() });
	}

	@Override
	public void deleteById(Integer eid) {
		jdbcTemplate.update("DELETE FROM EMPLOYEE_TAB WHERE EID = ?", new Object[] { eid });
	}

}
