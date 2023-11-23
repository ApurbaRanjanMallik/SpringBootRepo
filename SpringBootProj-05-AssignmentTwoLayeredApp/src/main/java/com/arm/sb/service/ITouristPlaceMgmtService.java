package com.arm.sb.service;

import java.util.List;

import com.arm.sb.model.TouristPlace;

public interface ITouristPlaceMgmtService {
	public List<TouristPlace> getDetailsOfTouristPlaceBasedOnState(String state1, String state2, String state3)
			throws Exception;

}
