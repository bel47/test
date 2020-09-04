package com.ticketing.ts.model;

import javax.persistence.*;

@Entity
@Table(name = "trips")
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "initial_station")
	private String initial_station;

	@Column(name = "final_station")
	private String final_station;

	@Column(name = "transportationMode")
	private String transportationMode;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Payment payment;

	@Column(name = "numberOfPassengers")
	private int numberOfPassenger;
	
	

}
