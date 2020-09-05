package com.ticketing.ts.dao;

import java.util.List;

import com.ticketing.ts.model.Ticket;
import com.ticketing.ts.model.Touchpoint;

public interface TouchPointDAO {

	List<Touchpoint> get();

	Touchpoint get(int id);

	void save(Touchpoint tp);

	void delete(int id);
}
