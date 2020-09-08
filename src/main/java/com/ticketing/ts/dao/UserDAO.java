package com.ticketing.ts.dao;

import java.util.List;

import com.ticketing.ts.model.Trip;
import com.ticketing.ts.model.User;

public interface UserDAO {

	List<User> get();

	User get(int id);

	void save(User user);

	void delete(int id);

}
