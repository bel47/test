package com.ticketing.ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketing.ts.dao.TouchPointDAO;
import com.ticketing.ts.dao.TransportationDAO;
import com.ticketing.ts.model.Touchpoint;
import com.ticketing.ts.model.Transportation;

@Service
public class TransportationServiceImpl implements TransportationService{

	
	@Autowired
	private TransportationDAO trnsportationDAO;

	@Transactional
	@Override
	public List<Transportation> get() {
		return trnsportationDAO.get();
	}

	@Transactional
	@Override
	public Transportation get(int id) {
		return trnsportationDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Transportation trnsportation) {
		trnsportationDAO.save(trnsportation);
	}

	@Transactional
	@Override
	public void delete(int id) {
		trnsportationDAO.delete(id);
	}

}
