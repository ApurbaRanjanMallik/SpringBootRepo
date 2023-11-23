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

import com.arm.sb.model.TouristPlace;
@Repository("tpdao")
public class TouristPlaceDAOImpl implements ITouristPlaceDAO {
	@Autowired
	private DataSource dataSource;
	private static final String GET_TOURIST_PLACE_DETAILS_BY_STATE = "SELECT NAME, CITY, STATE, RATING FROM TOURIST_PLACES WHERE STATE IN(?,?,?)ORDER BY RATING";
	List<TouristPlace> touristPlaces;

	@Override
	public List<TouristPlace> fetchTouristPlacesByCity(String stateOne, String StateTwo, String stateThree)
			throws Exception {
		try (Connection connection = dataSource.getConnection();
				PreparedStatement statement = connection.prepareStatement(GET_TOURIST_PLACE_DETAILS_BY_STATE);) {
			statement.setString(1, stateOne);
			statement.setString(2, StateTwo);
			statement.setString(3, stateThree);
			try (ResultSet resultSet = statement.executeQuery()) {
				touristPlaces = new ArrayList<TouristPlace>();
				while (resultSet.next()) {
					TouristPlace place = new TouristPlace();
					place.setName(resultSet.getString(1));
					place.setCity(resultSet.getString(2));
					place.setState(resultSet.getString(3));
					place.setRating(resultSet.getFloat(4));
					touristPlaces.add(place);
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return touristPlaces;
	}

}
