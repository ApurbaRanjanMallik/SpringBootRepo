package com.arm.sb;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arm.sb.controller.TouristPlaceDataController;
import com.arm.sb.model.TouristPlace;

@SpringBootApplication
public class SpringBootProj05AssignmentTwoLayeredAppApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringBootProj05AssignmentTwoLayeredAppApplication.class, args);
		TouristPlaceDataController controller = context.getBean("tpcontroller", TouristPlaceDataController.class);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first state : ");
		String stateOne = sc.nextLine().toUpperCase();
		System.out.print("Enter second state : ");
		String stateTwo = sc.nextLine().toUpperCase();
		System.out.print("Enter third state : ");
		String stateThree = sc.nextLine().toUpperCase();
		List<TouristPlace> detailsOfTouristPlacesByCity = controller.getDetailsOfTouristPlacesByCity(stateOne, stateTwo,
				stateThree);
		for (TouristPlace touristPlace : detailsOfTouristPlacesByCity) {
			System.out.println(touristPlace);
		}
		sc.close();
	}

}
