package com.ticketing.ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketing.ts.dao.RouteDAO;
import com.ticketing.ts.dao.TicketDAO;
import com.ticketing.ts.model.Route;
import com.ticketing.ts.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDAO ticketDAO;

	@Transactional
	@Override
	public List<Ticket> get() {
		return ticketDAO.get();
	}

	@Transactional
	@Override
	public Ticket get(int id) {
		return ticketDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Ticket ticket) {
		ticketDAO.save(ticket);
	}

	@Transactional
	@Override
	public void delete(int id) {
		ticketDAO.delete(id);
	}

}
