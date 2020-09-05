package com.ticketing.ts.service;

import java.util.List;

import com.ticketing.ts.model.Payment;

public interface PaymentService {

	List<Payment> get();

	Payment get(int id);

	void save(Payment payment);

	void delete(int id);
}
