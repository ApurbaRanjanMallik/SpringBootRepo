package com.arm.sb.service;

import java.util.List;

import com.arm.sb.model.Employee;

public interface IEmployeeManagementService {
	public List<Employee> fetchEmployessByDesg(String desg1, String desg2, String desg3) throws Exception;
}
