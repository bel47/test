package com.ticketing.ts.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ticketing.ts.dao.PassengerDAO;
import com.ticketing.ts.model.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	private PassengerDAO passengerDAO;

	@Transactional
	@Override
	public List<Passenger> get() {
		return passengerDAO.get();
	}

	@Transactional
	@Override
	public Passenger get(int id) {
		return passengerDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Passenger passenger) {
		passengerDAO.save(passenger);
	}

	@Transactional
	@Override
	public void delete(int id) {
		passengerDAO.delete(id);
	}

}
