package com.ticketing.ts.dao;

import java.util.List;

import com.ticketing.ts.model.Passenger;

public interface PassengerDAO {

	List<Passenger> get();
	Passenger get(Long id);
	void save(Passenger passenger);
	void delete(Long id);

}
