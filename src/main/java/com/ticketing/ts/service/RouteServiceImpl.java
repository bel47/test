package com.ticketing.ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketing.ts.dao.PaymentDAO;
import com.ticketing.ts.dao.RouteDAO;
import com.ticketing.ts.model.Payment;
import com.ticketing.ts.model.Route;

@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	private RouteDAO routeDAO;

	@Transactional
	@Override
	public List<Route> get() {
		return routeDAO.get();
	}

	@Transactional
	@Override
	public Route get(int id) {
		return routeDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Route route) {
		routeDAO.save(route);
	}

	@Transactional
	@Override
	public void delete(int id) {
		routeDAO.delete(id);
	}

}
