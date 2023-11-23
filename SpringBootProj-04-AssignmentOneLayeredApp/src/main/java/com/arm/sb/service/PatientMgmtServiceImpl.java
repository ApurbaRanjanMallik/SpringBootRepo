package com.arm.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arm.sb.dao.IPatientDAO;
import com.arm.sb.model.Patient;

@Service("service")
public class PatientMgmtServiceImpl implements IPatientMgmtSerivice {
	@Autowired
	private IPatientDAO dao;

	@Override
	public List<Patient> getPatientDetails(String city1, String city2, String city3) throws Exception {
		List<Patient> patientsBasedOnCity = dao.fetchPatientsBasedOnCity(city1, city2, city3);
		return patientsBasedOnCity;
	}

}
