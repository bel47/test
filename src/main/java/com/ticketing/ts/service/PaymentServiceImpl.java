package com.ticketing.ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketing.ts.dao.PassengerDAO;
import com.ticketing.ts.dao.PaymentDAO;
import com.ticketing.ts.model.Passenger;
import com.ticketing.ts.model.Payment;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDAO paymentDAO;

	@Transactional
	@Override
	public List<Payment> get() {
		return paymentDAO.get();
	}

	@Transactional
	@Override
	public Payment get(int id) {
		return paymentDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Payment passenger) {
		paymentDAO.save(passenger);
	}

	@Transactional
	@Override
	public void delete(int id) {
		paymentDAO.delete(id);
	}

}
