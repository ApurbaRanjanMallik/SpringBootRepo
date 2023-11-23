package com.arm.sb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.arm.sb.model.Employee;

@DependsOnDatabaseInitialization
@Repository("empOracleDAO")
@Profile({"uat", "prod"})
public class EmployeeOracleDAOImpl implements IEmployeeDAO {
	@Autowired
	private DataSource dataSource;
	private static final String GET_EMP_BY_DESG = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	List<Employee> employees = null;

	public EmployeeOracleDAOImpl() {
		System.out.println("EmployeeOracleDAOImpl.EmployeeOracleDAOImpl()");
	}

	@Override
	public List<Employee> getEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeOracleDAOImpl.getEmployeesByDesg()");
		System.out.println("DataSource name : " + dataSource.getClass());
		try (Connection connection = dataSource.getConnection();
				PreparedStatement statement = connection.prepareStatement(GET_EMP_BY_DESG);) {
			statement.setString(1, desg1);
			statement.setString(2, desg2);
			statement.setString(3, desg3);
			try (ResultSet resultSet = statement.executeQuery()) {
				employees = new ArrayList<Employee>();
				while (resultSet.next()) {
					Employee emp = new Employee();
					emp.setEmpNo(resultSet.getInt(1));
					emp.setEmpName(resultSet.getString(2));
					emp.setJob(resultSet.getString(3));
					emp.setSalary(resultSet.getDouble(4));
					employees.add(emp);
				}
			} // Inner try
		} // Outer try
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return employees;

	}
}
