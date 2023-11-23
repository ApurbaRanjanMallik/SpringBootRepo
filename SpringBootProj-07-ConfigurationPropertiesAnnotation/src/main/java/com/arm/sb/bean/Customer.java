package com.arm.sb.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("customer")
@ConfigurationProperties("customer.info")
@Data
public class Customer {
	private String name;
	private Integer age;
	private String address;
	private Float billAmt;

}
