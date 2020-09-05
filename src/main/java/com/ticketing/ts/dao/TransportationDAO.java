package com.ticketing.ts.dao;

import java.util.List;

import com.ticketing.ts.model.Ticket;
import com.ticketing.ts.model.Transportation;

public interface TransportationDAO {
	List<Transportation> get();

	Transportation get(int id);

	void save(Transportation tr);

	void delete(int id);

}
