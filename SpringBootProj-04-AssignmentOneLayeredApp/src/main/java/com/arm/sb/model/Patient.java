package com.arm.sb.model;

import lombok.Data;

@Data
public class Patient {
	private Integer serialNo;
	private String name;
	private String address;
	private String covidStatus;
}
