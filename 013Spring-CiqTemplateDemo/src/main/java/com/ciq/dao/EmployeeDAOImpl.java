package com.ciq.dao;

import com.ciq.dto.Employee;
import com.ciq.template.CreateIQTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {

	private CreateIQTemplate createIQTemplate;

	public void setCreateIQTemplate(CreateIQTemplate createIQTemplate) {
		this.createIQTemplate = createIQTemplate;
	}

	public void save(Employee employee) {
		createIQTemplate.execteUpdate("INSERT INTO EMPLOYEE_TAB VALUES(?,?,?)",
				new Object[] { employee.getEid(), employee.getEname(), employee.getEsal() });

	}

	@Override
	public void update(Employee employee) {

		createIQTemplate.execteUpdate("UPDATE EMPLOYEE_TAB SET ENAME = ? , ESAL = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEsal(), employee.getEid() });
	}

	@Override
	public void deleteById(Integer eid) {
		createIQTemplate.execteUpdate("DELETE FROM EMPLOYEE_TAB WHERE EID = ?", new Object[] { eid });
	}

}
