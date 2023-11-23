package com.arm.sb;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arm.sb.controller.PatientDataController;
import com.arm.sb.model.Patient;

@SpringBootApplication
public class SpringBootProj04AssignmentOneLayeredAppApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringBootProj04AssignmentOneLayeredAppApplication.class, args);
		PatientDataController controller = context.getBean("controller", PatientDataController.class);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first city : ");
		String cityOne = sc.next().toUpperCase();
		System.out.print("Enter second city : ");
		String cityTwo = sc.next().toUpperCase();
		System.out.print("Enter third city : ");
		String cityThree = sc.next().toUpperCase();
		List<Patient> patientDetailsBasedOnTheirCity = controller.getPatientDetailsBasedOnTheirCity(cityOne, cityTwo,
				cityThree);
		for (Patient patient : patientDetailsBasedOnTheirCity) {
			System.out.println(patient);
		}
		sc.close();
	}

}
