package com.ticketing.ts.repository;

import com.ticketing.ts.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository  extends JpaRepository<Passenger,Long> {
}
