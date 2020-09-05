package com.ticketing.ts.service;

import java.util.List;
import com.ticketing.ts.model.Ticket;

public interface TicketService {

	List<Ticket> get();
	Ticket get(int id);
	void save(Ticket ticket);
	void delete(int id);

}
