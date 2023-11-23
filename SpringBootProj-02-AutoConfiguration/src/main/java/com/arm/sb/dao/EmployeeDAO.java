package com.arm.sb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeDAO {
	private static final String GET_EMP_COUNT = "SELECT COUNT(*) FROM EMP";
	@Autowired
	private DataSource dataSource;

	public int getEmployeeCount() throws SQLException {
		Connection connection = dataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement(GET_EMP_COUNT);
		ResultSet resultSet = statement.executeQuery();
		resultSet.next();
		int count = resultSet.getInt(1);
		// Close all resource
		resultSet.close();
		statement.close();
		connection.close();
		return count;
	}
}
