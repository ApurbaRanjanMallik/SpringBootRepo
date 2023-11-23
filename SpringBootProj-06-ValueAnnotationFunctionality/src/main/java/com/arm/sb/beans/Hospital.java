package com.arm.sb.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hospital")
@Data
@PropertySource("input.properties")
public class Hospital {
	@Value("Appolo")
	private String firstName;
	@Value("18")
	
	private Integer firstRank;
	@Value("${hi.2ndName}")
	private String secondName;
	@Value("${hi.2ndRank}")
	private Integer secondRank;
	
	@Value("${Path}")
	private String pathDetails;
	
	@Value("${os.name}")
	private String osDetails;
	
	@Value("#{ltInfo}")
	private LabTestsInfo info;
	
	@Value("#{ltInfo.bloodProfilePrice+ltInfo.echo2DPrice+ltInfo.rtpcrPrice}")
	private Float billOfAllTests;
	
	
	
}
