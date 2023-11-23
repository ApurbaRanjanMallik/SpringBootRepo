package com.arm.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.arm.sb.model.Employee;
import com.arm.sb.service.IEmployeeManagementService;

@Controller("empController")
public class PayrollSystemController {
	@Autowired
	private IEmployeeManagementService service;

	public List<Employee> fetchEmployeeDetailsByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> employessByDesg = service.fetchEmployessByDesg(desg1, desg2, desg3);
		return employessByDesg;
	}

}
