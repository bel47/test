package com.ticketing.ts.service;

import java.util.List;
import com.ticketing.ts.model.Transportation;

public interface TransportationService {

	List<Transportation> get();

	Transportation get(int id);

	void save(Transportation transportation);

	void delete(int id);

}
