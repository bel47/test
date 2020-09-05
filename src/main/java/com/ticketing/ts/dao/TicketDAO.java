package com.ticketing.ts.dao;

import java.util.List;
import com.ticketing.ts.model.Ticket;

public interface TicketDAO {
	List<Ticket> get();

	Ticket get(int id);

	void save(Ticket ticket);

	void delete(int id);
}
