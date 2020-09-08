package com.ticketing.ts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketing.ts.model.Touchpoint;
import com.ticketing.ts.model.Transportation;
import com.ticketing.ts.model.Trip;

@Repository
public class TransportationDAOImpl implements TransportationDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Transportation> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Transportation", Transportation.class);
		List<Transportation> list = query.getResultList();
		return list;
	}

	@Override
	public Transportation get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Transportation tpObj = currentSession.get(Transportation.class, id);
		return tpObj;
	}

	@Override
	public void save(Transportation tp) {

		//tp = new Transportation();
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
		Transportation tpObj = currentSession.get(Transportation.class, id);
		currentSession.delete(tpObj);
	}

}
