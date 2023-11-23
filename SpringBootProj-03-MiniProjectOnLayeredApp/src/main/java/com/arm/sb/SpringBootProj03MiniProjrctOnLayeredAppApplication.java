package com.arm.sb;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arm.sb.controller.PayrollSystemController;
import com.arm.sb.model.Employee;

@SpringBootApplication
public class SpringBootProj03MiniProjrctOnLayeredAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringBootProj03MiniProjrctOnLayeredAppApplication.class, args);
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
		context.close();
	}

}
