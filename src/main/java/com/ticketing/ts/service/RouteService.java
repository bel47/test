package com.ticketing.ts.service;

import java.util.List;

import com.ticketing.ts.model.Payment;
import com.ticketing.ts.model.Route;

public interface RouteService {

	List<Route> get();

	Route get(int id);

	void save(Route route);

	void delete(int id);
}
