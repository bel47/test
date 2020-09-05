package com.ticketing.ts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketing.ts.model.Ticket;
import com.ticketing.ts.model.Trip;

@Repository
public class TicketDAOImpl implements TicketDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Ticket> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Ticket", Trip.class);
		List<Ticket> list = query.getResultList();
		return list;
	}

	@Override
	public Ticket get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Ticket ticketObj = currentSession.get(Ticket.class, id);
		return ticketObj;
	}

	@Override
	public void save(Ticket ticket) {

		ticket = new Ticket();
		// passenger.setId(13123123);
		// passenger.setAge(32);
		// passenger.setFirst_name("Belay");
		// passenger.setMiddle_name("Retta");
		// passenger.setLast_name("Assegu");
		// passenger.setGender("Male");

		// Session currentSession = entityManager.unwrap(Session.class);
		// currentSession.saveOrUpdate(passenger);

	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Ticket ticketObj = currentSession.get(Ticket.class, id);
		currentSession.delete(ticketObj);
	}
}
