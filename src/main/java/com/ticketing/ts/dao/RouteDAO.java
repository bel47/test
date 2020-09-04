package com.ticketing.ts.dao;

import java.util.List;
import com.ticketing.ts.model.Route;

public interface RouteDAO {

	List<Route> get();

	Route get(int id);

	void save(Route route);

	void delete(int id);

}
