package com.arm.sb.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private Calendar calendar;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public String generateMessage(String userName) {
		System.out.println("WishMessageGenerator.generateMessage()");
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if (hour < 12) {
			return "Good Morning " + userName;
		} else if (hour < 16) {
			return "Good Afternoon " + userName;
		} else if (hour < 20) {
			return "Good Evening " + userName;
		} else {
			return "Good Night " + userName;
		}
	}
}
