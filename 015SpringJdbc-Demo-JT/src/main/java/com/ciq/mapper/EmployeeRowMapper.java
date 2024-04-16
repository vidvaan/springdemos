package com.ciq.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ciq.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEid(rs.getInt("EID"));
		employee.setEname(rs.getString("ENAME"));
		employee.setEsal(rs.getDouble("ESAL"));
		return employee;
	}

}
