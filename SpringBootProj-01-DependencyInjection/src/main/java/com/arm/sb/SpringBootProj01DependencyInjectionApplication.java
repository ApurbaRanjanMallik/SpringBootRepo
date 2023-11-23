package com.arm.sb;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.arm.sb.beans.WishMessageGenerator;

@SpringBootApplication
public class SpringBootProj01DependencyInjectionApplication {
	@Bean("calender")
	Calendar getCalenderObj() {
		return Calendar.getInstance();
	}

	public SpringBootProj01DependencyInjectionApplication() {
		System.out.println(
				"SpringBootProj01DependencyInjectionApplication.SpringBootProj01DependencyInjectionApplication()");
	}

	public static void main(String[] args) {
		System.out.println("SpringBootProj01DependencyInjectionApplication.main()");
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringBootProj01DependencyInjectionApplication.class, args);
		System.out.println(context.getClass());
		System.out.println("****************************");
		WishMessageGenerator generator = context.getBean("wmg", WishMessageGenerator.class);
		System.out.println("****************************");
		String message = generator.generateMessage("Apurba");
		System.out.println(message);
		context.close();
	}
}
