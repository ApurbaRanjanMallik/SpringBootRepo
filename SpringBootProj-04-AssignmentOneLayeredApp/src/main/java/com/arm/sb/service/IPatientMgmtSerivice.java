package com.arm.sb.service;

import java.util.List;

import com.arm.sb.model.Patient;

public interface IPatientMgmtSerivice {
	public List<Patient> getPatientDetails(String city1, String city2, String city3) throws Exception;
}
