package com.ticketing.ts.service;

import java.util.List;

import com.ticketing.ts.model.Trip;
import com.ticketing.ts.model.User;

public interface TripService {
	List<Trip> get();
	Trip get(int id);
	void save(Trip trip);
	void delete(int id);

}
