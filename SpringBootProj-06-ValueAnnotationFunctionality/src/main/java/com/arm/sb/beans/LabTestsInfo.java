package com.arm.sb.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("ltInfo")
@Data
public class LabTestsInfo {

	@Value("${lti.bpp}")
	private float bloodProfilePrice;
	@Value("${lti.e2dp}")
	private float echo2DPrice;
	@Value("${lti.rpp}")
	private float rtpcrPrice;

}
