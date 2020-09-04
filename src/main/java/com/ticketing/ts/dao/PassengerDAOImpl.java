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
	public Passenger get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Passenger passangerObj = currentSession.get(Passenger.class, id);
		return passangerObj;
	}

	@Override
	public void save(Passenger passenger) {

		passenger = new Passenger();
		//passenger.setId(13123123);
		passenger.setAge(32);
		passenger.setFirst_name("Belay");
		passenger.setMiddle_name("Retta");
		passenger.setLast_name("Assegu");
		passenger.setGender("Male");

		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(passenger);

	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Passenger passengerObj = currentSession.get(Passenger.class, id);
		currentSession.delete(passengerObj);

	}

}
