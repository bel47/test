package com.ticketing.ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ticketing.ts.dao.TouchPointDAO;
import com.ticketing.ts.model.Touchpoint;

public class TransportationServiceImpl {

	
	@Autowired
	private TransportationDAO trnsportationDAO;

	@Transactional
	@Override
	public List<Touchpoint> get() {
		return tpDAO.get();
	}

	@Transactional
	@Override
	public Touchpoint get(int id) {
		return tpDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Touchpoint tp) {
		tpDAO.save(tp);
	}

	@Transactional
	@Override
	public void delete(int id) {
		tpDAO.delete(id);
	}

}
