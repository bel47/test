package com.ticketing.ts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ticketing.ts.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<User> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from User", User.class);
		List<User> list = query.getResultList();
		return list;
	}

	@Override
	public User get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		User userObj = currentSession.get(User.class, id);
		return userObj;
	}

	@Override
	public void save(User user) {

		user = new User();
		// passenger.setId(13123123);
		// passenger.setAge(32);
		// passenger.setFirst_name("Belay");
		// passenger.setMiddle_name("Retta");
		// passenger.setLast_name("Assegu");
		// passenger.setGender("Male");

		// Session currentSession = entityManager.unwrap(Session.class);
		// currentSession.saveOrUpdate(passenger);

	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		User usrObj = currentSession.get(User.class, id);
		currentSession.delete(usrObj);

	}

}
