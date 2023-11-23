package com.arm.sb.dao;

import java.util.List;

import com.arm.sb.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception;
}
