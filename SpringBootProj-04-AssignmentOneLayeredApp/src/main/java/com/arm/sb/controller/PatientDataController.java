package com.arm.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.arm.sb.model.Patient;
import com.arm.sb.service.IPatientMgmtSerivice;

@Controller("controller")
public class PatientDataController {
	@Autowired
	private IPatientMgmtSerivice serivice;

	public List<Patient> getPatientDetailsBasedOnTheirCity(String city1, String city2, String city3) throws Exception {
		List<Patient> patientDetails = serivice.getPatientDetails(city1, city2, city3);
		return patientDetails;
	}
}
