package com.arm.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.arm.sb.model.TouristPlace;
import com.arm.sb.service.ITouristPlaceMgmtService;

@Controller("tpcontroller")
public class TouristPlaceDataController {
	@Autowired
	private ITouristPlaceMgmtService service;

	public List<TouristPlace> getDetailsOfTouristPlacesByCity(String state1, String state2, String state3)
			throws Exception {
		List<TouristPlace> detailsOfTouristPlaceBasedOnState = service.getDetailsOfTouristPlaceBasedOnState(state1,
				state2, state3);
		return detailsOfTouristPlaceBasedOnState;

	}
}
