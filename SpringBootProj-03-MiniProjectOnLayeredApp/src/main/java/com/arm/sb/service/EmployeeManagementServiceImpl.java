package com.arm.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arm.sb.dao.IEmployeeDAO;
import com.arm.sb.model.Employee;

@Service("empService")
public class EmployeeManagementServiceImpl implements IEmployeeManagementService {
	@Autowired
	private IEmployeeDAO employeeDAO;

	@Override
	public List<Employee> fetchEmployessByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> employeesByDesg = employeeDAO.getEmployeesByDesg(desg1, desg2, desg3);
		return employeesByDesg;
	}

}
