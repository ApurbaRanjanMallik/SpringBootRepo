package com.arm.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arm.sb.bean.PersonalInfo;

@SpringBootApplication
public class SpringBootProj08ConfigurationPropertiesWithYMLApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringBootProj08ConfigurationPropertiesWithYMLApplication.class, args);
		PersonalInfo info = context.getBean("personalInfo", PersonalInfo.class);
		System.out.println("Person personal information : " + info);
		context.close();
	}

}
