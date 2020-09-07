package com.ticketing.ts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketing.ts.model.Passenger;
import com.ticketing.ts.model.Route;

@Repository
public class RouteDAOImpl implements RouteDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Route> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Route", Route.class);
		List<Route> list = query.getResultList();
		return list;
	}

	@Override
	public Route get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Route routeObj = currentSession.get(Route.class, id);
		return routeObj;
	}

	@Override
	public void save(Route route) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(route);

	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Route routeObj = currentSession.get(Route.class, id);
		currentSession.delete(routeObj);

	}

}
