package com.arm.sb;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.arm.sb.controller.PayrollSystemController;
import com.arm.sb.model.Employee;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@SpringBootApplication
public class SpringBootProj09MiniProjrctOnSpringBootProfilesApplication {
	@Bean(name = "c3p0")
	@Profile("uat")
	ComboPooledDataSource createC3P0DataSource() throws Exception {
		ComboPooledDataSource cds = new ComboPooledDataSource();
		cds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		cds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		cds.setUser("system");
		cds.setPassword("apurba");
		return cds;
	}

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringBootProj09MiniProjrctOnSpringBootProfilesApplication.class, args);
//		SpringApplication application = new SpringApplication(SpringBootProj09MiniProjrctOnLayeredAppApplication.class);
//		application.setAdditionalProfiles("prod");
//		ApplicationContext context = application.run(args);
		PayrollSystemController controller = context.getBean("empController", PayrollSystemController.class);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Designation : ");
		String desg1 = scanner.next().toUpperCase();
		System.out.print("Enter Second Designation : ");
		String desg2 = scanner.next().toUpperCase();
		System.out.print("Enter Third Designation : ");
		String desg3 = scanner.next().toUpperCase();
		try {
			List<Employee> employeeDetailsByDesg = controller.fetchEmployeeDetailsByDesg(desg1, desg2, desg3);
//			for (Employee employee : employeeDetailsByDesg) {
//				System.out.println(employee);
//			}

//			employeeDetailsByDesg.forEach(emp->{
//				System.out.println(emp);
//			});

//			employeeDetailsByDesg.forEach(employee -> System.out.println(employee));

			employeeDetailsByDesg.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
//		((Closeable) context).close();
		context.close();
	}

}
