package com.arm.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arm.sb.dao.ITouristPlaceDAO;
import com.arm.sb.model.TouristPlace;

@Service("tpservice")
public class TouristPlaceMgmtServiceImpl implements ITouristPlaceMgmtService {
	@Autowired
	private ITouristPlaceDAO dao;

	@Override
	public List<TouristPlace> getDetailsOfTouristPlaceBasedOnState(String state1, String state2, String state3)
			throws Exception {
		List<TouristPlace> placesByCity = dao.fetchTouristPlacesByCity(state1, state2, state3);
		return placesByCity;
	}

}
