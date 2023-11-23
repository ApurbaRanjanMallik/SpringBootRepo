package com.arm.sb.dao;

import java.sql.SQLException;
import java.util.List;

import com.arm.sb.model.Patient;

public interface IPatientDAO {
	public List<Patient> fetchPatientsBasedOnCity(String city1, String city2, String city3) throws SQLException;
}
