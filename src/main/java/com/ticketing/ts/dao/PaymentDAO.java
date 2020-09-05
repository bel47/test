package com.ticketing.ts.dao;

import java.util.List;

import com.ticketing.ts.model.Passenger;
import com.ticketing.ts.model.Payment;

public interface PaymentDAO {

	List<Payment> get();

	Payment get(int id);

	void save(Payment payment);

	void delete(int id);

}
