package com.arm.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arm.sb.bean.Customer;
import com.arm.sb.bean.Employee;
import com.arm.sb.bean.PersonalInfo;

@SpringBootApplication
public class SpringBootProj07ConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringBootProj07ConfigurationPropertiesAnnotationApplication.class, args);
		Customer customer = context.getBean("customer", Customer.class);
		System.out.println(customer);
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		System.out.println("****************************************************");
		PersonalInfo info = context.getBean("personalInfo", PersonalInfo.class);
		System.out.println("Person personal information : " + info);
		context.close();
	}

}
