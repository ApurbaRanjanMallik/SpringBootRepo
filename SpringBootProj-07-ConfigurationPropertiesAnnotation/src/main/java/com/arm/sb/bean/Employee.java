package com.arm.sb.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("employee")
@Data
@ConfigurationProperties("employee.details")
public class Employee {
	private String name;
	private String role;
	private Double salary;
}
