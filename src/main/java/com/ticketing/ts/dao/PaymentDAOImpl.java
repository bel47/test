package com.ticketing.ts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketing.ts.model.Payment;

@Repository
public class PaymentDAOImpl implements PaymentDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Payment> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Payment", Payment.class);
		List<Payment> list = query.getResultList();
		return list;
	}

	@Override
	public Payment get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Payment paymentObj = currentSession.get(Payment.class, id);
		return paymentObj;
	}

	@Override
	public void save(Payment payment) {

		payment = new Payment();
		// passenger.setId(13123123);

	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Payment paymentObj = currentSession.get(Payment.class, id);
		currentSession.delete(paymentObj);

	}

}
