package com.ticketing.ts.service;

import java.util.List;
import com.ticketing.ts.model.Touchpoint;

public interface TouchpointService {

	List<Touchpoint> get();
	Touchpoint get(int id);
	void save(Touchpoint touchPoint);
	void delete(int id);

	
}
