package com.ticketing.ts.dao;

import java.util.List;

import com.ticketing.ts.model.Route;
import com.ticketing.ts.model.Trip;

public interface TripDAO {

	List<Trip> get();
	Trip get(int id);
	void save(Trip route);
	void delete(int id);

}
