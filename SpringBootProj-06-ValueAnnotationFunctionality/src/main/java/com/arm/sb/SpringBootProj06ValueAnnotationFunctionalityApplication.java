package com.arm.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arm.sb.beans.Hospital;
import com.arm.sb.beans.LabTestsInfo;

@SpringBootApplication

public class SpringBootProj06ValueAnnotationFunctionalityApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringBootProj06ValueAnnotationFunctionalityApplication.class, args);
		Hospital hospital = context.getBean("hospital", Hospital.class);
		System.out.println(hospital);
		System.out.println(hospital.getBillOfAllTests());
		System.out.println(hospital.getOsDetails());
		LabTestsInfo info = context.getBean("ltInfo",LabTestsInfo.class);
		System.out.println(info);
		context.close();

	}

}
