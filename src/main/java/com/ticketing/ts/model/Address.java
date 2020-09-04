package com.ticketing.ts.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	
	@Column(name = "street")
	private String street;
	
	@Column(name = "house_number")
	private String house_number;
	
	
	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;
	

	@Column(name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;
	

	@Column(name = "post_code")
	private String post_code;
	
	

	@OneToOne(mappedBy = "address")
	private Passenger passenger;

	public Address() {
	}

	public Address(String phone) {
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
