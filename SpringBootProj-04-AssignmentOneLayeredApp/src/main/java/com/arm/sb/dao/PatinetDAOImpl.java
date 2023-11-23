package com.arm.sb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arm.sb.model.Patient;

@Repository("patientDAO")
public class PatinetDAOImpl implements IPatientDAO {
	@Autowired
	private DataSource ds;
	private static final String GET_PATIENTS_BASED_ON_CITY = "SELECT SNO, NAME, ADDRESS, COVIDSTS FROM COVID_PATIENT_DATA WHERE ADDRESS IN(?,?,?)";
	List<Patient> patientList;

	@Override
	public List<Patient> fetchPatientsBasedOnCity(String city1, String city2, String city3) throws SQLException {
		try (Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_PATIENTS_BASED_ON_CITY);) {
			ps.setString(1, city1);
			ps.setString(2, city2);
			ps.setString(3, city3);
			try (ResultSet rs = ps.executeQuery()) {
				patientList = new ArrayList<Patient>();
				while (rs.next()) {
					Patient patient = new Patient();
					patient.setSerialNo(rs.getInt(1));
					patient.setName(rs.getString(2));
					patient.setAddress(rs.getString(3));
					patient.setCovidStatus(rs.getString(4));
					patientList.add(patient);
				} // while
			} // inner try
		} // outer try
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return patientList;
	}

}
