package com.arm.sb.dao;

import java.util.List;

import com.arm.sb.model.TouristPlace;

public interface ITouristPlaceDAO {
	public List<TouristPlace> fetchTouristPlacesByCity(String stateOne, String StateTwo, String stateThree)
			throws Exception;
}
