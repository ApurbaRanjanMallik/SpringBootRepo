package com.arm.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProj12SpringBootRunnersApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication
		.run(SpringBootProj12SpringBootRunnersApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication
//				.run(SpringBootProj12SpringBootRunnersApplication.class, args);
//		CommandLineRunner runnerOne = context.getBean("clrt", CommandLineRunner.class);
//		runnerOne.run(args);
//		ApplicationRunnerTest runnerTwo = context.getBean("art",ApplicationRunnerTest.class);
//		runnerTwo.run(null);
//				
	}

}
