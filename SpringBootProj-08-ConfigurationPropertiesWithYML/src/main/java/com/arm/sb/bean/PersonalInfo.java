package com.arm.sb.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix = "per.info")
public class PersonalInfo {
	private Integer id;
	private String name;
	private String[] familyMembers;
	private List<String> studies;
	private Set<Long> mobNos;
	private Map<String, Object> idDetails;
	private JobDetails jobDetails;
}
