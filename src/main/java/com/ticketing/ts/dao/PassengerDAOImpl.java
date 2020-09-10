package com.ticketing.ts.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ticketing.ts.model.Passenger;
import org.hibernate.Session;

@Repository
public class PassengerDAOImpl implements PassengerDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Passenger> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Passenger", Passenger.class);
		List<Passenger> list = query.getResultList();
		return list;
	}

	@Override
	public Passenger get(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Passenger passangerObj = currentSession.get(Passenger.class, id);
		return passangerObj;
	}

	@Override
	public void save(Passenger passenger) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(passenger);
	}

	@Override
	public void delete(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Passenger passengerObj = currentSession.get(Passenger.class, id);
		currentSession.delete(passengerObj);
	}

}
