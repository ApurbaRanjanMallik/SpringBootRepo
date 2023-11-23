package com.arm.sb;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arm.sb.dao.EmployeeDAO;

@SpringBootApplication
public class SpringBootProj02AutoConfigurationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringBootProj02AutoConfigurationApplication.class, args);
		EmployeeDAO dao = context.getBean("empDAO", EmployeeDAO.class);
		try {
			System.out.println("Total Employess : " + dao.getEmployeeCount());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		context.close();

	}

}
