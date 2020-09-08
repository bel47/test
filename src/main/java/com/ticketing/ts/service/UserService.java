package com.ticketing.ts.service;

import java.util.List;

import com.ticketing.ts.model.Transportation;
import com.ticketing.ts.model.User;

public interface UserService {

	List<User> get();

	User get(int id);

	void save(User user);

	void delete(int id);

}
