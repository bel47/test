package com.ticketing.ts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketing.ts.model.Passenger;
import com.ticketing.ts.model.Trip;

@Repository
public class TripDAOImpl implements TripDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Trip> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Trip", Trip.class);
		List<Trip> list = query.getResultList();
		return list;
	}

	@Override
	public Trip get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Trip tripObj = currentSession.get(Trip.class, id);
		return tripObj;
	}

	@Override
	public void save(Trip trip) {

		trip = new Trip();
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
		Trip tripObj = currentSession.get(Trip.class, id);
		currentSession.delete(tripObj);

	}
}
